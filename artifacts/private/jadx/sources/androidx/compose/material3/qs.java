package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,267:1\n646#2:268\n635#2:269\n646#2:270\n635#2:271\n646#2:272\n635#2:273\n646#2:274\n635#2:275\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n*L\n210#1:268\n210#1:269\n211#1:270\n211#1:271\n212#1:272\n212#1:273\n213#1:274\n213#1:275\n*E\n"})
public final class qs {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f32332e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f32336d;

    public /* synthetic */ qs(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public static /* synthetic */ qs b(qs qsVar, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = qsVar.f32333a;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = qsVar.f32334b;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = qsVar.f32335c;
        }
        return qsVar.a(j14, j15, j12, (i10 & 8) != 0 ? qsVar.f32336d : j13);
    }

    @NotNull
    public final qs a(long j10, long j11, long j12, long j13) {
        return new qs(j10 != 16 ? j10 : this.f32333a, j11 != 16 ? j11 : this.f32334b, j12 != 16 ? j12 : this.f32335c, j13 != 16 ? j13 : this.f32336d, null);
    }

    public final long c() {
        return this.f32335c;
    }

    public final long d() {
        return this.f32336d;
    }

    public final long e() {
        return this.f32333a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof qs)) {
            qs qsVar = (qs) obj;
            return androidx.compose.ui.graphics.q0.y(this.f32333a, qsVar.f32333a) && androidx.compose.ui.graphics.q0.y(this.f32334b, qsVar.f32334b) && androidx.compose.ui.graphics.q0.y(this.f32335c, qsVar.f32335c) && androidx.compose.ui.graphics.q0.y(this.f32336d, qsVar.f32336d);
        }
        return false;
    }

    public final long f() {
        return this.f32334b;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> g(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1840145292, i10, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:223)");
        }
        if (z10 && z11) {
            j10 = this.f32333a;
        } else if (!z10 || z11) {
            j10 = (z10 || !z11) ? this.f32336d : this.f32335c;
        } else {
            j10 = this.f32334b;
        }
        long j11 = j10;
        if (z10) {
            c0Var.E(1194696477);
            n7VarW = androidx.compose.animation.e1.c(j11, hm.b(d0.h1.DefaultEffects, c0Var, 6), null, null, c0Var, 0, 12);
            c0Var.A();
        } else {
            c0Var.E(1194874138);
            n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j11), c0Var, 0);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarW;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.graphics.q0.K(this.f32333a) * 31) + androidx.compose.ui.graphics.q0.K(this.f32334b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32335c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f32336d);
    }

    private qs(long j10, long j11, long j12, long j13) {
        this.f32333a = j10;
        this.f32334b = j11;
        this.f32335c = j12;
        this.f32336d = j13;
    }
}
