package com.superwall.sdk.models.events;

import com.devtodev.analytics.internal.storage.sqlite.ExperimentsEntry;
import com.superwall.sdk.models.serialization.AnySerializer;
import com.superwall.sdk.models.serialization.DateSerializer;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class EventData {

    @NotNull
    private final Date createdAt;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267443id;

    @NotNull
    private final String name;

    @NotNull
    private final Map<String, Object> parameters;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, new e1(b3.f315897a, AnySerializer.INSTANCE), null};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<EventData> serializer() {
            return EventData$$serializer.INSTANCE;
        }

        @NotNull
        public final EventData stub() {
            return new EventData((String) null, "opened_application", MapsKt.emptyMap(), new Date(), 1, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ EventData(int i10, String str, String str2, Map map, Date date, v2 v2Var) {
        if (14 != (i10 & 14)) {
            g2.b(i10, 14, EventData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f267443id = UUID.randomUUID().toString();
        } else {
            this.f267443id = str;
        }
        this.name = str2;
        this.parameters = map;
        this.createdAt = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventData copy$default(EventData eventData, String str, String str2, Map map, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventData.f267443id;
        }
        if ((i10 & 2) != 0) {
            str2 = eventData.name;
        }
        if ((i10 & 4) != 0) {
            map = eventData.parameters;
        }
        if ((i10 & 8) != 0) {
            date = eventData.createdAt;
        }
        return eventData.copy(str, str2, map, date);
    }

    @b0(with = DateSerializer.class)
    @a0("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @a0("event_id")
    public static /* synthetic */ void getId$annotations() {
    }

    @a0("event_name")
    public static /* synthetic */ void getName$annotations() {
    }

    @a0(ExperimentsEntry.parameters)
    public static /* synthetic */ void getParameters$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(EventData eventData, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.areEqual(eventData.f267443id, UUID.randomUUID().toString())) {
            eVar.encodeStringElement(serialDescriptor, 0, eventData.f267443id);
        }
        eVar.encodeStringElement(serialDescriptor, 1, eventData.name);
        eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], eventData.parameters);
        eVar.encodeSerializableElement(serialDescriptor, 3, DateSerializer.INSTANCE, eventData.createdAt);
    }

    @NotNull
    public final String component1() {
        return this.f267443id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.parameters;
    }

    @NotNull
    public final Date component4() {
        return this.createdAt;
    }

    @NotNull
    public final EventData copy(@NotNull String id2, @NotNull String name, @NotNull Map<String, ? extends Object> parameters, @NotNull Date createdAt) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new EventData(id2, name, parameters, createdAt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) obj;
        return Intrinsics.areEqual(this.f267443id, eventData.f267443id) && Intrinsics.areEqual(this.name, eventData.name) && Intrinsics.areEqual(this.parameters, eventData.parameters) && Intrinsics.areEqual(this.createdAt, eventData.createdAt);
    }

    @NotNull
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getId() {
        return this.f267443id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return (((((this.f267443id.hashCode() * 31) + this.name.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.createdAt.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventData(id=" + this.f267443id + ", name=" + this.name + ", parameters=" + this.parameters + ", createdAt=" + this.createdAt + ")";
    }

    public EventData(@NotNull String id2, @NotNull String name, @NotNull Map<String, ? extends Object> parameters, @NotNull Date createdAt) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f267443id = id2;
        this.name = name;
        this.parameters = parameters;
        this.createdAt = createdAt;
    }

    public /* synthetic */ EventData(String str, String str2, Map map, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, map, date);
    }
}
