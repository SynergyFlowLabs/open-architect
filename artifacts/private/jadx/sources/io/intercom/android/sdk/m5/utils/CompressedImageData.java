package io.intercom.android.sdk.m5.utils;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
final class CompressedImageData {
    private final int height;
    private final long size;

    @NotNull
    private final Uri uri;
    private final int width;

    public CompressedImageData(@NotNull Uri uri, int i10, int i11, long j10) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        this.width = i10;
        this.height = i11;
        this.size = j10;
    }

    public static /* synthetic */ CompressedImageData copy$default(CompressedImageData compressedImageData, Uri uri, int i10, int i11, long j10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = compressedImageData.uri;
        }
        if ((i12 & 2) != 0) {
            i10 = compressedImageData.width;
        }
        if ((i12 & 4) != 0) {
            i11 = compressedImageData.height;
        }
        if ((i12 & 8) != 0) {
            j10 = compressedImageData.size;
        }
        int i13 = i11;
        return compressedImageData.copy(uri, i10, i13, j10);
    }

    @NotNull
    public final Uri component1() {
        return this.uri;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final long component4() {
        return this.size;
    }

    @NotNull
    public final CompressedImageData copy(@NotNull Uri uri, int i10, int i11, long j10) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new CompressedImageData(uri, i10, i11, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompressedImageData)) {
            return false;
        }
        CompressedImageData compressedImageData = (CompressedImageData) obj;
        return Intrinsics.areEqual(this.uri, compressedImageData.uri) && this.width == compressedImageData.width && this.height == compressedImageData.height && this.size == compressedImageData.size;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((this.uri.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.size);
    }

    @NotNull
    public String toString() {
        return "CompressedImageData(uri=" + this.uri + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ')';
    }
}
