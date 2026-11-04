package com.google.api.client.testing.http.apache;

import com.google.api.client.util.f;
import com.google.api.client.util.h0;
import java.io.IOException;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

/* JADX INFO: loaded from: classes4.dex */
@f
public class a extends DefaultHttpClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f115975a;

    /* JADX INFO: renamed from: com.google.api.client.testing.http.apache.a$a, reason: collision with other inner class name */
    class C1032a implements RequestDirector {
        C1032a() {
        }

        @Override // org.apache.http.client.RequestDirector
        @f
        public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
            return new BasicHttpResponse(HttpVersion.HTTP_1_1, a.this.f115975a, (String) null);
        }
    }

    public final int a() {
        return this.f115975a;
    }

    public a b(int i10) {
        h0.a(i10 >= 0);
        this.f115975a = i10;
        return this;
    }

    @Override // org.apache.http.impl.client.AbstractHttpClient
    protected RequestDirector createClientRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        return new C1032a();
    }
}
