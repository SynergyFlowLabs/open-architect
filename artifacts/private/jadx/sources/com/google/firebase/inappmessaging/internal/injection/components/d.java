package com.google.firebase.inappmessaging.internal.injection.components;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.a1;
import com.google.firebase.inappmessaging.internal.injection.modules.e0;
import com.google.firebase.inappmessaging.internal.injection.modules.h0;
import com.google.firebase.inappmessaging.internal.injection.modules.k;
import com.google.firebase.inappmessaging.internal.injection.modules.l0;
import com.google.firebase.inappmessaging.internal.injection.modules.n;
import com.google.firebase.inappmessaging.internal.injection.modules.n0;
import com.google.firebase.inappmessaging.internal.injection.modules.q;
import com.google.firebase.inappmessaging.internal.injection.modules.r0;
import com.google.firebase.inappmessaging.internal.injection.modules.u;
import com.google.firebase.inappmessaging.internal.injection.modules.w;
import com.google.firebase.inappmessaging.internal.o3;
import com.google.firebase.inappmessaging.internal.q3;
import com.google.firebase.inappmessaging.internal.v2;
import com.google.firebase.inappmessaging.internal.z2;
import com.google.firebase.inappmessaging.model.m;
import ij.f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@f
@q8.b(modules = {w.class, n0.class, n.class, u.class, e0.class, com.google.firebase.inappmessaging.internal.injection.modules.a.class, h0.class, r0.class, l0.class, k.class, q.class})
public interface d {
    @w8.c
    m a();

    o3 b();

    @w8.f
    v2 c();

    m8.d d();

    com.google.firebase.inappmessaging.internal.w e();

    q3 f();

    com.google.firebase.inappmessaging.internal.n g();

    @d8.c
    Executor h();

    com.google.firebase.inappmessaging.internal.f i();

    a1 j();

    z2 k();

    @w8.c
    io.reactivex.flowables.a<String> l();

    com.google.firebase.inappmessaging.internal.time.a m();

    io.grpc.f n();

    com.google.firebase.inappmessaging.model.k o();

    @w8.b
    io.reactivex.flowables.a<String> p();

    Application q();

    @d8.b
    Executor r();

    @w8.f
    io.reactivex.flowables.a<String> s();

    com.google.firebase.analytics.connector.a t();
}
