package io.ktor.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1869#2,2:473\n1252#2,4:475\n1374#2:479\n1460#2,2:480\n1563#2:482\n1634#2,3:483\n1462#2,3:486\n1869#2:489\n865#2,2:490\n1870#2:492\n1869#2,2:493\n1869#2,2:495\n865#2,2:497\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt\n*L\n362#1:473,2\n372#1:475,4\n379#1:479\n379#1:480,2\n380#1:482\n380#1:483,3\n379#1:486,3\n404#1:489\n405#1:490,2\n404#1:492\n440#1:493,2\n389#1:495,2\n427#1:497,2\n*E\n"})
public final class w1 {
    public static /* synthetic */ o1 A(Pair[] pairArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return w(pairArr, z10);
    }

    @NotNull
    public static final p1 e(@NotNull p1 p1Var, @NotNull p1 builder) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator<T> it = builder.k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            p1Var.g((String) entry.getKey(), (List) entry.getValue());
        }
        return p1Var;
    }

    public static final void f(@NotNull final p1 p1Var, @NotNull o1 source, final boolean z10, @NotNull final Function2<? super String, ? super String, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        source.e(new Function2() { // from class: io.ktor.util.v1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return w1.h(z10, p1Var, predicate, (String) obj, (List) obj2);
            }
        });
    }

    public static /* synthetic */ void g(p1 p1Var, o1 o1Var, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        f(p1Var, o1Var, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(boolean z10, p1 p1Var, Function2 function2, String name, List value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList(value.size());
        for (Object obj : value) {
            if (((Boolean) function2.invoke(name, (String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (z10 || !arrayList.isEmpty()) {
            p1Var.g(name, arrayList);
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final p1 i(@NotNull p1 p1Var, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!p1Var.contains(name)) {
            p1Var.l(name, value);
        }
        return p1Var;
    }

    @NotNull
    public static final p1 j(@NotNull p1 p1Var, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!p1Var.d(name, value)) {
            p1Var.l(name, value);
        }
        return p1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return Intrinsics.areEqual(set, set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i10) {
        return (i10 * 31) + set.hashCode();
    }

    @NotNull
    public static final o1 m(@NotNull o1 o1Var, boolean z10, @NotNull Function2<? super String, ? super String, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(o1Var, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Set<Map.Entry<String, List<String>>> setK = o1Var.k();
        Map mapA = o1Var.c() ? x.a() : new LinkedHashMap(setK.size());
        Iterator<T> it = setK.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(((List) entry.getValue()).size());
            for (Object obj : iterable) {
                if (predicate.invoke(entry.getKey(), (String) obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            if (z10 || !arrayList.isEmpty()) {
                mapA.put(entry.getKey(), arrayList);
            }
        }
        return new t1(o1Var.c(), mapA);
    }

    public static /* synthetic */ o1 n(o1 o1Var, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m(o1Var, z10, function2);
    }

    @NotNull
    public static final List<Pair<String, String>> o(@NotNull o1 o1Var) {
        Intrinsics.checkNotNullParameter(o1Var, "<this>");
        Set<Map.Entry<String, List<String>>> setK = o1Var.k();
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
        return arrayList;
    }

    public static final void p(@NotNull o1 o1Var, @NotNull final Function2<? super String, ? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(o1Var, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        o1Var.e(new Function2() { // from class: io.ktor.util.u1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return w1.q(block, (String) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function2 function2, String name, List items) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(items, "items");
        Iterator it = items.iterator();
        while (it.hasNext()) {
            function2.invoke(name, (String) it.next());
        }
        return Unit.f312394a;
    }

    @NotNull
    public static final Map<String, List<String>> r(@NotNull o1 o1Var) {
        Intrinsics.checkNotNullParameter(o1Var, "<this>");
        Set<Map.Entry<String, List<String>>> setK = o1Var.k();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setK.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((String) entry.getKey(), CollectionsKt.toList((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final o1 s() {
        return o1.f296748c.c();
    }

    @NotNull
    public static final o1 t(@NotNull String name, @NotNull String value, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new x1(z10, name, CollectionsKt.listOf(value));
    }

    @NotNull
    public static final o1 u(@NotNull String name, @NotNull List<String> values, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        return new x1(z10, name, values);
    }

    @NotNull
    public static final o1 v(@NotNull Map<String, ? extends Iterable<String>> map, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "map");
        int size = map.size();
        if (size == 1) {
            Map.Entry entry = (Map.Entry) CollectionsKt.single(map.entrySet());
            return new x1(z10, (String) entry.getKey(), CollectionsKt.toList((Iterable) entry.getValue()));
        }
        Map mapA = z10 ? x.a() : new LinkedHashMap(size);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            mapA.put(entry2.getKey(), CollectionsKt.toList((Iterable) entry2.getValue()));
        }
        return new t1(z10, mapA);
    }

    @NotNull
    public static final o1 w(@NotNull Pair<String, ? extends List<String>>[] pairs, boolean z10) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return new t1(z10, MapsKt.toMap(ArraysKt.asList(pairs)));
    }

    public static /* synthetic */ o1 x(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return t(str, str2, z10);
    }

    public static /* synthetic */ o1 y(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return u(str, list, z10);
    }

    public static /* synthetic */ o1 z(Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(map, z10);
    }
}
