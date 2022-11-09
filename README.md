# Java Protocols and Ciphers tools

Le 2 classi danno come output il protocolli supportati e i cipher supportati per il protocollo scelto

##Build:
compilare le 2 classi
```bash
<path_to_java>/bin/javac ./DefaultProtocols.java
<path_to_java>/bin/javac ./Ciphers.java
```

##Uso:
```bash
<path_to_java>/bin/java DefaultProtocols
```
restituisce i protocolli supportati dalla JVM
```bash
<path_to_java>/bin/java Ciphers <protocollo>
```
Restituisce i ciphers supportati per il protocollo specificato 

