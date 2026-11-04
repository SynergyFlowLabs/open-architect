package androidx.media3.decoder;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class g extends androidx.media3.decoder.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f62695j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f62696k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f62697l = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public w f62698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f62699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public ByteBuffer f62700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f62702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    public ByteBuffer f62703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f62704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f62705i;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62707b;

        public b(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f62706a = i10;
            this.f62707b = i11;
        }
    }

    static {
        androidx.media3.common.p0.a("media3.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    private ByteBuffer D(int i10) {
        int i11 = this.f62704h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f62700d;
        throw new b(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static g L() {
        return new g(0);
    }

    @il.d({"data"})
    public void E(int i10) {
        int i11 = i10 + this.f62705i;
        ByteBuffer byteBuffer = this.f62700d;
        if (byteBuffer == null) {
            this.f62700d = D(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f62700d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferD = D(i12);
        byteBufferD.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferD.put(byteBuffer);
        }
        this.f62700d = byteBufferD;
    }

    public final void H() {
        ByteBuffer byteBuffer = this.f62700d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f62703g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean I() {
        return q(1073741824);
    }

    @il.d({"supplementalData"})
    public void M(int i10) {
        ByteBuffer byteBuffer = this.f62703g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f62703g = ByteBuffer.allocate(i10);
        } else {
            this.f62703g.clear();
        }
    }

    @Override // androidx.media3.decoder.a
    public void o() {
        super.o();
        ByteBuffer byteBuffer = this.f62700d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f62703g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f62701e = false;
    }

    public g(int i10, int i11) {
        this.f62699c = new d();
        this.f62704h = i10;
        this.f62705i = i11;
    }
}
