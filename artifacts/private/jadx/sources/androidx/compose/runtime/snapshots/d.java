package androidx.compose.runtime.snapshots;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,227:1\n34#1,5:229\n34#1,5:234\n34#1,5:239\n34#1,5:244\n34#1,3:249\n38#1:259\n34#1,5:260\n64#1,5:265\n1#2:228\n381#3,7:252\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:229,5\n83#1:234,5\n91#1:239,5\n106#1:244,5\n115#1:249,3\n115#1:259\n205#1:260,5\n224#1:265,5\n117#1:252,7\n*E\n"})
public final class d {
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
    public static final <T> List<T> d(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, Boolean> function2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (function2.invoke(Integer.valueOf(i10), t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> void e(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function1.invoke(list.get(i10));
        }
    }

    public static final <T> void f(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(i10), list.get(i10));
        }
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> g(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends K> function1) {
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            K kInvoke = function1.invoke(t10);
            Object arrayList = map.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(kInvoke, arrayList);
            }
            ((ArrayList) arrayList).add(t10);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A h(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) throws IOException {
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
    public static final <T> String j(@NotNull List<? extends T> list, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i10, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        return ((StringBuilder) h(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String k(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
            int i12 = 6 ^ (-1);
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return j(list, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    @NotNull
    public static final <T, R> List<R> l(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(function1.invoke(list.get(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> m(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> function1) {
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
    public static final <T> Set<T> n(@NotNull List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            hashSet.add(list.get(i10));
        }
        return hashSet;
    }
}
