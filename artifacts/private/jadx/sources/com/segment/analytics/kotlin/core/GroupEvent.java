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
@a0("group")
public final class GroupEvent extends BaseEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f266661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private JsonObject f266662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private EventType f266663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f266664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f266665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public JsonObject f266666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JsonObject f266667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private String f266668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private DestinationMetadata f266669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f266670l;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<GroupEvent> serializer() {
            return GroupEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
    public /* synthetic */ GroupEvent(int i10, String str, JsonObject jsonObject, EventType eventType, String str2, String str3, JsonObject jsonObject2, JsonObject jsonObject3, String str4, DestinationMetadata destinationMetadata, String str5, v2 v2Var) {
        super(null);
        if (635 != (i10 & 635)) {
            g2.b(i10, 635, GroupEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.f266661c = str;
        this.f266662d = jsonObject;
        if ((i10 & 4) == 0) {
            this.f266663e = EventType.Group;
        } else {
            this.f266663e = eventType;
        }
        this.f266664f = str2;
        this.f266665g = str3;
        this.f266666h = jsonObject2;
        this.f266667i = jsonObject3;
        if ((i10 & 128) == 0) {
            this.f266668j = "";
        } else {
            this.f266668j = str4;
        }
        if ((i10 & 256) == 0) {
            this.f266669k = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.f266669k = destinationMetadata;
        }
        this.f266670l = str5;
    }

    @oj.n
    public static final void D(@NotNull GroupEvent self, @NotNull kotlinx.serialization.encoding.e output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.f266661c);
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, jsonObjectSerializer, self.f266662d);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.j() != EventType.Group) {
            output.encodeSerializableElement(serialDesc, 2, EventType.Companion.serializer(), self.j());
        }
        output.encodeStringElement(serialDesc, 3, self.h());
        int i10 = 6 & 4;
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

    public static /* synthetic */ GroupEvent y(GroupEvent groupEvent, String str, JsonObject jsonObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = groupEvent.f266661c;
        }
        if ((i10 & 2) != 0) {
            jsonObject = groupEvent.f266662d;
        }
        return groupEvent.x(str, jsonObject);
    }

    @NotNull
    public final JsonObject A() {
        return this.f266662d;
    }

    public final void B(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266661c = str;
    }

    public final void C(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266662d = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String d() {
        String str = this.f266665g;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("anonymousId");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject e() {
        JsonObject jsonObject = this.f266667i;
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
        if (!Intrinsics.areEqual(GroupEvent.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.GroupEvent");
        GroupEvent groupEvent = (GroupEvent) obj;
        return Intrinsics.areEqual(this.f266661c, groupEvent.f266661c) && Intrinsics.areEqual(this.f266662d, groupEvent.f266662d);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject g() {
        JsonObject jsonObject = this.f266666h;
        if (jsonObject != null) {
            return jsonObject;
        }
        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.protocol.p.b.f306434d);
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String h() {
        String str = this.f266664f;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageId");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public int hashCode() {
        return (((super.hashCode() * 31) + this.f266661c.hashCode()) * 31) + this.f266662d.hashCode();
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String i() {
        String str = this.f266670l;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timestamp");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public EventType j() {
        return this.f266663e;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String k() {
        return this.f266668j;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public DestinationMetadata l() {
        return this.f266669k;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266665g = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void n(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266667i = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void p(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266666h = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266664f = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266670l = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void s(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "<set-?>");
        this.f266663e = eventType;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void t(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266668j = str;
    }

    @NotNull
    public String toString() {
        return "GroupEvent(groupId=" + this.f266661c + ", traits=" + this.f266662d + ')';
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void u(@NotNull DestinationMetadata destinationMetadata) {
        Intrinsics.checkNotNullParameter(destinationMetadata, "<set-?>");
        this.f266669k = destinationMetadata;
    }

    @NotNull
    public final String v() {
        return this.f266661c;
    }

    @NotNull
    public final JsonObject w() {
        return this.f266662d;
    }

    @NotNull
    public final GroupEvent x(@NotNull String groupId, @NotNull JsonObject traits) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        return new GroupEvent(groupId, traits);
    }

    @NotNull
    public final String z() {
        return this.f266661c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEvent(@NotNull String groupId, @NotNull JsonObject traits) {
        super(null);
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(traits, "traits");
        this.f266661c = groupId;
        this.f266662d = traits;
        this.f266663e = EventType.Group;
        this.f266668j = "";
        this.f266669k = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }
}
