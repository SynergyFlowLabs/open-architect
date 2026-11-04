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
@SourceDebugExtension({"SMAP\nEventType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventType.kt\napp/rive/runtime/kotlin/core/EventType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,14:1\n1202#2,2:15\n1230#2,4:17\n*S KotlinDebug\n*F\n+ 1 EventType.kt\napp/rive/runtime/kotlin/core/EventType\n*L\n11#1:15,2\n11#1:17,4\n*E\n"})
public enum EventType {
    OpenURLEvent(131),
    GeneralEvent(128);


    @NotNull
    private static final Map<Short, EventType> map;
    private final short value;
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final EventType fromInt(short s10) {
            return (EventType) EventType.map.get(Short.valueOf(s10));
        }

        private Companion() {
        }
    }

    static {
        kotlin.enums.a<EventType> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (EventType eventType : entries) {
            linkedHashMap.put(Short.valueOf(eventType.value), eventType);
        }
        map = linkedHashMap;
    }

    EventType(short s10) {
        this.value = s10;
    }

    @NotNull
    public static kotlin.enums.a<EventType> getEntries() {
        return $ENTRIES;
    }

    public final short getValue() {
        return this.value;
    }
}
