package com.segment.analytics.kotlin.core;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends JsonContentPolymorphicSerializer<BaseEvent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f266805a = new d();

    private d() {
        super(j1.d(BaseEvent.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    @NotNull
    protected kotlinx.serialization.e<BaseEvent> selectDeserializer(@NotNull JsonElement element) throws Exception {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(element, "element");
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(element).get((Object) "type");
        String content = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            switch (content.hashCode()) {
                case -907689876:
                    if (content.equals(com.segment.analytics.kotlin.android.plugins.a.f266538j3)) {
                        return ScreenEvent.Companion.serializer();
                    }
                    break;
                case -135762164:
                    if (content.equals("identify")) {
                        return IdentifyEvent.Companion.serializer();
                    }
                    break;
                case 92902992:
                    if (content.equals("alias")) {
                        return AliasEvent.Companion.serializer();
                    }
                    break;
                case 98629247:
                    if (content.equals("group")) {
                        return GroupEvent.Companion.serializer();
                    }
                    break;
                case 110621003:
                    if (content.equals("track")) {
                        return TrackEvent.Companion.serializer();
                    }
                    break;
            }
        }
        throw new Exception("Unknown Event: key 'type' not found or does not matches any event type");
    }
}
