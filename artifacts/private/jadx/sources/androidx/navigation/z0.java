package androidx.navigation;

import android.content.Intent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {
    @NotNull
    public static final w1 a(@NotNull Intent intent) {
        return b1.a(intent);
    }

    @kotlin.l(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.b1(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final e2 b(@NotNull w0 w0Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @NotNull Function1<? super g2, Unit> function1) {
        return b1.b(w0Var, i10, i11, function1);
    }

    @NotNull
    public static final e2 c(@NotNull w0 w0Var, @NotNull Object obj, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull Function1<? super g2, Unit> function1) {
        return a1.a(w0Var, obj, dVar, map, function1);
    }

    @NotNull
    public static final e2 d(@NotNull w0 w0Var, @NotNull String str, @Nullable String str2, @NotNull Function1<? super g2, Unit> function1) {
        return a1.b(w0Var, str, str2, function1);
    }

    @NotNull
    public static final e2 e(@NotNull w0 w0Var, @NotNull kotlin.reflect.d<?> dVar, @Nullable kotlin.reflect.d<?> dVar2, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull Function1<? super g2, Unit> function1) {
        return a1.c(w0Var, dVar, dVar2, map, function1);
    }
}
