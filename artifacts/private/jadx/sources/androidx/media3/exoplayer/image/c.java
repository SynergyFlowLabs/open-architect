package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.exoplayer.a5;
import com.google.common.util.concurrent.h1;
import com.google.common.util.concurrent.t1;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c implements androidx.media3.exoplayer.image.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f63870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.decoder.g f63871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f63872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private t1<Bitmap> f63873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63875f;

    class a extends f {
        a() {
        }

        @Override // androidx.media3.decoder.h
        public void D() {
            o();
        }
    }

    public interface b {
        t1<Bitmap> a(C0582c c0582c);
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.image.c$c, reason: collision with other inner class name */
    public static final class C0582c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f63877a;

        public C0582c(Uri uri) {
            this.f63877a = uri;
        }
    }

    public static final class d implements androidx.media3.exoplayer.image.d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f63878b;

        public d(b bVar) {
            this.f63878b = bVar;
        }

        @Override // androidx.media3.exoplayer.image.d.a
        public int b(w wVar) {
            int i10;
            if (Objects.equals(wVar.f61761o, s0.U0)) {
                i10 = 4;
            } else {
                i10 = s0.s(wVar.f61761o) ? 1 : 0;
            }
            return a5.M(i10);
        }

        @Override // androidx.media3.exoplayer.image.d.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a() {
            return new c(this.f63878b, null);
        }
    }

    /* synthetic */ c(b bVar, a aVar) {
        this(bVar);
    }

    private void h() {
        t1<Bitmap> t1Var = this.f63873d;
        if (t1Var != null) {
            t1Var.cancel(false);
            this.f63873d = null;
        }
        this.f63875f = false;
        this.f63872c.D();
    }

    @Override // androidx.media3.decoder.e
    public void e(long j10) {
    }

    @Override // androidx.media3.exoplayer.image.d, androidx.media3.decoder.e
    /* JADX INFO: renamed from: f */
    public void b(androidx.media3.decoder.g gVar) {
        if (gVar.s()) {
            this.f63875f = true;
            gVar.o();
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(gVar.f62700d);
        androidx.media3.common.util.a.i(byteBuffer.hasArray());
        this.f63873d = this.f63870a.a(new C0582c(Uri.parse(new String(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), StandardCharsets.UTF_8))));
        this.f63874e = gVar.f62702f;
        gVar.o();
    }

    @Override // androidx.media3.decoder.e
    public void flush() {
        h();
    }

    @Override // androidx.media3.decoder.e
    @p0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public androidx.media3.decoder.g c() {
        if (this.f63873d == null) {
            return this.f63871b;
        }
        return null;
    }

    @Override // androidx.media3.decoder.e
    public String getName() {
        return "externallyLoadedImageDecoder";
    }

    @Override // androidx.media3.decoder.e
    public void release() {
        h();
    }

    private c(b bVar) {
        this.f63870a = bVar;
        this.f63871b = new androidx.media3.decoder.g(1);
        this.f63872c = new a();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.image.d, androidx.media3.decoder.e
    @p0
    public f a() throws e {
        if (this.f63875f) {
            int i10 = 4 ^ 4;
            this.f63872c.c(4);
            this.f63875f = false;
            return this.f63872c;
        }
        t1<Bitmap> t1Var = this.f63873d;
        if (t1Var != null) {
            try {
                if (t1Var.isDone()) {
                    try {
                        this.f63872c.f63880e = (Bitmap) h1.j(this.f63873d);
                        f fVar = this.f63872c;
                        fVar.f62708b = this.f63874e;
                        this.f63873d = null;
                        return fVar;
                    } catch (CancellationException e10) {
                        throw new e(e10);
                    } catch (ExecutionException e11) {
                        throw new e(e11.getCause());
                    }
                }
            } catch (Throwable th2) {
                this.f63873d = null;
                throw th2;
            }
        }
        return null;
    }
}
