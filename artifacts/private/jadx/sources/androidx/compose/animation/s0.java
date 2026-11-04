package androidx.compose.animation;

import androidx.compose.runtime.g4;
import androidx.compose.runtime.k3;
import androidx.compose.ui.graphics.k2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n81#2:155\n114#2,2:156\n1#3:158\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n*L\n94#1:155\n94#1:156,2\n*E\n"})
public final class s0 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.t, androidx.compose.ui.modifier.j {
    public static final int Y = 8;

    @Nullable
    private a X;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private b1 f13710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private Function0<Boolean> f13711t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private Function2<? super androidx.compose.ui.unit.w, ? super androidx.compose.ui.unit.d, ? extends k2> f13712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final k3 f13713w;

    @SourceDebugExtension({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,154:1\n71#2:155\n65#2:156\n73#2:159\n69#2:160\n60#3:157\n70#3:161\n22#4:158\n221#5,5:162\n249#5,9:167\n120#5,7:176\n259#5,4:183\n120#5,7:187\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n*L\n109#1:155\n109#1:156\n109#1:159\n109#1:160\n109#1:157\n109#1:161\n109#1:158\n116#1:162,5\n116#1:167,9\n116#1:176,7\n116#1:183,4\n118#1:187,7\n*E\n"})
    private final class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.graphics.layer.c f13714a;

        public a(androidx.compose.ui.graphics.layer.c cVar) {
            this.f13714a = cVar;
        }

        @Override // androidx.compose.animation.n0
        @Nullable
        public y0 a() {
            return s0.this.x9();
        }

        @Override // androidx.compose.animation.n0
        public float b() {
            return s0.this.A9();
        }

        @Override // androidx.compose.animation.n0
        public void c(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
            if (s0.this.y9().invoke().booleanValue()) {
                s0 s0Var = s0.this;
                long jR0 = s0Var.z9().n().r0(androidx.compose.ui.node.k.s(s0Var), n0.g.f332700b.e());
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jR0 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR0 & com.rabbitmq.client.k0.f265952a));
                k2 k2VarInvoke = s0Var.v9().invoke(fVar.getLayoutDirection(), androidx.compose.ui.node.k.q(s0Var));
                if (k2VarInvoke == null) {
                    fVar.Z3().i().c(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        androidx.compose.ui.graphics.layer.e.a(fVar, this.f13714a);
                        androidx.compose.ui.graphics.drawscope.j jVarI = fVar.Z3().i();
                        return;
                    } finally {
                        fVar.Z3().i().c(-fIntBitsToFloat, -fIntBitsToFloat2);
                    }
                }
                int iB = androidx.compose.ui.graphics.p0.f38096b.b();
                androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
                long jD = dVarZ3.d();
                dVarZ3.f().save();
                try {
                    dVarZ3.i().e(k2VarInvoke, iB);
                    fVar.Z3().i().c(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        androidx.compose.ui.graphics.layer.e.a(fVar, this.f13714a);
                        fVar.Z3().i().c(-fIntBitsToFloat, -fIntBitsToFloat2);
                        dVarZ3.f().B();
                        dVarZ3.g(jD);
                    } catch (Throwable th2) {
                        fVar.Z3().i().c(-fIntBitsToFloat, -fIntBitsToFloat2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    dVarZ3.f().B();
                    dVarZ3.g(jD);
                    throw th3;
                }
            }
        }

        @NotNull
        public final androidx.compose.ui.graphics.layer.c d() {
            return this.f13714a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.drawscope.f, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.drawscope.c f13716a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.graphics.drawscope.c cVar) {
            super(1);
            this.f13716a = cVar;
        }

        public final void c(androidx.compose.ui.graphics.drawscope.f fVar) {
            this.f13716a.E4();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            c(fVar);
            return Unit.f312394a;
        }
    }

    public s0(@NotNull b1 b1Var, @NotNull Function0<Boolean> function0, float f10, @NotNull Function2<? super androidx.compose.ui.unit.w, ? super androidx.compose.ui.unit.d, ? extends k2> function2) {
        this.f13710s = b1Var;
        this.f13711t = function0;
        this.f13712v = function2;
        this.f13713w = g4.b(f10);
    }

    public final float A9() {
        return this.f13713w.V0();
    }

    public final void B9(@NotNull Function2<? super androidx.compose.ui.unit.w, ? super androidx.compose.ui.unit.d, ? extends k2> function2) {
        this.f13712v = function2;
    }

    public final void C9(@NotNull Function0<Boolean> function0) {
        this.f13711t = function0;
    }

    public final void D9(@NotNull b1 b1Var) {
        this.f13710s = b1Var;
    }

    public final void E9(float f10) {
        this.f13713w.q(f10);
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        androidx.compose.ui.graphics.layer.c cVarW9 = w9();
        if (cVarW9 == null) {
            throw new IllegalArgumentException("Error: layer never initialized");
        }
        androidx.compose.ui.graphics.drawscope.f.m4(cVar, cVarW9, 0L, new b(cVar), 1, null);
        if (!this.f13711t.invoke().booleanValue()) {
            androidx.compose.ui.graphics.layer.e.a(cVar, cVarW9);
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        a aVar = new a(androidx.compose.ui.node.k.r(this).b());
        this.f13710s.r(aVar);
        this.X = aVar;
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        a aVar = this.X;
        if (aVar != null) {
            this.f13710s.s(aVar);
            androidx.compose.ui.node.k.r(this).c(aVar.d());
        }
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, k2> v9() {
        return this.f13712v;
    }

    @Nullable
    public final androidx.compose.ui.graphics.layer.c w9() {
        a aVar = this.X;
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    @Nullable
    public final y0 x9() {
        return (y0) I(w0.a());
    }

    @NotNull
    public final Function0<Boolean> y9() {
        return this.f13711t;
    }

    @NotNull
    public final b1 z9() {
        return this.f13710s;
    }
}
