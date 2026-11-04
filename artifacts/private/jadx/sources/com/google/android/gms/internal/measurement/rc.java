package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qc f108777a;

    private rc(ge geVar, Object obj, ge geVar2, Object obj2) {
        this.f108777a = new qc(geVar, "", geVar2, "");
    }

    public static rc a(ge geVar, Object obj, ge geVar2, Object obj2) {
        return new rc(geVar, "", geVar2, "");
    }

    static void b(wa waVar, qc qcVar, Object obj, Object obj2) throws IOException {
        gb.f(waVar, qcVar.f108753a, 1, obj);
        gb.f(waVar, qcVar.f108755c, 2, obj2);
    }

    static int c(qc qcVar, Object obj, Object obj2) {
        int i10 = 7 & 1;
        return gb.h(qcVar.f108753a, 1, obj) + gb.h(qcVar.f108755c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        qc qcVar = this.f108777a;
        int iG = wa.G(i10 << 3);
        int iC = c(qcVar, obj, obj2);
        return iG + wa.G(iC) + iC;
    }

    final qc e() {
        return this.f108777a;
    }
}
