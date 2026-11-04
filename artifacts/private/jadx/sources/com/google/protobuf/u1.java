package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
class u1 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator<ByteBuffer> f126403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f126404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f126405c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f126406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f126407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f126408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f126409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f126410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f126411i;

    u1(Iterable<ByteBuffer> data) {
        this.f126403a = data.iterator();
        for (ByteBuffer byteBuffer : data) {
            this.f126405c++;
        }
        this.f126406d = -1;
        if (a()) {
            return;
        }
        this.f126404b = s1.f126328f;
        this.f126406d = 0;
        this.f126407e = 0;
        this.f126411i = 0L;
    }

    private boolean a() {
        this.f126406d++;
        if (!this.f126403a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f126403a.next();
        this.f126404b = next;
        this.f126407e = next.position();
        if (this.f126404b.hasArray()) {
            this.f126408f = true;
            this.f126409g = this.f126404b.array();
            this.f126410h = this.f126404b.arrayOffset();
        } else {
            this.f126408f = false;
            this.f126411i = t4.k(this.f126404b);
            this.f126409g = null;
        }
        return true;
    }

    private void b(int numberOfBytesRead) {
        int i10 = this.f126407e + numberOfBytesRead;
        this.f126407e = i10;
        if (i10 == this.f126404b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f126406d == this.f126405c) {
            return -1;
        }
        if (this.f126408f) {
            int i10 = this.f126409g[this.f126407e + this.f126410h] & 255;
            b(1);
            return i10;
        }
        int iA = t4.A(((long) this.f126407e) + this.f126411i) & 255;
        b(1);
        return iA;
    }

    @Override // java.io.InputStream
    public int read(byte[] output, int offset, int length) throws IOException {
        if (this.f126406d == this.f126405c) {
            return -1;
        }
        int iLimit = this.f126404b.limit();
        int i10 = this.f126407e;
        int i11 = iLimit - i10;
        if (length > i11) {
            length = i11;
        }
        if (this.f126408f) {
            System.arraycopy(this.f126409g, i10 + this.f126410h, output, offset, length);
            b(length);
            return length;
        }
        int iPosition = this.f126404b.position();
        v1.e(this.f126404b, this.f126407e);
        this.f126404b.get(output, offset, length);
        v1.e(this.f126404b, iPosition);
        b(length);
        return length;
    }
}
