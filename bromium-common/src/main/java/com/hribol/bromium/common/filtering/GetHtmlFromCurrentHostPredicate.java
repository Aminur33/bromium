package com.hribol.bromium.common.filtering;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.hribol.bromium.core.utils.Constants;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;

import java.net.URI;
import java.util.function.Predicate;

import static com.hribol.bromium.core.DependencyInjectionConstants.BASE_URI;
import static io.netty.handler.codec.http.HttpHeaders.Names.ACCEPT;

/**
 * A predicate which checks whether a given {@link HttpRequest} is from the same host as the baseURI, uses GET verb and
 * accepts html as response
 */
public class GetHtmlFromCurrentHostPredicate implements Predicate<HttpRequest> {

    private URI baseURI;

    @Inject
    public GetHtmlFromCurrentHostPredicate(@Named(BASE_URI) URI baseURI) {
        this.baseURI = baseURI;
    }

    @Override
    public boolean test(HttpRequest httpRequest) {
        boolean methodIsGet = httpRequest.getMethod().equals(HttpMethod.GET);
        boolean expectsHtmlContent = httpRequest.headers().get(ACCEPT).contains(Constants.HTML);
        boolean isFromCurrentBaseUrl = httpRequest.getUri().contains(baseURI.getHost());
        return expectsHtmlContent && isFromCurrentBaseUrl && methodIsGet;
    }
}
