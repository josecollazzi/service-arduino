package com.manywho.services.arduino;

import com.manywho.sdk.services.servers.EmbeddedServer;
import com.manywho.sdk.services.servers.Servlet3Server;
import com.manywho.sdk.services.servers.undertow.UndertowServer;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class Application extends Servlet3Server  {

    public Application() {
        this.addModule(new ApplicationArduinoModule());
        this.setApplication(Application.class);
        this.start();
    }

    public static void main(String[] args) throws Exception {
        EmbeddedServer server = new UndertowServer();

        server.addModule(new ApplicationArduinoModule());
        server.setApplication(Application.class);
        server.start("/api/arduino/1", 8080);
    }
}
