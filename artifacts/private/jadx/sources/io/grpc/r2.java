package io.grpc;

/* JADX INFO: loaded from: classes13.dex */
@t0
public abstract class r2 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j2<?> f290886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f290887b;

        private a(j2<?> j2Var, String str) {
            this.f290886a = j2Var;
            this.f290887b = str;
        }

        public static a a(String str) {
            return new a(null, (String) com.google.common.base.j0.E(str));
        }

        public static a d(j2<?> j2Var) {
            return new a((j2) com.google.common.base.j0.E(j2Var), null);
        }

        public String b() {
            return this.f290887b;
        }

        public j2<?> c() {
            return this.f290886a;
        }
    }

    public static r2 e() {
        r2 r2VarF = s2.c().f();
        if (r2VarF != null) {
            return r2VarF;
        }
        throw new t1.b("No functional server found. Try adding a dependency on the grpc-netty or grpc-netty-shaded artifact");
    }

    protected abstract j2<?> a(int i10);

    protected abstract boolean b();

    protected a c(int i10, n2 n2Var) {
        return a.a("ServerCredentials are unsupported");
    }

    protected abstract int d();
}
