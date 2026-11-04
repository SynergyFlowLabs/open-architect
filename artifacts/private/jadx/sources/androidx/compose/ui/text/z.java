package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,63:1\n151#2,2:64\n35#2,5:66\n153#2:71\n270#2,2:72\n35#2,5:74\n272#2:79\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n44#1:64,2\n44#1:66,5\n44#1:71\n56#1:72,2\n56#1:74,5\n56#1:79\n*E\n"})
public final class z {
    private static final void b(List<? extends f.e<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                f.e<?> eVar = list.get(i10);
                sortedSet.add(Integer.valueOf(eVar.i()));
                sortedSet.add(Integer.valueOf(eVar.g()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final f c(@NotNull final f fVar, @NotNull final pj.n<? super String, ? super Integer, ? super Integer, String> nVar) {
        ArrayList arrayList;
        TreeSet treeSetSortedSetOf = SetsKt.sortedSetOf(0, Integer.valueOf(fVar.m().length()));
        b(fVar.d(), treeSetSortedSetOf);
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        hVar.f312751a = "";
        final Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(0, 0));
        CollectionsKt.windowed$default(treeSetSortedSetOf, 2, 0, false, new Function1() { // from class: androidx.compose.ui.text.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.d(hVar, nVar, fVar, mapMutableMapOf, (List) obj);
            }
        }, 6, null);
        List<f.e<? extends f.a>> listD = fVar.d();
        if (listD != null) {
            arrayList = new ArrayList(listD.size());
            int size = listD.size();
            for (int i10 = 0; i10 < size; i10++) {
                f.e<? extends f.a> eVar = listD.get(i10);
                f.a aVarH = eVar.h();
                Object obj = mapMutableMapOf.get(Integer.valueOf(eVar.i()));
                Intrinsics.checkNotNull(obj);
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = mapMutableMapOf.get(Integer.valueOf(eVar.g()));
                Intrinsics.checkNotNull(obj2);
                arrayList.add(new f.e(aVarH, iIntValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        return new f(arrayList, (String) hVar.f312751a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
    public static final Integer d(kotlin.jvm.internal.i1.h hVar, pj.n nVar, f fVar, Map map, List list) {
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        hVar.f312751a = ((String) hVar.f312751a) + ((String) nVar.invoke(fVar.m(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
        return (Integer) map.put(Integer.valueOf(iIntValue2), Integer.valueOf(((String) hVar.f312751a).length()));
    }
}
