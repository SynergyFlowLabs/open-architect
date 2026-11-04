package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.e6;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.l3;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.o0;
import androidx.compose.ui.graphics.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,474:1\n85#2:475\n117#2,2:476\n85#2:478\n117#2,2:479\n78#3:481\n111#3,2:482\n262#4:484\n263#4:505\n167#5,6:485\n249#5,14:491\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n188#1:475\n188#1:476,2\n190#1:478\n190#1:479,2\n226#1:481\n226#1:482,2\n240#1:484\n240#1:505\n240#1:485,6\n240#1:491,14\n*E\n"})
public final class VectorPainter extends androidx.compose.ui.graphics.painter.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f38280o = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n3 f38281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n3 f38282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n f38283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private o0 f38284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final l3 f38285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f38286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private r0 f38287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38288n;

    static final class a extends l0 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (VectorPainter.this.f38288n == VectorPainter.this.v()) {
                VectorPainter.this.D(VectorPainter.this.v() + 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i10) {
        this.f38285k.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v() {
        return this.f38285k.m1();
    }

    public final void A(boolean z10) {
        this.f38282h.setValue(Boolean.valueOf(z10));
    }

    public final void B(@Nullable o0 o0Var) {
        this.f38284j = o0Var;
    }

    public final void C(@Nullable r0 r0Var) {
        this.f38283i.p(r0Var);
    }

    public final void E(@NotNull String str) {
        this.f38283i.r(str);
    }

    public final void F(long j10) {
        this.f38281g.setValue(n0.n.c(j10));
    }

    public final void G(long j10) {
        this.f38283i.s(j10);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean a(float f10) {
        this.f38286l = f10;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean b(@Nullable r0 r0Var) {
        this.f38287m = r0Var;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        return x();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        n nVar = this.f38283i;
        r0 r0VarK = this.f38287m;
        if (r0VarK == null) {
            r0VarK = nVar.k();
        }
        if (r() && fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl) {
            long jY = fVar.Y();
            androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
            long jD = dVarZ3.d();
            dVarZ3.f().save();
            try {
                dVarZ3.i().g(-1.0f, 1.0f, jY);
                nVar.i(fVar, this.f38286l, r0VarK);
                dVarZ3.f().B();
                dVarZ3.g(jD);
            } catch (Throwable th2) {
                dVarZ3.f().B();
                dVarZ3.g(jD);
                throw th2;
            }
        } else {
            nVar.i(fVar, this.f38286l, r0VarK);
        }
        this.f38288n = v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.f38282h.getValue()).booleanValue();
    }

    public final int s() {
        return this.f38283i.j();
    }

    @Nullable
    public final o0 t() {
        return this.f38284j;
    }

    @Nullable
    public final r0 u() {
        return this.f38283i.k();
    }

    @NotNull
    public final String w() {
        return this.f38283i.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long x() {
        return ((n0.n) this.f38281g.getValue()).y();
    }

    @NotNull
    public final n y() {
        return this.f38283i;
    }

    public final long z() {
        return this.f38283i.o();
    }

    public VectorPainter(@NotNull c cVar) {
        this.f38281g = d7.g(n0.n.c(n0.n.f332724b.c()), null, 2, null);
        this.f38282h = d7.g(Boolean.FALSE, null, 2, null);
        n nVar = new n(cVar);
        nVar.q(new a());
        this.f38283i = nVar;
        this.f38285k = e6.b(0);
        this.f38286l = 1.0f;
        int i10 = 4 ^ (-1);
        this.f38288n = -1;
    }

    public /* synthetic */ VectorPainter(c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new c() : cVar);
    }
}
