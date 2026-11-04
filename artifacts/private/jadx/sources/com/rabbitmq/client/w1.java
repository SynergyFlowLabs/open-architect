package com.rabbitmq.client;

import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f266055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f266056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s1 f266057c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s1 f266058a = new s1() { // from class: com.rabbitmq.client.v1
            @Override // com.rabbitmq.client.s1
            public final void a(Socket socket) {
                w1.a.a(socket);
            }
        };

        public static /* synthetic */ void a(Socket socket) {
        }

        public a b(s1 s1Var) {
            this.f266058a = this.f266058a.b(s1Var);
            return this;
        }

        public s1 c() {
            return this.f266058a;
        }

        public a d() {
            this.f266058a = this.f266058a.b(w1.f266056b);
            return this;
        }

        public a e() {
            this.f266058a = this.f266058a.b(w1.f266055a);
            return this;
        }

        public a f() {
            this.f266058a = this.f266058a.b(w1.f266057c);
            return this;
        }
    }

    static {
        s1 s1Var = new s1() { // from class: com.rabbitmq.client.t1
            @Override // com.rabbitmq.client.s1
            public final void a(Socket socket) throws SocketException {
                socket.setTcpNoDelay(true);
            }
        };
        f266055a = s1Var;
        f266056b = s1Var;
        f266057c = new s1() { // from class: com.rabbitmq.client.u1
            @Override // com.rabbitmq.client.s1
            public final void a(Socket socket) {
                w1.a(socket);
            }
        };
    }

    public static /* synthetic */ void a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.setSSLParameters(g(sSLSocket.getSSLParameters()));
        }
    }

    public static a c() {
        return new a();
    }

    public static s1 d() {
        return f266056b;
    }

    public static s1 e() {
        return f266055a;
    }

    public static s1 f() {
        return f266057c;
    }

    static final SSLParameters g(SSLParameters sSLParameters) {
        if (sSLParameters == null) {
            sSLParameters = new SSLParameters();
        }
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
        return sSLParameters;
    }
}
