package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,815:1\n646#2:816\n635#2:817\n646#2:818\n635#2:819\n646#2:820\n635#2:821\n646#2:822\n635#2:823\n646#2:824\n635#2:825\n646#2:826\n635#2:827\n646#2:828\n635#2:829\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarItemColors\n*L\n461#1:816\n461#1:817\n462#1:818\n462#1:819\n463#1:820\n463#1:821\n464#1:822\n464#1:823\n465#1:824\n465#1:825\n466#1:826\n466#1:827\n467#1:828\n467#1:829\n*E\n"})
public final class lm {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f30374h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f30380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f30381g;

    public /* synthetic */ lm(long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16);
    }

    @NotNull
    public final lm a(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        return new lm(j10 != 16 ? j10 : this.f30375a, j11 != 16 ? j11 : this.f30376b, j12 != 16 ? j12 : this.f30377c, j13 != 16 ? j13 : this.f30378d, j14 != 16 ? j14 : this.f30379e, j15 != 16 ? j15 : this.f30380f, j16 != 16 ? j16 : this.f30381g, null);
    }

    public final long c() {
        return this.f30380f;
    }

    public final long d() {
        return this.f30381g;
    }

    public final long e() {
        return this.f30377c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lm)) {
            return false;
        }
        lm lmVar = (lm) obj;
        return androidx.compose.ui.graphics.q0.y(this.f30375a, lmVar.f30375a) && androidx.compose.ui.graphics.q0.y(this.f30378d, lmVar.f30378d) && androidx.compose.ui.graphics.q0.y(this.f30376b, lmVar.f30376b) && androidx.compose.ui.graphics.q0.y(this.f30379e, lmVar.f30379e) && androidx.compose.ui.graphics.q0.y(this.f30377c, lmVar.f30377c) && androidx.compose.ui.graphics.q0.y(this.f30380f, lmVar.f30380f) && androidx.compose.ui.graphics.q0.y(this.f30381g, lmVar.f30381g);
    }

    public final long f() {
        return this.f30375a;
    }

    public final long g() {
        return this.f30377c;
    }

    public final long h() {
        return this.f30376b;
    }

    public int hashCode() {
        return (((((((((((androidx.compose.ui.graphics.q0.K(this.f30375a) * 31) + androidx.compose.ui.graphics.q0.K(this.f30378d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30376b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30379e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30377c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30380f)) * 31) + androidx.compose.ui.graphics.q0.K(this.f30381g);
    }

    public final long i() {
        return this.f30378d;
    }

    public final long j() {
        return this.f30379e;
    }

    @androidx.compose.runtime.k7
    public final long k(boolean z10, boolean z11) {
        if (z11) {
            return z10 ? this.f30375a : this.f30378d;
        }
        return this.f30380f;
    }

    @androidx.compose.runtime.k7
    public final long l(boolean z10, boolean z11) {
        if (z11) {
            return z10 ? this.f30376b : this.f30379e;
        }
        return this.f30381g;
    }

    private lm(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f30375a = j10;
        this.f30376b = j11;
        this.f30377c = j12;
        this.f30378d = j13;
        this.f30379e = j14;
        this.f30380f = j15;
        this.f30381g = j16;
    }
}
