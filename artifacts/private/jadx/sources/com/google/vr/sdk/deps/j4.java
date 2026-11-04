package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class j4 implements l5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s4 f129459b = new k4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s4 f129460a;

    public j4() {
        this(new l4(h3.c(), b()));
    }

    private static s4 b() {
        try {
            return (s4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f129459b;
        }
    }

    private static boolean c(r4 r4Var) {
        return r4Var.y() == e5.f129354a;
    }

    @Override // com.google.vr.sdk.deps.l5
    public final <T> k5<T> a(Class<T> cls) {
        m5.p(cls);
        r4 r4VarB = this.f129460a.b(cls);
        if (r4VarB.b()) {
            return i3.class.isAssignableFrom(cls) ? x4.i(m5.B(), z2.a(), r4VarB.c()) : x4.i(m5.f(), z2.b(), r4VarB.c());
        }
        if (i3.class.isAssignableFrom(cls)) {
            return c(r4VarB) ? w4.j(r4VarB, a5.b(), e4.d(), m5.B(), z2.a(), q4.b()) : w4.j(r4VarB, a5.b(), e4.d(), m5.B(), null, q4.b());
        }
        return c(r4VarB) ? w4.j(r4VarB, a5.a(), e4.a(), m5.f(), z2.b(), q4.a()) : w4.j(r4VarB, a5.a(), e4.a(), m5.v(), null, q4.a());
    }

    private j4(s4 s4Var) {
        this.f129460a = (s4) k3.f(s4Var, "messageInfoFactory");
    }
}
