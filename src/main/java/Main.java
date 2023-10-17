import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

public final class Main {

    // should run with system properties
    // -Djavax.net.ssl.trustStore=server-ca-truststore.jks -Djavax.net.ssl.trustStorePassword=securepass
    public static void main(final String... args) throws Exception {
        try (
            var factory = new ActiveMQConnectionFactory("tcp://localhost:61616?sslEnabled=true", "artemis", "artemis");
            var connection = factory.createConnection()
        ) {
            connection.start();
            System.out.println("connected");
        }

    }

}
