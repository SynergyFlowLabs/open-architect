package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
class n implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f123249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.tasks.l<p> f123250b;

    public n(u uVar, com.google.android.gms.tasks.l<p> lVar) {
        this.f123249a = uVar;
        this.f123250b = lVar;
    }

    @Override // com.google.firebase.installations.t
    public boolean a(Exception exc) {
        this.f123250b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.t
    public boolean b(com.google.firebase.installations.local.d dVar) {
        if (!dVar.k() || this.f123249a.f(dVar)) {
            return false;
        }
        this.f123250b.c(p.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
