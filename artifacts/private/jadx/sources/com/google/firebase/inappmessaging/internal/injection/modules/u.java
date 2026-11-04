package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class u {
    @q8.e
    @w8.c
    @ij.f
    public io.reactivex.flowables.a<String> a(Application application) {
        com.google.firebase.inappmessaging.internal.o0 o0Var = new com.google.firebase.inappmessaging.internal.o0();
        io.reactivex.flowables.a<String> aVarB = o0Var.b();
        aVarB.P8();
        application.registerActivityLifecycleCallbacks(o0Var);
        return aVarB;
    }
}
