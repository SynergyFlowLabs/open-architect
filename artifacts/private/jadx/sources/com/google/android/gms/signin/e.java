package com.google.android.gms.signin;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a.g f110925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a0
    public static final com.google.android.gms.common.api.a.g f110926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a.AbstractC0967a f110927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final com.google.android.gms.common.api.a.AbstractC0967a f110928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Scope f110929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Scope f110930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f110931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f110932h;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f110925a = gVar;
        com.google.android.gms.common.api.a.g gVar2 = new com.google.android.gms.common.api.a.g();
        f110926b = gVar2;
        b bVar = new b();
        f110927c = bVar;
        c cVar = new c();
        f110928d = cVar;
        f110929e = new Scope("profile");
        f110930f = new Scope("email");
        f110931g = new com.google.android.gms.common.api.a("SignIn.API", bVar, gVar);
        f110932h = new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
