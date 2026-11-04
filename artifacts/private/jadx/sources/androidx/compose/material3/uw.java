package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2969:1\n646#2:2970\n635#2:2971\n646#2:2972\n635#2:2973\n646#2:2974\n635#2:2975\n646#2:2976\n635#2:2977\n646#2:2978\n635#2:2979\n646#2:2980\n635#2:2981\n646#2:2982\n635#2:2983\n646#2:2984\n635#2:2985\n646#2:2986\n635#2:2987\n646#2:2988\n635#2:2989\n646#2:2990\n635#2:2991\n646#2:2992\n635#2:2993\n646#2:2994\n635#2:2995\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n*L\n2783#1:2970\n2783#1:2971\n2784#1:2972\n2784#1:2973\n2785#1:2974\n2785#1:2975\n2786#1:2976\n2786#1:2977\n2787#1:2978\n2787#1:2979\n2788#1:2980\n2788#1:2981\n2789#1:2982\n2789#1:2983\n2790#1:2984\n2790#1:2985\n2791#1:2986\n2791#1:2987\n2792#1:2988\n2792#1:2989\n2793#1:2990\n2793#1:2991\n2794#1:2992\n2794#1:2993\n2795#1:2994\n2795#1:2995\n*E\n"})
public final class uw {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f33788n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f33793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f33794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f33795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f33796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f33797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f33798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f33799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f33800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f33801m;

    public /* synthetic */ uw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22);
    }

    public static /* synthetic */ uw c(uw uwVar, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, int i10, Object obj) {
        long j23;
        long j24;
        long j25 = (i10 & 1) != 0 ? uwVar.f33789a : j10;
        long j26 = (i10 & 2) != 0 ? uwVar.f33790b : j11;
        long j27 = (i10 & 4) != 0 ? uwVar.f33791c : j12;
        long j28 = (i10 & 8) != 0 ? uwVar.f33792d : j13;
        long j29 = (i10 & 16) != 0 ? uwVar.f33793e : j14;
        long j30 = (i10 & 32) != 0 ? uwVar.f33794f : j15;
        long j31 = (i10 & 64) != 0 ? uwVar.f33795g : j16;
        long j32 = j25;
        long j33 = (i10 & 128) != 0 ? uwVar.f33796h : j17;
        long j34 = (i10 & 256) != 0 ? uwVar.f33797i : j18;
        long j35 = (i10 & 512) != 0 ? uwVar.f33798j : j19;
        long j36 = (i10 & 1024) != 0 ? uwVar.f33799k : j20;
        long j37 = (i10 & 2048) != 0 ? uwVar.f33800l : j21;
        if ((i10 & 4096) != 0) {
            j24 = j37;
            j23 = uwVar.f33801m;
        } else {
            j23 = j22;
            j24 = j37;
        }
        return uwVar.b(j32, j26, j27, j28, j29, j30, j31, j33, j34, j35, j36, j24, j23);
    }

    @androidx.compose.runtime.k7
    public final long a(boolean z10, boolean z11) {
        if (z10) {
            return !z11 ? this.f33789a : this.f33797i;
        }
        return z11 ? this.f33798j : this.f33793e;
    }

    @NotNull
    public final uw b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        return new uw(j10 != 16 ? j10 : this.f33789a, j11 != 16 ? j11 : this.f33790b, j12 != 16 ? j12 : this.f33791c, j13 != 16 ? j13 : this.f33792d, j14 != 16 ? j14 : this.f33793e, j15 != 16 ? j15 : this.f33794f, j16 != 16 ? j16 : this.f33795g, j17 != 16 ? j17 : this.f33796h, j18 != 16 ? j18 : this.f33797i, j19 != 16 ? j19 : this.f33798j, j20 != 16 ? j20 : this.f33799k, j21 != 16 ? j21 : this.f33800l, j22 != 16 ? j22 : this.f33801m, null);
    }

    @androidx.compose.runtime.k7
    public final long d(boolean z10, boolean z11) {
        if (z10) {
            return !z11 ? this.f33790b : this.f33799k;
        }
        return this.f33794f;
    }

    @androidx.compose.runtime.k7
    public final long e(boolean z10, boolean z11) {
        if (z10) {
            return !z11 ? this.f33791c : this.f33800l;
        }
        return this.f33795g;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof uw)) {
            uw uwVar = (uw) obj;
            return androidx.compose.ui.graphics.q0.y(this.f33789a, uwVar.f33789a) && androidx.compose.ui.graphics.q0.y(this.f33790b, uwVar.f33790b) && androidx.compose.ui.graphics.q0.y(this.f33791c, uwVar.f33791c) && androidx.compose.ui.graphics.q0.y(this.f33792d, uwVar.f33792d) && androidx.compose.ui.graphics.q0.y(this.f33793e, uwVar.f33793e) && androidx.compose.ui.graphics.q0.y(this.f33794f, uwVar.f33794f) && androidx.compose.ui.graphics.q0.y(this.f33795g, uwVar.f33795g) && androidx.compose.ui.graphics.q0.y(this.f33796h, uwVar.f33796h) && androidx.compose.ui.graphics.q0.y(this.f33797i, uwVar.f33797i) && androidx.compose.ui.graphics.q0.y(this.f33798j, uwVar.f33798j) && androidx.compose.ui.graphics.q0.y(this.f33799k, uwVar.f33799k) && androidx.compose.ui.graphics.q0.y(this.f33800l, uwVar.f33800l) && androidx.compose.ui.graphics.q0.y(this.f33801m, uwVar.f33801m);
        }
        return false;
    }

    @androidx.compose.runtime.k7
    public final long f(boolean z10, boolean z11) {
        if (z10) {
            return !z11 ? this.f33792d : this.f33801m;
        }
        return this.f33796h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((androidx.compose.ui.graphics.q0.K(this.f33789a) * 31) + androidx.compose.ui.graphics.q0.K(this.f33790b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33791c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33792d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33793e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33794f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33795g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33796h)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33797i)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33798j)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33799k)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33800l)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33801m);
    }

    private uw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22) {
        this.f33789a = j10;
        this.f33790b = j11;
        this.f33791c = j12;
        this.f33792d = j13;
        this.f33793e = j14;
        this.f33794f = j15;
        this.f33795g = j16;
        this.f33796h = j17;
        this.f33797i = j18;
        this.f33798j = j19;
        this.f33799k = j20;
        this.f33800l = j21;
        this.f33801m = j22;
    }
}
