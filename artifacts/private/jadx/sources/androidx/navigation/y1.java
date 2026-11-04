package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavDestination.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,515:1\n233#2,3:516\n1557#3:519\n1628#3,3:520\n1863#3,2:529\n1863#3,2:534\n1#4:523\n90#5:524\n90#5:532\n1228#6,2:525\n1228#6,2:527\n32#7:531\n33#7:533\n*S KotlinDebug\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination\n*L\n138#1:516,3\n224#1:519\n224#1:520,3\n402#1:529,2\n412#1:534,2\n331#1:524\n410#1:532\n383#1:525,2\n387#1:527,2\n407#1:531\n407#1:533\n*E\n"})
public class y1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f71443f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Map<String, Class<?>> f71444g = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f71445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.internal.c0 f71446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private e2 f71447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private CharSequence f71448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.collection.j3<e0> f71449e;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.CLASS)
    @jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS, jj.b.CLASS})
    @jj.e(jj.a.BINARY)
    public @interface a {
        Class<?> value();
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y1 b(y1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.L();
        }

        @oj.n
        public static /* synthetic */ void f(y1 y1Var) {
        }

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public final String c(@Nullable String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        @oj.n
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public final String d(@NotNull androidx.navigation.internal.h context, int i10) {
            Intrinsics.checkNotNullParameter(context, "context");
            return i10 <= 16777215 ? String.valueOf(i10) : context.c(i10);
        }

        @NotNull
        public final Sequence<y1> e(@NotNull y1 y1Var) {
            Intrinsics.checkNotNullParameter(y1Var, "<this>");
            return kotlin.sequences.o.l(y1Var, new Function1() { // from class: androidx.navigation.z1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.b.b((y1) obj);
                }
            });
        }

        @oj.n
        public final /* synthetic */ <T> boolean g(y1 y1Var) {
            Intrinsics.checkNotNullParameter(y1Var, "<this>");
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            return h(y1Var, kotlin.jvm.internal.j1.d(Object.class));
        }

        @oj.n
        public final <T> boolean h(@NotNull y1 y1Var, @NotNull kotlin.reflect.d<T> route) {
            Intrinsics.checkNotNullParameter(y1Var, "<this>");
            Intrinsics.checkNotNullParameter(route, "route");
            if (androidx.navigation.serialization.p.k(kotlinx.serialization.m0.i(route)) != y1Var.D()) {
                return false;
            }
            int i10 = 4 ^ 1;
            return true;
        }

        @oj.n
        @NotNull
        protected final <C> Class<? extends C> i(@NotNull Context context, @NotNull String name, @NotNull Class<? extends C> expectedClassType) {
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) y1.f71444g.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    y1.f71444g.put(name, cls);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            }
            Intrinsics.checkNotNull(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @oj.n
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public final <C> Class<? extends C> j(@NotNull Context context, @NotNull String name, @NotNull Class<? extends C> expectedClassType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
            return y1.b0(context, name, expectedClassType);
        }

        private b() {
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @SourceDebugExtension({"SMAP\nNavDestination.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,515:1\n90#2:516\n90#2:518\n1863#3:517\n1864#3:519\n*S KotlinDebug\n*F\n+ 1 NavDestination.android.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n80#1:516\n100#1:518\n98#1:517\n98#1:519\n*E\n"})
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final y1 f71450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Bundle f71451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f71452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f71453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f71454e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f71455f;

        public c(@NotNull y1 destination, @Nullable Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f71450a = destination;
            this.f71451b = bundle;
            this.f71452c = z10;
            this.f71453d = i10;
            this.f71454e = z11;
            this.f71455f = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z10 = this.f71452c;
            if (z10 && !other.f71452c) {
                return 1;
            }
            if (!z10 && other.f71452c) {
                return -1;
            }
            int i10 = this.f71453d - other.f71453d;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.f71451b;
            if (bundle != null && other.f71451b == null) {
                return 1;
            }
            if (bundle == null && other.f71451b != null) {
                return -1;
            }
            if (bundle != null) {
                int iD0 = androidx.savedstate.f.D0(androidx.savedstate.f.b(bundle));
                Bundle bundle2 = other.f71451b;
                Intrinsics.checkNotNull(bundle2);
                int iD1 = iD0 - androidx.savedstate.f.D0(androidx.savedstate.f.b(bundle2));
                if (iD1 > 0) {
                    return 1;
                }
                if (iD1 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f71454e;
            if (z11 && !other.f71454e) {
                return 1;
            }
            if (z11 || !other.f71454e) {
                return this.f71455f - other.f71455f;
            }
            return -1;
        }

        @NotNull
        public final y1 k() {
            return this.f71450a;
        }

        @Nullable
        public final Bundle l() {
            return this.f71451b;
        }

        public final boolean n(@Nullable Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || (bundle2 = this.f71451b) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                Bundle bundleB = androidx.savedstate.f.b(bundle);
                Intrinsics.checkNotNull(str);
                if (!androidx.savedstate.f.c(bundleB, str)) {
                    return false;
                }
                j0 j0Var = this.f71450a.u().get(str);
                d3<Object> d3VarB = j0Var != null ? j0Var.b() : null;
                Object obj = d3VarB != null ? d3VarB.get(this.f71451b, str) : null;
                Object obj2 = d3VarB != null ? d3VarB.get(bundle, str) : null;
                if (d3VarB != null && !d3VarB.valueEquals(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public y1(@NotNull String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f71445a = navigatorName;
        this.f71446b = new androidx.navigation.internal.c0(this);
        this.f71449e = new androidx.collection.j3<>(0, 1, null);
    }

    @oj.n
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final String B(@NotNull androidx.navigation.internal.h hVar, int i10) {
        return f71443f.d(hVar, i10);
    }

    @NotNull
    public static final Sequence<y1> C(@NotNull y1 y1Var) {
        return f71443f.e(y1Var);
    }

    private final String F() {
        return this.f71446b.o();
    }

    private static Object G(y1 y1Var) {
        return kotlin.jvm.internal.j1.j(new kotlin.jvm.internal.t0(y1Var.f71446b, androidx.navigation.internal.c0.class, "idName", "getIdName$navigation_common_release()Ljava/lang/String;", 0));
    }

    private static Object N(y1 y1Var) {
        return kotlin.jvm.internal.j1.j(new kotlin.jvm.internal.t0(y1Var.f71446b, androidx.navigation.internal.c0.class, "route", "getRoute$navigation_common_release()Ljava/lang/String;", 0));
    }

    @oj.n
    public static final <T> boolean Q(@NotNull y1 y1Var, @NotNull kotlin.reflect.d<T> dVar) {
        return f71443f.h(y1Var, dVar);
    }

    @oj.n
    @NotNull
    protected static final <C> Class<? extends C> b0(@NotNull Context context, @NotNull String str, @NotNull Class<? extends C> cls) {
        return f71443f.i(context, str, cls);
    }

    @oj.n
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final <C> Class<? extends C> c0(@NotNull Context context, @NotNull String str, @NotNull Class<? extends C> cls) {
        return f71443f.j(context, str, cls);
    }

    private final void n0(String str) {
        this.f71446b.y(str);
    }

    public static /* synthetic */ int[] p(y1 y1Var, y1 y1Var2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i10 & 1) != 0) {
            y1Var2 = null;
        }
        return y1Var.n(y1Var2);
    }

    private final List<o1> v() {
        return this.f71446b.l();
    }

    private static Object w(y1 y1Var) {
        return kotlin.jvm.internal.j1.t(new kotlin.jvm.internal.c1(y1Var.f71446b, androidx.navigation.internal.c0.class, "deepLinks", "getDeepLinks$navigation_common_release()Ljava/util/List;", 0));
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public String A() {
        String strF = F();
        return strF == null ? String.valueOf(D()) : strF;
    }

    @androidx.annotation.d0
    public final int D() {
        return this.f71446b.n();
    }

    @Nullable
    public final CharSequence J() {
        return this.f71448d;
    }

    @NotNull
    public final String K() {
        return this.f71445a;
    }

    @Nullable
    public final e2 L() {
        return this.f71447c;
    }

    @Nullable
    public final String M() {
        return this.f71446b.p();
    }

    public boolean O(@NotNull Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        return P(new w1(deepLink, null, null));
    }

    public boolean P(@NotNull w1 deepLinkRequest) {
        Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
        return T(deepLinkRequest) != null;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final boolean R(@NotNull String route, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71446b.s(route, bundle);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public c T(@NotNull w1 navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return this.f71446b.t(navDeepLinkRequest);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final c Y(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f71446b.u(route);
    }

    @androidx.annotation.i
    public void a0(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, d3.a.b.f269650y);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(...)");
        t0(typedArrayObtainAttributes.getString(d3.a.b.B));
        if (typedArrayObtainAttributes.hasValue(d3.a.b.A)) {
            m0(typedArrayObtainAttributes.getResourceId(d3.a.b.A, 0));
            n0(f71443f.d(new androidx.navigation.internal.h(context), D()));
        }
        this.f71448d = typedArrayObtainAttributes.getText(d3.a.b.f269651z);
        Unit unit = Unit.f312394a;
        typedArrayObtainAttributes.recycle();
    }

    public final void d(@NotNull String argumentName, @NotNull j0 argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f71446b.g(argumentName, argument);
    }

    public final void e0(@androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11) {
        boolean z10 = false;
        h0(i10, new e0(i11, null, null, 6, null));
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof y1)) {
            y1 y1Var = (y1) obj;
            boolean zAreEqual = Intrinsics.areEqual(v(), y1Var.v());
            if (this.f71449e.size() != y1Var.f71449e.size()) {
                z10 = false;
                break;
            }
            Iterator it = kotlin.sequences.o.e(androidx.collection.l3.g(this.f71449e)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                if (!Intrinsics.areEqual(this.f71449e.g(iIntValue), y1Var.f71449e.g(iIntValue))) {
                    z10 = false;
                    break;
                }
            }
            if (u().size() != y1Var.u().size()) {
                z11 = false;
                break;
            }
            Iterator it2 = MapsKt.asSequence(u()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (!y1Var.u().containsKey(entry.getKey()) || !Intrinsics.areEqual(y1Var.u().get(entry.getKey()), entry.getValue())) {
                    z11 = false;
                    break;
                }
            }
            if (D() == y1Var.D() && Intrinsics.areEqual(M(), y1Var.M()) && zAreEqual && z10 && z11) {
                return true;
            }
        }
        return false;
    }

    public final void h0(@androidx.annotation.d0 int i10, @NotNull e0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (u0()) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f71449e.o(i10, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public int hashCode() {
        int iD = D() * 31;
        String strM = M();
        int iHashCode = iD + (strM != null ? strM.hashCode() : 0);
        for (o1 o1Var : v()) {
            int i10 = iHashCode * 31;
            String strG = o1Var.G();
            int iHashCode2 = (i10 + (strG != null ? strG.hashCode() : 0)) * 31;
            String strP = o1Var.p();
            int iHashCode3 = (iHashCode2 + (strP != null ? strP.hashCode() : 0)) * 31;
            String strB = o1Var.B();
            iHashCode = iHashCode3 + (strB != null ? strB.hashCode() : 0);
        }
        Iterator itK = androidx.collection.l3.k(this.f71449e);
        while (itK.hasNext()) {
            e0 e0Var = (e0) itK.next();
            int iB = ((iHashCode * 31) + e0Var.b()) * 31;
            w2 w2VarC = e0Var.c();
            iHashCode = iB + (w2VarC != null ? w2VarC.hashCode() : 0);
            Bundle bundleA = e0Var.a();
            if (bundleA != null) {
                iHashCode = (iHashCode * 31) + androidx.savedstate.f.e(androidx.savedstate.f.b(bundleA));
            }
        }
        for (String str : u().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str.hashCode()) * 31;
            j0 j0Var = u().get(str);
            iHashCode = iHashCode4 + (j0Var != null ? j0Var.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(@NotNull o1 navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        this.f71446b.i(navDeepLink);
    }

    public final void i0(@androidx.annotation.d0 int i10) {
        this.f71449e.r(i10);
    }

    public final void k(@NotNull String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        i(new o1.a().g(uriPattern).a());
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final Bundle l(@Nullable Bundle bundle) {
        return this.f71446b.j(bundle);
    }

    public final void l0(@NotNull String argumentName) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        this.f71446b.v(argumentName);
    }

    @oj.j
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final int[] m() {
        boolean z10 = false & true;
        return p(this, null, 1, null);
    }

    public final void m0(@androidx.annotation.d0 int i10) {
        this.f71446b.x(i10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    @oj.j
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final int[] n(@Nullable y1 y1Var) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            Intrinsics.checkNotNull(this);
            e2 e2Var = this.f71447c;
            if ((y1Var != null ? y1Var.f71447c : null) != null) {
                e2 e2Var2 = y1Var.f71447c;
                Intrinsics.checkNotNull(e2Var2);
                if (e2Var2.F0(this.D()) != this) {
                    if (e2Var != null || e2Var.Y0() != this.D()) {
                        arrayDeque.addFirst(this);
                    }
                    if (!Intrinsics.areEqual(e2Var, y1Var) || e2Var == null) {
                        break;
                    }
                    this = e2Var;
                } else {
                    arrayDeque.addFirst(this);
                    break;
                }
            } else {
                if (e2Var != null) {
                    arrayDeque.addFirst(this);
                } else {
                    arrayDeque.addFirst(this);
                }
                if (!Intrinsics.areEqual(e2Var, y1Var)) {
                    break;
                }
                this = e2Var;
            }
        }
        List list = CollectionsKt.toList(arrayDeque);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((y1) it.next()).D()));
        }
        return CollectionsKt.toIntArray(arrayList);
    }

    public final void p0(@Nullable CharSequence charSequence) {
        this.f71448d = charSequence;
    }

    @Nullable
    public final String s(@NotNull Context context, @Nullable Bundle bundle) {
        Map<String, Object> mapEmptyMap;
        String strValueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence charSequence = this.f71448d;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        if (bundle == null || (mapEmptyMap = androidx.savedstate.f.E0(androidx.savedstate.f.b(bundle))) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null || !mapEmptyMap.containsKey(strGroup)) {
                throw new IllegalArgumentException(("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
            }
            matcher.appendReplacement(stringBuffer, "");
            j0 j0Var = u().get(strGroup);
            d3<Object> d3VarB = j0Var != null ? j0Var.b() : null;
            d3<Integer> d3Var = d3.ReferenceType;
            if (Intrinsics.areEqual(d3VarB, d3Var)) {
                Intrinsics.checkNotNull(bundle);
                Integer num = d3Var.get(bundle, strGroup);
                Intrinsics.checkNotNull(num, "null cannot be cast to non-null type kotlin.Int");
                strValueOf = context.getString(num.intValue());
            } else {
                Intrinsics.checkNotNull(d3VarB);
                Intrinsics.checkNotNull(bundle);
                strValueOf = String.valueOf(d3VarB.get(bundle, strGroup));
            }
            Intrinsics.checkNotNull(strValueOf);
            stringBuffer.append(strValueOf);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void s0(@Nullable e2 e2Var) {
        this.f71447c = e2Var;
    }

    @Nullable
    public final e0 t(@androidx.annotation.d0 int i10) {
        e0 e0VarG = this.f71449e.i() ? null : this.f71449e.g(i10);
        if (e0VarG != null) {
            return e0VarG;
        }
        e2 e2Var = this.f71447c;
        if (e2Var != null) {
            return e2Var.t(i10);
        }
        return null;
    }

    public final void t0(@Nullable String str) {
        this.f71446b.z(str);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        if (F() == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(D()));
        } else {
            sb2.append(F());
        }
        sb2.append(")");
        String strM = M();
        if (strM != null && !StringsKt.w3(strM)) {
            sb2.append(" route=");
            sb2.append(M());
        }
        if (this.f71448d != null) {
            sb2.append(" label=");
            sb2.append(this.f71448d);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final Map<String, j0> u() {
        return MapsKt.toMap(this.f71446b.k());
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public boolean u0() {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y1(@NotNull q3<? extends y1> navigator) {
        this(r3.f71232b.a(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}
