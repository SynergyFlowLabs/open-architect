package io.ably.lib.network;

import java.net.URI;
import java.nio.ByteBuffer;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes13.dex */
public class d extends org.java_websocket.client.b implements s {
    private final u H1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final w f287428p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f287429p2;

    public d(URI uri, w wVar, u uVar) {
        super(uri);
        this.f287429p2 = true;
        this.f287428p1 = wVar;
        this.H1 = uVar;
    }

    private boolean H0(String str) {
        SSLSession sSLSession = getSSLSession();
        if (HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession)) {
            return true;
        }
        this.f287428p1.onError(new IllegalArgumentException("Hostname verification failed, expected " + str + ", found " + sSLSession.getPeerHost()));
        return false;
    }

    @Override // org.java_websocket.g, org.java_websocket.j
    public void A(org.java_websocket.f fVar, org.java_websocket.framing.f fVar2) {
        super.A(fVar, fVar2);
        this.f287428p1.a();
    }

    @Override // io.ably.lib.network.s
    public void l(int i10, String str) {
        J(i10, str);
    }

    @Override // org.java_websocket.client.b
    public void o0(int i10, String str, boolean z10) {
        this.f287428p1.d(i10, str);
    }

    @Override // org.java_websocket.client.b
    public void r0(Exception exc) {
        this.f287428p1.onError(exc);
    }

    @Override // org.java_websocket.client.b
    public void s0(String str) {
        this.f287428p1.e(str);
    }

    @Override // org.java_websocket.client.b, org.java_websocket.f, io.ably.lib.network.s
    public void send(String str) {
        try {
            super.send(str);
        } catch (fm.i e10) {
            throw new p(e10);
        }
    }

    @Override // org.java_websocket.client.b
    public void t0(ByteBuffer byteBuffer) {
        this.f287428p1.b(byteBuffer);
    }

    @Override // org.java_websocket.client.b
    public void u0(im.h hVar) {
        if (this.H1.f() && this.f287429p2 && !H0(this.H1.c())) {
            close();
        } else {
            this.f287428p1.f();
        }
    }

    @Override // org.java_websocket.client.b
    protected void v0(SSLParameters sSLParameters) {
        try {
            super.v0(sSLParameters);
            this.f287429p2 = false;
        } catch (NoSuchMethodError e10) {
            this.f287429p2 = true;
            this.f287428p1.c(e10);
        }
    }
}
