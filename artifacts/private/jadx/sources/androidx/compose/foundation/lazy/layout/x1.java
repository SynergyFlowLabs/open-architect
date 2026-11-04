package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.q3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,270:1\n1#2:271\n97#3,4:272\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode\n*L\n209#1:272,4\n*E\n"})
final class x1 extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.i2 {
    private boolean X;
    private androidx.compose.ui.semantics.l Y;

    @NotNull
    private final Function1<Object, Integer> Z = new Function1() { // from class: androidx.compose.foundation.lazy.layout.s1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Integer.valueOf(x1.D9(this.f17580a, obj));
        }
    };

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private Function1<? super Integer, Boolean> f17610p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Function0<? extends l0> f17611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private q1 f17612t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private q3 f17613v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17614w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17615a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f17617c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f17617c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return x1.this.new a(this.f17617c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f17615a;
            if (i10 == 0) {
                ResultKt.m(obj);
                q1 q1Var = x1.this.f17612t;
                int i11 = this.f17617c;
                this.f17615a = 1;
                if (q1Var.d(i11, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public x1(@NotNull Function0<? extends l0> function0, @NotNull q1 q1Var, @NotNull q3 q3Var, boolean z10, boolean z11) {
        this.f17611s = function0;
        this.f17612t = q1Var;
        this.f17613v = q3Var;
        this.f17614w = z10;
        this.X = z11;
        G9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float B9(x1 x1Var) {
        return Float.valueOf(x1Var.f17612t.g() - x1Var.f17612t.c());
    }

    private final androidx.compose.ui.semantics.b C9() {
        return this.f17612t.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D9(x1 x1Var, Object obj) {
        l0 l0VarInvoke = x1Var.f17611s.invoke();
        int iA = l0VarInvoke.a();
        for (int i10 = 0; i10 < iA; i10++) {
            if (Intrinsics.areEqual(l0VarInvoke.d(i10), obj)) {
                return i10;
            }
        }
        return -1;
    }

    private final boolean E9() {
        return this.f17613v == q3.Vertical;
    }

    private final void G9() {
        this.Y = new androidx.compose.ui.semantics.l(new Function0() { // from class: androidx.compose.foundation.lazy.layout.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(x1.H9(this.f17592a));
            }
        }, new Function0() { // from class: androidx.compose.foundation.lazy.layout.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(x1.I9(this.f17600a));
            }
        }, this.X);
        this.f17610p0 = this.f17614w ? new Function1() { // from class: androidx.compose.foundation.lazy.layout.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x1.J9(this.f17601a, ((Integer) obj).intValue()));
            }
        } : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float H9(x1 x1Var) {
        return x1Var.f17612t.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float I9(x1 x1Var) {
        return x1Var.f17612t.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J9(x1 x1Var, int i10) {
        l0 l0VarInvoke = x1Var.f17611s.invoke();
        if (!(i10 >= 0 && i10 < l0VarInvoke.a())) {
            androidx.compose.foundation.internal.e.g("Can't scroll to index " + i10 + ", it is out of bounds [0, " + l0VarInvoke.a() + ')');
        }
        kotlinx.coroutines.k.f(x1Var.Q8(), null, null, x1Var.new a(i10, null), 3, null);
        return true;
    }

    public final void F9(@NotNull Function0<? extends l0> function0, @NotNull q1 q1Var, @NotNull q3 q3Var, boolean z10, boolean z11) {
        this.f17611s = function0;
        this.f17612t = q1Var;
        if (this.f17613v != q3Var) {
            this.f17613v = q3Var;
            androidx.compose.ui.node.j2.b(this);
        }
        if (this.f17614w == z10 && this.X == z11) {
            return;
        }
        this.f17614w = z10;
        this.X = z11;
        G9();
        androidx.compose.ui.node.j2.b(this);
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.b2(e0Var, true);
        androidx.compose.ui.semantics.b0.y0(e0Var, this.Z);
        if (E9()) {
            androidx.compose.ui.semantics.l lVar = this.Y;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                lVar = null;
            }
            androidx.compose.ui.semantics.b0.d2(e0Var, lVar);
        } else {
            androidx.compose.ui.semantics.l lVar2 = this.Y;
            if (lVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                lVar2 = null;
            }
            androidx.compose.ui.semantics.b0.B1(e0Var, lVar2);
        }
        Function1<? super Integer, Boolean> function1 = this.f17610p0;
        if (function1 != null) {
            androidx.compose.ui.semantics.b0.p1(e0Var, null, function1, 1, null);
        }
        androidx.compose.ui.semantics.b0.a0(e0Var, null, new Function0() { // from class: androidx.compose.foundation.lazy.layout.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x1.B9(this.f17603a);
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.r1(e0Var, C9());
    }
}
