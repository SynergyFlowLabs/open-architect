package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class j0<T> implements com.bumptech.glide.load.l<T, Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f96998d = "VideoDecoder";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f96999e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    static final int f97000f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.i<Long> f97001g = com.bumptech.glide.load.i.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.i<Integer> f97002h = com.bumptech.glide.load.i.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final e f97003i = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f<T> f97004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f97005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f97006c;

    class a implements com.bumptech.glide.load.i.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f97007a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // com.bumptech.glide.load.i.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Long l10, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f97007a) {
                try {
                    this.f97007a.position(0);
                    messageDigest.update(this.f97007a.putLong(l10.longValue()).array());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class b implements com.bumptech.glide.load.i.b<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f97008a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // com.bumptech.glide.load.i.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f97008a) {
                this.f97008a.position(0);
                messageDigest.update(this.f97008a.putInt(num.intValue()).array());
            }
        }
    }

    private static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.j0.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    @w0(23)
    static final class d implements f<ByteBuffer> {

        class a extends MediaDataSource {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f97009a;

            a(ByteBuffer byteBuffer) {
                this.f97009a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f97009a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f97009a.limit()) {
                    return -1;
                }
                this.f97009a.position((int) j10);
                int iMin = Math.min(i11, this.f97009a.remaining());
                this.f97009a.get(bArr, i10, iMin);
                return iMin;
            }
        }

        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.j0.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    @l1
    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    @l1
    interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    static final class g implements f<ParcelFileDescriptor> {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.j0.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    static {
        int i10 = 1 ^ 2;
    }

    j0(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, f<T> fVar) {
        this(eVar, fVar, f97003i);
    }

    public static com.bumptech.glide.load.l<AssetFileDescriptor, Bitmap> c(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new j0(eVar, new c(null));
    }

    @w0(api = 23)
    public static com.bumptech.glide.load.l<ByteBuffer, Bitmap> d(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new j0(eVar, new d());
    }

    @p0
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, p pVar) {
        Bitmap bitmapG = (i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || pVar == p.f97051f) ? null : g(mediaMetadataRetriever, j10, i10, i11, i12, pVar);
        return bitmapG == null ? f(mediaMetadataRetriever, j10, i10) : bitmapG;
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    @e.b(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, p pVar) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fB = pVar.b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fB), Math.round(fB * i14));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.bumptech.glide.load.l<ParcelFileDescriptor, Bitmap> h(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new j0(eVar, new g());
    }

    @Override // com.bumptech.glide.load.l
    public boolean a(@NonNull T t10, @NonNull com.bumptech.glide.load.j jVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.l
    public com.bumptech.glide.load.engine.v<Bitmap> b(@NonNull T t10, int i10, int i11, @NonNull com.bumptech.glide.load.j jVar) throws IOException {
        long jLongValue = ((Long) jVar.c(f97001g)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) jVar.c(f97002h);
        if (num == null) {
            num = 2;
        }
        p pVar = (p) jVar.c(p.f97053h);
        if (pVar == null) {
            pVar = p.f97052g;
        }
        p pVar2 = pVar;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f97006c.a();
        try {
            try {
                this.f97004a.a(mediaMetadataRetrieverA, t10);
                Bitmap bitmapE = e(mediaMetadataRetrieverA, jLongValue, num.intValue(), i10, i11, pVar2);
                mediaMetadataRetrieverA.release();
                return com.bumptech.glide.load.resource.bitmap.g.d(bitmapE, this.f97005b);
            } catch (RuntimeException e10) {
                throw new IOException(e10);
            }
        } catch (Throwable th2) {
            mediaMetadataRetrieverA.release();
            throw th2;
        }
    }

    @l1
    j0(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, f<T> fVar, e eVar2) {
        this.f97005b = eVar;
        this.f97004a = fVar;
        this.f97006c = eVar2;
    }
}
