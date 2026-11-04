package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,394:1\n1#2:395\n*E\n"})
public final class n20 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f30904c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30905d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.b0<o20> f30906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1<? super Float, Float> f30907b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o20 g(androidx.compose.runtime.saveable.g0 g0Var, n20 n20Var) {
            return n20Var.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n20 h(androidx.compose.ui.unit.d dVar, Function1 function1, Function1 function2, o20 o20Var) {
            return new n20(o20Var, dVar, function1, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o20 i(androidx.compose.runtime.saveable.g0 g0Var, n20 n20Var) {
            return n20Var.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n20 j(Function1 function1, o20 o20Var) {
            return new n20(o20Var, function1);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<n20, o20> e(@NotNull final Function1<? super Float, Float> function1) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material3.j20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n20.a.i((androidx.compose.runtime.saveable.g0) obj, (n20) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.k20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n20.a.j(function1, (o20) obj);
                }
            });
        }

        @kotlin.l(level = kotlin.n.WARNING, message = androidx.compose.material3.internal.d2.f28796a, replaceWith = @kotlin.b1(expression = "Saver(positionalThreshold, density)", imports = {}))
        @NotNull
        public final androidx.compose.runtime.saveable.c0<n20, o20> f(@NotNull final Function1<? super o20, Boolean> function1, @NotNull final Function1<? super Float, Float> function2, @NotNull final androidx.compose.ui.unit.d dVar) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material3.l20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n20.a.g((androidx.compose.runtime.saveable.g0) obj, (n20) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.m20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n20.a.h(dVar, function1, function2, (o20) obj);
                }
            });
        }

        private a() {
        }
    }

    public n20(@NotNull o20 o20Var, @NotNull Function1<? super Float, Float> function1) {
        this.f30906a = new androidx.compose.foundation.gestures.b0<>(o20Var);
        r(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(o20 o20Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(androidx.compose.ui.unit.d dVar) {
        return dVar.S7(g20.f27820a);
    }

    public static /* synthetic */ void l() {
    }

    @Nullable
    public final Object e(@NotNull o20 o20Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ = androidx.compose.foundation.gestures.k.J(this.f30906a, o20Var, null, dVar, 2, null);
        return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
    }

    @NotNull
    public final androidx.compose.foundation.gestures.b0<o20> f() {
        return this.f30906a;
    }

    @NotNull
    public final o20 g() {
        return this.f30906a.t();
    }

    @NotNull
    public final o20 h() {
        if (i() == 0.0f || Float.isNaN(i())) {
            return o20.Settled;
        }
        return i() > 0.0f ? o20.StartToEnd : o20.EndToStart;
    }

    public final float i() {
        return this.f30906a.y();
    }

    @NotNull
    public final Function1<Float, Float> j() {
        Function1 function1 = this.f30907b;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("positionalThreshold");
        return null;
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float k() {
        return this.f30906a.A();
    }

    @NotNull
    public final o20 m() {
        return this.f30906a.C();
    }

    @NotNull
    public final o20 n() {
        return this.f30906a.F();
    }

    public final boolean o() {
        return this.f30907b != null;
    }

    public final float p() {
        return this.f30906a.N();
    }

    @Nullable
    public final Object q(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objJ = androidx.compose.foundation.gestures.k.J(this.f30906a, o20.Settled, null, dVar, 2, null);
        return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
    }

    public final void r(@NotNull Function1<? super Float, Float> function1) {
        this.f30907b = function1;
    }

    @Nullable
    public final Object s(@NotNull o20 o20Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objU = androidx.compose.foundation.gestures.k.U(this.f30906a, o20Var, dVar);
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    public /* synthetic */ n20(o20 o20Var, androidx.compose.ui.unit.d dVar, Function1 function1, Function1 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o20Var, dVar, (i10 & 4) != 0 ? new Function1() { // from class: androidx.compose.material3.h20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(n20.c((o20) obj));
            }
        } : function1, function2);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = androidx.compose.material3.internal.d2.f28796a, replaceWith = @kotlin.b1(expression = "SwipeToDismissBoxState(initialValue, density, positionalThreshold)", imports = {}))
    public n20(@NotNull o20 o20Var, @NotNull final androidx.compose.ui.unit.d dVar, @NotNull Function1<? super o20, Boolean> function1, @NotNull Function1<? super Float, Float> function2) {
        androidx.compose.foundation.gestures.d dVar2 = androidx.compose.foundation.gestures.d.f14520a;
        this.f30906a = androidx.compose.foundation.gestures.k.j(o20Var, function2, new Function0() { // from class: androidx.compose.material3.i20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(n20.d(dVar));
            }
        }, dVar2.f(), dVar2.d(), function1);
    }
}
