package androidx.compose.ui.node;

import androidx.compose.runtime.k7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n233#2:154\n305#2,15:250\n321#2,10:266\n78#3,5:155\n86#4:160\n86#4:204\n86#4:205\n86#4:206\n450#5,6:161\n460#5,2:168\n462#5,8:173\n470#5,9:184\n479#5,8:196\n450#5,6:207\n460#5,2:214\n462#5,8:219\n470#5,9:230\n479#5,8:242\n247#6:167\n247#6:213\n240#7,3:170\n243#7,3:193\n240#7,3:216\n243#7,3:239\n1107#8:181\n1085#8,2:182\n1107#8:227\n1085#8,2:228\n1#9:265\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n47#1:154\n131#1:250,15\n131#1:266,10\n49#1:155,5\n64#1:160\n71#1:204\n106#1:205\n119#1:206\n64#1:161,6\n64#1:168,2\n64#1:173,8\n64#1:184,9\n64#1:196,8\n119#1:207,6\n119#1:214,2\n119#1:219,8\n119#1:230,9\n119#1:242,8\n64#1:167\n119#1:213\n64#1:170,3\n64#1:193,3\n119#1:216,3\n119#1:239,3\n64#1:181\n64#1:182,2\n119#1:227\n119#1:228,2\n*E\n"})
public final class n0 implements androidx.compose.ui.graphics.drawscope.f, androidx.compose.ui.graphics.drawscope.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39918c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.drawscope.a f39919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private t f39920b;

    @SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope$record$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,153:1\n305#2,26:154\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope$record$1\n*L\n88#1:154,26\n*E\n"})
    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f39922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.graphics.drawscope.f, Unit> f39923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(t tVar, Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
            super(1);
            this.f39922b = tVar;
            this.f39923c = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.node.t] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.t] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.graphics.drawscope.d] */
        /* JADX WARN: Type inference failed for: r2v5 */
        public final void c(androidx.compose.ui.graphics.drawscope.f fVar) throws Throwable {
            ?? Z3 = n0.this.f39920b;
            n0.this.f39920b = this.f39922b;
            try {
                n0 n0Var = n0.this;
                androidx.compose.ui.unit.d density = fVar.Z3().getDensity();
                androidx.compose.ui.unit.w layoutDirection = fVar.Z3().getLayoutDirection();
                androidx.compose.ui.graphics.k0 k0VarF = fVar.Z3().f();
                long jD = fVar.Z3().d();
                androidx.compose.ui.graphics.layer.c cVarH = fVar.Z3().h();
                Function1<androidx.compose.ui.graphics.drawscope.f, Unit> function1 = this.f39923c;
                androidx.compose.ui.unit.d density2 = n0Var.Z3().getDensity();
                androidx.compose.ui.unit.w layoutDirection2 = n0Var.Z3().getLayoutDirection();
                androidx.compose.ui.graphics.k0 k0VarF2 = n0Var.Z3().f();
                long jD2 = n0Var.Z3().d();
                androidx.compose.ui.graphics.layer.c cVarH2 = n0Var.Z3().h();
                try {
                    Z3 = n0Var.Z3();
                    Z3.e(density);
                    Z3.b(layoutDirection);
                    Z3.k(k0VarF);
                    Z3.g(jD);
                    Z3.j(cVarH);
                    k0VarF.save();
                    try {
                        function1.invoke(n0Var);
                        k0VarF.B();
                        androidx.compose.ui.graphics.drawscope.d dVarZ3 = n0Var.Z3();
                        dVarZ3.e(density2);
                        dVarZ3.b(layoutDirection2);
                        dVarZ3.k(k0VarF2);
                        dVarZ3.g(jD2);
                        dVarZ3.j(cVarH2);
                        n0.this.f39920b = Z3;
                    } catch (Throwable th2) {
                        Z3 = Z3;
                        k0VarF.B();
                        androidx.compose.ui.graphics.drawscope.d dVarZ4 = n0Var.Z3();
                        dVarZ4.e(density2);
                        dVarZ4.b(layoutDirection2);
                        dVarZ4.k(k0VarF2);
                        dVarZ4.g(jD2);
                        dVarZ4.j(cVarH2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    Z3 = Z3;
                    n0.this.f39920b = Z3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                n0.this.f39920b = Z3;
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) throws Throwable {
            c(fVar);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long C0(long j10) {
        return this.f39919a.C0(j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void C2(@NotNull androidx.compose.ui.graphics.t1 t1Var, long j10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.C2(t1Var, j10, f10, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void C7(@NotNull androidx.compose.ui.graphics.i0 i0Var, long j10, long j11, long j12, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.C7(i0Var, j10, j11, j12, f10, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float D3(int i10) {
        return this.f39919a.D3(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    @Override // androidx.compose.ui.graphics.drawscope.c
    public void E4() {
        androidx.compose.ui.graphics.k0 k0VarF = Z3().f();
        t tVar = this.f39920b;
        if (tVar == null) {
            s0.a.j("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new kotlin.a0();
        }
        androidx.compose.ui.a0.d dVarB = o0.b(tVar);
        if (dVarB == 0) {
            k1 k1VarP = k.p(tVar, m1.b(4));
            if (k1VarP.V4() == tVar.w()) {
                k1VarP = k1VarP.Y4();
                Intrinsics.checkNotNull(k1VarP);
            }
            k1VarP.q6(k0VarF, Z3().h());
            return;
        }
        int iB = m1.b(4);
        androidx.compose.runtime.collection.d dVar = null;
        while (dVarB != 0) {
            if (dVarB instanceof t) {
                K((t) dVarB, k0VarF, Z3().h());
            } else if ((dVarB.T8() & iB) != 0 && (dVarB instanceof m)) {
                androidx.compose.ui.a0.d dVarY9 = ((m) dVarB).y9();
                int i10 = 0;
                dVarB = dVarB;
                while (dVarY9 != null) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i10++;
                        if (i10 == 1) {
                            dVarB = dVarY9;
                        } else {
                            if (dVar == null) {
                                dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            if (dVarB != 0) {
                                dVar.d(dVarB);
                                dVarB = 0;
                            }
                            dVar.d(dVarY9);
                        }
                    }
                    dVarY9 = dVarY9.O8();
                    dVarB = dVarB;
                }
                if (i10 == 1) {
                }
            }
            dVarB = k.n(dVar);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void F1(@NotNull androidx.compose.ui.graphics.k2 k2Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.F1(k2Var, i0Var, f10, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float F3(float f10) {
        return this.f39919a.F3(f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @kotlin.b1(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public /* synthetic */ void F6(androidx.compose.ui.graphics.t1 t1Var, long j10, long j11, long j12, long j13, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, androidx.compose.ui.graphics.drawscope.i iVar, androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.F6(t1Var, j10, j11, j12, j13, f10, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void H3(@NotNull androidx.compose.ui.graphics.layer.c cVar, long j10, @NotNull Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        cVar.P(this, getLayoutDirection(), j10, new a(this.f39920b, function1));
    }

    public final void I(@NotNull androidx.compose.ui.graphics.k0 k0Var, long j10, @NotNull k1 k1Var, @NotNull t tVar, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        t tVar2 = this.f39920b;
        this.f39920b = tVar;
        androidx.compose.ui.graphics.drawscope.a aVar = this.f39919a;
        androidx.compose.ui.unit.w layoutDirection = k1Var.getLayoutDirection();
        androidx.compose.ui.unit.d density = aVar.Z3().getDensity();
        androidx.compose.ui.unit.w layoutDirection2 = aVar.Z3().getLayoutDirection();
        androidx.compose.ui.graphics.k0 k0VarF = aVar.Z3().f();
        long jD = aVar.Z3().d();
        androidx.compose.ui.graphics.layer.c cVarH = aVar.Z3().h();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = aVar.Z3();
        dVarZ3.e(k1Var);
        dVarZ3.b(layoutDirection);
        dVarZ3.k(k0Var);
        dVarZ3.g(j10);
        dVarZ3.j(cVar);
        k0Var.save();
        try {
            tVar.P(this);
            k0Var.B();
            androidx.compose.ui.graphics.drawscope.d dVarZ4 = aVar.Z3();
            dVarZ4.e(density);
            dVarZ4.b(layoutDirection2);
            dVarZ4.k(k0VarF);
            dVarZ4.g(jD);
            dVarZ4.j(cVarH);
            this.f39920b = tVar2;
        } catch (Throwable th2) {
            k0Var.B();
            androidx.compose.ui.graphics.drawscope.d dVarZ5 = aVar.Z3();
            dVarZ5.e(density);
            dVarZ5.b(layoutDirection2);
            dVarZ5.k(k0VarF);
            dVarZ5.g(jD);
            dVarZ5.j(cVarH);
            throw th2;
        }
    }

    @NotNull
    public final androidx.compose.ui.graphics.drawscope.a J() {
        return this.f39919a;
    }

    public final void K(@NotNull t tVar, @NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        k1 k1VarP = k.p(tVar, m1.b(4));
        k1VarP.i4().u0().I(k0Var, androidx.compose.ui.unit.v.h(k1VarP.a()), k1VarP, tVar, cVar);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void L2(@NotNull androidx.compose.ui.graphics.i0 i0Var, long j10, long j11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.L2(i0Var, j10, j11, f10, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    @NotNull
    public n0.j N3(@NotNull androidx.compose.ui.unit.k kVar) {
        return this.f39919a.N3(kVar);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void O7(@NotNull androidx.compose.ui.graphics.i0 i0Var, long j10, long j11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.O7(i0Var, j10, j11, f10, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void R2(long j10, long j11, long j12, float f10, int i10, @Nullable androidx.compose.ui.graphics.l2 l2Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i11) {
        this.f39919a.R2(j10, j11, j12, f10, i10, l2Var, f11, r0Var, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void S2(@NotNull androidx.compose.ui.graphics.i0 i0Var, float f10, float f11, boolean z10, long j10, long j11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f12, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.S2(i0Var, f10, f11, z10, j10, j11, f12, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float S7(float f10) {
        return this.f39919a.S7(f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void T2(@NotNull androidx.compose.ui.graphics.k2 k2Var, long j10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.T2(k2Var, j10, f10, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void V7(@NotNull List<n0.g> list, int i10, long j10, float f10, int i11, @Nullable androidx.compose.ui.graphics.l2 l2Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i12) {
        this.f39919a.V7(list, i10, j10, f10, i11, l2Var, f11, r0Var, i12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void W6(long j10, long j11, long j12, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.W6(j10, j11, j12, f10, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public long Y() {
        return this.f39919a.Y();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @NotNull
    public androidx.compose.ui.graphics.drawscope.d Z3() {
        return this.f39919a.Z3();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void a8(@NotNull androidx.compose.ui.graphics.i0 i0Var, long j10, long j11, float f10, int i10, @Nullable androidx.compose.ui.graphics.l2 l2Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i11) {
        this.f39919a.a8(i0Var, j10, j11, f10, i10, l2Var, f11, r0Var, i11);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int c8(long j10) {
        return this.f39919a.c8(j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public long d() {
        return this.f39919a.d();
    }

    @Override // androidx.compose.ui.unit.n
    @k7
    public long d0(float f10) {
        return this.f39919a.d0(f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void f3(long j10, float f10, long j11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.f3(j10, f10, j11, f11, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public int g6(float f10) {
        return this.f39919a.g6(f10);
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f39919a.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @NotNull
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.f39919a.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void i3(long j10, long j11, long j12, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.i3(j10, j11, j12, f10, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long j1(int i10) {
        return this.f39919a.j1(i10);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long k4(long j10) {
        return this.f39919a.k4(j10);
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f39919a.m0();
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public long m1(float f10) {
        return this.f39919a.m1(f10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void m8(@NotNull androidx.compose.ui.graphics.i0 i0Var, float f10, long j10, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.m8(i0Var, f10, j10, f11, iVar, r0Var, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void n6(long j10, long j11, long j12, long j13, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.n6(j10, j11, j12, j13, iVar, f10, r0Var, i10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void n8(@NotNull androidx.compose.ui.graphics.t1 t1Var, long j10, long j11, long j12, long j13, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10, int i11) {
        this.f39919a.n8(t1Var, j10, j11, j12, j13, f10, iVar, r0Var, i10, i11);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void o1(@NotNull List<n0.g> list, int i10, @NotNull androidx.compose.ui.graphics.i0 i0Var, float f10, int i11, @Nullable androidx.compose.ui.graphics.l2 l2Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f11, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i12) {
        this.f39919a.o1(list, i10, i0Var, f10, i11, l2Var, f11, r0Var, i12);
    }

    @Override // androidx.compose.ui.unit.d
    @k7
    public float p6(long j10) {
        return this.f39919a.p6(j10);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void r3(long j10, float f10, float f11, boolean z10, long j11, long j12, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f12, @NotNull androidx.compose.ui.graphics.drawscope.i iVar, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10) {
        this.f39919a.r3(j10, f10, f11, z10, j11, j12, f12, iVar, r0Var, i10);
    }

    public final void x(@NotNull androidx.compose.ui.graphics.k0 k0Var, long j10, @NotNull k1 k1Var, @NotNull androidx.compose.ui.a0.d dVar, @Nullable androidx.compose.ui.graphics.layer.c cVar) {
        int iB = m1.b(4);
        androidx.compose.ui.a0.d dVarN = dVar;
        androidx.compose.runtime.collection.d dVar2 = null;
        while (dVarN != null) {
            if (dVarN instanceof t) {
                I(k0Var, j10, k1Var, (t) dVarN, cVar);
            } else if ((dVarN.T8() & iB) != 0 && (dVarN instanceof m)) {
                int i10 = 0;
                for (androidx.compose.ui.a0.d dVarY9 = ((m) dVarN).y9(); dVarY9 != null; dVarY9 = dVarY9.O8()) {
                    if ((dVarY9.T8() & iB) != 0) {
                        i10++;
                        if (i10 == 1) {
                            dVarN = dVarY9;
                        } else {
                            if (dVar2 == null) {
                                dVar2 = new androidx.compose.runtime.collection.d(new androidx.compose.ui.a0.d[16], 0);
                            }
                            if (dVarN != null) {
                                dVar2.d(dVarN);
                                dVarN = null;
                            }
                            dVar2.d(dVarY9);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            dVarN = k.n(dVar2);
        }
    }

    @Override // androidx.compose.ui.unit.n
    @k7
    public float y(long j10) {
        return this.f39919a.y(j10);
    }

    public n0(@NotNull androidx.compose.ui.graphics.drawscope.a aVar) {
        this.f39919a = aVar;
    }

    public /* synthetic */ n0(androidx.compose.ui.graphics.drawscope.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }
}
