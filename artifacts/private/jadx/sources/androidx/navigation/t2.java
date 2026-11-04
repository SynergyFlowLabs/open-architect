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
@SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt__NavHostKt\n+ 2 NavController.kt\nandroidx/navigation/NavControllerKt__NavControllerKt\n+ 3 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt\n*L\n1#1,95:1\n658#2:96\n675#2:98\n692#2:100\n40#3:97\n58#3:99\n76#3:101\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt__NavHostKt\n*L\n60#1:96\n77#1:98\n94#1:100\n60#1:97\n77#1:99\n94#1:101\n*E\n"})
final /* synthetic */ class t2 {
    @NotNull
    public static final e2 a(@NotNull q2 q2Var, @NotNull Object startDestination, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(q2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(q2Var.getNavController().P(), startDestination, dVar, typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    @NotNull
    public static final e2 b(@NotNull q2 q2Var, @NotNull String startDestination, @Nullable String str, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(q2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(q2Var.getNavController().P(), startDestination, str);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    @NotNull
    public static final e2 c(@NotNull q2 q2Var, @NotNull kotlin.reflect.d<?> startDestination, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(q2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(q2Var.getNavController().P(), startDestination, dVar, typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 d(q2 q2Var, Object startDestination, kotlin.reflect.d dVar, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(q2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(q2Var.getNavController().P(), startDestination, (kotlin.reflect.d<?>) dVar, (Map<kotlin.reflect.s, d3<?>>) typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 e(q2 q2Var, String startDestination, String str, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(q2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(q2Var.getNavController().P(), startDestination, str);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 f(q2 q2Var, kotlin.reflect.d startDestination, kotlin.reflect.d dVar, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(q2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(q2Var.getNavController().P(), (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) dVar, (Map<kotlin.reflect.s, d3<?>>) typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }
}
