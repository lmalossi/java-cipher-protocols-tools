import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLContext;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

public class DefaultProtocols {

  public static void main(String[] args) throws Exception {
    PrintProtocols("Default");
  }

  public static void PrintProtocols(String protocol) {

    SSLSocketFactory factory;
    try{
      System.out.println("**** Testing with Default protocol");
      factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
      SSLSocket socket = (SSLSocket)factory.createSocket();

      String[] protocols = socket.getSupportedProtocols();
      System.out.println("Supported Protocols: " + protocols.length);
      for(int i = 0; i < protocols.length; i++) {
        System.out.println(" " + protocols[i]);
      }

      protocols = socket.getEnabledProtocols();

      System.out.println("Enabled Protocols: " + protocols.length);
      for(int i = 0; i < protocols.length; i++) {
        System.out.println(" " + protocols[i]);
      }
      System.out.println(" ");
    } catch(Exception e) {
      System.out.println("Error getting protocols");
    }
  }
}
