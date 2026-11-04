package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124062f = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f124063g = "User-Agent";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f124064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f124065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f124066c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f124067d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Timer f124068e;

    public e(HttpURLConnection httpURLConnection, Timer timer, i iVar) {
        this.f124064a = httpURLConnection;
        this.f124065b = iVar;
        this.f124068e = timer;
        iVar.A(httpURLConnection.getURL().toString());
    }

    private void a0() {
        if (this.f124066c == -1) {
            this.f124068e.h();
            long jF = this.f124068e.f();
            this.f124066c = jF;
            this.f124065b.u(jF);
        }
        String strF = F();
        if (strF != null) {
            this.f124065b.o(strF);
        } else if (o()) {
            this.f124065b.o("POST");
        } else {
            this.f124065b.o("GET");
        }
    }

    public boolean A() {
        return this.f124064a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f124064a.getLastModified();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream = this.f124064a.getOutputStream();
            return outputStream != null ? new b(outputStream, this.f124065b, this.f124068e) : outputStream;
        } catch (IOException e10) {
            this.f124065b.y(this.f124068e.c());
            h.d(this.f124065b);
            throw e10;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.f124064a.getPermission();
        } catch (IOException e10) {
            this.f124065b.y(this.f124068e.c());
            h.d(this.f124065b);
            throw e10;
        }
    }

    public int E() {
        return this.f124064a.getReadTimeout();
    }

    public String F() {
        return this.f124064a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f124064a.getRequestProperties();
    }

    public String H(String str) {
        return this.f124064a.getRequestProperty(str);
    }

    public int I() throws IOException {
        a0();
        if (this.f124067d == -1) {
            long jC = this.f124068e.c();
            this.f124067d = jC;
            this.f124065b.z(jC);
        }
        try {
            int responseCode = this.f124064a.getResponseCode();
            this.f124065b.p(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f124065b.y(this.f124068e.c());
            h.d(this.f124065b);
            throw e10;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.f124067d == -1) {
            long jC = this.f124068e.c();
            this.f124067d = jC;
            this.f124065b.z(jC);
        }
        try {
            String responseMessage = this.f124064a.getResponseMessage();
            this.f124065b.p(this.f124064a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f124065b.y(this.f124068e.c());
            h.d(this.f124065b);
            throw e10;
        }
    }

    public URL K() {
        return this.f124064a.getURL();
    }

    public boolean L() {
        return this.f124064a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f124064a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f124064a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f124064a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f124064a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f124064a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f124064a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f124064a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f124064a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f124064a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f124064a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f124064a.setReadTimeout(i10);
    }

    public void X(String str) throws ProtocolException {
        this.f124064a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f124065b.B(str2);
        }
        this.f124064a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f124064a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f124064a.addRequestProperty(str, str2);
    }

    public void b() throws IOException {
        if (this.f124066c == -1) {
            this.f124068e.h();
            long jF = this.f124068e.f();
            this.f124066c = jF;
            this.f124065b.u(jF);
        }
        try {
            this.f124064a.connect();
        } catch (IOException e10) {
            this.f124065b.y(this.f124068e.c());
            h.d(this.f124065b);
            throw e10;
        }
    }

    public boolean b0() {
        return this.f124064a.usingProxy();
    }

    public void c() {
        this.f124065b.y(this.f124068e.c());
        this.f124065b.b();
        this.f124064a.disconnect();
    }

    public boolean d() {
        return this.f124064a.getAllowUserInteraction();
    }

    public int e() {
        return this.f124064a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f124064a.equals(obj);
    }

    public Object f() throws IOException {
        a0();
        this.f124065b.p(this.f124064a.getResponseCode());
        try {
            Object content = this.f124064a.getContent();
            if (content instanceof InputStream) {
                this.f124065b.v(this.f124064a.getContentType());
                return new a((InputStream) content, this.f124065b, this.f124068e);
            }
            this.f124065b.v(this.f124064a.getContentType());
            this.f124065b.w(this.f124064a.getContentLength());
            this.f124065b.y(this.f124068e.c());
            this.f124065b.b();
            return content;
        } catch (IOException e10) {
            this.f124065b.y(this.f124068e.c());
            h.d(this.f124065b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.f124065b.p(this.f124064a.getResponseCode());
        try {
            Object content = this.f124064a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f124065b.v(this.f124064a.getContentType());
                return new a((InputStream) content, this.f124065b, this.f124068e);
            }
            this.f124065b.v(this.f124064a.getContentType());
            this.f124065b.w(this.f124064a.getContentLength());
            this.f124065b.y(this.f124068e.c());
            this.f124065b.b();
            return content;
        } catch (IOException e10) {
            this.f124065b.y(this.f124068e.c());
            h.d(this.f124065b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f124064a.getContentEncoding();
    }

    public int hashCode() {
        return this.f124064a.hashCode();
    }

    public int i() {
        a0();
        return this.f124064a.getContentLength();
    }

    public long j() {
        a0();
        return this.f124064a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f124064a.getContentType();
    }

    public long l() {
        a0();
        return this.f124064a.getDate();
    }

    public boolean m() {
        return this.f124064a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f124064a.getDoInput();
    }

    public boolean o() {
        return this.f124064a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f124065b.p(this.f124064a.getResponseCode());
        } catch (IOException unused) {
            f124062f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f124064a.getErrorStream();
        return errorStream != null ? new a(errorStream, this.f124065b, this.f124068e) : errorStream;
    }

    public long q() {
        a0();
        return this.f124064a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f124064a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f124064a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f124064a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f124064a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f124064a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f124064a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        return this.f124064a.getHeaderFieldLong(str, j10);
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f124064a.getHeaderFields();
    }

    public long y() {
        return this.f124064a.getIfModifiedSince();
    }

    public InputStream z() throws IOException {
        a0();
        this.f124065b.p(this.f124064a.getResponseCode());
        this.f124065b.v(this.f124064a.getContentType());
        try {
            InputStream inputStream = this.f124064a.getInputStream();
            return inputStream != null ? new a(inputStream, this.f124065b, this.f124068e) : inputStream;
        } catch (IOException e10) {
            this.f124065b.y(this.f124068e.c());
            h.d(this.f124065b);
            throw e10;
        }
    }
}
