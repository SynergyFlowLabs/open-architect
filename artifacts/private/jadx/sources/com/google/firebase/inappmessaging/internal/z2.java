package com.google.firebase.inappmessaging.internal;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f123012a;

    @ij.a
    z2(Application application) {
        this.f123012a = application;
    }

    public void a() {
        try {
            com.google.android.gms.security.a.a(this.f123012a);
        } catch (com.google.android.gms.common.h | com.google.android.gms.common.i e10) {
            e10.printStackTrace();
        }
    }
}
