package com.google.vr.sdk.deps;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class x4<T> implements k5<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t4 f129682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a6<?, ?> f129683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f129684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y2<?> f129685d;

    private x4(a6<?, ?> a6Var, y2<?> y2Var, t4 t4Var) {
        this.f129683b = a6Var;
        this.f129684c = y2Var.i(t4Var);
        this.f129685d = y2Var;
        this.f129682a = t4Var;
    }

    static <T> x4<T> i(a6<?, ?> a6Var, y2<?> y2Var, t4 t4Var) {
        return new x4<>(a6Var, y2Var, t4Var);
    }

    @Override // com.google.vr.sdk.deps.k5
    public final void a(T t10) {
        this.f129683b.C(t10);
        this.f129685d.k(t10);
    }

    @Override // com.google.vr.sdk.deps.k5
    public final boolean b(T t10, T t11) {
        if (!this.f129683b.s(t10).equals(this.f129683b.s(t11))) {
            return false;
        }
        if (this.f129684c) {
            return this.f129685d.b(t10).equals(this.f129685d.b(t11));
        }
        return true;
    }

    @Override // com.google.vr.sdk.deps.k5
    public final int c(T t10) {
        a6<?, ?> a6Var = this.f129683b;
        int iD = a6Var.D(a6Var.s(t10));
        return this.f129684c ? iD + this.f129685d.b(t10).v() : iD;
    }

    @Override // com.google.vr.sdk.deps.k5
    public final boolean d(T t10) {
        return this.f129685d.b(t10).t();
    }

    @Override // com.google.vr.sdk.deps.k5
    public final int e(T t10) {
        int iHashCode = this.f129683b.s(t10).hashCode();
        if (this.f129684c) {
            iHashCode = (iHashCode * 53) + this.f129685d.b(t10).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.vr.sdk.deps.k5
    public final void f(T t10, q6 q6Var) throws IOException {
        Iterator<Map.Entry<FieldDescriptorType, Object>> itR = this.f129685d.b(t10).r();
        while (itR.hasNext()) {
            Map.Entry entry = (Map.Entry) itR.next();
            b3 b3Var = (b3) entry.getKey();
            if (b3Var.c() != p6.MESSAGE || b3Var.d() || b3Var.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof z3) {
                q6Var.j(b3Var.y(), ((z3) entry).a().d());
            } else {
                q6Var.j(b3Var.y(), entry.getValue());
            }
        }
        a6<?, ?> a6Var = this.f129683b;
        a6Var.w(a6Var.s(t10), q6Var);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:49:0x000c->B:54:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.vr.sdk.deps.k5
    public final void g(T t10, j5 j5Var, x2 x2Var) throws IOException {
        boolean zC;
        a6<?, ?> a6Var = this.f129683b;
        y2<?> y2Var = this.f129685d;
        Object objA = a6Var.A(t10);
        a3<i3.c> a3VarJ = y2Var.j(t10);
        while (j5Var.y() != Integer.MAX_VALUE) {
            try {
                int iB = j5Var.b();
                if (iB != n6.f129503a) {
                    if ((iB & 7) == 2) {
                        Object objC = y2Var.c(x2Var, this.f129682a, iB >>> 3);
                        if (objC != null) {
                            y2Var.f(j5Var, objC, x2Var, a3VarJ);
                        } else {
                            zC = a6Var.p(objA, j5Var);
                        }
                    } else {
                        zC = j5Var.c();
                    }
                    if (!zC) {
                        a6Var.x(t10, objA);
                        return;
                    }
                } else {
                    Object objC2 = null;
                    int iG = 0;
                    k2 k2VarN = null;
                    while (j5Var.y() != Integer.MAX_VALUE) {
                        int iB2 = j5Var.b();
                        if (iB2 != n6.f129505c) {
                            if (iB2 != n6.f129506d) {
                                if (!j5Var.c()) {
                                    break;
                                }
                            } else if (objC2 != null) {
                                y2Var.f(j5Var, objC2, x2Var, a3VarJ);
                            } else {
                                k2VarN = j5Var.n();
                            }
                        } else {
                            iG = j5Var.g();
                            objC2 = y2Var.c(x2Var, this.f129682a, iG);
                        }
                    }
                    if (j5Var.b() != n6.f129504b) {
                        throw v3.d();
                    }
                    if (k2VarN != null) {
                        if (objC2 != null) {
                            y2Var.e(k2VarN, objC2, x2Var, a3VarJ);
                        } else {
                            a6Var.j(objA, iG, k2VarN);
                        }
                    }
                }
                zC = true;
                if (!zC) {
                    a6Var.x(t10, objA);
                    return;
                }
            } catch (Throwable th2) {
                a6Var.x(t10, objA);
                throw th2;
            }
        }
        a6Var.x(t10, objA);
    }

    @Override // com.google.vr.sdk.deps.k5
    public final void h(T t10, T t11) {
        m5.o(this.f129683b, t10, t11);
        if (this.f129684c) {
            m5.m(this.f129685d, t10, t11);
        }
    }

    @Override // com.google.vr.sdk.deps.k5
    public final T y() {
        return (T) this.f129682a.G1().B1();
    }
}
