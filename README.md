# Sobre
API para extrair dados e validar NFCe (Nota Fiscal de Consumidor Eletrônica).

## Requisitos
* JDK 17
* Gradle 8.x
* Postman

## Passos para configuração
1. Clonar a aplicação
```
git clone https://github.com/erosvitor/template-nfce-tools.git
```

2. Construir a aplicação
```
gradle build
```

3. Executar a aplicação
```
java -jar build/libs/template-nfce-tools-0.0.1-SNAPSHOT.jar
```

## Utilizando a aplicação pelo Postman
1. Obtendo status da aplicação
```
GET http://localhost:8080/nfce/status
```

2. Extraindo dados

Requisição
```
GET http://localhost:8080/nfceChave/extrairDados/NFe41230300776574142538653050000234049865397107
```

Resposta
```
{
    "uf": "41",
    "anoMes": "2303",
    "cnpj": "00776574142538",
    "modelo": "65",
    "serie": "305",
    "numeroNota": "000023404",
    "tipoEmissao": "9",
    "codigoNota": "86539710",
    "digitoVerificador": "7"
}
```

3. Validando NFCe

Requisição
```
POST http://localhost:8080/nfce/validar

Payload:

[
      {
        "xml": "<NFe xmlns=\"http://www.portalfiscal.inf.br/nfe\"><infNFe versao=\"4.00\" Id=\"NFe33220300776574175622657260000821349433691776\"><ide><cUF>33</cUF><cNF>43369177</cNF><natOp>VENDA DE MERCADORIA CONFORME CFOP</natOp><mod>65</mod><serie>726</serie><nNF>82134</nNF><dhEmi>2022-03-04T11:31:57-03:00</dhEmi><tpNF>1</tpNF><idDest>1</idDest><cMunFG>3300233</cMunFG><tpImp>5</tpImp><tpEmis>9</tpEmis><cDV>6</cDV><tpAmb>2</tpAmb><finNFe>1</finNFe><indFinal>1</indFinal><indPres>1</indPres><procEmi>0</procEmi><verProc>Ame DocFis NFC-e</verProc><dhCont>2022-03-04T11:31:58-03:00</dhCont><xJust>Contingencia realizada automaticamente</xJust></ide><emit><CNPJ>00776574175622</CNPJ><xNome>LOJAS AMERICANAS S/A</xNome><enderEmit><xLgr>Av Jose Bento Ribeiro Dantas</xLgr><nro>33</nro><xCpl>Loja</xCpl><xBairro>Centro</xBairro><cMun>3300233</cMun><xMun>BUZIOS</xMun><UF>RJ</UF><CEP>28950000</CEP><cPais>1058</cPais><xPais>BRASIL</xPais><fone>2211111111</fone></enderEmit><IE>12144407</IE><CRT>3</CRT></emit><dest><CPF>09434903912</CPF><xNome>NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xNome><indIEDest>9</indIEDest><email>xpto@ame.com</email></dest><det nItem=\"1\"><prod><cProd>8000300380439</cProd><cEAN>8000300380439</cEAN><xProd>NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL</xProd><NCM>18063110</NCM><CEST>1700200</CEST><indEscala>S</indEscala><CFOP>5405</CFOP><uCom>PCE</uCom><qCom>2.0000</qCom><vUnCom>1.99</vUnCom><vProd>3.98</vProd><cEANTrib>8000300380439</cEANTrib><uTrib>PCE</uTrib><qTrib>2.0000</qTrib><vUnTrib>1.99</vUnTrib><indTot>1</indTot><xPed>000002183301</xPed></prod><imposto><ICMS><ICMS60><orig>0</orig><CST>60</CST></ICMS60></ICMS><PIS><PISAliq><CST>01</CST><vBC>3.98</vBC><pPIS>0.0000</pPIS><vPIS>0.00</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>3.98</vBC><pCOFINS>0.0000</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"2\"><prod><cProd>7898633332918</cProd><cEAN>7898633332918</cEAN><xProd>BOLO SABOR MILHO C/GOIABADA 200G DELICCE</xProd><NCM>19059090</NCM><CEST>1706201</CEST><indEscala>S</indEscala><CFOP>5405</CFOP><uCom>PCE</uCom><qCom>1.0000</qCom><vUnCom>1.99</vUnCom><vProd>1.99</vProd><cEANTrib>7898633332918</cEANTrib><uTrib>PCE</uTrib><qTrib>1.0000</qTrib><vUnTrib>1.99</vUnTrib><indTot>1</indTot><xPed>000004291969</xPed></prod><imposto><ICMS><ICMS60><orig>0</orig><CST>60</CST></ICMS60></ICMS><PIS><PISAliq><CST>01</CST><vBC>1.99</vBC><pPIS>0.0000</pPIS><vPIS>0.00</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>1.99</vBC><pCOFINS>0.0000</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"3\"><prod><cProd>4750127000341</cProd><cEAN>4750127000341</cEAN><xProd>SALGADINHO DE BATATA QUEIJO 75G DELICCE</xProd><NCM>19059090</NCM><CEST>1703100</CEST><indEscala>S</indEscala><CFOP>5405</CFOP><uCom>PCE</uCom><qCom>3.0000</qCom><vUnCom>1.99</vUnCom><vProd>5.97</vProd><cEANTrib>4750127000341</cEANTrib><uTrib>PCE</uTrib><qTrib>3.0000</qTrib><vUnTrib>1.99</vUnTrib><indTot>1</indTot><xPed>000004290257</xPed></prod><imposto><ICMS><ICMS60><orig>0</orig><CST>60</CST></ICMS60></ICMS><PIS><PISAliq><CST>01</CST><vBC>5.97</vBC><pPIS>0.0000</pPIS><vPIS>0.00</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>5.97</vBC><pCOFINS>0.0000</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSAliq></COFINS></imposto></det><det nItem=\"4\"><prod><cProd>7891000067048</cProd><cEAN>7891000067048</cEAN><xProd>BEB LACTEA ALPINO CHOC 280ML NESTLE</xProd><NCM>22029900</NCM><CEST>1711500</CEST><indEscala>S</indEscala><CFOP>5405</CFOP><uCom>PCE</uCom><qCom>1.0000</qCom><vUnCom>2.49</vUnCom><vProd>2.49</vProd><cEANTrib>7891000067048</cEANTrib><uTrib>PCE</uTrib><qTrib>1.0000</qTrib><vUnTrib>2.49</vUnTrib><indTot>1</indTot><xPed>000004141552</xPed></prod><imposto><ICMS><ICMS60><orig>0</orig><CST>60</CST></ICMS60></ICMS><PIS><PISAliq><CST>01</CST><vBC>2.49</vBC><pPIS>0.0000</pPIS><vPIS>0.00</vPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>2.49</vBC><pCOFINS>0.0000</pCOFINS><vCOFINS>0.00</vCOFINS></COFINSAliq></COFINS></imposto></det><total><ICMSTot><vBC>0.00</vBC><vICMS>0.00</vICMS><vICMSDeson>0.00</vICMSDeson><vFCP>0.00</vFCP><vBCST>0.00</vBCST><vST>0.00</vST><vFCPST>0.00</vFCPST><vFCPSTRet>0.00</vFCPSTRet><vProd>14.43</vProd><vFrete>0.00</vFrete><vSeg>0.00</vSeg><vDesc>0.00</vDesc><vII>0.00</vII><vIPI>0.00</vIPI><vIPIDevol>0.00</vIPIDevol><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro><vNF>14.43</vNF></ICMSTot></total><transp><modFrete>9</modFrete></transp><pag><detPag><indPag>0</indPag><tPag>18</tPag><vPag>14.43</vPag></detPag><vTroco>0.00</vTroco></pag><infAdic><infCpl>Trib aprox: R$ 0.92 Fed R$ 1.08 Est R$ 0.00 Mun Fonte: IBPT.</infCpl><obsCont xCampo=\"Loja\"><xTexto>Loja 653 PDV:308 Data:30/03/2021 cupom:198 Ver:2.37.0</xTexto></obsCont><obsCont xCampo=\"notes1\"><xTexto>PROCON: Av Rio Branco, 25 5 andar - Tel:151</xTexto></obsCont><obsCont xCampo=\"notes2\"><xTexto>ALERJ: Rua da Alfandega, 8 Tel:08002827060</xTexto></obsCont></infAdic></infNFe><infNFeSupl><qrCode><![CDATA[http://www4.fazenda.rj.gov.br/consultaNFCe/QRCode?p=33220300776574175622657260000821349433691776|2|2|04|14.43|4e564f356f32584957496c346e48454755316c4b56324e765248343d|1|e8c37f5a28d12eec8b2744fc308ed382459bb838]]></qrCode><urlChave>www.fazenda.rj.gov.br/nfce/consulta</urlChave></infNFeSupl><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"/><Reference URI=\"#NFe33220300776574175622657260000821349433691776\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/><DigestValue>NVO5o2XIWIl4nHEGU1lKV2NvRH4=</DigestValue></Reference></SignedInfo><SignatureValue>h9JcJMuXdsdjGWxx4aWcqqbYBjYVP/R2n4mZ0NCXf+eubE9DP8CIHS8Ok9RqLNpb3jzyXcCDCkYNMlUsjI+CzF9LlIXYMMl5sqZOwR6J6copi0nAl3MV9401Rp44kG3iU38dlgY197h+x384aUBjL/VnYMRdgfWSlNykmRwqUty+n/h4h/lKOB0rxfOI1KAVpqK3F1rs8yA6IGO8Ok7QDk5XcRID5iV5nmXkxH41SNBmmz8QPeEMQ5/RcgKMiVOmb0UuJ+dZgOeCpsrPK92KIi3sWUp+kTVpUq3Egh+vD0WQGjvmzgDeZoaAisWnaFYGdQCefDnrn+AkVG9FUu0fSg==</SignatureValue><KeyInfo><X509Data><X509Certificate>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</X509Certificate></X509Data></KeyInfo></Signature></NFe>"
      }
  ]
```

Resposta
```
[
    {
        "nfceKey": "NFe33220300776574175622657260000821349433691776",
        "checked": true
    }
]
```

## Licença
Este projeto está sob licença do MIT. Para mais detalhes, ver o arquivo LICENSE.
