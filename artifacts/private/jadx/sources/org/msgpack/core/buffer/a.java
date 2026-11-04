package org.msgpack.core.buffer;

import org.msgpack.core.p;

/* JADX INFO: loaded from: classes14.dex */
public class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f339181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f339182b;

    public a(h hVar) {
        this.f339181a = hVar;
        if (hVar == null) {
            this.f339182b = true;
        } else {
            this.f339182b = false;
        }
    }

    public h a(h hVar) {
        h hVar2 = this.f339181a;
        this.f339181a = hVar;
        if (hVar == null) {
            this.f339182b = true;
            return hVar2;
        }
        this.f339182b = false;
        return hVar2;
    }

    public void b(byte[] bArr) {
        a(h.J((byte[]) p.j(bArr, "input array is null")));
    }

    public void c(byte[] bArr, int i10, int i11) {
        a(h.K((byte[]) p.j(bArr, "input array is null"), i10, i11));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f339181a = null;
        this.f339182b = true;
    }

    @Override // org.msgpack.core.buffer.j
    public h next() {
        if (this.f339182b) {
            return null;
        }
        this.f339182b = true;
        return this.f339181a;
    }

    public a(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public a(byte[] bArr, int i10, int i11) {
        this(h.K((byte[]) p.j(bArr, "input array is null"), i10, i11));
    }
}
