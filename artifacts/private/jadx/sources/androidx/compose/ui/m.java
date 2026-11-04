package androidx.compose.ui;

import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    static final class a extends l0 implements Function1<a0.c, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39612a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(a0.c cVar) {
            return Boolean.valueOf(!(cVar instanceof l));
        }
    }

    static final class b extends l0 implements Function2<a0, a0.c, a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.c0 f39613a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.c0 c0Var) {
            super(2);
            this.f39613a = c0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final a0 invoke(a0 a0Var, a0.c cVar) {
            boolean z10 = cVar instanceof l;
            a0 a0VarM = cVar;
            if (z10) {
                pj.n<a0, androidx.compose.runtime.c0, Integer, a0> nVarI = ((l) cVar).i();
                Intrinsics.checkNotNull(nVarI, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                a0VarM = m.m(this.f39613a, (a0) ((pj.n) r1.q(nVarI, 3)).invoke(a0.E, this.f39613a, 0));
            }
            return a0Var.B2(a0VarM);
        }
    }

    @NotNull
    public static final a0 b(@NotNull a0 a0Var, @NotNull String str, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        return a0Var.B2(new y(str, obj, obj2, obj3, function1, nVar));
    }

    @NotNull
    public static final a0 c(@NotNull a0 a0Var, @NotNull String str, @Nullable Object obj, @Nullable Object obj2, @NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        return a0Var.B2(new x(str, obj, obj2, function1, nVar));
    }

    @NotNull
    public static final a0 d(@NotNull a0 a0Var, @NotNull String str, @Nullable Object obj, @NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        return a0Var.B2(new w(str, obj, function1, nVar));
    }

    @NotNull
    public static final a0 e(@NotNull a0 a0Var, @NotNull String str, @NotNull Object[] objArr, @NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        return a0Var.B2(new z(str, objArr, function1, nVar));
    }

    @NotNull
    public static final a0 f(@NotNull a0 a0Var, @NotNull Function1<? super t2, Unit> function1, @NotNull pj.n<? super a0, ? super androidx.compose.runtime.c0, ? super Integer, ? extends a0> nVar) {
        return a0Var.B2(new l(function1, nVar));
    }

    public static /* synthetic */ a0 g(a0 a0Var, String str, Object obj, Object obj2, Object obj3, Function1 function1, pj.n nVar, int i10, Object obj4) {
        if ((i10 & 16) != 0) {
            function1 = r2.b();
        }
        return b(a0Var, str, obj, obj2, obj3, function1, nVar);
    }

    public static /* synthetic */ a0 h(a0 a0Var, String str, Object obj, Object obj2, Function1 function1, pj.n nVar, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            function1 = r2.b();
        }
        return c(a0Var, str, obj, obj2, function1, nVar);
    }

    public static /* synthetic */ a0 i(a0 a0Var, String str, Object obj, Function1 function1, pj.n nVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            function1 = r2.b();
        }
        return d(a0Var, str, obj, function1, nVar);
    }

    public static /* synthetic */ a0 j(a0 a0Var, String str, Object[] objArr, Function1 function1, pj.n nVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = r2.b();
        }
        return e(a0Var, str, objArr, function1, nVar);
    }

    public static /* synthetic */ a0 k(a0 a0Var, Function1 function1, pj.n nVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = r2.b();
        }
        return f(a0Var, function1, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 m(androidx.compose.runtime.c0 c0Var, a0 a0Var) {
        if (a0Var.N(a.f39612a)) {
            return a0Var;
        }
        c0Var.h0(1219399079);
        a0 a0Var2 = (a0) a0Var.J(a0.E, new b(c0Var));
        c0Var.w0();
        return a0Var2;
    }

    @oj.i(name = "materializeModifier")
    @NotNull
    public static final a0 n(@NotNull androidx.compose.runtime.c0 c0Var, @NotNull a0 a0Var) {
        c0Var.E(439770924);
        a0 a0VarM = m(c0Var, a0Var);
        c0Var.A();
        return a0VarM;
    }

    @NotNull
    public static final a0 o(@NotNull androidx.compose.runtime.c0 c0Var, @NotNull a0 a0Var) {
        return a0Var == a0.E ? a0Var : n(c0Var, new CompositionLocalMapInjectionElement(c0Var.k()).B2(a0Var));
    }
}
