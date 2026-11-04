package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f124060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpsURLConnection f124061b;

    d(HttpsURLConnection httpsURLConnection, Timer timer, i iVar) {
        super(httpsURLConnection.getURL());
        this.f124061b = httpsURLConnection;
        this.f124060a = new e(httpsURLConnection, timer, iVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f124060a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f124060a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f124060a.c();
    }

    public boolean equals(Object obj) {
        return this.f124060a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f124060a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f124061b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f124060a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.f124060a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f124060a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f124060a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f124060a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f124060a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f124060a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f124060a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f124060a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f124060a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f124060a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f124060a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f124060a.r(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f124060a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f124060a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f124060a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f124060a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f124060a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f124061b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f124060a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.f124060a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f124060a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f124060a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f124061b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f124061b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.f124060a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f124061b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.f124060a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f124060a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f124060a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f124060a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f124060a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.f124060a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.f124060a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f124061b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f124061b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f124060a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f124060a.L();
    }

    public int hashCode() {
        return this.f124060a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f124060a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f124060a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f124060a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f124060a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f124060a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f124060a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f124060a.S(i10);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f124061b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f124060a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f124060a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f124060a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f124060a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f124060a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f124061b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f124060a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f124060a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f124060a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f124060a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f124060a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f124060a.T(j10);
    }
}
