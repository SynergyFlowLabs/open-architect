package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
final class x extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t, androidx.compose.ui.node.q1, androidx.compose.ui.node.i2 {

    @Nullable
    private androidx.compose.ui.graphics.q3 H1;
    private final boolean X;
    private final boolean Y;
    private long Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.w f21876p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.f2 f21877p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.f2 f21878p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f21879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.i0 f21880t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f21881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.graphics.q3 f21882w;

    public /* synthetic */ x(long j10, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.q3 q3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i0Var, f10, q3Var);
    }

    private final void w9(androidx.compose.ui.graphics.drawscope.c cVar) {
        androidx.compose.ui.graphics.drawscope.c cVar2;
        androidx.compose.ui.graphics.f2 f2VarY9 = y9(cVar);
        if (androidx.compose.ui.graphics.q0.y(this.f21879s, androidx.compose.ui.graphics.q0.f38131b.u())) {
            cVar2 = cVar;
        } else {
            int i10 = 7 & 0;
            cVar2 = cVar;
            androidx.compose.ui.graphics.g2.f(cVar2, f2VarY9, this.f21879s, 0.0f, null, null, 0, 60, null);
        }
        androidx.compose.ui.graphics.i0 i0Var = this.f21880t;
        if (i0Var != null) {
            androidx.compose.ui.graphics.g2.d(cVar2, f2VarY9, i0Var, this.f21881v, null, null, 0, 56, null);
        }
    }

    private final void x9(androidx.compose.ui.graphics.drawscope.c cVar) {
        if (!androidx.compose.ui.graphics.q0.y(this.f21879s, androidx.compose.ui.graphics.q0.f38131b.u())) {
            androidx.compose.ui.graphics.drawscope.f.V3(cVar, this.f21879s, 0L, 0L, 0.0f, null, null, 0, okhttp3.internal.ws.g.f334652s, null);
        }
        androidx.compose.ui.graphics.i0 i0Var = this.f21880t;
        if (i0Var != null) {
            androidx.compose.ui.graphics.drawscope.f.b3(cVar, i0Var, 0L, 0L, this.f21881v, null, null, 0, 118, null);
        }
    }

    private final androidx.compose.ui.graphics.f2 y9(final androidx.compose.ui.graphics.drawscope.c cVar) {
        androidx.compose.ui.graphics.f2 f2Var;
        if (n0.n.k(cVar.d(), this.Z) && cVar.getLayoutDirection() == this.f21876p0 && Intrinsics.areEqual(this.H1, this.f21882w)) {
            f2Var = this.f21877p1;
            Intrinsics.checkNotNull(f2Var);
        } else {
            androidx.compose.ui.node.r1.a(this, new Function0() { // from class: androidx.compose.foundation.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.z9(this.f21861a, cVar);
                }
            });
            f2Var = this.f21878p2;
            this.f21878p2 = null;
        }
        this.f21877p1 = f2Var;
        this.Z = cVar.d();
        this.f21876p0 = cVar.getLayoutDirection();
        this.H1 = this.f21882w;
        Intrinsics.checkNotNull(f2Var);
        return f2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z9(x xVar, androidx.compose.ui.graphics.drawscope.c cVar) {
        xVar.f21878p2 = xVar.f21882w.mo0createOutlinePq9zytI(cVar.d(), cVar.getLayoutDirection(), cVar);
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.i2
    public boolean N4() {
        return this.Y;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        if (this.f21882w == androidx.compose.ui.graphics.d3.a()) {
            x9(cVar);
        } else {
            w9(cVar);
        }
        cVar.E4();
    }

    public final void P6(@Nullable androidx.compose.ui.graphics.i0 i0Var) {
        this.f21880t = i0Var;
    }

    public final void Q3(@NotNull androidx.compose.ui.graphics.q3 q3Var) {
        this.f21882w = q3Var;
    }

    public final void S(long j10) {
        this.f21879s = j10;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.X;
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        this.Z = n0.n.f332724b.a();
        this.f21876p0 = null;
        this.f21877p1 = null;
        this.H1 = null;
        androidx.compose.ui.node.u.a(this);
    }

    @Nullable
    public final androidx.compose.ui.graphics.i0 o0() {
        return this.f21880t;
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
    }

    public final float r() {
        return this.f21881v;
    }

    public final void setAlpha(float f10) {
        this.f21881v = f10;
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 t3() {
        return this.f21882w;
    }

    public final long u() {
        return this.f21879s;
    }

    private x(long j10, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.q3 q3Var) {
        this.f21879s = j10;
        this.f21880t = i0Var;
        this.f21881v = f10;
        this.f21882w = q3Var;
        this.Z = n0.n.f332724b.a();
    }
}
