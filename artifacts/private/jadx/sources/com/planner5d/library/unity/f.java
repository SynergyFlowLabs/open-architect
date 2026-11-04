package com.planner5d.library.unity;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f230648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<h> f230649b;

    public f(@NotNull float[] floor, @NotNull List<h> walls) {
        Intrinsics.checkNotNullParameter(floor, "floor");
        Intrinsics.checkNotNullParameter(walls, "walls");
        this.f230648a = floor;
        this.f230649b = walls;
    }

    @NotNull
    public final float[] a() {
        return this.f230648a;
    }

    @NotNull
    public final List<h> b() {
        return this.f230649b;
    }
}
