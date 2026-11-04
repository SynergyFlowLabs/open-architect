package io.grpc;

import java.net.SocketAddress;
import java.util.Collection;

/* JADX INFO: loaded from: classes13.dex */
@t0
public abstract class t1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s1<?> f290974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f290975b;

        private a(s1<?> s1Var, String str) {
            this.f290974a = s1Var;
            this.f290975b = str;
        }

        public static a a(s1<?> s1Var) {
            return new a((s1) com.google.common.base.j0.E(s1Var), null);
        }

        public static a b(String str) {
            return new a(null, (String) com.google.common.base.j0.E(str));
        }

        public s1<?> c() {
            return this.f290974a;
        }

        public String d() {
            return this.f290975b;
        }
    }

    public static final class b extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f290976a = 1;

        public b(String str) {
            super(str);
        }
    }

    public static t1 g() {
        t1 t1VarG = u1.c().g();
        if (t1VarG != null) {
            return t1VarG;
        }
        throw new b("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    protected abstract s1<?> a(String str, int i10);

    protected abstract s1<?> b(String str);

    protected abstract Collection<Class<? extends SocketAddress>> c();

    protected abstract boolean d();

    protected a e(String str, g gVar) {
        return a.b("ChannelCredentials are unsupported");
    }

    protected abstract int f();
}
