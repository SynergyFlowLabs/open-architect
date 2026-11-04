package io.ktor.http;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpHeaderValueParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1068#2:244\n1563#2:245\n1634#2,3:246\n*S KotlinDebug\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n59#1:244\n115#1:245\n115#1:246,3\n*E\n"})
public final class c1 {

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n1#1,121:1\n67#2:122\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Double.valueOf(((r0) t11).f()), Double.valueOf(((r0) t10).f()));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n1#1,145:1\n68#2,9:146\n*E\n"})
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f295471a;

        public b(Comparator comparator) {
            this.f295471a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) throws io.ktor.http.b {
            int iCompare = this.f295471a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            m.c cVar = m.f295981f;
            m mVarB = cVar.b(((r0) t10).g());
            int i10 = 2;
            int i11 = Intrinsics.areEqual(mVarB.f(), "*") ? 2 : 0;
            if (Intrinsics.areEqual(mVarB.e(), "*")) {
                i11++;
            }
            Integer numValueOf = Integer.valueOf(i11);
            m mVarB2 = cVar.b(((r0) t11).g());
            if (!Intrinsics.areEqual(mVarB2.f(), "*")) {
                i10 = 0;
            }
            if (Intrinsics.areEqual(mVarB2.e(), "*")) {
                i10++;
            }
            return kotlin.comparisons.a.l(numValueOf, Integer.valueOf(i10));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n1#1,171:1\n77#2:172\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f295472a;

        public c(Comparator comparator) {
            this.f295472a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f295472a.compare(t10, t11);
            return iCompare != 0 ? iCompare : kotlin.comparisons.a.l(Integer.valueOf(((r0) t11).e().size()), Integer.valueOf(((r0) t10).e().size()));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n1#1,121:1\n59#2:122\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Double.valueOf(((r0) t11).f()), Double.valueOf(((r0) t10).f()));
        }
    }

    private static final boolean c(String str, int i10) {
        int i11 = i10 + 1;
        while (i11 < str.length() && str.charAt(i11) == ' ') {
            i11++;
        }
        if (i11 != str.length() && str.charAt(i11) != ';') {
            return false;
        }
        return true;
    }

    @NotNull
    public static final List<r0> d(@Nullable String str) {
        return CollectionsKt.sortedWith(f(str), new c(new b(new a())));
    }

    @NotNull
    public static final List<r0> e(@Nullable String str) {
        return CollectionsKt.sortedWith(f(str), new d());
    }

    @NotNull
    public static final List<r0> f(@Nullable String str) {
        return g(str, false);
    }

    @NotNull
    public static final List<r0> g(@Nullable String str, boolean z10) {
        if (str == null) {
            return CollectionsKt.emptyList();
        }
        kotlin.f0 f0VarB = kotlin.g0.b(kotlin.j0.NONE, new Function0() { // from class: io.ktor.http.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c1.h();
            }
        });
        int i10 = 0;
        while (i10 <= StringsKt.i3(str)) {
            i10 = i(str, i10, f0VarB, z10);
        }
        return q(f0VarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList h() {
        return new ArrayList();
    }

    private static final int i(String str, int i10, kotlin.f0<? extends ArrayList<r0>> f0Var, boolean z10) {
        kotlin.f0 f0VarB = kotlin.g0.b(kotlin.j0.NONE, new Function0() { // from class: io.ktor.http.b1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c1.j();
            }
        });
        Integer numValueOf = z10 ? Integer.valueOf(i10) : null;
        int iK = i10;
        while (iK <= StringsKt.i3(str)) {
            char cCharAt = str.charAt(iK);
            if (cCharAt == ',') {
                f0Var.getValue().add(new r0(o(str, i10, numValueOf != null ? numValueOf.intValue() : iK), q(f0VarB)));
                return iK + 1;
            }
            if (cCharAt != ';') {
                iK = z10 ? k(str, iK, f0VarB) : iK + 1;
            } else {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(iK);
                }
                iK = k(str, iK + 1, f0VarB);
            }
        }
        f0Var.getValue().add(new r0(o(str, i10, numValueOf != null ? numValueOf.intValue() : iK), q(f0VarB)));
        return iK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList j() {
        return new ArrayList();
    }

    private static final int k(String str, int i10, kotlin.f0<? extends ArrayList<s0>> f0Var) {
        int i11 = i10;
        while (i11 <= StringsKt.i3(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',' || cCharAt == ';') {
                l(f0Var, str, i10, i11, "");
                return i11;
            }
            if (cCharAt == '=') {
                Pair<Integer, String> pairM = m(str, i11 + 1);
                int iIntValue = pairM.component1().intValue();
                l(f0Var, str, i10, i11, pairM.component2());
                return iIntValue;
            }
            i11++;
        }
        l(f0Var, str, i10, i11, "");
        return i11;
    }

    private static final void l(kotlin.f0<? extends ArrayList<s0>> f0Var, String str, int i10, int i11, String str2) {
        String strO = o(str, i10, i11);
        if (strO.length() == 0) {
            return;
        }
        f0Var.getValue().add(new s0(strO, str2));
    }

    private static final Pair<Integer, String> m(String str, int i10) {
        if (str.length() == i10) {
            return TuplesKt.to(Integer.valueOf(i10), "");
        }
        if (str.charAt(i10) == '\"') {
            return n(str, i10 + 1);
        }
        int i11 = i10;
        while (i11 <= StringsKt.i3(str)) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == ',' || cCharAt == ';') {
                return TuplesKt.to(Integer.valueOf(i11), o(str, i10, i11));
            }
            i11++;
        }
        return TuplesKt.to(Integer.valueOf(i11), o(str, i10, i11));
    }

    private static final Pair<Integer, String> n(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= StringsKt.i3(str)) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' && c(str, i10)) {
                return TuplesKt.to(Integer.valueOf(i10 + 1), sb2.toString());
            }
            if (cCharAt != '\\' || i10 >= StringsKt.i3(str) - 2) {
                sb2.append(cCharAt);
                i10++;
            } else {
                sb2.append(str.charAt(i10 + 1));
                i10 += 2;
            }
        }
        Integer numValueOf = Integer.valueOf(i10);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return TuplesKt.to(numValueOf, '\"' + string);
    }

    private static final String o(String str, int i10, int i11) {
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return StringsKt.E5(strSubstring).toString();
    }

    @NotNull
    public static final List<s0> p(@NotNull Iterable<Pair<String, String>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Pair<String, String> pair : iterable) {
            arrayList.add(new s0(pair.getFirst(), pair.getSecond()));
        }
        return arrayList;
    }

    private static final <T> List<T> q(kotlin.f0<? extends List<? extends T>> f0Var) {
        return f0Var.Z() ? f0Var.getValue() : CollectionsKt.emptyList();
    }
}
