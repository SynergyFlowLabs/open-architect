package com.planner5d.library.math;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final m f180485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final m f180486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final k f180487c;

    public n() {
        this.f180485a = new m(0.0f, 0.0f, 0.0f, 7, null);
        this.f180486b = new m(0.0f, 1.0f, 0.0f);
        this.f180487c = new k();
    }

    @NotNull
    public final n a(float f10, float f11, float f12) {
        this.f180486b.y0(f10, f11, f12);
        return this;
    }

    @NotNull
    public final n b(@NotNull m nor) {
        Intrinsics.checkNotNullParameter(nor, "nor");
        this.f180486b.A0(nor);
        return this;
    }

    @NotNull
    public final n c(float f10, float f11, float f12) {
        this.f180485a.y0(f10, f11, f12);
        return this;
    }

    @NotNull
    public final n d(@NotNull m pos) {
        Intrinsics.checkNotNullParameter(pos, "pos");
        this.f180485a.A0(pos);
        return this;
    }

    @NotNull
    public final n e(float f10, float f11) {
        this.f180487c.U(f10, f11);
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@NotNull m position, @NotNull m normal, @NotNull k uv) {
        this();
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(normal, "normal");
        Intrinsics.checkNotNullParameter(uv, "uv");
        this.f180485a.A0(position);
        this.f180486b.A0(normal);
        this.f180487c.V(uv);
    }
}
