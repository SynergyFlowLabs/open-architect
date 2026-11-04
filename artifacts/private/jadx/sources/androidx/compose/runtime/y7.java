package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
public final class y7<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c0 f36856a;

    private /* synthetic */ y7(c0 c0Var) {
        this.f36856a = c0Var;
    }

    public static final /* synthetic */ y7 c(c0 c0Var) {
        return new y7(c0Var);
    }

    @NotNull
    public static <T> c0 d(@NotNull c0 c0Var) {
        return c0Var;
    }

    public static boolean e(c0 c0Var, Object obj) {
        return (obj instanceof y7) && Intrinsics.areEqual(c0Var, ((y7) obj).p());
    }

    public static final boolean f(c0 c0Var, c0 c0Var2) {
        return Intrinsics.areEqual(c0Var, c0Var2);
    }

    @kotlin.a1
    public static /* synthetic */ void g() {
    }

    public static int h(c0 c0Var) {
        return c0Var.hashCode();
    }

    public static final void i(c0 c0Var, @NotNull final Function1<? super T, Unit> function1) {
        if (c0Var.P()) {
            c0Var.f(Unit.f312394a, new Function2() { // from class: androidx.compose.runtime.w7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y7.j(function1, obj, (Unit) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1, Object obj, Unit unit) {
        function1.invoke(obj);
        return Unit.f312394a;
    }

    public static final void k(c0 c0Var, @NotNull final Function1<? super T, Unit> function1) {
        c0Var.f(Unit.f312394a, new Function2() { // from class: androidx.compose.runtime.x7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y7.l(function1, obj, (Unit) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1, Object obj, Unit unit) {
        function1.invoke(obj);
        return Unit.f312394a;
    }

    public static final void m(c0 c0Var, int i10, @NotNull Function2<? super T, ? super Integer, Unit> function2) {
        if (c0Var.P() || !Intrinsics.areEqual(c0Var.i0(), Integer.valueOf(i10))) {
            c0Var.Y(Integer.valueOf(i10));
            c0Var.f(Integer.valueOf(i10), function2);
        }
    }

    public static final <V> void n(c0 c0Var, V v10, @NotNull Function2<? super T, ? super V, Unit> function2) {
        if (!c0Var.P() && Intrinsics.areEqual(c0Var.i0(), v10)) {
            return;
        }
        c0Var.Y(v10);
        c0Var.f(v10, function2);
    }

    public static String o(c0 c0Var) {
        return "Updater(composer=" + c0Var + ')';
    }

    public static final void q(c0 c0Var, int i10, @NotNull Function2<? super T, ? super Integer, Unit> function2) {
        boolean zP = c0Var.P();
        if (zP || !Intrinsics.areEqual(c0Var.i0(), Integer.valueOf(i10))) {
            c0Var.Y(Integer.valueOf(i10));
            if (zP) {
                return;
            }
            c0Var.f(Integer.valueOf(i10), function2);
        }
    }

    public static final <V> void r(c0 c0Var, V v10, @NotNull Function2<? super T, ? super V, Unit> function2) {
        boolean zP = c0Var.P();
        if (zP || !Intrinsics.areEqual(c0Var.i0(), v10)) {
            c0Var.Y(v10);
            if (zP) {
                return;
            }
            c0Var.f(v10, function2);
        }
    }

    public boolean equals(Object obj) {
        return e(this.f36856a, obj);
    }

    public int hashCode() {
        return h(this.f36856a);
    }

    public final /* synthetic */ c0 p() {
        return this.f36856a;
    }

    public String toString() {
        return o(this.f36856a);
    }
}
