package com.google.firebase.inappmessaging.display.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.display.internal.injection.modules.q;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f122251a;

    @ij.a
    a(Application application) {
        this.f122251a = application;
    }

    public com.google.firebase.inappmessaging.display.internal.bindingwrappers.c a(k kVar, com.google.firebase.inappmessaging.model.i iVar) {
        return com.google.firebase.inappmessaging.display.internal.injection.components.c.a().b(new q(iVar, kVar, this.f122251a)).a().b();
    }

    public com.google.firebase.inappmessaging.display.internal.bindingwrappers.c b(k kVar, com.google.firebase.inappmessaging.model.i iVar) {
        return com.google.firebase.inappmessaging.display.internal.injection.components.c.a().b(new q(iVar, kVar, this.f122251a)).a().c();
    }

    public com.google.firebase.inappmessaging.display.internal.bindingwrappers.c c(k kVar, com.google.firebase.inappmessaging.model.i iVar) {
        return com.google.firebase.inappmessaging.display.internal.injection.components.c.a().b(new q(iVar, kVar, this.f122251a)).a().a();
    }

    public com.google.firebase.inappmessaging.display.internal.bindingwrappers.c d(k kVar, com.google.firebase.inappmessaging.model.i iVar) {
        return com.google.firebase.inappmessaging.display.internal.injection.components.c.a().b(new q(iVar, kVar, this.f122251a)).a().d();
    }
}
