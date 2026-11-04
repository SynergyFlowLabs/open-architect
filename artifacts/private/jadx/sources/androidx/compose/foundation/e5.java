package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScrollingContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollingContainer.kt\nandroidx/compose/foundation/ScrollingContainerNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
final class e5 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.h, androidx.compose.ui.node.q1 {

    @Nullable
    private androidx.compose.foundation.gestures.m0 H1;

    @NotNull
    private androidx.compose.foundation.gestures.q3 X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private x3 f14214g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final boolean f14215h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.gestures.u4 f14216i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.node.j f14217j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private y3 f14218k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private x3 f14219l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f14220m3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.gestures.c3 f14221p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.interaction.j f14222p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f14223p2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.gestures.v4 f14224w;

    public e5(@NotNull androidx.compose.foundation.gestures.v4 v4Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, boolean z10, boolean z11, @Nullable androidx.compose.foundation.gestures.c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.foundation.gestures.m0 m0Var, boolean z12, @Nullable x3 x3Var) {
        this.f14224w = v4Var;
        this.X = q3Var;
        this.Y = z10;
        this.Z = z11;
        this.f14221p0 = c3Var;
        this.f14222p1 = jVar;
        this.H1 = m0Var;
        this.f14223p2 = z12;
        this.f14214g3 = x3Var;
    }

    private final void H9() {
        androidx.compose.ui.node.j jVar = this.f14217j3;
        if (jVar != null) {
            if (jVar == null || jVar.w().a9()) {
                return;
            }
            v9(jVar);
            return;
        }
        if (this.f14223p2) {
            androidx.compose.ui.node.r1.a(this, new Function0() { // from class: androidx.compose.foundation.d5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e5.I9(this.f14138a);
                }
            });
        }
        x3 x3VarJ9 = J9();
        if (x3VarJ9 != null) {
            androidx.compose.ui.node.j jVarW = x3VarJ9.w();
            if (jVarW.w().a9()) {
                return;
            }
            this.f14217j3 = v9(jVarW);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I9(e5 e5Var) {
        y3 y3Var = (y3) androidx.compose.ui.node.i.a(e5Var, a4.c());
        e5Var.f14218k3 = y3Var;
        e5Var.f14219l3 = y3Var != null ? y3Var.a() : null;
        return Unit.f312394a;
    }

    @Nullable
    public final x3 J9() {
        return this.f14223p2 ? this.f14219l3 : this.f14214g3;
    }

    public final boolean K9() {
        androidx.compose.ui.unit.w wVarT = androidx.compose.ui.unit.w.Ltr;
        if (a9()) {
            wVarT = androidx.compose.ui.node.k.t(this);
        }
        return androidx.compose.foundation.gestures.l4.f14799a.c(wVarT, this.X, this.Z);
    }

    public final void L9(@NotNull androidx.compose.foundation.gestures.v4 v4Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, boolean z10, @Nullable x3 x3Var, boolean z11, boolean z12, @Nullable androidx.compose.foundation.gestures.c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.foundation.gestures.m0 m0Var) {
        boolean z13;
        this.f14224w = v4Var;
        this.X = q3Var;
        boolean z14 = true;
        if (this.f14223p2 != z10) {
            this.f14223p2 = z10;
            z13 = true;
        } else {
            z13 = false;
        }
        if (Intrinsics.areEqual(this.f14214g3, x3Var)) {
            z14 = false;
        } else {
            this.f14214g3 = x3Var;
        }
        if (z13 || (z14 && !z10)) {
            androidx.compose.ui.node.j jVar2 = this.f14217j3;
            if (jVar2 != null) {
                C9(jVar2);
            }
            this.f14217j3 = null;
            H9();
        }
        this.Y = z11;
        this.Z = z12;
        this.f14221p0 = c3Var;
        this.f14222p1 = jVar;
        this.H1 = m0Var;
        this.f14220m3 = K9();
        androidx.compose.foundation.gestures.u4 u4Var = this.f14216i3;
        if (u4Var != null) {
            u4Var.ua(v4Var, q3Var, J9(), z11, this.f14220m3, c3Var, jVar, m0Var);
        }
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.f14215h3;
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        y3 y3Var = (y3) androidx.compose.ui.node.i.a(this, a4.c());
        if (Intrinsics.areEqual(y3Var, this.f14218k3)) {
            return;
        }
        this.f14218k3 = y3Var;
        this.f14219l3 = null;
        androidx.compose.ui.node.j jVar = this.f14217j3;
        if (jVar != null) {
            C9(jVar);
        }
        this.f14217j3 = null;
        H9();
        androidx.compose.foundation.gestures.u4 u4Var = this.f14216i3;
        if (u4Var != null) {
            u4Var.ua(this.f14224w, this.X, J9(), this.Y, this.f14220m3, this.f14221p0, this.f14222p1, this.H1);
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        this.f14220m3 = K9();
        H9();
        if (this.f14216i3 == null) {
            this.f14216i3 = (androidx.compose.foundation.gestures.u4) v9(new androidx.compose.foundation.gestures.u4(this.f14224w, J9(), this.f14221p0, this.X, this.Y, this.f14220m3, this.f14222p1, this.H1));
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        androidx.compose.ui.node.j jVar = this.f14217j3;
        if (jVar != null) {
            C9(jVar);
        }
    }

    @Override // androidx.compose.ui.node.j
    public void z5() {
        boolean zK9 = K9();
        if (this.f14220m3 != zK9) {
            this.f14220m3 = zK9;
            L9(this.f14224w, this.X, this.f14223p2, J9(), this.Y, this.Z, this.f14221p0, this.f14222p1, this.H1);
        }
    }
}
