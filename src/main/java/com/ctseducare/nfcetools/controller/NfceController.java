package com.ctseducare.nfcetools.controller;

import com.ctseducare.nfcetools.service.NfceService;
import com.ctseducare.nfcetools.vo.NfceCheckResponseVO;
import com.ctseducare.nfcetools.vo.NfceVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/nfce")
public class NfceController {

  @Autowired
  NfceService service;

  @GetMapping("/status")
  Mono<String> hello() {
    return Mono.just("I am UP!");
  }

  @PostMapping("/validar")
  Flux<NfceCheckResponseVO> checkNfce(@RequestBody List<NfceVO> nfces) {
    return service.checkNfce(nfces);
  }

}
