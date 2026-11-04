package androidx.compose.ui.util;

import androidx.collection.l2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.a0;
import kotlin.a1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,622:1\n35#1,5:623\n35#1,5:628\n35#1,5:633\n35#1,5:638\n35#1,5:643\n35#1,5:648\n35#1,5:653\n35#1,5:658\n35#1,5:663\n71#1,5:668\n71#1,3:673\n75#1:677\n35#1,5:678\n35#1,5:683\n35#1,5:688\n35#1,5:693\n35#1,5:698\n1#2:676\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n88#1:623,5\n103#1:628,5\n118#1:633,5\n135#1:638,5\n152#1:643,5\n198#1:648,5\n232#1:653,5\n252#1:658,5\n271#1:663,5\n288#1:668,5\n305#1:673,3\n305#1:677\n441#1:678,5\n485#1:683,5\n531#1:688,5\n547#1:693,5\n564#1:698,5\n*E\n"})
public final class d {
    @Nullable
    public static final <T, R extends Comparable<? super R>> R A(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        R rInvoke = function1.invoke(list.get(0));
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = function1.invoke(list.get(i10));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> T B(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t10 = list.get(0);
        R rInvoke = function1.invoke(t10);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i10 = 1;
        int i11 = 3 ^ 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = list.get(i10);
                R rInvoke2 = function1.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return (T) t10;
    }

    public static final <S, T extends S> S C(@NotNull List<? extends T> list, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        if (list.isEmpty()) {
            H("Empty collection can't be reduced.");
        }
        S sInvoke = (Object) CollectionsKt.first((List) list);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = function2.invoke(sInvoke, list.get(i10));
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    public static final <T> int D(@NotNull List<? extends T> list, @NotNull Function1<? super T, Integer> function1) {
        int size = list.size();
        int iIntValue = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iIntValue += function1.invoke(list.get(i10)).intValue();
        }
        return iIntValue;
    }

    @NotNull
    public static final <T, R, V> List<V> E(@NotNull List<? extends T> list, @NotNull List<? extends R> list2, @NotNull Function2<? super T, ? super R, ? extends V> function2) {
        int iMin = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(function2.invoke(list.get(i10), list2.get(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> F(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() <= 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        a0.c cVar = list.get(0);
        int lastIndex = CollectionsKt.getLastIndex(list);
        while (i10 < lastIndex) {
            i10++;
            T t10 = list.get(i10);
            arrayList.add(function2.invoke(cVar, t10));
            cVar = t10;
        }
        return arrayList;
    }

    @a1
    @NotNull
    public static final Void G(@NotNull String str) {
        throw new NoSuchElementException(str);
    }

    @a1
    public static final void H(@NotNull String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void a(Appendable appendable, T t10, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        if (function1 != null) {
            appendable.append(function1.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(t10.toString());
        }
    }

    public static final <T> boolean b(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!function1.invoke(list.get(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean c(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (function1.invoke(list.get(i10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T, K> List<T> d(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends K> function1) {
        l2 l2Var = new l2(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (l2Var.C(function1.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> e(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (function1.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> f(@NotNull List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> g(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1, @NotNull Function1<? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (function1.invoke(t10).booleanValue()) {
                arrayList.add(function2.invoke(t10));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T h(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (function1.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        G("Collection contains no element matching the predicate.");
        throw new a0();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T i(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (function1.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @NotNull
    public static final <T, R> List<R> j(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends Iterable<? extends R>> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            CollectionsKt.addAll(arrayList, function1.invoke(list.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> R k(@NotNull List<? extends T> list, R r10, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = function2.invoke(r10, list.get(i10));
        }
        return r10;
    }

    public static final <T> void l(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function1.invoke(list.get(i10));
        }
    }

    public static final <T> void m(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        int size = list.size();
        int i10 = 7 << 0;
        for (int i11 = 0; i11 < size; i11++) {
            function2.invoke(Integer.valueOf(i11), list.get(i11));
        }
    }

    public static final <T> void n(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i10 = size - 1;
            function1.invoke(list.get(size));
            if (i10 < 0) {
                return;
            } else {
                size = i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A o(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        a10.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a(a10, t10, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @NotNull
    public static final <T> String q(@NotNull List<? extends T> list, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        return ((StringBuilder) o(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String r(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return q(list, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T s(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                T t10 = list.get(size);
                if (function1.invoke(t10).booleanValue()) {
                    return t10;
                }
                if (i10 >= 0) {
                    size = i10;
                }
            }
        }
        return null;
    }

    @NotNull
    public static final <T, R> List<R> t(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(function1.invoke(list.get(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> u(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i10 = 7 & 0;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(function2.invoke(Integer.valueOf(i11), list.get(i11)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> v(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = function2.invoke(Integer.valueOf(i10), list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> w(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = function1.invoke(list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C x(@NotNull List<? extends T> list, @NotNull C c10, @NotNull Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c10.add(function1.invoke(list.get(i10)));
        }
        return c10;
    }

    @Nullable
    public static final <T, R extends Comparable<? super R>> T y(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t10 = list.get(0);
        R rInvoke = function1.invoke(t10);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = list.get(i10);
                R rInvoke2 = function1.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return (T) t10;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> R z(@NotNull List<? extends T> list, @NotNull R r10, @NotNull Function1<? super T, ? extends R> function1) {
        if (list.isEmpty()) {
            return r10;
        }
        R rInvoke = function1.invoke(list.get(0));
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = function1.invoke(list.get(i10));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }
}
