package com.google.firebase.inappmessaging.display;

import android.app.Application;
import com.google.firebase.inappmessaging.display.dagger.internal.h;
import com.google.firebase.inappmessaging.display.internal.k;
import com.google.firebase.inappmessaging.display.internal.n;
import com.google.firebase.inappmessaging.m;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@com.google.firebase.inappmessaging.display.dagger.internal.b
@com.google.firebase.inappmessaging.display.dagger.internal.g
@h("com.google.firebase.inappmessaging.display.internal.injection.scopes.FirebaseAppScope")
public final class e implements com.google.firebase.inappmessaging.display.dagger.internal.d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<m> f122178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Map<String, ij.c<k>>> f122179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.display.internal.e> f122180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<n> f122181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<n> f122182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.display.internal.g> f122183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<Application> f122184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.display.internal.a> f122185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.google.firebase.inappmessaging.display.internal.c> f122186i;

    public e(ij.c<m> cVar, ij.c<Map<String, ij.c<k>>> cVar2, ij.c<com.google.firebase.inappmessaging.display.internal.e> cVar3, ij.c<n> cVar4, ij.c<n> cVar5, ij.c<com.google.firebase.inappmessaging.display.internal.g> cVar6, ij.c<Application> cVar7, ij.c<com.google.firebase.inappmessaging.display.internal.a> cVar8, ij.c<com.google.firebase.inappmessaging.display.internal.c> cVar9) {
        this.f122178a = cVar;
        this.f122179b = cVar2;
        this.f122180c = cVar3;
        this.f122181d = cVar4;
        this.f122182e = cVar5;
        this.f122183f = cVar6;
        this.f122184g = cVar7;
        this.f122185h = cVar8;
        this.f122186i = cVar9;
    }

    public static e a(ij.c<m> cVar, ij.c<Map<String, ij.c<k>>> cVar2, ij.c<com.google.firebase.inappmessaging.display.internal.e> cVar3, ij.c<n> cVar4, ij.c<n> cVar5, ij.c<com.google.firebase.inappmessaging.display.internal.g> cVar6, ij.c<Application> cVar7, ij.c<com.google.firebase.inappmessaging.display.internal.a> cVar8, ij.c<com.google.firebase.inappmessaging.display.internal.c> cVar9) {
        return new e(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static c c(m mVar, Map<String, ij.c<k>> map, com.google.firebase.inappmessaging.display.internal.e eVar, n nVar, n nVar2, com.google.firebase.inappmessaging.display.internal.g gVar, Application application, com.google.firebase.inappmessaging.display.internal.a aVar, com.google.firebase.inappmessaging.display.internal.c cVar) {
        return new c(mVar, map, eVar, nVar, nVar2, gVar, application, aVar, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f122178a.get(), this.f122179b.get(), this.f122180c.get(), this.f122181d.get(), this.f122182e.get(), this.f122183f.get(), this.f122184g.get(), this.f122185h.get(), this.f122186i.get());
    }
}
