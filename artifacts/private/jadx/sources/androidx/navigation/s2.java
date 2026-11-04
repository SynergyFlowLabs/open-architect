package androidx.navigation;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 {
    @kotlin.l(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.b1(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final e2 a(@NotNull q2 q2Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @NotNull Function1<? super g2, Unit> function1) {
        return u2.a(q2Var, i10, i11, function1);
    }

    @NotNull
    public static final e2 b(@NotNull q2 q2Var, @NotNull Object obj, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull Function1<? super g2, Unit> function1) {
        return t2.a(q2Var, obj, dVar, map, function1);
    }

    @NotNull
    public static final e2 c(@NotNull q2 q2Var, @NotNull String str, @Nullable String str2, @NotNull Function1<? super g2, Unit> function1) {
        return t2.b(q2Var, str, str2, function1);
    }

    @NotNull
    public static final e2 d(@NotNull q2 q2Var, @NotNull kotlin.reflect.d<?> dVar, @Nullable kotlin.reflect.d<?> dVar2, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull Function1<? super g2, Unit> function1) {
        return t2.c(q2Var, dVar, dVar2, map, function1);
    }
}
