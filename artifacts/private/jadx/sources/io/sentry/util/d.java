package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class d {

    public interface a<T, R> {
        R a(T t10);
    }

    public interface b<T> {
        boolean test(T t10);
    }

    private d() {
    }

    public static <T> boolean a(@NotNull T[] tArr, @NotNull T t10) {
        for (T t11 : tArr) {
            if (t10.equals(t11)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static <T> List<T> b(@NotNull List<T> list, @NotNull b<T> bVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (T t10 : list) {
            if (bVar.test(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static <K, V> Map<K, V> c(@NotNull Map<K, V> map, @NotNull b<Map.Entry<K, V>> bVar) {
        HashMap map2 = new HashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (bVar.test(entry)) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    @NotNull
    public static <T, R> List<R> d(@NotNull List<T> list, @NotNull a<T, R> aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a(it.next()));
        }
        return arrayList;
    }

    @Nullable
    public static <T> List<T> e(@Nullable List<T> list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    @Nullable
    public static <K, V> Map<K, V> f(@Nullable Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    @Nullable
    public static <K, V> Map<K, V> g(@Nullable Map<K, V> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    @NotNull
    public static <T> ListIterator<T> h(@NotNull CopyOnWriteArrayList<T> copyOnWriteArrayList) {
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(copyOnWriteArrayList);
        return copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
    }

    public static int i(@NotNull Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<?> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
        }
        return i10;
    }
}
