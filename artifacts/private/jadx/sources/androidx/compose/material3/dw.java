package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,848:1\n646#2:849\n635#2:850\n646#2:851\n635#2:852\n646#2:853\n635#2:854\n646#2:855\n635#2:856\n646#2:857\n635#2:858\n646#2:859\n635#2:860\n646#2:861\n635#2:862\n646#2:863\n635#2:864\n646#2:865\n635#2:866\n646#2:867\n635#2:868\n646#2:869\n635#2:870\n646#2:871\n635#2:872\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n*L\n728#1:849\n728#1:850\n729#1:851\n729#1:852\n730#1:853\n730#1:854\n731#1:855\n731#1:856\n732#1:857\n732#1:858\n733#1:859\n733#1:860\n734#1:861\n734#1:862\n735#1:863\n735#1:864\n736#1:865\n736#1:866\n737#1:867\n737#1:868\n738#1:869\n738#1:870\n739#1:871\n739#1:872\n*E\n"})
public final class dw {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f27151m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f27156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f27157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f27158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f27159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f27160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f27161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f27162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f27163l;

    public /* synthetic */ dw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21);
    }

    public static /* synthetic */ dw e(dw dwVar, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, int i10, Object obj) {
        long j22;
        long j23;
        long j24 = (i10 & 1) != 0 ? dwVar.f27152a : j10;
        long j25 = (i10 & 2) != 0 ? dwVar.f27153b : j11;
        long j26 = (i10 & 4) != 0 ? dwVar.f27154c : j12;
        long j27 = (i10 & 8) != 0 ? dwVar.f27155d : j13;
        long j28 = (i10 & 16) != 0 ? dwVar.f27156e : j14;
        long j29 = (i10 & 32) != 0 ? dwVar.f27157f : j15;
        long j30 = (i10 & 64) != 0 ? dwVar.f27158g : j16;
        long j31 = j24;
        long j32 = (i10 & 128) != 0 ? dwVar.f27159h : j17;
        long j33 = (i10 & 256) != 0 ? dwVar.f27160i : j18;
        long j34 = (i10 & 512) != 0 ? dwVar.f27161j : j19;
        long j35 = (i10 & 1024) != 0 ? dwVar.f27162k : j20;
        if ((i10 & 2048) != 0) {
            j23 = j35;
            j22 = dwVar.f27163l;
        } else {
            j22 = j21;
            j23 = j35;
        }
        return dwVar.d(j31, j25, j26, j27, j28, j29, j30, j32, j33, j34, j23, j22);
    }

    @androidx.compose.runtime.k7
    public final long a(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this.f27154c;
        }
        if (!z10 || z11) {
            return (z10 || !z11) ? this.f27163l : this.f27160i;
        }
        return this.f27157f;
    }

    @androidx.compose.runtime.k7
    public final long b(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this.f27152a;
        }
        if (!z10 || z11) {
            return (z10 || !z11) ? this.f27161j : this.f27158g;
        }
        return this.f27155d;
    }

    @androidx.compose.runtime.k7
    public final long c(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this.f27153b;
        }
        if (!z10 || z11) {
            return (z10 || !z11) ? this.f27162k : this.f27159h;
        }
        return this.f27156e;
    }

    @NotNull
    public final dw d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        return new dw(j10 != 16 ? j10 : this.f27152a, j11 != 16 ? j11 : this.f27153b, j12 != 16 ? j12 : this.f27154c, j13 != 16 ? j13 : this.f27155d, j14 != 16 ? j14 : this.f27156e, j15 != 16 ? j15 : this.f27157f, j16 != 16 ? j16 : this.f27158g, j17 != 16 ? j17 : this.f27159h, j18 != 16 ? j18 : this.f27160i, j19 != 16 ? j19 : this.f27161j, j20 != 16 ? j20 : this.f27162k, j21 != 16 ? j21 : this.f27163l, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dw.class != obj.getClass()) {
            return false;
        }
        dw dwVar = (dw) obj;
        return androidx.compose.ui.graphics.q0.y(this.f27154c, dwVar.f27154c) && androidx.compose.ui.graphics.q0.y(this.f27153b, dwVar.f27153b) && androidx.compose.ui.graphics.q0.y(this.f27152a, dwVar.f27152a) && androidx.compose.ui.graphics.q0.y(this.f27157f, dwVar.f27157f) && androidx.compose.ui.graphics.q0.y(this.f27156e, dwVar.f27156e) && androidx.compose.ui.graphics.q0.y(this.f27155d, dwVar.f27155d) && androidx.compose.ui.graphics.q0.y(this.f27160i, dwVar.f27160i) && androidx.compose.ui.graphics.q0.y(this.f27159h, dwVar.f27159h) && androidx.compose.ui.graphics.q0.y(this.f27158g, dwVar.f27158g) && androidx.compose.ui.graphics.q0.y(this.f27163l, dwVar.f27163l) && androidx.compose.ui.graphics.q0.y(this.f27162k, dwVar.f27162k) && androidx.compose.ui.graphics.q0.y(this.f27161j, dwVar.f27161j);
    }

    public final long f() {
        return this.f27154c;
    }

    public final long g() {
        return this.f27152a;
    }

    public final long h() {
        return this.f27153b;
    }

    public int hashCode() {
        return (((((((((((((((((((((androidx.compose.ui.graphics.q0.K(this.f27154c) * 31) + androidx.compose.ui.graphics.q0.K(this.f27153b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27152a)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27157f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27156e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27155d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27160i)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27159h)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27158g)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27163l)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27162k)) * 31) + androidx.compose.ui.graphics.q0.K(this.f27161j);
    }

    public final long i() {
        return this.f27160i;
    }

    public final long j() {
        return this.f27158g;
    }

    public final long k() {
        return this.f27159h;
    }

    public final long l() {
        return this.f27163l;
    }

    public final long m() {
        return this.f27161j;
    }

    public final long n() {
        return this.f27162k;
    }

    public final long o() {
        return this.f27157f;
    }

    public final long p() {
        return this.f27155d;
    }

    public final long q() {
        return this.f27156e;
    }

    private dw(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f27152a = j10;
        this.f27153b = j11;
        this.f27154c = j12;
        this.f27155d = j13;
        this.f27156e = j14;
        this.f27157f = j15;
        this.f27158g = j16;
        this.f27159h = j17;
        this.f27160i = j18;
        this.f27161j = j19;
        this.f27162k = j20;
        this.f27163l = j21;
    }
}
