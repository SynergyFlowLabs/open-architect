package com.planner5d.library.walls;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WallSimple implements Wall {

    @NotNull
    private final k end;
    private final float height;
    private final boolean hidden;

    @NotNull
    private final k origin;

    @NotNull
    private final k start;
    private final float thickness;

    public WallSimple(@NotNull k start, @NotNull k end, float f10, float f11, boolean z10, @NotNull k origin) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.start = start;
        this.end = end;
        this.thickness = f10;
        this.height = f11;
        this.hidden = z10;
        this.origin = origin;
    }

    @Override // com.planner5d.library.walls.Wall
    public float getHeight() {
        return this.height;
    }

    @Override // com.planner5d.library.walls.Wall
    public int getMinimumWidth() {
        return 5;
    }

    @Override // com.planner5d.library.walls.Wall
    @NotNull
    public k getOrigin(@NotNull k origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return origin.V(this.origin);
    }

    @Override // com.planner5d.library.walls.Wall
    @NotNull
    public k getPoint(@NotNull k vector, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return vector.V(z11 ? this.start : this.end);
    }

    @Override // com.planner5d.library.walls.Wall
    public float getWidth() {
        return this.thickness;
    }

    @Override // com.planner5d.library.walls.Wall
    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.planner5d.library.walls.Wall
    public boolean isZero() {
        return Intrinsics.areEqual(this.start, this.end);
    }

    @NotNull
    public String toString() {
        return "WallSimple(w=" + this.thickness + " h=" + this.height + " hidden=" + this.hidden + " start=" + this.start + " end=" + this.end + " origin=" + this.origin + ')';
    }

    @NotNull
    public final Wall toWall() {
        return this;
    }

    public /* synthetic */ WallSimple(k kVar, k kVar2, float f10, float f11, boolean z10, k kVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, kVar2, (i10 & 4) != 0 ? 10.0f : f10, (i10 & 8) != 0 ? 270.0f : f11, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? new k(0.0f, 0.0f) : kVar3);
    }
}
