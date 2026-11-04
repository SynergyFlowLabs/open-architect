package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,98:1\n1#2:99\n643#3,2:100\n65#4:102\n69#4:105\n65#4:108\n69#4:111\n60#5:103\n70#5:106\n60#5:109\n70#5:112\n22#6:104\n22#6:107\n22#6:110\n22#6:113\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n68#1:100,2\n85#1:102\n86#1:105\n87#1:108\n88#1:111\n85#1:103\n86#1:106\n87#1:109\n88#1:112\n85#1:104\n86#1:107\n87#1:110\n88#1:113\n*E\n"})
public abstract class o4 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f18171v = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Function1<? super androidx.compose.ui.layout.g0, n0.j> f18172s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Rect f18173t;

    public o4(@Nullable Function1<? super androidx.compose.ui.layout.g0, n0.j> function1) {
        this.f18172s = function1;
    }

    private final Rect v9(androidx.compose.ui.layout.g0 g0Var, n0.j jVar) {
        androidx.compose.ui.layout.g0 g0VarD = androidx.compose.ui.layout.h0.d(g0Var);
        long jR0 = g0VarD.r0(g0Var, jVar.E());
        long jR1 = g0VarD.r0(g0Var, jVar.F());
        long jR2 = g0VarD.r0(g0Var, jVar.m());
        long jR3 = g0VarD.r0(g0Var, jVar.n());
        int i10 = (int) (jR0 >> 32);
        int i11 = (int) (jR1 >> 32);
        int i12 = (int) (jR2 >> 32);
        int i13 = (int) (jR3 >> 32);
        float fL0 = kotlin.comparisons.a.l0(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13));
        int i14 = (int) (jR0 & com.rabbitmq.client.k0.f265952a);
        float fIntBitsToFloat = Float.intBitsToFloat(i14);
        int i15 = (int) (jR1 & com.rabbitmq.client.k0.f265952a);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i15);
        int i16 = (int) (jR2 & com.rabbitmq.client.k0.f265952a);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i16);
        int i17 = (int) (jR3 & com.rabbitmq.client.k0.f265952a);
        return new Rect(kotlin.math.b.L0(fL0), kotlin.math.b.L0(kotlin.comparisons.a.l0(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, Float.intBitsToFloat(i17))), kotlin.math.b.L0(kotlin.comparisons.a.Q(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), kotlin.math.b.L0(kotlin.comparisons.a.Q(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat(i17))));
    }

    private final void z9(Rect rect) {
        androidx.compose.runtime.collection.d<Rect> dVarW9 = w9();
        Rect rect2 = this.f18173t;
        if (rect2 != null) {
            dVarW9.n0(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            dVarW9.d(rect);
        }
        B9(dVarW9);
        this.f18173t = rect;
    }

    public void A9(@Nullable Function1<? super androidx.compose.ui.layout.g0, n0.j> function1) {
        this.f18172s = function1;
    }

    public abstract void B9(@NotNull androidx.compose.runtime.collection.d<Rect> dVar);

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        super.f9();
        z9(null);
    }

    @Override // androidx.compose.ui.node.v
    public void n0(@NotNull androidx.compose.ui.layout.g0 g0Var) {
        Rect rectV9;
        if (x9() == null) {
            n0.j jVarB = androidx.compose.ui.layout.h0.b(g0Var);
            rectV9 = new Rect(kotlin.math.b.L0(jVarB.t()), kotlin.math.b.L0(jVarB.B()), kotlin.math.b.L0(jVarB.x()), kotlin.math.b.L0(jVarB.j()));
        } else {
            Function1<androidx.compose.ui.layout.g0, n0.j> function1X9 = x9();
            Intrinsics.checkNotNull(function1X9);
            rectV9 = v9(g0Var, function1X9.invoke(g0Var));
        }
        z9(rectV9);
    }

    @NotNull
    public abstract androidx.compose.runtime.collection.d<Rect> w9();

    @Nullable
    public Function1<androidx.compose.ui.layout.g0, n0.j> x9() {
        return this.f18172s;
    }

    @NotNull
    protected final View y9() {
        return androidx.compose.ui.node.l.a(this);
    }
}
