package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f89648a = 3000;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f89649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.android.volley.a0 f89650b;

        private b(String str, com.android.volley.a0 a0Var) {
            this.f89649a = str;
            this.f89650b = a0Var;
        }
    }

    private w() {
    }

    static void a(com.android.volley.s<?> sVar, b bVar) throws com.android.volley.a0 {
        com.android.volley.x retryPolicy = sVar.getRetryPolicy();
        int timeoutMs = sVar.getTimeoutMs();
        try {
            retryPolicy.b(bVar.f89650b);
            sVar.addMarker(String.format("%s-retry [timeout=%s]", bVar.f89649a, Integer.valueOf(timeoutMs)));
        } catch (com.android.volley.a0 e10) {
            sVar.addMarker(String.format("%s-timeout-giveup [timeout=%s]", bVar.f89649a, Integer.valueOf(timeoutMs)));
            throw e10;
        }
    }

    static com.android.volley.o b(com.android.volley.s<?> sVar, long j10, List<com.android.volley.k> list) {
        com.android.volley.f.a cacheEntry = sVar.getCacheEntry();
        if (cacheEntry == null) {
            return new com.android.volley.o(304, (byte[]) null, true, j10, list);
        }
        return new com.android.volley.o(304, cacheEntry.f89433a, true, j10, m.a(list, cacheEntry));
    }

    static byte[] c(InputStream inputStream, int i10, h hVar) throws Throwable {
        byte[] bArrA;
        z zVar = new z(hVar, i10);
        try {
            bArrA = hVar.a(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrA);
                    if (i11 == -1) {
                        break;
                    }
                    zVar.write(bArrA, 0, i11);
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            com.android.volley.b0.f("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    hVar.b(bArrA);
                    zVar.close();
                    throw th;
                }
            }
            byte[] byteArray = zVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                com.android.volley.b0.f("Error occurred when closing InputStream", new Object[0]);
            }
            hVar.b(bArrA);
            zVar.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }

    static void d(long j10, com.android.volley.s<?> sVar, byte[] bArr, int i10) {
        if (!com.android.volley.b0.f89376b && j10 <= androidx.media3.common.j.f60679f2) {
            return;
        }
        com.android.volley.b0.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", sVar, Long.valueOf(j10), bArr != null ? Integer.valueOf(bArr.length) : AbstractJsonLexerKt.NULL, Integer.valueOf(i10), Integer.valueOf(sVar.getRetryPolicy().a()));
    }

    static b e(com.android.volley.s<?> sVar, IOException iOException, long j10, @p0 n nVar, @p0 byte[] bArr) throws com.android.volley.a0 {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new com.android.volley.z());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + sVar.getUrl(), iOException);
        }
        if (nVar == null) {
            if (!sVar.shouldRetryConnectionErrors()) {
                throw new com.android.volley.p(iOException);
            }
            return new b("connection", new com.android.volley.p());
        }
        int iE = nVar.e();
        com.android.volley.b0.c("Unexpected response code %d for %s", Integer.valueOf(iE), sVar.getUrl());
        if (bArr == null) {
            return new b(com.segment.analytics.kotlin.android.plugins.a.f266547p0, new com.android.volley.n());
        }
        com.android.volley.o oVar = new com.android.volley.o(iE, bArr, false, SystemClock.elapsedRealtime() - j10, nVar.d());
        if (iE == 401 || iE == 403) {
            return new b("auth", new com.android.volley.d(oVar));
        }
        if (iE >= 400 && iE <= 499) {
            throw new com.android.volley.h(oVar);
        }
        if (iE < 500 || iE > 599 || !sVar.shouldRetryServerErrors()) {
            throw new com.android.volley.y(oVar);
        }
        return new b("server", new com.android.volley.y(oVar));
    }
}
