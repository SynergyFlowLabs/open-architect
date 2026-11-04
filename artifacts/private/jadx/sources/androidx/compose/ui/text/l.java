package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1616:1\n35#2,5:1617\n35#2,5:1622\n35#2,5:1628\n251#2,2:1633\n35#2,3:1635\n39#2:1658\n253#2:1659\n231#2,2:1660\n35#2,5:1662\n233#2:1667\n251#2,2:1668\n35#2,5:1670\n253#2:1675\n151#2,2:1676\n35#2,5:1678\n153#2:1683\n251#2,2:1688\n35#2,5:1690\n253#2:1695\n1053#3:1627\n101#4,10:1638\n101#4,10:1648\n118#5,4:1684\n1#6:1696\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1065#1:1617,5\n1066#1:1622,5\n1108#1:1628,5\n1218#1:1633,2\n1218#1:1635,3\n1218#1:1658\n1218#1:1659\n1244#1:1660,2\n1244#1:1662,5\n1244#1:1667\n1247#1:1668,2\n1247#1:1670,5\n1247#1:1675\n1280#1:1676,2\n1280#1:1678,5\n1280#1:1683\n1530#1:1688,2\n1530#1:1690,5\n1530#1:1695\n1101#1:1627\n1221#1:1638,10\n1222#1:1648,10\n1524#1:1684,4\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final f f41986a = new f("", null, 2, 0 == true ? 1 : 0);

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,102:1\n1101#2:103\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(Integer.valueOf(((f.e) t10).i()), Integer.valueOf(((f.e) t11).i()));
        }
    }

    @NotNull
    public static final <T> List<T> A(@NotNull f fVar, @NotNull t0 t0Var, @NotNull Function2<? super f, ? super f.e<t0>, ? extends T> function2) {
        List<f.e<t0>> listB = B(fVar, t0Var);
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            f.e<t0> eVar = listB.get(i10);
            arrayList.add(function2.invoke(C(fVar, eVar.i(), eVar.g()), eVar));
        }
        return arrayList;
    }

    @NotNull
    public static final List<f.e<t0>> B(@NotNull f fVar, @NotNull t0 t0Var) {
        List listEmptyList;
        List<f.e<t0>> listH = fVar.h();
        if (listH == null || (listEmptyList = CollectionsKt.sortedWith(listH, new a())) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = listEmptyList.size();
        int iG = 0;
        for (int i10 = 0; i10 < size; i10++) {
            f.e eVar = (f.e) listEmptyList.get(i10);
            f.e eVarF = f.e.f(eVar, t0Var.B((t0) eVar.h()), 0, 0, null, 14, null);
            while (iG < eVarF.i() && !arrayDeque.isEmpty()) {
                f.e eVar2 = (f.e) arrayDeque.last();
                if (eVarF.i() < eVar2.g()) {
                    arrayList.add(new f.e(eVar2.h(), iG, eVarF.i()));
                    iG = eVarF.i();
                } else {
                    arrayList.add(new f.e(eVar2.h(), iG, eVar2.g()));
                    iG = eVar2.g();
                    while (!arrayDeque.isEmpty() && iG == ((f.e) arrayDeque.last()).g()) {
                        arrayDeque.removeLast();
                    }
                }
            }
            if (iG < eVarF.i()) {
                arrayList.add(new f.e(t0Var, iG, eVarF.i()));
                iG = eVarF.i();
            }
            f.e eVar3 = (f.e) arrayDeque.lastOrNull();
            if (eVar3 == null) {
                arrayDeque.add(new f.e(eVarF.h(), eVarF.i(), eVarF.g()));
            } else if (eVar3.i() == eVarF.i() && eVar3.g() == eVarF.g()) {
                arrayDeque.removeLast();
                arrayDeque.add(new f.e(((t0) eVar3.h()).B((t0) eVarF.h()), eVarF.i(), eVarF.g()));
            } else if (eVar3.i() == eVar3.g()) {
                arrayList.add(new f.e(eVar3.h(), eVar3.i(), eVar3.g()));
                arrayDeque.removeLast();
                arrayDeque.add(new f.e(eVarF.h(), eVarF.i(), eVarF.g()));
            } else {
                if (eVar3.g() < eVarF.g()) {
                    throw new IllegalArgumentException();
                }
                arrayDeque.add(new f.e(((t0) eVar3.h()).B((t0) eVarF.h()), eVarF.i(), eVarF.g()));
            }
        }
        while (iG <= fVar.m().length() && !arrayDeque.isEmpty()) {
            f.e eVar4 = (f.e) arrayDeque.last();
            arrayList.add(new f.e(eVar4.h(), iG, eVar4.g()));
            iG = eVar4.g();
            while (!arrayDeque.isEmpty() && iG == ((f.e) arrayDeque.last()).g()) {
                arrayDeque.removeLast();
            }
        }
        if (iG < fVar.m().length()) {
            arrayList.add(new f.e(t0Var, iG, fVar.m().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new f.e(t0Var, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f C(f fVar, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = fVar.m().substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List<f.e<? extends f.a>> listW = w(fVar, i10, i11, new Function1() { // from class: androidx.compose.ui.text.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(l.D((f.a) obj));
            }
        });
        if (listW == null) {
            listW = CollectionsKt.emptyList();
        }
        return new f(strSubstring, listW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(f.a aVar) {
        return !(aVar instanceof t0);
    }

    @NotNull
    public static final f E(@NotNull f fVar, @NotNull final y0.f fVar2) {
        return z.c(fVar, new pj.n() { // from class: androidx.compose.ui.text.k
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return l.G(fVar2, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ f F(f fVar, y0.f fVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar2 = y0.f.f390674c.a();
        }
        return E(fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String G(y0.f fVar, String str, int i10, int i11) {
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return h3.f(strSubstring, fVar);
    }

    @NotNull
    public static final f H(@NotNull f fVar, @NotNull final y0.f fVar2) {
        return z.c(fVar, new pj.n() { // from class: androidx.compose.ui.text.i
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return l.J(fVar2, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ f I(f fVar, y0.f fVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar2 = y0.f.f390674c.a();
        }
        return H(fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J(y0.f fVar, String str, int i10, int i11) {
        String strSubstring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return h3.h(strSubstring, fVar);
    }

    @NotNull
    public static final <R> R K(@NotNull f.b bVar, @NotNull a4 a4Var, @NotNull Function1<? super f.b, ? extends R> function1) {
        int iA = bVar.A(a4Var);
        try {
            R rInvoke = function1.invoke(bVar);
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iA);
            return rInvoke;
        } finally {
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iA);
            kotlin.jvm.internal.h0.c(1);
        }
    }

    @v
    @kotlin.l(message = "Use LinkAnnotation API for links instead", replaceWith = @kotlin.b1(expression = "withLink(, block)", imports = {}))
    @NotNull
    public static final <R> R L(@NotNull f.b bVar, @NotNull b4 b4Var, @NotNull Function1<? super f.b, ? extends R> function1) {
        int iB = bVar.B(b4Var);
        try {
            R rInvoke = function1.invoke(bVar);
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iB);
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iB);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    @NotNull
    public static final <R> R M(@NotNull f.b bVar, @NotNull String str, @NotNull String str2, @NotNull Function1<? super f.b, ? extends R> function1) {
        int iX = bVar.x(str, str2);
        try {
            R rInvoke = function1.invoke(bVar);
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iX);
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iX);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    @NotNull
    public static final <R> R N(@NotNull f.b bVar, @NotNull b0 b0Var, @NotNull Function1<? super f.b, ? extends R> function1) {
        int iW = bVar.w(b0Var);
        try {
            R rInvoke = function1.invoke(bVar);
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iW);
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iW);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    @NotNull
    public static final <R> R O(@NotNull f.b bVar, @NotNull t0 t0Var, @NotNull Function1<? super f.b, ? extends R> function1) {
        int iY = bVar.y(t0Var);
        try {
            R rInvoke = function1.invoke(bVar);
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iY);
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iY);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    @NotNull
    public static final <R> R P(@NotNull f.b bVar, @NotNull c3 c3Var, @NotNull Function1<? super f.b, ? extends R> function1) {
        int iZ = bVar.z(c3Var);
        try {
            R rInvoke = function1.invoke(bVar);
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iZ);
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            bVar.u(iZ);
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    @NotNull
    public static final f f(@NotNull String str, @NotNull t0 t0Var) {
        return new f(str, CollectionsKt.emptyList(), CollectionsKt.listOf(new f.e(t0Var, 0, str.length())));
    }

    @NotNull
    public static final f g(@NotNull String str, @NotNull c3 c3Var, @Nullable t0 t0Var) {
        return new f(str, CollectionsKt.listOf(new f.e(c3Var, 0, str.length())), t0Var == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(new f.e(t0Var, 0, str.length())));
    }

    public static /* synthetic */ f h(String str, c3 c3Var, t0 t0Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            t0Var = null;
        }
        return g(str, c3Var, t0Var);
    }

    @NotNull
    public static final f l(@NotNull Function1<? super f.b, Unit> function1) {
        f.b bVar = new f.b(0, 1, null);
        function1.invoke(bVar);
        return bVar.C();
    }

    @NotNull
    public static final f m(@NotNull f fVar, @NotNull final y0.f fVar2) {
        return z.c(fVar, new pj.n() { // from class: androidx.compose.ui.text.h
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return l.o(fVar2, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ f n(f fVar, y0.f fVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar2 = y0.f.f390674c.a();
        }
        return m(fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(y0.f fVar, String str, int i10, int i11) {
        if (i10 == 0) {
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return h3.b(strSubstring, fVar);
        }
        String strSubstring2 = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<f.e<? extends f.a>> p(List<f.e<c3>> list, List<f.e<t0>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10));
        }
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList.add(list2.get(i11));
        }
        return arrayList;
    }

    public static final boolean q(int i10, int i11, int i12, int i13) {
        if (i10 <= i12 && i13 <= i11) {
            if (i11 == i13) {
                if ((i12 == i13) == (i10 == i11)) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public static final f r(@NotNull f fVar, @NotNull final y0.f fVar2) {
        return z.c(fVar, new pj.n() { // from class: androidx.compose.ui.text.g
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return l.t(fVar2, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ f s(f fVar, y0.f fVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar2 = y0.f.f390674c.a();
        }
        return r(fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(y0.f fVar, String str, int i10, int i11) {
        if (i10 == 0) {
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return h3.d(strSubstring, fVar);
        }
        String strSubstring2 = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    @NotNull
    public static final f u() {
        return f41986a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<f.e<T>> v(List<? extends f.e<? extends T>> list, int i10, int i11) {
        if (!(i10 <= i11)) {
            x0.a.e("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            f.e<? extends T> eVar = list.get(i12);
            if (z(i10, i11, eVar.i(), eVar.g())) {
                arrayList.add(new f.e(eVar.h(), Math.max(i10, eVar.i()) - i10, Math.min(i11, eVar.g()) - i10, eVar.j()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List<f.e<? extends f.a>> w(f fVar, int i10, int i11, Function1<? super f.a, Boolean> function1) {
        List<f.e<? extends f.a>> listD;
        if (i10 == i11 || (listD = fVar.d()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= fVar.m().length()) {
            if (function1 == null) {
                return listD;
            }
            ArrayList arrayList = new ArrayList(listD.size());
            int size = listD.size();
            for (int i12 = 0; i12 < size; i12++) {
                f.e<? extends f.a> eVar = listD.get(i12);
                if (function1.invoke(eVar.h()).booleanValue()) {
                    arrayList.add(eVar);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(listD.size());
        int size2 = listD.size();
        for (int i13 = 0; i13 < size2; i13++) {
            f.e<? extends f.a> eVar2 = listD.get(i13);
            boolean z10 = true;
            if (!(function1 != null ? function1.invoke(eVar2.h()).booleanValue() : true) || !z(i10, i11, eVar2.i(), eVar2.g())) {
                z10 = false;
            }
            if (z10) {
                arrayList2.add(new f.e(eVar2.h(), kotlin.ranges.r.I(eVar2.i(), i10, i11) - i10, kotlin.ranges.r.I(eVar2.g(), i10, i11) - i10, eVar2.j()));
            }
        }
        return arrayList2;
    }

    static /* synthetic */ List x(f fVar, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        return w(fVar, i10, i11, function1);
    }

    private static final List<f.e<t0>> y(f fVar, int i10, int i11) {
        List<f.e<t0>> listH;
        if (i10 != i11 && (listH = fVar.h()) != null) {
            if (i10 == 0 && i11 >= fVar.m().length()) {
                return listH;
            }
            ArrayList arrayList = new ArrayList(listH.size());
            int size = listH.size();
            for (int i12 = 0; i12 < size; i12++) {
                f.e<t0> eVar = listH.get(i12);
                if (z(i10, i11, eVar.i(), eVar.g())) {
                    t0 t0VarH = eVar.h();
                    int i13 = eVar.i();
                    if (i13 < i10) {
                        i13 = i10;
                    }
                    if (i13 > i11) {
                        i13 = i11;
                    }
                    int i14 = i13 - i10;
                    int iG = eVar.g();
                    if (iG < i10) {
                        iG = i10;
                    }
                    if (iG > i11) {
                        iG = i11;
                    }
                    arrayList.add(new f.e(t0VarH, i14, iG - i10));
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final boolean z(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }
}
