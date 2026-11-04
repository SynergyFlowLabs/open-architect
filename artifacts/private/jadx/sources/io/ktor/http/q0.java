package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nFileContentType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileContentType.kt\nio/ktor/http/FileContentTypeKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n996#2:115\n1025#2,3:116\n1028#2,3:126\n384#3,7:119\n465#3:129\n415#3:130\n1252#4,2:131\n1563#4:133\n1634#4,3:134\n1255#4:137\n1#5:138\n*S KotlinDebug\n*F\n+ 1 FileContentType.kt\nio/ktor/http/FileContentTypeKt\n*L\n106#1:115\n106#1:116,3\n106#1:126,3\n106#1:119,7\n107#1:129\n107#1:130\n107#1:131,2\n107#1:133\n107#1:134,3\n107#1:137\n*E\n"})
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0 f296072a = kotlin.g0.c(new Function0() { // from class: io.ktor.http.o0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return q0.d();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final kotlin.f0 f296073b = kotlin.g0.c(new Function0() { // from class: io.ktor.http.p0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return q0.g();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map d() {
        Map mapA = io.ktor.util.x.a();
        mapA.putAll(n(CollectionsKt.asSequence(w1.c())));
        return mapA;
    }

    @NotNull
    public static final m e(@NotNull m.c cVar, @NotNull String extension) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        return p(j(m.f295981f, extension));
    }

    @NotNull
    public static final m f(@NotNull m.c cVar, @NotNull String path) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return p(k(m.f295981f, path));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map g() {
        return n(kotlin.sequences.o.k1(CollectionsKt.asSequence(w1.c()), new Function1() { // from class: io.ktor.http.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q0.h((Pair) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair h(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return TuplesKt.to((m) pair.component2(), (String) pair.component1());
    }

    @NotNull
    public static final List<String> i(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        List<String> list = m().get(mVar);
        if (list != null) {
            return list;
        }
        List<String> list2 = m().get(mVar.k());
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }

    @NotNull
    public static final List<m> j(@NotNull m.c cVar, @NotNull String ext) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(ext, "ext");
        for (String strE = io.ktor.util.y1.e(StringsKt.d4(ext, ".")); strE.length() > 0; strE = StringsKt.n5(strE, ".", "")) {
            List<m> list = l().get(strE);
            if (list != null) {
                return list;
            }
        }
        return CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<m> k(@NotNull m.c cVar, @NotNull String path) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        int iQ3 = StringsKt.q3(path, '.', StringsKt.K3(path, io.ktor.util.v.b("/\\"), 0, false, 6, null) + 1, false, 4, null);
        if (iQ3 == -1) {
            return CollectionsKt.emptyList();
        }
        String strSubstring = path.substring(iQ3 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return j(cVar, strSubstring);
    }

    private static final Map<String, List<m>> l() {
        return (Map) f296072a.getValue();
    }

    private static final Map<m, List<String>> m() {
        return (Map) f296073b.getValue();
    }

    @NotNull
    public static final <A, B> Map<A, List<B>> n(@NotNull Sequence<? extends Pair<? extends A, ? extends B>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair<? extends A, ? extends B> pair : sequence) {
            A first = pair.getFirst();
            Object arrayList = linkedHashMap.get(first);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(first, arrayList);
            }
            ((List) arrayList).add(pair);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    private static final boolean o(m mVar) {
        m.a aVar = m.a.f295985a;
        if (mVar.h(aVar.c())) {
            return mVar.h(aVar.d()) || mVar.h(aVar.j()) || mVar.h(aVar.r()) || mVar.h(aVar.v()) || mVar.h(aVar.w());
        }
        return false;
    }

    @NotNull
    public static final m p(@NotNull List<m> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        m mVarR = (m) CollectionsKt.firstOrNull((List) list);
        if (mVarR == null) {
            mVarR = m.a.f295985a.l();
        }
        if (!mVarR.h(m.h.f296047a.c()) && !mVarR.h(m.e.f296025a.g())) {
            if (o(mVarR)) {
                mVarR = r(mVarR);
            }
            return mVarR;
        }
        return r(mVarR);
    }

    @NotNull
    public static final m q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return m.f295981f.b(str);
        } catch (Throwable th2) {
            throw new IllegalArgumentException("Failed to parse " + str, th2);
        }
    }

    private static final m r(m mVar) {
        return o.a(mVar) != null ? mVar : o.b(mVar, Charsets.UTF_8);
    }
}
