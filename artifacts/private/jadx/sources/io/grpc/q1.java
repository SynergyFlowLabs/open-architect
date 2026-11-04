package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
@e0("https://github.com/grpc/grpc-java/issues/1771")
public final class q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static q1 f290878d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<p1> f290880a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap<String, p1> f290881b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f290877c = Logger.getLogger(q1.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Iterable<Class<?>> f290879e = d();

    private static final class a implements x2.b<p1> {
        a() {
        }

        @Override // io.grpc.x2.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(p1 p1Var) {
            return p1Var.c();
        }

        @Override // io.grpc.x2.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(p1 p1Var) {
            return p1Var.d();
        }
    }

    private synchronized void a(p1 p1Var) {
        com.google.common.base.j0.e(p1Var.d(), "isAvailable() returned false");
        this.f290880a.add(p1Var);
    }

    public static synchronized q1 c() {
        try {
            if (f290878d == null) {
                List<p1> listF = x2.f(p1.class, f290879e, p1.class.getClassLoader(), new a());
                f290878d = new q1();
                for (p1 p1Var : listF) {
                    f290877c.fine("Service loader found " + p1Var);
                    f290878d.a(p1Var);
                }
                f290878d.g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f290878d;
    }

    @com.google.common.annotations.e
    static List<Class<?>> d() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.internal.f2"));
        } catch (ClassNotFoundException e10) {
            f290877c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.util.o$a"));
        } catch (ClassNotFoundException e11) {
            f290877c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void g() {
        try {
            this.f290881b.clear();
            for (p1 p1Var : this.f290880a) {
                String strB = p1Var.b();
                p1 p1Var2 = this.f290881b.get(strB);
                if (p1Var2 == null || p1Var2.c() < p1Var.c()) {
                    this.f290881b.put(strB, p1Var);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(p1 p1Var) {
        this.f290880a.remove(p1Var);
        g();
    }

    @fj.h
    public synchronized p1 e(String str) {
        return this.f290881b.get(com.google.common.base.j0.F(str, "policy"));
    }

    @com.google.common.annotations.e
    synchronized Map<String, p1> f() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new LinkedHashMap(this.f290881b);
    }

    public synchronized void h(p1 p1Var) {
        try {
            a(p1Var);
            g();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
