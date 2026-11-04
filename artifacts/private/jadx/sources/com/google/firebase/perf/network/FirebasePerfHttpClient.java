package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes5.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, Timer timer, k kVar) throws IOException {
        i iVarC = i.c(kVar);
        try {
            iVarC.A(httpHost.toURI() + httpRequest.getRequestLine().getUri()).o(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                iVarC.t(lA.longValue());
            }
            timer.h();
            iVarC.u(timer.f());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, timer, iVarC));
        } catch (IOException e10) {
            iVarC.y(timer.c());
            h.d(iVarC);
            throw e10;
        }
    }

    static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, Timer timer, k kVar) throws IOException {
        i iVarC = i.c(kVar);
        try {
            iVarC.A(httpHost.toURI() + httpRequest.getRequestLine().getUri()).o(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                iVarC.t(lA.longValue());
            }
            timer.h();
            iVarC.u(timer.f());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, timer, iVarC), httpContext);
        } catch (IOException e10) {
            iVarC.y(timer.c());
            h.d(iVarC);
            throw e10;
        }
    }

    static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, Timer timer, k kVar) throws IOException {
        i iVarC = i.c(kVar);
        try {
            iVarC.A(httpUriRequest.getURI().toString()).o(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                iVarC.t(lA.longValue());
            }
            timer.h();
            iVarC.u(timer.f());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, timer, iVarC));
        } catch (IOException e10) {
            iVarC.y(timer.c());
            h.d(iVarC);
            throw e10;
        }
    }

    static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, Timer timer, k kVar) throws IOException {
        i iVarC = i.c(kVar);
        try {
            iVarC.A(httpUriRequest.getURI().toString()).o(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                iVarC.t(lA.longValue());
            }
            timer.h();
            iVarC.u(timer.f());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, timer, iVarC), httpContext);
        } catch (IOException e10) {
            iVarC.y(timer.c());
            h.d(iVarC);
            throw e10;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, k kVar) throws IOException {
        i iVarC = i.c(kVar);
        try {
            iVarC.A(httpHost.toURI() + httpRequest.getRequestLine().getUri()).o(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                iVarC.t(lA.longValue());
            }
            timer.h();
            iVarC.u(timer.f());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            iVarC.y(timer.c());
            iVarC.p(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                iVarC.w(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                iVarC.v(strB);
            }
            iVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            iVarC.y(timer.c());
            h.d(iVarC);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return g(httpClient, httpUriRequest, new Timer(), k.l());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, k kVar) throws IOException {
        i iVarC = i.c(kVar);
        try {
            iVarC.A(httpHost.toURI() + httpRequest.getRequestLine().getUri()).o(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                iVarC.t(lA.longValue());
            }
            timer.h();
            iVarC.u(timer.f());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            iVarC.y(timer.c());
            iVarC.p(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                iVarC.w(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                iVarC.v(strB);
            }
            iVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            iVarC.y(timer.c());
            h.d(iVarC);
            throw e10;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, k kVar) throws IOException {
        i iVarC = i.c(kVar);
        try {
            iVarC.A(httpUriRequest.getURI().toString()).o(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                iVarC.t(lA.longValue());
            }
            timer.h();
            iVarC.u(timer.f());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            iVarC.y(timer.c());
            iVarC.p(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                iVarC.w(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                iVarC.v(strB);
            }
            iVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            iVarC.y(timer.c());
            h.d(iVarC);
            throw e10;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, k kVar) throws IOException {
        i iVarC = i.c(kVar);
        try {
            iVarC.A(httpUriRequest.getURI().toString()).o(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                iVarC.t(lA.longValue());
            }
            timer.h();
            iVarC.u(timer.f());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            iVarC.y(timer.c());
            iVarC.p(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                iVarC.w(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                iVarC.v(strB);
            }
            iVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            iVarC.y(timer.c());
            h.d(iVarC);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return h(httpClient, httpUriRequest, httpContext, new Timer(), k.l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) c(httpClient, httpUriRequest, responseHandler, new Timer(), k.l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return e(httpClient, httpHost, httpRequest, new Timer(), k.l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return f(httpClient, httpHost, httpRequest, httpContext, new Timer(), k.l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new Timer(), k.l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), k.l());
    }
}
