package io.undertow.server.handlers.proxy;

import io.undertow.server.HttpServerExchange;

import java.util.concurrent.TimeUnit;

public class URIMappedProxyClient implements ProxyClient {
    @Override
    public ProxyTarget findTarget(HttpServerExchange exchange) {
        return null;
    }

    @Override
    public void getConnection(ProxyTarget target, HttpServerExchange exchange, ProxyCallback<ProxyConnection> callback, long timeout, TimeUnit timeUnit) {

    }
}
