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
public final class d implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WallsInfo f180497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WallsInfoWall f180498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<WallHole> f180499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final WallsBuilder3D.WallPart f180500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final WallsBuilder3D.WallPart f180501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f180502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @Nullable
    protected final com.planner5d.library.math.k f180503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    public final boolean f180504h;

    public d(@NotNull WallsInfo info, @NotNull WallsInfoWall wall, @NotNull List<WallHole> holes, @NotNull WallsBuilder3D.WallPart part, @Nullable WallsBuilder3D.WallPart wallPart, float f10) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(holes, "holes");
        Intrinsics.checkNotNullParameter(part, "part");
        this.f180497a = info;
        this.f180498b = wall;
        this.f180499c = holes;
        this.f180500d = part;
        this.f180501e = wallPart;
        this.f180502f = f10;
        com.planner5d.library.math.k origin = info.getOrigin();
        this.f180503g = origin;
        this.f180504h = info.getHeight() <= 0.0f || wall.getWall().isHidden() || origin == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d h(d dVar, WallsInfo wallsInfo, WallsInfoWall wallsInfoWall, List list, WallsBuilder3D.WallPart wallPart, WallsBuilder3D.WallPart wallPart2, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wallsInfo = dVar.f180497a;
        }
        if ((i10 & 2) != 0) {
            wallsInfoWall = dVar.f180498b;
        }
        if ((i10 & 4) != 0) {
            list = dVar.f180499c;
        }
        if ((i10 & 8) != 0) {
            wallPart = dVar.f180500d;
        }
        if ((i10 & 16) != 0) {
            wallPart2 = dVar.f180501e;
        }
        if ((i10 & 32) != 0) {
            f10 = dVar.f180502f;
        }
        WallsBuilder3D.WallPart wallPart3 = wallPart2;
        float f11 = f10;
        return dVar.g(wallsInfo, wallsInfoWall, list, wallPart, wallPart3, f11);
    }

    @NotNull
    public final WallsInfo a() {
        return this.f180497a;
    }

    @NotNull
    public final WallsInfoWall b() {
        return this.f180498b;
    }

    @NotNull
    public final List<WallHole> c() {
        return this.f180499c;
    }

    @NotNull
    public final WallsBuilder3D.WallPart d() {
        return this.f180500d;
    }

    @Nullable
    public final WallsBuilder3D.WallPart e() {
        return this.f180501e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f180497a, dVar.f180497a) && Intrinsics.areEqual(this.f180498b, dVar.f180498b) && Intrinsics.areEqual(this.f180499c, dVar.f180499c) && this.f180500d == dVar.f180500d && this.f180501e == dVar.f180501e && Intrinsics.areEqual((Object) Float.valueOf(this.f180502f), (Object) Float.valueOf(dVar.f180502f));
    }

    public final float f() {
        return this.f180502f;
    }

    @NotNull
    public final d g(@NotNull WallsInfo info, @NotNull WallsInfoWall wall, @NotNull List<WallHole> holes, @NotNull WallsBuilder3D.WallPart part, @Nullable WallsBuilder3D.WallPart wallPart, float f10) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(holes, "holes");
        Intrinsics.checkNotNullParameter(part, "part");
        return new d(info, wall, holes, part, wallPart, f10);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f180497a.hashCode() * 31) + this.f180498b.hashCode()) * 31) + this.f180499c.hashCode()) * 31) + this.f180500d.hashCode()) * 31;
        WallsBuilder3D.WallPart wallPart = this.f180501e;
        return ((iHashCode + (wallPart == null ? 0 : wallPart.hashCode())) * 31) + Float.hashCode(this.f180502f);
    }

    public final float i() {
        return this.f180502f;
    }

    @NotNull
    public final List<WallHole> j() {
        return this.f180499c;
    }

    @NotNull
    public final WallsInfo k() {
        return this.f180497a;
    }

    @NotNull
    public final WallsBuilder3D.WallPart l() {
        return this.f180500d;
    }

    @Nullable
    public final WallsBuilder3D.WallPart m() {
        return this.f180501e;
    }

    @NotNull
    public final WallsInfoWall n() {
        return this.f180498b;
    }

    @NotNull
    public String toString() {
        return "BuildRequestWall(info=" + this.f180497a + ", wall=" + this.f180498b + ", holes=" + this.f180499c + ", part=" + this.f180500d + ", partCloseTop=" + this.f180501e + ", flooringHeight=" + this.f180502f + ')';
    }

    public /* synthetic */ d(WallsInfo wallsInfo, WallsInfoWall wallsInfoWall, List list, WallsBuilder3D.WallPart wallPart, WallsBuilder3D.WallPart wallPart2, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(wallsInfo, wallsInfoWall, list, wallPart, wallPart2, (i10 & 32) != 0 ? 0.0f : f10);
    }
}
