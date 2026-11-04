package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class f0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e5 f108404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f108405b;

    public f0(e5 e5Var, String str) {
        this.f108404a = e5Var;
        this.f108405b = str;
    }

    @Override // com.google.android.gms.internal.measurement.g0
    public final e5 a(p pVar) {
        e5 e5VarC = this.f108404a.c();
        e5VarC.f(this.f108405b, pVar);
        return e5VarC;
    }
}
