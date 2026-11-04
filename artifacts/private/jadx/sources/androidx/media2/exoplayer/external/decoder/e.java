package androidx.media2.exoplayer.external.decoder;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class e extends androidx.media2.exoplayer.external.decoder.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f53785g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f53786h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f53787i = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f53788b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public ByteBuffer f53789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f53790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public ByteBuffer f53791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f53792f;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e(int bufferReplacementMode) {
        this.f53792f = bufferReplacementMode;
    }

    public static e I() {
        return new e(0);
    }

    private ByteBuffer x(int requiredCapacity) {
        int i10 = this.f53792f;
        if (i10 == 1) {
            return ByteBuffer.allocate(requiredCapacity);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(requiredCapacity);
        }
        ByteBuffer byteBuffer = this.f53789c;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("Buffer too small (");
        sb2.append(iCapacity);
        sb2.append(" < ");
        sb2.append(requiredCapacity);
        sb2.append(")");
        throw new IllegalStateException(sb2.toString());
    }

    public final void D() {
        this.f53789c.flip();
        ByteBuffer byteBuffer = this.f53791e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
    }

    public final boolean E() {
        return q(1073741824);
    }

    public final boolean H() {
        return this.f53789c == null && this.f53792f == 0;
    }

    @il.d({"supplementalData"})
    public void L(int length) {
        ByteBuffer byteBuffer = this.f53791e;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            this.f53791e = ByteBuffer.allocate(length);
        }
        this.f53791e.position(0);
        this.f53791e.limit(length);
    }

    @Override // androidx.media2.exoplayer.external.decoder.a
    public void o() {
        super.o();
        ByteBuffer byteBuffer = this.f53789c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @il.d({"data"})
    public void z(int length) {
        ByteBuffer byteBuffer = this.f53789c;
        if (byteBuffer == null) {
            this.f53789c = x(length);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.f53789c.position();
        int i10 = length + iPosition;
        if (iCapacity >= i10) {
            return;
        }
        ByteBuffer byteBufferX = x(i10);
        if (iPosition > 0) {
            this.f53789c.position(0);
            this.f53789c.limit(iPosition);
            byteBufferX.put(this.f53789c);
        }
        this.f53789c = byteBufferX;
    }
}
