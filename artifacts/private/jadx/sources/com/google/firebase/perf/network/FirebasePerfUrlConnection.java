package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes5.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    static Object a(l lVar, k kVar, Timer timer) throws IOException {
        timer.h();
        long jF = timer.f();
        i iVarC = i.c(kVar);
        try {
            URLConnection uRLConnectionA = lVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionA, timer, iVarC).getContent();
            }
            return uRLConnectionA instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionA, timer, iVarC).getContent() : uRLConnectionA.getContent();
        } catch (IOException e10) {
            iVarC.u(jF);
            iVarC.y(timer.c());
            iVarC.A(lVar.toString());
            h.d(iVarC);
            throw e10;
        }
    }

    static Object b(l lVar, Class[] clsArr, k kVar, Timer timer) throws IOException {
        timer.h();
        long jF = timer.f();
        i iVarC = i.c(kVar);
        try {
            URLConnection uRLConnectionA = lVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionA, timer, iVarC).getContent(clsArr);
            }
            return uRLConnectionA instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionA, timer, iVarC).getContent(clsArr) : uRLConnectionA.getContent(clsArr);
        } catch (IOException e10) {
            iVarC.u(jF);
            iVarC.y(timer.c());
            iVarC.A(lVar.toString());
            h.d(iVarC);
            throw e10;
        }
    }

    static InputStream c(l lVar, k kVar, Timer timer) throws IOException {
        if (!k.l().x()) {
            return lVar.a().getInputStream();
        }
        timer.h();
        long jF = timer.f();
        i iVarC = i.c(kVar);
        try {
            URLConnection uRLConnectionA = lVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionA, timer, iVarC).getInputStream();
            }
            return uRLConnectionA instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionA, timer, iVarC).getInputStream() : uRLConnectionA.getInputStream();
        } catch (IOException e10) {
            iVarC.u(jF);
            iVarC.y(timer.c());
            iVarC.A(lVar.toString());
            h.d(iVarC);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return a(new l(url), k.l(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new d((HttpsURLConnection) obj, new Timer(), i.c(k.l()));
        }
        return obj instanceof HttpURLConnection ? new c((HttpURLConnection) obj, new Timer(), i.c(k.l())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return c(new l(url), k.l(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return b(new l(url), clsArr, k.l(), new Timer());
    }
}
