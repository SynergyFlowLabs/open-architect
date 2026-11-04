package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class o4 implements j5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u4 f107726b = new m4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u4 f107727a;

    public o4() {
        u4 u4Var;
        q3 q3VarC = q3.c();
        try {
            u4Var = (u4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            u4Var = f107726b;
        }
        n4 n4Var = new n4(q3VarC, u4Var);
        byte[] bArr = z3.f107905d;
        this.f107727a = n4Var;
    }

    private static boolean b(t4 t4Var) {
        return t4Var.h() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.auth.j5
    public final i5 a(Class cls) {
        k5.e(cls);
        t4 t4VarA = this.f107727a.a(cls);
        if (t4VarA.g()) {
            return t3.class.isAssignableFrom(cls) ? b5.a(k5.b(), m3.b(), t4VarA.a()) : b5.a(k5.a(), m3.a(), t4VarA.a());
        }
        if (t3.class.isAssignableFrom(cls)) {
            return b(t4VarA) ? a5.s(cls, t4VarA, d5.b(), k4.d(), k5.b(), m3.b(), s4.b()) : a5.s(cls, t4VarA, d5.b(), k4.d(), k5.b(), null, s4.b());
        }
        return b(t4VarA) ? a5.s(cls, t4VarA, d5.a(), k4.c(), k5.a(), m3.a(), s4.a()) : a5.s(cls, t4VarA, d5.a(), k4.c(), k5.a(), null, s4.a());
    }
}
