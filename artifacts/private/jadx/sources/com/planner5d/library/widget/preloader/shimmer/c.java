package com.planner5d.library.widget.preloader.shimmer;

import android.content.res.Resources;
import androidx.annotation.l;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.r2;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f258594g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f258595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f258596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f258597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f258598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f258599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f258600f;

    public c(float f10, float f11, boolean z10, @l int i10, @l int i11, int i12) {
        this.f258595a = f10;
        this.f258596b = f11;
        this.f258597c = z10;
        this.f258598d = i10;
        this.f258599e = i11;
        this.f258600f = i12;
    }

    public static /* synthetic */ c h(c cVar, float f10, float f11, boolean z10, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f10 = cVar.f258595a;
        }
        if ((i13 & 2) != 0) {
            f11 = cVar.f258596b;
        }
        if ((i13 & 4) != 0) {
            z10 = cVar.f258597c;
        }
        if ((i13 & 8) != 0) {
            i10 = cVar.f258598d;
        }
        if ((i13 & 16) != 0) {
            i11 = cVar.f258599e;
        }
        if ((i13 & 32) != 0) {
            i12 = cVar.f258600f;
        }
        int i14 = i11;
        int i15 = i12;
        return cVar.g(f10, f11, z10, i10, i14, i15);
    }

    public final float a() {
        return this.f258595a;
    }

    public final float b() {
        return this.f258596b;
    }

    public final boolean c() {
        return this.f258597c;
    }

    public final int d() {
        return this.f258598d;
    }

    public final int e() {
        return this.f258599e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f258595a, cVar.f258595a) == 0 && Float.compare(this.f258596b, cVar.f258596b) == 0 && this.f258597c == cVar.f258597c && this.f258598d == cVar.f258598d && this.f258599e == cVar.f258599e && this.f258600f == cVar.f258600f;
    }

    public final int f() {
        return this.f258600f;
    }

    @NotNull
    public final c g(float f10, float f11, boolean z10, @l int i10, @l int i11, int i12) {
        return new c(f10, f11, z10, i10, i11, i12);
    }

    public int hashCode() {
        return (((((((((Float.hashCode(this.f258595a) * 31) + Float.hashCode(this.f258596b)) * 31) + Boolean.hashCode(this.f258597c)) * 31) + Integer.hashCode(this.f258598d)) * 31) + Integer.hashCode(this.f258599e)) * 31) + Integer.hashCode(this.f258600f);
    }

    public final int i() {
        return this.f258600f;
    }

    public final int j() {
        return this.f258599e;
    }

    public final int k() {
        return this.f258598d;
    }

    public final float l() {
        return this.f258596b;
    }

    public final float m() {
        return this.f258595a;
    }

    public final boolean n() {
        return this.f258597c;
    }

    @NotNull
    public String toString() {
        return "ShimmerOptions(gradientWidthPx=" + this.f258595a + ", gradientRotationDegrees=" + this.f258596b + ", unifiedPositioning=" + this.f258597c + ", gradientEdgeColor=" + this.f258598d + ", gradientCentralColor=" + this.f258599e + ", animationDurationMillis=" + this.f258600f + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Resources resources) {
        this(r2.f229727a.c(resources, 275), 45.0f, false, resources.getColor(c1.e.Bf, null), resources.getColor(c1.e.f250389cm, null), resources.getInteger(c1.j.f252077h));
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i10 = 1 << 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Resources resources, boolean z10) {
        this(r2.f229727a.c(resources, resources.getDimensionPixelSize(c1.f.Mf)), z10 ? 0.0f : 90.0f, false, resources.getColor(c1.e.Jl, null), resources.getColor(c1.e.f250389cm, null), resources.getInteger(c1.j.f252075g));
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Resources resources, int i10) {
        this(r2.f229727a.c(resources, 275), 45.0f, false, resources.getColor(c1.e.Bf, null), resources.getColor(c1.e.f250389cm, null), i10);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }
}
