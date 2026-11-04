package coil.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\ncoil/util/-Collections\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
@oj.i(name = "-Collections")
public final class c {
    @Nullable
    public static final <R, T> T a(@NotNull List<? extends R> list, @NotNull Function1<? super R, ? extends T> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T tInvoke = function1.invoke(list.get(i10));
            if (tInvoke != null) {
                return tInvoke;
            }
        }
        return null;
    }

    public static final <T, R> R b(@NotNull List<? extends T> list, R r10, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = function2.invoke(r10, list.get(i10));
        }
        return r10;
    }

    public static final <T> void c(@NotNull List<? extends T> list, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Integer.valueOf(i10), list.get(i10));
        }
    }

    public static final <T> void d(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function1.invoke(list.get(i10));
        }
    }

    @NotNull
    public static final <K, V, R> Map<K, R> e(@NotNull Map<K, ? extends V> map, @NotNull Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            R rInvoke = function1.invoke(entry);
            if (rInvoke != null) {
                linkedHashMap.put(entry.getKey(), rInvoke);
            }
        }
        return linkedHashMap;
    }

    public static final <T> void f(@NotNull List<T> list, @NotNull Function1<? super T, Boolean> function1) {
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = i11 - i10;
            if (function1.invoke(list.get(i12)).booleanValue()) {
                list.remove(i12);
                i10++;
            }
        }
    }

    @NotNull
    public static final <T> List<T> g(@NotNull List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.first((List) list));
        }
        return CollectionsKt.emptyList();
    }

    @NotNull
    public static final <K, V> Map<K, V> h(@NotNull Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return MapsKt.emptyMap();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.first(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
