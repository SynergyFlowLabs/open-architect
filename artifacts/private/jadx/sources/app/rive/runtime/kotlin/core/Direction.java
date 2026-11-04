package app.rive.runtime.kotlin.core;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDirection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Direction.kt\napp/rive/runtime/kotlin/core/Direction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,12:1\n1202#2,2:13\n1230#2,4:15\n*S KotlinDebug\n*F\n+ 1 Direction.kt\napp/rive/runtime/kotlin/core/Direction\n*L\n9#1:13,2\n9#1:15,4\n*E\n"})
public enum Direction {
    BACKWARDS(-1),
    FORWARDS(1),
    AUTO(0);


    @NotNull
    private static final Map<Integer, Direction> map;
    private final int value;
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Direction fromInt(int i10) {
            return (Direction) Direction.map.get(Integer.valueOf(i10));
        }

        private Companion() {
        }
    }

    static {
        kotlin.enums.a<Direction> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (Direction direction : entries) {
            linkedHashMap.put(Integer.valueOf(direction.value), direction);
        }
        map = linkedHashMap;
    }

    Direction(int i10) {
        this.value = i10;
    }

    @NotNull
    public static kotlin.enums.a<Direction> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
