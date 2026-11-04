package androidx.navigation.internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.l0;
import androidx.lifecycle.l2;
import androidx.lifecycle.m2;
import androidx.lifecycle.o0;
import androidx.navigation.a3;
import androidx.navigation.b3;
import androidx.navigation.c1;
import androidx.navigation.e2;
import androidx.navigation.e4;
import androidx.navigation.f3;
import androidx.navigation.n0;
import androidx.navigation.p0;
import androidx.navigation.q3;
import androidx.navigation.r3;
import androidx.navigation.w0;
import androidx.navigation.w1;
import androidx.navigation.w2;
import androidx.navigation.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.z0;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavControllerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerImpl.kt\nandroidx/navigation/internal/NavControllerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProviderKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 8 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 9 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 11 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n+ 12 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1780:1\n1#2:1781\n1#2:1869\n1#2:1940\n1#2:1962\n1#2:1985\n1#2:2007\n1#2:2030\n1#2:2053\n84#3:1782\n84#3:1783\n84#3:1784\n2632#4,3:1785\n543#4,6:1788\n1863#4,2:1798\n1863#4,2:1800\n1863#4,2:1802\n1863#4,2:1804\n1863#4:1806\n774#4:1807\n865#4,2:1808\n1864#4:1810\n774#4:1811\n865#4,2:1812\n774#4:1814\n865#4,2:1815\n1863#4,2:1817\n1863#4:1819\n1797#4,3:1820\n1864#4:1823\n827#4:1832\n855#4,2:1833\n1863#4:1835\n1864#4:1843\n1246#4,4:1846\n1863#4,2:1872\n1863#4,2:1874\n388#4,7:1876\n1557#4:1883\n1628#4,3:1884\n1863#4,2:1887\n1863#4,2:1889\n827#4:1891\n855#4,2:1892\n1863#4,2:1894\n1863#4,2:1896\n543#4,6:1898\n543#4,6:1905\n543#4,6:1911\n1863#4,2:1917\n1863#4,2:1919\n1863#4,2:2056\n1863#4,2:2066\n543#4,6:2068\n543#4,6:2074\n543#4,6:2080\n1317#5,2:1794\n1317#5,2:1796\n183#5,2:2086\n90#6:1824\n106#6:1870\n90#6:1904\n106#6:1941\n106#6:1963\n106#6:1965\n106#6:1986\n106#6:1987\n106#6:2008\n106#6:2010\n106#6:2031\n106#6:2033\n106#6:2054\n106#6:2058\n106#6:2059\n90#6:2060\n381#7,7:1825\n381#7,7:1836\n462#7:1844\n412#7:1845\n27#8:1850\n46#8:1851\n32#8,4:1852\n31#8,7:1862\n27#8:1921\n46#8:1922\n32#8,4:1923\n31#8,7:1933\n27#8:1943\n46#8:1944\n32#8,4:1945\n31#8,7:1955\n27#8:1966\n46#8:1967\n32#8,4:1968\n31#8,7:1978\n27#8:1988\n46#8:1989\n32#8,4:1990\n31#8,7:2000\n27#8:2011\n46#8:2012\n32#8,4:2013\n31#8,7:2023\n27#8:2034\n46#8:2035\n32#8,4:2036\n31#8,7:2046\n126#9:1856\n153#9,3:1857\n126#9:1927\n153#9,3:1928\n126#9:1949\n153#9,3:1950\n126#9:1972\n153#9,3:1973\n126#9:1994\n153#9,3:1995\n126#9:2017\n153#9,3:2018\n126#9:2040\n153#9,3:2041\n37#10,2:1860\n37#10,2:1931\n37#10,2:1953\n37#10,2:1976\n37#10,2:1998\n37#10,2:2021\n37#10,2:2044\n37#10,2:2061\n46#11:1871\n46#11:1942\n46#11:1964\n46#11:2009\n46#11:2032\n46#11:2055\n13504#12,3:2063\n*S KotlinDebug\n*F\n+ 1 NavControllerImpl.kt\nandroidx/navigation/internal/NavControllerImpl\n*L\n1140#1:1869\n1547#1:1940\n1576#1:1962\n1585#1:1985\n1592#1:2007\n1602#1:2030\n1618#1:2053\n121#1:1782\n208#1:1783\n242#1:1784\n272#1:1785,3\n449#1:1788,6\n650#1:1798,2\n653#1:1800,2\n658#1:1802,2\n660#1:1804,2\n858#1:1806\n860#1:1807\n860#1:1808,2\n858#1:1810\n868#1:1811\n868#1:1812,2\n871#1:1814\n871#1:1815,2\n885#1:1817,2\n899#1:1819\n903#1:1820,3\n899#1:1823\n962#1:1832\n962#1:1833,2\n963#1:1835\n963#1:1843\n1093#1:1846,4\n1159#1:1872,2\n1222#1:1874,2\n1232#1:1876,7\n1241#1:1883\n1241#1:1884,3\n1258#1:1887,2\n1268#1:1889,2\n1335#1:1891\n1335#1:1892,2\n1339#1:1894,2\n1383#1:1896,2\n1425#1:1898,6\n1457#1:1905,6\n1486#1:1911,6\n1500#1:1917,2\n1516#1:1919,2\n1624#1:2056,2\n1662#1:2066,2\n1708#1:2068,6\n1718#1:2074,6\n1734#1:2080,6\n511#1:1794,2\n532#1:1796,2\n1762#1:2086,2\n921#1:1824\n1140#1:1870\n1455#1:1904\n1547#1:1941\n1576#1:1963\n1581#1:1965\n1585#1:1986\n1586#1:1987\n1592#1:2008\n1598#1:2010\n1602#1:2031\n1611#1:2033\n1618#1:2054\n1627#1:2058\n1629#1:2059\n1638#1:2060\n947#1:1825,7\n965#1:1836,7\n1093#1:1844\n1093#1:1845\n1140#1:1850\n1140#1:1851\n1140#1:1852,4\n1140#1:1862,7\n1547#1:1921\n1547#1:1922\n1547#1:1923,4\n1547#1:1933,7\n1576#1:1943\n1576#1:1944\n1576#1:1945,4\n1576#1:1955,7\n1585#1:1966\n1585#1:1967\n1585#1:1968,4\n1585#1:1978,7\n1592#1:1988\n1592#1:1989\n1592#1:1990,4\n1592#1:2000,7\n1602#1:2011\n1602#1:2012\n1602#1:2013,4\n1602#1:2023,7\n1618#1:2034\n1618#1:2035\n1618#1:2036,4\n1618#1:2046,7\n1140#1:1856\n1140#1:1857,3\n1547#1:1927\n1547#1:1928,3\n1576#1:1949\n1576#1:1950,3\n1585#1:1972\n1585#1:1973,3\n1592#1:1994\n1592#1:1995,3\n1602#1:2017\n1602#1:2018,3\n1618#1:2040\n1618#1:2041,3\n1140#1:1860,2\n1547#1:1931,2\n1576#1:1953,2\n1585#1:1976,2\n1592#1:1998,2\n1602#1:2021,2\n1618#1:2044,2\n1645#1:2061,2\n1140#1:1871\n1547#1:1942\n1576#1:1964\n1592#1:2009\n1602#1:2032\n1618#1:2055\n1651#1:2063,3\n*E\n"})
public final class x {

    @NotNull
    public static final a B = new a(null);

    @NotNull
    public static final String C = "NavController";

    @NotNull
    private static final String D = "android-support-nav:controller:navigatorState";

    @NotNull
    private static final String E = "android-support-nav:controller:navigatorState:names";

    @NotNull
    private static final String F = "android-support-nav:controller:backStack";

    @NotNull
    private static final String G = "android-support-nav:controller:backStackDestIds";

    @NotNull
    private static final String H = "android-support-nav:controller:backStackIds";

    @NotNull
    private static final String I = "android-support-nav:controller:backStackStates";

    @NotNull
    private static final String J = "android-support-nav:controller:backStackStates:";

