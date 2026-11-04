package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,838:1\n646#2:839\n635#2:840\n646#2:841\n635#2:842\n646#2:843\n635#2:844\n646#2:845\n635#2:846\n646#2:847\n635#2:848\n646#2:849\n635#2:850\n646#2:851\n635#2:852\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailItemColors\n*L\n464#1:839\n464#1:840\n465#1:841\n465#1:842\n466#1:843\n466#1:844\n467#1:845\n467#1:846\n468#1:847\n468#1:848\n469#1:849\n469#1:850\n470#1:851\n470#1:852\n*E\n"})
public final class sp {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f32947h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f32952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f32953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f32954g;

    public /* synthetic */ sp(long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16);
    }

    @NotNull
    public final sp a(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        return new sp(j10 != 16 ? j10 : this.f32948a, j11 != 16 ? j11 : this.f32949b, j12 != 16 ? j12 : this.f32950c, j13 != 16 ? j13 : this.f32951d, j14 != 16 ? j14 : this.f32952e, j15 != 16 ? j15 : this.f32953f, j16 != 16 ? j16 : this.f32954g, null);
    }

    public final long c() {
        return this.f32953f;
    }

    public final long d() {
        return this.f32954g;
    }

    public final long e() {
        return this.f32950c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sp)) {
            return false;
        }
        sp spVar = (sp) obj;
        return androidx.compose.ui.graphics.q0.y(this.f32948a, spVar.f32948a) && androidx.compose.ui.graphics.q0.y(this.f32951d, spVar.f32951d) && androidx.compose.ui.graphics.q0.y(this.f32949b, spVar.f32949b) && androidx.compose.ui.graphics.q0.y(this.f32952e, spVar.f32952e) && androidx.compose.ui.graphics.q0.y(this.f32950c, spVar.f32950c) && androidx.compose.ui.graphics.q0.y(this.f32953f, spVar.f32953f) && androidx.compose.ui.graphics.q0.y(this.f32954g, spVar.f32954g);
    }

    public final long f() {
        return this.f32948a;
    }

    public final long g() {
        return this.f32950c;
    }

    public final long h() {
        return this.f32949b;
    }

    public int hashCode() {
        return (((((((((((androidx.compose.ui.graphics.q0.K(this.f32948a) * 31) + androidx.compose.ui.graphics.q0.K(this.f32951d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32949b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32952e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32950c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32953f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32954g);
    }

    public final long i() {
        return this.f32951d;
    }

    public final long j() {
        return this.f32952e;
    }

    @androidx.compose.runtime.k7
    public final long k(boolean z10, boolean z11) {
        if (z11) {
            return z10 ? this.f32948a : this.f32951d;
        }
        return this.f32953f;
    }

    @androidx.compose.runtime.k7
    public final long l(boolean z10, boolean z11) {
        if (z11) {
            return z10 ? this.f32949b : this.f32952e;
        }
        return this.f32954g;
    }

    private sp(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f32948a = j10;
        this.f32949b = j11;
        this.f32950c = j12;
        this.f32951d = j13;
        this.f32952e = j14;
        this.f32953f = j15;
        this.f32954g = j16;
    }
}
