package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/WrapContentNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1134:1\n30#2:1135\n80#3:1136\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/WrapContentNode\n*L\n1035#1:1135\n1035#1:1136\n*E\n"})
final class g8 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private r1 f16060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16061t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> f16062v;

    public g8(@NotNull r1 r1Var, boolean z10, @NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> function2) {
        this.f16060s = r1Var;
        this.f16061t = z10;
        this.f16062v = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z9(g8 g8Var, int i10, androidx.compose.ui.layout.i2 i2Var, int i11, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2.a aVar) {
        int i12 = 2 << 0;
        androidx.compose.ui.layout.i2.a.V(aVar, i2Var, g8Var.f16062v.invoke(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.u.e((((long) (i10 - i2Var.h1())) << 32) | (((long) (i11 - i2Var.c1())) & com.rabbitmq.client.k0.f265952a))), c1Var.getLayoutDirection()).x(), 0.0f, 2, null);
        return Unit.f312394a;
    }

    public final void A9(@NotNull Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> function2) {
        this.f16062v = function2;
    }

    public final void B9(@NotNull r1 r1Var) {
        this.f16060s = r1Var;
    }

    public final void C9(boolean z10) {
        this.f16061t = z10;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        r1 r1Var = this.f16060s;
        r1 r1Var2 = r1.Vertical;
        int iR = r1Var != r1Var2 ? 0 : androidx.compose.ui.unit.b.r(j10);
        r1 r1Var3 = this.f16060s;
        r1 r1Var4 = r1.Horizontal;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.a(iR, (this.f16060s == r1Var2 || !this.f16061t) ? androidx.compose.ui.unit.b.p(j10) : Integer.MAX_VALUE, r1Var3 == r1Var4 ? androidx.compose.ui.unit.b.q(j10) : 0, (this.f16060s == r1Var4 || !this.f16061t) ? androidx.compose.ui.unit.b.o(j10) : Integer.MAX_VALUE));
        final int I = kotlin.ranges.r.I(i2VarP0.h1(), androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.p(j10));
        final int I2 = kotlin.ranges.r.I(i2VarP0.c1(), androidx.compose.ui.unit.b.q(j10), androidx.compose.ui.unit.b.o(j10));
        return androidx.compose.ui.layout.c1.h6(c1Var, I, I2, null, new Function1() { // from class: androidx.compose.foundation.layout.f8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g8.z9(this.f16019a, I, i2VarP0, I2, c1Var, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    @NotNull
    public final Function2<androidx.compose.ui.unit.u, androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> w9() {
        return this.f16062v;
    }

    @NotNull
    public final r1 x9() {
        return this.f16060s;
    }

    public final boolean y9() {
        return this.f16061t;
    }
}
