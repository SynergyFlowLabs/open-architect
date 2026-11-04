package com.planner5d.library.walls;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WallHole {

    @f
    public final float height;

    @f
    @NotNull
    public final float[] polygon2D;

    @f
    public final float zFloor;

    @f
    public final float zInFloor;
    private final float zInProject;

    public WallHole(@NotNull float[] polygon2D, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(polygon2D, "polygon2D");
        this.polygon2D = polygon2D;
        this.zInFloor = f10;
        this.height = f11;
        this.zFloor = f12;
        this.zInProject = f12 + f10;
    }

    public final float getZInProject() {
        return this.zInProject;
    }

    @NotNull
    public String toString() {
        return "WallHole(vertices=[" + ArraysKt.joinToString$default(this.polygon2D, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + "], zInFloor=" + this.zInFloor + ", height=" + this.height + ", zFloor=" + this.zFloor + ", zInProject=" + this.zInProject + ')';
    }
}
