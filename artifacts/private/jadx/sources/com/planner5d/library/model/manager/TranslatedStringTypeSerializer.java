package com.planner5d.library.model.manager;

import com.activeandroid.serializer.TypeSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class TranslatedStringTypeSerializer extends TypeSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f180772a = 0;

    @Override // com.activeandroid.serializer.TypeSerializer
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.a0 deserialize(@Nullable Object obj) {
        if (obj == null || !(obj instanceof String)) {
            return null;
        }
        return new com.planner5d.library.model.a0(new JSONObject((String) obj));
    }

    @Override // com.activeandroid.serializer.TypeSerializer
    @NotNull
    public Class<com.planner5d.library.model.a0> getDeserializedType() {
        return com.planner5d.library.model.a0.class;
    }

    @Override // com.activeandroid.serializer.TypeSerializer
    @NotNull
    public Class<String> getSerializedType() {
        return String.class;
    }

    @Override // com.activeandroid.serializer.TypeSerializer
    @Nullable
    public Object serialize(@Nullable Object obj) {
        if (obj instanceof com.planner5d.library.model.a0) {
            return ((com.planner5d.library.model.a0) obj).b().toString();
        }
        return null;
    }
}
