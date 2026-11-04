package androidx.navigation.compose;

import androidx.navigation.d3;
import androidx.navigation.e2;
import androidx.navigation.g2;
import androidx.navigation.o1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,736:1\n115#2:737\n115#2:742\n115#2:747\n115#2:752\n115#2:763\n115#2:768\n1863#3,2:738\n1863#3,2:740\n1863#3,2:743\n1863#3,2:745\n1863#3,2:748\n1863#3,2:750\n1863#3,2:753\n1863#3,2:755\n1863#3,2:757\n1863#3,2:759\n1863#3,2:761\n1863#3,2:764\n1863#3,2:766\n1863#3,2:770\n1#4:769\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n*L\n56#1:737\n106#1:742\n158#1:747\n265#1:752\n669#1:763\n727#1:768\n59#1:738,2\n62#1:740,2\n108#1:743,2\n109#1:745,2\n160#1:748,2\n161#1:750,2\n271#1:753,2\n400#1:755,2\n401#1:757,2\n518#1:759,2\n635#1:761,2\n675#1:764,2\n676#1:766,2\n733#1:770,2\n*E\n"})
public final class t {

    static final class a implements pj.o<androidx.compose.animation.g, androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.navigation.n0, androidx.compose.runtime.c0, Integer, Unit> f70847a;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f70847a = nVar;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.animation.g gVar, androidx.navigation.n0 n0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1516831465, i10, -1, "androidx.navigation.compose.composable.<anonymous> (NavGraphBuilder.kt:55)");
            }
            this.f70847a.invoke(n0Var, c0Var, Integer.valueOf((i10 >> 3) & 14));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.g gVar, androidx.navigation.n0 n0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(gVar, n0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public static /* synthetic */ void A(g2 g2Var, String str, String str2, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        List listEmptyList = (i10 & 8) != 0 ? CollectionsKt.emptyList() : list2;
        Function1 function6 = (i10 & 16) != 0 ? null : function1;
        Function1 function7 = (i10 & 32) != 0 ? null : function2;
        u(g2Var, str, str2, list3, listEmptyList, function6, function7, (i10 & 64) != 0 ? function6 : function3, (i10 & 128) != 0 ? function7 : function4, null, function5);
    }

    public static /* synthetic */ void B(g2 g2Var, String str, String str2, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i10, Object obj) {
        List listEmptyList = (i10 & 4) != 0 ? CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i10 & 8) != 0 ? CollectionsKt.emptyList() : list2;
        Function1 function7 = (i10 & 16) != 0 ? null : function1;
        Function1 function8 = (i10 & 32) != 0 ? null : function2;
        u(g2Var, str, str2, listEmptyList, listEmptyList2, function7, function8, (i10 & 64) != 0 ? function7 : function3, (i10 & 128) != 0 ? function8 : function4, (i10 & 256) != 0 ? null : function5, function6);
    }

    public static /* synthetic */ void C(g2 g2Var, kotlin.reflect.d dVar, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        List listEmptyList = (i10 & 4) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i10 & 8) != 0 ? null : function1;
        Function1 function8 = (i10 & 16) != 0 ? null : function2;
        Function1 function9 = (i10 & 32) != 0 ? function7 : function3;
        Function1 function10 = (i10 & 64) != 0 ? function8 : function4;
        Function1 function11 = (i10 & 128) != 0 ? null : function5;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        w(g2Var, dVar, j1.d(Object.class), map2, listEmptyList, function7, function8, function9, function10, function11, function6);
    }

    public static /* synthetic */ void D(g2 g2Var, kotlin.reflect.d dVar, kotlin.reflect.d dVar2, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i10, Object obj) {
        Map mapEmptyMap = (i10 & 4) != 0 ? MapsKt.emptyMap() : map;
        List listEmptyList = (i10 & 8) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i10 & 16) != 0 ? null : function1;
        Function1 function8 = (i10 & 32) != 0 ? null : function2;
        w(g2Var, dVar, dVar2, mapEmptyMap, listEmptyList, function7, function8, (i10 & 64) != 0 ? function7 : function3, (i10 & 128) != 0 ? function8 : function4, (i10 & 256) != 0 ? null : function5, function6);
    }

    public static final void a(@NotNull g2 g2Var, @NotNull String str, @NotNull List<androidx.navigation.b0> list, @NotNull List<o1> list2, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function2, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function3, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function4, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function5, @NotNull pj.o<? super androidx.compose.animation.g, ? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        f fVar = new f((e) g2Var.v().e(e.class), str, oVar);
        for (androidx.navigation.b0 b0Var : list) {
            fVar.b(b0Var.a(), b0Var.b());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            fVar.e((o1) it.next());
        }
        fVar.x(function1);
        fVar.y(function2);
        fVar.z(function3);
        fVar.A(function4);
        fVar.B(function5);
        g2Var.u(fVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in favor of composable builder that supports sizeTransform")
    public static final /* synthetic */ void b(g2 g2Var, String str, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, pj.o oVar) {
        f fVar = new f((e) g2Var.v().e(e.class), str, oVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.navigation.b0 b0Var = (androidx.navigation.b0) it.next();
            fVar.b(b0Var.a(), b0Var.b());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            fVar.e((o1) it2.next());
        }
        fVar.x(function1);
        fVar.y(function2);
        fVar.z(function3);
        fVar.A(function4);
        g2Var.u(fVar);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in favor of composable builder that supports AnimatedContent")
    public static final /* synthetic */ void c(g2 g2Var, String str, List list, List list2, pj.n nVar) {
        e.b bVar = new e.b((e) g2Var.v().e(e.class), (pj.o<? super androidx.compose.animation.g, androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit>) androidx.compose.runtime.internal.w.c(-1516831465, true, new a(nVar)));
        bVar.t0(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.navigation.b0 b0Var = (androidx.navigation.b0) it.next();
            bVar.d(b0Var.a(), b0Var.b());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            bVar.i((o1) it2.next());
        }
        g2Var.r(bVar);
    }

    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void d(g2 g2Var, Map<kotlin.reflect.s, d3<?>> map, List<o1> list, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function2, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function3, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function4, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function5, pj.o<? super androidx.compose.animation.g, ? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        e(g2Var, j1.d(Object.class), map, list, function1, function2, function3, function4, function5, oVar);
    }

    public static final <T> void e(@NotNull g2 g2Var, @NotNull kotlin.reflect.d<T> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull List<o1> list, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function2, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function3, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function4, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function5, @NotNull pj.o<? super androidx.compose.animation.g, ? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> oVar) {
        f fVar = new f((e) g2Var.v().e(e.class), dVar, map, oVar);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            fVar.e((o1) it.next());
        }
        fVar.x(function1);
        fVar.y(function2);
        fVar.z(function3);
        fVar.A(function4);
        fVar.B(function5);
        g2Var.u(fVar);
    }

    public static /* synthetic */ void f(g2 g2Var, String str, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, pj.o oVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        List list4 = list2;
        Function1 function6 = (i10 & 8) != 0 ? null : function1;
        Function1 function7 = (i10 & 16) != 0 ? null : function2;
        a(g2Var, str, list3, list4, function6, function7, (i10 & 32) != 0 ? function6 : function3, (i10 & 64) != 0 ? function7 : function4, (i10 & 128) != 0 ? null : function5, oVar);
    }

    public static /* synthetic */ void g(g2 g2Var, String str, List list, List list2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, pj.o oVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        List list4 = list2;
        Function1 function5 = (i10 & 8) != 0 ? null : function1;
        Function1 function6 = (i10 & 16) != 0 ? null : function2;
        b(g2Var, str, list3, list4, function5, function6, (i10 & 32) != 0 ? function5 : function3, (i10 & 64) != 0 ? function6 : function4, oVar);
    }

    public static /* synthetic */ void h(g2 g2Var, String str, List list, List list2, pj.n nVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        c(g2Var, str, list, list2, nVar);
    }

    public static /* synthetic */ void i(g2 g2Var, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, pj.o oVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        Function1 function6 = (i10 & 4) != 0 ? null : function1;
        Function1 function7 = (i10 & 8) != 0 ? null : function2;
        Function1 function8 = (i10 & 16) != 0 ? function6 : function3;
        Function1 function9 = (i10 & 32) != 0 ? function7 : function4;
        Function1 function10 = (i10 & 64) != 0 ? null : function5;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        e(g2Var, j1.d(Object.class), map2, list2, function6, function7, function8, function9, function10, oVar);
    }

    public static /* synthetic */ void j(g2 g2Var, kotlin.reflect.d dVar, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, pj.o oVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        Function1 function6 = (i10 & 8) != 0 ? null : function1;
        Function1 function7 = (i10 & 16) != 0 ? null : function2;
        e(g2Var, dVar, map2, list2, function6, function7, (i10 & 32) != 0 ? function6 : function3, (i10 & 64) != 0 ? function7 : function4, (i10 & 128) != 0 ? null : function5, oVar);
    }

    public static final void k(@NotNull g2 g2Var, @NotNull String str, @NotNull List<androidx.navigation.b0> list, @NotNull List<o1> list2, @NotNull androidx.compose.ui.window.k kVar, @NotNull pj.n<? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        o oVar = new o((n) g2Var.v().e(n.class), str, kVar, nVar);
        for (androidx.navigation.b0 b0Var : list) {
            oVar.b(b0Var.a(), b0Var.b());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            oVar.e((o1) it.next());
        }
        g2Var.u(oVar);
    }

    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void l(g2 g2Var, Map<kotlin.reflect.s, d3<?>> map, List<o1> list, androidx.compose.ui.window.k kVar, pj.n<? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        m(g2Var, j1.d(Object.class), map, list, kVar, nVar);
    }

    public static final <T> void m(@NotNull g2 g2Var, @NotNull kotlin.reflect.d<T> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull List<o1> list, @NotNull androidx.compose.ui.window.k kVar, @NotNull pj.n<? super androidx.navigation.n0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        o oVar = new o((n) g2Var.v().e(n.class), dVar, map, kVar, nVar);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            oVar.e((o1) it.next());
        }
        g2Var.u(oVar);
    }

    public static /* synthetic */ void n(g2 g2Var, String str, List list, List list2, androidx.compose.ui.window.k kVar, pj.n nVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        k(g2Var, str, list3, list2, (i10 & 8) != 0 ? new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null) : kVar, nVar);
    }

    public static /* synthetic */ void o(g2 g2Var, Map map, List list, androidx.compose.ui.window.k kVar, pj.n nVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        androidx.compose.ui.window.k kVar2 = (i10 & 4) != 0 ? new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null) : kVar;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        m(g2Var, j1.d(Object.class), map2, list2, kVar2, nVar);
    }

    public static /* synthetic */ void p(g2 g2Var, kotlin.reflect.d dVar, Map map, List list, androidx.compose.ui.window.k kVar, pj.n nVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        m(g2Var, dVar, map2, list, (i10 & 8) != 0 ? new androidx.compose.ui.window.k(false, false, false, 7, (DefaultConstructorMarker) null) : kVar, nVar);
    }

    public static final /* synthetic */ <T> void q(g2 g2Var, Object obj, Map<kotlin.reflect.s, d3<?>> map, List<o1> list, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function2, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function3, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function4, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function5, Function1<? super g2, Unit> function6) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        r(g2Var, obj, j1.d(Object.class), map, list, function1, function2, function3, function4, function5, function6);
    }

    public static final <T> void r(@NotNull g2 g2Var, @NotNull Object obj, @NotNull kotlin.reflect.d<T> dVar, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull List<o1> list, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function2, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function3, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function4, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function5, @NotNull Function1<? super g2, Unit> function6) {
        g2 g2Var2 = new g2(g2Var.v(), obj, (kotlin.reflect.d<?>) dVar, map);
        function6.invoke(g2Var2);
        e2 e2VarD = g2Var2.d();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e2VarD.i((o1) it.next());
        }
        if (e2VarD instanceof d.a) {
            d.a aVar = (d.a) e2VarD;
            aVar.B1(function1);
            aVar.C1(function2);
            aVar.D1(function3);
            aVar.F1(function4);
            aVar.G1(function5);
        }
        g2Var.r(e2VarD);
    }

    public static final void u(@NotNull g2 g2Var, @NotNull String str, @NotNull String str2, @NotNull List<androidx.navigation.b0> list, @NotNull List<o1> list2, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function2, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function3, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function4, @Nullable Function1<androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function5, @NotNull Function1<? super g2, Unit> function6) {
        g2 g2Var2 = new g2(g2Var.v(), str, str2);
        function6.invoke(g2Var2);
        e2 e2VarD = g2Var2.d();
        for (androidx.navigation.b0 b0Var : list) {
            e2VarD.d(b0Var.a(), b0Var.b());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            e2VarD.i((o1) it.next());
        }
        if (e2VarD instanceof d.a) {
            d.a aVar = (d.a) e2VarD;
            aVar.B1(function1);
            aVar.C1(function2);
            aVar.D1(function3);
            aVar.F1(function4);
            aVar.G1(function5);
        }
        g2Var.r(e2VarD);
    }

    public static final /* synthetic */ <T> void v(g2 g2Var, kotlin.reflect.d<?> dVar, Map<kotlin.reflect.s, d3<?>> map, List<o1> list, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function2, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function3, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function4, Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function5, Function1<? super g2, Unit> function6) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        w(g2Var, dVar, j1.d(Object.class), map, list, function1, function2, function3, function4, function5, function6);
    }

    public static final <T> void w(@NotNull g2 g2Var, @NotNull kotlin.reflect.d<?> dVar, @NotNull kotlin.reflect.d<T> dVar2, @NotNull Map<kotlin.reflect.s, d3<?>> map, @NotNull List<o1> list, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function1, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function2, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.d0> function3, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.f0> function4, @Nullable Function1<? super androidx.compose.animation.i<androidx.navigation.n0>, androidx.compose.animation.g1> function5, @NotNull Function1<? super g2, Unit> function6) {
        g2 g2Var2 = new g2(g2Var.v(), dVar, (kotlin.reflect.d<?>) dVar2, map);
        function6.invoke(g2Var2);
        e2 e2VarD = g2Var2.d();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e2VarD.i((o1) it.next());
        }
        if (e2VarD instanceof d.a) {
            d.a aVar = (d.a) e2VarD;
            aVar.B1(function1);
            aVar.C1(function2);
            aVar.D1(function3);
            aVar.F1(function4);
            aVar.G1(function5);
        }
        g2Var.r(e2VarD);
    }

    public static /* synthetic */ void x(g2 g2Var, Object obj, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        List listEmptyList = (i10 & 4) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i10 & 8) != 0 ? null : function1;
        Function1 function8 = (i10 & 16) != 0 ? null : function2;
        Function1 function9 = (i10 & 32) != 0 ? function7 : function3;
        Function1 function10 = (i10 & 64) != 0 ? function8 : function4;
        Function1 function11 = (i10 & 128) != 0 ? null : function5;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        r(g2Var, obj, j1.d(Object.class), map2, listEmptyList, function7, function8, function9, function10, function11, function6);
    }

    public static /* synthetic */ void y(g2 g2Var, Object obj, kotlin.reflect.d dVar, Map map, List list, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i10, Object obj2) {
        Map mapEmptyMap = (i10 & 4) != 0 ? MapsKt.emptyMap() : map;
        List listEmptyList = (i10 & 8) != 0 ? CollectionsKt.emptyList() : list;
        Function1 function7 = (i10 & 16) != 0 ? null : function1;
        Function1 function8 = (i10 & 32) != 0 ? null : function2;
        r(g2Var, obj, dVar, mapEmptyMap, listEmptyList, function7, function8, (i10 & 64) != 0 ? function7 : function3, (i10 & 128) != 0 ? function8 : function4, (i10 & 256) != 0 ? null : function5, function6);
    }

    public static /* synthetic */ void z(g2 g2Var, String str, String str2, List list, List list2, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        u(g2Var, str, str2, list3, list2, null, null, null, null, null, function1);
    }
}
