package androidx.work.impl.utils;

import androidx.work.l0;
import androidx.work.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRawQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawQueries.kt\nandroidx/work/impl/utils/RawQueries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1549#2:74\n1620#2,3:75\n1549#2:78\n1620#2,3:79\n37#3,2:82\n1#4:84\n*S KotlinDebug\n*F\n+ 1 RawQueries.kt\nandroidx/work/impl/utils/RawQueries\n*L\n35#1:74\n35#1:75,3\n43#1:78\n43#1:79,3\n64#1:82,2\n*E\n"})
@oj.i(name = "RawQueries")
public final class w {
    private static final void a(StringBuilder sb2, int i10) {
        if (i10 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(com.planner5d.library.model.payments.a.f222474i);
        }
        sb2.append(CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    @NotNull
    public static final w3.g b(@NotNull n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        List<l0.c> states = n0Var.j();
        Intrinsics.checkNotNullExpressionValue(states, "states");
        String str = " AND";
        String str2 = " WHERE";
        if (!states.isEmpty()) {
            List<l0.c> states2 = n0Var.j();
            Intrinsics.checkNotNullExpressionValue(states2, "states");
            List<l0.c> list = states2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (l0.c cVar : list) {
                Intrinsics.checkNotNull(cVar);
                arrayList2.add(Integer.valueOf(androidx.work.impl.model.d0.j(cVar)));
            }
            sb2.append(" WHERE state IN (");
            a(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> ids = n0Var.i();
        Intrinsics.checkNotNullExpressionValue(ids, "ids");
        if (!ids.isEmpty()) {
            List<UUID> ids2 = n0Var.i();
            Intrinsics.checkNotNullExpressionValue(ids2, "ids");
            List<UUID> list2 = ids2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((UUID) it.next()).toString());
            }
            sb2.append(str2 + " id IN (");
            a(sb2, n0Var.i().size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> tags = n0Var.k();
        Intrinsics.checkNotNullExpressionValue(tags, "tags");
        if (tags.isEmpty()) {
            str = str2;
        } else {
            sb2.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb2, n0Var.k().size());
            sb2.append("))");
            List<String> tags2 = n0Var.k();
            Intrinsics.checkNotNullExpressionValue(tags2, "tags");
            arrayList.addAll(tags2);
        }
        List<String> uniqueWorkNames = n0Var.l();
        Intrinsics.checkNotNullExpressionValue(uniqueWorkNames, "uniqueWorkNames");
        if (!uniqueWorkNames.isEmpty()) {
            sb2.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb2, n0Var.l().size());
            sb2.append("))");
            List<String> uniqueWorkNames2 = n0Var.l();
            Intrinsics.checkNotNullExpressionValue(uniqueWorkNames2, "uniqueWorkNames");
            arrayList.addAll(uniqueWorkNames2);
        }
        sb2.append(";");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return new w3.b(string, arrayList.toArray(new Object[0]));
    }
}
