package com.google.firebase.inappmessaging.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f122907c = "firebase_inapp_messaging_auto_data_collection_enabled";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f122908d = "auto_init";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s3 f122909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f122910b;

    @ij.a
    public q(com.google.firebase.h hVar, s3 s3Var, m8.d dVar) {
        this.f122909a = s3Var;
        this.f122910b = new AtomicBoolean(hVar.A());
        dVar.d(com.google.firebase.c.class, new m8.b() { // from class: com.google.firebase.inappmessaging.internal.p
            @Override // m8.b
            public final void a(m8.a aVar) {
                q.a(this.f122902a, aVar);
            }
        });
    }

    public static /* synthetic */ void a(q qVar, m8.a aVar) {
        qVar.getClass();
        qVar.f122910b.set(((com.google.firebase.c) aVar.a()).f120739a);
    }

    private boolean c() {
        return this.f122909a.e(f122907c);
    }

    private boolean d() {
        return this.f122909a.f(f122908d);
    }

    private boolean e() {
        return this.f122909a.d(f122908d, true);
    }

    public boolean b() {
        if (d()) {
            return this.f122909a.d(f122908d, true);
        }
        return c() ? this.f122909a.c(f122907c, true) : this.f122910b.get();
    }

    public void f(Boolean bool) {
        if (bool == null) {
            this.f122909a.a(f122908d);
        } else {
            this.f122909a.g(f122908d, Boolean.TRUE.equals(bool));
        }
    }

    public void g(boolean z10) {
        this.f122909a.g(f122908d, z10);
    }
}
