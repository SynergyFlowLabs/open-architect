package androidx.compose.ui.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,237:1\n1#2:238\n11165#3:239\n11500#3,3:240\n37#4,2:243\n37#4,2:253\n37#4,2:255\n151#5,2:245\n35#5,5:247\n153#5:252\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n*L\n200#1:239\n200#1:240,3\n200#1:243,2\n223#1:253,2\n235#1:255,2\n223#1:245,2\n223#1:247,5\n223#1:252\n*E\n"})
public final class k {
    @NotNull
    public static final i a() {
        return b.f39616b;
    }

    @NotNull
    public static final <T> i b(@NotNull c<T> cVar) {
        return new q(cVar);
    }

    @NotNull
    public static final i c(@NotNull c<?> cVar, @NotNull c<?> cVar2, @NotNull c<?>... cVarArr) {
        Pair pair = TuplesKt.to(cVar, null);
        p1 p1Var = new p1(2);
        p1Var.a(TuplesKt.to(cVar2, null));
        ArrayList arrayList = new ArrayList(cVarArr.length);
        int i10 = 5 & 0;
        for (c<?> cVar3 : cVarArr) {
            arrayList.add(TuplesKt.to(cVar3, null));
        }
        p1Var.b(arrayList.toArray(new Pair[0]));
        return new o(pair, (Pair[]) p1Var.d(new Pair[p1Var.c()]));
    }

    @NotNull
    public static final <T> i d(@NotNull Pair<? extends c<T>, ? extends T> pair) {
        q qVar = new q(pair.getFirst());
        qVar.c(pair.getFirst(), pair.getSecond());
        return qVar;
    }

    @NotNull
    public static final i e(@NotNull Pair<? extends c<?>, ? extends Object> pair, @NotNull Pair<? extends c<?>, ? extends Object> pair2, @NotNull Pair<? extends c<?>, ? extends Object>... pairArr) {
        p1 p1Var = new p1(2);
        p1Var.a(pair2);
        p1Var.b(pairArr);
        return new o(pair, (Pair[]) p1Var.d(new Pair[p1Var.c()]));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ i f(c... cVarArr) {
        int length = cVarArr.length;
        if (length == 0) {
            return b.f39616b;
        }
        if (length == 1) {
            return new q((c) ArraysKt.first(cVarArr));
        }
        Pair pair = TuplesKt.to(ArraysKt.first(cVarArr), null);
        List listDrop = ArraysKt.drop(cVarArr, 1);
        ArrayList arrayList = new ArrayList(listDrop.size());
        int size = listDrop.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(TuplesKt.to((c) listDrop.get(i10), null));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return new o(pair, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ i g(Pair... pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return b.f39616b;
        }
        if (length == 1) {
            return new o((Pair) ArraysKt.first(pairArr), new Pair[0]);
        }
        Pair pair = (Pair) ArraysKt.first(pairArr);
        Pair[] pairArr2 = (Pair[]) ArraysKt.drop(pairArr, 1).toArray(new Pair[0]);
        return new o(pair, (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
    }
}
