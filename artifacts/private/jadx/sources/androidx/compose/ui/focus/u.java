package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    static final class a extends kotlin.jvm.internal.l0 implements Function1<z, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f37458a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v vVar) {
            super(1);
            this.f37458a = vVar;
        }

        public final void c(z zVar) {
            this.f37458a.a(zVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(z zVar) {
            c(zVar);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<z, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f37459a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v vVar) {
            super(1);
            this.f37459a = vVar;
        }

        public final void c(z zVar) {
            this.f37459a.a(zVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(z zVar) {
            c(zVar);
            return Unit.f312394a;
        }
    }

    @kotlin.l(message = "Use focusRequester() instead", replaceWith = @kotlin.b1(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull g0 g0Var) {
        return j0.a(a0Var, g0Var);
    }

    @kotlin.l(message = "Use focusProperties() and focusRequester() instead", replaceWith = @kotlin.b1(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull g0 g0Var, @NotNull Function1<? super s, Unit> function1) {
        return b0.b(j0.a(a0Var, g0Var), new b(new v(function1)));
    }

    @kotlin.l(message = "Use focusProperties() instead", replaceWith = @kotlin.b1(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super s, Unit> function1) {
        return b0.b(a0Var, new a(new v(function1)));
    }
}
