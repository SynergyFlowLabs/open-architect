package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,415:1\n126#2:416\n153#2,3:417\n37#3,2:420\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n411#1:416\n411#1:417,3\n411#1:420,2\n*E\n"})
public final class a1 {
    @o
    @p(scheme = "[0[0]]")
    public static final void d(@NotNull final w0 w0Var, @NotNull final Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-1162003659);
        int i11 = (i10 & 6) == 0 ? (c0VarR.D(w0Var) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(-1162003659, i11, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:408)");
            }
            e4 e4VarA = w0Var.a();
            ArrayList arrayList = new ArrayList(e4VarA.size());
            for (Map.Entry<u0<Object>, z7<Object>> entry : e4VarA.entrySet()) {
                arrayList.add(entry.getValue().a(entry.getKey()));
            }
            n4[] n4VarArr = (n4[]) arrayList.toArray(new n4[0]);
            f((n4[]) Arrays.copyOf(n4VarArr, n4VarArr.length), function2, c0VarR, i11 & com.planner5d.library.engine.input.f.b.B);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.z0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a1.i(w0Var, function2, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @o
    @p(scheme = "[0[0]]")
    public static final void e(@NotNull final n4<?> n4Var, @NotNull final Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-149765515);
        if (m0.l0()) {
            m0.A0(-149765515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:387)");
        }
        c0VarR.p0(n4Var);
        function2.invoke(c0VarR, Integer.valueOf((i10 >> 3) & 14));
        c0VarR.n();
        if (m0.l0()) {
            m0.z0();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.x0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a1.h(n4Var, function2, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @o
    @p(scheme = "[0[0]]")
    public static final void f(@NotNull final n4<?>[] n4VarArr, @NotNull final Function2<? super c0, ? super Integer, Unit> function2, @Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(415205898);
        if (m0.l0()) {
            m0.A0(415205898, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:367)");
        }
        c0VarR.F(n4VarArr);
        function2.invoke(c0VarR, Integer.valueOf((i10 >> 3) & 14));
        c0VarR.s0();
        if (m0.l0()) {
            m0.z0();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.runtime.y0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a1.g(n4VarArr, function2, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(n4[] n4VarArr, Function2 function2, int i10, c0 c0Var, int i11) {
        f(n4VarArr, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(n4 n4Var, Function2 function2, int i10, c0 c0Var, int i11) {
        e(n4Var, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(w0 w0Var, Function2 function2, int i10, c0 c0Var, int i11) {
        d(w0Var, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @NotNull
    public static final <T> m4<T> j(@NotNull u6<T> u6Var, @NotNull Function0<? extends T> function0) {
        return new y1(u6Var, function0);
    }

    public static /* synthetic */ m4 k(u6 u6Var, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            u6Var = w6.z();
        }
        return j(u6Var, function0);
    }

    @NotNull
    public static final <T> m4<T> l(@NotNull Function1<? super v0, ? extends T> function1) {
        return new j1(function1);
    }

    @NotNull
    public static final <T> m4<T> m(@NotNull Function0<? extends T> function0) {
        return new o7(function0);
    }
}
