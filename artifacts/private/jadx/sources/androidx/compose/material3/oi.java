package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconToggleButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,935:1\n646#2:936\n635#2:937\n646#2:938\n635#2:939\n646#2:940\n635#2:941\n646#2:942\n635#2:943\n646#2:944\n635#2:945\n646#2:946\n635#2:947\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconToggleButtonColors\n*L\n868#1:936\n868#1:937\n869#1:938\n869#1:939\n870#1:940\n870#1:941\n871#1:942\n871#1:943\n872#1:944\n872#1:945\n873#1:946\n873#1:947\n*E\n"})
public final class oi {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31374g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f31375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f31377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f31378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f31379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f31380f;

    public /* synthetic */ oi(long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15);
    }

    public static /* synthetic */ oi d(oi oiVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = oiVar.f31375a;
        }
        return oiVar.c(j10, (i10 & 2) != 0 ? oiVar.f31376b : j11, (i10 & 4) != 0 ? oiVar.f31377c : j12, (i10 & 8) != 0 ? oiVar.f31378d : j13, (i10 & 16) != 0 ? oiVar.f31379e : j14, (i10 & 32) != 0 ? oiVar.f31380f : j15);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> a(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1175394478, i10, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:882)");
        }
        if (z10) {
            j10 = !z11 ? this.f31375a : this.f31379e;
        } else {
            j10 = this.f31377c;
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j10), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarW;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> b(boolean z10, boolean z11, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        long j10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1340854054, i10, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:899)");
        }
        if (z10) {
            j10 = !z11 ? this.f31376b : this.f31380f;
        } else {
            j10 = this.f31378d;
        }
        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarW = androidx.compose.runtime.w6.w(androidx.compose.ui.graphics.q0.n(j10), c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarW;
    }

    @NotNull
    public final oi c(long j10, long j11, long j12, long j13, long j14, long j15) {
        return new oi(j10 != 16 ? j10 : this.f31375a, j11 != 16 ? j11 : this.f31376b, j12 != 16 ? j12 : this.f31377c, j13 != 16 ? j13 : this.f31378d, j14 != 16 ? j14 : this.f31379e, j15 != 16 ? j15 : this.f31380f, null);
    }

    public final long e() {
        return this.f31379e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof oi)) {
            oi oiVar = (oi) obj;
            return androidx.compose.ui.graphics.q0.y(this.f31375a, oiVar.f31375a) && androidx.compose.ui.graphics.q0.y(this.f31376b, oiVar.f31376b) && androidx.compose.ui.graphics.q0.y(this.f31377c, oiVar.f31377c) && androidx.compose.ui.graphics.q0.y(this.f31378d, oiVar.f31378d) && androidx.compose.ui.graphics.q0.y(this.f31379e, oiVar.f31379e) && androidx.compose.ui.graphics.q0.y(this.f31380f, oiVar.f31380f);
        }
        return false;
    }

    public final long f() {
        return this.f31380f;
    }

    public final long g() {
        return this.f31375a;
    }

    public final long h() {
        return this.f31376b;
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.graphics.q0.K(this.f31375a) * 31) + androidx.compose.ui.graphics.q0.K(this.f31376b)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31377c)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31378d)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31379e)) * 31) + androidx.compose.ui.graphics.q0.K(this.f31380f);
    }

    public final long i() {
        return this.f31377c;
    }

    public final long j() {
        return this.f31378d;
    }

    private oi(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f31375a = j10;
        this.f31376b = j11;
        this.f31377c = j12;
        this.f31378d = j13;
        this.f31379e = j14;
        this.f31380f = j15;
    }
}
