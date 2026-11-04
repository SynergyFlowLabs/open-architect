package com.planner5d.library.engine.libgdx.rendering.model.builder;

import com.badlogic.gdx.math.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends a implements dc.j<com.planner5d.library.engine.libgdx.rendering.model.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f160920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.badlogic.gdx.graphics.g3d.d f160921c;

    public i(@NotNull com.planner5d.library.math.k size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f160920b = size;
        this.f160921c = new com.badlogic.gdx.graphics.g3d.d(2.0f, true);
    }

    private final com.badlogic.gdx.graphics.g3d.utils.g v(String str, d0 d0Var, d0 d0Var2, float f10, float f11, float f12) {
        com.badlogic.gdx.graphics.g3d.utils.h hVarS = s();
        Intrinsics.checkNotNull(hVarS);
        hVarS.C().f94440a = str;
        com.badlogic.gdx.graphics.g3d.utils.h hVarS2 = s();
        Intrinsics.checkNotNull(hVarS2);
        com.badlogic.gdx.graphics.g3d.utils.g gVarH = hVarS2.H(str, 1, 3L, this.f160921c);
        gVarH.w(f10, f11, f12, 0.75f);
        gVarH.d0(d0Var, d0Var2);
        return gVarH;
    }

    @Override // dc.j
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.model.d a(@NotNull com.planner5d.library.engine.a application) {
        Intrinsics.checkNotNullParameter(application, "application");
        f(application);
        d0[] d0VarArr = {new d0(), new d0()};
        d0 d0VarY0 = d0VarArr[0].y0(0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(d0VarY0, "set(...)");
        d0 d0VarY1 = d0VarArr[1].y0(this.f160920b.f180480a, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(d0VarY1, "set(...)");
        v("axisX", d0VarY0, d0VarY1, 1.0f, 0.0f, 0.0f);
        d0 d0VarY2 = d0VarArr[0].y0(0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(d0VarY2, "set(...)");
        d0 d0VarY3 = d0VarArr[1].y0(0.0f, this.f160920b.f180481b, 0.0f);
        Intrinsics.checkNotNullExpressionValue(d0VarY3, "set(...)");
        v("axisY", d0VarY2, d0VarY3, 0.0f, 1.0f, 0.0f);
        d0 d0VarY4 = d0VarArr[0].y0(0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(d0VarY4, "set(...)");
        d0 d0VarY5 = d0VarArr[1].y0(0.0f, 0.0f, this.f160920b.f180481b);
        Intrinsics.checkNotNullExpressionValue(d0VarY5, "set(...)");
        v("axisZ", d0VarY4, d0VarY5, 0.0f, 0.0f, 1.0f);
        com.planner5d.library.engine.libgdx.rendering.model.d dVarQ = q();
        Intrinsics.checkNotNull(dVarQ);
        return dVarQ;
    }
}
