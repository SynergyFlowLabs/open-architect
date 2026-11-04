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
@a0("alias")
public final class AliasEvent extends BaseEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f266635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f266636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private EventType f266637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f266638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f266639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JsonObject f266640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JsonObject f266641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f266642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private DestinationMetadata f266643k;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<AliasEvent> serializer() {
            return AliasEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
    public /* synthetic */ AliasEvent(int i10, String str, String str2, EventType eventType, String str3, String str4, JsonObject jsonObject, JsonObject jsonObject2, String str5, DestinationMetadata destinationMetadata, v2 v2Var) {
        super(null);
        if (251 != (i10 & com.planner5d.library.engine.input.f.b.U1)) {
            g2.b(i10, com.planner5d.library.engine.input.f.b.U1, AliasEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.f266635c = str;
        this.f266636d = str2;
        if ((i10 & 4) == 0) {
            this.f266637e = EventType.Alias;
        } else {
            this.f266637e = eventType;
        }
        this.f266638f = str3;
        this.f266639g = str4;
        this.f266640h = jsonObject;
        this.f266641i = jsonObject2;
        this.f266642j = str5;
        if ((i10 & 256) == 0) {
            this.f266643k = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.f266643k = destinationMetadata;
        }
    }

    @oj.n
    public static final void B(@NotNull AliasEvent self, @NotNull kotlinx.serialization.encoding.e output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.k());
        output.encodeStringElement(serialDesc, 1, self.f266636d);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.j() != EventType.Alias) {
            output.encodeSerializableElement(serialDesc, 2, EventType.Companion.serializer(), self.j());
        }
        output.encodeStringElement(serialDesc, 3, self.h());
        output.encodeStringElement(serialDesc, 4, self.d());
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 5, jsonObjectSerializer, self.g());
        output.encodeSerializableElement(serialDesc, 6, jsonObjectSerializer, self.e());
        output.encodeStringElement(serialDesc, 7, self.i());
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && Intrinsics.areEqual(self.l(), new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 8, DestinationMetadata$$serializer.INSTANCE, self.l());
    }

    public static /* synthetic */ AliasEvent y(AliasEvent aliasEvent, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aliasEvent.k();
        }
        if ((i10 & 2) != 0) {
            str2 = aliasEvent.f266636d;
        }
        return aliasEvent.x(str, str2);
    }

    public final void A(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266636d = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String d() {
        String str = this.f266639g;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("anonymousId");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject e() {
        JsonObject jsonObject = this.f266641i;
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
        if (!Intrinsics.areEqual(AliasEvent.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.AliasEvent");
        return Intrinsics.areEqual(this.f266636d, ((AliasEvent) obj).f266636d);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject g() {
        JsonObject jsonObject = this.f266640h;
        if (jsonObject != null) {
            return jsonObject;
        }
        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.protocol.p.b.f306434d);
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String h() {
        String str = this.f266638f;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageId");
        int i10 = 5 << 0;
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public int hashCode() {
        return (super.hashCode() * 31) + this.f266636d.hashCode();
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String i() {
        String str = this.f266642j;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timestamp");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public EventType j() {
        return this.f266637e;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String k() {
        return this.f266635c;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public DestinationMetadata l() {
        return this.f266643k;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266639g = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void n(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266641i = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void p(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266640h = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266638f = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266642j = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void s(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "<set-?>");
        this.f266637e = eventType;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void t(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266635c = str;
    }

    @NotNull
    public String toString() {
        return "AliasEvent(userId=" + k() + ", previousId=" + this.f266636d + ')';
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void u(@NotNull DestinationMetadata destinationMetadata) {
        Intrinsics.checkNotNullParameter(destinationMetadata, "<set-?>");
        this.f266643k = destinationMetadata;
    }

    @NotNull
    public final String v() {
        return k();
    }

    @NotNull
    public final String w() {
        return this.f266636d;
    }

    @NotNull
    public final AliasEvent x(@NotNull String userId, @NotNull String previousId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(previousId, "previousId");
        return new AliasEvent(userId, previousId);
    }

    @NotNull
    public final String z() {
        return this.f266636d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AliasEvent(@NotNull String userId, @NotNull String previousId) {
        super(null);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(previousId, "previousId");
        this.f266635c = userId;
        this.f266636d = previousId;
        this.f266637e = EventType.Alias;
        this.f266643k = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }
}
