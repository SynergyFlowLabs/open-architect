package com.planner5d.library.widget.editor.editor3d.controller.navigation;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f255558a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.math.k[] f255559b = {new com.planner5d.library.math.k(), new com.planner5d.library.math.k()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.math.k f255560c = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.planner5d.library.math.k f255561d = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f255562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f255563f;

    interface a {
        void a(float f10, float f11);

        void b(float f10);
    }

    k(Context context, a aVar) {
        this.f255563f = aVar;
        this.f255562e = context.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167087kc);
    }

    private com.planner5d.library.math.k b(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, com.planner5d.library.math.k kVar4, com.planner5d.library.math.k kVar5) {
        com.planner5d.library.math.k kVarR = new com.planner5d.library.math.k(kVar3.f180480a + kVar4.f180480a, kVar.f180480a + kVar2.f180480a).R(0.5f);
        kVar5.f180480a = kVarR.f180480a - kVarR.f180481b;
        kVarR.U(kVar3.f180481b + kVar4.f180481b, kVar.f180481b + kVar2.f180481b).R(0.5f);
        kVar5.f180481b = kVarR.f180480a - kVarR.f180481b;
        return kVar5;
    }

    void a() {
        this.f255558a = null;
    }

    void c(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, com.planner5d.library.math.k kVar4) {
        Boolean boolValueOf = this.f255558a;
        if (boolValueOf == null) {
            if (this.f255560c.V(kVar).c0(kVar3).F() < this.f255562e && this.f255560c.V(kVar2).c0(kVar4).F() < this.f255562e) {
                return;
            }
            this.f255560c.V(kVar).c0(kVar3);
            this.f255561d.V(kVar2).c0(kVar4);
            boolValueOf = Boolean.valueOf(this.f255560c.k(this.f255561d) < 40.0f);
            this.f255558a = boolValueOf;
            this.f255559b[0].V(kVar3);
            this.f255559b[1].V(kVar4);
        }
        if (boolValueOf.booleanValue()) {
            a aVar = this.f255563f;
            float fM = kVar3.m(kVar4);
            com.planner5d.library.math.k[] kVarArr = this.f255559b;
            aVar.b(fM - kVarArr[0].m(kVarArr[1]));
            return;
        }
        com.planner5d.library.math.k[] kVarArr2 = this.f255559b;
        b(kVarArr2[0], kVarArr2[1], kVar3, kVar4, this.f255560c);
        a aVar2 = this.f255563f;
        com.planner5d.library.math.k kVar5 = this.f255560c;
        aVar2.a(kVar5.f180480a, -kVar5.f180481b);
        this.f255559b[0].V(kVar3);
        this.f255559b[1].V(kVar4);
    }
}
