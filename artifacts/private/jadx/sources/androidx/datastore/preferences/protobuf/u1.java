package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class u1 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<ByteBuffer> f50659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f50660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50661c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f50664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f50665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f50667i;

    u1(Iterable<ByteBuffer> data) {
        this.f50659a = data.iterator();
        for (ByteBuffer byteBuffer : data) {
            this.f50661c++;
        }
        this.f50662d = -1;
        if (!a()) {
            this.f50660b = s1.f50565f;
            this.f50662d = 0;
            this.f50663e = 0;
            this.f50667i = 0L;
        }
    }

    private boolean a() {
        this.f50662d++;
        if (!this.f50659a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f50659a.next();
        this.f50660b = next;
        this.f50663e = next.position();
        if (this.f50660b.hasArray()) {
            this.f50664f = true;
            this.f50665g = this.f50660b.array();
            this.f50666h = this.f50660b.arrayOffset();
        } else {
            this.f50664f = false;
            this.f50667i = w4.k(this.f50660b);
            this.f50665g = null;
        }
        return true;
    }

    private void b(int numberOfBytesRead) {
        int i10 = this.f50663e + numberOfBytesRead;
        this.f50663e = i10;
        if (i10 == this.f50660b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f50662d == this.f50661c) {
            return -1;
        }
        if (this.f50664f) {
            int i10 = this.f50665g[this.f50663e + this.f50666h] & 255;
            b(1);
            return i10;
        }
        int iA = w4.A(((long) this.f50663e) + this.f50667i) & 255;
        b(1);
        return iA;
    }

    @Override // java.io.InputStream
    public int read(byte[] output, int offset, int length) throws IOException {
        if (this.f50662d == this.f50661c) {
            return -1;
        }
        int iLimit = this.f50660b.limit();
        int i10 = this.f50663e;
        int i11 = iLimit - i10;
        if (length > i11) {
            length = i11;
        }
        if (this.f50664f) {
            System.arraycopy(this.f50665g, i10 + this.f50666h, output, offset, length);
            b(length);
            return length;
        }
        int iPosition = this.f50660b.position();
        v1.e(this.f50660b, this.f50663e);
        this.f50660b.get(output, offset, length);
        v1.e(this.f50660b, iPosition);
        b(length);
        return length;
    }
}
