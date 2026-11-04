package com.planner5d.library.engine.libgdx.rendering.model.builder;

import android.graphics.Color;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends com.planner5d.library.engine.libgdx.rendering.model.builder.a implements dc.k<com.planner5d.library.engine.libgdx.rendering.model.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f160922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f160923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.badlogic.gdx.graphics.g3d.utils.g.a[] f160924d = {new com.badlogic.gdx.graphics.g3d.utils.g.a(), new com.badlogic.gdx.graphics.g3d.utils.g.a(), new com.badlogic.gdx.graphics.g3d.utils.g.a(), new com.badlogic.gdx.graphics.g3d.utils.g.a()};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.badlogic.gdx.graphics.g3d.d f160925e;

    public static final class a implements dc.h {
        a() {
        }

        @Override // dc.h
        public void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32, int i10, String str) {
            j.this.f160924d[0].h(f10, f11 + j.this.x(), f12).f(f30, f31, f32);
            j.this.f160924d[1].h(f15, j.this.x() + f16, f17).f(f30, f31, f32);
            j.this.f160924d[2].h(f20, f21 + j.this.x(), f22).f(f30, f31, f32);
            j.this.f160924d[3].h(f25, f26 + j.this.x(), f27).f(f30, f31, f32);
            com.badlogic.gdx.graphics.g3d.utils.h hVarS = j.this.s();
            Intrinsics.checkNotNull(hVarS);
            hVarS.H(str, 4, 9L, j.this.f160925e).m0(j.this.f160924d[0], j.this.f160924d[1], j.this.f160924d[2], j.this.f160924d[3]);
        }
    }

    public j(int i10, float f10) {
        this.f160922b = i10;
        this.f160923c = f10;
        this.f160925e = new com.badlogic.gdx.graphics.g3d.d(com.badlogic.gdx.graphics.g3d.attributes.b.t(Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f, Color.alpha(i10) / 255.0f), new com.badlogic.gdx.graphics.g3d.attributes.a(770, 771, 0.25f));
    }

    @Override // dc.k
    @NotNull
    public dc.h o() {
        return new a();
    }

    public final int w() {
        return this.f160922b;
    }

    public final float x() {
        return this.f160923c;
    }
}
