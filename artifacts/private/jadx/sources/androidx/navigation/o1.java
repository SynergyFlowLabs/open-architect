package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import io.sentry.n8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 8 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,835:1\n1368#2:836\n1454#2,5:837\n1567#2:886\n1598#2,3:887\n1601#2:891\n1567#2:892\n1598#2,4:893\n1863#2,2:921\n1863#2:923\n1567#2:925\n1598#2,3:926\n1601#2:930\n1864#2:931\n27#3:842\n46#3:843\n32#3,4:844\n31#3,7:854\n27#3:864\n46#3:865\n32#3,4:866\n31#3,7:876\n27#3:899\n46#3:900\n32#3,4:901\n31#3,7:911\n126#4:848\n153#4,3:849\n126#4:870\n153#4,3:871\n216#4,2:897\n126#4:905\n153#4,3:906\n37#5,2:852\n37#5,2:874\n37#5,2:909\n1#6:861\n1#6:883\n1#6:890\n1#6:918\n1#6:924\n106#7:862\n106#7:884\n106#7:919\n90#7:929\n106#7:932\n106#7:933\n90#7:934\n90#7:935\n46#8:863\n46#8:885\n46#8:920\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n84#1:836\n84#1:837,5\n229#1:886\n229#1:887,3\n229#1:891\n246#1:892\n246#1:893,4\n307#1:921,2\n316#1:923\n325#1:925\n325#1:926,3\n325#1:930\n316#1:931\n186#1:842\n186#1:843\n186#1:844,4\n186#1:854,7\n210#1:864\n210#1:865\n210#1:866,4\n210#1:876,7\n305#1:899\n305#1:900\n305#1:901,4\n305#1:911,7\n186#1:848\n186#1:849,3\n210#1:870\n210#1:871,3\n268#1:897,2\n305#1:905\n305#1:906,3\n186#1:852,2\n210#1:874,2\n305#1:909,2\n186#1:861\n210#1:883\n305#1:918\n186#1:862\n210#1:884\n305#1:919\n336#1:929\n352#1:932\n381#1:933\n398#1:934\n196#1:935\n186#1:863\n210#1:885\n305#1:920\n*E\n"})
public final class o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final b f71158q = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final Regex f71159r = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final Regex f71160s = new Regex("\\{(.+?)\\}");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final Regex f71161t = new Regex("http[s]?://");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final Regex f71162u = new Regex(n8.DEFAULT_PROPAGATION_TARGETS);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final Regex f71163v = new Regex("([^/]*?|)");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final Regex f71164w = new Regex("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final String f71165x = "([\\s\\S]+?)?";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f71166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f71167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f71168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<String> f71169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f71170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f71174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private String f71179n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f71180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f71181p;

    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final C0629a f71182d = new C0629a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f71183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f71184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f71185c;

        /* JADX INFO: renamed from: androidx.navigation.o1$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
        public static final class C0629a {
            public /* synthetic */ C0629a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ a e(C0629a c0629a, String basePath, Map typeMap, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    typeMap = MapsKt.emptyMap();
                }
                Intrinsics.checkNotNullParameter(basePath, "basePath");
                Intrinsics.checkNotNullParameter(typeMap, "typeMap");
                a aVar = new a();
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                aVar.j(kotlin.jvm.internal.j1.d(Object.class), basePath, typeMap);
                return aVar;
            }

            @oj.n
            @NotNull
            public final a a(@NotNull String action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                a aVar = new a();
                aVar.e(action);
                return aVar;
            }

            @oj.n
            @NotNull
            public final a b(@NotNull String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                a aVar = new a();
                aVar.f(mimeType);
                return aVar;
            }

            @oj.n
            @NotNull
            public final a c(@NotNull String uriPattern) {
                Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
                a aVar = new a();
                aVar.g(uriPattern);
                return aVar;
            }

            @oj.n
            public final /* synthetic */ <T> a d(String basePath, Map<kotlin.reflect.s, d3<?>> typeMap) {
                Intrinsics.checkNotNullParameter(basePath, "basePath");
                Intrinsics.checkNotNullParameter(typeMap, "typeMap");
                a aVar = new a();
                Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
                aVar.j(kotlin.jvm.internal.j1.d(Object.class), basePath, typeMap);
                return aVar;
            }

            private C0629a() {
            }
        }

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public a() {
        }

        @oj.n
        @NotNull
        public static final a b(@NotNull String str) {
            return f71182d.a(str);
        }

        @oj.n
        @NotNull
        public static final a c(@NotNull String str) {
            return f71182d.b(str);
        }

        @oj.n
        @NotNull
        public static final a d(@NotNull String str) {
            return f71182d.c(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a k(a aVar, String basePath, Map typeMap, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                typeMap = MapsKt.emptyMap();
            }
            Intrinsics.checkNotNullParameter(basePath, "basePath");
            Intrinsics.checkNotNullParameter(typeMap, "typeMap");
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            return aVar.j(kotlin.jvm.internal.j1.d(Object.class), basePath, typeMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a l(a aVar, kotlin.reflect.d dVar, String str, Map map, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return aVar.j(dVar, str, map);
        }

        @NotNull
        public final o1 a() {
            return new o1(this.f71183a, this.f71184b, this.f71185c);
        }

        @NotNull
        public final a e(@NotNull String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f71184b = action;
            return this;
        }

        @NotNull
        public final a f(@NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.f71185c = mimeType;
            return this;
        }

        @NotNull
        public final a g(@NotNull String uriPattern) {
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            this.f71183a = uriPattern;
            return this;
        }

        public final /* synthetic */ <T> a h(String basePath, Map<kotlin.reflect.s, d3<?>> typeMap) {
            Intrinsics.checkNotNullParameter(basePath, "basePath");
            Intrinsics.checkNotNullParameter(typeMap, "typeMap");
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            return j(kotlin.jvm.internal.j1.d(Object.class), basePath, typeMap);
        }

        @oj.j
        @NotNull
        public final <T> a i(@NotNull kotlin.reflect.d<T> route, @NotNull String basePath) {
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(basePath, "basePath");
            return l(this, route, basePath, null, 4, null);
        }

        @oj.j
        @NotNull
        public final <T> a j(@NotNull kotlin.reflect.d<T> route, @NotNull String basePath, @NotNull Map<kotlin.reflect.s, d3<?>> typeMap) {
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(basePath, "basePath");
            Intrinsics.checkNotNullParameter(typeMap, "typeMap");
            this.f71183a = androidx.navigation.serialization.p.p(kotlinx.serialization.m0.i(route), typeMap, basePath);
            return this;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,835:1\n739#2,9:836\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n448#1:836,9\n*E\n"})
    private static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f71186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private String f71187b;

        public c(@NotNull String mimeType) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> listO = new Regex("/").o(mimeType, 0);
            if (listO.isEmpty()) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                ListIterator<String> listIterator = listO.listIterator(listO.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listO, listIterator.nextIndex() + 1);
                    }
                }
                listEmptyList = CollectionsKt.emptyList();
            }
            this.f71186a = (String) listEmptyList.get(0);
            this.f71187b = (String) listEmptyList.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i10 = Intrinsics.areEqual(this.f71186a, other.f71186a) ? 2 : 0;
            return Intrinsics.areEqual(this.f71187b, other.f71187b) ? i10 + 1 : i10;
        }

        @NotNull
        public final String k() {
            return this.f71187b;
        }

        @NotNull
        public final String l() {
            return this.f71186a;
        }

        public final void n(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f71187b = str;
        }

        public final void o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f71186a = str;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f71188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<String> f71189b = new ArrayList();

        public final void a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f71189b.add(name);
        }

        @NotNull
        public final String b(int i10) {
            return this.f71189b.get(i10);
        }

        @NotNull
        public final List<String> c() {
            return this.f71189b;
        }

        @Nullable
        public final String d() {
            return this.f71188a;
        }

        public final void e(@Nullable String str) {
            this.f71188a = str;
        }

        public final int f() {
            return this.f71189b.size();
        }
    }

    public o1(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f71166a = str;
        this.f71167b = str2;
        this.f71168c = str3;
        this.f71169d = new ArrayList();
        this.f71171f = kotlin.g0.c(new Function0() { // from class: androidx.navigation.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o1.X(this.f70913a);
            }
        });
        this.f71172g = kotlin.g0.c(new Function0() { // from class: androidx.navigation.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(o1.J(this.f71003a));
            }
        });
        kotlin.j0 j0Var = kotlin.j0.NONE;
        this.f71173h = kotlin.g0.b(j0Var, new Function0() { // from class: androidx.navigation.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o1.Y(this.f71020a);
            }
        });
        this.f71175j = kotlin.g0.b(j0Var, new Function0() { // from class: androidx.navigation.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o1.l(this.f71023a);
            }
        });
        this.f71176k = kotlin.g0.b(j0Var, new Function0() { // from class: androidx.navigation.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o1.m(this.f71128a);
            }
        });
        this.f71177l = kotlin.g0.b(j0Var, new Function0() { // from class: androidx.navigation.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o1.o(this.f71135a);
            }
        });
        this.f71178m = kotlin.g0.c(new Function0() { // from class: androidx.navigation.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o1.n(this.f71138a);
            }
        });
        this.f71180o = kotlin.g0.c(new Function0() { // from class: androidx.navigation.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o1.P(this.f71144a);
            }
        });
        V();
        U();
    }

    private final void A(String str, Bundle bundle, Map<String, j0> map) {
        MatchResult matchResultJ;
        String strF;
        Regex regexT = t();
        if (regexT != null && (matchResultJ = regexT.j(String.valueOf(str))) != null) {
            List<String> listR = r();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listR, 10));
            int i10 = 0;
            for (Object obj : listR) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj;
                MatchGroup matchGroup = matchResultJ.b().get(i11);
                String strA = (matchGroup == null || (strF = matchGroup.f()) == null) ? null : g3.f71010a.a(strF);
                if (strA == null) {
                    strA = "";
                }
                try {
                    Q(bundle, str2, strA, map.get(str2));
                    arrayList.add(Unit.f312394a);
                    i10 = i11;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    private final Regex D() {
        return (Regex) this.f71180o.getValue();
    }

    private final Regex E() {
        return (Regex) this.f71171f.getValue();
    }

    private final Map<String, d> F() {
        return (Map) this.f71173h.getValue();
    }

    private final boolean I() {
        return ((Boolean) this.f71172g.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(o1 o1Var) {
        String str = o1Var.f71166a;
        return str != null && f71164w.k(str);
    }

    private final boolean K(String str) {
        String str2 = this.f71167b;
        if (str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return Intrinsics.areEqual(str2, str);
    }

    private final boolean L(String str) {
        if (this.f71168c == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        Regex regexD = D();
        Intrinsics.checkNotNull(regexD);
        return regexD.k(str);
    }

    private final boolean M(Uri uri) {
        if (E() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        Regex regexE = E();
        Intrinsics.checkNotNull(regexE);
        return regexE.k(uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex P(o1 o1Var) {
        String str = o1Var.f71179n;
        if (str != null) {
            return new Regex(str);
        }
        return null;
    }

    private final void Q(Bundle bundle, String str, String str2, j0 j0Var) {
        if (j0Var != null) {
            j0Var.b().parseAndPut(bundle, str, str2);
        } else {
            androidx.savedstate.n.J(androidx.savedstate.n.c(bundle), str, str2);
        }
    }

    private final boolean R(Bundle bundle, String str, String str2, j0 j0Var) {
        if (!androidx.savedstate.f.c(androidx.savedstate.f.b(bundle), str)) {
            return true;
        }
        if (j0Var == null) {
            return false;
        }
        d3<Object> d3VarB = j0Var.b();
        d3VarB.parseAndPut(bundle, str, str2, d3VarB.get(bundle, str));
        return false;
    }

    private final Pair<List<String>, String> S() {
        String str = this.f71166a;
        if (str != null) {
            g3 g3Var = g3.f71010a;
            if (g3Var.d(str).getFragment() != null) {
                ArrayList arrayList = new ArrayList();
                String fragment = g3Var.d(this.f71166a).getFragment();
                StringBuilder sb2 = new StringBuilder();
                Intrinsics.checkNotNull(fragment);
                j(fragment, arrayList, sb2);
                return TuplesKt.to(arrayList, sb2.toString());
            }
        }
        return null;
    }

    private final boolean T(List<String> list, d dVar, Bundle bundle, Map<String, j0> map) {
        Pair[] pairArr;
        Object objValueOf;
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
        androidx.savedstate.n.c(bundleB);
        Iterator<T> it = dVar.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            j0 j0Var = map.get(str);
            d3<Object> d3VarB = j0Var != null ? j0Var.b() : null;
            if ((d3VarB instanceof q) && !j0Var.c()) {
                q qVar = (q) d3VarB;
                qVar.put(bundleB, str, qVar.a());
            }
        }
        for (String str2 : list) {
            String strD = dVar.d();
            MatchResult matchResultJ = strD != null ? new Regex(strD).j(str2) : null;
            if (matchResultJ == null) {
                return false;
            }
            List<String> listC = dVar.c();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listC, 10));
            int i10 = 0;
            for (Object obj : listC) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str3 = (String) obj;
                MatchGroup matchGroup = matchResultJ.b().get(i11);
                String strF = matchGroup != null ? matchGroup.f() : null;
                if (strF == null) {
                    strF = "";
                }
                j0 j0Var2 = map.get(str3);
                try {
                    if (androidx.savedstate.f.c(androidx.savedstate.f.b(bundleB), str3)) {
                        objValueOf = Boolean.valueOf(R(bundleB, str3, strF, j0Var2));
                    } else {
                        Q(bundleB, str3, strF, j0Var2);
                        objValueOf = Unit.f312394a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = Unit.f312394a;
                }
                arrayList2.add(objValueOf);
                i10 = i11;
            }
        }
        androidx.savedstate.n.g(androidx.savedstate.n.c(bundle), bundleB);
        return true;
    }

    private final void U() {
        if (this.f71168c == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").k(this.f71168c)) {
            throw new IllegalArgumentException(("The given mimeType " + this.f71168c + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.f71168c);
        this.f71179n = StringsKt.k2("^(" + cVar.l() + "|[*]+)/(" + cVar.k() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void V() {
        if (this.f71166a == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f71159r.b(this.f71166a)) {
            sb2.append(f71161t.h());
        }
        boolean z10 = false;
        MatchResult matchResultD = Regex.d(new Regex("(\\?|#|$)"), this.f71166a, 0, 2, null);
        if (matchResultD != null) {
            String strSubstring = this.f71166a.substring(0, matchResultD.o6().l());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            j(strSubstring, this.f71169d, sb2);
            if (!f71162u.b(sb2) && !f71163v.b(sb2)) {
                z10 = true;
            }
            this.f71181p = z10;
            sb2.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f71170e = Z(string);
    }

    private final Map<String, d> W() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (I()) {
            g3 g3Var = g3.f71010a;
            String str = this.f71166a;
            Intrinsics.checkNotNull(str);
            Uri uriD = g3Var.d(str);
            for (String str2 : uriD.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                List<String> queryParameters = uriD.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + str2 + " must only be present once in " + this.f71166a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                String str3 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                if (str3 == null) {
                    this.f71174i = true;
                    str3 = str2;
                }
                int iM = 0;
                d dVar = new d();
                for (MatchResult matchResultD = Regex.d(f71160s, str3, 0, 2, null); matchResultD != null; matchResultD = matchResultD.next()) {
                    MatchGroup matchGroup = matchResultD.b().get(1);
                    Intrinsics.checkNotNull(matchGroup);
                    dVar.a(matchGroup.f());
                    if (matchResultD.o6().l() > iM) {
                        String strSubstring = str3.substring(iM, matchResultD.o6().l());
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        sb2.append(Regex.f313196c.c(strSubstring));
                    }
                    sb2.append(f71165x);
                    iM = matchResultD.o6().m() + 1;
                }
                if (iM < str3.length()) {
                    Regex.a aVar = Regex.f313196c;
                    String strSubstring2 = str3.substring(iM);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    sb2.append(aVar.c(strSubstring2));
                }
                sb2.append("$");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                dVar.e(Z(string));
                linkedHashMap.put(str2, dVar);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex X(o1 o1Var) {
        String str = o1Var.f71170e;
        if (str != null) {
            return new Regex(str, kotlin.text.n.IGNORE_CASE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map Y(o1 o1Var) {
        return o1Var.W();
    }

    private final String Z(String str) {
        if (!StringsKt.V2(str, "\\Q", false, 2, null) || !StringsKt.V2(str, "\\E", false, 2, null)) {
            return StringsKt.V2(str, "\\.\\*", false, 2, null) ? StringsKt.k2(str, "\\.\\*", n8.DEFAULT_PROPAGATION_TARGETS, false, 4, null) : str;
        }
        int i10 = 4 << 0;
        return StringsKt.k2(str, n8.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false, 4, null);
    }

    private final void j(String str, List<String> list, StringBuilder sb2) {
        int iM = 0;
        for (MatchResult matchResultD = Regex.d(f71160s, str, 0, 2, null); matchResultD != null; matchResultD = matchResultD.next()) {
            MatchGroup matchGroup = matchResultD.b().get(1);
            Intrinsics.checkNotNull(matchGroup);
            list.add(matchGroup.f());
            if (matchResultD.o6().l() > iM) {
                Regex.a aVar = Regex.f313196c;
                String strSubstring = str.substring(iM, matchResultD.o6().l());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb2.append(aVar.c(strSubstring));
            }
            sb2.append(f71163v.h());
            iM = matchResultD.o6().m() + 1;
        }
        if (iM < str.length()) {
            Regex.a aVar2 = Regex.f313196c;
            String strSubstring2 = str.substring(iM);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb2.append(aVar2.c(strSubstring2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair l(o1 o1Var) {
        return o1Var.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(o1 o1Var) {
        List<String> first;
        Pair<List<String>, String> pairS = o1Var.s();
        if (pairS != null && (first = pairS.getFirst()) != null) {
            return first;
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex n(o1 o1Var) {
        String strU = o1Var.u();
        if (strU != null) {
            return new Regex(strU, kotlin.text.n.IGNORE_CASE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(o1 o1Var) {
        Pair<List<String>, String> pairS = o1Var.s();
        if (pairS != null) {
            return pairS.getSecond();
        }
        return null;
    }

    private final List<String> r() {
        return (List) this.f71176k.getValue();
    }

    private final Pair<List<String>, String> s() {
        return (Pair) this.f71175j.getValue();
    }

    private final Regex t() {
        return (Regex) this.f71178m.getValue();
    }

    private final String u() {
        return (String) this.f71177l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(Bundle bundle, String argName) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        return !androidx.savedstate.f.c(androidx.savedstate.f.b(bundle), argName);
    }

    private final boolean y(MatchResult matchResult, Bundle bundle, Map<String, j0> map) {
        String strF;
        List<String> list = this.f71169d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            MatchGroup matchGroup = matchResult.b().get(i11);
            String strA = (matchGroup == null || (strF = matchGroup.f()) == null) ? null : g3.f71010a.a(strF);
            if (strA == null) {
                strA = "";
            }
            try {
                Q(bundle, str, strA, map.get(str));
                arrayList.add(Unit.f312394a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean z(Uri uri, Bundle bundle, Map<String, j0> map) {
        String query;
        for (Map.Entry<String, d> entry : F().entrySet()) {
            String key = entry.getKey();
            d value = entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(key);
            if (this.f71174i && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = CollectionsKt.listOf(query);
            }
            if (!T(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final String B() {
        return this.f71168c;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final int C(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (this.f71168c == null) {
            return -1;
        }
        Regex regexD = D();
        Intrinsics.checkNotNull(regexD);
        if (regexD.k(mimeType)) {
            return new c(this.f71168c).compareTo(new c(mimeType));
        }
        return -1;
    }

    @Nullable
    public final String G() {
        return this.f71166a;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final boolean H() {
        return this.f71181p;
    }

    public final boolean N(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return O(new w1(uri, null, null));
    }

    public final boolean O(@NotNull w1 deepLinkRequest) {
        Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
        return M(deepLinkRequest.c()) && K(deepLinkRequest.a()) && L(deepLinkRequest.b());
    }

    public final void a0(boolean z10) {
        this.f71181p = z10;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof o1)) {
            o1 o1Var = (o1) obj;
            if (Intrinsics.areEqual(this.f71166a, o1Var.f71166a) && Intrinsics.areEqual(this.f71167b, o1Var.f71167b) && Intrinsics.areEqual(this.f71168c, o1Var.f71168c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f71166a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f71167b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f71168c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final int k(@Nullable Uri uri) {
        if (uri == null || this.f71166a == null) {
            return 0;
        }
        return CollectionsKt.intersect(uri.getPathSegments(), g3.f71010a.d(this.f71166a).getPathSegments()).size();
    }

    @Nullable
    public final String p() {
        return this.f71167b;
    }

    @NotNull
    public final List<String> q() {
        List<String> list = this.f71169d;
        Collection<d> collectionValues = F().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((d) it.next()).c());
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) list, (Iterable) arrayList), (Iterable) r());
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final Bundle v(@NotNull Uri deepLink, @NotNull Map<String, j0> arguments) {
        MatchResult matchResultJ;
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Regex regexE = E();
        if (regexE == null || (matchResultJ = regexE.j(deepLink.toString())) == null) {
            return null;
        }
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
        final Bundle bundleB = androidx.core.os.e.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        androidx.savedstate.n.c(bundleB);
        if (!y(matchResultJ, bundleB, arguments)) {
            return null;
        }
        if (I() && !z(deepLink, bundleB, arguments)) {
            return null;
        }
        A(deepLink.getFragment(), bundleB, arguments);
        if (l0.a(arguments, new Function1() { // from class: androidx.navigation.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(o1.w(bundleB, (String) obj));
            }
        }).isEmpty()) {
            return bundleB;
        }
        return null;
    }

    @NotNull
    public final Bundle x(@Nullable Uri uri, @NotNull Map<String, j0> arguments) {
        Pair[] pairArr;
        Regex regexE;
        MatchResult matchResultJ;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
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
        androidx.savedstate.n.c(bundleB);
        if (uri != null && (regexE = E()) != null && (matchResultJ = regexE.j(uri.toString())) != null) {
            y(matchResultJ, bundleB, arguments);
            if (I()) {
                z(uri, bundleB, arguments);
            }
        }
        return bundleB;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public o1(@NotNull String uri) {
        this(uri, null, null);
        Intrinsics.checkNotNullParameter(uri, "uri");
    }
}
