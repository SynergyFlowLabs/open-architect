package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@af
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2144:1\n646#2:2145\n635#2:2146\n646#2:2147\n635#2:2148\n646#2:2149\n635#2:2150\n646#2:2151\n635#2:2152\n646#2:2153\n635#2:2154\n646#2:2155\n635#2:2156\n646#2:2157\n635#2:2158\n646#2:2159\n635#2:2160\n646#2:2161\n635#2:2162\n646#2:2163\n635#2:2164\n646#2:2165\n635#2:2166\n646#2:2167\n635#2:2168\n646#2:2169\n635#2:2170\n646#2:2171\n635#2:2172\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n*L\n454#1:2145\n454#1:2146\n455#1:2147\n455#1:2148\n456#1:2149\n456#1:2150\n457#1:2151\n457#1:2152\n458#1:2153\n458#1:2154\n459#1:2155\n459#1:2156\n460#1:2157\n460#1:2158\n463#1:2159\n463#1:2160\n466#1:2161\n466#1:2162\n469#1:2163\n469#1:2164\n472#1:2165\n472#1:2166\n475#1:2167\n475#1:2168\n478#1:2169\n478#1:2170\n479#1:2171\n479#1:2172\n*E\n"})
public final class u50 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f33502o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f33507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f33508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f33509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f33510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f33511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f33512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f33513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f33514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f33515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f33516n;

    public /* synthetic */ u50(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23);
    }

    public static /* synthetic */ u50 c(u50 u50Var, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, int i10, Object obj) {
        long j24;
        long j25;
        long j26 = (i10 & 1) != 0 ? u50Var.f33505c : j10;
        long j27 = (i10 & 2) != 0 ? u50Var.f33504b : j11;
        long j28 = (i10 & 4) != 0 ? u50Var.f33505c : j12;
        long j29 = (i10 & 8) != 0 ? u50Var.f33506d : j13;
        long j30 = (i10 & 16) != 0 ? u50Var.f33507e : j14;
        long j31 = (i10 & 32) != 0 ? u50Var.f33508f : j15;
        long j32 = (i10 & 64) != 0 ? u50Var.f33509g : j16;
        long j33 = j26;
        long j34 = (i10 & 128) != 0 ? u50Var.f33510h : j17;
        long j35 = (i10 & 256) != 0 ? u50Var.f33511i : j18;
        long j36 = (i10 & 512) != 0 ? u50Var.f33512j : j19;
        long j37 = (i10 & 1024) != 0 ? u50Var.f33513k : j20;
        long j38 = (i10 & 2048) != 0 ? u50Var.f33514l : j21;
        long j39 = (i10 & 4096) != 0 ? u50Var.f33515m : j22;
        if ((i10 & 8192) != 0) {
            j25 = j39;
            j24 = u50Var.f33516n;
        } else {
            j24 = j23;
            j25 = j39;
        }
        return u50Var.b(j33, j27, j28, j29, j30, j31, j32, j34, j35, j36, j37, j38, j25, j24);
    }

    @androidx.compose.runtime.k7
    public final long a(boolean z10) {
        return z10 ? this.f33507e : this.f33508f;
    }

    @NotNull
    public final u50 b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23) {
        return new u50(j10 != 16 ? j10 : this.f33503a, j11 != 16 ? j11 : this.f33504b, j12 != 16 ? j12 : this.f33505c, j13 != 16 ? j13 : this.f33506d, j14 != 16 ? j14 : this.f33507e, j15 != 16 ? j15 : this.f33508f, j16 != 16 ? j16 : this.f33509g, j17 != 16 ? j17 : this.f33510h, j18 != 16 ? j18 : this.f33511i, j19 != 16 ? j19 : this.f33512j, j20 != 16 ? j20 : this.f33513k, j21 != 16 ? j21 : this.f33514l, j22 != 16 ? j22 : this.f33515m, j23 != 16 ? j23 : this.f33516n, null);
    }

    public final long d() {
        return this.f33503a;
    }

    public final long e() {
        return this.f33507e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u50.class != obj.getClass()) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return androidx.compose.ui.graphics.q0.y(this.f33503a, u50Var.f33503a) && androidx.compose.ui.graphics.q0.y(this.f33504b, u50Var.f33504b) && androidx.compose.ui.graphics.q0.y(this.f33505c, u50Var.f33505c) && androidx.compose.ui.graphics.q0.y(this.f33506d, u50Var.f33506d) && androidx.compose.ui.graphics.q0.y(this.f33509g, u50Var.f33509g) && androidx.compose.ui.graphics.q0.y(this.f33510h, u50Var.f33510h) && androidx.compose.ui.graphics.q0.y(this.f33511i, u50Var.f33511i) && androidx.compose.ui.graphics.q0.y(this.f33512j, u50Var.f33512j) && androidx.compose.ui.graphics.q0.y(this.f33513k, u50Var.f33513k) && androidx.compose.ui.graphics.q0.y(this.f33514l, u50Var.f33514l) && androidx.compose.ui.graphics.q0.y(this.f33515m, u50Var.f33515m) && androidx.compose.ui.graphics.q0.y(this.f33516n, u50Var.f33516n);
    }

    public final long f() {
        return this.f33508f;
    }

    public final long g() {
        return this.f33505c;
    }

    public final long h() {
        return this.f33506d;
    }

    public int hashCode() {
        return (((((((((((((((((((((androidx.compose.ui.graphics.q0.K(this.f33503a) * 31) + androidx.compose.ui.graphics.q0.K(this.f33504b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33505c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33506d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33509g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33510h)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33511i)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33512j)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33513k)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33514l)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33515m)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33516n);
    }

    public final long i() {
        return this.f33509g;
    }

    public final long j() {
        return this.f33511i;
    }

    public final long k() {
        return this.f33510h;
    }

    public final long l() {
        return this.f33512j;
    }

    public final long m() {
        return this.f33504b;
    }

    public final long n() {
        return this.f33513k;
    }

    public final long o() {
        return this.f33515m;
    }

    public final long p() {
        return this.f33514l;
    }

    public final long q() {
        return this.f33516n;
    }

    @androidx.compose.runtime.k7
    public final long r(boolean z10) {
        return z10 ? this.f33509g : this.f33510h;
    }

    @androidx.compose.runtime.k7
    public final long s(boolean z10) {
        return z10 ? this.f33511i : this.f33512j;
    }

    @androidx.compose.runtime.k7
    public final long t(boolean z10) {
        return z10 ? this.f33513k : this.f33514l;
    }

    @androidx.compose.runtime.k7
    public final long u(boolean z10) {
        return z10 ? this.f33515m : this.f33516n;
    }

    private u50(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23) {
        this.f33503a = j10;
        this.f33504b = j11;
        this.f33505c = j12;
        this.f33506d = j13;
        this.f33507e = j14;
        this.f33508f = j15;
        this.f33509g = j16;
        this.f33510h = j17;
        this.f33511i = j18;
        this.f33512j = j19;
        this.f33513k = j20;
        this.f33514l = j21;
        this.f33515m = j22;
        this.f33516n = j23;
    }
}
