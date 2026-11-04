package com.devtodev.analytics.internal.backend.repository.contentbuilder;

import android.util.Base64;
import com.devtodev.analytics.internal.datacompression.IDataCompressor;
import com.devtodev.analytics.internal.logger.Logger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRequestContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestContent.kt\ncom/devtodev/analytics/internal/backend/repository/contentbuilder/RequestContent\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,79:1\n215#2,2:80\n*S KotlinDebug\n*F\n+ 1 RequestContent.kt\ncom/devtodev/analytics/internal/backend/repository/contentbuilder/RequestContent\n*L\n53#1:80,2\n*E\n"})
public final class RequestContent implements IRequestContent {

    @NotNull
    private final IDataCompressor dataCompressor;

    @NotNull
    private final List<String> encodingKeys;

    @NotNull
    private Map<String, String> headers;

    @NotNull
    private final String input;

    public RequestContent(@NotNull String input, @NotNull Map<String, String> headers, @NotNull IDataCompressor dataCompressor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(dataCompressor, "dataCompressor");
        this.input = input;
        this.headers = headers;
        this.dataCompressor = dataCompressor;
        this.encodingKeys = CollectionsKt.listOf((Object[]) new String[]{ContentBuilder.KEY_DEVICE_ID, ContentBuilder.KEY_PREVIOUS_DEVICE_ID, ContentBuilder.KEY_USER_ID, ContentBuilder.KEY_PREVIOUS_USER_ID});
    }

    private final String base64Encode(String str) {
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            String strEncodeToString = Base64.encodeToString(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(utf8Bytes, Base64.DEFAULT)");
            int i10 = 5 >> 4;
            return StringsKt.k2(strEncodeToString, "\n", "", false, 4, null);
        } catch (Exception e10) {
            Logger.INSTANCE.error("Can't encode header to base64 string [" + str + "]", e10);
            return null;
        }
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
    @NotNull
    public Map<String, String> getBase64Headers() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (this.encodingKeys.contains(key)) {
                String strBase64Encode = base64Encode(value);
                if (strBase64Encode != null) {
                    linkedHashMap.put(key, strBase64Encode);
                } else {
                    linkedHashMap.put(key, value);
                }
            } else {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
    @NotNull
    public IContentData getContent() {
        IDataCompressor iDataCompressor = this.dataCompressor;
        byte[] bytes = this.input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new ContentData(iDataCompressor, bytes, "application/json").getEncryptionContent().getCompressedContent();
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
    @NotNull
    public Map<String, String> getHeader() {
        return this.headers;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
    @NotNull
    public String getPrettyJson() {
        return this.input;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
    public boolean isEmpty() {
        return this.input.length() == 0;
    }
}
