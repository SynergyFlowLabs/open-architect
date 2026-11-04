package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.c0;
import androidx.compose.runtime.tooling.d0;
import androidx.compose.runtime.tooling.v;
import androidx.compose.runtime.tooling.y;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.g1;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.unit.s;
import com.rabbitmq.client.k0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSlotTree.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,660:1\n360#2,7:661\n1557#2:669\n1628#2,3:670\n2669#2,7:673\n295#2,2:697\n1053#2:699\n1755#2,3:700\n1567#2:703\n1598#2,3:704\n295#2,2:707\n1601#2:709\n1755#2,3:710\n1053#2:713\n1577#2,11:714\n1872#2,2:725\n1874#2:728\n1588#2:729\n1#3:668\n1#3:727\n65#4:680\n69#4:683\n60#5:681\n70#5:684\n85#5:687\n90#5:689\n22#6:682\n22#6:685\n54#7:686\n59#7:688\n381#8,7:690\n3829#9:730\n4344#9,2:731\n1310#9,2:733\n*S KotlinDebug\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n*L\n238#1:661,7\n269#1:669\n269#1:670,3\n269#1:673,7\n515#1:697,2\n546#1:699\n548#1:700,3\n563#1:703\n563#1:704,3\n570#1:707,2\n563#1:709\n585#1:710,3\n588#1:713\n593#1:714,11\n593#1:725,2\n593#1:728\n593#1:729\n593#1:727\n307#1:680\n308#1:683\n307#1:681\n308#1:684\n309#1:687\n310#1:689\n307#1:682\n308#1:685\n309#1:686\n310#1:688\n469#1:690,7\n636#1:730\n636#1:731,2\n659#1:733,2\n*E\n"})
@oj.i(name = "SlotTreeKt")
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final s f42536a = new s(0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f42537b = "$";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f42538c = "$$";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f42539d = "$$default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f42540e = "$$changed";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f42541f = "$jacoco";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f42542g = ".RecomposeScopeImpl";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f42543h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f42544i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f42545j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f42546k = 4;

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n*L\n1#1,102:1\n546#2:103\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.p5(((Field) t10).getName(), "f$", null, 2, null));
            Integer numValueOf = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : Integer.MAX_VALUE);
            Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.p5(((Field) t11).getName(), "f$", null, 2, null));
            return kotlin.comparisons.a.l(numValueOf, Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : Integer.MAX_VALUE));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n*L\n1#1,102:1\n588#2:103\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(((y) t10).b(), ((y) t11).b());
        }
    }

    private static final Field c(Class<?> cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i10];
            if (Intrinsics.areEqual(field.getName(), str)) {
                break;
            }
            i10++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    @n
    @NotNull
    public static final e d(@NotNull androidx.compose.runtime.tooling.f fVar) {
        e eVarN;
        androidx.compose.runtime.tooling.m mVar = (androidx.compose.runtime.tooling.m) CollectionsKt.firstOrNull(fVar.i());
        return (mVar == null || (eVarN = n(mVar, null)) == null) ? d.f42512j : eVarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s e(l0 l0Var) {
        g0 g0VarN = l0Var.n();
        if (!l0Var.I() || !g0VarN.I()) {
            return new s(0, 0, l0Var.getWidth(), l0Var.getHeight());
        }
        long jG = h0.g(g0VarN);
        long jA = g0VarN.a();
        int iL0 = kotlin.math.b.L0(Float.intBitsToFloat((int) (jG >> 32)));
        int iL1 = kotlin.math.b.L0(Float.intBitsToFloat((int) (jG & k0.f265952a)));
        return new s(iL0, iL1, ((int) (jA >> 32)) + iL0, ((int) (jA & k0.f265952a)) + iL1);
    }

    @n
    private static final h f(Field field, Object obj, int i10, int i11, int i12, y yVar) throws IllegalAccessException {
        String strSubstring;
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        boolean z10 = ((1 << i10) & i11) != 0;
        int i13 = (i10 * 3) + 1;
        int i14 = (i12 & (7 << i13)) >> i13;
        int i15 = i14 & 3;
        boolean z11 = i15 == 3;
        boolean z12 = i15 == 0;
        boolean z13 = (i14 & 4) == 0;
        if (yVar == null || (strSubstring = yVar.b()) == null) {
            strSubstring = field.getName().substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        return new h(strSubstring, obj2, z10, z11, z12 && !z10, yVar != null ? yVar.a() : null, z13);
    }

    private static final List<h> g(List<Field> list, Object obj, List<y> list2) {
        boolean z10;
        Object next;
        List listSortedWith = CollectionsKt.sortedWith(list, new a());
        int i10 = 0;
        if (list2.isEmpty()) {
            z10 = true;
        } else {
            List<y> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((y) it.next()).b() != null) {
                            z10 = true;
                        }
                    }
                }
            }
            z10 = false;
        }
        List listTake = z10 ? CollectionsKt.take(listSortedWith, list2.size()) : listSortedWith;
        int size = z10 ? list2.size() : listSortedWith.size();
        Field field = (Field) CollectionsKt.getOrNull(listSortedWith, size);
        Object obj2 = field != null ? field.get(obj) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Field field2 = (Field) CollectionsKt.getOrNull(listSortedWith, size + 1);
        Object obj3 = field2 != null ? field2.get(obj) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List list4 = listTake;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator it2 = list4.iterator();
        while (true) {
            int i11 = i10;
            if (!it2.hasNext()) {
                return arrayList;
            }
            Object next2 = it2.next();
            i10 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Field field3 = (Field) next2;
            Iterator<T> it3 = list2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((y) next).c() != i11);
            Object obj4 = obj;
            arrayList.add(f(field3, obj4, i11, iIntValue2, iIntValue, (y) next));
            obj = obj4;
        }
    }

    private static final List<h> h(List<Field> list, Object obj, List<y> list2) throws IllegalAccessException {
        List<y> listSortedWith;
        int i10;
        h hVarF;
        Object obj2 = obj;
        Class<?> cls = obj2.getClass();
        Field fieldC = c(cls, f42539d);
        Object obj3 = fieldC != null ? fieldC.get(obj2) : null;
        Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Field fieldC2 = c(cls, f42540e);
        Object obj4 = fieldC2 != null ? fieldC2.get(obj2) : null;
        Integer num2 = obj4 instanceof Integer ? (Integer) obj4 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        if (list2.isEmpty()) {
            listSortedWith = CollectionsKt.sortedWith(list2, new b());
        } else {
            List<y> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((y) it.next()).b() != null) {
                            listSortedWith = CollectionsKt.sortedWith(list2, new b());
                        }
                    }
                }
            }
            listSortedWith = list2;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj5 : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            y yVar = (y) CollectionsKt.getOrNull(listSortedWith, i11);
            y yVar2 = yVar == null ? new y(i11, null, null, 6, null) : yVar;
            int iC = yVar2.c();
            if (iC >= list.size()) {
                i10 = iIntValue;
                hVarF = null;
            } else {
                i10 = iIntValue;
                hVarF = f(list.get(iC), obj2, i11, i10, iIntValue2, yVar2);
            }
            if (hVarF != null) {
                arrayList.add(hVarF);
            }
            obj2 = obj;
            iIntValue = i10;
            i11 = i12;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n
    public static final List<h> i(List<? extends Object> list, l lVar) {
        Object next;
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && StringsKt.M1(next.getClass().getName(), f42542g, false, 2, null)) {
                break;
            }
        }
        if (next == null) {
            return CollectionsKt.emptyList();
        }
        Field fieldC = c(next.getClass(), "block");
        if (fieldC == null || (obj = fieldC.get(next)) == null) {
            return CollectionsKt.emptyList();
        }
        List<y> listD = lVar != null ? lVar.d() : null;
        if (listD == null) {
            listD = CollectionsKt.emptyList();
        }
        Class<?> cls = obj.getClass();
        try {
            List<Field> listJ = j(cls.getDeclaredFields(), true);
            return !listJ.isEmpty() ? g(listJ, obj, listD) : h(j(cls.getDeclaredFields(), false), obj, listD);
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    private static final List<Field> j(Field[] fieldArr, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (Field field : fieldArr) {
            String name = field.getName();
            boolean zK = new Regex("^f\\$\\d+$").k(name);
            boolean zU2 = StringsKt.u2(name, f42537b, false, 2, null);
            if (((z10 && zK) || (!z10 && zU2)) && !StringsKt.u2(name, f42538c, false, 2, null) && !StringsKt.u2(name, f42541f, false, 2, null)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    @n
    @NotNull
    public static final List<h> k(@NotNull androidx.compose.runtime.tooling.m mVar, @Nullable c cVar) {
        String strU1 = mVar.U1();
        if (strU1 == null) {
            return CollectionsKt.emptyList();
        }
        l lVarU = null;
        if (cVar == null) {
            lVarU = u(strU1, null, 2, null);
        } else {
            Map<String, Object> mapB = cVar.b();
            Object objU = mapB.get(strU1);
            if (objU == null) {
                objU = u(strU1, null, 2, null);
                mapB.put(strU1, objU);
            }
            if (objU instanceof l) {
                lVarU = (l) objU;
            }
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, mVar.getData());
        return i(arrayList, lVarU);
    }

    public static /* synthetic */ List l(androidx.compose.runtime.tooling.m mVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = null;
        }
        return k(mVar, cVar);
    }

    @NotNull
    public static final s m() {
        return f42536a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.CharSequence] */
    @n
    private static final e n(androidx.compose.runtime.tooling.m mVar, l lVar) {
        l lVarT;
        m mVar2;
        s sVarE;
        ?? r10;
        String strB;
        Object key = mVar.getKey();
        String strU1 = mVar.U1();
        if (strU1 != null) {
            lVarT = t(strU1, lVar);
            mVar2 = null;
        } else {
            lVarT = null;
            mVar2 = null;
        }
        Object objW = mVar.w();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        CollectionsKt.addAll(arrayList, mVar.getData());
        Iterator<androidx.compose.runtime.tooling.m> it = mVar.i().iterator();
        while (it.hasNext()) {
            arrayList2.add(n(it.next(), lVarT));
        }
        boolean z10 = objW instanceof l0;
        List<g1> listL = z10 ? ((l0) objW).L() : CollectionsKt.emptyList();
        if (z10) {
            sVarE = e((l0) objW);
        } else if (arrayList2.isEmpty()) {
            sVarE = f42536a;
        } else {
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((e) it2.next()).a());
            }
            Iterator it3 = arrayList3.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it3.next();
            while (it3.hasNext()) {
                next = v((s) it3.next(), (s) next);
            }
            sVarE = (s) next;
        }
        m mVarI = (lVarT == null || !lVarT.g() || lVar == null) ? mVar2 : lVar.i();
        if (objW != null) {
            return new g(key, objW, sVarE, arrayList, listL, arrayList2);
        }
        Object objX1 = mVar2;
        s sVar = sVarE;
        l lVar2 = lVarT;
        Object objB = lVar2 != null ? lVar2.b() : objX1;
        if (lVar2 != null) {
            strB = lVar2.b();
        } else {
            r10 = objX1;
        }
        if (r10 != 0 && r10.length() != 0 && (sVar.j() - sVar.B() > 0 || sVar.x() - sVar.t() > 0)) {
            r10 = strB;
            r10 = strB;
            objX1 = mVar.X1();
        }
        r10 = strB;
        r10 = strB;
        r10 = strB;
        List<h> listI = i(arrayList, lVar2);
        boolean z11 = false;
        if (lVar2 != null && lVar2.h()) {
            z11 = true;
        }
        return new androidx.compose.ui.tooling.data.a(key, objB, sVar, mVarI, objX1, listI, arrayList, arrayList2, z11);
    }

    @Nullable
    public static final String o(@NotNull e eVar) {
        return q(eVar.e());
    }

    @n
    public static /* synthetic */ void p(e eVar) {
    }

    @n
    private static final String q(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof f)) {
            return null;
        }
        f fVar = (f) obj;
        String strQ = q(fVar.e());
        return strQ == null ? q(fVar.f()) : strQ;
    }

    @n
    @Nullable
    public static final <T> T r(@NotNull androidx.compose.runtime.tooling.f fVar, @NotNull pj.n<? super androidx.compose.runtime.tooling.m, ? super k, ? super List<? extends T>, ? extends T> nVar, @NotNull c cVar) {
        androidx.compose.runtime.tooling.m mVar = (androidx.compose.runtime.tooling.m) CollectionsKt.firstOrNull(fVar.i());
        if (mVar == null) {
            return null;
        }
        androidx.compose.ui.tooling.data.b bVar = new androidx.compose.ui.tooling.data.b(nVar, cVar.b());
        ArrayList arrayList = new ArrayList();
        bVar.b(mVar, 0, arrayList);
        return (T) CollectionsKt.firstOrNull((List) arrayList);
    }

    public static /* synthetic */ Object s(androidx.compose.runtime.tooling.f fVar, pj.n nVar, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = new c();
        }
        return r(fVar, nVar, cVar);
    }

    private static final l t(String str, l lVar) {
        String str2;
        int i10;
        c0 c0VarE = d0.e(str);
        Integer numValueOf = null;
        if (c0VarE == null) {
            return null;
        }
        String strA = c0VarE.a();
        String strF = c0VarE.f();
        if (strF != null) {
            str2 = strF;
        } else if (lVar != null) {
            strF = lVar.f();
            str2 = strF;
        } else {
            str2 = null;
        }
        if (c0VarE.f() != null) {
            String strC = c0VarE.c();
            if (strC != null) {
                numValueOf = StringsKt.b1(strC, 36);
            }
        } else if (lVar != null) {
            numValueOf = Integer.valueOf(lVar.c());
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        List<v> listB = c0VarE.b();
        Iterator<v> it = c0VarE.b().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().d()) {
                i10 = i11;
                return new l(strA, str2, iIntValue, listB, i10, c0VarE.d(), c0VarE.g(), c0VarE.h());
            }
            i11++;
        }
        i10 = -1;
        return new l(strA, str2, iIntValue, listB, i10, c0VarE.d(), c0VarE.g(), c0VarE.h());
    }

    static /* synthetic */ l u(String str, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return t(str, lVar);
    }

    @NotNull
    public static final s v(@NotNull s sVar, @NotNull s sVar2) {
        s sVar3 = f42536a;
        if (Intrinsics.areEqual(sVar, sVar3)) {
            return sVar2;
        }
        if (Intrinsics.areEqual(sVar2, sVar3)) {
            return sVar;
        }
        return new s(Math.min(sVar.t(), sVar2.t()), Math.min(sVar.B(), sVar2.B()), Math.max(sVar.x(), sVar2.x()), Math.max(sVar.j(), sVar2.j()));
    }
}
