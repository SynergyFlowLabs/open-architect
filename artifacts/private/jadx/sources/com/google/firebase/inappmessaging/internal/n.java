package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@gj.d
@ij.f
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f122867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Application f122868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.internal.time.a f122869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.h
    private com.google.internal.firebase.inappmessaging.v1.sdkserving.i f122870d;

    @ij.a
    n(@w8.d y2 y2Var, Application application, com.google.firebase.inappmessaging.internal.time.a aVar) {
        this.f122867a = y2Var;
        this.f122868b = application;
        this.f122869c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(com.google.internal.firebase.inappmessaging.v1.sdkserving.i iVar) {
        long jMa = iVar.ma();
        long jA = this.f122869c.a();
        File file = new File(this.f122868b.getApplicationContext().getFilesDir(), com.google.firebase.inappmessaging.internal.injection.modules.h0.f122767a);
        if (jMa != 0) {
            return jA < jMa;
        }
        return !file.exists() || jA < file.lastModified() + TimeUnit.DAYS.toMillis(1L);
    }

    public io.reactivex.s<com.google.internal.firebase.inappmessaging.v1.sdkserving.i> f() {
        return io.reactivex.s.n0(new Callable() { // from class: com.google.firebase.inappmessaging.internal.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f122814a.f122870d;
            }
        }).v1(this.f122867a.c(com.google.internal.firebase.inappmessaging.v1.sdkserving.i.Fm()).W(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.k
            @Override // dj.g
            public final void accept(Object obj) {
                this.f122820a.f122870d = (com.google.internal.firebase.inappmessaging.v1.sdkserving.i) obj;
            }
        })).b0(new dj.r() { // from class: com.google.firebase.inappmessaging.internal.l
            @Override // dj.r
            public final boolean test(Object obj) {
                return this.f122825a.g((com.google.internal.firebase.inappmessaging.v1.sdkserving.i) obj);
            }
        }).T(new dj.g() { // from class: com.google.firebase.inappmessaging.internal.m
            @Override // dj.g
            public final void accept(Object obj) {
                this.f122845a.f122870d = null;
            }
        });
    }

    public io.reactivex.c h(final com.google.internal.firebase.inappmessaging.v1.sdkserving.i iVar) {
        return this.f122867a.d(iVar).J(new dj.a() { // from class: com.google.firebase.inappmessaging.internal.i
            @Override // dj.a
            public final void run() {
                this.f122648a.f122870d = iVar;
            }
        });
    }
}
