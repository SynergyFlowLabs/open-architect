package com.planner5d.library.mesh;

import com.planner5d.library.walls.WallHole;
import com.planner5d.library.walls.WallsBuilder3D;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WallsInfo f180519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WallsInfoWall f180520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final WallsBuilder3D.WallPart f180521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final WallsBuilder3D.WallPart f180522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<WallHole> f180523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.h f180524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.e f180525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f180526h;

    public l(@NotNull WallsInfo info, @NotNull WallsInfoWall wall, @NotNull WallsBuilder3D.WallPart part, @Nullable WallsBuilder3D.WallPart wallPart, @NotNull List<WallHole> holes, @NotNull com.planner5d.library.math.h tessellator, @NotNull com.planner5d.library.math.e rectanglesMerger, float f10) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(holes, "holes");
        Intrinsics.checkNotNullParameter(tessellator, "tessellator");
        Intrinsics.checkNotNullParameter(rectanglesMerger, "rectanglesMerger");
        this.f180519a = info;
        this.f180520b = wall;
        this.f180521c = part;
        this.f180522d = wallPart;
        this.f180523e = holes;
        this.f180524f = tessellator;
        this.f180525g = rectanglesMerger;
        this.f180526h = f10;
    }

    @Override // com.planner5d.library.mesh.f
    public void a(@NotNull e mesh) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        new WallsBuilder3D(this.f180519a, this.f180520b, this.f180521c, this.f180522d, 1.0f, this.f180523e, this.f180524f, this.f180525g, new m(mesh), this.f180526h).build();
    }

    public /* synthetic */ l(WallsInfo wallsInfo, WallsInfoWall wallsInfoWall, WallsBuilder3D.WallPart wallPart, WallsBuilder3D.WallPart wallPart2, List list, com.planner5d.library.math.h hVar, com.planner5d.library.math.e eVar, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(wallsInfo, wallsInfoWall, wallPart, wallPart2, list, hVar, eVar, (i10 & 128) != 0 ? 0.0f : f10);
    }
}
