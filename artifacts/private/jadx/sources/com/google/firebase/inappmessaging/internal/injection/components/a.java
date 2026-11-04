package com.google.firebase.inappmessaging.internal.injection.components;

import com.google.android.datatransport.m;
import com.google.firebase.inappmessaging.internal.injection.modules.v0;
import com.google.firebase.inappmessaging.internal.injection.modules.z;
import com.google.firebase.inappmessaging.internal.x;

/* JADX INFO: loaded from: classes5.dex */
@x8.a
@q8.b(dependencies = {d.class}, modules = {com.google.firebase.inappmessaging.internal.injection.modules.d.class, z.class, v0.class})
public interface a {

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.components.a$a, reason: collision with other inner class name */
    @q8.b.a
    public interface InterfaceC1161a {
        @q8.a
        InterfaceC1161a a(m mVar);

        InterfaceC1161a b(com.google.firebase.inappmessaging.internal.injection.modules.d dVar);

        a build();

        InterfaceC1161a c(d dVar);

        InterfaceC1161a d(z zVar);

        @q8.a
        InterfaceC1161a e(com.google.firebase.inappmessaging.internal.c cVar);
    }

    x a();

    com.google.firebase.inappmessaging.m b();
}
