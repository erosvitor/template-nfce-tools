package com.ctseducare.nfcetools.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NfceCheckResponseVO {

  private String nfceKey;
  private Boolean checked;

}
