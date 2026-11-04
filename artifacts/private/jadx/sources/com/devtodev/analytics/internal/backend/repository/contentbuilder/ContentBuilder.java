package com.devtodev.analytics.internal.backend.repository.contentbuilder;

import com.devtodev.analytics.internal.backend.Identifiers;
import com.devtodev.analytics.internal.datacompression.IDataCompressor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentBuilder implements IContentBuilder {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String KEY_BACKEND_CROSS_PLATFORM_ID = "CrossPlatformDevtodevId";

    @NotNull
    private static final String KEY_BACKEND_DEVICE_ID = "DevtodevId";

    @NotNull
    public static final String KEY_DEVICE_ID = "DeviceId";

    @NotNull
    private static final String KEY_ID_TIMESTAMP = "DevtodevIdTimestamp";

    @NotNull
    public static final String KEY_PREVIOUS_DEVICE_ID = "PreviousDeviceId";

    @NotNull
    public static final String KEY_PREVIOUS_USER_ID = "PreviousUserId";

    @NotNull
    public static final String KEY_USER_ID = "UserId";

    @NotNull
    private static final String encoding = "X-Id-Encoding";

    @NotNull
    private IDataCompressor dataCompressor;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ContentBuilder(@NotNull IDataCompressor dataCompressor) {
        Intrinsics.checkNotNullParameter(dataCompressor, "dataCompressor");
        this.dataCompressor = dataCompressor;
    }

    private final Map<String, String> putHeaders(Identifiers identifiers) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(KEY_DEVICE_ID, identifiers.getDeviceId());
        if (identifiers.getPreviousDeviceId() != null) {
            linkedHashMap.put(KEY_PREVIOUS_DEVICE_ID, identifiers.getPreviousDeviceId());
        }
        if (identifiers.getUserId() != null) {
            linkedHashMap.put(KEY_USER_ID, identifiers.getUserId());
        }
        if (identifiers.getPreviousUserId() != null) {
            linkedHashMap.put(KEY_PREVIOUS_USER_ID, identifiers.getPreviousUserId());
        }
        if (identifiers.getDevtodevId() != null) {
            linkedHashMap.put(KEY_BACKEND_DEVICE_ID, String.valueOf(identifiers.getDevtodevId()));
        }
        if (identifiers.getCrossPlatformDevtodevId() != null) {
            linkedHashMap.put(KEY_BACKEND_CROSS_PLATFORM_ID, String.valueOf(identifiers.getCrossPlatformDevtodevId()));
        }
        if (identifiers.getDevtodevIdTimestamp() != null) {
            linkedHashMap.put(KEY_ID_TIMESTAMP, String.valueOf(identifiers.getDevtodevIdTimestamp()));
        }
        linkedHashMap.put(encoding, "base64");
        return linkedHashMap;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentBuilder
    @NotNull
    public IRequestContent getContent(@NotNull String json, @NotNull Identifiers ids) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new RequestContent(json, putHeaders(ids), this.dataCompressor);
    }
}
