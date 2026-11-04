package com.planner5d.library.engine.libgdx.rendering.model.builder;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends com.planner5d.library.engine.libgdx.rendering.model.builder.a implements dc.g<com.planner5d.library.engine.libgdx.rendering.model.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.badlogic.gdx.graphics.g3d.utils.g.a[] f160913b = {new com.badlogic.gdx.graphics.g3d.utils.g.a(), new com.badlogic.gdx.graphics.g3d.utils.g.a(), new com.badlogic.gdx.graphics.g3d.utils.g.a(), new com.badlogic.gdx.graphics.g3d.utils.g.a()};

    public static final class a implements dc.h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, bc.b> f160915b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Integer, ? extends bc.b> function1) {
            this.f160915b = function1;
        }

        @Override // dc.h
        public void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32, int i10, String str) {
            g.this.f160913b[0].h(f10, f11, f12).f(f30, f31, f32).j(f13, f14);
            g.this.f160913b[1].h(f15, f16, f17).f(f30, f31, f32).j(f18, f19);
            g.this.f160913b[2].h(f20, f21, f22).f(f30, f31, f32).j(f23, f24);
            g.this.f160913b[3].h(f25, f26, f27).f(f30, f31, f32).j(f28, f29);
            com.badlogic.gdx.graphics.g3d.utils.h hVarS = g.this.s();
            if (hVarS != null) {
                bc.b bVarInvoke = this.f160915b.invoke(Integer.valueOf(i10));
                Intrinsics.checkNotNull(bVarInvoke, "null cannot be cast to non-null type com.badlogic.gdx.graphics.g3d.Material");
                com.badlogic.gdx.graphics.g3d.utils.g gVarH = hVarS.H(str, 4, 25L, (com.badlogic.gdx.graphics.g3d.d) bVarInvoke);
                if (gVarH != null) {
                    gVarH.m0(g.this.f160913b[0], g.this.f160913b[1], g.this.f160913b[2], g.this.f160913b[3]);
                }
            }
        }
    }

    @Override // dc.g
    @NotNull
    public dc.h d(@NotNull Function1<? super Integer, ? extends bc.b> materialGetter) {
        Intrinsics.checkNotNullParameter(materialGetter, "materialGetter");
        return new a(materialGetter);
    }
}
