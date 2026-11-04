package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,3517:1\n646#2:3518\n635#2:3519\n646#2:3520\n635#2:3521\n646#2:3522\n635#2:3523\n646#2:3524\n635#2:3525\n646#2:3526\n635#2:3527\n646#2:3528\n635#2:3529\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n*L\n2027#1:3518\n2027#1:3519\n2028#1:3520\n2028#1:3521\n2029#1:3522\n2029#1:3523\n2030#1:3524\n2030#1:3525\n2031#1:3526\n2031#1:3527\n2032#1:3528\n2032#1:3529\n*E\n"})
public final class u90 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f33544g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f33549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f33550f;

    public /* synthetic */ u90(long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15);
    }

    public static /* synthetic */ u90 c(u90 u90Var, long j10, long j11, long j12, long j13, long j14, long j15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = u90Var.f33545a;
        }
        return u90Var.b(j10, (i10 & 2) != 0 ? u90Var.f33546b : j11, (i10 & 4) != 0 ? u90Var.f33547c : j12, (i10 & 8) != 0 ? u90Var.f33548d : j13, (i10 & 16) != 0 ? u90Var.f33549e : j14, (i10 & 32) != 0 ? u90Var.f33550f : j15);
    }

    @androidx.compose.runtime.k7
    public final long a(float f10) {
        return androidx.compose.ui.graphics.s0.q(this.f33545a, this.f33546b, androidx.compose.animation.core.u0.c().a(f10));
    }

    @NotNull
    public final u90 b(long j10, long j11, long j12, long j13, long j14, long j15) {
        return new u90(j10 != 16 ? j10 : this.f33545a, j11 != 16 ? j11 : this.f33546b, j12 != 16 ? j12 : this.f33547c, j13 != 16 ? j13 : this.f33548d, j14 != 16 ? j14 : this.f33549e, j15 != 16 ? j15 : this.f33550f, null);
    }

    public final long d() {
        return this.f33549e;
    }

    public final long e() {
        return this.f33545a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof u90)) {
            u90 u90Var = (u90) obj;
            return androidx.compose.ui.graphics.q0.y(this.f33545a, u90Var.f33545a) && androidx.compose.ui.graphics.q0.y(this.f33546b, u90Var.f33546b) && androidx.compose.ui.graphics.q0.y(this.f33547c, u90Var.f33547c) && androidx.compose.ui.graphics.q0.y(this.f33548d, u90Var.f33548d) && androidx.compose.ui.graphics.q0.y(this.f33549e, u90Var.f33549e) && androidx.compose.ui.graphics.q0.y(this.f33550f, u90Var.f33550f);
        }
        return false;
    }

    public final long f() {
        return this.f33547c;
    }

    public final long g() {
        return this.f33546b;
    }

    public final long h() {
        return this.f33550f;
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.graphics.q0.K(this.f33545a) * 31) + androidx.compose.ui.graphics.q0.K(this.f33546b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33547c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33548d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33549e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f33550f);
    }

    public final long i() {
        return this.f33548d;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Use the TopAppBarColors constructor with subtitleContentColor", replaceWith = @kotlin.b1(expression = "TopAppBarColors(containerColor, scrolledContainerColor,navigationIconContentColor, titleContentColor, actionIconContentColor, subtitleContentColor)", imports = {}))
    public /* synthetic */ u90(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    private u90(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f33545a = j10;
        this.f33546b = j11;
        this.f33547c = j12;
        this.f33548d = j13;
        this.f33549e = j14;
        this.f33550f = j15;
    }

    private u90(long j10, long j11, long j12, long j13, long j14) {
        this(j10, j11, j12, j13, j14, j13, null);
    }
}
