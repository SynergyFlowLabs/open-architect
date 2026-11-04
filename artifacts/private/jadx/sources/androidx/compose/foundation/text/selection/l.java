package androidx.compose.foundation.text.selection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.platform.o4 f21197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.input.pointer.c0 f21199c;

    public l(@NotNull androidx.compose.ui.platform.o4 o4Var) {
        this.f21197a = o4Var;
    }

    public final int a() {
        return this.f21198b;
    }

    @Nullable
    public final androidx.compose.ui.input.pointer.c0 b() {
        return this.f21199c;
    }

    public final boolean c(@NotNull androidx.compose.ui.input.pointer.c0 c0Var, @NotNull androidx.compose.ui.input.pointer.c0 c0Var2) {
        return i1.p(this.f21197a, c0Var, c0Var2);
    }

    public final void d(int i10) {
        this.f21198b = i10;
    }

    public final void e(@Nullable androidx.compose.ui.input.pointer.c0 c0Var) {
        this.f21199c = c0Var;
    }

    public final boolean f(@NotNull androidx.compose.ui.input.pointer.c0 c0Var, @NotNull androidx.compose.ui.input.pointer.c0 c0Var2) {
        return c0Var2.D() - c0Var.D() < this.f21197a.i();
    }

    public final void g(@NotNull androidx.compose.ui.input.pointer.q qVar) {
        androidx.compose.ui.input.pointer.c0 c0Var = this.f21199c;
        androidx.compose.ui.input.pointer.c0 c0Var2 = qVar.e().get(0);
        if (c0Var != null && f(c0Var, c0Var2) && c(c0Var, c0Var2)) {
            this.f21198b++;
        } else {
            this.f21198b = 1;
        }
        this.f21199c = c0Var2;
    }
}
