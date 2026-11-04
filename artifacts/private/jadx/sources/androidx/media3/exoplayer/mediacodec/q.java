package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f64127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f64128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.w f64129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final Surface f64130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final MediaCrypto f64131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        public final o f64132f;

        private a(t tVar, MediaFormat mediaFormat, androidx.media3.common.w wVar, @p0 Surface surface, @p0 MediaCrypto mediaCrypto, @p0 o oVar) {
            this.f64127a = tVar;
            this.f64128b = mediaFormat;
            this.f64129c = wVar;
            this.f64130d = surface;
            this.f64131e = mediaCrypto;
            this.f64132f = oVar;
        }

        public static a a(t tVar, MediaFormat mediaFormat, androidx.media3.common.w wVar, @p0 MediaCrypto mediaCrypto, @p0 o oVar) {
            return new a(tVar, mediaFormat, wVar, null, mediaCrypto, oVar);
        }

        public static a b(t tVar, MediaFormat mediaFormat, androidx.media3.common.w wVar, @p0 Surface surface, @p0 MediaCrypto mediaCrypto) {
            return new a(tVar, mediaFormat, wVar, surface, mediaCrypto, null);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public static final b f64133a = new j();

        static b b(Context context) {
            return new j(context);
        }

        q a(a aVar) throws IOException;
    }

    public interface c {
        default void a() {
        }

        default void b() {
        }
    }

    public interface d {
        void a(q qVar, long j10, long j11);
    }

    void a(Bundle bundle);

    void b(int i10);

    void c(int i10, int i11, int i12, long j10, int i13);

    void d(int i10, int i11, androidx.media3.decoder.d dVar, long j10, int i12);

    boolean e();

    void f(int i10, long j10);

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    @w0(26)
    PersistableBundle getMetrics();

    void h(int i10, boolean z10);

    default boolean i(c cVar) {
        return false;
    }

    @w0(23)
    void j(d dVar, Handler handler);

    MediaFormat k();

    @w0(35)
    void l();

    @p0
    ByteBuffer m(int i10);

    @w0(23)
    void n(Surface surface);

    int o();

    @p0
    ByteBuffer p(int i10);

    void release();
}
