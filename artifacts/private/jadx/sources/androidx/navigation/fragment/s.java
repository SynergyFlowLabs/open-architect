package androidx.navigation.fragment;

import androidx.annotation.d0;
import androidx.fragment.app.Fragment;
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
@SourceDebugExtension({"SMAP\nFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n*L\n1#1,186:1\n57#1,2:187\n59#1,2:190\n80#1,2:193\n82#1,2:196\n108#1,3:199\n112#1,5:203\n108#1,9:208\n115#2:189\n115#2:192\n115#2:195\n115#2:198\n115#2:202\n115#2:217\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n*L\n40#1:187,2\n40#1:190,2\n68#1:193,2\n68#1:196,2\n94#1:199,3\n94#1:203,5\n94#1:208,9\n40#1:189\n58#1:192\n68#1:195\n81#1:198\n94#1:202\n110#1:217\n*E\n"})
public final class s {
    @kotlin.l(message = "Use routes to create your FragmentDestination instead", replaceWith = @b1(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void a(g2 g2Var, @d0 int i10) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        q qVar = (q) g2Var.v().e(q.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        g2Var.u(new r(qVar, i10, (kotlin.reflect.d<? extends Fragment>) j1.d(Fragment.class)));
    }

    @kotlin.l(message = "Use routes to create your FragmentDestination instead", replaceWith = @b1(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void b(g2 g2Var, @d0 int i10, Function1<? super r, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        q qVar = (q) g2Var.v().e(q.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        r rVar = new r(qVar, i10, (kotlin.reflect.d<? extends Fragment>) j1.d(Fragment.class));
        builder.invoke(rVar);
        g2Var.u(rVar);
    }

    public static final /* synthetic */ <F extends Fragment> void c(g2 g2Var, String route) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        q qVar = (q) g2Var.v().e(q.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        g2Var.u(new r(qVar, route, (kotlin.reflect.d<? extends Fragment>) j1.d(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment> void d(g2 g2Var, String route, Function1<? super r, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        q qVar = (q) g2Var.v().e(q.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        r rVar = new r(qVar, route, (kotlin.reflect.d<? extends Fragment>) j1.d(Fragment.class));
        builder.invoke(rVar);
        g2Var.u(rVar);
    }

    public static final /* synthetic */ <F extends Fragment, T> void e(g2 g2Var, Map<kotlin.reflect.s, d3<?>> typeMap) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        q qVar = (q) g2Var.v().e(q.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        g2Var.u(new r(qVar, dVarD, typeMap, j1.d(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment, T> void f(g2 g2Var, Map<kotlin.reflect.s, d3<?>> typeMap, Function1<? super r, Unit> builder) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        q qVar = (q) g2Var.v().e(q.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        r rVar = new r(qVar, dVarD, typeMap, j1.d(Fragment.class));
        builder.invoke(rVar);
        g2Var.u(rVar);
    }

    public static /* synthetic */ void g(g2 g2Var, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        q qVar = (q) g2Var.v().e(q.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        g2Var.u(new r(qVar, dVarD, typeMap, j1.d(Fragment.class)));
    }

    public static /* synthetic */ void h(g2 g2Var, Map typeMap, Function1 builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        q qVar = (q) g2Var.v().e(q.class);
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        kotlin.reflect.d dVarD = j1.d(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        r rVar = new r(qVar, dVarD, typeMap, j1.d(Fragment.class));
        builder.invoke(rVar);
        g2Var.u(rVar);
    }
}
