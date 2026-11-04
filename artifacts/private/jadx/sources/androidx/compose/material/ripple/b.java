package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.q0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@kotlin.l(message = "Replaced by the new RippleNode implementation")
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n85#2:363\n117#2,2:364\n85#2:366\n117#2,2:367\n132#3:369\n256#4:370\n1#5:371\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n215#1:363\n215#1:364,2\n223#1:366\n223#1:367,2\n244#1:369\n258#1:370\n*E\n"})
public final class b extends u implements m5, p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f24723o = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f24725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final n7<q0> f24726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n7<l> f24727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ViewGroup f24728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private o f24729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final n3 f24730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final n3 f24731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f24732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f24733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f24734n;

    public /* synthetic */ b(boolean z10, float f10, n7 n7Var, n7 n7Var2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, n7Var, n7Var2, viewGroup);
    }

    private final void l() {
        o oVar = this.f24729i;
        if (oVar != null) {
            oVar.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean m() {
        return ((Boolean) this.f24731k.getValue()).booleanValue();
    }

    private final o n() {
        o oVar = this.f24729i;
        if (oVar != null) {
            Intrinsics.checkNotNull(oVar);
            return oVar;
        }
        o oVarC = z.c(this.f24728h);
        this.f24729i = oVarC;
        Intrinsics.checkNotNull(oVarC);
        return oVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final s o() {
        return (s) this.f24730j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(b bVar) {
        bVar.q(!bVar.m());
        return Unit.f312394a;
    }

    private final void q(boolean z10) {
        this.f24731k.setValue(Boolean.valueOf(z10));
    }

    private final void r(s sVar) {
        this.f24730j.setValue(sVar);
    }

    @Override // androidx.compose.foundation.u2
    public void a(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        this.f24732l = cVar.d();
        this.f24733m = Float.isNaN(this.f24725e) ? kotlin.math.b.L0(n.a(cVar, this.f24724d, cVar.d())) : cVar.g6(this.f24725e);
        long jM = this.f24726f.getValue().M();
        float fD = this.f24727g.getValue().d();
        cVar.E4();
        d(cVar, this.f24725e, jM);
        k0 k0VarF = cVar.Z3().f();
        m();
        s sVarO = o();
        if (sVarO != null) {
            sVarO.f(cVar.d(), this.f24733m, jM, fD);
            sVarO.draw(androidx.compose.ui.graphics.c.d(k0VarF));
        }
    }

    @Override // androidx.compose.material.ripple.u
    public void c(@NotNull androidx.compose.foundation.interaction.l.b bVar, @NotNull s0 s0Var) {
        s sVarB = n().b(this);
        sVarB.b(bVar, this.f24724d, this.f24732l, this.f24733m, this.f24726f.getValue().M(), this.f24727g.getValue().d(), this.f24734n);
        r(sVarB);
    }

    @Override // androidx.compose.material.ripple.u
    public void e(@NotNull androidx.compose.foundation.interaction.l.b bVar) {
        s sVarO = o();
        if (sVarO != null) {
            sVarO.e();
        }
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        l();
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        l();
    }

    @Override // androidx.compose.material.ripple.p
    public void u7() {
        r(null);
    }

    private b(boolean z10, float f10, n7<q0> n7Var, n7<l> n7Var2, ViewGroup viewGroup) {
        super(z10, n7Var2);
        this.f24724d = z10;
        this.f24725e = f10;
        this.f24726f = n7Var;
        this.f24727g = n7Var2;
        this.f24728h = viewGroup;
        this.f24730j = d7.g(null, null, 2, null);
        this.f24731k = d7.g(Boolean.TRUE, null, 2, null);
        this.f24732l = n0.n.f332724b.c();
        this.f24733m = -1;
        this.f24734n = new Function0() { // from class: androidx.compose.material.ripple.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.p(this.f24710a);
            }
        };
    }
}
