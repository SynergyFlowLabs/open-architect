package io.ktor.http;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpUrlEncoded.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrlEncoded.kt\nio/ktor/http/HttpUrlEncodedKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Parameters.kt\nio/ktor/http/Parameters$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1563#2:83\n1634#2,3:84\n295#2,2:87\n1869#2,2:90\n1374#2:93\n1460#2,2:94\n1563#2:96\n1634#2,3:97\n1462#2,3:100\n1374#2:103\n1460#2,2:104\n1563#2:106\n1634#2,3:107\n1462#2,3:110\n31#3:89\n1#4:92\n*S KotlinDebug\n*F\n+ 1 HttpUrlEncoded.kt\nio/ktor/http/HttpUrlEncodedKt\n*L\n16#1:83\n16#1:84,3\n18#1:87,2\n22#1:90,2\n61#1:93\n61#1:94,2\n61#1:96\n61#1:97,3\n61#1:100,3\n78#1:103\n78#1:104,2\n79#1:106\n79#1:107,3\n78#1:110,3\n21#1:89\n*E\n"})
public final class o1 {
    @NotNull
    public static final String b(@NotNull x1 x1Var) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Set<Map.Entry<String, List<String>>> setK = x1Var.k();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setK.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(TuplesKt.to(entry.getKey(), (String) it2.next()));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return c(arrayList);
    }

    @NotNull
    public static final String c(@NotNull List<Pair<String, String>> list) throws IOException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        StringBuilder sb2 = new StringBuilder();
        f(list, sb2);
        return sb2.toString();
    }

    public static final void d(@NotNull x1 x1Var, @NotNull Appendable out) throws IOException {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        g(x1Var.k(), out);
    }

    public static final void e(@NotNull y1 y1Var, @NotNull Appendable out) throws IOException {
        Intrinsics.checkNotNullParameter(y1Var, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        g(y1Var.k(), out);
    }

    public static final void f(@NotNull List<Pair<String, String>> list, @NotNull Appendable out) throws IOException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        CollectionsKt___CollectionsKt.joinTo(list, out, (124 & 2) != 0 ? ", " : "&", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: io.ktor.http.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o1.h((Pair) obj);
            }
        });
    }

    public static final void g(@NotNull Set<? extends Map.Entry<String, ? extends List<String>>> set, @NotNull Appendable out) throws IOException {
        List listListOf;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listListOf = CollectionsKt.listOf(TuplesKt.to(str, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(TuplesKt.to(str, (String) it2.next()));
                }
                listListOf = arrayList2;
            }
            CollectionsKt.addAll(arrayList, listListOf);
        }
        f(arrayList, out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence h(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strM = h.m((String) it.getFirst(), true);
        if (it.getSecond() == null) {
            return strM;
        }
        return strM + '=' + h.p(String.valueOf(it.getSecond()));
    }

    @NotNull
    public static final x1 i(@NotNull String str, @NotNull Charset defaultEncoding, int i10) {
        Object next;
        String strL;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(defaultEncoding, "defaultEncoding");
        int i11 = 3 << 0;
        List<String> listSplit$default = StringsKt.split$default(str, new String[]{"&"}, false, i10, 2, null);
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        for (String str2 : listSplit$default) {
            arrayList.add(TuplesKt.to(StringsKt.x5(str2, "=", null, 2, null), StringsKt.n5(str2, "=", "")));
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Pair) next).getFirst(), "_charset_"));
        Pair pair = (Pair) next;
        if (pair == null || (strL = (String) pair.getSecond()) == null) {
            strL = ti.a.l(defaultEncoding);
        }
        Charset charsetI = ti.a.i(Charsets.f313184a, strL);
        x1.a aVar = x1.f296128b;
        y1 y1VarB = b2.b(0, 1, null);
        for (Pair pair2 : arrayList) {
            y1VarB.l(h.k((String) pair2.component1(), 0, 0, false, charsetI, 7, null), h.k((String) pair2.component2(), 0, 0, false, charsetI, 7, null));
        }
        return y1VarB.build();
    }

    public static /* synthetic */ x1 j(String str, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i11 & 2) != 0) {
            i10 = 1000;
        }
        return i(str, charset, i10);
    }
}
