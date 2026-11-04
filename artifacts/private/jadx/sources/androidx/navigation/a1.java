package androidx.navigation;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavControllerKt__NavControllerKt\n+ 2 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt\n*L\n1#1,693:1\n40#2:694\n58#2:695\n76#2:696\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavControllerKt__NavControllerKt\n*L\n658#1:694\n675#1:695\n692#1:696\n*E\n"})
final /* synthetic */ class a1 {
    @NotNull
    public static final e2 a(@NotNull w0 w0Var, @NotNull Object startDestination, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(w0Var.P(), startDestination, dVar, typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    @NotNull
    public static final e2 b(@NotNull w0 w0Var, @NotNull String startDestination, @Nullable String str, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(w0Var.P(), startDestination, str);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    @NotNull
    public static final e2 c(@NotNull w0 w0Var, @NotNull kotlin.reflect.d<?> startDestination, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(w0Var.P(), startDestination, dVar, typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 d(w0 w0Var, Object startDestination, kotlin.reflect.d dVar, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(w0Var.P(), startDestination, (kotlin.reflect.d<?>) dVar, (Map<kotlin.reflect.s, d3<?>>) typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 e(w0 w0Var, String startDestination, String str, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(w0Var.P(), startDestination, str);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 f(w0 w0Var, kotlin.reflect.d startDestination, kotlin.reflect.d dVar, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(w0Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(w0Var.P(), (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) dVar, (Map<kotlin.reflect.s, d3<?>>) typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }
}
