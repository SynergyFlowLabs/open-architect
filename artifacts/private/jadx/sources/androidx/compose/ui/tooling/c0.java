package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,116:1\n1557#2:117\n1628#2,3:118\n1381#2:121\n1469#2,5:122\n1557#2:127\n1628#2,3:128\n774#2:131\n865#2,2:132\n1485#2:134\n1510#2,3:135\n1513#2,3:145\n1863#2,2:148\n1557#2:150\n1628#2,3:151\n381#3,7:138\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo_androidKt\n*L\n76#1:117\n76#1:118,3\n82#1:121\n82#1:122,5\n83#1:127\n83#1:128,3\n84#1:131\n84#1:132,2\n85#1:134\n85#1:135,3\n85#1:145,3\n90#1:148,2\n112#1:150\n112#1:151,3\n85#1:138,7\n*E\n"})
public final class c0 {
    @NotNull
    public static final List<e0> d(@NotNull List<e0> list) {
        if (list.size() < 2) {
            return list;
        }
        List<e0> list2 = list;
        ArrayList<y> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new y((e0) it.next()));
        }
        ArrayList<y> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((y) it2.next()).b());
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (y yVar : arrayList2) {
            arrayList3.add(TuplesKt.to(yVar.d(), yVar));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((Pair) obj).getFirst() != null) {
                arrayList4.add(obj);
            }
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            l0 l0Var = (l0) ((Pair) obj2).getFirst();
            Object arrayList5 = linkedHashMap.get(l0Var);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(l0Var, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
        for (final y yVar2 : arrayList) {
            y yVar3 = (y) kotlin.sequences.o.F0(kotlin.sequences.o.k1(kotlin.sequences.o.p0(kotlin.sequences.o.M0(yVar2.b(), new Function1() { // from class: androidx.compose.ui.tooling.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return c0.e(linkedHashMap, (y) obj3);
                }
            }), new Function1() { // from class: androidx.compose.ui.tooling.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(c0.f(yVar2, (Pair) obj3));
                }
            }), new Function1() { // from class: androidx.compose.ui.tooling.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return c0.g((Pair) obj3);
                }
            }));
            if (yVar3 != null) {
                yVar2.f(yVar3);
                linkedHashSet.remove(yVar2);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((y) it3.next()).h());
        }
        return arrayList6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable e(Map map, y yVar) {
        l0 l0VarD = yVar.d();
        List listEmptyList = (List) map.get(l0VarD != null ? l0VarD.o() : null);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(y yVar, Pair pair) {
        return !Intrinsics.areEqual(((y) pair.getSecond()).a(), yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y g(Pair pair) {
        return (y) pair.component2();
    }
}
