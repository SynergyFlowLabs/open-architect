package com.segment.analytics.kotlin.core;

import java.util.List;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@a0("track")
public final class TrackEvent extends BaseEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private JsonObject f266702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f266703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private EventType f266704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f266705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f266706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JsonObject f266707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JsonObject f266708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private String f266709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private DestinationMetadata f266710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f266711l;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<TrackEvent> serializer() {
            return TrackEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
    public /* synthetic */ TrackEvent(int i10, JsonObject jsonObject, String str, EventType eventType, String str2, String str3, JsonObject jsonObject2, JsonObject jsonObject3, String str4, DestinationMetadata destinationMetadata, String str5, v2 v2Var) {
        super(null);
        if (635 != (i10 & 635)) {
            g2.b(i10, 635, TrackEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.f266702c = jsonObject;
        this.f266703d = str;
        if ((i10 & 4) == 0) {
            this.f266704e = EventType.Track;
        } else {
            this.f266704e = eventType;
        }
        this.f266705f = str2;
        this.f266706g = str3;
        this.f266707h = jsonObject2;
        this.f266708i = jsonObject3;
        if ((i10 & 128) == 0) {
            this.f266709j = "";
        } else {
            this.f266709j = str4;
        }
        if ((i10 & 256) == 0) {
            this.f266710k = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.f266710k = destinationMetadata;
        }
        this.f266711l = str5;
    }

    @oj.n
    public static final void D(@NotNull TrackEvent self, @NotNull kotlinx.serialization.encoding.e output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, jsonObjectSerializer, self.f266702c);
        output.encodeStringElement(serialDesc, 1, self.f266703d);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.j() != EventType.Track) {
            output.encodeSerializableElement(serialDesc, 2, EventType.Companion.serializer(), self.j());
        }
        output.encodeStringElement(serialDesc, 3, self.h());
        output.encodeStringElement(serialDesc, 4, self.d());
        output.encodeSerializableElement(serialDesc, 5, jsonObjectSerializer, self.g());
        output.encodeSerializableElement(serialDesc, 6, jsonObjectSerializer, self.e());
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.k(), "")) {
            output.encodeStringElement(serialDesc, 7, self.k());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !Intrinsics.areEqual(self.l(), new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 8, DestinationMetadata$$serializer.INSTANCE, self.l());
        }
        output.encodeStringElement(serialDesc, 9, self.i());
    }

    public static /* synthetic */ TrackEvent y(TrackEvent trackEvent, JsonObject jsonObject, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jsonObject = trackEvent.f266702c;
        }
        if ((i10 & 2) != 0) {
            str = trackEvent.f266703d;
        }
        return trackEvent.x(jsonObject, str);
    }

    @NotNull
    public final JsonObject A() {
        return this.f266702c;
    }

    public final void B(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266703d = str;
    }

    public final void C(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266702c = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String d() {
        String str = this.f266706g;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("anonymousId");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject e() {
        JsonObject jsonObject = this.f266708i;
        if (jsonObject != null) {
            return jsonObject;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(TrackEvent.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.TrackEvent");
        TrackEvent trackEvent = (TrackEvent) obj;
        return Intrinsics.areEqual(this.f266702c, trackEvent.f266702c) && Intrinsics.areEqual(this.f266703d, trackEvent.f266703d);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject g() {
        JsonObject jsonObject = this.f266707h;
        if (jsonObject != null) {
            return jsonObject;
        }
        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.protocol.p.b.f306434d);
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String h() {
        String str = this.f266705f;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageId");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public int hashCode() {
        return (((super.hashCode() * 31) + this.f266702c.hashCode()) * 31) + this.f266703d.hashCode();
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String i() {
        String str = this.f266711l;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timestamp");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public EventType j() {
        return this.f266704e;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String k() {
        return this.f266709j;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public DestinationMetadata l() {
        return this.f266710k;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266706g = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void n(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266708i = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void p(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266707h = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266705f = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266711l = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void s(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "<set-?>");
        this.f266704e = eventType;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void t(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266709j = str;
    }

    @NotNull
    public String toString() {
        return "TrackEvent(properties=" + this.f266702c + ", event=" + this.f266703d + ')';
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void u(@NotNull DestinationMetadata destinationMetadata) {
        Intrinsics.checkNotNullParameter(destinationMetadata, "<set-?>");
        this.f266710k = destinationMetadata;
    }

    @NotNull
    public final JsonObject v() {
        return this.f266702c;
    }

    @NotNull
    public final String w() {
        return this.f266703d;
    }

    @NotNull
    public final TrackEvent x(@NotNull JsonObject properties, @NotNull String event) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(event, "event");
        return new TrackEvent(properties, event);
    }

    @NotNull
    public final String z() {
        return this.f266703d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackEvent(@NotNull JsonObject properties, @NotNull String event) {
        super(null);
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f266702c = properties;
        this.f266703d = event;
        this.f266704e = EventType.Track;
        this.f266709j = "";
        this.f266710k = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }
}
