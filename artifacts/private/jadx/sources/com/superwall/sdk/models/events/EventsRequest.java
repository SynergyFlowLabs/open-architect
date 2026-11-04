package com.superwall.sdk.models.events;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class EventsRequest {

    @NotNull
    private final List<EventData> events;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(EventData$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<EventsRequest> serializer() {
            return EventsRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = 1 << 0;
    }

    public /* synthetic */ EventsRequest(int i10, List list, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, EventsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.events = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventsRequest copy$default(EventsRequest eventsRequest, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = eventsRequest.events;
        }
        return eventsRequest.copy(list);
    }

    @NotNull
    public final List<EventData> component1() {
        return this.events;
    }

    @NotNull
    public final EventsRequest copy(@NotNull List<EventData> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new EventsRequest(events);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventsRequest) && Intrinsics.areEqual(this.events, ((EventsRequest) obj).events);
    }

    @NotNull
    public final List<EventData> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventsRequest(events=" + this.events + ")";
    }

    public EventsRequest(@NotNull List<EventData> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.events = events;
    }
}
