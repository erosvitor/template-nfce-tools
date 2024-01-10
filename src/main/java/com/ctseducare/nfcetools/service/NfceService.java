package com.ctseducare.nfcetools.service;

import br.inf.portalfiscal.nfe.v4.TNFe;
import com.ctseducare.nfcetools.utils.XmlUtils;
import com.ctseducare.nfcetools.vo.NfceCheckResponseVO;
import com.ctseducare.nfcetools.vo.NfceVO;
import java.util.List;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class NfceService {

  public Flux<NfceCheckResponseVO> checkNfce(List<NfceVO> nfces) {
    return Flux.fromStream(nfces.stream())
        .map(nfce ->
          XmlUtils.xmlStringToXmlObject(nfce.getXml(), TNFe.class))
        .map(tnFe ->
          NfceCheckResponseVO
            .builder()
            .nfceKey(tnFe.getInfNFe().getId())
            .checked(true)
            .build());
  }

}
