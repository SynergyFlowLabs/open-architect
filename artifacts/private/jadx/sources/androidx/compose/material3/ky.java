package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,3223:1\n646#2:3224\n635#2:3225\n646#2:3226\n635#2:3227\n646#2:3228\n635#2:3229\n646#2:3230\n635#2:3231\n646#2:3232\n635#2:3233\n646#2:3234\n635#2:3235\n646#2:3236\n635#2:3237\n646#2:3238\n635#2:3239\n646#2:3240\n635#2:3241\n646#2:3242\n635#2:3243\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderColors\n*L\n2586#1:3224\n2586#1:3225\n2587#1:3226\n2587#1:3227\n2588#1:3228\n2588#1:3229\n2589#1:3230\n2589#1:3231\n2590#1:3232\n2590#1:3233\n2591#1:3234\n2591#1:3235\n2592#1:3236\n2592#1:3237\n2593#1:3238\n2593#1:3239\n2594#1:3240\n2594#1:3241\n2595#1:3242\n2595#1:3243\n*E\n"})
public final class ky {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f30129k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f30135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f30136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f30137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f30138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f30139j;

    public /* synthetic */ ky(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
    }

    public static /* synthetic */ ky b(ky kyVar, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, int i10, Object obj) {
        long j20;
        long j21;
        long j22 = (i10 & 1) != 0 ? kyVar.f30130a : j10;
        long j23 = (i10 & 2) != 0 ? kyVar.f30131b : j11;
        long j24 = (i10 & 4) != 0 ? kyVar.f30132c : j12;
        long j25 = (i10 & 8) != 0 ? kyVar.f30133d : j13;
        long j26 = (i10 & 16) != 0 ? kyVar.f30134e : j14;
        long j27 = (i10 & 32) != 0 ? kyVar.f30135f : j15;
        long j28 = (i10 & 64) != 0 ? kyVar.f30136g : j16;
        long j29 = j22;
        long j30 = (i10 & 128) != 0 ? kyVar.f30137h : j17;
        long j31 = (i10 & 256) != 0 ? kyVar.f30138i : j18;
        if ((i10 & 512) != 0) {
            j21 = j31;
            j20 = kyVar.f30139j;
        } else {
            j20 = j19;
            j21 = j31;
        }
        return kyVar.a(j29, j23, j24, j25, j26, j27, j28, j30, j21, j20);
    }

    @NotNull
    public final ky a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        return new ky(j10 != 16 ? j10 : this.f30130a, j11 != 16 ? j11 : this.f30131b, j12 != 16 ? j12 : this.f30132c, j13 != 16 ? j13 : this.f30133d, j14 != 16 ? j14 : this.f30134e, j15 != 16 ? j15 : this.f30135f, j16 != 16 ? j16 : this.f30136g, j17 != 16 ? j17 : this.f30137h, j18 != 16 ? j18 : this.f30138i, j19 != 16 ? j19 : this.f30139j, null);
    }

    public final long c() {
        return this.f30132c;
    }

    public final long d() {
        return this.f30131b;
    }

    public final long e() {
        return this.f30137h;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ky)) {
            return false;
        }
        ky kyVar = (ky) obj;
        return androidx.compose.ui.graphics.q0.y(this.f30130a, kyVar.f30130a) && androidx.compose.ui.graphics.q0.y(this.f30131b, kyVar.f30131b) && androidx.compose.ui.graphics.q0.y(this.f30132c, kyVar.f30132c) && androidx.compose.ui.graphics.q0.y(this.f30133d, kyVar.f30133d) && androidx.compose.ui.graphics.q0.y(this.f30134e, kyVar.f30134e) && androidx.compose.ui.graphics.q0.y(this.f30135f, kyVar.f30135f) && androidx.compose.ui.graphics.q0.y(this.f30136g, kyVar.f30136g) && androidx.compose.ui.graphics.q0.y(this.f30137h, kyVar.f30137h) && androidx.compose.ui.graphics.q0.y(this.f30138i, kyVar.f30138i) && androidx.compose.ui.graphics.q0.y(this.f30139j, kyVar.f30139j);
    }

    public final long f() {
        return this.f30136g;
    }

    public final long g() {
        return this.f30139j;
    }

    public final long h() {
        return this.f30138i;
    }

    public int hashCode() {
        return (((((((((((((((((androidx.compose.ui.graphics.q0.K(this.f30130a) * 31) + androidx.compose.ui.graphics.q0.K(this.f30131b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30132c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30133d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30134e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30135f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30136g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30137h)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30138i)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30139j);
    }

    public final long i() {
        return this.f30135f;
    }

    public final long j() {
        return this.f30134e;
    }

    public final long k() {
        return this.f30133d;
    }

    public final long l() {
        return this.f30130a;
    }

    @androidx.compose.runtime.k7
    public final long m(boolean z10) {
        return z10 ? this.f30130a : this.f30135f;
    }

    @androidx.compose.runtime.k7
    public final long n(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.f30132c : this.f30134e;
        }
        return z11 ? this.f30137h : this.f30139j;
    }

    @androidx.compose.runtime.k7
    public final long o(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.f30131b : this.f30133d;
        }
        return z11 ? this.f30136g : this.f30138i;
    }

    private ky(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f30130a = j10;
        this.f30131b = j11;
        this.f30132c = j12;
        this.f30133d = j13;
        this.f30134e = j14;
        this.f30135f = j15;
        this.f30136g = j16;
        this.f30137h = j17;
        this.f30138i = j18;
        this.f30139j = j19;
    }
}
