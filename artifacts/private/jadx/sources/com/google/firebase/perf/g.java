package com.google.firebase.perf;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements com.google.firebase.perf.application.a.InterfaceC1177a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f123929a = com.google.firebase.perf.logging.a.e();

    @Override // com.google.firebase.perf.application.a.InterfaceC1177a
    public void a() {
        try {
            e.c();
        } catch (IllegalStateException e10) {
            f123929a.m("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
