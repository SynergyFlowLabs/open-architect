package com.planner5d.library.engine.rendering.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f165373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Float f165374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j f165375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f165376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f165377e;

    public g(float f10, @Nullable Float f11, @NotNull j tiling, float f12, float f13) {
        Intrinsics.checkNotNullParameter(tiling, "tiling");
        this.f165373a = f10;
        this.f165374b = f11;
        this.f165375c = tiling;
        this.f165376d = f12;
        this.f165377e = f13;
    }

    public static /* synthetic */ g g(g gVar, float f10, Float f11, j jVar, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = gVar.f165373a;
        }
        if ((i10 & 2) != 0) {
            f11 = gVar.f165374b;
        }
        if ((i10 & 4) != 0) {
            jVar = gVar.f165375c;
        }
        if ((i10 & 8) != 0) {
            f12 = gVar.f165376d;
        }
        if ((i10 & 16) != 0) {
            f13 = gVar.f165377e;
        }
        float f14 = f13;
        j jVar2 = jVar;
        return gVar.f(f10, f11, jVar2, f12, f14);
    }

    public final float a() {
        return this.f165373a;
    }

    @Nullable
    public final Float b() {
        return this.f165374b;
    }

    @NotNull
    public final j c() {
        return this.f165375c;
    }

    public final float d() {
        return this.f165376d;
    }

    public final float e() {
        return this.f165377e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f165373a, gVar.f165373a) == 0 && Intrinsics.areEqual((Object) this.f165374b, (Object) gVar.f165374b) && Intrinsics.areEqual(this.f165375c, gVar.f165375c) && Float.compare(this.f165376d, gVar.f165376d) == 0 && Float.compare(this.f165377e, gVar.f165377e) == 0;
    }

    @NotNull
    public final g f(float f10, @Nullable Float f11, @NotNull j tiling, float f12, float f13) {
        Intrinsics.checkNotNullParameter(tiling, "tiling");
        return new g(f10, f11, tiling, f12, f13);
    }

    public final float h() {
        return this.f165376d;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.f165373a) * 31;
        Float f10 = this.f165374b;
        return ((((((iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31) + this.f165375c.hashCode()) * 31) + Float.hashCode(this.f165376d)) * 31) + Float.hashCode(this.f165377e);
    }

    @Nullable
    public final Float i() {
        return this.f165374b;
    }

    public final float j() {
        return this.f165373a;
    }

    @NotNull
    public final j k() {
        return this.f165375c;
    }

    public final float l() {
        return this.f165377e;
    }

    @NotNull
    public String toString() {
        return "TextureAttributes(scale=" + this.f165373a + ", rotate=" + this.f165374b + ", tiling=" + this.f165375c + ", horizontalOffset=" + this.f165376d + ", verticalOffset=" + this.f165377e + ")";
    }

    public /* synthetic */ g(float f10, Float f11, j jVar, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, jVar, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 0.0f : f13);
    }
}
