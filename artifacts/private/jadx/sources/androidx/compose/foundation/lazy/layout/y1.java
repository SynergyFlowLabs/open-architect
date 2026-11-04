package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutStickyItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n1#2:219\n366#3:220\n237#3,4:229\n242#3:240\n231#4,2:221\n35#4,5:223\n233#4:228\n360#5,7:233\n*S KotlinDebug\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n*L\n180#1:220\n189#1:229,4\n189#1:240\n186#1:221,2\n186#1:223,5\n186#1:228\n190#1:233,7\n*E\n"})
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f17626a = false;

    @NotNull
    public static final <T extends y0> List<T> b(@Nullable z2 z2Var, int i10, int i11, @NotNull List<T> list, @NotNull androidx.collection.f0 f0Var, int i12, int i13, int i14, int i15, @NotNull Function1<? super Integer, ? extends T> function1) {
        z2 z2Var2 = z2Var;
        if (z2Var2 == null || list.isEmpty() || f0Var.f12216b == 0) {
            return CollectionsKt.emptyList();
        }
        androidx.collection.f0 f0VarB = z2Var2.b(i10, i11, f0Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            T t10 = list.get(i16);
            if (f0Var.g(t10.getIndex())) {
                arrayList2.add(t10);
            }
        }
        int[] iArr = f0VarB.f12215a;
        int i17 = f0VarB.f12216b;
        int i18 = 0;
        while (i18 < i17) {
            int i19 = iArr[i18];
            Iterator<T> it = list.iterator();
            int i20 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i20 = -1;
                    break;
                }
                if (it.next().getIndex() == i19) {
                    break;
                }
                i20++;
            }
            T tInvoke = i20 == -1 ? function1.invoke(Integer.valueOf(i19)) : list.remove(i20);
            ArrayList arrayList3 = arrayList2;
            T t11 = tInvoke;
            int iA = z2Var2.a(arrayList3, i19, tInvoke.m(), i20 == -1 ? Integer.MIN_VALUE : d(tInvoke), i12, i13, i14, i15);
            t11.d(true);
            t11.k(iA, 0, i14, i15);
            arrayList.add(t11);
            i18++;
            z2Var2 = z2Var;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    private static final void c(Function0<String> function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(y0 y0Var) {
        long jO = y0Var.o(0);
        return y0Var.j() ? androidx.compose.ui.unit.q.p(jO) : androidx.compose.ui.unit.q.n(jO);
    }
}
