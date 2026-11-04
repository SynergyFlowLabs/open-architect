package com.planner5d.library.activity.fragment.compareplans;

import androidx.annotation.f1;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 1)
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f131580h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f131581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f131582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f131583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f131584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f131585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f131586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f131587g;

    public g(@v int i10, @f1 int i11, @f1 int i12, @f1 int i13, @v int i14, @v int i15, boolean z10) {
        this.f131581a = i10;
        this.f131582b = i11;
        this.f131583c = i12;
        this.f131584d = i13;
        this.f131585e = i14;
        this.f131586f = i15;
        this.f131587g = z10;
    }

    public static /* synthetic */ g i(g gVar, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = gVar.f131581a;
        }
        if ((i16 & 2) != 0) {
            i11 = gVar.f131582b;
        }
        if ((i16 & 4) != 0) {
            i12 = gVar.f131583c;
        }
        if ((i16 & 8) != 0) {
            i13 = gVar.f131584d;
        }
        if ((i16 & 16) != 0) {
            i14 = gVar.f131585e;
        }
        if ((i16 & 32) != 0) {
            i15 = gVar.f131586f;
        }
        if ((i16 & 64) != 0) {
            z10 = gVar.f131587g;
        }
        int i17 = i15;
        boolean z11 = z10;
        int i18 = i14;
        int i19 = i12;
        return gVar.h(i10, i11, i19, i13, i18, i17, z11);
    }

    public final int a() {
        return this.f131581a;
    }

    public final int b() {
        return this.f131582b;
    }

    public final int c() {
        return this.f131583c;
    }

    public final int d() {
        return this.f131584d;
    }

    public final int e() {
        return this.f131585e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f131581a == gVar.f131581a && this.f131582b == gVar.f131582b && this.f131583c == gVar.f131583c && this.f131584d == gVar.f131584d && this.f131585e == gVar.f131585e && this.f131586f == gVar.f131586f && this.f131587g == gVar.f131587g;
    }

    public final int f() {
        return this.f131586f;
    }

    public final boolean g() {
        return this.f131587g;
    }

    @NotNull
    public final g h(@v int i10, @f1 int i11, @f1 int i12, @f1 int i13, @v int i14, @v int i15, boolean z10) {
        return new g(i10, i11, i12, i13, i14, i15, z10);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f131581a) * 31) + Integer.hashCode(this.f131582b)) * 31) + Integer.hashCode(this.f131583c)) * 31) + Integer.hashCode(this.f131584d)) * 31) + Integer.hashCode(this.f131585e)) * 31) + Integer.hashCode(this.f131586f)) * 31) + Boolean.hashCode(this.f131587g);
    }

    public final int j() {
        return this.f131581a;
    }

    public final int k() {
        return this.f131585e;
    }

    public final int l() {
        return this.f131586f;
    }

    public final int m() {
        return this.f131583c;
    }

    public final int n() {
        return this.f131584d;
    }

    public final boolean o() {
        return this.f131587g;
    }

    public final int p() {
        return this.f131582b;
    }

    @NotNull
    public String toString() {
        return "ComparePlansItem(icon=" + this.f131581a + ", title=" + this.f131582b + ", premium=" + this.f131583c + ", pro=" + this.f131584d + ", iconPremium=" + this.f131585e + ", iconPro=" + this.f131586f + ", soon=" + this.f131587g + ")";
    }

    public /* synthetic */ g(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i16 & 4) != 0 ? 0 : i12, (i16 & 8) != 0 ? 0 : i13, (i16 & 16) != 0 ? 0 : i14, (i16 & 32) != 0 ? 0 : i15, (i16 & 64) != 0 ? false : z10);
    }
}
