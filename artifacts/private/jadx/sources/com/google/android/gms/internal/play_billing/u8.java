package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f9 f109358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f109359b = 0;

    static {
        int i10 = p8.f109257d;
        f109358a = new h9();
    }

    public static void A(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.I(i10, list, z10);
    }

    public static void B(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s9Var.E(i10, list, z10);
        }
    }

    public static void C(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.K(i10, list, z10);
    }

    public static void D(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.i(i10, list, z10);
    }

    public static void E(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.a(i10, list, z10);
    }

    public static void a(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.f(i10, list, z10);
    }

    public static void b(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.g(i10, list, z10);
    }

    public static void c(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.d(i10, list, z10);
    }

    public static void d(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.h(i10, list, z10);
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f7)) {
            int iA = 0;
            while (i10 < size) {
                iA += k6.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        f7 f7Var = (f7) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += k6.a(f7Var.d(i10));
            i10++;
        }
        return iA2;
    }

    static int g(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (k6.B(i10 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (k6.B(i10 << 3) + 8);
    }

    static int j(List list) {
        return list.size() * 8;
    }

    static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f7)) {
            int iA = 0;
            while (i10 < size) {
                iA += k6.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        f7 f7Var = (f7) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += k6.a(f7Var.d(i10));
            i10++;
        }
        return iA2;
    }

    static int l(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof w7)) {
            int iA = 0;
            while (i10 < size) {
                iA += k6.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        w7 w7Var = (w7) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += k6.a(w7Var.d(i10));
            i10++;
        }
        return iA2;
    }

    static int m(int i10, Object obj, s8 s8Var) {
        int i11 = i10 << 3;
        if (!(obj instanceof r7)) {
            return k6.B(i11) + k6.z((h8) obj, s8Var);
        }
        int iB = k6.B(i11);
        int iA = ((r7) obj).a();
        return iB + k6.B(iA) + iA;
    }

    static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f7)) {
            int iB = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iB += k6.B((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iB;
        }
        f7 f7Var = (f7) list;
        int iB2 = 0;
        while (i10 < size) {
            int iD = f7Var.d(i10);
            iB2 += k6.B((iD >> 31) ^ (iD + iD));
            i10++;
        }
        return iB2;
    }

    static int o(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof w7)) {
            int iA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iA += k6.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iA;
        }
        w7 w7Var = (w7) list;
        int iA2 = 0;
        while (i10 < size) {
            long jD = w7Var.d(i10);
            iA2 += k6.a((jD >> 63) ^ (jD + jD));
            i10++;
        }
        return iA2;
    }

    static int p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f7)) {
            int iB = 0;
            while (i10 < size) {
                iB += k6.B(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iB;
        }
        f7 f7Var = (f7) list;
        int iB2 = 0;
        while (i10 < size) {
            iB2 += k6.B(f7Var.d(i10));
            i10++;
        }
        return iB2;
    }

    static int q(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof w7)) {
            int iA = 0;
            while (i10 < size) {
                iA += k6.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        w7 w7Var = (w7) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += k6.a(w7Var.d(i10));
            i10++;
        }
        return iA2;
    }

    public static f9 r() {
        return f109358a;
    }

    static Object s(Object obj, int i10, int i11, Object obj2, f9 f9Var) {
        e7 e7Var;
        g9 g9Var;
        Object obj3 = obj2;
        if (obj2 == null && (g9Var = (e7Var = (e7) obj).zzc) == g9.c()) {
            obj3 = g9Var;
            g9 g9VarF = g9.f();
            e7Var.zzc = g9VarF;
            obj3 = g9VarF;
        }
        obj3 = g9Var;
        ((g9) obj3).j(i10 << 3, Long.valueOf(i11));
        return obj3;
    }

    static void t(q6 q6Var, Object obj, Object obj2) {
        if (((b7) obj2).zzb.f109364a.isEmpty()) {
            return;
        }
        throw null;
    }

    static void u(f9 f9Var, Object obj, Object obj2) {
        e7 e7Var = (e7) obj;
        g9 g9VarE = e7Var.zzc;
        g9 g9Var = ((e7) obj2).zzc;
        if (!g9.c().equals(g9Var)) {
            if (g9.c().equals(g9VarE)) {
                g9VarE = g9.e(g9VarE, g9Var);
            } else {
                g9VarE.d(g9Var);
            }
        }
        e7Var.zzc = g9VarE;
    }

    public static void v(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.m(i10, list, z10);
    }

    public static void w(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.y(i10, list, z10);
    }

    public static void x(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s9Var.u(i10, list, z10);
        }
    }

    public static void y(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.t(i10, list, z10);
    }

    public static void z(int i10, List list, s9 s9Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s9Var.G(i10, list, z10);
    }
}
