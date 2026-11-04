package com.google.vr.sdk.deps;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f129482a = F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a6<?, ?> f129483b = g(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a6<?, ?> f129484c = g(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a6<?, ?> f129485d = new a6<>((byte) 0);

    static int A(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i4)) {
            int iT0 = 0;
            while (i10 < size) {
                iT0 += t2.t0(list.get(i10).longValue());
                i10++;
            }
            return iT0;
        }
        i4 i4Var = (i4) list;
        int iT1 = 0;
        while (i10 < size) {
            iT1 += t2.t0(i4Var.k(i10));
            i10++;
        }
        return iT1;
    }

    public static a6<?, ?> B() {
        return f129485d;
    }

    public static void C(int i10, List<Long> list, q6 q6Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            q6Var.A(i10, list, z10);
        }
    }

    static int D(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * t2.l0(i10));
    }

    static int E(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j3)) {
            int iE0 = 0;
            while (i10 < size) {
                iE0 += t2.E0(list.get(i10).intValue());
                i10++;
            }
            return iE0;
        }
        j3 j3Var = (j3) list;
        int iE1 = 0;
        while (i10 < size) {
            iE1 += t2.E0(j3Var.i(i10));
            i10++;
        }
        return iE1;
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i10, List<Long> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.D(i10, list, z10);
    }

    static int H(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * t2.l0(i10));
    }

    static int I(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j3)) {
            int iQ0 = 0;
            while (i10 < size) {
                iQ0 += t2.q0(list.get(i10).intValue());
                i10++;
            }
            return iQ0;
        }
        j3 j3Var = (j3) list;
        int iQ1 = 0;
        while (i10 < size) {
            iQ1 += t2.q0(j3Var.i(i10));
            i10++;
        }
        return iQ1;
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i10, List<Long> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.Q(i10, list, z10);
    }

    static int L(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * t2.l0(i10));
    }

    static int M(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j3)) {
            int iV0 = 0;
            while (i10 < size) {
                iV0 += t2.v0(list.get(i10).intValue());
                i10++;
            }
            return iV0;
        }
        j3 j3Var = (j3) list;
        int iV1 = 0;
        while (i10 < size) {
            iV1 += t2.v0(j3Var.i(i10));
            i10++;
        }
        return iV1;
    }

    public static void N(int i10, List<Long> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.G(i10, list, z10);
    }

    static int O(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * t2.l0(i10));
    }

    static int P(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j3)) {
            int iZ0 = 0;
            while (i10 < size) {
                iZ0 += t2.z0(list.get(i10).intValue());
                i10++;
            }
            return iZ0;
        }
        j3 j3Var = (j3) list;
        int iZ1 = 0;
        while (i10 < size) {
            iZ1 += t2.z0(j3Var.i(i10));
            i10++;
        }
        return iZ1;
    }

    public static void Q(int i10, List<Long> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.O(i10, list, z10);
    }

    static int R(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * t2.F0(i10, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    public static void T(int i10, List<Integer> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.o(i10, list, z10);
    }

    static int U(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * t2.x0(i10, 0L);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    public static void W(int i10, List<Integer> list, q6 q6Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            q6Var.M(i10, list, z10);
        }
    }

    static int X(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * t2.G(i10, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    public static void Z(int i10, List<Integer> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.P(i10, list, z10);
    }

    static int a(int i10, Object obj, k5 k5Var) {
        return obj instanceof b4 ? t2.c(i10, (b4) obj) : t2.E(i10, (t4) obj, k5Var);
    }

    public static void a0(int i10, List<Integer> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.x(i10, list, z10);
    }

    static int b(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iL0 = t2.l0(i10) * size;
        if (!(list instanceof d4)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iL0 += obj instanceof k2 ? t2.H((k2) obj) : t2.K((String) obj);
                i11++;
            }
            return iL0;
        }
        d4 d4Var = (d4) list;
        while (i11 < size) {
            Object objV3 = d4Var.V3(i11);
            iL0 += objV3 instanceof k2 ? t2.H((k2) objV3) : t2.K((String) objV3);
            i11++;
        }
        return iL0;
    }

    public static void b0(int i10, List<Integer> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.N(i10, list, z10);
    }

    static int c(int i10, List<?> list, k5 k5Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL0 = t2.l0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iL0 += obj instanceof b4 ? t2.d((b4) obj) : t2.J((t4) obj, k5Var);
        }
        return iL0;
    }

    public static void c0(int i10, List<Integer> list, q6 q6Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            q6Var.K(i10, list, z10);
        }
    }

    static int d(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * t2.l0(i10));
    }

    public static void d0(int i10, List<Boolean> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.L(i10, list, z10);
    }

    static int e(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i4)) {
            int iH0 = 0;
            while (i10 < size) {
                iH0 += t2.h0(list.get(i10).longValue());
                i10++;
            }
            return iH0;
        }
        i4 i4Var = (i4) list;
        int iH1 = 0;
        while (i10 < size) {
            iH1 += t2.h0(i4Var.k(i10));
            i10++;
        }
        return iH1;
    }

    public static a6<?, ?> f() {
        return f129483b;
    }

    private static a6<?, ?> g(boolean z10) {
        try {
            Class<?> clsJ = J();
            if (clsJ == null) {
                return null;
            }
            return (a6) clsJ.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB h(int i10, int i11, UB ub2, a6<UT, UB> a6Var) {
        if (ub2 == null) {
            ub2 = a6Var.r();
        }
        a6Var.i(ub2, i10, i11);
        return ub2;
    }

    static <UT, UB> UB i(int i10, List<Integer> list, p3 p3Var, UB ub2, a6<UT, UB> a6Var) {
        if (p3Var == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!p3Var.a(iIntValue)) {
                    ub2 = (UB) h(i10, iIntValue, ub2, a6Var);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int iIntValue2 = num.intValue();
            if (p3Var.a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) h(i10, iIntValue2, ub2, a6Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    public static void j(int i10, List<String> list, q6 q6Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            q6Var.m(i10, list);
        }
    }

    public static void k(int i10, List<?> list, q6 q6Var, k5 k5Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.n(i10, list, k5Var);
    }

    public static void l(int i10, List<Double> list, q6 q6Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            q6Var.J(i10, list, z10);
        }
    }

    static <T, FT extends b3<FT>> void m(y2<FT> y2Var, T t10, T t11) {
        a3<i3.c> a3VarB = y2Var.b(t11);
        if (a3VarB.m()) {
            return;
        }
        y2Var.j(t10).f(a3VarB);
    }

    static <T> void n(p4 p4Var, T t10, T t11, long j10) {
        f6.l(t10, j10, p4Var.c(f6.I(t10, j10), f6.I(t11, j10)));
    }

    static <T, UT, UB> void o(a6<UT, UB> a6Var, T t10, T t11) {
        a6Var.n(t10, a6Var.B(a6Var.s(t10), a6Var.s(t11)));
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!i3.class.isAssignableFrom(cls) && (cls2 = f129482a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int i10, List<k2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL0 = size * t2.l0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iL0 += t2.H(list.get(i11));
        }
        return iL0;
    }

    static int s(int i10, List<t4> list, k5 k5Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iW += t2.W(i10, list.get(i11), k5Var);
        }
        return iW;
    }

    static int t(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * t2.l0(i10));
    }

    static int u(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i4)) {
            int iN0 = 0;
            while (i10 < size) {
                iN0 += t2.n0(list.get(i10).longValue());
                i10++;
            }
            return iN0;
        }
        i4 i4Var = (i4) list;
        int iN1 = 0;
        while (i10 < size) {
            iN1 += t2.n0(i4Var.k(i10));
            i10++;
        }
        return iN1;
    }

    public static a6<?, ?> v() {
        return f129484c;
    }

    public static void w(int i10, List<k2> list, q6 q6Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.v(i10, list);
    }

    public static void x(int i10, List<?> list, q6 q6Var, k5 k5Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.w(i10, list, k5Var);
    }

    public static void y(int i10, List<Float> list, q6 q6Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q6Var.I(i10, list, z10);
    }

    static int z(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * t2.l0(i10));
    }
}
