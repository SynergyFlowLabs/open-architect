package io.grpc;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes13.dex */
public final class q0 extends f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f290868f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SocketAddress f290869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f290870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.h
    private final String f290871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.h
    private final String f290872e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SocketAddress f290873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InetSocketAddress f290874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @fj.h
        private String f290875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.h
        private String f290876d;

        public q0 a() {
            return new q0(this.f290873a, this.f290874b, this.f290875c, this.f290876d);
        }

        public b b(@fj.h String str) {
            this.f290876d = str;
            return this;
        }

        public b c(SocketAddress socketAddress) {
            this.f290873a = (SocketAddress) com.google.common.base.j0.F(socketAddress, "proxyAddress");
            return this;
        }

        public b d(InetSocketAddress inetSocketAddress) {
            this.f290874b = (InetSocketAddress) com.google.common.base.j0.F(inetSocketAddress, "targetAddress");
            return this;
        }

        public b e(@fj.h String str) {
            this.f290875c = str;
            return this;
        }

        private b() {
        }
    }

    public static b e() {
        return new b();
    }

    @fj.h
    public String a() {
        return this.f290872e;
    }

    public SocketAddress b() {
        return this.f290869b;
    }

    public InetSocketAddress c() {
        return this.f290870c;
    }

    @fj.h
    public String d() {
        return this.f290871d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return com.google.common.base.d0.a(this.f290869b, q0Var.f290869b) && com.google.common.base.d0.a(this.f290870c, q0Var.f290870c) && com.google.common.base.d0.a(this.f290871d, q0Var.f290871d) && com.google.common.base.d0.a(this.f290872e, q0Var.f290872e);
    }

    public int hashCode() {
        return com.google.common.base.d0.b(this.f290869b, this.f290870c, this.f290871d, this.f290872e);
    }

    public String toString() {
        return com.google.common.base.b0.c(this).f("proxyAddr", this.f290869b).f("targetAddr", this.f290870c).f("username", this.f290871d).g("hasPassword", this.f290872e != null).toString();
    }

    private q0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, @fj.h String str, @fj.h String str2) {
        com.google.common.base.j0.F(socketAddress, "proxyAddress");
        com.google.common.base.j0.F(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            com.google.common.base.j0.x0(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f290869b = socketAddress;
        this.f290870c = inetSocketAddress;
        this.f290871d = str;
        this.f290872e = str2;
    }
}
