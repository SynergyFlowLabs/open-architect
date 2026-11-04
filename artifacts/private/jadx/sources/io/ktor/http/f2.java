package io.ktor.http;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nRanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ranges.kt\nio/ktor/http/RangesKt\n+ 2 Text.kt\nio/ktor/util/TextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n41#2,3:140\n41#2,3:146\n1563#3:143\n1634#3,2:144\n1636#3:149\n1563#3:150\n1634#3,3:151\n827#3:154\n855#3,2:155\n1056#3:157\n1803#3,3:158\n*S KotlinDebug\n*F\n+ 1 Ranges.kt\nio/ktor/http/RangesKt\n*L\n81#1:140,3\n86#1:146,3\n82#1:143\n82#1:144,2\n82#1:149\n105#1:150\n105#1:151,3\n111#1:154\n111#1:155,2\n115#1:157\n115#1:158,3\n*E\n"})
public final class f2 {

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Ranges.kt\nio/ktor/http/RangesKt\n*L\n1#1,102:1\n115#2:103\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Long.valueOf(((kotlin.ranges.n) t10).l()), Long.valueOf(((kotlin.ranges.n) t11).l()));
        }
    }

    @NotNull
    public static final List<kotlin.ranges.n> a(@NotNull List<kotlin.ranges.n> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<kotlin.ranges.n> listSortedWith = CollectionsKt.sortedWith(list, new a());
        ArrayList arrayList = new ArrayList(list.size());
        for (kotlin.ranges.n nVar : listSortedWith) {
            if (arrayList.isEmpty()) {
                arrayList.add(nVar);
            } else if (((kotlin.ranges.n) CollectionsKt.last((List) arrayList)).m() < nVar.l() - 1) {
                arrayList.add(nVar);
            } else {
                kotlin.ranges.n nVar2 = (kotlin.ranges.n) CollectionsKt.last((List) arrayList);
                arrayList.set(CollectionsKt.getLastIndex(arrayList), new kotlin.ranges.n(nVar2.l(), Math.max(nVar2.m(), nVar.m())));
            }
        }
        kotlin.ranges.n[] nVarArr = new kotlin.ranges.n[list.size()];
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            kotlin.ranges.n nVar3 = (kotlin.ranges.n) next;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (io.ktor.util.i1.a(nVar3, list.get(i10))) {
                    nVarArr[i10] = nVar3;
                    break;
                }
            }
        }
        return ArraysKt.filterNotNull(nVarArr);
    }

    @Nullable
    public static final h2 b(@NotNull String rangeSpec) {
        Pair pair;
        Object aVar;
        Intrinsics.checkNotNullParameter(rangeSpec, "rangeSpec");
        try {
            int iR3 = StringsKt.r3(rangeSpec, "=", 0, false, 6, null);
            if (iR3 == -1) {
                return null;
            }
            String strSubstring = rangeSpec.substring(0, iR3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = rangeSpec.substring(iR3 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Pair pair2 = TuplesKt.to(strSubstring, strSubstring2);
            String str = (String) pair2.component1();
            List<String> listT4 = StringsKt.T4((String) pair2.component2(), new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listT4, 10));
            for (String str2 : listT4) {
                if (StringsKt.u2(str2, "-", false, 2, null)) {
                    aVar = new k.b(Long.parseLong(StringsKt.d4(str2, "-")));
                } else {
                    int iR4 = StringsKt.r3(str2, "-", 0, false, 6, null);
                    if (iR4 == -1) {
                        pair = TuplesKt.to("", "");
                    } else {
                        String strSubstring3 = str2.substring(0, iR4);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        String strSubstring4 = str2.substring(iR4 + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                        pair = TuplesKt.to(strSubstring3, strSubstring4);
                    }
                    String str3 = (String) pair.component1();
                    String str4 = (String) pair.component2();
                    aVar = str4.length() > 0 ? new k.a(Long.parseLong(str3), Long.parseLong(str4)) : new k.c(Long.parseLong(str3));
                }
                arrayList.add(aVar);
            }
            if (!arrayList.isEmpty() && str.length() != 0) {
                h2 h2Var = new h2(str, arrayList);
                if (h2.i(h2Var, null, 1, null)) {
                    return h2Var;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @NotNull
    public static final List<kotlin.ranges.n> c(@NotNull List<? extends k> list, long j10) {
        kotlin.ranges.n nVarF2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends k> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (k kVar : list2) {
            if (kVar instanceof k.a) {
                k.a aVar = (k.a) kVar;
                nVarF2 = new kotlin.ranges.n(aVar.e(), kotlin.ranges.r.C(aVar.f(), j10 - 1));
            } else if (kVar instanceof k.c) {
                nVarF2 = kotlin.ranges.r.f2(((k.c) kVar).d(), j10);
            } else {
                if (!(kVar instanceof k.b)) {
                    throw new kotlin.k0();
                }
                nVarF2 = kotlin.ranges.r.f2(kotlin.ranges.r.v(j10 - ((k.b) kVar).d(), 0L), j10);
            }
            arrayList.add(nVarF2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((kotlin.ranges.n) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
