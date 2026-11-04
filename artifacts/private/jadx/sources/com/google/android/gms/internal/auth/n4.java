package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class n4 implements u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u4[] f107716a;

    n4(u4... u4VarArr) {
        this.f107716a = u4VarArr;
    }

    @Override // com.google.android.gms.internal.auth.u4
    public final t4 a(Class cls) {
        u4[] u4VarArr = this.f107716a;
        for (int i10 = 0; i10 < 2; i10++) {
            u4 u4Var = u4VarArr[i10];
            if (u4Var.b(cls)) {
                return u4Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.u4
    public final boolean b(Class cls) {
        u4[] u4VarArr = this.f107716a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (u4VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
