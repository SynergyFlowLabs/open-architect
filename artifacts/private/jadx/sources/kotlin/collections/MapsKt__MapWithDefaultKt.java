package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.a1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n350#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
class MapsKt__MapWithDefaultKt {
    @a1
    @i(name = "getOrImplicitDefaultNullable")
    public static final <K, V> V getOrImplicitDefaultNullable(@NotNull Map<K, ? extends V> map, K k10) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof MapWithDefault) {
            return (V) ((MapWithDefault) map).getOrImplicitDefault(k10);
        }
        V v10 = map.get(k10);
        if (v10 == null && !map.containsKey(k10)) {
            throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
        }
        return v10;
    }

    @NotNull
    public static final <K, V> Map<K, V> withDefault(@NotNull Map<K, ? extends V> map, @NotNull Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof MapWithDefault ? withDefault(((MapWithDefault) map).getMap(), defaultValue) : new MapWithDefaultImpl(map, defaultValue);
    }

    @i(name = "withDefaultMutable")
    @NotNull
    public static final <K, V> Map<K, V> withDefaultMutable(@NotNull Map<K, V> map, @NotNull Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map instanceof MutableMapWithDefault ? withDefaultMutable(((MutableMapWithDefault) map).getMap(), defaultValue) : new MutableMapWithDefaultImpl(map, defaultValue);
    }
}
