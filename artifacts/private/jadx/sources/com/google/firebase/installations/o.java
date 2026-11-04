package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.tasks.l<String> f123251a;

    public o(com.google.android.gms.tasks.l<String> lVar) {
        this.f123251a = lVar;
    }

    @Override // com.google.firebase.installations.t
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.t
    public boolean b(com.google.firebase.installations.local.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f123251a.e(dVar.d());
        return true;
    }
}