    @NotNull
    private final kotlinx.coroutines.flow.j0<n0> A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w0 f71090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f71091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private e2 f71092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Bundle f71093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Bundle[] f71094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<n0> f71095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final k0<List<n0>> f71096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final z0<List<n0>> f71097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final k0<List<n0>> f71098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final z0<List<n0>> f71099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Map<n0, n0> f71100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Map<n0, androidx.navigation.internal.a> f71101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Map<Integer, String> f71102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Map<String, ArrayDeque<p0>> f71103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private o0 f71104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private c1 f71105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final List<w0.c> f71106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private androidx.lifecycle.c0.b f71107r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.n0 f71108s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private r3 f71109t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final Map<q3<? extends y1>, w0.b> f71110u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private Function1<? super n0, Unit> f71111v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Function1<? super n0, Unit> f71112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final Map<n0, Boolean> f71113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f71114y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private final List<n0> f71115z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public x(@NotNull w0 navController, @NotNull Function0<Unit> updateOnBackPressedCallbackEnabledCallback) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(updateOnBackPressedCallbackEnabledCallback, "updateOnBackPressedCallbackEnabledCallback");
        this.f71090a = navController;
        this.f71091b = updateOnBackPressedCallbackEnabledCallback;
        this.f71095f = new ArrayDeque<>();
        k0<List<n0>> k0VarA = b1.a(CollectionsKt.emptyList());
        this.f71096g = k0VarA;
        this.f71097h = kotlinx.coroutines.flow.k.n(k0VarA);
        k0<List<n0>> k0VarA2 = b1.a(CollectionsKt.emptyList());
        this.f71098i = k0VarA2;
        this.f71099j = kotlinx.coroutines.flow.k.n(k0VarA2);
        this.f71100k = new LinkedHashMap();
        this.f71101l = new LinkedHashMap();
        this.f71102m = new LinkedHashMap();
        this.f71103n = new LinkedHashMap();
        this.f71106q = new ArrayList();
        this.f71107r = androidx.lifecycle.c0.b.INITIALIZED;
        this.f71108s = new androidx.lifecycle.j0() { // from class: androidx.navigation.internal.q
            @Override // androidx.lifecycle.j0
            public final void e(o0 o0Var, androidx.lifecycle.c0.a aVar) {
                x.E0(this.f71076a, o0Var, aVar);
            }
        };
        this.f71109t = new r3();
        this.f71110u = new LinkedHashMap();
        this.f71113x = new LinkedHashMap();
        this.f71115z = new ArrayList();
        this.A = q0.b(1, 0, kotlinx.coroutines.channels.j.DROP_OLDEST, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A1(String str, String str2) {
        return Intrinsics.areEqual(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(i1.a aVar, i1.a aVar2, x xVar, boolean z10, ArrayDeque arrayDeque, n0 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        aVar.f312744a = true;
        aVar2.f312744a = true;
        xVar.q1(entry, z10, arrayDeque);
        return Unit.f312394a;
    }

    private final List<n0> B0(ArrayDeque<p0> arrayDeque) {
        y1 y1VarE0;
        ArrayList arrayList = new ArrayList();
        n0 n0VarLastOrNull = this.f71095f.lastOrNull();
        if (n0VarLastOrNull == null || (y1VarE0 = n0VarLastOrNull.f()) == null) {
            y1VarE0 = e0();
        }
        if (arrayDeque != null) {
            y1 y1Var = y1VarE0;
            for (p0 p0Var : arrayDeque) {
                x xVar = this;
                y1 y1VarN = N(xVar, y1Var, p0Var.b(), true, null, 8, null);
                if (y1VarN == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + y1.f71443f.d(xVar.i0(), p0Var.b()) + " cannot be found from the current destination " + y1Var).toString());
                }
                arrayList.add(p0Var.e(xVar.i0(), y1VarN, xVar.f0(), xVar.f71105p));
                y1Var = y1VarN;
                this = xVar;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y1 C(y1 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        e2 e2VarL = destination.L();
        if (e2VarL == null || e2VarL.Y0() != destination.D()) {
            return null;
        }
        return destination.L();
    }

    private final boolean C0(y1 y1Var, Bundle bundle) {
        int iNextIndex;
        y1 y1VarF;
        n0 n0VarB0 = b0();
        ArrayDeque<n0> arrayDeque = this.f71095f;
        ListIterator<n0> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().f() == y1Var) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (y1Var instanceof e2) {
            List listC3 = kotlin.sequences.o.c3(kotlin.sequences.o.k1(e2.f70908i.b((e2) y1Var), new Function1() { // from class: androidx.navigation.internal.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(x.D0((y1) obj));
                }
            }));
            if (this.f71095f.size() - iNextIndex != listC3.size()) {
                return false;
            }
            ArrayDeque<n0> arrayDeque2 = this.f71095f;
            List<n0> listSubList = arrayDeque2.subList(iNextIndex, arrayDeque2.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((n0) it.next()).f().D()));
            }
            if (!Intrinsics.areEqual(arrayList, listC3)) {
                return false;
            }
        } else if (n0VarB0 == null || (y1VarF = n0VarB0.f()) == null || y1Var.D() != y1VarF.D()) {
            return false;
        }
        ArrayDeque<n0> arrayDeque3 = new ArrayDeque();
        while (CollectionsKt.getLastIndex(this.f71095f) >= iNextIndex) {
            n0 n0Var = (n0) CollectionsKt.removeLast(this.f71095f);
            Q1(n0Var);
            arrayDeque3.addFirst(new n0(n0Var, n0Var.f().l(bundle)));
        }
        for (n0 n0Var2 : arrayDeque3) {
            e2 e2VarL = n0Var2.f().L();
            if (e2VarL != null) {
                F0(n0Var2, S(e2VarL.D()));
            }
            this.f71095f.add(n0Var2);
        }
        for (n0 n0Var3 : arrayDeque3) {
            this.f71109t.f(n0Var3.f().K()).k(n0Var3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(x xVar, y1 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return !xVar.f71102m.containsKey(Integer.valueOf(destination.D()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D0(y1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y1 E(y1 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        e2 e2VarL = destination.L();
        if (e2VarL == null || e2VarL.Y0() != destination.D()) {
            return null;
        }
        return destination.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(x xVar, o0 o0Var, androidx.lifecycle.c0.a event) {
        Intrinsics.checkNotNullParameter(o0Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        xVar.f71107r = event.p();
        if (xVar.f71092c != null) {
            Iterator it = CollectionsKt.toMutableList((Collection) xVar.f71095f).iterator();
            while (it.hasNext()) {
                ((n0) it.next()).q(event);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(x xVar, y1 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return !xVar.f71102m.containsKey(Integer.valueOf(destination.D()));
    }

    private final boolean H(List<n0> list, Bundle bundle, w2 w2Var, q3.a aVar) {
        n0 n0Var;
        y1 y1VarF;
        ArrayList<List<n0>> arrayList = new ArrayList();
        ArrayList<n0> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((n0) obj).f() instanceof e2)) {
                arrayList2.add(obj);
            }
        }
        for (n0 n0Var2 : arrayList2) {
            List list2 = (List) CollectionsKt.lastOrNull((List) arrayList);
            if (Intrinsics.areEqual((list2 == null || (n0Var = (n0) CollectionsKt.last(list2)) == null || (y1VarF = n0Var.f()) == null) ? null : y1VarF.K(), n0Var2.f().K())) {
                list2.add(n0Var2);
            } else {
                arrayList.add(CollectionsKt.mutableListOf(n0Var2));
            }
        }
        final i1.a aVar2 = new i1.a();
        for (List<n0> list3 : arrayList) {
            q3<? extends y1> q3VarF = this.f71109t.f(((n0) CollectionsKt.first((List) list3)).f().K());
            final i1.f fVar = new i1.f();
            final x xVar = this;
            final List<n0> list4 = list;
            final Bundle bundle2 = bundle;
            xVar.W0(q3VarF, list3, w2Var, aVar, new Function1() { // from class: androidx.navigation.internal.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return x.I(aVar2, list4, fVar, xVar, bundle2, (n0) obj2);
                }
            });
            bundle = bundle2;
            list = list4;
            this = xVar;
        }
        return aVar2.f312744a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(i1.a aVar, x xVar, y1 y1Var, Bundle bundle, n0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.f312744a = true;
        int i10 = 7 & 0;
        q(xVar, y1Var, bundle, it, null, 8, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(i1.a aVar, List list, i1.f fVar, x xVar, Bundle bundle, n0 entry) {
        List<n0> listEmptyList;
        Intrinsics.checkNotNullParameter(entry, "entry");
        aVar.f312744a = true;
        int iIndexOf = list.indexOf(entry);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            listEmptyList = list.subList(fVar.f312749a, i10);
            fVar.f312749a = i10;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        xVar.p(entry.f(), bundle, entry, listEmptyList);
        return Unit.f312394a;
    }

    public static /* synthetic */ y1 L(x xVar, int i10, y1 y1Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            y1Var = null;
        }
        return xVar.J(i10, y1Var);
    }

    public static /* synthetic */ y1 N(x xVar, y1 y1Var, int i10, boolean z10, y1 y1Var2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            y1Var2 = null;
        }
        return xVar.M(y1Var, i10, z10, y1Var2);
    }

    public static /* synthetic */ void T0(x xVar, Object obj, w2 w2Var, q3.a aVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        xVar.P0(obj, w2Var, aVar);
    }

    public static /* synthetic */ void U0(x xVar, String str, w2 w2Var, q3.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        xVar.R0(str, w2Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V0(n0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X0(x xVar, q3 q3Var, List list, w2 w2Var, q3.a aVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: androidx.navigation.internal.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return x.V0((n0) obj2);
                }
            };
        }
        xVar.W0(q3Var, list, w2Var, aVar, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(Function0 function0) {
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(n0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n1(x xVar, q3 q3Var, n0 n0Var, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: androidx.navigation.internal.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return x.i1((n0) obj2);
                }
            };
        }
        xVar.j1(q3Var, n0Var, z10, function1);
    }

    public static /* synthetic */ boolean o1(x xVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return xVar.k1(i10, z10, z11);
    }

    private final void p(y1 y1Var, Bundle bundle, n0 n0Var, List<n0> list) {
        Bundle bundle2;
        ArrayDeque<n0> arrayDeque;
        y1 y1VarF;
        List<n0> list2;
        e2 e2Var;
        n0 n0VarPrevious;
        n0 n0VarPrevious2;
        List<n0> list3 = list;
        y1 y1VarF2 = n0Var.f();
        if (!(y1VarF2 instanceof androidx.navigation.u)) {
            while (!this.f71095f.isEmpty() && (this.f71095f.last().f() instanceof androidx.navigation.u) && o1(this, this.f71095f.last().f().D(), true, false, 4, null)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        n0 n0Var2 = null;
        if (y1Var instanceof e2) {
            y1 y1Var2 = y1VarF2;
            while (true) {
                Intrinsics.checkNotNull(y1Var2);
                e2 e2VarL = y1Var2.L();
                if (e2VarL != null) {
                    ListIterator<n0> listIterator = list3.listIterator(list3.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            n0VarPrevious2 = null;
                            break;
                        }
                        n0VarPrevious2 = listIterator.previous();
                    } while (!Intrinsics.areEqual(n0VarPrevious2.f(), e2VarL));
                    n0 n0VarB = n0VarPrevious2;
                    if (n0VarB == null) {
                        bundle2 = bundle;
                        y1VarF = y1VarF2;
                        n0VarB = n0.a.b(n0.f71145j, i0(), e2VarL, bundle2, f0(), this.f71105p, null, null, 96, null);
                    } else {
                        bundle2 = bundle;
                        y1VarF = y1VarF2;
                    }
                    arrayDeque2.addFirst(n0VarB);
                    if (this.f71095f.isEmpty() || this.f71095f.last().f() != e2VarL) {
                        list2 = list;
                        arrayDeque = arrayDeque2;
                    } else {
                        list2 = list;
                        arrayDeque = arrayDeque2;
                        r1(this, this.f71095f.last(), false, null, 6, null);
                    }
                } else {
                    bundle2 = bundle;
                    arrayDeque = arrayDeque2;
                    y1VarF = y1VarF2;
                    list2 = list3;
                }
                if (e2VarL == null || e2VarL == y1Var) {
                    break;
                }
                list3 = list2;
                y1Var2 = e2VarL;
                arrayDeque2 = arrayDeque;
                y1VarF2 = y1VarF;
            }
        } else {
            bundle2 = bundle;
            arrayDeque = arrayDeque2;
            y1VarF = y1VarF2;
            list2 = list3;
            n0Var = n0Var;
        }
        y1 y1VarF3 = arrayDeque.isEmpty() ? y1VarF : ((n0) arrayDeque.first()).f();
        while (y1VarF3 != null && J(y1VarF3.D(), y1VarF3) != y1VarF3) {
            e2 e2VarL2 = y1VarF3.L();
            if (e2VarL2 != null) {
                Bundle bundle3 = (bundle2 == null || !androidx.savedstate.f.B0(androidx.savedstate.f.b(bundle2))) ? bundle2 : null;
                ListIterator<n0> listIterator2 = list2.listIterator(list2.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        n0VarPrevious = null;
                        break;
                    }
                    n0VarPrevious = listIterator2.previous();
                } while (!Intrinsics.areEqual(n0VarPrevious.f(), e2VarL2));
                n0 n0VarB2 = n0VarPrevious;
                if (n0VarB2 == null) {
                    e2Var = e2VarL2;
                    n0VarB2 = n0.a.b(n0.f71145j, i0(), e2Var, e2VarL2.l(bundle3), f0(), this.f71105p, null, null, 96, null);
                } else {
                    e2Var = e2VarL2;
                }
                arrayDeque.addFirst(n0VarB2);
            } else {
                e2Var = e2VarL2;
            }
            y1VarF3 = e2Var;
        }
        if (!arrayDeque.isEmpty()) {
            y1VarF = ((n0) arrayDeque.first()).f();
        }
        while (!this.f71095f.isEmpty() && (this.f71095f.last().f() instanceof e2)) {
            y1 y1VarF4 = this.f71095f.last().f();
            Intrinsics.checkNotNull(y1VarF4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((e2) y1VarF4).P0().g(y1VarF.D()) != null) {
                break;
            } else {
                r1(this, this.f71095f.last(), false, null, 6, null);
            }
        }
        n0 n0VarFirstOrNull = this.f71095f.firstOrNull();
        if (n0VarFirstOrNull == null) {
            n0VarFirstOrNull = (n0) arrayDeque.firstOrNull();
        }
        if (!Intrinsics.areEqual(n0VarFirstOrNull != null ? n0VarFirstOrNull.f() : null, this.f71092c)) {
            ListIterator<n0> listIterator3 = list2.listIterator(list2.size());
            while (listIterator3.hasPrevious()) {
                n0 n0VarPrevious3 = listIterator3.previous();
                y1 y1VarF5 = n0VarPrevious3.f();
                e2 e2Var2 = this.f71092c;
                Intrinsics.checkNotNull(e2Var2);
                if (Intrinsics.areEqual(y1VarF5, e2Var2)) {
                    n0Var2 = n0VarPrevious3;
                    break;
                }
            }
            n0 n0VarB3 = n0Var2;
            if (n0VarB3 == null) {
                n0.a aVar = n0.f71145j;
                h hVarI0 = i0();
                e2 e2Var3 = this.f71092c;
                Intrinsics.checkNotNull(e2Var3);
                e2 e2Var4 = this.f71092c;
                Intrinsics.checkNotNull(e2Var4);
                n0VarB3 = n0.a.b(aVar, hVarI0, e2Var3, e2Var4.l(bundle2), f0(), this.f71105p, null, null, 96, null);
            }
            arrayDeque.addFirst(n0VarB3);
        }
        for (n0 n0Var3 : arrayDeque) {
            w0.b bVar = this.f71110u.get(this.f71109t.f(n0Var3.f().K()));
            if (bVar == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + y1Var.K() + " should already be created").toString());
            }
            bVar.q(n0Var3);
        }
        this.f71095f.addAll(arrayDeque);
        this.f71095f.add(n0Var);
        for (n0 n0Var4 : CollectionsKt.plus((Collection<? extends n0>) arrayDeque, n0Var)) {
            e2 e2VarL3 = n0Var4.f().L();
            if (e2VarL3 != null) {
                F0(n0Var4, S(e2VarL3.D()));
            }
        }
    }

    public static /* synthetic */ boolean p1(x xVar, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return xVar.l1(obj, z10, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q(x xVar, y1 y1Var, Bundle bundle, n0 n0Var, List list, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        xVar.p(y1Var, bundle, n0Var, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void r1(x xVar, n0 n0Var, boolean z10, ArrayDeque arrayDeque, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            arrayDeque = new ArrayDeque();
        }
        xVar.q1(n0Var, z10, arrayDeque);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(a3 navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.F(true);
        return Unit.f312394a;
    }

    private final boolean x1(int i10, Bundle bundle, w2 w2Var, q3.a aVar) {
        if (!this.f71102m.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        final String str = this.f71102m.get(Integer.valueOf(i10));
        CollectionsKt.removeAll(this.f71102m.values(), new Function1() { // from class: androidx.navigation.internal.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.z1(str, (String) obj));
            }
        });
        return H(B0((ArrayDeque) r1.k(this.f71103n).remove(str)), bundle, w2Var, aVar);
    }

    private final boolean y1(String str) {
        p0 p0VarFirstOrNull;
        int iHashCode = y1.f71443f.c(str).hashCode();
        if (this.f71102m.containsKey(Integer.valueOf(iHashCode))) {
            return x1(iHashCode, null, null, null);
        }
        y1 y1VarK = K(str);
        if (y1VarK == null) {
            throw new IllegalStateException(("Restore State failed: route " + str + " cannot be found from the current destination " + c0()).toString());
        }
        final String str2 = this.f71102m.get(Integer.valueOf(y1VarK.D()));
        CollectionsKt.removeAll(this.f71102m.values(), new Function1() { // from class: androidx.navigation.internal.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.A1(str2, (String) obj));
            }
        });
        ArrayDeque<p0> arrayDeque = (ArrayDeque) r1.k(this.f71103n).remove(str2);
        y1.c cVarY = y1VarK.Y(str);
        Intrinsics.checkNotNull(cVarY);
        if (cVarY.n((arrayDeque == null || (p0VarFirstOrNull = arrayDeque.firstOrNull()) == null) ? null : p0VarFirstOrNull.a())) {
            return H(B0(arrayDeque), null, null, null);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z1(String str, String str2) {
        return Intrinsics.areEqual(str2, str);
    }

    public final boolean A() {
        while (!this.f71095f.isEmpty() && (this.f71095f.last().f() instanceof e2)) {
            boolean z10 = true;
            r1(this, this.f71095f.last(), false, null, 6, null);
        }
        n0 n0VarLastOrNull = this.f71095f.lastOrNull();
        if (n0VarLastOrNull != null) {
            this.f71115z.add(n0VarLastOrNull);
        }
        this.f71114y++;
        R1();
        int i10 = this.f71114y - 1;
        this.f71114y = i10;
        if (i10 == 0) {
            List<n0> mutableList = CollectionsKt.toMutableList((Collection) this.f71115z);
            this.f71115z.clear();
            for (n0 n0Var : mutableList) {
                Iterator it = CollectionsKt.toList(this.f71106q).iterator();
                while (it.hasNext()) {
                    ((w0.c) it.next()).a(this.f71090a, n0Var.f(), n0Var.b());
                }
                this.A.f(n0Var);
            }
            this.f71096g.f(CollectionsKt.toMutableList((Collection) this.f71095f));
            this.f71098i.f(s1());
        }
        return n0VarLastOrNull != null;
    }

    @NotNull
    public final k0<List<n0>> A0() {
        return this.f71098i;
    }

    @Nullable
    public final Bundle B1() {
        Pair[] pairArr;
        Bundle bundleB;
        Pair[] pairArr2;
        Pair[] pairArr3;
        Pair[] pairArr4;
        Pair[] pairArr5;
        ArrayList arrayList = new ArrayList();
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList2.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        }
        Bundle bundleB2 = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        androidx.savedstate.n.c(bundleB2);
        for (Map.Entry<String, q3<? extends y1>> entry2 : this.f71109t.g().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleN = entry2.getValue().n();
            if (bundleN != null) {
                arrayList.add(key);
                androidx.savedstate.n.D(androidx.savedstate.n.c(bundleB2), key, bundleN);
            }
        }
        if (arrayList.isEmpty()) {
            bundleB = null;
        } else {
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (mapEmptyMap2.isEmpty()) {
                pairArr5 = new Pair[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapEmptyMap2.size());
                for (Map.Entry entry3 : mapEmptyMap2.entrySet()) {
                    arrayList3.add(TuplesKt.to((String) entry3.getKey(), entry3.getValue()));
                }
                pairArr5 = (Pair[]) arrayList3.toArray(new Pair[0]);
            }
            bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr5, pairArr5.length));
            Bundle bundleC = androidx.savedstate.n.c(bundleB);
            androidx.savedstate.n.L(androidx.savedstate.n.c(bundleB2), E, arrayList);
            androidx.savedstate.n.D(bundleC, D, bundleB2);
        }
        if (!this.f71095f.isEmpty()) {
            if (bundleB == null) {
                Map mapEmptyMap3 = MapsKt.emptyMap();
                if (mapEmptyMap3.isEmpty()) {
                    pairArr4 = new Pair[0];
                } else {
                    ArrayList arrayList4 = new ArrayList(mapEmptyMap3.size());
                    for (Map.Entry entry4 : mapEmptyMap3.entrySet()) {
                        arrayList4.add(TuplesKt.to((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr4 = (Pair[]) arrayList4.toArray(new Pair[0]);
                }
                bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr4, pairArr4.length));
                androidx.savedstate.n.c(bundleB);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<n0> it = this.f71095f.iterator();
            while (it.hasNext()) {
                arrayList5.add(new p0(it.next()).g());
            }
            androidx.savedstate.n.F(androidx.savedstate.n.c(bundleB), F, arrayList5);
        }
        if (!this.f71102m.isEmpty()) {
            if (bundleB == null) {
                Map mapEmptyMap4 = MapsKt.emptyMap();
                if (mapEmptyMap4.isEmpty()) {
                    pairArr3 = new Pair[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(mapEmptyMap4.size());
                    for (Map.Entry entry5 : mapEmptyMap4.entrySet()) {
                        arrayList6.add(TuplesKt.to((String) entry5.getKey(), entry5.getValue()));
                    }
                    pairArr3 = (Pair[]) arrayList6.toArray(new Pair[0]);
                }
                bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length));
                androidx.savedstate.n.c(bundleB);
            }
            int[] iArr = new int[this.f71102m.size()];
            ArrayList arrayList7 = new ArrayList();
            int i10 = 0;
            for (Map.Entry<Integer, String> entry6 : this.f71102m.entrySet()) {
                int iIntValue = entry6.getKey().intValue();
                String value = entry6.getValue();
                int i11 = i10 + 1;
                iArr[i10] = iIntValue;
                if (value == null) {
                    value = "";
                }
                arrayList7.add(value);
                i10 = i11;
            }
            Bundle bundleC2 = androidx.savedstate.n.c(bundleB);
            androidx.savedstate.n.u(bundleC2, G, iArr);
            androidx.savedstate.n.L(bundleC2, H, arrayList7);
        }
        if (!this.f71103n.isEmpty()) {
            if (bundleB == null) {
                Map mapEmptyMap5 = MapsKt.emptyMap();
                if (mapEmptyMap5.isEmpty()) {
                    pairArr2 = new Pair[0];
                } else {
                    ArrayList arrayList8 = new ArrayList(mapEmptyMap5.size());
                    for (Map.Entry entry7 : mapEmptyMap5.entrySet()) {
                        arrayList8.add(TuplesKt.to((String) entry7.getKey(), entry7.getValue()));
                    }
                    pairArr2 = (Pair[]) arrayList8.toArray(new Pair[0]);
                }
                bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
                androidx.savedstate.n.c(bundleB);
            }
            ArrayList arrayList9 = new ArrayList();
            for (Map.Entry<String, ArrayDeque<p0>> entry8 : this.f71103n.entrySet()) {
                String key2 = entry8.getKey();
                ArrayDeque<p0> value2 = entry8.getValue();
                arrayList9.add(key2);
                ArrayList arrayList10 = new ArrayList();
                Iterator<p0> it2 = value2.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(it2.next().g());
                }
                androidx.savedstate.n.F(androidx.savedstate.n.c(bundleB), J + key2, arrayList10);
            }
            androidx.savedstate.n.L(androidx.savedstate.n.c(bundleB), I, arrayList9);
        }
        return bundleB;
    }

    public final void C1(@Nullable Function1<? super n0, Unit> function1) {
        this.f71111v = function1;
    }

    public final void D1(@Nullable Bundle[] bundleArr) {
        this.f71094e = bundleArr;
    }

    @androidx.annotation.i
    @l0
    public final void E1(@NotNull e2 graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        F1(graph, null);
    }

    public final void F0(@NotNull n0 child, @NotNull n0 parent) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f71100k.put(child, parent);
        if (this.f71101l.get(parent) == null) {
            this.f71101l.put(parent, new androidx.navigation.internal.a(0));
        }
        androidx.navigation.internal.a aVar = this.f71101l.get(parent);
        Intrinsics.checkNotNull(aVar);
        aVar.c();
    }

    public final void F1(@NotNull e2 graph, @Nullable Bundle bundle) {
        x xVar;
        Intrinsics.checkNotNullParameter(graph, "graph");
        if (!this.f71095f.isEmpty() && f0() == androidx.lifecycle.c0.b.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (!Intrinsics.areEqual(this.f71092c, graph)) {
            e2 e2Var = this.f71092c;
            if (e2Var != null) {
                for (Integer num : new ArrayList(this.f71102m.keySet())) {
                    Intrinsics.checkNotNull(num);
                    x(num.intValue());
                }
                xVar = this;
                o1(xVar, e2Var.D(), true, false, 4, null);
            } else {
                xVar = this;
            }
            xVar.f71092c = graph;
            xVar.Y0(bundle);
            return;
        }
        int size = graph.P0().size();
        int i10 = 7 >> 0;
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1VarZ = graph.P0().z(i11);
            e2 e2Var2 = this.f71092c;
            Intrinsics.checkNotNull(e2Var2);
            int iN = e2Var2.P0().n(i11);
            e2 e2Var3 = this.f71092c;
            Intrinsics.checkNotNull(e2Var3);
            e2Var3.P0().v(iN, y1VarZ);
        }
        for (n0 n0Var : this.f71095f) {
            List<y1> listAsReversed = CollectionsKt.asReversed(kotlin.sequences.o.c3(y1.f71443f.e(n0Var.f())));
            y1 y1VarF0 = this.f71092c;
            Intrinsics.checkNotNull(y1VarF0);
            for (y1 y1Var : listAsReversed) {
                if (!Intrinsics.areEqual(y1Var, this.f71092c) || !Intrinsics.areEqual(y1VarF0, graph)) {
                    if (y1VarF0 instanceof e2) {
                        y1VarF0 = ((e2) y1VarF0).F0(y1Var.D());
                        Intrinsics.checkNotNull(y1VarF0);
                    }
                }
            }
            n0Var.t(y1VarF0);
        }
    }

    public final boolean G(@NotNull List<? extends q3<?>> popOperations, @NotNull y1 foundDestination, boolean z10, boolean z11) {
        final x xVar;
        final boolean z12;
        Intrinsics.checkNotNullParameter(popOperations, "popOperations");
        Intrinsics.checkNotNullParameter(foundDestination, "foundDestination");
        final i1.a aVar = new i1.a();
        final ArrayDeque<p0> arrayDeque = new ArrayDeque<>();
        Iterator<? extends q3<?>> it = popOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                xVar = this;
                z12 = z11;
                break;
            }
            q3<? extends y1> q3Var = (q3) it.next();
            final i1.a aVar2 = new i1.a();
            xVar = this;
            z12 = z11;
            xVar.j1(q3Var, this.f71095f.last(), z12, new Function1() { // from class: androidx.navigation.internal.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x.B(aVar2, aVar, xVar, z12, arrayDeque, (n0) obj);
                }
            });
            if (!aVar2.f312744a) {
                break;
            }
            this = xVar;
            z11 = z12;
        }
        if (z12) {
            if (!z10) {
                for (y1 y1Var : kotlin.sequences.o.Z2(kotlin.sequences.o.l(foundDestination, new Function1() { // from class: androidx.navigation.internal.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return x.C((y1) obj);
                    }
                }), new Function1() { // from class: androidx.navigation.internal.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(x.D(this.f71070a, (y1) obj));
                    }
                })) {
                    Map<Integer, String> map = xVar.f71102m;
                    Integer numValueOf = Integer.valueOf(y1Var.D());
                    p0 p0VarFirstOrNull = arrayDeque.firstOrNull();
                    map.put(numValueOf, p0VarFirstOrNull != null ? p0VarFirstOrNull.c() : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                p0 p0VarFirst = arrayDeque.first();
                Iterator it2 = kotlin.sequences.o.Z2(kotlin.sequences.o.l(L(xVar, p0VarFirst.b(), null, 2, null), new Function1() { // from class: androidx.navigation.internal.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return x.E((y1) obj);
                    }
                }), new Function1() { // from class: androidx.navigation.internal.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(x.F(this.f71071a, (y1) obj));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    xVar.f71102m.put(Integer.valueOf(((y1) it2.next()).D()), p0VarFirst.c());
                }
                if (xVar.f71102m.values().contains(p0VarFirst.c())) {
                    xVar.f71103n.put(p0VarFirst.c(), arrayDeque);
                }
            }
        }
        xVar.f71091b.invoke();
        return aVar.f312744a;
    }

    public final void G0(@NotNull w0.b state, @NotNull n0 entry, @NotNull Function0<Unit> superCallback) {
        c1 c1Var;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(superCallback, "superCallback");
        boolean zAreEqual = Intrinsics.areEqual(this.f71113x.get(entry), Boolean.TRUE);
        superCallback.invoke();
        this.f71113x.remove(entry);
        if (this.f71095f.contains(entry)) {
            if (!state.e()) {
                R1();
                this.f71096g.f(CollectionsKt.toMutableList((Collection) this.f71095f));
                this.f71098i.f(s1());
            }
            return;
        }
        Q1(entry);
        if (entry.getLifecycle().d().n(androidx.lifecycle.c0.b.CREATED)) {
            entry.v(androidx.lifecycle.c0.b.DESTROYED);
        }
        ArrayDeque<n0> arrayDeque = this.f71095f;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<n0> it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().h(), entry.h())) {
                }
            }
            if (!zAreEqual && (c1Var = this.f71105p) != null) {
                c1Var.U(entry.h());
            }
        } else if (!zAreEqual) {
            c1Var.U(entry.h());
        }
        R1();
        this.f71098i.f(s1());
    }

    public final void G1(@NotNull androidx.lifecycle.c0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f71107r = bVar;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void H1(@NotNull o0 owner) {
        androidx.lifecycle.c0 lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.areEqual(owner, this.f71104o)) {
            return;
        }
        o0 o0Var = this.f71104o;
        if (o0Var != null && (lifecycle = o0Var.getLifecycle()) != null) {
            lifecycle.g(this.f71108s);
        }
        this.f71104o = owner;
        owner.getLifecycle().c(this.f71108s);
    }

    public final void I0(@NotNull Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        L0(new w1(deepLink, null, null));
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void I1(@NotNull r3 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        if (!this.f71095f.isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call");
        }
        this.f71109t = navigatorProvider;
    }

    @Nullable
    public final y1 J(int i10, @Nullable y1 y1Var) {
        y1 y1VarF;
        e2 e2Var = this.f71092c;
        if (e2Var == null) {
            return null;
        }
        Intrinsics.checkNotNull(e2Var);
        if (e2Var.D() == i10) {
            if (y1Var == null) {
                return this.f71092c;
            }
            if (Intrinsics.areEqual(this.f71092c, y1Var) && y1Var.L() == null) {
                return this.f71092c;
            }
        }
        n0 n0VarLastOrNull = this.f71095f.lastOrNull();
        if (n0VarLastOrNull == null || (y1VarF = n0VarLastOrNull.f()) == null) {
            y1VarF = this.f71092c;
            Intrinsics.checkNotNull(y1VarF);
        }
        return M(y1VarF, i10, false, y1Var);
    }

    public final void J0(@NotNull Uri deepLink, @Nullable w2 w2Var) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        N0(new w1(deepLink, null, null), w2Var, null);
    }

    public final void J1(@Nullable Bundle bundle) {
        this.f71093d = bundle;
    }

    @Nullable
    public final y1 K(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        e2 e2Var = this.f71092c;
        if (e2Var == null) {
            return null;
        }
        Intrinsics.checkNotNull(e2Var);
        if (!Intrinsics.areEqual(e2Var.M(), route)) {
            e2 e2Var2 = this.f71092c;
            Intrinsics.checkNotNull(e2Var2);
            if (e2Var2.Y(route) == null) {
                return r0().I0(route);
            }
        }
        return this.f71092c;
    }

    public final void K0(@NotNull Uri deepLink, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        N0(new w1(deepLink, null, null), w2Var, aVar);
    }

    public final void K1(@Nullable Function1<? super n0, Unit> function1) {
        this.f71112w = function1;
    }

    public final void L0(@NotNull w1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        M0(request, null);
    }

    public final void L1(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f71091b = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.navigation.e2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.navigation.e2, androidx.navigation.y1] */
    @Nullable
    public final y1 M(@NotNull y1 destination, int i10, boolean z10, @Nullable y1 y1Var) {
        ?? L;
        e2 e2Var;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.D() == i10 && (y1Var == null || (Intrinsics.areEqual(destination, y1Var) && Intrinsics.areEqual(destination.L(), y1Var.L())))) {
            return destination;
        }
        if (destination instanceof e2) {
            e2Var = (e2) destination;
        } else {
            L = 0;
        }
        if (L == 0) {
            L = e2Var;
            L = destination.L();
            Intrinsics.checkNotNull(L);
        }
        L = e2Var;
        return L.L0(i10, L, z10, y1Var);
    }

    public final void M0(@NotNull w1 request, @Nullable w2 w2Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        N0(request, w2Var, null);
    }

    public final void M1(@Nullable c1 c1Var) {
        this.f71105p = c1Var;
    }

    public final void N0(@NotNull w1 request, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f71092c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this.f71090a + '.').toString());
        }
        e2 e2VarR0 = r0();
        y1.c cVarD1 = e2VarR0.d1(request, true, true, e2VarR0);
        if (cVarD1 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f71092c);
        }
        Bundle bundleL = cVarD1.k().l(cVarD1.l());
        if (bundleL == null) {
            Map mapEmptyMap = MapsKt.emptyMap();
            if (mapEmptyMap.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                for (Map.Entry entry : mapEmptyMap.entrySet()) {
                    arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleL = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            androidx.savedstate.n.c(bundleL);
        }
        y1 y1VarK = cVarD1.k();
        this.f71090a.g1(request, bundleL);
        O0(y1VarK, bundleL, w2Var, aVar);
    }

    public final void N1(@NotNull l2 viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        c1 c1Var = this.f71105p;
        c1.a aVar = c1.f70632b;
        if (Intrinsics.areEqual(c1Var, aVar.a(viewModelStore))) {
            return;
        }
        if (!this.f71095f.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f71105p = aVar.a(viewModelStore);
    }

    @Nullable
    public final String O(@NotNull int[] deepLink) {
        e2 e2Var;
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        e2 e2Var2 = this.f71092c;
        int length = deepLink.length;
        int i10 = 0;
        while (true) {
            y1 y1VarF0 = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = deepLink[i10];
            if (i10 == 0) {
                e2 e2Var3 = this.f71092c;
                Intrinsics.checkNotNull(e2Var3);
                if (e2Var3.D() == i11) {
                    y1VarF0 = this.f71092c;
                }
            } else {
                Intrinsics.checkNotNull(e2Var2);
                y1VarF0 = e2Var2.F0(i11);
            }
            if (y1VarF0 == null) {
                return y1.f71443f.d(i0(), i11);
            }
            if (i10 != deepLink.length - 1 && (y1VarF0 instanceof e2)) {
                while (true) {
                    e2Var = (e2) y1VarF0;
                    Intrinsics.checkNotNull(e2Var);
                    if (!(e2Var.F0(e2Var.Y0()) instanceof e2)) {
                        break;
                    }
                    y1VarF0 = e2Var.F0(e2Var.Y0());
                }
                e2Var2 = e2Var;
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    public final void O0(@NotNull final y1 node, @Nullable Bundle bundle, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        boolean z10;
        boolean z11;
        boolean zK1;
        Intrinsics.checkNotNullParameter(node, "node");
        Iterator<T> it = this.f71110u.values().iterator();
        while (it.hasNext()) {
            ((w0.b) it.next()).n(true);
        }
        final i1.a aVar2 = new i1.a();
        if (w2Var == null) {
            z10 = false;
        } else {
            if (w2Var.g() != null) {
                String strG = w2Var.g();
                Intrinsics.checkNotNull(strG);
                zK1 = m1(strG, w2Var.j(), w2Var.l());
            } else if (w2Var.h() != null) {
                kotlin.reflect.d<?> dVarH = w2Var.h();
                Intrinsics.checkNotNull(dVarH);
                zK1 = k1(androidx.navigation.serialization.p.k(m0.i(dVarH)), w2Var.j(), w2Var.l());
            } else if (w2Var.i() != null) {
                Object objI = w2Var.i();
                Intrinsics.checkNotNull(objI);
                zK1 = l1(objI, w2Var.j(), w2Var.l());
            } else if (w2Var.f() != -1) {
                zK1 = k1(w2Var.f(), w2Var.j(), w2Var.l());
            } else {
                z10 = false;
            }
            z10 = zK1;
        }
        final Bundle bundleL = node.l(bundle);
        if (w2Var != null && w2Var.m() && this.f71102m.containsKey(Integer.valueOf(node.D()))) {
            aVar2.f312744a = x1(node.D(), bundleL, w2Var, aVar);
            z11 = false;
        } else {
            z11 = w2Var != null && w2Var.k() && C0(node, bundle);
            if (!z11) {
                W0(this.f71109t.f(node.K()), CollectionsKt.listOf(n0.a.b(n0.f71145j, i0(), node, bundleL, f0(), this.f71105p, null, null, 96, null)), w2Var, aVar, new Function1() { // from class: androidx.navigation.internal.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return x.H0(aVar2, this, node, bundleL, (n0) obj);
                    }
                });
            }
        }
        this.f71091b.invoke();
        Iterator<T> it2 = this.f71110u.values().iterator();
        while (it2.hasNext()) {
            ((w0.b) it2.next()).n(false);
        }
        if (z10 || aVar2.f312744a || z11) {
            A();
        } else {
            R1();
        }
    }

    public final void O1(@Nullable e2 e2Var) {
        this.f71092c = e2Var;
    }

    @NotNull
    public final <T> String P(@NotNull T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        y1 y1VarN = N(this, e0(), androidx.navigation.serialization.p.k(m0.i(j1.d(route.getClass()))), true, null, 8, null);
        if (y1VarN == null) {
            throw new IllegalArgumentException(("Destination with route " + j1.d(route.getClass()).Q() + " cannot be found in navigation graph " + this.f71092c).toString());
        }
        Map<String, androidx.navigation.j0> mapU = y1VarN.u();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapU.size()));
        Iterator<T> it = mapU.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((androidx.navigation.j0) entry.getValue()).b());
        }
        return androidx.navigation.serialization.p.t(route, linkedHashMap);
    }

    public final <T> void P0(@NotNull T route, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(route, "route");
        R0(P(route), w2Var, aVar);
    }

    public final void P1(@NotNull r3 r3Var) {
        Intrinsics.checkNotNullParameter(r3Var, "<set-?>");
        this.f71109t = r3Var;
    }

    @Nullable
    public final Function1<n0, Unit> Q() {
        return this.f71111v;
    }

    public final <T> void Q0(@NotNull T route, @NotNull Function1<? super a3, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        T0(this, route, b3.a(builder), null, 4, null);
    }

    @Nullable
    public final n0 Q1(@NotNull n0 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        n0 n0VarRemove = this.f71100k.remove(child);
        if (n0VarRemove == null) {
            return null;
        }
        androidx.navigation.internal.a aVar = this.f71101l.get(n0VarRemove);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.a()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            w0.b bVar = this.f71110u.get(this.f71109t.f(n0VarRemove.f().K()));
            if (bVar != null) {
                bVar.f(n0VarRemove);
            }
            this.f71101l.remove(n0VarRemove);
        }
        return n0VarRemove;
    }

    @NotNull
    public final ArrayDeque<n0> R() {
        return this.f71095f;
    }

    public final void R0(@NotNull String route, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(route, "route");
        if (this.f71092c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        e2 e2VarR0 = r0();
        y1.c cVarF1 = e2VarR0.f1(route, true, true, e2VarR0);
        if (cVarF1 == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + route + " cannot be found in the navigation graph " + this.f71092c);
        }
        y1 y1VarK = cVarF1.k();
        Bundle bundleL = y1VarK.l(cVarF1.l());
        if (bundleL == null) {
            Map mapEmptyMap = MapsKt.emptyMap();
            if (mapEmptyMap.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                for (Map.Entry entry : mapEmptyMap.entrySet()) {
                    arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleL = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            androidx.savedstate.n.c(bundleL);
        }
        y1 y1VarK2 = cVarF1.k();
        this.f71090a.g1(w1.a.f71408d.c(f3.a(y1.f71443f.c(y1VarK.M()))).a(), bundleL);
        O0(y1VarK2, bundleL, w2Var, aVar);
    }

    public final void R1() {
        androidx.navigation.internal.a aVar;
        z0<Set<n0>> z0VarD;
        Set<n0> value;
        List<n0> mutableList = CollectionsKt.toMutableList((Collection) this.f71095f);
        if (!mutableList.isEmpty()) {
            y1 y1VarF = ((n0) CollectionsKt.last(mutableList)).f();
            List listMutableListOf = CollectionsKt.mutableListOf(y1VarF);
            if (y1VarF instanceof e4) {
                boolean z10 = y1VarF instanceof androidx.navigation.u;
                Iterator it = CollectionsKt.drop(CollectionsKt.reversed(mutableList), 1).iterator();
                while (it.hasNext()) {
                    y1 y1VarF2 = ((n0) it.next()).f();
                    if (z10 && !(y1VarF2 instanceof androidx.navigation.u) && !(y1VarF2 instanceof e2)) {
                        break;
                    }
                    listMutableListOf.add(y1VarF2);
                    if (!(y1VarF2 instanceof e4) && !(y1VarF2 instanceof e2)) {
                        break;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (CollectionsKt.last(listMutableListOf) instanceof androidx.navigation.u) {
                Iterator it2 = CollectionsKt.reversed(mutableList).iterator();
                while (it2.hasNext()) {
                    y1 y1VarF3 = ((n0) it2.next()).f();
                    arrayList.add(y1VarF3);
                    if (!(y1VarF3 instanceof androidx.navigation.u) && !(y1VarF3 instanceof e4) && !(y1VarF3 instanceof e2)) {
                        break;
                    }
                }
            }
            HashMap map = new HashMap();
            for (n0 n0Var : CollectionsKt.reversed(mutableList)) {
                androidx.lifecycle.c0.b bVarK = n0Var.k();
                y1 y1VarF4 = n0Var.f();
                y1 y1Var = (y1) CollectionsKt.firstOrNull(listMutableListOf);
                if (y1Var != null && y1Var.D() == y1VarF4.D()) {
                    androidx.lifecycle.c0.b bVar = androidx.lifecycle.c0.b.RESUMED;
                    if (bVarK != bVar) {
                        w0.b bVar2 = this.f71110u.get(k0().f(n0Var.f().K()));
                        if (Intrinsics.areEqual((bVar2 == null || (z0VarD = bVar2.d()) == null || (value = z0VarD.getValue()) == null) ? null : Boolean.valueOf(value.contains(n0Var)), Boolean.TRUE) || ((aVar = this.f71101l.get(n0Var)) != null && aVar.b() == 0)) {
                            map.put(n0Var, androidx.lifecycle.c0.b.STARTED);
                        } else {
                            map.put(n0Var, bVar);
                        }
                    }
                    y1 y1Var2 = (y1) CollectionsKt.firstOrNull((List) arrayList);
                    if (y1Var2 != null && y1Var2.D() == y1VarF4.D()) {
                        CollectionsKt.removeFirst(arrayList);
                    }
                    CollectionsKt.removeFirst(listMutableListOf);
                    e2 e2VarL = y1VarF4.L();
                    if (e2VarL != null) {
                        listMutableListOf.add(e2VarL);
                    }
                } else if (arrayList.isEmpty() || y1VarF4.D() != ((y1) CollectionsKt.first((List) arrayList)).D()) {
                    n0Var.v(androidx.lifecycle.c0.b.CREATED);
                } else {
                    y1 y1Var3 = (y1) CollectionsKt.removeFirst(arrayList);
                    if (bVarK == androidx.lifecycle.c0.b.RESUMED) {
                        n0Var.v(androidx.lifecycle.c0.b.STARTED);
                    } else {
                        androidx.lifecycle.c0.b bVar3 = androidx.lifecycle.c0.b.STARTED;
                        if (bVarK != bVar3) {
                            map.put(n0Var, bVar3);
                        }
                    }
                    e2 e2VarL2 = y1Var3.L();
                    if (e2VarL2 != null && !arrayList.contains(e2VarL2)) {
                        arrayList.add(e2VarL2);
                    }
                }
            }
            for (n0 n0Var2 : mutableList) {
                androidx.lifecycle.c0.b bVar4 = (androidx.lifecycle.c0.b) map.get(n0Var2);
                if (bVar4 != null) {
                    n0Var2.v(bVar4);
                } else {
                    n0Var2.w();
                }
            }
        }
    }

    @NotNull
    public final n0 S(int i10) {
        n0 n0VarPrevious;
        ArrayDeque<n0> arrayDeque = this.f71095f;
        ListIterator<n0> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                n0VarPrevious = null;
                break;
            }
            n0VarPrevious = listIterator.previous();
        } while (n0VarPrevious.f().D() != i10);
        n0 n0Var = n0VarPrevious;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException(("No destination with ID " + i10 + " is on the NavController's back stack. The current destination is " + c0()).toString());
    }

    public final void S0(@NotNull String route, @NotNull Function1<? super a3, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        U0(this, route, b3.a(builder), null, 4, null);
    }

    @NotNull
    public final <T> n0 T(@NotNull T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return U(P(route));
    }

    @NotNull
    public final n0 U(@NotNull String route) {
        n0 n0VarPrevious;
        n0 n0Var;
        Intrinsics.checkNotNullParameter(route, "route");
        ArrayDeque<n0> arrayDeque = this.f71095f;
        ListIterator<n0> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                n0VarPrevious = null;
                break;
            }
            n0VarPrevious = listIterator.previous();
            n0Var = n0VarPrevious;
        } while (!n0Var.f().R(route, n0Var.b()));
        n0 n0Var2 = n0VarPrevious;
        if (n0Var2 != null) {
            return n0Var2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + c0()).toString());
    }

    @NotNull
    public final <T> n0 V(@NotNull kotlin.reflect.d<T> route) {
        n0 n0VarPrevious;
        Intrinsics.checkNotNullParameter(route, "route");
        int iK = androidx.navigation.serialization.p.k(m0.i(route));
        if (N(this, e0(), iK, true, null, 8, null) == null) {
            throw new IllegalArgumentException(("Destination with route " + route.Q() + " cannot be found in navigation graph " + e0()).toString());
        }
        List<n0> value = this.f71097h.getValue();
        ListIterator<n0> listIterator = value.listIterator(value.size());
        do {
            if (!listIterator.hasPrevious()) {
                n0VarPrevious = null;
                break;
            }
            n0VarPrevious = listIterator.previous();
        } while (n0VarPrevious.f().D() != iK);
        n0 n0Var = n0VarPrevious;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException(("No destination with route " + route.Q() + " is on the NavController's back stack. The current destination is " + c0()).toString());
    }

    @NotNull
    public final Map<Integer, String> W() {
        return this.f71102m;
    }

    public final void W0(@NotNull q3<? extends y1> navigator, @NotNull List<n0> entries, @Nullable w2 w2Var, @Nullable q3.a aVar, @NotNull Function1<? super n0, Unit> handler) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f71111v = handler;
        navigator.h(entries, w2Var, aVar);
        this.f71111v = null;
    }

    @NotNull
    public final Map<String, ArrayDeque<p0>> X() {
        return this.f71103n;
    }

    @Nullable
    public final Bundle[] Y() {
        return this.f71094e;
    }

    public final void Y0(@Nullable Bundle bundle) {
        Bundle bundle2 = this.f71093d;
        if (bundle2 != null) {
            Bundle bundleB = androidx.savedstate.f.b(bundle2);
            if (androidx.savedstate.f.c(bundleB, E)) {
                for (String str : androidx.savedstate.f.x0(bundleB, E)) {
                    q3 q3VarF = this.f71109t.f(str);
                    if (androidx.savedstate.f.c(bundleB, str)) {
                        q3VarF.m(androidx.savedstate.f.g0(bundleB, str));
                    }
                }
            }
        }
        Bundle[] bundleArr = this.f71094e;
        if (bundleArr != null) {
            for (Bundle bundle3 : bundleArr) {
                p0 p0Var = new p0(bundle3);
                y1 y1VarL = L(this, p0Var.b(), null, 2, null);
                if (y1VarL == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + y1.f71443f.d(i0(), p0Var.b()) + " cannot be found from the current destination " + c0());
                }
                n0 n0VarE = p0Var.e(i0(), y1VarL, f0(), this.f71105p);
                q3<? extends y1> q3VarF2 = this.f71109t.f(y1VarL.K());
                Map<q3<? extends y1>, w0.b> map = this.f71110u;
                w0.b bVarR = map.get(q3VarF2);
                if (bVarR == null) {
                    bVarR = this.f71090a.r(q3VarF2);
                    map.put(q3VarF2, bVarR);
                }
                this.f71095f.add(n0VarE);
                bVarR.q(n0VarE);
                e2 e2VarL = n0VarE.f().L();
                if (e2VarL != null) {
                    F0(n0VarE, S(e2VarL.D()));
                }
            }
            this.f71091b.invoke();
            this.f71094e = null;
        }
        Collection<q3<? extends y1>> collectionValues = this.f71109t.g().values();
        ArrayList<q3<? extends y1>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((q3) obj).f()) {
                arrayList.add(obj);
            }
        }
        for (q3<? extends y1> q3Var : arrayList) {
            Map<q3<? extends y1>, w0.b> map2 = this.f71110u;
            w0.b bVarR2 = map2.get(q3Var);
            if (bVarR2 == null) {
                bVarR2 = this.f71090a.r(q3Var);
                map2.put(q3Var, bVarR2);
            }
            q3Var.j(bVarR2);
        }
        if (this.f71092c == null || !this.f71095f.isEmpty()) {
            A();
            return;
        }
        if (!this.f71090a.k()) {
            e2 e2Var = this.f71092c;
            Intrinsics.checkNotNull(e2Var);
            O0(e2Var, bundle, null, null);
        }
    }

    @NotNull
    public final Map<n0, n0> Z() {
        return this.f71100k;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final z0<List<n0>> a0() {
        return this.f71097h;
    }

    public final void a1(@NotNull w0.b state, @NotNull n0 popUpTo, boolean z10, @NotNull final Function0<Unit> superCallback) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(superCallback, "superCallback");
        q3 q3VarF = this.f71109t.f(popUpTo.f().K());
        this.f71113x.put(popUpTo, Boolean.valueOf(z10));
        if (!Intrinsics.areEqual(q3VarF, state.r())) {
            w0.b bVar = this.f71110u.get(q3VarF);
            Intrinsics.checkNotNull(bVar);
            bVar.i(popUpTo, z10);
        } else {
            Function1<? super n0, Unit> function1 = this.f71112w;
            if (function1 == null) {
                h1(popUpTo, new Function0() { // from class: androidx.navigation.internal.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return x.Z0(superCallback);
                    }
                });
            } else {
                function1.invoke(popUpTo);
                superCallback.invoke();
            }
        }
    }

    @Nullable
    public final n0 b0() {
        return this.f71095f.lastOrNull();
    }

    public final boolean b1() {
        if (this.f71095f.isEmpty()) {
            return false;
        }
        y1 y1VarC0 = c0();
        Intrinsics.checkNotNull(y1VarC0);
        return c1(y1VarC0.D(), true);
    }

    @Nullable
    public final y1 c0() {
        n0 n0VarB0 = b0();
        if (n0VarB0 != null) {
            return n0VarB0.f();
        }
        return null;
    }

    public final boolean c1(int i10, boolean z10) {
        return d1(i10, z10, false);
    }

    @NotNull
    public final Map<n0, Boolean> d0() {
        return this.f71113x;
    }

    public final boolean d1(int i10, boolean z10, boolean z11) {
        return k1(i10, z10, z11) && A();
    }

    @l0
    @NotNull
    public final e2 e0() {
        e2 e2Var = this.f71092c;
        if (e2Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.checkNotNull(e2Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return e2Var;
    }

    public final <T> boolean e1(@NotNull T route, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        return l1(route, z10, z11) && A();
    }

    @NotNull
    public final androidx.lifecycle.c0.b f0() {
        return this.f71104o == null ? androidx.lifecycle.c0.b.CREATED : this.f71107r;
    }

    public final boolean f1(@NotNull String route, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        return m1(route, z10, z11) && A();
    }

    @NotNull
    public final androidx.lifecycle.n0 g0() {
        return this.f71108s;
    }

    public final <T> boolean g1(@NotNull kotlin.reflect.d<T> route, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        int iK = androidx.navigation.serialization.p.k(m0.i(route));
        if (N(this, e0(), iK, true, null, 8, null) != null) {
            return d1(iK, z10, z11);
        }
        throw new IllegalArgumentException(("Destination with route " + route.Q() + " cannot be found in navigation graph " + e0()).toString());
    }

    @Nullable
    public final o0 h0() {
        return this.f71104o;
    }

    public final void h1(@NotNull n0 popUpTo, @NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int iIndexOf = this.f71095f.indexOf(popUpTo);
        if (iIndexOf < 0) {
            b.f71026a.a(C, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != this.f71095f.size()) {
            k1(this.f71095f.get(i10).f().D(), true, false);
        }
        r1(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        this.f71091b.invoke();
        A();
    }

    @NotNull
    public final h i0() {
        return this.f71090a.N();
    }

    @NotNull
    public final w0 j0() {
        return this.f71090a;
    }

    public final void j1(@NotNull q3<? extends y1> navigator, @NotNull n0 popUpTo, boolean z10, @NotNull Function1<? super n0, Unit> handler) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f71112w = handler;
        navigator.o(popUpTo, z10);
        this.f71112w = null;
    }

    @NotNull
    public final r3 k0() {
        return this.f71109t;
    }

    public final boolean k1(int i10, boolean z10, boolean z11) {
        y1 y1VarF;
        if (this.f71095f.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.reversed(this.f71095f).iterator();
        do {
            if (!it.hasNext()) {
                y1VarF = null;
                break;
            }
            y1VarF = ((n0) it.next()).f();
            q3 q3VarF = this.f71109t.f(y1VarF.K());
            if (z10 || y1VarF.D() != i10) {
                arrayList.add(q3VarF);
            }
        } while (y1VarF.D() != i10);
        if (y1VarF != null) {
            return G(arrayList, y1VarF, z10, z11);
        }
        String strD = y1.f71443f.d(i0(), i10);
        b.f71026a.a(C, "Ignoring popBackStack to destination " + strD + " as it was not found on the current back stack");
        return false;
    }

    @NotNull
    public final Map<q3<? extends y1>, w0.b> l0() {
        return this.f71110u;
    }

    public final <T> boolean l1(@NotNull T route, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        return m1(P(route), z10, z11);
    }

    @Nullable
    public final Bundle m0() {
        return this.f71093d;
    }

    public final boolean m1(@NotNull String route, boolean z10, boolean z11) {
        n0 n0VarPrevious;
        boolean zR;
        Intrinsics.checkNotNullParameter(route, "route");
        if (this.f71095f.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque<n0> arrayDeque = this.f71095f;
        ListIterator<n0> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                n0VarPrevious = null;
                break;
            }
            n0VarPrevious = listIterator.previous();
            n0 n0Var = n0VarPrevious;
            zR = n0Var.f().R(route, n0Var.b());
            if (z10 || !zR) {
                arrayList.add(this.f71109t.f(n0Var.f().K()));
            }
        } while (!zR);
        n0 n0Var2 = n0VarPrevious;
        y1 y1VarF = n0Var2 != null ? n0Var2.f() : null;
        if (y1VarF != null) {
            return G(arrayList, y1VarF, z10, z11);
        }
        b.f71026a.a(C, "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return false;
    }

    @NotNull
    public final List<w0.c> n0() {
        return this.f71106q;
    }

    @NotNull
    public final Map<n0, androidx.navigation.internal.a> o0() {
        return this.f71101l;
    }

    @Nullable
    public final Function1<n0, Unit> p0() {
        return this.f71112w;
    }

    @Nullable
    public final n0 q0() {
        Object next;
        Iterator it = CollectionsKt.reversed(this.f71095f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = kotlin.sequences.o.e(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((n0) next).f() instanceof e2)) {
                return (n0) next;
            }
        }
        next = null;
        return (n0) next;
    }

    public final void q1(@NotNull n0 popUpTo, boolean z10, @NotNull ArrayDeque<p0> savedState) {
        c1 c1Var;
        z0<Set<n0>> z0VarD;
        Set<n0> value;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        n0 n0VarLast = this.f71095f.last();
        if (!Intrinsics.areEqual(n0VarLast, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.f() + ", which is not the top of the back stack (" + n0VarLast.f() + ')').toString());
        }
        CollectionsKt.removeLast(this.f71095f);
        w0.b bVar = this.f71110u.get(k0().f(n0VarLast.f().K()));
        boolean z11 = true;
        if ((bVar == null || (z0VarD = bVar.d()) == null || (value = z0VarD.getValue()) == null || !value.contains(n0VarLast)) && !this.f71101l.containsKey(n0VarLast)) {
            z11 = false;
        }
        androidx.lifecycle.c0.b bVarD = n0VarLast.getLifecycle().d();
        androidx.lifecycle.c0.b bVar2 = androidx.lifecycle.c0.b.CREATED;
        if (bVarD.n(bVar2)) {
            if (z10) {
                n0VarLast.v(bVar2);
                savedState.addFirst(new p0(n0VarLast));
            }
            if (z11) {
                n0VarLast.v(bVar2);
            } else {
                n0VarLast.v(androidx.lifecycle.c0.b.DESTROYED);
                Q1(n0VarLast);
            }
        }
        if (z10 || z11 || (c1Var = this.f71105p) == null) {
            return;
        }
        c1Var.U(n0VarLast.h());
    }

    public final void r(@NotNull w0.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71106q.add(listener);
        if (this.f71095f.isEmpty()) {
            return;
        }
        n0 n0VarLast = this.f71095f.last();
        listener.a(this.f71090a, n0VarLast.f(), n0VarLast.b());
    }

    @NotNull
    public final e2 r0() {
        y1 y1VarF;
        n0 n0VarLastOrNull = this.f71095f.lastOrNull();
        if (n0VarLastOrNull == null || (y1VarF = n0VarLastOrNull.f()) == null) {
            y1VarF = this.f71092c;
            Intrinsics.checkNotNull(y1VarF);
        }
        e2 e2Var = y1VarF instanceof e2 ? (e2) y1VarF : null;
        if (e2Var != null) {
            return e2Var;
        }
        e2 e2VarL = y1VarF.L();
        Intrinsics.checkNotNull(e2VarL);
        return e2VarL;
    }

    public final boolean s(int i10) {
        if (!x(i10) || !A()) {
            return false;
        }
        int i11 = 6 >> 1;
        return true;
    }

    @NotNull
    public final Function0<Unit> s0() {
        return this.f71091b;
    }

    @NotNull
    public final List<n0> s1() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f71110u.values().iterator();
        while (it.hasNext()) {
            Set<n0> value = ((w0.b) it.next()).d().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                n0 n0Var = (n0) obj;
                if (!arrayList.contains(n0Var) && !n0Var.k().n(androidx.lifecycle.c0.b.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayDeque<n0> arrayDeque = this.f71095f;
        ArrayList arrayList3 = new ArrayList();
        for (n0 n0Var2 : arrayDeque) {
            n0 n0Var3 = n0Var2;
            if (!arrayList.contains(n0Var3) && n0Var3.k().n(androidx.lifecycle.c0.b.STARTED)) {
                arrayList3.add(n0Var2);
            }
        }
        CollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((n0) obj2).f() instanceof e2)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final <T> boolean t(@NotNull T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return y(P(route)) && A();
    }

    @Nullable
    public final c1 t0() {
        return this.f71105p;
    }

    public final void t1(@NotNull n0 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f71095f.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.v(androidx.lifecycle.c0.b.STARTED);
    }

    public final boolean u(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return y(route) && A();
    }

    @NotNull
    public final m2 u0(int i10) {
        if (this.f71105p == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        }
        n0 n0VarS = S(i10);
        if (n0VarS.f() instanceof e2) {
            return n0VarS;
        }
        throw new IllegalArgumentException(("No NavGraph with ID " + i10 + " is on the NavController's back stack").toString());
    }

    public final void u1(@NotNull w0.b state, @NotNull n0 backStackEntry) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        q3 q3VarF = this.f71109t.f(backStackEntry.f().K());
        if (!Intrinsics.areEqual(q3VarF, state.r())) {
            w0.b bVar = this.f71110u.get(q3VarF);
            if (bVar != null) {
                bVar.l(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.f().K() + " should already be created").toString());
        }
        Function1<? super n0, Unit> function1 = this.f71111v;
        if (function1 != null) {
            function1.invoke(backStackEntry);
            state.q(backStackEntry);
            return;
        }
        b.f71026a.a(C, "Ignoring add of destination " + backStackEntry.f() + " outside of the call to navigate(). ");
    }

    public final <T> boolean v(@NotNull kotlin.reflect.d<T> route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return s(androidx.navigation.serialization.p.k(m0.i(route)));
    }

    @NotNull
    public final z0<List<n0>> v0() {
        return this.f71099j;
    }

    public final void v1(@NotNull w0.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71106q.remove(listener);
    }

    @NotNull
    public final k0<List<n0>> w0() {
        return this.f71096g;
    }

    public final void w1(@Nullable Bundle bundle) {
        if (bundle != null) {
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            this.f71093d = androidx.savedstate.f.c(bundleB, D) ? androidx.savedstate.f.g0(bundleB, D) : null;
            int i10 = 0;
            this.f71094e = androidx.savedstate.f.c(bundleB, F) ? (Bundle[]) androidx.savedstate.f.j0(bundleB, F).toArray(new Bundle[0]) : null;
            this.f71103n.clear();
            if (androidx.savedstate.f.c(bundleB, G) && androidx.savedstate.f.c(bundleB, H)) {
                int[] iArrH = androidx.savedstate.f.H(bundleB, G);
                List<String> listX0 = androidx.savedstate.f.x0(bundleB, H);
                int length = iArrH.length;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    this.f71102m.put(Integer.valueOf(iArrH[i10]), !Intrinsics.areEqual(listX0.get(i11), "") ? listX0.get(i11) : null);
                    i10++;
                    i11 = i12;
                }
            }
            if (androidx.savedstate.f.c(bundleB, I)) {
                for (String str : androidx.savedstate.f.x0(bundleB, I)) {
                    if (androidx.savedstate.f.c(bundleB, J + str)) {
                        List<Bundle> listJ0 = androidx.savedstate.f.j0(bundleB, J + str);
                        Map<String, ArrayDeque<p0>> map = this.f71103n;
                        ArrayDeque<p0> arrayDeque = new ArrayDeque<>(listJ0.size());
                        Iterator<Bundle> it = listJ0.iterator();
                        while (it.hasNext()) {
                            arrayDeque.add(new p0(it.next()));
                        }
                        map.put(str, arrayDeque);
                    }
                }
            }
        }
    }

    public final boolean x(int i10) {
        Iterator<T> it = this.f71110u.values().iterator();
        while (it.hasNext()) {
            ((w0.b) it.next()).n(true);
        }
        boolean zX1 = x1(i10, null, b3.a(new Function1() { // from class: androidx.navigation.internal.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x.w((a3) obj);
            }
        }), null);
        Iterator<T> it2 = this.f71110u.values().iterator();
        while (it2.hasNext()) {
            ((w0.b) it2.next()).n(false);
        }
        return zX1 && k1(i10, true, false);
    }

    @NotNull
    public final kotlinx.coroutines.flow.j0<n0> x0() {
        return this.A;
    }

    public final boolean y(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Iterator<T> it = this.f71110u.values().iterator();
        while (it.hasNext()) {
            ((w0.b) it.next()).n(true);
        }
        boolean zY1 = y1(route);
        Iterator<T> it2 = this.f71110u.values().iterator();
        while (it2.hasNext()) {
            ((w0.b) it2.next()).n(false);
        }
        return zY1 && m1(route, true, false);
    }

    @Nullable
    public final e2 y0() {
        return this.f71092c;
    }

    @NotNull
    public final n0 z(@NotNull y1 destination, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return n0.a.b(n0.f71145j, i0(), destination, bundle, f0(), this.f71105p, null, null, 96, null);
    }

    @NotNull
    public final r3 z0() {
        return this.f71109t;
    }
}
