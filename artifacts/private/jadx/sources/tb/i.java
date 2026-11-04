package tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    private final List<e> a(List<? extends qb.a> list, qb.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            qb.a aVar = (qb.a) obj;
            if ((aVar instanceof qb.c) && Intrinsics.areEqual(((qb.c) aVar).b(), cVar.b()) && !Intrinsics.areEqual(aVar, cVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(k.f376256a.a((qb.a) it.next()));
        }
        return arrayList2;
    }

    private final com.planner5d.library.math.k b(qb.g gVar) {
        return qb.g.a.b(gVar, null, 1, null).c0(qb.g.a.a(gVar, null, 1, null)).M();
    }

    @NotNull
    public final List<n> c(@NotNull List<? extends qb.a> collection, @NotNull qb.c item) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(item, "item");
        qb.g gVarB = item.b();
        if (gVarB == null) {
            return CollectionsKt.emptyList();
        }
        com.planner5d.library.math.k kVarO = b(gVarB).O(1);
        float f10 = gVarB.f();
        float f11 = -f10;
        return CollectionsKt.plus((Collection<? extends f>) CollectionsKt.plus((Collection<? extends f>) a(collection, item), new f(qb.g.a.a(gVarB, null, 1, null), qb.g.a.a(gVarB, null, 1, null).b(new com.planner5d.library.math.k(kVarO).R(f11)), gVarB)), new f(qb.g.a.b(gVarB, null, 1, null), qb.g.a.b(gVarB, null, 1, null).b(new com.planner5d.library.math.k(kVarO).R(f11)), gVarB));
    }
}
