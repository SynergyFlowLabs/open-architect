package androidx.room.util;

import androidx.annotation.b1;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@oj.i(name = "RelationUtil")
public final class e {
    public static final <K, V> void a(@NotNull androidx.collection.a<K, V> map, boolean z10, @NotNull Function1<? super androidx.collection.a<K, V>, Unit> fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        androidx.collection.a aVar = new androidx.collection.a(999);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                aVar.put(map.g(i10), map.k(i10));
            } else {
                aVar.put(map.g(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(aVar);
                if (!z10) {
                    map.putAll(aVar);
                }
                aVar.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(aVar);
            if (z10) {
                return;
            }
            map.putAll(aVar);
        }
    }

    public static final <K, V> void b(@NotNull HashMap<K, V> map, boolean z10, @NotNull Function1<? super HashMap<K, V>, Unit> fetchBlock) {
        int i10;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        Iterator<K> it = map.keySet().iterator();
        loop0: while (true) {
            i10 = 0;
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                K key = it.next();
                if (z10) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, map.get(key));
                } else {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, null);
                }
                i10++;
            } while (i10 != 999);
            fetchBlock.invoke(map2);
            if (!z10) {
                map.putAll(map2);
            }
            map2.clear();
        }
        if (i10 > 0) {
            fetchBlock.invoke(map2);
            if (z10) {
                return;
            }
            map.putAll(map2);
        }
    }

    public static final <V> void c(@NotNull androidx.collection.b1<V> map, boolean z10, @NotNull Function1<? super androidx.collection.b1<V>, Unit> fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        androidx.collection.b1<? extends V> b1Var = new androidx.collection.b1<>(999);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                b1Var.n(map.l(i10), map.w(i10));
            } else {
                b1Var.n(map.l(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(b1Var);
                if (!z10) {
                    map.o(b1Var);
                }
                b1Var.b();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(b1Var);
            if (!z10) {
                map.o(b1Var);
            }
        }
    }
}
