package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<t2, Unit> f40794a = a.f40796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f40795b;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40796a = new a();

        a() {
            super(1);
        }

        public final void c(t2 t2Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    public static final class b extends kotlin.jvm.internal.l0 implements Function1<t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<t2, Unit> f40797a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super t2, Unit> function1) {
            super(1);
            this.f40797a = function1;
        }

        public final void c(t2 t2Var) {
            this.f40797a.invoke(t2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final Function1<t2, Unit> a(@NotNull Function1<? super t2, Unit> function1) {
        return e() ? new b(function1) : b();
    }

    @NotNull
    public static final Function1<t2, Unit> b() {
        return f40794a;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super t2, Unit> function1, @NotNull Function1<? super androidx.compose.ui.a0, ? extends androidx.compose.ui.a0> function2) {
        return d(a0Var, function1, function2.invoke(androidx.compose.ui.a0.E));
    }

    @kotlin.a1
    @NotNull
    public static final androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super t2, Unit> function1, @NotNull androidx.compose.ui.a0 a0Var2) {
        p2 p2Var = new p2(function1);
        return a0Var.B2(p2Var).B2(a0Var2).B2(p2Var.i());
    }

    public static final boolean e() {
        return f40795b;
    }

    public static final void f(boolean z10) {
        f40795b = z10;
    }
}
