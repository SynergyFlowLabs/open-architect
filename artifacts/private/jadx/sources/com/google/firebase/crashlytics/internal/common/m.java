package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class m implements com.google.firebase.sessions.api.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f121127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f121128b;

    public m(i0 i0Var, com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f121127a = i0Var;
        this.f121128b = new l(gVar);
    }

    @Override // com.google.firebase.sessions.api.c
    public boolean a() {
        return this.f121127a.d();
    }

    @Override // com.google.firebase.sessions.api.c
    @NonNull
    public com.google.firebase.sessions.api.c.a b() {
        return com.google.firebase.sessions.api.c.a.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.c
    public void c(@NonNull com.google.firebase.sessions.api.c.b bVar) {
        com.google.firebase.crashlytics.internal.g.f().b("App Quality Sessions session changed: " + bVar);
        this.f121128b.f(bVar.d());
    }

    @androidx.annotation.p0
    public String d(@NonNull String str) {
        return this.f121128b.c(str);
    }

    public void e(@androidx.annotation.p0 String str) {
        this.f121128b.g(str);
    }
}
