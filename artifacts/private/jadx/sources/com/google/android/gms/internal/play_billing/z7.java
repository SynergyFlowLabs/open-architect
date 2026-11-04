package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class z7 implements t8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f8 f109459b = new x7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f8 f109460a;

    public z7() {
        z6 z6VarC = z6.c();
        int i10 = p8.f109257d;
        y7 y7Var = new y7(z6VarC, f109459b);
        byte[] bArr = j7.f109152b;
        this.f109460a = y7Var;
    }

    @Override // com.google.android.gms.internal.play_billing.t8
    public final s8 a(Class cls) {
        int i10 = u8.f109359b;
        if (!e7.class.isAssignableFrom(cls)) {
            int i11 = p8.f109257d;
        }
        e8 e8VarA = this.f109460a.a(cls);
        if (e8VarA.g()) {
            int i12 = p8.f109257d;
            return l8.i(u8.r(), s6.a(), e8VarA.a());
        }
        int i13 = p8.f109257d;
        return k8.A(cls, e8VarA, n8.a(), v7.a(), u8.r(), e8VarA.h() + (-1) != 1 ? s6.a() : null, d8.a());
    }
}
