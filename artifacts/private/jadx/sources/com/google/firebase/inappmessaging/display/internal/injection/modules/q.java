package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
@r8.d
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.model.i f122400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.display.internal.k f122401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Application f122402c;

    public q(com.google.firebase.inappmessaging.model.i iVar, com.google.firebase.inappmessaging.display.internal.k kVar, Application application) {
        this.f122400a = iVar;
        this.f122401b = kVar;
        this.f122402c = application;
    }

    @u8.b
    @r8.e
    com.google.firebase.inappmessaging.display.internal.k a() {
        return this.f122401b;
    }

    @r8.e
    com.google.firebase.inappmessaging.model.i b() {
        return this.f122400a;
    }

    @u8.b
    @r8.e
    public LayoutInflater c() {
        return (LayoutInflater) this.f122402c.getSystemService("layout_inflater");
    }
}
