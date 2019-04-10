package com.abhi.vertx.veticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * @author <a href="mailto:abhisekgunnia@gmail.com">Abhishek Gunnia</a>
 */

//Extending AbstractVerticle, our class gets access to the vertx field.
public class HomeVerticle extends AbstractVerticle {

    @Override
    //The start method is called when the verticle is deployed
    public void start(){

        vertx
                .createHttpServer()
                .requestHandler(request -> {
                    request.response().end("Hello World => from Home Verticle");
                }).listen(8080);

    }
}
