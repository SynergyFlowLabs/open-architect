package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public interface v extends Closeable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private io.grpc.h f289889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f289890b = "unknown-authority";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private io.grpc.a f289891c = io.grpc.a.f288673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @fj.h
        private String f289892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @fj.h
        private io.grpc.q0 f289893e;

        public String a() {
            return this.f289890b;
        }

        public io.grpc.h b() {
            return this.f289889a;
        }

        public io.grpc.a c() {
            return this.f289891c;
        }

        @fj.h
        public io.grpc.q0 d() {
            return this.f289893e;
        }

        @fj.h
        public String e() {
            return this.f289892d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f289890b.equals(aVar.f289890b) && this.f289891c.equals(aVar.f289891c) && com.google.common.base.d0.a(this.f289892d, aVar.f289892d) && com.google.common.base.d0.a(this.f289893e, aVar.f289893e);
        }

        public a f(String str) {
            this.f289890b = (String) com.google.common.base.j0.F(str, "authority");
            return this;
        }

        public a g(io.grpc.h hVar) {
            this.f289889a = hVar;
            return this;
        }

        public a h(io.grpc.a aVar) {
            com.google.common.base.j0.F(aVar, "eagAttributes");
            this.f289891c = aVar;
            return this;
        }

        public int hashCode() {
            return com.google.common.base.d0.b(this.f289890b, this.f289891c, this.f289892d, this.f289893e);
        }

        public a i(@fj.h io.grpc.q0 q0Var) {
            this.f289893e = q0Var;
            return this;
        }

        public a j(@fj.h String str) {
            this.f289892d = str;
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v f289894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @fj.h
        final io.grpc.d f289895b;

        public b(v vVar, @fj.h io.grpc.d dVar) {
            this.f289894a = (v) com.google.common.base.j0.F(vVar, "transportFactory");
            this.f289895b = dVar;
        }
    }

    ScheduledExecutorService E0();

    Collection<Class<? extends SocketAddress>> K8();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    x j7(SocketAddress socketAddress, a aVar, io.grpc.h hVar);

    @fj.h
    @fj.c
    b p4(io.grpc.g gVar);
}
