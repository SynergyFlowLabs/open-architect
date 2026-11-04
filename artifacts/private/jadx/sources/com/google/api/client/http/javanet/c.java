package com.google.api.client.http.javanet;

import androidx.collection.g3;
import com.google.api.client.http.e0;
import com.google.api.client.http.f0;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes4.dex */
final class c extends e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HttpURLConnection f115641e;

    c(HttpURLConnection httpURLConnection) {
        this.f115641e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    @Override // com.google.api.client.http.e0
    public void a(String str, String str2) {
        this.f115641e.addRequestProperty(str, str2);
    }

    @Override // com.google.api.client.http.e0
    public f0 b() throws IOException {
        HttpURLConnection httpURLConnection = this.f115641e;
        if (f() != null) {
            String strE = e();
            if (strE != null) {
                a("Content-Type", strE);
            }
            String strC = c();
            if (strC != null) {
                a(com.google.common.net.d.f119476b0, strC);
            }
            long jD = d();
            if (jD >= 0) {
                httpURLConnection.setRequestProperty("Content-Length", Long.toString(jD));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || "PUT".equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (jD < 0 || jD > g3.f12256c) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) jD);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    f().writeTo(outputStream);
                    outputStream.close();
                } catch (Throwable th2) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                    throw th2;
                }
            } else {
                h0.c(jD == 0, "%s with non-zero content length is not supported", requestMethod);
            }
        }
        try {
            httpURLConnection.connect();
            return new d(httpURLConnection);
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    @Override // com.google.api.client.http.e0
    public void k(int i10, int i11) {
        this.f115641e.setReadTimeout(i11);
        this.f115641e.setConnectTimeout(i10);
    }
}
