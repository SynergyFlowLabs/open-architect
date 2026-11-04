package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class pc implements kd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final wc f108738b = new nc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wc f108739a;

    public pc() {
        lb lbVarC = lb.c();
        int i10 = gd.f108451d;
        int i11 = 6 >> 1;
        oc ocVar = new oc(lbVarC, f108738b);
        byte[] bArr = ac.f108281b;
        this.f108739a = ocVar;
    }

    @Override // com.google.android.gms.internal.measurement.kd
    public final jd a(Class cls) {
        int i10 = ld.f108621b;
        if (!qb.class.isAssignableFrom(cls)) {
            int i11 = gd.f108451d;
        }
        vc vcVarB = this.f108739a.b(cls);
        if (vcVarB.a()) {
            int i12 = gd.f108451d;
            return cd.c(ld.a(), eb.a(), vcVarB.g());
        }
        int i13 = gd.f108451d;
        return bd.B(cls, vcVarB, ed.a(), kc.a(), ld.a(), vcVarB.h() + (-1) != 1 ? eb.a() : null, uc.a());
    }
}
