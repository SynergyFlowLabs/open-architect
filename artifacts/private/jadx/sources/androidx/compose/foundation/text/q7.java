package androidx.compose.foundation.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,749:1\n231#2,2:750\n35#2,5:752\n233#2:757\n304#2,2:758\n71#2,3:760\n75#2:769\n306#2:770\n231#2,2:771\n35#2,5:773\n233#2:778\n35#2,5:779\n35#2,5:784\n57#3:763\n62#3:764\n26#4:765\n32#5:766\n80#6:767\n1#7:768\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n*L\n490#1:750,2\n490#1:752,5\n490#1:757\n492#1:758,2\n492#1:760,3\n492#1:769\n492#1:770\n509#1:771,2\n509#1:773,5\n509#1:778\n518#1:779,5\n520#1:784,5\n499#1:763\n500#1:764\n503#1:765\n503#1:766\n503#1:767\n492#1:768\n*E\n"})
final class q7 implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f20783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<List<n0.j>> f20784b;

    /* JADX WARN: Multi-variable type inference failed */
    public q7(@NotNull Function0<Boolean> function0, @NotNull Function0<? extends List<n0.j>> function1) {
        this.f20783a = function0;
        this.f20784b = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(List list, List list2, androidx.compose.ui.layout.i2.a aVar) {
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Pair pair = (Pair) list.get(i10);
                androidx.compose.ui.layout.i2.a.V(aVar, (androidx.compose.ui.layout.i2) pair.component1(), ((androidx.compose.ui.unit.q) pair.component2()).x(), 0.0f, 2, null);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Pair pair2 = (Pair) list2.get(i11);
                androidx.compose.ui.layout.i2 i2Var = (androidx.compose.ui.layout.i2) pair2.component1();
                Function0 function0 = (Function0) pair2.component2();
                androidx.compose.ui.layout.i2.a.V(aVar, i2Var, function0 != null ? ((androidx.compose.ui.unit.q) function0.invoke()).x() : androidx.compose.ui.unit.q.f42709b.b(), 0.0f, 2, null);
            }
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        final ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends androidx.compose.ui.layout.z0> list2 = list;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.z0 z0Var = list.get(i10);
            if (!(z0Var.c() instanceof u7)) {
                arrayList2.add(z0Var);
            }
        }
        List<n0.j> listInvoke = this.f20784b.invoke();
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i11 = 0; i11 < size2; i11++) {
                n0.j jVar = listInvoke.get(i11);
                Pair pair = jVar != null ? new Pair(((androidx.compose.ui.layout.z0) arrayList2.get(i11)).P0(androidx.compose.ui.unit.c.b(0, (int) Math.floor(jVar.x() - jVar.t()), 0, (int) Math.floor(jVar.j() - jVar.B()), 5, null)), androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) Math.round(jVar.B())) & com.rabbitmq.client.k0.f265952a) | (((long) Math.round(jVar.t())) << 32)))) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            androidx.compose.ui.layout.z0 z0Var2 = list.get(i12);
            if (z0Var2.c() instanceof u7) {
                arrayList4.add(z0Var2);
            }
        }
        final List listA0 = p1.a0(arrayList4, this.f20783a);
        return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, new Function1() { // from class: androidx.compose.foundation.text.p7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q7.g(arrayList, listA0, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }
}
