package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class x3 implements y3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21750d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.platform.z3 f21751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z3 f21752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.compose.ui.focus.q f21753c;

    public x3(@Nullable androidx.compose.ui.platform.z3 z3Var) {
        this.f21751a = z3Var;
    }

    private final boolean b(int i10) {
        androidx.compose.ui.platform.z3 z3Var;
        androidx.compose.ui.text.input.t.a aVar = androidx.compose.ui.text.input.t.f41944b;
        if (androidx.compose.ui.text.input.t.m(i10, aVar.g())) {
            c().t(androidx.compose.ui.focus.f.f37408b.e());
            return true;
        }
        if (androidx.compose.ui.text.input.t.m(i10, aVar.k())) {
            c().t(androidx.compose.ui.focus.f.f37408b.f());
            return true;
        }
        if (!androidx.compose.ui.text.input.t.m(i10, aVar.c()) || (z3Var = this.f21751a) == null) {
            return false;
        }
        z3Var.b();
        return true;
    }

    @Override // androidx.compose.foundation.text.y3
    public void a(int i10) {
        b(i10);
    }

    @NotNull
    public final androidx.compose.ui.focus.q c() {
        androidx.compose.ui.focus.q qVar = this.f21753c;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    @NotNull
    public final z3 d() {
        z3 z3Var = this.f21752b;
        if (z3Var != null) {
            return z3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    public final boolean e(int i10) {
        Function1<y3, Unit> function1G;
        androidx.compose.ui.text.input.t.a aVar = androidx.compose.ui.text.input.t.f41944b;
        if (androidx.compose.ui.text.input.t.m(i10, aVar.c())) {
            function1G = d().b();
        } else if (androidx.compose.ui.text.input.t.m(i10, aVar.e())) {
            function1G = d().c();
        } else if (androidx.compose.ui.text.input.t.m(i10, aVar.g())) {
            function1G = d().d();
        } else if (androidx.compose.ui.text.input.t.m(i10, aVar.k())) {
            function1G = d().e();
        } else if (androidx.compose.ui.text.input.t.m(i10, aVar.m())) {
            function1G = d().f();
        } else if (androidx.compose.ui.text.input.t.m(i10, aVar.o())) {
            function1G = d().g();
        } else {
            if (!androidx.compose.ui.text.input.t.m(i10, aVar.a()) && !androidx.compose.ui.text.input.t.m(i10, aVar.i())) {
                throw new IllegalStateException("invalid ImeAction");
            }
            function1G = null;
        }
        if (function1G == null) {
            return b(i10);
        }
        function1G.invoke(this);
        return true;
    }

    public final void f(@NotNull androidx.compose.ui.focus.q qVar) {
        this.f21753c = qVar;
    }

    public final void g(@NotNull z3 z3Var) {
        this.f21752b = z3Var;
    }
}
