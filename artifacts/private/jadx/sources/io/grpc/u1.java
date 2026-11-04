package io.grpc;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
@t0
@gj.d
public final class u1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f290988c = Logger.getLogger(u1.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static u1 f290989d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @gj.a("this")
    private final LinkedHashSet<t1> f290990a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @gj.a("this")
    private List<t1> f290991b = Collections.EMPTY_LIST;

    class a implements Comparator<t1> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(t1 t1Var, t1 t1Var2) {
            return t1Var.f() - t1Var2.f();
        }
    }

    private static final class b implements x2.b<t1> {
        private b() {
        }

        @Override // io.grpc.x2.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(t1 t1Var) {
            return t1Var.f();
        }

        @Override // io.grpc.x2.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(t1 t1Var) {
            return t1Var.d();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f290993a = 1;

        public c(String str) {
            super(str);
        }
    }

    private synchronized void a(t1 t1Var) {
        try {
            com.google.common.base.j0.e(t1Var.d(), "isAvailable() returned false");
            this.f290990a.add(t1Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized u1 c() {
        try {
            if (f290989d == null) {
                List<t1> listF = x2.f(t1.class, d(), t1.class.getClassLoader(), new b(null));
                f290989d = new u1();
                for (t1 t1Var : listF) {
                    f290988c.fine("Service loader found " + t1Var);
                    f290989d.a(t1Var);
                }
                f290989d.i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f290989d;
    }

    @com.google.common.annotations.e
    static List<Class<?>> d() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(io.grpc.okhttp.j.class);
        } catch (ClassNotFoundException e10) {
            f290988c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            f290988c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            f290988c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e12);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void i() {
        try {
            ArrayList arrayList = new ArrayList(this.f290990a);
            Collections.sort(arrayList, Collections.reverseOrder(new a()));
            this.f290991b = Collections.unmodifiableList(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(t1 t1Var) {
        try {
            this.f290990a.remove(t1Var);
            i();
        } finally {
        }
    }

    @com.google.common.annotations.e
    s1<?> e(z1 z1Var, String str, g gVar) {
        y1 y1VarG;
        try {
            y1VarG = z1Var.g(new URI(str).getScheme());
        } catch (URISyntaxException unused) {
            y1VarG = null;
        }
        if (y1VarG == null) {
            y1VarG = z1Var.g(z1Var.e());
        }
        Collection<Class<? extends SocketAddress>> collectionC = y1VarG != null ? y1VarG.c() : Collections.EMPTY_SET;
        if (h().isEmpty()) {
            throw new c("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
        }
        StringBuilder sb2 = new StringBuilder();
        for (t1 t1Var : h()) {
            if (t1Var.c().containsAll(collectionC)) {
                t1.a aVarE = t1Var.e(str, gVar);
                if (aVarE.c() != null) {
                    return aVarE.c();
                }
                sb2.append("; ");
                sb2.append(t1Var.getClass().getName());
                sb2.append(": ");
                sb2.append(aVarE.d());
            } else {
                sb2.append("; ");
                sb2.append(t1Var.getClass().getName());
                sb2.append(": does not support 1 or more of ");
                sb2.append(Arrays.toString(collectionC.toArray()));
            }
        }
        throw new c(sb2.substring(2));
    }

    s1<?> f(String str, g gVar) {
        return e(z1.d(), str, gVar);
    }

    t1 g() {
        List<t1> listH = h();
        if (listH.isEmpty()) {
            return null;
        }
        return listH.get(0);
    }

    @com.google.common.annotations.e
    synchronized List<t1> h() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f290991b;
    }

    public synchronized void j(t1 t1Var) {
        a(t1Var);
        i();
    }
}
