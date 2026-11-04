package com.devtodev.analytics.internal.network.request;

import com.devtodev.analytics.internal.backend.repository.contentbuilder.ContentData;
import com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData;
import com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent;
import com.devtodev.analytics.internal.datacompression.IDataCompressor;
import com.devtodev.analytics.internal.network.IRequest;
import com.devtodev.analytics.internal.network.IRequestBuilder;
import com.devtodev.analytics.internal.network.request.platform.IUrlBuilder;
import com.devtodev.analytics.internal.network.request.platform.PlatformRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestBuilder implements IRequestBuilder {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final IRequestContent EMPTY_CONTENT = new IRequestContent() { // from class: com.devtodev.analytics.internal.network.request.RequestBuilder$Companion$EMPTY_CONTENT$1

        @NotNull
        private final RequestBuilder$Companion$EMPTY_CONTENT$1$dataCompressor$1 dataCompressor = new IDataCompressor() { // from class: com.devtodev.analytics.internal.network.request.RequestBuilder$Companion$EMPTY_CONTENT$1$dataCompressor$1
            @Override // com.devtodev.analytics.internal.datacompression.IDataCompressor
            @NotNull
            public byte[] compressData(@NotNull byte[] data, int i10) {
                Intrinsics.checkNotNullParameter(data, "data");
                return data;
            }
        };

        @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
        @NotNull
        public Map<String, String> getBase64Headers() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Content-type", "");
            return linkedHashMap;
        }

        @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
        @NotNull
        public IContentData getContent() {
            return new ContentData(this.dataCompressor, new byte[0], "");
        }

        @NotNull
        public final RequestBuilder$Companion$EMPTY_CONTENT$1$dataCompressor$1 getDataCompressor() {
            return this.dataCompressor;
        }

        @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
        @NotNull
        public Map<String, String> getHeader() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Content-type", "");
            return linkedHashMap;
        }

        @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
        @NotNull
        public String getPrettyJson() {
            return "{}";
        }

        @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IRequestContent
        public boolean isEmpty() {
            return true;
        }
    };

    @NotNull
    private static final String EMPTY_HEADER = "";

    @NotNull
    private IRequestContent requestContent;

    @NotNull
    private String requestIdentifier;

    @NotNull
    private final RequestType type;

    @NotNull
    private final IUrlBuilder urlBuilder;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RequestBuilder(@NotNull RequestType type, @NotNull IUrlBuilder urlBuilder) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(urlBuilder, "urlBuilder");
        this.type = type;
        this.urlBuilder = urlBuilder;
        this.requestContent = EMPTY_CONTENT;
        this.requestIdentifier = "";
    }

    @Override // com.devtodev.analytics.internal.network.IRequestBuilder
    public void appendPathSegment(@NotNull String segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.urlBuilder.appendSegment(segment);
    }

    @Override // com.devtodev.analytics.internal.network.IRequestBuilder
    @NotNull
    public IRequest build() {
        return new PlatformRequest(this.urlBuilder, this.type, this.requestContent, this.requestIdentifier);
    }

    @Override // com.devtodev.analytics.internal.network.IRequestBuilder
    public void setContent(@NotNull IRequestContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.requestContent = content;
    }

    @Override // com.devtodev.analytics.internal.network.IRequestBuilder
    public void setQueryParam(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.urlBuilder.setQueryParam(key, value);
    }

    @Override // com.devtodev.analytics.internal.network.IRequestBuilder
    public void setRequestIdentifier(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.requestIdentifier = identifier;
    }
}
