package com.planner5d.library.widget.editor.editor3d.controller.navigation;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class g extends c implements k.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f255509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f255510f;

    public g(j jVar, Context context) {
        super(jVar);
        this.f255509e = 0.0f;
        this.f255510f = new k(context, this);
    }

    private void n(float f10, float f11) {
        this.f255482b.v(new com.planner5d.library.math.k(f10, f11).R(0.01f));
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.k.a
    public void a(float f10, float f11) {
        this.f255482b.r(f10, f11);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.k.a
    public void b(float f10) {
        j jVar = this.f255482b;
        jVar.A(jVar.f() / ((gc.d.d(f10 - this.f255509e) * 1.5f) + 1.0f));
        this.f255509e = f10;
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void d(boolean z10, int i10) {
        this.f255509e = 0.0f;
        this.f255510f.a();
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void f(float f10, int i10) {
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void i(float f10, double d10, double d11) {
        n((float) d10, (float) d11);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void j(com.planner5d.library.math.k kVar, com.planner5d.library.math.k kVar2, com.planner5d.library.math.k kVar3, com.planner5d.library.math.k kVar4) {
        this.f255510f.c(kVar, kVar2, kVar3, kVar4);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void k(float f10, @NonNull com.planner5d.library.engine.g gVar) {
        this.f255482b.F(gVar, f10);
    }

    @Override // com.planner5d.library.widget.editor.editor3d.controller.navigation.c
    public void l(float f10, float f11) {
        this.f255482b.D(f10, f11);
    }
}
