package androidx.navigation;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class i2 {
    @NotNull
    public static final e2 a(@NotNull r3 r3Var, @NotNull Object startDestination, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(r3Var, startDestination, dVar, typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    @NotNull
    public static final e2 b(@NotNull r3 r3Var, @NotNull String startDestination, @Nullable String str, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(r3Var, startDestination, str);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    @NotNull
    public static final e2 c(@NotNull r3 r3Var, @NotNull kotlin.reflect.d<?> startDestination, @Nullable kotlin.reflect.d<?> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(r3Var, startDestination, dVar, typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static final /* synthetic */ <T> void d(g2 g2Var, Object startDestination, Map<kotlin.reflect.s, d3<?>> typeMap, Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        h2.h(g2Var, kotlin.jvm.internal.j1.d(Object.class), startDestination, typeMap, builder);
    }

    public static final void e(@NotNull g2 g2Var, @NotNull String startDestination, @NotNull String route, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var2 = new g2(g2Var.v(), startDestination, route);
        builder.invoke(g2Var2);
        g2Var.u(g2Var2);
    }

    public static final <T> void f(@NotNull g2 g2Var, @NotNull kotlin.reflect.d<T> route, @NotNull Object startDestination, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var2 = new g2(g2Var.v(), startDestination, (kotlin.reflect.d<?>) route, typeMap);
        builder.invoke(g2Var2);
        g2Var.u(g2Var2);
    }

    public static final /* synthetic */ <T> void g(g2 g2Var, kotlin.reflect.d<?> startDestination, Map<kotlin.reflect.s, d3<?>> typeMap, Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        h2.j(g2Var, kotlin.jvm.internal.j1.d(Object.class), startDestination, typeMap, builder);
    }

    public static final <T> void h(@NotNull g2 g2Var, @NotNull kotlin.reflect.d<T> route, @NotNull kotlin.reflect.d<?> startDestination, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull Function1<? super g2, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var2 = new g2(g2Var.v(), startDestination, (kotlin.reflect.d<?>) route, typeMap);
        builder.invoke(g2Var2);
        g2Var.u(g2Var2);
    }

    public static /* synthetic */ e2 i(r3 r3Var, Object startDestination, kotlin.reflect.d dVar, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(r3Var, startDestination, (kotlin.reflect.d<?>) dVar, (Map<kotlin.reflect.s, d3<?>>) typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 j(r3 r3Var, String startDestination, String str, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(r3Var, startDestination, str);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ e2 k(r3 r3Var, kotlin.reflect.d startDestination, kotlin.reflect.d dVar, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(r3Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g2 g2Var = new g2(r3Var, (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) dVar, (Map<kotlin.reflect.s, d3<?>>) typeMap);
        builder.invoke(g2Var);
        return g2Var.d();
    }

    public static /* synthetic */ void l(g2 g2Var, Object startDestination, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        h2.h(g2Var, kotlin.jvm.internal.j1.d(Object.class), startDestination, typeMap, builder);
    }

    public static /* synthetic */ void m(g2 g2Var, kotlin.reflect.d dVar, Object obj, Map map, Function1 function1, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        h2.h(g2Var, dVar, obj, map, function1);
    }

    public static /* synthetic */ void n(g2 g2Var, kotlin.reflect.d startDestination, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        h2.j(g2Var, kotlin.jvm.internal.j1.d(Object.class), startDestination, typeMap, builder);
    }

    public static /* synthetic */ void o(g2 g2Var, kotlin.reflect.d dVar, kotlin.reflect.d dVar2, Map map, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        h2.j(g2Var, dVar, dVar2, map, function1);
    }
}
