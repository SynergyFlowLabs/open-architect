package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class e0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e5 f108375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f108376b;

    public e0(e5 e5Var, String str) {
        this.f108375a = e5Var;
        this.f108376b = str;
    }

    @Override // com.google.android.gms.internal.measurement.g0
    public final e5 a(p pVar) {
        e5 e5VarC = this.f108375a.c();
        e5VarC.g(this.f108376b, pVar);
        return e5VarC;
    }
}
