package io.grpc.okhttp;

import com.google.common.util.concurrent.h1;
import com.google.common.util.concurrent.t1;
import io.grpc.a1;
import io.grpc.c1;
import io.grpc.internal.d1;
import io.grpc.internal.y2;
import io.grpc.internal.z1;
import io.grpc.u2;
import io.grpc.v0;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ServerSocketFactory;

/* JADX INFO: loaded from: classes13.dex */
final class q implements d1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f290768n = Logger.getLogger(q.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SocketAddress f290769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ServerSocketFactory f290770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z1<Executor> f290771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z1<ScheduledExecutorService> f290772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0.b f290773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v0 f290774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ServerSocket f290775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SocketAddress f290776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a1<v0.l> f290777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Executor f290778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ScheduledExecutorService f290779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private y2 f290780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f290781m;

    private static final class a implements a1<v0.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c1 f290782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ServerSocket f290783b;

        public a(ServerSocket serverSocket) {
            this.f290783b = serverSocket;
            this.f290782a = c1.a(a.class, String.valueOf(serverSocket.getLocalSocketAddress()));
        }

        @Override // io.grpc.m1
        public c1 c() {
            return this.f290782a;
        }

        @Override // io.grpc.a1
        public t1<v0.l> i() {
            return h1.o(new v0.l(null, this.f290783b.getLocalSocketAddress(), null, new v0.k.a().d(), null));
        }

        public String toString() {
            return com.google.common.base.b0.c(this).e("logId", this.f290782a.e()).f("socket", this.f290783b).toString();
        }
    }

    public q(s sVar, List<? extends u2.a> list, v0 v0Var) {
        this.f290769a = (SocketAddress) com.google.common.base.j0.F(sVar.f290795b, "listenAddress");
        this.f290770b = (ServerSocketFactory) com.google.common.base.j0.F(sVar.f290800g, "socketFactory");
        this.f290771c = (z1) com.google.common.base.j0.F(sVar.f290798e, "transportExecutorPool");
        this.f290772d = (z1) com.google.common.base.j0.F(sVar.f290799f, "scheduledExecutorServicePool");
        this.f290773e = new c0.b(sVar, list);
        this.f290774f = (v0) com.google.common.base.j0.F(v0Var, "channelz");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        while (true) {
            try {
                try {
                    c0 c0Var = new c0(this.f290773e, this.f290775g.accept());
                    c0Var.j0(this.f290780l.b(c0Var));
                } catch (IOException e10) {
                    if (!this.f290781m) {
                        throw e10;
                    }
                    this.f290780l.a();
                    return;
                }
            } catch (Throwable th2) {
                f290768n.log(Level.SEVERE, "Accept loop failed", th2);
                this.f290780l.a();
                return;
            }
        }
    }

    @Override // io.grpc.internal.d1
    public void a(y2 y2Var) throws IOException {
        this.f290780l = (y2) com.google.common.base.j0.F(y2Var, com.google.android.gms.common.internal.z.a.f106673a);
        ServerSocket serverSocketCreateServerSocket = this.f290770b.createServerSocket();
        try {
            serverSocketCreateServerSocket.bind(this.f290769a);
            this.f290775g = serverSocketCreateServerSocket;
            this.f290776h = serverSocketCreateServerSocket.getLocalSocketAddress();
            this.f290777i = new a(serverSocketCreateServerSocket);
            this.f290778j = this.f290771c.a();
            this.f290779k = this.f290772d.a();
            this.f290774f.d(this.f290777i);
            this.f290778j.execute(new Runnable() { // from class: io.grpc.okhttp.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f290767a.g();
                }
            });
        } catch (IOException e10) {
            serverSocketCreateServerSocket.close();
            throw e10;
        }
    }

    @Override // io.grpc.internal.d1
    public a1<v0.l> b() {
        return this.f290777i;
    }

    @Override // io.grpc.internal.d1
    public List<? extends SocketAddress> c() {
        return Collections.singletonList(d());
    }

    @Override // io.grpc.internal.d1
    public SocketAddress d() {
        return this.f290776h;
    }

    @Override // io.grpc.internal.d1
    public List<a1<v0.l>> e() {
        return Collections.singletonList(b());
    }

    @Override // io.grpc.internal.d1
    public void shutdown() {
        if (!this.f290781m) {
            this.f290781m = true;
            if (this.f290775g != null) {
                this.f290774f.z(this.f290777i);
                try {
                    this.f290775g.close();
                } catch (IOException unused) {
                    f290768n.log(Level.WARNING, "Failed closing server socket", this.f290775g);
                }
                this.f290778j = this.f290771c.b(this.f290778j);
                this.f290779k = this.f290772d.b(this.f290779k);
            }
        }
    }
}
