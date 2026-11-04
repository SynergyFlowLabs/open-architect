package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes5.dex */
final class b0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0.a f121520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0.c f121521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0.b f121522c;

    b0(g0.a aVar, g0.c cVar, g0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f121520a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f121521b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f121522c = bVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    public g0.a a() {
        return this.f121520a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    public g0.b c() {
        return this.f121522c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0
    public g0.c d() {
        return this.f121521b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f121520a.equals(g0Var.a()) && this.f121521b.equals(g0Var.d()) && this.f121522c.equals(g0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f121522c.hashCode() ^ ((((this.f121520a.hashCode() ^ 1000003) * 1000003) ^ this.f121521b.hashCode()) * 1000003);
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f121520a + ", osData=" + this.f121521b + ", deviceData=" + this.f121522c + "}";
    }
}
