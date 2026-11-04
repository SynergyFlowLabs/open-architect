package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.s3;
import com.google.firebase.inappmessaging.internal.u3;
import com.google.firebase.inappmessaging.internal.z2;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.h f122751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.installations.k f122752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.time.a f122753c;

    public d(com.google.firebase.h hVar, com.google.firebase.installations.k kVar, com.google.firebase.inappmessaging.internal.time.a aVar) {
        this.f122751a = hVar;
        this.f122752b = kVar;
        this.f122753c = aVar;
    }

    @q8.e
    @x8.a
    com.google.firebase.inappmessaging.internal.g a(ij.c<com.google.firebase.inappmessaging.internal.p0> cVar, Application application, z2 z2Var) {
        return new com.google.firebase.inappmessaging.internal.g(cVar, this.f122751a, application, this.f122753c, z2Var);
    }

    @q8.e
    com.google.firebase.inappmessaging.internal.q b(s3 s3Var, m8.d dVar) {
        return new com.google.firebase.inappmessaging.internal.q(this.f122751a, s3Var, dVar);
    }

    @q8.e
    com.google.firebase.h c() {
        return this.f122751a;
    }

    @q8.e
    com.google.firebase.installations.k d() {
        return this.f122752b;
    }

    @q8.e
    s3 e() {
        return new s3(this.f122751a);
    }

    @q8.e
    u3 f(s3 s3Var) {
        return new u3(s3Var);
    }
}
