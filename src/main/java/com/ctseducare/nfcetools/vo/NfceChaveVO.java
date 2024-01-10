package com.ctseducare.nfcetools.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NfceChaveVO {

  private String uf;
  private String anoMes;
  private String cnpj;
  private String modelo;
  private String serie;
  private String numeroNota;
  private String tipoEmissao;
  private String codigoNota;
  private String digitoVerificador;

}
