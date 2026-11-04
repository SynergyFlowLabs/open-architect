package com.superwall.sdk.models.events;

import com.superwall.sdk.models.SerializableEntity;
import java.util.List;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.y0;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class EventsResponse implements SerializableEntity {

    @Nullable
    private final List<Integer> invalidIndexes;

    @NotNull
    private final Status status;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new kotlinx.serialization.internal.f(y0.f316055a)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<EventsResponse> serializer() {
            return EventsResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0(with = StatusSerializer.class)
    public enum Status {
        OK,
        PARTIAL_SUCCESS;

        private static final /* synthetic */ a $ENTRIES = c.c(values());

        @NotNull
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Status> serializer() {
                return StatusSerializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @NotNull
        public static a<Status> getEntries() {
            return $ENTRIES;
        }
    }

    static {
        int i10 = 0 ^ 2;
    }

    public /* synthetic */ EventsResponse(int i10, Status status, List list, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, EventsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = status;
        if ((i10 & 2) == 0) {
            this.invalidIndexes = null;
        } else {
            this.invalidIndexes = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventsResponse copy$default(EventsResponse eventsResponse, Status status, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = eventsResponse.status;
        }
        if ((i10 & 2) != 0) {
            list = eventsResponse.invalidIndexes;
        }
        return eventsResponse.copy(status, list);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(EventsResponse eventsResponse, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeSerializableElement(serialDescriptor, 0, StatusSerializer.INSTANCE, eventsResponse.status);
        if (!eVar.shouldEncodeElementDefault(serialDescriptor, 1) && eventsResponse.invalidIndexes == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], eventsResponse.invalidIndexes);
    }

    @NotNull
    public final Status component1() {
        return this.status;
    }

    @Nullable
    public final List<Integer> component2() {
        return this.invalidIndexes;
    }

    @NotNull
    public final EventsResponse copy(@NotNull Status status, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new EventsResponse(status, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventsResponse)) {
            return false;
        }
        EventsResponse eventsResponse = (EventsResponse) obj;
        return this.status == eventsResponse.status && Intrinsics.areEqual(this.invalidIndexes, eventsResponse.invalidIndexes);
    }

    @Nullable
    public final List<Integer> getInvalidIndexes() {
        return this.invalidIndexes;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        List<Integer> list = this.invalidIndexes;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "EventsResponse(status=" + this.status + ", invalidIndexes=" + this.invalidIndexes + ")";
    }

    public EventsResponse(@NotNull Status status, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.invalidIndexes = list;
    }

    public /* synthetic */ EventsResponse(Status status, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i10 & 2) != 0 ? null : list);
    }
}
