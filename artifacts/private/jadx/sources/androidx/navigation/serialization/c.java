package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.d3;
import androidx.navigation.g3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f71240a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final d3<Integer> f71241b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final d3<Boolean> f71242c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final d3<Double> f71243d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final d3<Double> f71244e = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final d3<Float> f71245f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final d3<Long> f71246g = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final d3<String> f71247h = new i();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final d3<String[]> f71248i = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final d3<List<String>> f71249j = new k();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final d3<double[]> f71250k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final d3<List<Double>> f71251l = new C0631c();

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$BoolNullableType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,454:1\n106#2:455\n90#2:456\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$BoolNullableType$1\n*L\n213#1:455\n218#1:456\n*E\n"})
    public static final class a extends d3<Boolean> {
        a() {
            super(true);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
                return null;
            }
            return Boolean.valueOf(androidx.savedstate.f.k(bundleB, key));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return d3.BoolType.parseValue(value);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, Boolean bool) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (bool == null) {
                androidx.savedstate.n.z(androidx.savedstate.n.c(bundle), key);
            } else {
                d3.BoolType.put(bundle, key, bool);
            }
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "boolean_nullable";
        }
    }

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleArrayType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,454:1\n106#2:455\n90#2:456\n1557#3:457\n1628#3,3:458\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleArrayType$1\n*L\n396#1:455\n400#1:456\n415#1:457\n415#1:458,3\n*E\n"})
    public static final class b extends androidx.navigation.q<double[]> {
        b() {
            super(true);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public double[] a() {
            return new double[0];
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public double[] get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
                return null;
            }
            return androidx.savedstate.f.z(bundleB, key);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public double[] parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new double[]{c.f71240a.e().parseValue(value).doubleValue()};
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public double[] parseValue(String value, double[] dArr) {
            double[] dArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (dArr == null || (dArrPlus = ArraysKt.plus(dArr, parseValue(value))) == null) ? parseValue(value) : dArrPlus;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, double[] dArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleC = androidx.savedstate.n.c(bundle);
            if (dArr == null) {
                androidx.savedstate.n.z(bundleC, key);
            } else {
                androidx.savedstate.n.q(bundleC, key, dArr);
            }
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "double[]";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<String> b(double[] dArr) {
            List<Double> list;
            if (dArr == null || (list = ArraysKt.toList(dArr)) == null) {
                return CollectionsKt.emptyList();
            }
            List<Double> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean valueEquals(double[] dArr, double[] dArr2) {
            return ArraysKt.contentDeepEquals(dArr != null ? ArraysKt.toTypedArray(dArr) : null, dArr2 != null ? ArraysKt.toTypedArray(dArr2) : null);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.serialization.c$c, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleListType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,454:1\n106#2:455\n90#2:456\n37#3,2:457\n37#3,2:459\n1557#4:461\n1628#4,3:462\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleListType$1\n*L\n426#1:455\n432#1:456\n443#1:457,2\n444#1:459,2\n449#1:461\n449#1:462,3\n*E\n"})
    public static final class C0631c extends androidx.navigation.q<List<? extends Double>> {
        C0631c() {
            super(true);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<Double> a() {
            return CollectionsKt.emptyList();
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public List<Double> get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
                return null;
            }
            return ArraysKt.toList(androidx.savedstate.f.z(bundleB, key));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<Double> parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(c.f71240a.e().parseValue(value));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public List<Double> parseValue(String value, List<Double> list) {
            List<Double> listPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            if (list != null && (listPlus = CollectionsKt.plus((Collection) list, (Iterable) parseValue(value))) != null) {
                return listPlus;
            }
            return parseValue(value);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, List<Double> list) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleC = androidx.savedstate.n.c(bundle);
            if (list == null) {
                androidx.savedstate.n.z(bundleC, key);
            } else {
                androidx.savedstate.n.q(bundleC, key, CollectionsKt.toDoubleArray(list));
            }
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "List<Double>";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<String> b(List<Double> list) {
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            List<Double> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean valueEquals(List<Double> list, List<Double> list2) {
            return ArraysKt.contentDeepEquals(list != null ? (Double[]) list.toArray(new Double[0]) : null, list2 != null ? (Double[]) list2.toArray(new Double[0]) : null);
        }
    }

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleNullableType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,454:1\n106#2:455\n90#2:456\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleNullableType$1\n*L\n246#1:455\n251#1:456\n*E\n"})
    public static final class d extends d3<Double> {
        d() {
            super(true);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
                return null;
            }
            return Double.valueOf(androidx.savedstate.f.y(bundleB, key));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return c.f71240a.e().parseValue(value);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, Double d10) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (d10 == null) {
                androidx.savedstate.n.z(androidx.savedstate.n.c(bundle), key);
            } else {
                c.f71240a.e().put(bundle, key, d10);
            }
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "double_nullable";
        }
    }

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,454:1\n106#2:455\n90#2:456\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$DoubleType$1\n*L\n231#1:455\n235#1:456\n*E\n"})
    public static final class e extends d3<Double> {
        e() {
            super(false);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return Double.valueOf(androidx.savedstate.f.y(androidx.savedstate.f.b(bundle), key));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Double.valueOf(Double.parseDouble(value));
        }

        public void c(Bundle bundle, String key, double d10) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            androidx.savedstate.n.p(androidx.savedstate.n.c(bundle), key, d10);
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "double";
        }

        @Override // androidx.navigation.d3
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Double d10) {
            c(bundle, str, d10.doubleValue());
        }
    }

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$FloatNullableType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,454:1\n106#2:455\n90#2:456\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$FloatNullableType$1\n*L\n264#1:455\n269#1:456\n*E\n"})
    public static final class f extends d3<Float> {
        f() {
            super(true);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
                return null;
            }
            return Float.valueOf(androidx.savedstate.f.C(bundleB, key));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return d3.FloatType.parseValue(value);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, Float f10) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (f10 == null) {
                androidx.savedstate.n.z(androidx.savedstate.n.c(bundle), key);
            } else {
                d3.FloatType.put(bundle, key, f10);
            }
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "float_nullable";
        }
    }

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$IntNullableType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,454:1\n106#2:455\n90#2:456\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$IntNullableType$1\n*L\n195#1:455\n200#1:456\n*E\n"})
    public static final class g extends d3<Integer> {
        g() {
            super(true);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
                return null;
            }
            return Integer.valueOf(androidx.savedstate.f.G(bundleB, key));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return d3.IntType.parseValue(value);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, Integer num) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (num == null) {
                androidx.savedstate.n.z(androidx.savedstate.n.c(bundle), key);
            } else {
                d3.IntType.put(bundle, key, num);
            }
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "integer_nullable";
        }
    }

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$LongNullableType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,454:1\n106#2:455\n90#2:456\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$LongNullableType$1\n*L\n282#1:455\n287#1:456\n*E\n"})
    public static final class h extends d3<Long> {
        h() {
            super(true);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
                return null;
            }
            return Long.valueOf(androidx.savedstate.f.Q(bundleB, key));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, AbstractJsonLexerKt.NULL)) {
                return null;
            }
            return d3.LongType.parseValue(value);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, Long l10) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (l10 == null) {
                androidx.savedstate.n.z(androidx.savedstate.n.c(bundle), key);
            } else {
                d3.LongType.put(bundle, key, l10);
            }
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "long_nullable";
        }
    }

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNonNullableType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,454:1\n106#2:455\n90#2:456\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNonNullableType$1\n*L\n300#1:455\n304#1:456\n*E\n"})
    public static final class i extends d3<String> {
        i() {
            super(false);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            return (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) ? AbstractJsonLexerKt.NULL : androidx.savedstate.f.u0(bundleB, key);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, String value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            androidx.savedstate.n.J(androidx.savedstate.n.c(bundle), key, value);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String serializeAsValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return g3.c(g3.f71010a, value, null, 2, null);
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "string_non_nullable";
        }
    }

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNullableArrayType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n106#2:455\n90#2:462\n11165#3:456\n11500#3,3:457\n11165#3:463\n11500#3,3:464\n11165#3:469\n11500#3,2:470\n11502#3:473\n37#4,2:460\n37#4,2:467\n1#5:472\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNullableArrayType$1\n*L\n319#1:455\n327#1:462\n321#1:456\n321#1:457,3\n329#1:463\n329#1:464,3\n346#1:469\n346#1:470,2\n346#1:473\n321#1:460,2\n329#1:467,2\n*E\n"})
    public static final class j extends androidx.navigation.q<String[]> {
        j() {
            super(true);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String[] a() {
            return new String[0];
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String[] get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
                return null;
            }
            String[] strArrV0 = androidx.savedstate.f.v0(bundleB, key);
            ArrayList arrayList = new ArrayList(strArrV0.length);
            for (String str : strArrV0) {
                arrayList.add(d3.StringType.parseValue(str));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String[] parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new String[]{d3.StringType.parseValue(value)};
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String[] parseValue(String value, String[] strArr) {
            String[] strArr2;
            Intrinsics.checkNotNullParameter(value, "value");
            return (strArr == null || (strArr2 = (String[]) ArraysKt.plus((Object[]) strArr, (Object[]) parseValue(value))) == null) ? parseValue(value) : strArr2;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, String[] strArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleC = androidx.savedstate.n.c(bundle);
            if (strArr == null) {
                androidx.savedstate.n.z(bundleC, key);
                return;
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                if (str == null) {
                    str = AbstractJsonLexerKt.NULL;
                }
                arrayList.add(str);
            }
            androidx.savedstate.n.K(bundleC, key, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "string_nullable[]";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<String> b(String[] strArr) {
            String strC;
            if (strArr == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                if (str == null || (strC = g3.c(g3.f71010a, str, null, 2, null)) == null) {
                    strC = AbstractJsonLexerKt.NULL;
                }
                arrayList.add(strC);
            }
            return arrayList;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean valueEquals(String[] strArr, String[] strArr2) {
            return ArraysKt.contentDeepEquals(strArr, strArr2);
        }
    }

    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNullableListType$1\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n106#2:455\n90#2:462\n1557#3:456\n1628#3,3:457\n1557#3:463\n1628#3,3:464\n1557#3:471\n1628#3,2:472\n1630#3:475\n37#4,2:460\n37#4,2:467\n37#4,2:469\n1#5:474\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$StringNullableListType$1\n*L\n357#1:455\n364#1:462\n359#1:456\n359#1:457,3\n366#1:463\n366#1:464,3\n385#1:471\n385#1:472,2\n385#1:475\n359#1:460,2\n379#1:467,2\n380#1:469,2\n*E\n"})
    public static final class k extends androidx.navigation.q<List<? extends String>> {
        k() {
            super(true);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a() {
            return CollectionsKt.emptyList();
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public List<String> get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleB = androidx.savedstate.f.b(bundle);
            if (!androidx.savedstate.f.c(bundleB, key) || androidx.savedstate.f.C0(bundleB, key)) {
                return null;
            }
            List list = ArraysKt.toList(androidx.savedstate.f.v0(bundleB, key));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d3.StringType.parseValue((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<String> parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(d3.StringType.parseValue(value));
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public List<String> parseValue(String value, List<String> list) {
            List<String> listPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (list == null || (listPlus = CollectionsKt.plus((Collection) list, (Iterable) parseValue(value))) == null) ? parseValue(value) : listPlus;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void put(Bundle bundle, String key, List<String> list) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Bundle bundleC = androidx.savedstate.n.c(bundle);
            if (list == null) {
                androidx.savedstate.n.z(bundleC, key);
                return;
            }
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (String str : list2) {
                if (str == null) {
                    str = AbstractJsonLexerKt.NULL;
                }
                arrayList.add(str);
            }
            androidx.savedstate.n.K(bundleC, key, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // androidx.navigation.d3
        public String getName() {
            return "List<String?>";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<String> b(List<String> list) {
            String strC;
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (String str : list2) {
                if (str == null || (strC = g3.c(g3.f71010a, str, null, 2, null)) == null) {
                    strC = AbstractJsonLexerKt.NULL;
                }
                arrayList.add(strC);
            }
            return arrayList;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean valueEquals(List<String> list, List<String> list2) {
            return ArraysKt.contentDeepEquals(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }
    }

    private c() {
    }

    @NotNull
    public final d3<Boolean> a() {
        return f71242c;
    }

    @NotNull
    public final d3<double[]> b() {
        return f71250k;
    }

    @NotNull
    public final d3<List<Double>> c() {
        return f71251l;
    }

    @NotNull
    public final d3<Double> d() {
        return f71244e;
    }

    @NotNull
    public final d3<Double> e() {
        return f71243d;
    }

    @NotNull
    public final d3<Float> f() {
        return f71245f;
    }

    @NotNull
    public final d3<Integer> g() {
        return f71241b;
    }

    @NotNull
    public final d3<Long> h() {
        return f71246g;
    }

    @NotNull
    public final d3<String> i() {
        return f71247h;
    }

    @NotNull
    public final d3<String[]> j() {
        return f71248i;
    }

    @NotNull
    public final d3<List<String>> k() {
        return f71249j;
    }
}
