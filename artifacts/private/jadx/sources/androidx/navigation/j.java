package androidx.navigation;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nActivityNavigatorDestinationBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigatorDestinationBuilder.android.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n*L\n1#1,127:1\n115#2:128\n115#2:129\n115#2:130\n*S KotlinDebug\n*F\n+ 1 ActivityNavigatorDestinationBuilder.android.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt__ActivityNavigatorDestinationBuilder_androidKt\n*L\n41#1:128\n50#1:129\n67#1:130\n*E\n"})
final /* synthetic */ class j {
    @kotlin.l(message = "Use routes to build your ActivityDestination instead", replaceWith = @kotlin.b1(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void a(@NotNull g2 g2Var, @androidx.annotation.d0 int i10, @NotNull Function1<? super h, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        h hVar = new h((g) g2Var.v().e(g.class), i10);
        builder.invoke(hVar);
        g2Var.u(hVar);
    }

    public static final void b(@NotNull g2 g2Var, @NotNull String route, @NotNull Function1<? super h, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        h hVar = new h((g) g2Var.v().e(g.class), route);
        builder.invoke(hVar);
        g2Var.u(hVar);
    }

    public static final /* synthetic */ <T> void c(g2 g2Var, Map<kotlin.reflect.s, d3<?>> typeMap, Function1<? super h, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g gVar = (g) g2Var.v().e(g.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        h hVar = new h(gVar, kotlin.jvm.internal.j1.d(Object.class), typeMap);
        builder.invoke(hVar);
        g2Var.u(hVar);
    }

    public static /* synthetic */ void d(g2 g2Var, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        g gVar = (g) g2Var.v().e(g.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        h hVar = new h(gVar, kotlin.jvm.internal.j1.d(Object.class), typeMap);
        builder.invoke(hVar);
        g2Var.u(hVar);
    }
}
