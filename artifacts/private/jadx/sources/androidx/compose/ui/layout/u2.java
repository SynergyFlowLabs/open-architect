package androidx.compose.ui.layout;

import android.graphics.Rect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class u2 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.g0, androidx.compose.ui.node.p2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f39559s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private x f39560t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Function1<v2, Unit> f39561v;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f39562a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i2 i2Var) {
            super(1);
            this.f39562a = i2Var;
        }

        public final void c(i2.a aVar) {
            i2.a.P(aVar, this.f39562a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nWindowInsetsRulers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsRulers.android.kt\nandroidx/compose/ui/layout/RulerProviderModifierNode$rulerLambda$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,576:1\n61#2:577\n54#2:578\n63#2:580\n59#2:581\n85#3:579\n90#3:582\n13409#4,2:583\n301#5,6:585\n*S KotlinDebug\n*F\n+ 1 WindowInsetsRulers.android.kt\nandroidx/compose/ui/layout/RulerProviderModifierNode$rulerLambda$1\n*L\n183#1:577\n183#1:578\n183#1:580\n183#1:581\n183#1:579\n183#1:582\n184#1:583,2\n194#1:585,6\n*E\n"})
    static final class b extends kotlin.jvm.internal.l0 implements Function1<v2, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f39564b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x xVar) {
            super(1);
            this.f39564b = xVar;
        }

        public final void c(v2 v2Var) {
            u2 u2Var = u2.this;
            u2Var.D9(u2Var.x9().m1());
            if (u2.this.A9() > 0) {
                long jA = v2Var.n().a();
                androidx.collection.a3<Object, o3> a3VarK = this.f39564b.k();
                int i10 = (int) (jA >> 32);
                int i11 = (int) (jA & com.rabbitmq.client.k0.f265952a);
                k3[] k3VarArr = n3.f39454c;
                int length = k3VarArr.length;
                int i12 = 0;
                while (i12 < length) {
                    k3 k3Var = k3VarArr[i12];
                    o3 o3VarP = a3VarK.p(k3Var);
                    Intrinsics.checkNotNull(o3VarP);
                    o3 o3Var = o3VarP;
                    v2 v2Var2 = v2Var;
                    n3.h(v2Var2, k3Var.a(), o3Var.c(), i10, i11);
                    if (o3Var.b()) {
                        n3.h(v2Var2, o3Var.P(), o3Var.e(), i10, i11);
                        n3.h(v2Var2, o3Var.y1(), o3Var.f(), i10, i11);
                    }
                    n3.h(v2Var2, k3Var.b(), o3Var.d(), i10, i11);
                    i12++;
                    v2Var = v2Var2;
                }
                v2 v2Var3 = v2Var;
                if (u2.this.v9().I()) {
                    androidx.collection.g2<androidx.compose.runtime.n3<Rect>> g2VarV9 = u2.this.v9();
                    u2 u2Var2 = u2.this;
                    Object[] objArr = g2VarV9.f12449a;
                    int i13 = g2VarV9.f12450b;
                    for (int i14 = 0; i14 < i13; i14++) {
                        androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objArr[i14];
                        m2 m2Var = u2Var2.w9().get(i14);
                        Rect rect = (Rect) n3Var.getValue();
                        v2Var3.e2(m2Var.y(), rect.left);
                        v2Var3.e2(m2Var.n(), rect.top);
                        v2Var3.e2(m2Var.x(), rect.right);
                        v2Var3.e2(m2Var.b(), rect.bottom);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(v2 v2Var) {
            c(v2Var);
            return Unit.f312394a;
        }
    }

    public u2(@NotNull x xVar) {
        this.f39560t = xVar;
        this.f39561v = new b(xVar);
    }

    public final int A9() {
        return this.f39559s;
    }

    @NotNull
    public final Function1<v2, Unit> B9() {
        return this.f39561v;
    }

    public final void C9(@NotNull x xVar) {
        if (this.f39560t != xVar) {
            this.f39560t = xVar;
            androidx.compose.ui.node.j0.e(this);
        }
    }

    public final void D9(int i10) {
        this.f39559s = i10;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    public Object R4() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        i2 i2VarP0 = z0Var.P0(j10);
        return c1.J4(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, this.f39561v, new a(i2VarP0), 4, null);
    }

    @NotNull
    public final androidx.collection.g2<androidx.compose.runtime.n3<Rect>> v9() {
        return this.f39560t.i();
    }

    @NotNull
    public final List<m2> w9() {
        return this.f39560t.h();
    }

    @NotNull
    public final androidx.compose.runtime.l3 x9() {
        return this.f39560t.j();
    }

    @NotNull
    public final x y9() {
        return this.f39560t;
    }

    @NotNull
    public final androidx.collection.a3<Object, o3> z9() {
        return this.f39560t.k();
    }
}
