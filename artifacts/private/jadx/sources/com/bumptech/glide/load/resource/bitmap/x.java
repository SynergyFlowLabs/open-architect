package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
interface x {

    public static final class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f97099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f97100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f97101c;

        a(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f97100b = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar);
            this.f97101c = (List) com.bumptech.glide.util.k.d(list);
            this.f97099a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.x
        public void a() {
            this.f97099a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.x
        public int b() throws IOException {
            return com.bumptech.glide.load.f.b(this.f97101c, this.f97099a.a(), this.f97100b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.x
        @p0
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f97099a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.x
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.f.e(this.f97101c, this.f97099a.a(), this.f97100b);
        }
    }

    @w0(21)
    public static final class b implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f97102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f97103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.load.data.m f97104c;

        b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f97102a = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar);
            this.f97103b = (List) com.bumptech.glide.util.k.d(list);
            this.f97104c = new com.bumptech.glide.load.data.m(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.x
        public void a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.x
        public int b() throws IOException {
            return com.bumptech.glide.load.f.a(this.f97103b, this.f97104c, this.f97102a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.x
        @p0
        public Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f97104c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.x
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.f.d(this.f97103b, this.f97104c, this.f97102a);
        }
    }

    void a();

    int b() throws IOException;

    @p0
    Bitmap c(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
