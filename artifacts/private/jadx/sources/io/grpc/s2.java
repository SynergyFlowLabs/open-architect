package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
@t0
@gj.d
public final class s2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f290888c = Logger.getLogger(s2.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static s2 f290889d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @gj.a("this")
    private final LinkedHashSet<r2> f290890a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @gj.a("this")
    private List<r2> f290891b = Collections.EMPTY_LIST;

    class a implements Comparator<r2> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(r2 r2Var, r2 r2Var2) {
            return r2Var.d() - r2Var2.d();
        }
    }

    public static final class b extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f290893a = 1;

        public b(String str) {
            super(str);
        }
    }

    private static final class c implements x2.b<r2> {
        private c() {
        }

        @Override // io.grpc.x2.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(r2 r2Var) {
            return r2Var.d();
        }

        @Override // io.grpc.x2.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(r2 r2Var) {
            return r2Var.b();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private synchronized void a(r2 r2Var) {
        try {
            com.google.common.base.j0.e(r2Var.b(), "isAvailable() returned false");
            this.f290890a.add(r2Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized s2 c() {
        try {
            if (f290889d == null) {
                List<r2> listF = x2.f(r2.class, d(), r2.class.getClassLoader(), new c(null));
                f290889d = new s2();
                for (r2 r2Var : listF) {
                    f290888c.fine("Service loader found " + r2Var);
                    f290889d.a(r2Var);
                }
                f290889d.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f290889d;
    }

    @com.google.common.annotations.e
    static List<Class<?>> d() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(io.grpc.okhttp.t.class);
        } catch (ClassNotFoundException e10) {
            f290888c.log(Level.FINE, "Unable to find OkHttpServerProvider", (Throwable) e10);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void h() {
        try {
            ArrayList arrayList = new ArrayList(this.f290890a);
            Collections.sort(arrayList, Collections.reverseOrder(new a()));
            this.f290891b = Collections.unmodifiableList(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(r2 r2Var) {
        this.f290890a.remove(r2Var);
        h();
    }

    j2<?> e(int i10, n2 n2Var) {
        if (g().isEmpty()) {
            throw new b("No functional server found. Try adding a dependency on the grpc-netty, grpc-netty-shaded, or grpc-okhttp artifact");
        }
        StringBuilder sb2 = new StringBuilder();
        for (r2 r2Var : g()) {
            r2.a aVarC = r2Var.c(i10, n2Var);
            if (aVarC.c() != null) {
                return aVarC.c();
            }
            sb2.append("; ");
            sb2.append(r2Var.getClass().getName());
            sb2.append(": ");
            sb2.append(aVarC.b());
        }
        throw new b(sb2.substring(2));
    }

    r2 f() {
        List<r2> listG = g();
        if (listG.isEmpty()) {
            return null;
        }
        return listG.get(0);
    }

    @com.google.common.annotations.e
    synchronized List<r2> g() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f290891b;
    }

    public synchronized void i(r2 r2Var) {
        try {
            a(r2Var);
            h();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
