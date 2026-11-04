package androidx.compose.ui.graphics;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,827:1\n82#2:828\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n*L\n709#1:828\n*E\n"})
public final class g0 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0, androidx.compose.ui.node.i2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f37778v = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function1<? super r1, Unit> f37779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f37780t;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.layout.i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i2 f37781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f37782b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i2 i2Var, g0 g0Var) {
            super(1);
            this.f37781a = i2Var;
            this.f37782b = g0Var;
        }

        public final void c(androidx.compose.ui.layout.i2.a aVar) {
            androidx.compose.ui.layout.i2.a.A0(aVar, this.f37781a, 0, 0, 0.0f, this.f37782b.v9(), 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.layout.i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public g0(@NotNull Function1<? super r1, Unit> function1) {
        this.f37779s = function1;
    }

    @Override // androidx.compose.ui.node.i2
    public boolean N4() {
        return this.f37780t;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new a(i2VarP0, this), 4, null);
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
    }

    @NotNull
    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f37779s + ')';
    }

    @NotNull
    public final Function1<r1, Unit> v9() {
        return this.f37779s;
    }

    public final void w9() {
        androidx.compose.ui.node.k1 k1VarY4 = androidx.compose.ui.node.k.p(this, androidx.compose.ui.node.m1.b(2)).Y4();
        if (k1VarY4 != null) {
            k1VarY4.u7(this.f37779s, true);
        }
    }

    public final void x9(@NotNull Function1<? super r1, Unit> function1) {
        this.f37779s = function1;
    }
}
