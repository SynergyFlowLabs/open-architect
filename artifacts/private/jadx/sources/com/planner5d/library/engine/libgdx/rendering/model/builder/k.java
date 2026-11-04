package com.planner5d.library.engine.libgdx.rendering.model.builder;

import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.walls.WallsBuilder3D;
import com.planner5d.library.walls.WallsBuilder3DSide;
import com.planner5d.library.walls.WallsInfoWall;
import dc.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends a implements l<com.planner5d.library.engine.libgdx.rendering.model.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.engine.libgdx.rendering.util.a f160927b;

    public k(@NotNull WallsBuilder3D.WallPart part, @NotNull WallsInfoWall wall) {
        com.planner5d.library.engine.libgdx.rendering.util.a aVar;
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(wall, "wall");
        WallsBuilder3D.WallPart wallPart = WallsBuilder3D.WallPart.SideOutdoor;
        if (part == wallPart || part == WallsBuilder3D.WallPart.SideIndoor) {
            aVar = new com.planner5d.library.engine.libgdx.rendering.util.a(part == wallPart ? wall.getBottom() : wall.getTop(), wall.getWall().getOrigin(new com.planner5d.library.math.k()), part == wallPart ? 1 : 2);
        } else {
            aVar = null;
        }
        this.f160927b = aVar;
    }

    @Override // dc.l
    @NotNull
    public dc.e<com.planner5d.library.engine.libgdx.rendering.model.d> h(@NotNull bc.b material) {
        Intrinsics.checkNotNullParameter(material, "material");
        com.badlogic.gdx.graphics.g3d.utils.h hVarS = s();
        Intrinsics.checkNotNull(hVarS);
        com.badlogic.gdx.graphics.g3d.utils.g gVarH = hVarS.H("side", 4, 25L, (com.badlogic.gdx.graphics.g3d.d) material);
        Intrinsics.checkNotNullExpressionValue(gVarH, "part(...)");
        return new e(gVarH);
    }

    @Override // dc.l
    @NotNull
    public dc.e<com.planner5d.library.engine.libgdx.rendering.model.d> i(boolean z10, @NotNull bc.b material) {
        Intrinsics.checkNotNullParameter(material, "material");
        com.badlogic.gdx.graphics.g3d.utils.h hVarS = s();
        Intrinsics.checkNotNull(hVarS);
        com.badlogic.gdx.graphics.g3d.utils.g gVarH = hVarS.H(z10 ? ItemWall.FIELD_MATERIAL_OUTDOOR : ItemWall.FIELD_MATERIAL_INDOOR, 4, 25L, (com.badlogic.gdx.graphics.g3d.d) material);
        Intrinsics.checkNotNullExpressionValue(gVarH, "part(...)");
        return new e(gVarH);
    }

    @Override // dc.l
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.model.d p() {
        if (s() == null) {
            return null;
        }
        return g(this.f160927b);
    }

    @Override // dc.l
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.libgdx.rendering.model.d j(@NotNull com.planner5d.library.engine.libgdx.rendering.model.d model, @NotNull WallsBuilder3DSide side) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(side, "side");
        return new com.planner5d.library.engine.libgdx.rendering.model.e(model, side);
    }
}
