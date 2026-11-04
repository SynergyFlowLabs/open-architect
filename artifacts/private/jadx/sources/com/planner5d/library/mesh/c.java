package com.planner5d.library.mesh;

import com.planner5d.library.walls.WallsInfoWall;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WallsInfoWall f180494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f180495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f180496c;

    public c(@NotNull WallsInfoWall wallInfo, float f10, float f11) {
        Intrinsics.checkNotNullParameter(wallInfo, "wallInfo");
        this.f180494a = wallInfo;
        this.f180495b = f10;
        this.f180496c = f11;
    }

    public static /* synthetic */ c e(c cVar, WallsInfoWall wallsInfoWall, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wallsInfoWall = cVar.f180494a;
        }
        if ((i10 & 2) != 0) {
            f10 = cVar.f180495b;
        }
        if ((i10 & 4) != 0) {
            f11 = cVar.f180496c;
        }
        return cVar.d(wallsInfoWall, f10, f11);
    }

    @NotNull
    public final WallsInfoWall a() {
        return this.f180494a;
    }

    public final float b() {
        return this.f180495b;
    }

    public final float c() {
        return this.f180496c;
    }

    @NotNull
    public final c d(@NotNull WallsInfoWall wallInfo, float f10, float f11) {
        Intrinsics.checkNotNullParameter(wallInfo, "wallInfo");
        return new c(wallInfo, f10, f11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f180494a, cVar.f180494a) && Intrinsics.areEqual((Object) Float.valueOf(this.f180495b), (Object) Float.valueOf(cVar.f180495b)) && Intrinsics.areEqual((Object) Float.valueOf(this.f180496c), (Object) Float.valueOf(cVar.f180496c));
    }

    public final float f() {
        return this.f180495b;
    }

    public final float g() {
        return this.f180496c;
    }

    @NotNull
    public final WallsInfoWall h() {
        return this.f180494a;
    }

    public int hashCode() {
        return (((this.f180494a.hashCode() * 31) + Float.hashCode(this.f180495b)) * 31) + Float.hashCode(this.f180496c);
    }

    @NotNull
    public String toString() {
        return "BuildRequestFlooringWall(wallInfo=" + this.f180494a + ", floorZ=" + this.f180495b + ", flooringHeight=" + this.f180496c + ')';
    }
}
