package io.grpc;

import com.google.common.collect.n6;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
@e0("https://github.com/grpc/grpc-java/issues/4159")
public final class z1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f291493e = Logger.getLogger(z1.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static z1 f291494f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f291495g = "unknown";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x1.d f291496a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @gj.a("this")
    private String f291497b = "unknown";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @gj.a("this")
    private final LinkedHashSet<y1> f291498c = new LinkedHashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @gj.a("this")
    private n6<String, y1> f291499d = n6.q();

    private final class b extends x1.d {
        private b() {
        }

        @Override // io.grpc.x1.d
        public String a() {
            return z1.this.e();
        }

        @Override // io.grpc.x1.d
        @fj.h
        public x1 b(URI uri, x1.b bVar) {
            y1 y1VarG = z1.this.g(uri.getScheme());
            if (y1VarG == null) {
                return null;
            }
            return y1VarG.b(uri, bVar);
        }
    }

    private static final class c implements x2.b<y1> {
        private c() {
        }

        @Override // io.grpc.x2.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(y1 y1Var) {
            return y1Var.f();
        }

        @Override // io.grpc.x2.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(y1 y1Var) {
            return y1Var.e();
        }
    }

    private synchronized void a(y1 y1Var) {
        com.google.common.base.j0.e(y1Var.e(), "isAvailable() returned false");
        this.f291498c.add(y1Var);
    }

    public static synchronized z1 d() {
        try {
            if (f291494f == null) {
                List<y1> listF = x2.f(y1.class, f(), y1.class.getClassLoader(), new c());
                if (listF.isEmpty()) {
                    f291493e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f291494f = new z1();
                for (y1 y1Var : listF) {
                    f291493e.fine("Service loader found " + y1Var);
                    f291494f.a(y1Var);
                }
                f291494f.i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f291494f;
    }

    @com.google.common.annotations.e
    static List<Class<?>> f() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.internal.g0"));
        } catch (ClassNotFoundException e10) {
            f291493e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e10);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void i() {
        try {
            HashMap map = new HashMap();
            String strD = "unknown";
            int iF = Integer.MIN_VALUE;
            for (y1 y1Var : this.f291498c) {
                String strD2 = y1Var.d();
                y1 y1Var2 = (y1) map.get(strD2);
                if (y1Var2 == null || y1Var2.f() < y1Var.f()) {
                    map.put(strD2, y1Var);
                }
                if (iF < y1Var.f()) {
                    iF = y1Var.f();
                    strD = y1Var.d();
                }
            }
            this.f291499d = n6.g(map);
            this.f291497b = strD;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public x1.d b() {
        return this.f291496a;
    }

    public synchronized void c(y1 y1Var) {
        try {
            this.f291498c.remove(y1Var);
            i();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized String e() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f291497b;
    }

    public y1 g(String str) {
        if (str == null) {
            return null;
        }
        return h().get(str.toLowerCase(Locale.US));
    }

    @com.google.common.annotations.e
    synchronized Map<String, y1> h() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f291499d;
    }

    public synchronized void j(y1 y1Var) {
        try {
            a(y1Var);
            i();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
