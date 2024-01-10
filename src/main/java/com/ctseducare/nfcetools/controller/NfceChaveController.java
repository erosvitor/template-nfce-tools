package com.ctseducare.nfcetools.controller;

import com.ctseducare.nfcetools.service.NfceChaveService;
import com.ctseducare.nfcetools.vo.NfceChaveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/nfceChave")
public class NfceChaveController {

  @Autowired
  NfceChaveService service;

  @GetMapping("/extrairDados/{nfceChave}")
  public Mono<NfceChaveVO> extractDataFromNfceKey(@PathVariable String nfceChave) {
    return service.extractDataFromNfceKey(nfceChave);
  }

}
