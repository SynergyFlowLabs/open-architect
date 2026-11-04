package androidx.compose.runtime;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
public final class c1 {
    public static final <T> boolean a(@NotNull e4 e4Var, @NotNull u0<T> u0Var) {
        Intrinsics.checkNotNull(u0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return e4Var.containsKey(u0Var);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.runtime.e4] */
    @NotNull
    public static final e4 b(@NotNull e4 e4Var, @NotNull Function1<? super Map<u0<Object>, z7<Object>>, Unit> function1) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<u0<Object>, z7<Object>> aVarBuilder = e4Var.c();
        function1.invoke(aVarBuilder);
        return aVarBuilder.build2();
    }

    public static final <T> T c(@NotNull e4 e4Var, @NotNull u0<T> u0Var) {
        Intrinsics.checkNotNull(u0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        z7 z7VarC = e4Var.get(u0Var);
        if (z7VarC == null) {
            z7VarC = u0Var.c();
        }
        return (T) z7VarC.b(e4Var);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.e4] */
    @NotNull
    public static final e4 d(@NotNull n4<?>[] n4VarArr, @NotNull e4 e4Var, @NotNull e4 e4Var2) {
        androidx.compose.runtime.internal.p0.a aVarM = androidx.compose.runtime.internal.q0.b().builder();
        for (n4<?> n4Var : n4VarArr) {
            u0<?> u0VarB = n4Var.b();
            Intrinsics.checkNotNull(u0VarB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            m4 m4Var = (m4) u0VarB;
            if (n4Var.a() || !a(e4Var, m4Var)) {
                z7 z7Var = (z7) e4Var2.get(m4Var);
                Intrinsics.checkNotNull(n4Var, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarM.put(m4Var, m4Var.d(n4Var, z7Var));
            }
        }
        return aVarM.build2();
    }

    public static /* synthetic */ e4 e(n4[] n4VarArr, e4 e4Var, e4 e4Var2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            e4Var2 = androidx.compose.runtime.internal.q0.b();
        }
        return d(n4VarArr, e4Var, e4Var2);
    }
}
