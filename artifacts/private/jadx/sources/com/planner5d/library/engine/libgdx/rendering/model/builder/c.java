package com.planner5d.library.engine.libgdx.rendering.model.builder;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends a implements dc.a<com.planner5d.library.engine.libgdx.rendering.model.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f160908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f160909c;

    public c(boolean z10, @NotNull com.planner5d.library.math.k size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f160908b = z10;
        this.f160909c = size;
    }

    @Override // dc.a
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.model.d m(@NotNull bc.b material, @NotNull com.planner5d.library.engine.a application) {
        Intrinsics.checkNotNullParameter(material, "material");
        Intrinsics.checkNotNullParameter(application, "application");
        f(application);
        if (!this.f160908b && (material instanceof com.badlogic.gdx.graphics.g3d.d)) {
            ((com.badlogic.gdx.graphics.g3d.d) material).h2(new com.badlogic.gdx.graphics.g3d.attributes.a(770, 771));
        }
        com.badlogic.gdx.graphics.g3d.utils.h hVarS = s();
        Intrinsics.checkNotNull(hVarS);
        com.badlogic.gdx.graphics.g3d.utils.g gVarH = hVarS.H(this.f160908b ? "earth" : "grid", 4, 25L, (com.badlogic.gdx.graphics.g3d.d) material);
        com.badlogic.gdx.graphics.g3d.utils.g.a aVarJ = new com.badlogic.gdx.graphics.g3d.utils.g.a().h(0.0f, 0.0f, 0.0f).j(0.0f, 0.0f);
        com.badlogic.gdx.graphics.g3d.utils.g.a aVarJ2 = new com.badlogic.gdx.graphics.g3d.utils.g.a().h(0.0f, 0.0f, this.f160909c.f180481b).j(0.0f, this.f160909c.f180481b);
        com.badlogic.gdx.graphics.g3d.utils.g.a aVar = new com.badlogic.gdx.graphics.g3d.utils.g.a();
        com.planner5d.library.math.k kVar = this.f160909c;
        com.badlogic.gdx.graphics.g3d.utils.g.a aVarH = aVar.h(kVar.f180480a, 0.0f, kVar.f180481b);
        com.planner5d.library.math.k kVar2 = this.f160909c;
        com.badlogic.gdx.graphics.g3d.utils.g.a[] aVarArr = {aVarJ, aVarJ2, aVarH.j(kVar2.f180480a, kVar2.f180481b), new com.badlogic.gdx.graphics.g3d.utils.g.a().h(this.f160909c.f180480a, 0.0f, 0.0f).j(this.f160909c.f180480a, 0.0f)};
        for (int i10 = 0; i10 < 4; i10++) {
            aVarArr[i10].f(0.0f, 1.0f, 0.0f);
        }
        gVarH.m0(aVarArr[0], aVarArr[1], aVarArr[2], aVarArr[3]);
        com.planner5d.library.engine.libgdx.rendering.model.d dVarG = g(new com.planner5d.library.engine.libgdx.rendering.util.a(0.0f, this.f160908b ? 0 : 7));
        Intrinsics.checkNotNull(dVarG);
        return dVarG;
    }
}
