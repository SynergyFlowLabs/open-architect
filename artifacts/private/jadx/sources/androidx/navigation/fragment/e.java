package androidx.navigation.fragment;

import androidx.annotation.d0;
import androidx.navigation.d3;
import androidx.navigation.g2;
import java.util.Map;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDialogFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n*L\n1#1,197:1\n57#1,3:198\n60#1,5:202\n84#1,3:208\n87#1,5:212\n116#1,3:218\n120#1,5:222\n116#1,9:227\n115#2:201\n115#2:207\n115#2:211\n115#2:217\n115#2:221\n115#2:236\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n*L\n40#1:198,3\n40#1:202,5\n72#1:208,3\n72#1:212,5\n102#1:218,3\n102#1:222,5\n102#1:227,9\n40#1:201\n59#1:207\n72#1:211\n86#1:217\n102#1:221\n118#1:236\n*E\n"})
public final class e {
    @kotlin.l(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @b1(expression = "dialog<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends androidx.fragment.app.m> void a(g2 g2Var, @d0 int i10) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        c cVar = (c) g2Var.v().e(c.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        g2Var.u(new d(cVar, i10, (kotlin.reflect.d<? extends androidx.fragment.app.m>) j1.d(androidx.fragment.app.m.class)));
    }

    @kotlin.l(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @b1(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends androidx.fragment.app.m> void b(g2 g2Var, @d0 int i10, Function1<? super d, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        c cVar = (c) g2Var.v().e(c.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        d dVar = new d(cVar, i10, (kotlin.reflect.d<? extends androidx.fragment.app.m>) j1.d(androidx.fragment.app.m.class));
        builder.invoke(dVar);
        g2Var.u(dVar);
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.m> void c(g2 g2Var, String route) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        c cVar = (c) g2Var.v().e(c.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        g2Var.u(new d(cVar, route, (kotlin.reflect.d<? extends androidx.fragment.app.m>) j1.d(androidx.fragment.app.m.class)));
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.m> void d(g2 g2Var, String route, Function1<? super d, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        c cVar = (c) g2Var.v().e(c.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        d dVar = new d(cVar, route, (kotlin.reflect.d<? extends androidx.fragment.app.m>) j1.d(androidx.fragment.app.m.class));
        builder.invoke(dVar);
        g2Var.u(dVar);
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.m, T> void e(g2 g2Var, Map<kotlin.reflect.s, d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        c cVar = (c) g2Var.v().e(c.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        g2Var.u(new d(cVar, dVarD, typeMap, j1.d(androidx.fragment.app.m.class)));
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.m, T> void f(g2 g2Var, Map<kotlin.reflect.s, d3<?>> typeMap, Function1<? super d, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        c cVar = (c) g2Var.v().e(c.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        d dVar = new d(cVar, dVarD, typeMap, j1.d(androidx.fragment.app.m.class));
        builder.invoke(dVar);
        g2Var.u(dVar);
    }

    public static /* synthetic */ void g(g2 g2Var, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        c cVar = (c) g2Var.v().e(c.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        g2Var.u(new d(cVar, dVarD, typeMap, j1.d(androidx.fragment.app.m.class)));
    }

    public static /* synthetic */ void h(g2 g2Var, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        c cVar = (c) g2Var.v().e(c.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        d dVar = new d(cVar, dVarD, typeMap, j1.d(androidx.fragment.app.m.class));
        builder.invoke(dVar);
        g2Var.u(dVar);
    }
}
