package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2969:1\n646#2:2970\n635#2:2971\n646#2:2972\n635#2:2973\n646#2:2974\n635#2:2975\n646#2:2976\n635#2:2977\n646#2:2978\n635#2:2979\n646#2:2980\n635#2:2981\n646#2:2982\n635#2:2983\n646#2:2984\n635#2:2985\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipColors\n*L\n2643#1:2970\n2643#1:2971\n2644#1:2972\n2644#1:2973\n2645#1:2974\n2645#1:2975\n2646#1:2976\n2646#1:2977\n2647#1:2978\n2647#1:2979\n2648#1:2980\n2648#1:2981\n2649#1:2982\n2649#1:2983\n2650#1:2984\n2650#1:2985\n*E\n"})
public final class d5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27018i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f27023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f27024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f27025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f27026h;

    public /* synthetic */ d5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17);
    }

    public static /* synthetic */ d5 c(d5 d5Var, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i10, Object obj) {
        long j18;
        long j19;
        long j20 = (i10 & 1) != 0 ? d5Var.f27019a : j10;
        long j21 = (i10 & 2) != 0 ? d5Var.f27020b : j11;
        long j22 = (i10 & 4) != 0 ? d5Var.f27021c : j12;
        long j23 = (i10 & 8) != 0 ? d5Var.f27022d : j13;
        long j24 = (i10 & 16) != 0 ? d5Var.f27023e : j14;
        long j25 = (i10 & 32) != 0 ? d5Var.f27024f : j15;
        long j26 = (i10 & 64) != 0 ? d5Var.f27025g : j16;
        if ((i10 & 128) != 0) {
            j18 = d5Var.f27026h;
            j19 = j20;
        } else {
            j18 = j17;
            j19 = j20;
        }
        return d5Var.b(j19, j21, j22, j23, j24, j25, j26, j18);
    }

    @androidx.compose.runtime.k7
    public final long a(boolean z10) {
        return z10 ? this.f27019a : this.f27023e;
    }

    @NotNull
    public final d5 b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        return new d5(j10 != 16 ? j10 : this.f27019a, j11 != 16 ? j11 : this.f27020b, j12 != 16 ? j12 : this.f27021c, j13 != 16 ? j13 : this.f27022d, j14 != 16 ? j14 : this.f27023e, j15 != 16 ? j15 : this.f27024f, j16 != 16 ? j16 : this.f27025g, j17 != 16 ? j17 : this.f27026h, null);
    }

    public final long d() {
        return this.f27019a;
    }

    public final long e() {
        return this.f27023e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return androidx.compose.ui.graphics.q0.y(this.f27019a, d5Var.f27019a) && androidx.compose.ui.graphics.q0.y(this.f27020b, d5Var.f27020b) && androidx.compose.ui.graphics.q0.y(this.f27021c, d5Var.f27021c) && androidx.compose.ui.graphics.q0.y(this.f27022d, d5Var.f27022d) && androidx.compose.ui.graphics.q0.y(this.f27023e, d5Var.f27023e) && androidx.compose.ui.graphics.q0.y(this.f27024f, d5Var.f27024f) && androidx.compose.ui.graphics.q0.y(this.f27025g, d5Var.f27025g) && androidx.compose.ui.graphics.q0.y(this.f27026h, d5Var.f27026h);
    }

    public final long f() {
        return this.f27024f;
    }

    public final long g() {
        return this.f27025g;
    }

    public final long h() {
        return this.f27026h;
    }

    public int hashCode() {
        return (((((((((((((androidx.compose.ui.graphics.q0.K(this.f27019a) * 31) + androidx.compose.ui.graphics.q0.K(this.f27020b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27021c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27022d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27023e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27024f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27025g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27026h);
    }

    public final long i() {
        return this.f27020b;
    }

    public final long j() {
        return this.f27021c;
    }

    public final long k() {
        return this.f27022d;
    }

    @androidx.compose.runtime.k7
    public final long l(boolean z10) {
        return z10 ? this.f27020b : this.f27024f;
    }

    @androidx.compose.runtime.k7
    public final long m(boolean z10) {
        return z10 ? this.f27021c : this.f27025g;
    }

    @androidx.compose.runtime.k7
    public final long n(boolean z10) {
        return z10 ? this.f27022d : this.f27026h;
    }

    private d5(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f27019a = j10;
        this.f27020b = j11;
        this.f27021c = j12;
        this.f27022d = j13;
        this.f27023e = j14;
        this.f27024f = j15;
        this.f27025g = j16;
        this.f27026h = j17;
    }
}
