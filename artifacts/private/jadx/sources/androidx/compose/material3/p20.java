package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,631:1\n646#2:632\n635#2:633\n646#2:634\n635#2:635\n646#2:636\n635#2:637\n646#2:638\n635#2:639\n646#2:640\n635#2:641\n646#2:642\n635#2:643\n646#2:644\n635#2:645\n646#2:646\n635#2:647\n646#2:648\n635#2:649\n646#2:650\n635#2:651\n646#2:652\n635#2:653\n646#2:654\n635#2:655\n646#2:656\n635#2:657\n646#2:658\n635#2:659\n646#2:660\n635#2:661\n646#2:662\n635#2:663\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchColors\n*L\n504#1:632\n504#1:633\n505#1:634\n505#1:635\n506#1:636\n506#1:637\n507#1:638\n507#1:639\n508#1:640\n508#1:641\n509#1:642\n509#1:643\n510#1:644\n510#1:645\n511#1:646\n511#1:647\n512#1:648\n512#1:649\n513#1:650\n513#1:651\n514#1:652\n514#1:653\n515#1:654\n515#1:655\n516#1:656\n516#1:657\n517#1:658\n517#1:659\n518#1:660\n518#1:661\n519#1:662\n519#1:663\n*E\n"})
public final class p20 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f31538q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f31542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f31543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f31544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f31545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f31546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f31547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f31548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f31549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f31550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f31551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f31552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f31553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f31554p;

    public /* synthetic */ p20(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25);
    }

    public static /* synthetic */ p20 c(p20 p20Var, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, int i10, Object obj) {
        long j26;
        long j27;
        long j28 = (i10 & 1) != 0 ? p20Var.f31539a : j10;
        long j29 = (i10 & 2) != 0 ? p20Var.f31540b : j11;
        long j30 = (i10 & 4) != 0 ? p20Var.f31541c : j12;
        long j31 = (i10 & 8) != 0 ? p20Var.f31542d : j13;
        long j32 = (i10 & 16) != 0 ? p20Var.f31543e : j14;
        long j33 = (i10 & 32) != 0 ? p20Var.f31544f : j15;
        long j34 = (i10 & 64) != 0 ? p20Var.f31545g : j16;
        long j35 = j28;
        long j36 = (i10 & 128) != 0 ? p20Var.f31546h : j17;
        long j37 = (i10 & 256) != 0 ? p20Var.f31547i : j18;
        long j38 = (i10 & 512) != 0 ? p20Var.f31548j : j19;
        long j39 = (i10 & 1024) != 0 ? p20Var.f31549k : j20;
        long j40 = (i10 & 2048) != 0 ? p20Var.f31550l : j21;
        long j41 = (i10 & 4096) != 0 ? p20Var.f31551m : j22;
        long j42 = (i10 & 8192) != 0 ? p20Var.f31552n : j23;
        long j43 = (i10 & 16384) != 0 ? p20Var.f31553o : j24;
        if ((i10 & 32768) != 0) {
            j27 = j43;
            j26 = p20Var.f31554p;
        } else {
            j26 = j25;
            j27 = j43;
        }
        return p20Var.b(j35, j29, j30, j31, j32, j33, j34, j36, j37, j38, j39, j40, j41, j42, j27, j26);
    }

    @androidx.compose.runtime.k7
    public final long a(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.f31541c : this.f31545g;
        }
        return z11 ? this.f31549k : this.f31553o;
    }

    @NotNull
    public final p20 b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25) {
        return new p20(j10 != 16 ? j10 : this.f31539a, j11 != 16 ? j11 : this.f31540b, j12 != 16 ? j12 : this.f31541c, j13 != 16 ? j13 : this.f31542d, j14 != 16 ? j14 : this.f31543e, j15 != 16 ? j15 : this.f31544f, j16 != 16 ? j16 : this.f31545g, j17 != 16 ? j17 : this.f31546h, j18 != 16 ? j18 : this.f31547i, j19 != 16 ? j19 : this.f31548j, j20 != 16 ? j20 : this.f31549k, j21 != 16 ? j21 : this.f31550l, j22 != 16 ? j22 : this.f31551m, j23 != 16 ? j23 : this.f31552n, j24 != 16 ? j24 : this.f31553o, j25 != 16 ? j25 : this.f31554p, null);
    }

    public final long d() {
        return this.f31541c;
    }

    public final long e() {
        return this.f31542d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p20)) {
            return false;
        }
        p20 p20Var = (p20) obj;
        return androidx.compose.ui.graphics.q0.y(this.f31539a, p20Var.f31539a) && androidx.compose.ui.graphics.q0.y(this.f31540b, p20Var.f31540b) && androidx.compose.ui.graphics.q0.y(this.f31541c, p20Var.f31541c) && androidx.compose.ui.graphics.q0.y(this.f31542d, p20Var.f31542d) && androidx.compose.ui.graphics.q0.y(this.f31543e, p20Var.f31543e) && androidx.compose.ui.graphics.q0.y(this.f31544f, p20Var.f31544f) && androidx.compose.ui.graphics.q0.y(this.f31545g, p20Var.f31545g) && androidx.compose.ui.graphics.q0.y(this.f31546h, p20Var.f31546h) && androidx.compose.ui.graphics.q0.y(this.f31547i, p20Var.f31547i) && androidx.compose.ui.graphics.q0.y(this.f31548j, p20Var.f31548j) && androidx.compose.ui.graphics.q0.y(this.f31549k, p20Var.f31549k) && androidx.compose.ui.graphics.q0.y(this.f31550l, p20Var.f31550l) && androidx.compose.ui.graphics.q0.y(this.f31551m, p20Var.f31551m) && androidx.compose.ui.graphics.q0.y(this.f31552n, p20Var.f31552n) && androidx.compose.ui.graphics.q0.y(this.f31553o, p20Var.f31553o) && androidx.compose.ui.graphics.q0.y(this.f31554p, p20Var.f31554p);
    }

    public final long f() {
        return this.f31539a;
    }

    public final long g() {
        return this.f31540b;
    }

    public final long h() {
        return this.f31549k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((androidx.compose.ui.graphics.q0.K(this.f31539a) * 31) + androidx.compose.ui.graphics.q0.K(this.f31540b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31541c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31542d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31543e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31544f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31545g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31546h)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31547i)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31548j)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31549k)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31550l)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31551m)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31552n)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31553o)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31554p);
    }

    public final long i() {
        return this.f31550l;
    }

    public final long j() {
        return this.f31547i;
    }

    public final long k() {
        return this.f31548j;
    }

    public final long l() {
        return this.f31553o;
    }

    public final long m() {
        return this.f31554p;
    }

    public final long n() {
        return this.f31551m;
    }

    public final long o() {
        return this.f31552n;
    }

    public final long p() {
        return this.f31545g;
    }

    public final long q() {
        return this.f31546h;
    }

    public final long r() {
        return this.f31543e;
    }

    public final long s() {
        return this.f31544f;
    }

    @androidx.compose.runtime.k7
    public final long t(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.f31542d : this.f31546h;
        }
        return z11 ? this.f31550l : this.f31554p;
    }

    @androidx.compose.runtime.k7
    public final long u(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.f31539a : this.f31543e;
        }
        return z11 ? this.f31547i : this.f31551m;
    }

    @androidx.compose.runtime.k7
    public final long v(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.f31540b : this.f31544f;
        }
        return z11 ? this.f31548j : this.f31552n;
    }

    private p20(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25) {
        this.f31539a = j10;
        this.f31540b = j11;
        this.f31541c = j12;
        this.f31542d = j13;
        this.f31543e = j14;
        this.f31544f = j15;
        this.f31545g = j16;
        this.f31546h = j17;
        this.f31547i = j18;
        this.f31548j = j19;
        this.f31549k = j20;
        this.f31550l = j21;
        this.f31551m = j22;
        this.f31552n = j23;
        this.f31553o = j24;
        this.f31554p = j25;
    }
}
