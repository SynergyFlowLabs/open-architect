package androidx.fragment.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {
    public static final void a(@NotNull FragmentManager fragmentManager, boolean z10, @NotNull Function1<? super t0, Unit> function1) {
        t0 t0VarW = fragmentManager.w();
        function1.invoke(t0VarW);
        if (z10) {
            t0VarW.n();
        } else {
            t0VarW.m();
        }
    }

    public static /* synthetic */ void b(FragmentManager fragmentManager, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        t0 t0VarW = fragmentManager.w();
        function1.invoke(t0VarW);
        if (z10) {
            t0VarW.n();
        } else {
            t0VarW.m();
        }
    }

    @androidx.annotation.l0
    public static final void c(@NotNull FragmentManager fragmentManager, boolean z10, @NotNull Function1<? super t0, Unit> function1) {
        t0 t0VarW = fragmentManager.w();
        function1.invoke(t0VarW);
        if (z10) {
            t0VarW.p();
        } else {
            t0VarW.o();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        t0 t0VarW = fragmentManager.w();
        function1.invoke(t0VarW);
        if (z10) {
            t0VarW.p();
        } else {
            t0VarW.o();
        }
    }

    @kotlin.l(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void e(@NotNull FragmentManager fragmentManager, boolean z10, boolean z11, @NotNull Function1<? super t0, Unit> function1) {
        t0 t0VarW = fragmentManager.w();
        function1.invoke(t0VarW);
        if (z10) {
            if (z11) {
                t0VarW.p();
                return;
            } else {
                t0VarW.o();
                return;
            }
        }
        if (z11) {
            t0VarW.n();
        } else {
            t0VarW.m();
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        t0 t0VarW = fragmentManager.w();
        function1.invoke(t0VarW);
        if (z10) {
            if (z11) {
                t0VarW.p();
                return;
            } else {
                t0VarW.o();
                return;
            }
        }
        if (z11) {
            t0VarW.n();
        } else {
            t0VarW.m();
        }
    }
}
