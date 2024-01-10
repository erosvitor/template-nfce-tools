package com.ctseducare.nfcetools.service;

import com.ctseducare.nfcetools.vo.NfceChaveVO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class NfceChaveService {

  public Mono<NfceChaveVO> extractDataFromNfceKey(String nfceKey) {
    if (nfceKey.toUpperCase().startsWith("NFE")) {
      nfceKey = nfceKey.substring(3);
    }

    return Mono.just(NfceChaveVO
        .builder()
        .uf(nfceKey.substring(0, 2))
        .anoMes(nfceKey.substring(2, 6))
        .cnpj(nfceKey.substring(6, 20))
        .modelo(nfceKey.substring(20, 22))
        .serie(nfceKey.substring(22, 25))
        .numeroNota(nfceKey.substring(25, 34))
        .tipoEmissao(nfceKey.substring(34, 35))
        .codigoNota(nfceKey.substring(35, 43))
        .digitoVerificador(nfceKey.substring(43, 44))
        .build()
    );
  }

}
