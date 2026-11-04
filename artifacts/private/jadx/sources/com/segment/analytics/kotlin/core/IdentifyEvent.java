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
@a0("identify")
public final class IdentifyEvent extends BaseEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f266671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private JsonObject f266672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private EventType f266673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f266674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f266675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JsonObject f266676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JsonObject f266677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f266678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private DestinationMetadata f266679k;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<IdentifyEvent> serializer() {
            return IdentifyEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
    public /* synthetic */ IdentifyEvent(int i10, String str, JsonObject jsonObject, EventType eventType, String str2, String str3, JsonObject jsonObject2, JsonObject jsonObject3, String str4, DestinationMetadata destinationMetadata, v2 v2Var) {
        super(null);
        if (251 != (i10 & com.planner5d.library.engine.input.f.b.U1)) {
            g2.b(i10, com.planner5d.library.engine.input.f.b.U1, IdentifyEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.f266671c = str;
        this.f266672d = jsonObject;
        if ((i10 & 4) == 0) {
            this.f266673e = EventType.Identify;
        } else {
            this.f266673e = eventType;
        }
        this.f266674f = str2;
        this.f266675g = str3;
        this.f266676h = jsonObject2;
        this.f266677i = jsonObject3;
        this.f266678j = str4;
        if ((i10 & 256) == 0) {
            this.f266679k = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.f266679k = destinationMetadata;
        }
    }

    @oj.n
    public static final void B(@NotNull IdentifyEvent self, @NotNull kotlinx.serialization.encoding.e output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.k());
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, jsonObjectSerializer, self.f266672d);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.j() != EventType.Identify) {
            output.encodeSerializableElement(serialDesc, 2, EventType.Companion.serializer(), self.j());
        }
        output.encodeStringElement(serialDesc, 3, self.h());
        output.encodeStringElement(serialDesc, 4, self.d());
        output.encodeSerializableElement(serialDesc, 5, jsonObjectSerializer, self.g());
        output.encodeSerializableElement(serialDesc, 6, jsonObjectSerializer, self.e());
        output.encodeStringElement(serialDesc, 7, self.i());
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && Intrinsics.areEqual(self.l(), new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 8, DestinationMetadata$$serializer.INSTANCE, self.l());
    }

    public static /* synthetic */ IdentifyEvent y(IdentifyEvent identifyEvent, String str, JsonObject jsonObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = identifyEvent.k();
        }
        if ((i10 & 2) != 0) {
            jsonObject = identifyEvent.f266672d;
        }
        return identifyEvent.x(str, jsonObject);
    }

    public final void A(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266672d = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String d() {
        String str = this.f266675g;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("anonymousId");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject e() {
        JsonObject jsonObject = this.f266677i;
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
        if (!Intrinsics.areEqual(IdentifyEvent.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.IdentifyEvent");
        return Intrinsics.areEqual(this.f266672d, ((IdentifyEvent) obj).f266672d);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject g() {
        JsonObject jsonObject = this.f266676h;
        if (jsonObject != null) {
            return jsonObject;
        }
        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.protocol.p.b.f306434d);
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String h() {
        String str = this.f266674f;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageId");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public int hashCode() {
        return (super.hashCode() * 31) + this.f266672d.hashCode();
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String i() {
        String str = this.f266678j;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timestamp");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public EventType j() {
        return this.f266673e;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String k() {
        return this.f266671c;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public DestinationMetadata l() {
        return this.f266679k;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266675g = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void n(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266677i = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void p(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266676h = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266674f = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266678j = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void s(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "<set-?>");
        this.f266673e = eventType;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void t(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266671c = str;
    }

    @NotNull
    public String toString() {
        return "IdentifyEvent(userId=" + k() + ", traits=" + this.f266672d + ')';
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void u(@NotNull DestinationMetadata destinationMetadata) {
        Intrinsics.checkNotNullParameter(destinationMetadata, "<set-?>");
        this.f266679k = destinationMetadata;
    }

    @NotNull
    public final String v() {
        return k();
    }

    @NotNull
    public final JsonObject w() {
        return this.f266672d;
    }

    @NotNull
    public final IdentifyEvent x(@NotNull String userId, @NotNull JsonObject traits) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        return new IdentifyEvent(userId, traits);
    }

    @NotNull
    public final JsonObject z() {
        return this.f266672d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifyEvent(@NotNull String userId, @NotNull JsonObject traits) {
        super(null);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        this.f266671c = userId;
        this.f266672d = traits;
        this.f266673e = EventType.Identify;
        int i10 = 3 ^ 0;
        this.f266679k = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }
}
