package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final vd f108620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f108621b = 0;

    static {
        int i10 = gd.f108451d;
        f108620a = new xd();
    }

    static int A(List list) {
        return list.size() * 4;
    }

    static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (wa.G(i10 << 3) + 4);
    }

    static int C(List list) {
        return list.size() * 8;
    }

    static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (wa.G(i10 << 3) + 8);
    }

    static int E(int i10, Object obj, jd jdVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof hc)) {
            return wa.G(i11) + wa.d((yc) obj, jdVar);
        }
        int iG = wa.G(i11);
        int iB = ((hc) obj).b();
        return iG + wa.G(iB) + iB;
    }

    public static vd a() {
        return f108620a;
    }

    static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void c(cb cbVar, Object obj, Object obj2) {
        if (((nb) obj2).zzb.f108447a.isEmpty()) {
            return;
        }
        throw null;
    }

    static void d(vd vdVar, Object obj, Object obj2) {
        qb qbVar = (qb) obj;
        wd wdVarC = qbVar.zzc;
        wd wdVar = ((qb) obj2).zzc;
        if (!wd.a().equals(wdVar)) {
            if (wd.a().equals(wdVarC)) {
                wdVarC = wd.c(wdVarC, wdVar);
            } else {
                wdVarC.l(wdVar);
            }
        }
        qbVar.zzc = wdVarC;
    }

    static Object e(Object obj, int i10, int i11, Object obj2, vd vdVar) {
        if (obj2 == null) {
            obj2 = vdVar.a(obj);
        }
        ((wd) obj2).k(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void f(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.f(i10, list, z10);
    }

    public static void g(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.w(i10, list, z10);
    }

    public static void h(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.i(i10, list, z10);
    }

    public static void i(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.J(i10, list, z10);
    }

    public static void j(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.h(i10, list, z10);
    }

    public static void k(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.a(i10, list, z10);
    }

    public static void l(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.d(i10, list, z10);
    }

    public static void m(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ieVar.L(i10, list, z10);
        }
    }

    public static void n(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.u(i10, list, z10);
    }

    public static void o(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.H(i10, list, z10);
    }

    public static void p(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.K(i10, list, z10);
    }

    public static void q(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.s(i10, list, z10);
    }

    public static void r(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            ieVar.C(i10, list, z10);
        }
    }

    public static void s(int i10, List list, ie ieVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ieVar.g(i10, list, z10);
    }

    static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mc)) {
            int iA = 0;
            while (i10 < size) {
                iA += wa.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        mc mcVar = (mc) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += wa.a(mcVar.o2(i10));
            i10++;
        }
        return iA2;
    }

    static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mc)) {
            int iA = 0;
            while (i10 < size) {
                iA += wa.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        mc mcVar = (mc) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += wa.a(mcVar.o2(i10));
            i10++;
        }
        return iA2;
    }

    static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof mc)) {
            int iA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iA += wa.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iA;
        }
        mc mcVar = (mc) list;
        int iA2 = 0;
        while (i10 < size) {
            long jO2 = mcVar.o2(i10);
            iA2 += wa.a((jO2 >> 63) ^ (jO2 + jO2));
            i10++;
        }
        return iA2;
    }

    static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rb)) {
            int iA = 0;
            while (i10 < size) {
                iA += wa.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        rb rbVar = (rb) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += wa.a(rbVar.k(i10));
            i10++;
        }
        return iA2;
    }

    static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rb)) {
            int iA = 0;
            while (i10 < size) {
                iA += wa.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        rb rbVar = (rb) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += wa.a(rbVar.k(i10));
            i10++;
        }
        return iA2;
    }

    static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rb)) {
            int iG = 0;
            while (i10 < size) {
                iG += wa.G(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iG;
        }
        rb rbVar = (rb) list;
        int iG2 = 0;
        while (i10 < size) {
            iG2 += wa.G(rbVar.k(i10));
            i10++;
        }
        return iG2;
    }

    static int z(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rb)) {
            int iG = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iG += wa.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iG;
        }
        rb rbVar = (rb) list;
        int iG2 = 0;
        while (i10 < size) {
            int iK = rbVar.k(i10);
            iG2 += wa.G((iK >> 31) ^ (iK + iK));
            i10++;
        }
        return iG2;
    }
}
