package androidx.navigation;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 {
    @kotlin.l(message = "Use routes to build your NavGraph instead", replaceWith = @kotlin.b1(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final e2 a(@NotNull r3 r3Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @NotNull Function1<? super g2, Unit> function1) {
        return j2.a(r3Var, i10, i11, function1);
    }

    @NotNull
    public static final e2 b(@NotNull r3 r3Var, @NotNull Object obj, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull Function1<? super g2, Unit> function1) {
        return i2.a(r3Var, obj, dVar, map, function1);
    }

    @NotNull
    public static final e2 c(@NotNull r3 r3Var, @NotNull String str, @Nullable String str2, @NotNull Function1<? super g2, Unit> function1) {
        return i2.b(r3Var, str, str2, function1);
    }

    @NotNull
    public static final e2 d(@NotNull r3 r3Var, @NotNull kotlin.reflect.d<?> dVar, @Nullable kotlin.reflect.d<?> dVar2, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull Function1<? super g2, Unit> function1) {
        return i2.c(r3Var, dVar, dVar2, map, function1);
    }

    @kotlin.l(message = "Use routes to build your nested NavGraph instead", replaceWith = @kotlin.b1(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void e(@NotNull g2 g2Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @NotNull Function1<? super g2, Unit> function1) {
        j2.b(g2Var, i10, i11, function1);
    }

    public static final void g(@NotNull g2 g2Var, @NotNull String str, @NotNull String str2, @NotNull Function1<? super g2, Unit> function1) {
        i2.e(g2Var, str, str2, function1);
    }

    public static final <T> void h(@NotNull g2 g2Var, @NotNull kotlin.reflect.d<T> dVar, @NotNull Object obj, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull Function1<? super g2, Unit> function1) {
        i2.f(g2Var, dVar, obj, map, function1);
    }

    public static final <T> void j(@NotNull g2 g2Var, @NotNull kotlin.reflect.d<T> dVar, @NotNull kotlin.reflect.d<?> dVar2, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull Function1<? super g2, Unit> function1) {
        i2.h(g2Var, dVar, dVar2, map, function1);
    }
}
