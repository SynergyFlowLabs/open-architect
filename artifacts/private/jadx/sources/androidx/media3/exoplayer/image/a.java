package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.v0;
import androidx.media3.common.w;
import androidx.media3.decoder.j;
import androidx.media3.exoplayer.a5;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a extends j<androidx.media3.decoder.g, f, e> implements d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f63867o;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.image.a$a, reason: collision with other inner class name */
    class C0581a extends f {
        C0581a() {
        }

        @Override // androidx.media3.decoder.h
        public void D() {
            a.this.t(this);
        }
    }

    @l1(otherwise = 2)
    public interface b {
        Bitmap a(byte[] bArr, int i10) throws e;
    }

    /* synthetic */ a(b bVar, C0581a c0581a) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap B(byte[] bArr, int i10) throws e {
        try {
            return androidx.media3.datasource.f.a(bArr, i10, null, -1);
        } catch (v0 e10) {
            throw new e("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.j
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public e k(Throwable th2) {
        return new e("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.j
    @p0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public e l(androidx.media3.decoder.g gVar, f fVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(gVar.f62700d);
            androidx.media3.common.util.a.i(byteBuffer.hasArray());
            androidx.media3.common.util.a.a(byteBuffer.arrayOffset() == 0);
            fVar.f63880e = this.f63867o.a(byteBuffer.array(), byteBuffer.remaining());
            fVar.f62708b = gVar.f62702f;
            return null;
        } catch (e e10) {
            return e10;
        }
    }

    @Override // androidx.media3.decoder.j, androidx.media3.decoder.e
    @p0
    public /* bridge */ /* synthetic */ f a() throws e {
        return (f) super.a();
    }

    @Override // androidx.media3.decoder.e
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // androidx.media3.decoder.j
    protected androidx.media3.decoder.g i() {
        return new androidx.media3.decoder.g(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.j
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public f j() {
        return new C0581a();
    }

    public static final class c implements d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f63869b;

        public c() {
            this.f63869b = new b() { // from class: androidx.media3.exoplayer.image.b
                @Override // androidx.media3.exoplayer.image.a.b
                public final Bitmap a(byte[] bArr, int i10) {
                    return a.B(bArr, i10);
                }
            };
        }

        @Override // androidx.media3.exoplayer.image.d.a
        public int b(w wVar) {
            String str = wVar.f61761o;
            if (str == null || !s0.s(str)) {
                return a5.M(0);
            }
            return k1.f1(wVar.f61761o) ? a5.M(4) : a5.M(1);
        }

        @Override // androidx.media3.exoplayer.image.d.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this.f63869b, null);
        }

        public c(b bVar) {
            this.f63869b = bVar;
        }
    }

    private a(b bVar) {
        super(new androidx.media3.decoder.g[1], new f[1]);
        this.f63867o = bVar;
    }
}
