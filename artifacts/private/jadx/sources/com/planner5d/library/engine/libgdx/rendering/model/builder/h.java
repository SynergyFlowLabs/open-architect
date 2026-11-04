package com.planner5d.library.engine.libgdx.rendering.model.builder;

import android.graphics.Color;
import com.badlogic.gdx.math.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class h extends a implements dc.i<com.planner5d.library.engine.libgdx.rendering.model.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.engine.util.math.b f160916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.badlogic.gdx.graphics.g3d.d f160917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final d0 f160918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final d0 f160919e;

    public h(@NotNull com.planner5d.library.engine.util.math.b bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f160917c = new com.badlogic.gdx.graphics.g3d.d();
        d0 d0Var = new d0();
        this.f160918d = d0Var;
        d0 d0Var2 = new d0();
        this.f160919e = d0Var2;
        this.f160916b = bounds;
        d0Var.y0(bounds.z(), bounds.w(), bounds.u());
        d0Var2.y0(bounds.j(), bounds.k(), bounds.l());
    }

    private final void v(float f10, float f11, float f12, float f13, float f14, com.badlogic.gdx.graphics.g3d.utils.g gVar) {
        gVar.r(f10, f14, f11, f12, f14, f11);
        gVar.r(f12, f14, f11, f12, f14, f13);
        gVar.r(f12, f14, f13, f10, f14, f13);
        gVar.r(f10, f14, f11, f10, f14, f13);
    }

    private final void w(float f10, float f11, float f12, float f13, float f14, float f15, com.badlogic.gdx.graphics.g3d.utils.g gVar) {
        gVar.r(f10, f11, f12, f10, f14, f12);
        gVar.r(f13, f11, f15, f13, f14, f15);
        gVar.r(f13, f11, f12, f13, f14, f12);
        gVar.r(f10, f11, f15, f10, f14, f15);
    }

    @Override // dc.i
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.model.d e(@NotNull com.planner5d.library.engine.a application, int i10) {
        Intrinsics.checkNotNullParameter(application, "application");
        f(application);
        com.badlogic.gdx.graphics.g3d.utils.h hVarS = s();
        Intrinsics.checkNotNull(hVarS);
        com.badlogic.gdx.graphics.g3d.utils.g gVarH = hVarS.H("selection", 1, 3L, x());
        Intrinsics.checkNotNull(gVarH);
        y(gVarH, i10);
        d0 d0Var = this.f160918d;
        float f10 = 2;
        float f11 = (d0Var.f180482a / f10) + 0.01f;
        float f12 = (d0Var.f180484c / f10) + 0.01f;
        float f13 = (d0Var.f180483b / f10) + 0.01f;
        d0 d0Var2 = this.f160919e;
        float f14 = d0Var2.f180482a;
        float f15 = d0Var2.f180483b;
        float f16 = d0Var2.f180484c;
        w(f14 - f11, f15 - f13, f16 - f12, f14 + f11, f15 + f13, f16 + f12, gVarH);
        d0 d0Var3 = this.f160919e;
        float f17 = d0Var3.f180482a;
        float f18 = d0Var3.f180484c;
        v(f17 - f11, f18 - f12, f17 + f11, f18 + f12, d0Var3.f180483b - f13, gVarH);
        d0 d0Var4 = this.f160919e;
        float f19 = d0Var4.f180482a;
        float f20 = d0Var4.f180484c;
        v(f19 - f11, f20 - f12, f19 + f11, f20 + f12, d0Var4.f180483b + f13, gVarH);
        com.planner5d.library.engine.libgdx.rendering.model.d dVarQ = q();
        Intrinsics.checkNotNull(dVarQ);
        return dVarQ;
    }

    @NotNull
    protected com.badlogic.gdx.graphics.g3d.d x() {
        return this.f160917c;
    }

    protected void y(@NotNull com.badlogic.gdx.graphics.g3d.utils.g partBuilder, int i10) {
        Intrinsics.checkNotNullParameter(partBuilder, "partBuilder");
        partBuilder.w(Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f, Color.alpha(i10) / 255.0f);
    }
}
