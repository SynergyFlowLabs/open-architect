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
@a0(com.segment.analytics.kotlin.android.plugins.a.f266538j3)
public final class ScreenEvent extends BaseEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f266685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f266686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private JsonObject f266687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private EventType f266688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f266689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f266690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JsonObject f266691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JsonObject f266692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private String f266693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f266694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private DestinationMetadata f266695m;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ScreenEvent> serializer() {
            return ScreenEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @b1(expression = "", imports = {}))
    public /* synthetic */ ScreenEvent(int i10, String str, String str2, JsonObject jsonObject, EventType eventType, String str3, String str4, JsonObject jsonObject2, JsonObject jsonObject3, String str5, String str6, DestinationMetadata destinationMetadata, v2 v2Var) {
        super(null);
        if (759 != (i10 & 759)) {
            g2.b(i10, 759, ScreenEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.f266685c = str;
        this.f266686d = str2;
        this.f266687e = jsonObject;
        if ((i10 & 8) == 0) {
            this.f266688f = EventType.Screen;
        } else {
            this.f266688f = eventType;
        }
        this.f266689g = str3;
        this.f266690h = str4;
        this.f266691i = jsonObject2;
        this.f266692j = jsonObject3;
        if ((i10 & 256) == 0) {
            this.f266693k = "";
        } else {
            this.f266693k = str5;
        }
        this.f266694l = str6;
        if ((i10 & 1024) == 0) {
            this.f266695m = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.f266695m = destinationMetadata;
        }
    }

    @oj.n
    public static final void G(@NotNull ScreenEvent self, @NotNull kotlinx.serialization.encoding.e output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.f266685c);
        output.encodeStringElement(serialDesc, 1, self.f266686d);
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, jsonObjectSerializer, self.f266687e);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.j() != EventType.Screen) {
            output.encodeSerializableElement(serialDesc, 3, EventType.Companion.serializer(), self.j());
        }
        output.encodeStringElement(serialDesc, 4, self.h());
        output.encodeStringElement(serialDesc, 5, self.d());
        output.encodeSerializableElement(serialDesc, 6, jsonObjectSerializer, self.e());
        output.encodeSerializableElement(serialDesc, 7, jsonObjectSerializer, self.g());
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !Intrinsics.areEqual(self.k(), "")) {
            output.encodeStringElement(serialDesc, 8, self.k());
        }
        output.encodeStringElement(serialDesc, 9, self.i());
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && Intrinsics.areEqual(self.l(), new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 10, DestinationMetadata$$serializer.INSTANCE, self.l());
    }

    public static /* synthetic */ ScreenEvent z(ScreenEvent screenEvent, String str, String str2, JsonObject jsonObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = screenEvent.f266685c;
        }
        if ((i10 & 2) != 0) {
            str2 = screenEvent.f266686d;
        }
        if ((i10 & 4) != 0) {
            jsonObject = screenEvent.f266687e;
        }
        return screenEvent.y(str, str2, jsonObject);
    }

    @NotNull
    public final String A() {
        return this.f266686d;
    }

    @NotNull
    public final String B() {
        return this.f266685c;
    }

    @NotNull
    public final JsonObject C() {
        return this.f266687e;
    }

    public final void D(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266686d = str;
    }

    public final void E(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266685c = str;
    }

    public final void F(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266687e = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String d() {
        String str = this.f266690h;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("anonymousId");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject e() {
        JsonObject jsonObject = this.f266691i;
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
        if (!Intrinsics.areEqual(ScreenEvent.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.ScreenEvent");
        ScreenEvent screenEvent = (ScreenEvent) obj;
        return Intrinsics.areEqual(this.f266685c, screenEvent.f266685c) && Intrinsics.areEqual(this.f266686d, screenEvent.f266686d) && Intrinsics.areEqual(this.f266687e, screenEvent.f266687e);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public JsonObject g() {
        JsonObject jsonObject = this.f266692j;
        if (jsonObject != null) {
            return jsonObject;
        }
        Intrinsics.throwUninitializedPropertyAccessException(io.sentry.protocol.p.b.f306434d);
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String h() {
        String str = this.f266689g;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageId");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public int hashCode() {
        return (((((super.hashCode() * 31) + this.f266685c.hashCode()) * 31) + this.f266686d.hashCode()) * 31) + this.f266687e.hashCode();
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String i() {
        String str = this.f266694l;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timestamp");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public EventType j() {
        return this.f266688f;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public String k() {
        return this.f266693k;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    @NotNull
    public DestinationMetadata l() {
        return this.f266695m;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266690h = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void n(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266691i = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void p(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<set-?>");
        this.f266692j = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266689g = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266694l = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void s(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "<set-?>");
        this.f266688f = eventType;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void t(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f266693k = str;
    }

    @NotNull
    public String toString() {
        return "ScreenEvent(name=" + this.f266685c + ", category=" + this.f266686d + ", properties=" + this.f266687e + ')';
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void u(@NotNull DestinationMetadata destinationMetadata) {
        Intrinsics.checkNotNullParameter(destinationMetadata, "<set-?>");
        this.f266695m = destinationMetadata;
    }

    @NotNull
    public final String v() {
        return this.f266685c;
    }

    @NotNull
    public final String w() {
        return this.f266686d;
    }

    @NotNull
    public final JsonObject x() {
        return this.f266687e;
    }

    @NotNull
    public final ScreenEvent y(@NotNull String name, @NotNull String category, @NotNull JsonObject properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return new ScreenEvent(name, category, properties);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenEvent(@NotNull String name, @NotNull String category, @NotNull JsonObject properties) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f266685c = name;
        this.f266686d = category;
        this.f266687e = properties;
        this.f266688f = EventType.Screen;
        this.f266693k = "";
        int i10 = 0 >> 0;
        this.f266695m = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }
}
