package androidx.navigation;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class v1 {

    public static final class a implements Function1<t1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f71369a = new a();

        public final void c(t1 t1Var) {
            Intrinsics.checkNotNullParameter(t1Var, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t1 t1Var) {
            c(t1Var);
            return Unit.f312394a;
        }
    }

    public static final /* synthetic */ <T> o1 a(String basePath, Map<kotlin.reflect.s, d3<?>> typeMap, Function1<? super t1, Unit> deepLinkBuilder) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return u1.c(kotlin.jvm.internal.j1.d(Object.class), basePath, typeMap, deepLinkBuilder);
    }

    @NotNull
    public static final o1 b(@NotNull Function1<? super t1, Unit> deepLinkBuilder) {
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        t1 t1Var = new t1();
        deepLinkBuilder.invoke(t1Var);
        return t1Var.a();
    }

    @oj.j
    @NotNull
    public static final <T> o1 c(@NotNull kotlin.reflect.d<T> route, @NotNull String basePath, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap, @NotNull Function1<? super t1, Unit> deepLinkBuilder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        t1 t1Var = new t1(basePath, route, typeMap);
        deepLinkBuilder.invoke(t1Var);
        return t1Var.a();
    }

    @oj.j
    @NotNull
    public static final <T> o1 d(@NotNull kotlin.reflect.d<T> route, @NotNull String basePath, @NotNull Function1<? super t1, Unit> deepLinkBuilder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        return f(route, basePath, null, deepLinkBuilder, 4, null);
    }

    public static /* synthetic */ o1 e(String basePath, Map typeMap, Function1 deepLinkBuilder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        if ((i10 & 4) != 0) {
            deepLinkBuilder = a.f71369a;
        }
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return u1.c(kotlin.jvm.internal.j1.d(Object.class), basePath, typeMap, deepLinkBuilder);
    }

    public static /* synthetic */ o1 f(kotlin.reflect.d dVar, String str, Map map, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return u1.c(dVar, str, map, function1);
    }
}
