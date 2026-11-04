package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class y7 implements f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f8[] f109447a;

    y7(f8... f8VarArr) {
        this.f109447a = f8VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.f8
    public final e8 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            f8 f8Var = this.f109447a[i10];
            if (f8Var.b(cls)) {
                return f8Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.f8
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f109447a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
