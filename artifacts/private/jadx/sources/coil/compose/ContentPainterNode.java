package coil.compose;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.w2;
import androidx.compose.ui.layout.x2;
import androidx.compose.ui.layout.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContentPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 utils.kt\ncoil/compose/UtilsKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,249:1\n152#2:250\n152#2:251\n152#2:252\n152#2:253\n159#2:254\n159#2:257\n181#3:255\n181#3:256\n66#4,5:258\n66#4,5:263\n121#5,4:268\n*S KotlinDebug\n*F\n+ 1 ContentPainterModifier.kt\ncoil/compose/ContentPainterNode\n*L\n104#1:250\n118#1:251\n132#1:252\n147#1:253\n164#1:254\n191#1:257\n169#1:255\n170#1:256\n211#1:258,5\n223#1:263,5\n239#1:268,4\n*E\n"})
public final class ContentPainterNode extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t, androidx.compose.ui.node.g0 {
    public static final int X = 8;

    @NotNull
    private androidx.compose.ui.graphics.painter.b painter;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.e f86986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.layout.l f86987t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f86988v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private r0 f86989w;

    public ContentPainterNode(@NotNull androidx.compose.ui.graphics.painter.b bVar, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var) {
        this.painter = bVar;
        this.f86986s = eVar;
        this.f86987t = lVar;
        this.f86988v = f10;
        this.f86989w = r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A9(i2 i2Var, i2.a aVar) {
        i2.a.e0(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    private final long B9(long j10) {
        float fR;
        int iQ;
        float fD;
        boolean zN = androidx.compose.ui.unit.b.n(j10);
        boolean zL = androidx.compose.ui.unit.b.l(j10);
        if (!zN || !zL) {
            boolean z10 = androidx.compose.ui.unit.b.j(j10) && androidx.compose.ui.unit.b.i(j10);
            long jL = this.painter.l();
            if (jL != n0.n.f332724b.a()) {
                if (!z10 || (!zN && !zL)) {
                    float fT = n0.n.t(jL);
                    float fM = n0.n.m(jL);
                    fR = (Float.isInfinite(fT) || Float.isNaN(fT)) ? androidx.compose.ui.unit.b.r(j10) : g0.e(j10, fT);
                    if (Float.isInfinite(fM) || Float.isNaN(fM)) {
                        iQ = androidx.compose.ui.unit.b.q(j10);
                    } else {
                        fD = g0.d(j10, fM);
                    }
                    long jW9 = w9(n0.o.a(fR, fD));
                    return androidx.compose.ui.unit.b.d(j10, androidx.compose.ui.unit.c.i(j10, kotlin.math.b.L0(n0.n.t(jW9))), 0, androidx.compose.ui.unit.c.h(j10, kotlin.math.b.L0(n0.n.m(jW9))), 0, 10, null);
                }
                fR = androidx.compose.ui.unit.b.p(j10);
                iQ = androidx.compose.ui.unit.b.o(j10);
                fD = iQ;
                long jW10 = w9(n0.o.a(fR, fD));
                return androidx.compose.ui.unit.b.d(j10, androidx.compose.ui.unit.c.i(j10, kotlin.math.b.L0(n0.n.t(jW10))), 0, androidx.compose.ui.unit.c.h(j10, kotlin.math.b.L0(n0.n.m(jW10))), 0, 10, null);
            }
            if (z10) {
                int i10 = 4 << 0;
                return androidx.compose.ui.unit.b.d(j10, androidx.compose.ui.unit.b.p(j10), 0, androidx.compose.ui.unit.b.o(j10), 0, 10, null);
            }
        }
        return j10;
    }

    private final long w9(long j10) {
        if (n0.n.v(j10)) {
            return n0.n.f332724b.c();
        }
        long jL = this.painter.l();
        if (jL == n0.n.f332724b.a()) {
            return j10;
        }
        float fT = n0.n.t(jL);
        if (Float.isInfinite(fT) || Float.isNaN(fT)) {
            fT = n0.n.t(j10);
        }
        float fM = n0.n.m(jL);
        if (Float.isInfinite(fM) || Float.isNaN(fM)) {
            fM = n0.n.m(j10);
        }
        long jA = n0.o.a(fT, fM);
        long jA2 = this.f86987t.a(jA, j10);
        float fM2 = w2.m(jA2);
        if (!Float.isInfinite(fM2) && !Float.isNaN(fM2)) {
            float fO = w2.o(jA2);
            if (!Float.isInfinite(fO) && !Float.isNaN(fO)) {
                return x2.j(jA2, jA);
            }
        }
        return j10;
    }

    public final void C9(@NotNull androidx.compose.ui.e eVar) {
        this.f86986s = eVar;
    }

    public final void D9(@NotNull androidx.compose.ui.layout.l lVar) {
        this.f86987t = lVar;
    }

    public final void E9(@NotNull androidx.compose.ui.graphics.painter.b bVar) {
        this.painter = bVar;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        long jW9 = w9(cVar.d());
        long jA = this.f86986s.a(g0.p(jW9), g0.p(cVar.d()), cVar.getLayoutDirection());
        float fD = androidx.compose.ui.unit.q.d(jA);
        float fE = androidx.compose.ui.unit.q.e(jA);
        cVar.Z3().i().c(fD, fE);
        this.painter.g(cVar, jW9, this.f86988v, this.f86989w);
        cVar.Z3().i().c(-fD, -fE);
        cVar.E4();
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (this.painter.l() == n0.n.f332724b.a()) {
            return yVar.L0(i10);
        }
        int iL0 = yVar.L0(androidx.compose.ui.unit.b.o(B9(androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null))));
        return Math.max(kotlin.math.b.L0(n0.n.t(w9(n0.o.a(iL0, i10)))), iL0);
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (this.painter.l() == n0.n.f332724b.a()) {
            return yVar.M0(i10);
        }
        int iM0 = yVar.M0(androidx.compose.ui.unit.b.o(B9(androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null))));
        return Math.max(kotlin.math.b.L0(n0.n.t(w9(n0.o.a(iM0, i10)))), iM0);
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        final i2 i2VarP0 = z0Var.P0(B9(j10));
        return c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: coil.compose.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContentPainterNode.A9(i2VarP0, (i2.a) obj);
            }
        }, 4, null);
    }

    @Nullable
    public final r0 e() {
        return this.f86989w;
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (this.painter.l() == n0.n.f332724b.a()) {
            return yVar.p0(i10);
        }
        int iP0 = yVar.p0(androidx.compose.ui.unit.b.p(B9(androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null))));
        return Math.max(kotlin.math.b.L0(n0.n.m(w9(n0.o.a(i10, iP0)))), iP0);
    }

    public final void f(@Nullable r0 r0Var) {
        this.f86989w = r0Var;
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (this.painter.l() == n0.n.f332724b.a()) {
            return yVar.D0(i10);
        }
        int iD0 = yVar.D0(androidx.compose.ui.unit.b.p(B9(androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null))));
        return Math.max(kotlin.math.b.L0(n0.n.m(w9(n0.o.a(i10, iD0)))), iD0);
    }

    public final float r() {
        return this.f86988v;
    }

    public final void setAlpha(float f10) {
        this.f86988v = f10;
    }

    @NotNull
    public final androidx.compose.ui.e x9() {
        return this.f86986s;
    }

    @NotNull
    public final androidx.compose.ui.layout.l y9() {
        return this.f86987t;
    }

    @NotNull
    public final androidx.compose.ui.graphics.painter.b z9() {
        return this.painter;
    }
}
