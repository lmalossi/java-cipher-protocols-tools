import java.security.*;
import javax.net.ssl.*;

public class Ciphers {

  public static void main(String[] args) throws Exception {

    String context = args[0];
    System.out.println("Testing ciphersuites for JDK version: " +
    System.getProperty("java.version"));
    System.out.println("Checking configs for SSLContext : " + context);
    System.out.println("=======================");
    SSLContext sslContext = SSLContext.getInstance(context);
    sslContext.init(null, null, null);

    SSLSocketFactory factory = sslContext.getSocketFactory();
    SSLSocket socket = (SSLSocket)factory.createSocket();

    String[] supportedSuites = socket.getSupportedCipherSuites();
    System.out.println("Supported CipherSuites:");
    System.out.println("=======================");
    printArray(supportedSuites);
    String[] enabledSuites = socket.getEnabledCipherSuites();
    System.out.println("\n\nEnabled CipherSuites");
    System.out.println("====================");
    printArray(enabledSuites);
  }

  private static void printArray(String[] s) {
    for(String cipher : s) {
      System.out.println("\t" + cipher);
    }
  }
}
