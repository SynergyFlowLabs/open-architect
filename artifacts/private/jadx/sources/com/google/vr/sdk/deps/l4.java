package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class l4 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s4[] f129477a;

    l4(s4... s4VarArr) {
        this.f129477a = s4VarArr;
    }

    @Override // com.google.vr.sdk.deps.s4
    public final boolean a(Class<?> cls) {
        for (s4 s4Var : this.f129477a) {
            if (s4Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.vr.sdk.deps.s4
    public final r4 b(Class<?> cls) {
        for (s4 s4Var : this.f129477a) {
            if (s4Var.a(cls)) {
                return s4Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
