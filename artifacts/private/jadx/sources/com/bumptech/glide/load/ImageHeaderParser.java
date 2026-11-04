package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f96289a = -1;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f96290a;

        static {
            int i10 = 7 & 2;
        }

        ImageType(boolean z10) {
            this.f96290a = z10;
        }

        public boolean hasAlpha() {
            return this.f96290a;
        }
    }

    int a(@NonNull ByteBuffer byteBuffer, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;

    @NonNull
    ImageType b(@NonNull InputStream inputStream) throws IOException;

    int c(@NonNull InputStream inputStream, @NonNull com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;

    @NonNull
    ImageType d(@NonNull ByteBuffer byteBuffer) throws IOException;
}
