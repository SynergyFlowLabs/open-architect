package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.android.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,1206:1\n233#1:1417\n245#1:1418\n238#1:1419\n183#2,2:1207\n2163#2,2:1420\n27#3:1209\n46#3:1210\n32#3,4:1211\n31#3,7:1221\n27#3:1234\n46#3:1235\n32#3,4:1236\n31#3,7:1246\n27#3:1260\n46#3:1261\n32#3,4:1262\n31#3,7:1272\n27#3:1285\n46#3:1286\n32#3,4:1287\n31#3,7:1297\n27#3:1306\n46#3:1307\n32#3,4:1308\n31#3,7:1318\n27#3:1327\n46#3:1328\n32#3,4:1329\n31#3,7:1339\n27#3:1348\n46#3:1349\n32#3,4:1350\n31#3,7:1360\n27#3:1369\n46#3:1370\n32#3,4:1371\n31#3,7:1381\n27#3:1393\n46#3:1394\n32#3,4:1395\n31#3,7:1405\n126#4:1215\n153#4,3:1216\n126#4:1240\n153#4,3:1241\n126#4:1266\n153#4,3:1267\n126#4:1291\n153#4,3:1292\n126#4:1312\n153#4,3:1313\n126#4:1333\n153#4,3:1334\n126#4:1354\n153#4,3:1355\n126#4:1375\n153#4,3:1376\n126#4:1399\n153#4,3:1400\n37#5,2:1219\n37#5,2:1244\n37#5,2:1270\n37#5,2:1295\n37#5,2:1316\n37#5,2:1337\n37#5,2:1358\n37#5,2:1379\n37#5,2:1403\n1#6:1228\n1#6:1230\n1#6:1253\n1#6:1255\n1#6:1279\n1#6:1304\n1#6:1325\n1#6:1346\n1#6:1367\n1#6:1388\n1#6:1412\n106#7:1229\n106#7:1254\n106#7:1280\n106#7:1282\n106#7:1283\n106#7:1284\n106#7:1305\n106#7:1326\n106#7:1347\n106#7:1368\n106#7:1389\n106#7:1391\n106#7:1392\n106#7:1413\n106#7:1415\n90#7:1416\n1872#8,3:1231\n1782#8,4:1256\n46#9:1281\n46#9:1390\n46#9:1414\n*S KotlinDebug\n*F\n+ 1 NavController.android.kt\nandroidx/navigation/NavController\n*L\n-1#1:1417\n-1#1:1418\n-1#1:1419\n71#1:1207,2\n658#1:1420,2\n359#1:1209\n359#1:1210\n359#1:1211,4\n359#1:1221,7\n384#1:1234\n384#1:1235\n384#1:1236,4\n384#1:1246,7\n524#1:1260\n524#1:1261\n524#1:1262,4\n524#1:1272,7\n563#1:1285\n563#1:1286\n563#1:1287,4\n563#1:1297,7\n609#1:1306\n609#1:1307\n609#1:1308,4\n609#1:1318,7\n617#1:1327\n617#1:1328\n617#1:1329,4\n617#1:1339,7\n860#1:1348\n860#1:1349\n860#1:1350,4\n860#1:1360,7\n865#1:1369\n865#1:1370\n865#1:1371,4\n865#1:1381,7\n1045#1:1393\n1045#1:1394\n1045#1:1395,4\n1045#1:1405,7\n359#1:1215\n359#1:1216,3\n384#1:1240\n384#1:1241,3\n524#1:1266\n524#1:1267,3\n563#1:1291\n563#1:1292,3\n609#1:1312\n609#1:1313,3\n617#1:1333\n617#1:1334,3\n860#1:1354\n860#1:1355,3\n865#1:1375\n865#1:1376,3\n1045#1:1399\n1045#1:1400,3\n359#1:1219,2\n384#1:1244,2\n524#1:1270,2\n563#1:1295,2\n609#1:1316,2\n617#1:1337,2\n860#1:1358,2\n865#1:1379,2\n1045#1:1403,2\n359#1:1228\n384#1:1253\n524#1:1279\n563#1:1304\n609#1:1325\n617#1:1346\n860#1:1367\n865#1:1388\n1045#1:1412\n359#1:1229\n384#1:1254\n524#1:1280\n527#1:1282\n544#1:1283\n560#1:1284\n563#1:1305\n609#1:1326\n617#1:1347\n860#1:1368\n865#1:1389\n867#1:1391\n956#1:1392\n1045#1:1413\n1047#1:1415\n1056#1:1416\n365#1:1231,3\n428#1:1256,4\n524#1:1281\n865#1:1390\n1045#1:1414\n*E\n"})
public class w0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final String f71386l = "android-support-nav:controller:deepLinkIds";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final String f71387m = "android-support-nav:controller:deepLinkArgs";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final String f71388n = "android-support-nav:controller:deepLinkExtras";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final String f71389o = "android-support-nav:controller:deepLinkHandled";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f71390p = "android-support-nav:controller:deepLinkIntent";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f71392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.internal.x f71393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.internal.h f71394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Activity f71395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private v2 f71396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f71397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.activity.j0 f71398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.activity.i0 f71399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f71400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f71385k = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f71391q = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        @oj.n
        @x1
        public final void a(boolean z10) {
            w0.f71391q = z10;
        }

        private a() {
        }
    }

    public class b extends v3 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final q3<? extends y1> f71402g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w0 f71403h;

        public b(@NotNull w0 w0Var, q3<? extends y1> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.f71403h = w0Var;
            this.f71402g = navigator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(b bVar, n0 n0Var) {
            super.f(n0Var);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(b bVar, n0 n0Var, boolean z10) {
            super.i(n0Var, z10);
            return Unit.f312394a;
        }

        @Override // androidx.navigation.v3
        @NotNull
        public n0 b(@NotNull y1 destination, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return this.f71403h.f71393b.z(destination, bundle);
        }

        @Override // androidx.navigation.v3
        public void f(@NotNull final n0 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f71403h.f71393b.G0(this, entry, new Function0() { // from class: androidx.navigation.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w0.b.s(this.f71436a, entry);
                }
            });
        }

        @Override // androidx.navigation.v3
        public void i(@NotNull final n0 popUpTo, final boolean z10) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            this.f71403h.f71393b.a1(this, popUpTo, z10, new Function0() { // from class: androidx.navigation.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w0.b.t(this.f71440a, popUpTo, z10);
                }
            });
        }

        @Override // androidx.navigation.v3
        public void j(@NotNull n0 popUpTo, boolean z10) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.j(popUpTo, z10);
        }

        @Override // androidx.navigation.v3
        public void k(@NotNull n0 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            super.k(entry);
            this.f71403h.f71393b.t1(entry);
        }

        @Override // androidx.navigation.v3
        public void l(@NotNull n0 backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            this.f71403h.f71393b.u1(this, backStackEntry);
        }

        public final void q(@NotNull n0 backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.l(backStackEntry);
        }

        @NotNull
        public final q3<? extends y1> r() {
            return this.f71402g;
        }
    }

    public interface c {
        void a(@NotNull w0 w0Var, @NotNull y1 y1Var, @Nullable Bundle bundle);
    }

    public static final class d extends androidx.activity.i0 {
        d() {
            super(false);
        }

        @Override // androidx.activity.i0
        public void handleOnBackPressed() {
            w0.this.A0();
        }
    }

    public w0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f71392a = context;
        this.f71393b = new androidx.navigation.internal.x(this, new Function0() { // from class: androidx.navigation.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w0.Z(this.f71235a);
            }
        });
        this.f71394c = new androidx.navigation.internal.h(context);
        for (Object obj : kotlin.sequences.o.l(context, new Function1() { // from class: androidx.navigation.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return w0.i((Context) obj2);
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.f71395d = (Activity) obj;
                this.f71399h = new d();
                this.f71400i = true;
                this.f71393b.z0().b(new o2(this.f71393b.z0()));
                this.f71393b.z0().b(new g(this.f71392a));
                this.f71401j = kotlin.g0.c(new Function0() { // from class: androidx.navigation.u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w0.a0(this.f71312a);
                    }
                });
            }
        }
        obj = null;
        this.f71395d = (Activity) obj;
        this.f71399h = new d();
        this.f71400i = true;
        this.f71393b.z0().b(new o2(this.f71393b.z0()));
        this.f71393b.z0().b(new g(this.f71392a));
        this.f71401j = kotlin.g0.c(new Function0() { // from class: androidx.navigation.u0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w0.a0(this.f71312a);
            }
        });
    }

    private final int L() {
        ArrayDeque<n0> arrayDequeR = this.f71393b.R();
        int i10 = 0;
        if (arrayDequeR != null && arrayDequeR.isEmpty()) {
            return 0;
        }
        Iterator<n0> it = arrayDequeR.iterator();
        while (it.hasNext()) {
            if (!(it.next().f() instanceof e2) && (i10 = i10 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    public static /* synthetic */ boolean L0(w0 w0Var, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return w0Var.E0(obj, z10, z11);
    }

    public static /* synthetic */ boolean M0(w0 w0Var, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return w0Var.G0(str, z10, z11);
    }

    public static /* synthetic */ boolean N0(w0 w0Var, kotlin.reflect.d dVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return w0Var.I0(dVar, z10, z11);
    }

    public static /* synthetic */ boolean O0(w0 w0Var, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return w0Var.I0(kotlin.jvm.internal.j1.d(Object.class), z10, z11);
    }

    @androidx.annotation.l0
    private final boolean P0(@androidx.annotation.d0 int i10, boolean z10, boolean z11) {
        return this.f71393b.k1(i10, z10, z11);
    }

    static /* synthetic */ boolean Q0(w0 w0Var, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return w0Var.P0(i10, z10, z11);
    }

    @androidx.annotation.l0
    private final boolean V(int[] iArr, Bundle[] bundleArr, boolean z10) {
        y1 y1VarF0;
        e2 e2Var;
        int i10 = 0;
        if (z10) {
            if (!this.f71393b.R().isEmpty()) {
                e2 e2VarY0 = this.f71393b.y0();
                Intrinsics.checkNotNull(e2VarY0);
                Q0(this, e2VarY0.D(), true, false, 4, null);
            }
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                int i12 = i10 + 1;
                Bundle bundle = bundleArr[i10];
                final y1 y1VarW = w(this, i11, null, 2, null);
                if (y1VarW == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + y1.f71443f.d(this.f71394c, i11) + " cannot be found from the current destination " + J());
                }
                l0(y1VarW, bundle, b3.a(new Function1() { // from class: androidx.navigation.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w0.W(y1VarW, this, (a3) obj);
                    }
                }), null);
                i10 = i12;
            }
            this.f71397f = true;
            return true;
        }
        e2 e2VarY1 = this.f71393b.y0();
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            Bundle bundle2 = bundleArr[i13];
            if (i13 == 0) {
                y1VarF0 = this.f71393b.y0();
            } else {
                Intrinsics.checkNotNull(e2VarY1);
                y1VarF0 = e2VarY1.F0(i14);
            }
            if (y1VarF0 == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + y1.f71443f.d(this.f71394c, i14) + " cannot be found in graph " + e2VarY1);
            }
            if (i13 == iArr.length - 1) {
                w2.a aVar = new w2.a();
                e2 e2VarY2 = this.f71393b.y0();
                Intrinsics.checkNotNull(e2VarY2);
                l0(y1VarF0, bundle2, w2.a.q(aVar, e2VarY2.D(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (y1VarF0 instanceof e2) {
                while (true) {
                    e2Var = (e2) y1VarF0;
                    Intrinsics.checkNotNull(e2Var);
                    if (!(e2Var.F0(e2Var.Y0()) instanceof e2)) {
                        break;
                    }
                    y1VarF0 = e2Var.F0(e2Var.Y0());
                }
                e2VarY1 = e2Var;
            }
        }
        this.f71397f = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(y1 y1Var, w0 w0Var, a3 navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.d(new Function1() { // from class: androidx.navigation.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.X((m) obj);
            }
        });
        if (y1Var instanceof e2) {
            for (y1 y1Var2 : y1.f71443f.e(y1Var)) {
                y1 y1VarJ = w0Var.J();
                if (Intrinsics.areEqual(y1Var2, y1VarJ != null ? y1VarJ.L() : null)) {
                }
            }
            if (f71391q) {
                navOptions.n(e2.f70908i.d(w0Var.M()).D(), new Function1() { // from class: androidx.navigation.r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w0.Y((x3) obj);
                    }
                });
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(m anim) {
        Intrinsics.checkNotNullParameter(anim, "$this$anim");
        anim.e(0);
        anim.f(0);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(x3 popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.d(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(w0 w0Var) {
        w0Var.f1();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v2 a0(w0 w0Var) {
        v2 v2Var = w0Var.f71396e;
        return v2Var == null ? new v2(w0Var.f71392a, w0Var.f71393b.z0()) : v2Var;
    }

    private final boolean d1() {
        Pair[] pairArr;
        int i10 = 0;
        if (!this.f71397f) {
            return false;
        }
        Activity activity = this.f71395d;
        Intrinsics.checkNotNull(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        int[] intArray = extras.getIntArray(f71386l);
        Intrinsics.checkNotNull(intArray);
        List<Integer> mutableList = ArraysKt.toMutableList(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(f71387m);
        if (mutableList.size() < 2) {
            return false;
        }
        int iIntValue = ((Number) CollectionsKt.removeLast(mutableList)).intValue();
        if (parcelableArrayList != null) {
        }
        y1 y1VarY = y(this, M(), iIntValue, false, null, 4, null);
        if (y1VarY instanceof e2) {
            iIntValue = e2.f70908i.d((e2) y1VarY).D();
        }
        y1 y1VarJ = J();
        if (y1VarJ == null || iIntValue != y1VarJ.D()) {
            return false;
        }
        r1 r1VarQ = q();
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
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleC = androidx.savedstate.n.c(bundleB);
        Intrinsics.checkNotNull(intent);
        androidx.savedstate.n.A(bundleC, f71390p, intent);
        Bundle bundle = extras.getBundle(f71388n);
        if (bundle != null) {
            androidx.savedstate.n.g(bundleC, bundle);
        }
        r1VarQ.p(bundleB);
        for (Object obj : mutableList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            r1VarQ.f(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        r1VarQ.l().w();
        Activity activity2 = this.f71395d;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    private final boolean e1() {
        Pair[] pairArr;
        Bundle bundleL;
        y1 y1VarJ = J();
        Intrinsics.checkNotNull(y1VarJ);
        int iD = y1VarJ.D();
        for (e2 e2VarL = y1VarJ.L(); e2VarL != null; e2VarL = e2VarL.L()) {
            if (e2VarL.Y0() != iD) {
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
                Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Bundle bundleC = androidx.savedstate.n.c(bundleB);
                Activity activity = this.f71395d;
                if (activity != null) {
                    Intrinsics.checkNotNull(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f71395d;
                        Intrinsics.checkNotNull(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f71395d;
                            Intrinsics.checkNotNull(activity3);
                            Intent intent = activity3.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                            androidx.savedstate.n.A(bundleC, f71390p, intent);
                            e2 e2VarR0 = this.f71393b.r0();
                            Activity activity4 = this.f71395d;
                            Intrinsics.checkNotNull(activity4);
                            Intent intent2 = activity4.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                            y1.c cVarD1 = e2VarR0.d1(z0.a(intent2), true, true, e2VarR0);
                            if ((cVarD1 != null ? cVarD1.l() : null) != null && (bundleL = cVarD1.k().l(cVarD1.l())) != null) {
                                androidx.savedstate.n.g(bundleC, bundleL);
                            }
                        }
                    }
                }
                r1.w(new r1(this), e2VarL.D(), null, 2, null).p(bundleB).l().w();
                Activity activity5 = this.f71395d;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            iD = e2VarL.D();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    private final void f1() {
        boolean z10;
        androidx.activity.i0 i0Var = this.f71399h;
        if (this.f71400i) {
            z10 = L() > 1;
        }
        i0Var.setEnabled(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context i(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }

    @androidx.annotation.l0
    private final void l0(y1 y1Var, Bundle bundle, w2 w2Var, q3.a aVar) {
        this.f71393b.O0(y1Var, bundle, w2Var, aVar);
    }

    @oj.n
    @x1
    public static final void s(boolean z10) {
        f71385k.a(z10);
    }

    public static /* synthetic */ y1 w(w0 w0Var, int i10, y1 y1Var, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i11 & 2) != 0) {
            y1Var = null;
        }
        return w0Var.u(i10, y1Var);
    }

    public static /* synthetic */ void x0(w0 w0Var, Object obj, w2 w2Var, q3.a aVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            w2Var = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        w0Var.r0(obj, w2Var, aVar);
    }

    public static /* synthetic */ y1 y(w0 w0Var, y1 y1Var, int i10, boolean z10, y1 y1Var2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i11 & 4) != 0) {
            y1Var2 = null;
        }
        return w0Var.x(y1Var, i10, z10, y1Var2);
    }

    public static /* synthetic */ void y0(w0 w0Var, String str, w2 w2Var, q3.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            w2Var = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        w0Var.v0(str, w2Var, aVar);
    }

    private final String z(int[] iArr) {
        return this.f71393b.O(iArr);
    }

    public final /* synthetic */ <T> n0 A() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return E(kotlin.jvm.internal.j1.d(Object.class));
    }

    @androidx.annotation.l0
    public boolean A0() {
        return this.f71393b.b1();
    }

    @NotNull
    public n0 B(@androidx.annotation.d0 int i10) {
        return this.f71393b.S(i10);
    }

    @androidx.annotation.l0
    public boolean B0(@androidx.annotation.d0 int i10, boolean z10) {
        return this.f71393b.c1(i10, z10);
    }

    @NotNull
    public final <T> n0 C(@NotNull T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.T(route);
    }

    @androidx.annotation.l0
    public boolean C0(@androidx.annotation.d0 int i10, boolean z10, boolean z11) {
        return this.f71393b.d1(i10, z10, z11);
    }

    @NotNull
    public final n0 D(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.U(route);
    }

    @oj.j
    @androidx.annotation.l0
    public final <T> boolean D0(@NotNull T route, boolean z10) {
        Intrinsics.checkNotNullParameter(route, "route");
        return L0(this, route, z10, false, 4, null);
    }

    @NotNull
    public final <T> n0 E(@NotNull kotlin.reflect.d<T> route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.V(route);
    }

    @oj.j
    @androidx.annotation.l0
    public final <T> boolean E0(@NotNull T route, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.e1(route, z10, z11);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final Context F() {
        return this.f71392a;
    }

    @oj.j
    @androidx.annotation.l0
    public final boolean F0(@NotNull String route, boolean z10) {
        Intrinsics.checkNotNullParameter(route, "route");
        return M0(this, route, z10, false, 4, null);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final kotlinx.coroutines.flow.z0<List<n0>> G() {
        return this.f71393b.a0();
    }

    @oj.j
    @androidx.annotation.l0
    public final boolean G0(@NotNull String route, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.f1(route, z10, z11);
    }

    @Nullable
    public n0 H() {
        return this.f71393b.b0();
    }

    @oj.j
    @androidx.annotation.l0
    public final <T> boolean H0(@NotNull kotlin.reflect.d<T> route, boolean z10) {
        Intrinsics.checkNotNullParameter(route, "route");
        return N0(this, route, z10, false, 4, null);
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<n0> I() {
        return kotlinx.coroutines.flow.k.m(this.f71393b.x0());
    }

    @oj.j
    @androidx.annotation.l0
    public final <T> boolean I0(@NotNull kotlin.reflect.d<T> route, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.g1(route, z10, z11);
    }

    @Nullable
    public y1 J() {
        return this.f71393b.c0();
    }

    @oj.j
    @androidx.annotation.l0
    public final /* synthetic */ <T> boolean J0(boolean z10) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return I0(kotlin.jvm.internal.j1.d(Object.class), z10, false);
    }

    public final boolean K() {
        return this.f71397f;
    }

    @oj.j
    @androidx.annotation.l0
    public final /* synthetic */ <T> boolean K0(boolean z10, boolean z11) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return I0(kotlin.jvm.internal.j1.d(Object.class), z10, z11);
    }

    @androidx.annotation.l0
    @NotNull
    public e2 M() {
        return this.f71393b.e0();
    }

    @NotNull
    public final androidx.navigation.internal.h N() {
        return this.f71394c;
    }

    @NotNull
    public v2 O() {
        return (v2) this.f71401j.getValue();
    }

    @NotNull
    public r3 P() {
        return this.f71393b.k0();
    }

    @Nullable
    public n0 Q() {
        return this.f71393b.q0();
    }

    @NotNull
    public androidx.lifecycle.m2 R(@androidx.annotation.d0 int i10) {
        return this.f71393b.u0(i10);
    }

    public void R0(@NotNull c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71393b.v1(listener);
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<List<n0>> S() {
        return this.f71393b.v0();
    }

    @androidx.annotation.i
    public void S0(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f71392a.getClassLoader());
        }
        this.f71393b.w1(bundle);
        if (bundle != null) {
            Boolean boolN = androidx.savedstate.f.n(androidx.savedstate.f.b(bundle), f71389o);
            this.f71397f = boolN != null ? boolN.booleanValue() : false;
        }
    }

    @androidx.annotation.l0
    public boolean T(@Nullable Intent intent) {
        int[] intArray;
        Pair[] pairArr;
        e2 e2VarR0;
        y1.c cVarD1;
        Pair[] pairArr2;
        Bundle bundle;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray(f71386l);
            } catch (Exception unused) {
                intent.toString();
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList(f71387m) : null;
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
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        androidx.savedstate.n.c(bundleB);
        Bundle bundle2 = extras != null ? extras.getBundle(f71388n) : null;
        if (bundle2 != null) {
            androidx.savedstate.n.g(androidx.savedstate.n.c(bundleB), bundle2);
        }
        if ((intArray == null || intArray.length == 0) && (cVarD1 = (e2VarR0 = this.f71393b.r0()).d1(z0.a(intent), true, true, e2VarR0)) != null) {
            y1 y1VarK = cVarD1.k();
            int[] iArrP = y1.p(y1VarK, null, 1, null);
            Bundle bundleL = y1VarK.l(cVarD1.l());
            if (bundleL != null) {
                androidx.savedstate.n.g(androidx.savedstate.n.c(bundleB), bundleL);
            }
            intArray = iArrP;
        } else {
            arrayList = parcelableArrayList;
        }
        if (intArray != null && intArray.length != 0) {
            String strZ = z(intArray);
            if (strZ != null) {
                androidx.navigation.internal.b.f71026a.a(androidx.navigation.internal.x.C, "Could not find destination " + strZ + " in the navigation graph, ignoring the deep link from " + intent);
                return false;
            }
            androidx.savedstate.n.A(androidx.savedstate.n.c(bundleB), f71390p, intent);
            int length = intArray.length;
            Bundle[] bundleArr = new Bundle[length];
            for (int i10 = 0; i10 < length; i10++) {
                Map mapEmptyMap2 = MapsKt.emptyMap();
                if (mapEmptyMap2.isEmpty()) {
                    pairArr2 = new Pair[0];
                } else {
                    ArrayList arrayList3 = new ArrayList(mapEmptyMap2.size());
                    for (Map.Entry entry2 : mapEmptyMap2.entrySet()) {
                        arrayList3.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                    }
                    pairArr2 = (Pair[]) arrayList3.toArray(new Pair[0]);
                }
                Bundle bundleB2 = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
                Bundle bundleC = androidx.savedstate.n.c(bundleB2);
                androidx.savedstate.n.g(bundleC, bundleB);
                if (arrayList != null && (bundle = (Bundle) arrayList.get(i10)) != null) {
                    androidx.savedstate.n.g(bundleC, bundle);
                }
                bundleArr[i10] = bundleB2;
            }
            int flags = intent.getFlags();
            int i11 = 268435456 & flags;
            if (i11 == 0 || (flags & 32768) != 0) {
                return V(intArray, bundleArr, i11 != 0);
            }
            intent.addFlags(32768);
            androidx.core.app.p0 p0VarD = androidx.core.app.p0.m(this.f71392a).d(intent);
            Intrinsics.checkNotNullExpressionValue(p0VarD, "addNextIntentWithParentStack(...)");
            p0VarD.w();
            Activity activity = this.f71395d;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        return false;
    }

    @androidx.annotation.i
    @Nullable
    public Bundle T0() {
        Pair[] pairArr;
        Bundle bundleB1 = this.f71393b.B1();
        if (this.f71397f) {
            if (bundleB1 == null) {
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
                bundleB1 = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                androidx.savedstate.n.c(bundleB1);
            }
            androidx.savedstate.n.i(androidx.savedstate.n.c(bundleB1), f71389o, this.f71397f);
        }
        return bundleB1;
    }

    @androidx.annotation.l0
    public final boolean U(@NotNull w1 request) {
        Pair[] pairArr;
        Pair[] pairArr2;
        Intrinsics.checkNotNullParameter(request, "request");
        e2 e2VarR0 = this.f71393b.r0();
        y1.c cVarD1 = e2VarR0.d1(request, true, true, e2VarR0);
        if (cVarD1 == null) {
            return false;
        }
        y1 y1VarK = cVarD1.k();
        int[] iArrP = y1.p(y1VarK, null, 1, null);
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
        Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleC = androidx.savedstate.n.c(bundleB);
        Bundle bundleL = y1VarK.l(cVarD1.l());
        if (bundleL != null) {
            androidx.savedstate.n.g(bundleC, bundleL);
        }
        int length = iArrP.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i10 = 0; i10 < length; i10++) {
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (mapEmptyMap2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapEmptyMap2.size());
                for (Map.Entry entry2 : mapEmptyMap2.entrySet()) {
                    arrayList2.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            Bundle bundleB2 = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            androidx.savedstate.n.g(androidx.savedstate.n.c(bundleB2), bundleB);
            bundleArr[i10] = bundleB2;
        }
        return V(iArrP, bundleArr, true);
    }

    public final void U0(boolean z10) {
        this.f71397f = z10;
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void V0(@androidx.annotation.n0 int i10) {
        this.f71393b.F1(O().b(i10), null);
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void W0(@androidx.annotation.n0 int i10, @Nullable Bundle bundle) {
        this.f71393b.F1(O().b(i10), bundle);
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void X0(@NotNull e2 graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.f71393b.E1(graph);
    }

    @androidx.annotation.i
    @androidx.annotation.l0
    public void Y0(@NotNull e2 graph, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.f71393b.F1(graph, bundle);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void Z0(@NotNull androidx.lifecycle.o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f71393b.H1(owner);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void a1(@NotNull r3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f71393b.I1(value);
    }

    @androidx.annotation.l0
    public void b0(@androidx.annotation.d0 int i10) {
        c0(i10, null);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void b1(@NotNull androidx.activity.j0 dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        if (Intrinsics.areEqual(dispatcher, this.f71398g)) {
            return;
        }
        androidx.lifecycle.o0 o0VarH0 = this.f71393b.h0();
        if (o0VarH0 == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.f71399h.remove();
        this.f71398g = dispatcher;
        dispatcher.i(o0VarH0, this.f71399h);
        androidx.lifecycle.c0 lifecycle = o0VarH0.getLifecycle();
        lifecycle.g(this.f71393b.g0());
        lifecycle.c(this.f71393b.g0());
    }

    @androidx.annotation.l0
    public void c0(@androidx.annotation.d0 int i10, @Nullable Bundle bundle) {
        d0(i10, bundle, null);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void c1(@NotNull androidx.lifecycle.l2 viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        this.f71393b.N1(viewModelStore);
    }

    @androidx.annotation.l0
    public void d0(@androidx.annotation.d0 int i10, @Nullable Bundle bundle, @Nullable w2 w2Var) {
        e0(i10, bundle, w2Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7 A[LOOP:0: B:31:0x00d1->B:33:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x017e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0186  */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0193, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x01b3, please report this as an issue */
    @androidx.annotation.l0
    public void e0(@androidx.annotation.d0 int i10, @Nullable Bundle bundle, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        int iB;
        Bundle bundleB;
        y1 y1VarW;
        y1.b bVar;
        String strD;
        Map mapEmptyMap;
        ArrayList arrayList;
        Pair[] pairArr;
        Pair[] pairArr2;
        y1 y1VarY0 = this.f71393b.R().isEmpty() ? this.f71393b.y0() : this.f71393b.R().last().f();
        if (y1VarY0 == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        e0 e0VarT = y1VarY0.t(i10);
        if (e0VarT != null) {
            if (w2Var == null) {
                w2Var = e0VarT.c();
            }
            iB = e0VarT.b();
            Bundle bundleA = e0VarT.a();
            if (bundleA != null) {
                Map mapEmptyMap2 = MapsKt.emptyMap();
                if (mapEmptyMap2.isEmpty()) {
                    pairArr2 = new Pair[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(mapEmptyMap2.size());
                    for (Map.Entry entry : mapEmptyMap2.entrySet()) {
                        arrayList2.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
                }
                bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
                androidx.savedstate.n.g(androidx.savedstate.n.c(bundleB), bundleA);
            }
            if (bundle != null) {
                if (bundleB == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                    if (mapEmptyMap.isEmpty()) {
                        pairArr = new Pair[0];
                    } else {
                        arrayList = new ArrayList(mapEmptyMap.size());
                        for (Map.Entry entry2 : mapEmptyMap.entrySet()) {
                            arrayList.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                        }
                        pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    }
                    bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    androidx.savedstate.n.c(bundleB);
                }
                androidx.savedstate.n.g(androidx.savedstate.n.c(bundleB), bundle);
            }
            if (iB != 0 && w2Var != null && (w2Var.f() != -1 || w2Var.g() != null || w2Var.h() != null)) {
                if (w2Var.g() != null) {
                    String strG = w2Var.g();
                    Intrinsics.checkNotNull(strG);
                    M0(this, strG, w2Var.j(), false, 4, null);
                    return;
                } else if (w2Var.h() != null) {
                    kotlin.reflect.d<?> dVarH = w2Var.h();
                    Intrinsics.checkNotNull(dVarH);
                    B0(androidx.navigation.serialization.p.k(kotlinx.serialization.m0.i(dVarH)), w2Var.j());
                    return;
                } else {
                    if (w2Var.f() != -1) {
                        B0(w2Var.f(), w2Var.j());
                        return;
                    }
                    return;
                }
            }
            if (iB != 0) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
            y1VarW = w(this, iB, null, 2, null);
            if (y1VarW == null) {
                l0(y1VarW, bundleB, w2Var, aVar);
                return;
            }
            bVar = y1.f71443f;
            strD = bVar.d(this.f71394c, iB);
            if (e0VarT == null) {
                throw new IllegalArgumentException("Navigation action/destination " + strD + " cannot be found from the current destination " + y1VarY0);
            }
            throw new IllegalArgumentException(("Navigation destination " + strD + " referenced from action " + bVar.d(this.f71394c, i10) + " cannot be found from the current destination " + y1VarY0).toString());
        }
        iB = i10;
        bundleB = null;
        if (bundle != null) {
            if (bundleB == null) {
                mapEmptyMap = MapsKt.emptyMap();
                if (mapEmptyMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    arrayList = new ArrayList(mapEmptyMap.size());
                    while (r5.hasNext()) {
                        arrayList.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                androidx.savedstate.n.c(bundleB);
            }
            androidx.savedstate.n.g(androidx.savedstate.n.c(bundleB), bundle);
        }
        if (iB != 0) {
        }
        if (iB != 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        y1VarW = w(this, iB, null, 2, null);
        if (y1VarW == null) {
            l0(y1VarW, bundleB, w2Var, aVar);
            return;
        }
        bVar = y1.f71443f;
        strD = bVar.d(this.f71394c, iB);
        if (e0VarT == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strD + " cannot be found from the current destination " + y1VarY0);
        }
        throw new IllegalArgumentException(("Navigation destination " + strD + " referenced from action " + bVar.d(this.f71394c, i10) + " cannot be found from the current destination " + y1VarY0).toString());
    }

    @androidx.annotation.l0
    public void f0(@NotNull Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f71393b.L0(new w1(deepLink, null, null));
    }

    @androidx.annotation.l0
    public void g0(@NotNull Uri deepLink, @Nullable w2 w2Var) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f71393b.M0(new w1(deepLink, null, null), w2Var);
    }

    public final void g1(@NotNull w1 request, @NotNull Bundle args) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(args, "args");
        Intent intent = new Intent();
        intent.setDataAndType(request.c(), request.b());
        intent.setAction(request.a());
        androidx.savedstate.n.A(androidx.savedstate.n.c(args), f71390p, intent);
    }

    @androidx.annotation.l0
    public void h0(@NotNull Uri deepLink, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f71393b.N0(new w1(deepLink, null, null), w2Var, aVar);
    }

    @androidx.annotation.l0
    public void i0(@NotNull w1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f71393b.L0(request);
    }

    public void j(@NotNull c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71393b.r(listener);
    }

    @androidx.annotation.l0
    public void j0(@NotNull w1 request, @Nullable w2 w2Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f71393b.M0(request, w2Var);
    }

    public final boolean k() {
        Activity activity;
        if (this.f71397f || (activity = this.f71395d) == null) {
            return false;
        }
        Intrinsics.checkNotNull(activity);
        return T(activity.getIntent());
    }

    @androidx.annotation.l0
    public void k0(@NotNull w1 request, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f71393b.N0(request, w2Var, aVar);
    }

    @androidx.annotation.l0
    public final /* synthetic */ <T> boolean l() {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return p(kotlin.jvm.internal.j1.d(Object.class));
    }

    @androidx.annotation.l0
    public final boolean m(@androidx.annotation.d0 int i10) {
        return this.f71393b.s(i10);
    }

    @androidx.annotation.l0
    public void m0(@NotNull c2 directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        d0(directions.e(), directions.d(), null);
    }

    @androidx.annotation.l0
    public final <T> boolean n(@NotNull T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.t(route);
    }

    @androidx.annotation.l0
    public void n0(@NotNull c2 directions, @Nullable w2 w2Var) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        d0(directions.e(), directions.d(), w2Var);
    }

    @androidx.annotation.l0
    public final boolean o(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.u(route);
    }

    @androidx.annotation.l0
    public void o0(@NotNull c2 directions, @NotNull q3.a navigatorExtras) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        Intrinsics.checkNotNullParameter(navigatorExtras, "navigatorExtras");
        e0(directions.e(), directions.d(), null, navigatorExtras);
    }

    @androidx.annotation.l0
    public final <T> boolean p(@NotNull kotlin.reflect.d<T> route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.v(route);
    }

    @oj.j
    @androidx.annotation.l0
    public final <T> void p0(@NotNull T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        x0(this, route, null, null, 6, null);
    }

    @NotNull
    public r1 q() {
        return new r1(this);
    }

    @oj.j
    @androidx.annotation.l0
    public final <T> void q0(@NotNull T route, @Nullable w2 w2Var) {
        Intrinsics.checkNotNullParameter(route, "route");
        x0(this, route, w2Var, null, 4, null);
    }

    @NotNull
    public final b r(@NotNull q3<? extends y1> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return new b(this, navigator);
    }

    @oj.j
    @androidx.annotation.l0
    public final <T> void r0(@NotNull T route, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f71393b.P0(route, w2Var, aVar);
    }

    @androidx.annotation.l0
    public final <T> void s0(@NotNull T route, @NotNull Function1<? super a3, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f71393b.Q0(route, builder);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void t(boolean z10) {
        this.f71400i = z10;
        f1();
    }

    @oj.j
    @androidx.annotation.l0
    public final void t0(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        y0(this, route, null, null, 6, null);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1 u(@androidx.annotation.d0 int i10, @Nullable y1 y1Var) {
        return this.f71393b.J(i10, y1Var);
    }

    @oj.j
    @androidx.annotation.l0
    public final void u0(@NotNull String route, @Nullable w2 w2Var) {
        Intrinsics.checkNotNullParameter(route, "route");
        y0(this, route, w2Var, null, 4, null);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1 v(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71393b.K(route);
    }

    @oj.j
    @androidx.annotation.l0
    public final void v0(@NotNull String route, @Nullable w2 w2Var, @Nullable q3.a aVar) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f71393b.R0(route, w2Var, aVar);
    }

    @androidx.annotation.l0
    public final void w0(@NotNull String route, @NotNull Function1<? super a3, Unit> builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f71393b.S0(route, builder);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1 x(@NotNull y1 y1Var, @androidx.annotation.d0 int i10, boolean z10, @Nullable y1 y1Var2) {
        Intrinsics.checkNotNullParameter(y1Var, "<this>");
        return this.f71393b.M(y1Var, i10, z10, y1Var2);
    }

    @androidx.annotation.l0
    public boolean z0() {
        Intent intent;
        if (L() != 1) {
            return A0();
        }
        Activity activity = this.f71395d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray(f71386l) : null) != null ? d1() : e1();
    }
}
