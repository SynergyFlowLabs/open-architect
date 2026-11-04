package com.devtodev.analytics.internal.backend.repository.contentbuilder;

import com.devtodev.analytics.internal.datacompression.IDataCompressor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nContentData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentData.kt\ncom/devtodev/analytics/internal/backend/repository/contentbuilder/ContentData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class ContentData implements IContentData {

    @NotNull
    public static final String COMPRESSION_FAILED = "Failed to compress JSON object";
    public static final int COMPRESSION_LEVEL = 4;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ENCRYPTION_FAILED = "Failed to encrypt JSON object";

    @NotNull
    public static final String HEADER_COMPRESSED_ENCRYPT = "application/json";

    @NotNull
    public static final String HEADER_COMPRESSED_ZSTD = "application/zstd";

    @NotNull
    public static final String HEADER_UNCOMPRESSED = "application/json";

    @NotNull
    private String contentType;

    @NotNull
    private byte[] data;

    @NotNull
    private final IDataCompressor dataCompressor;

    @Nullable
    private String exceptionMessage;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ContentData(@NotNull IDataCompressor dataCompressor, @NotNull byte[] data, @NotNull String contentType) {
        Intrinsics.checkNotNullParameter(dataCompressor, "dataCompressor");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.dataCompressor = dataCompressor;
        this.data = data;
        this.contentType = contentType;
    }

    private final void debugCompressionLog(byte[] bArr, byte[] bArr2) {
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData
    @NotNull
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData
    @NotNull
    public byte[] getData() {
        return this.data;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData
    @Nullable
    public String getExceptionMessage() {
        return this.exceptionMessage;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData
    public void setContentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contentType = str;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData
    public void setData(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.data = bArr;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData
    @NotNull
    public ContentData getCompressedContent() {
        if (this.exceptionMessage == null) {
            try {
                byte[] bArrCompressData = this.dataCompressor.compressData(getData(), 4);
                setContentType(HEADER_COMPRESSED_ZSTD);
                debugCompressionLog(getData(), bArrCompressData);
                setData(bArrCompressData);
                return this;
            } catch (Throwable th2) {
                this.exceptionMessage = COMPRESSION_FAILED;
                String message = th2.getMessage();
                if (message != null) {
                    this.exceptionMessage = this.exceptionMessage + ":\n\t" + message;
                }
            }
        }
        return this;
    }

    @Override // com.devtodev.analytics.internal.backend.repository.contentbuilder.IContentData
    @NotNull
    public ContentData getEncryptionContent() {
        if (this.exceptionMessage == null) {
            try {
                setContentType("application/json");
                return this;
            } catch (Throwable th2) {
                this.exceptionMessage = ENCRYPTION_FAILED;
                String message = th2.getMessage();
                if (message != null) {
                    this.exceptionMessage = this.exceptionMessage + ":\n\t" + message;
                }
            }
        }
        return this;
    }
}
