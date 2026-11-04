package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import androidx.compose.ui.node.q1;
import androidx.compose.ui.node.r1;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/BlockInnerShadowNode\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,865:1\n635#2:866\n1#3:867\n65#4:868\n69#4:871\n60#5:869\n70#5:872\n53#5,3:874\n22#6:870\n188#7:873\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/BlockInnerShadowNode\n*L\n492#1:866\n565#1:868\n565#1:871\n565#1:869\n565#1:872\n565#1:874,3\n565#1:870\n565#1:873\n*E\n"})
public final class c extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t, q1, s {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f37263i3 = 0;
    private boolean X;

    @NotNull
    private Function1<? super s, Unit> Y;
    private float Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f37266p0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private i0 f37268p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private q3 f37269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.d f37270t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.graphics.shadow.j f37271v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private InnerShadowPainter f37272w;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private long f37267p1 = n0.g.f332700b.e();
    private long H1 = q0.f38131b.a();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private float f37264g3 = 1.0f;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f37265h3 = d0.f37693b.B();

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
            c.this.Y.invoke(c.this);
        }
    }

    public c(@NotNull q3 q3Var, @NotNull Function1<? super s, Unit> function1) {
        this.f37269s = q3Var;
        this.Y = function1;
    }

    private final void A9() {
        androidx.compose.ui.unit.d dVarQ = androidx.compose.ui.node.k.q(this);
        if (Intrinsics.areEqual(this.f37270t, dVarQ)) {
            return;
        }
        this.f37270t = dVarQ;
        this.Y.invoke(this);
        w9();
    }

    private final void w9() {
        this.f37271v = null;
        this.f37272w = null;
        androidx.compose.ui.node.u.a(this);
    }

    private final InnerShadowPainter x9() {
        if (!this.X) {
            this.X = true;
            r1.a(this, new a());
        }
        androidx.compose.ui.graphics.shadow.j jVar = this.f37271v;
        InnerShadowPainter innerShadowPainter = this.f37272w;
        i0 i0VarO0 = o0();
        float fF3 = F3(R());
        float fF4 = F3(K5());
        float fF5 = F3(Float.intBitsToFloat((int) (O3() >> 32)));
        long jD = androidx.compose.ui.unit.j.d((((long) Float.floatToRawIntBits(F3(Float.intBitsToFloat((int) (O3() & k0.f265952a))))) & k0.f265952a) | (((long) Float.floatToRawIntBits(fF5)) << 32));
        if (innerShadowPainter != null && jVar != null && androidx.compose.ui.unit.h.x(jVar.g(), fF3) && androidx.compose.ui.unit.h.x(jVar.h(), fF4) && q0.y(jVar.e(), u()) && Intrinsics.areEqual(jVar.d(), i0VarO0) && jVar.b() == r() && d0.G(jVar.c(), t()) && androidx.compose.ui.unit.j.h(jVar.f(), jD)) {
            return innerShadowPainter;
        }
        androidx.compose.ui.graphics.shadow.j jVar2 = i0VarO0 != null ? new androidx.compose.ui.graphics.shadow.j(fF3, i0VarO0, fF4, jD, r(), t(), (DefaultConstructorMarker) null) : new androidx.compose.ui.graphics.shadow.j(fF3, u(), fF4, jD, r(), t(), (DefaultConstructorMarker) null);
        this.f37271v = jVar2;
        InnerShadowPainter innerShadowPainterE = androidx.compose.ui.node.k.r(this).a().e(this.f37269s, jVar2);
        this.f37272w = innerShadowPainterE;
        return innerShadowPainterE;
    }

    private final void y9(Function1<? super s, Unit> function1) {
        if (this.Y != function1) {
            this.Y = function1;
            this.X = false;
            androidx.compose.ui.node.u.a(this);
        }
    }

    @Override // androidx.compose.ui.draw.y
    public float K5() {
        return this.f37266p0;
    }

    @Override // androidx.compose.ui.draw.y
    public long O3() {
        return this.f37267p1;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        androidx.compose.ui.graphics.painter.b.h(x9(), cVar, cVar.d(), 0.0f, null, 6, null);
        cVar.E4();
    }

    @Override // androidx.compose.ui.draw.y
    public void P6(@Nullable i0 i0Var) {
        if (Intrinsics.areEqual(this.f37268p2, i0Var)) {
            return;
        }
        this.f37268p2 = i0Var;
        w9();
    }

    @Override // androidx.compose.ui.draw.y
    public float R() {
        return this.Z;
    }

    @Override // androidx.compose.ui.draw.y
    public void S(long j10) {
        if (j10 == 16) {
            j10 = q0.f38131b.a();
        }
        if (q0.y(this.H1, j10)) {
            return;
        }
        this.H1 = j10;
        w9();
    }

    @Override // androidx.compose.ui.node.q1
    public void Y5() {
        w9();
        this.X = false;
    }

    @Override // androidx.compose.ui.draw.y
    public void c2(float f10) {
        if (this.Z == f10) {
            return;
        }
        this.Z = f10;
        w9();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        super.e9();
        A9();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            if (r() == cVar.r()) {
                if (!Intrinsics.areEqual(this.f37269s, cVar.f37269s) || this.Y != cVar.Y) {
                    return false;
                }
                if (R() == cVar.R() && K5() == cVar.K5()) {
                    return n0.g.l(O3(), cVar.O3()) && q0.y(u(), cVar.u()) && Intrinsics.areEqual(o0(), cVar.o0()) && d0.G(t(), cVar.t());
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        androidx.compose.ui.unit.d dVar = this.f37270t;
        if (dVar != null) {
            return dVar.getDensity();
        }
        return 1.0f;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Float.hashCode(r()) * 31) + this.f37269s.hashCode()) * 31) + this.Y.hashCode()) * 31) + Float.hashCode(R())) * 31) + Float.hashCode(K5())) * 31) + n0.g.t(O3())) * 31) + q0.K(u())) * 31;
        i0 i0VarO0 = o0();
        return ((iHashCode + (i0VarO0 != null ? i0VarO0.hashCode() : 0)) * 31) + d0.H(t());
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.d2
    public void l0() {
        if (a9()) {
            A9();
        }
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        androidx.compose.ui.unit.d dVar = this.f37270t;
        if (dVar != null) {
            return dVar.m0();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.draw.y
    @Nullable
    public i0 o0() {
        return this.f37268p2;
    }

    @Override // androidx.compose.ui.draw.y
    public void q7(long j10) {
        if (n0.g.l(this.f37267p1, j10)) {
            return;
        }
        this.f37267p1 = j10;
        w9();
    }

    @Override // androidx.compose.ui.draw.y
    public float r() {
        return this.f37264g3;
    }

    @Override // androidx.compose.ui.draw.y
    public void s(int i10) {
        if (d0.G(this.f37265h3, i10)) {
            return;
        }
        this.f37265h3 = i10;
        w9();
    }

    @Override // androidx.compose.ui.draw.y
    public void setAlpha(float f10) {
        if (this.f37264g3 == f10) {
            return;
        }
        this.f37264g3 = f10;
        w9();
    }

    @Override // androidx.compose.ui.draw.y
    public int t() {
        return this.f37265h3;
    }

    @Override // androidx.compose.ui.draw.y
    public long u() {
        return this.H1;
    }

    @Override // androidx.compose.ui.draw.y
    public void y3(float f10) {
        if (this.f37266p0 == f10) {
            return;
        }
        this.f37266p0 = f10;
        w9();
    }

    public final void z9(@NotNull q3 q3Var, @NotNull Function1<? super s, Unit> function1) {
        this.f37269s = q3Var;
        y9(function1);
    }
}
