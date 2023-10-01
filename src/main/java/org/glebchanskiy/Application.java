package org.glebchanskiy;

import org.glebchanskiy.doughdelight.Configuration;
import org.glebchanskiy.doughdelight.Server;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;

public class Application {

    public static void main(String... args) throws IOException, URISyntaxException {
        new Server().run();
    }
}
