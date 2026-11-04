package org.msgpack.core;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class b extends j {
    protected b(h.b bVar) {
        this(new org.msgpack.core.buffer.b(), bVar);
    }

    private org.msgpack.core.buffer.b y0() {
        return (org.msgpack.core.buffer.b) this.f339307d;
    }

    public List<org.msgpack.core.buffer.h> B0() {
        try {
            flush();
            return y0().c();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public byte[] H0() {
        try {
            flush();
            return y0().d();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public org.msgpack.core.buffer.h M0() {
        try {
            flush();
            return y0().e();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // org.msgpack.core.j
    public org.msgpack.core.buffer.k Y(org.msgpack.core.buffer.k kVar) throws IOException {
        if (kVar instanceof org.msgpack.core.buffer.b) {
            return super.Y(kVar);
        }
        throw new IllegalArgumentException("MessageBufferPacker accepts only ArrayBufferOutput");
    }

    public void x0() {
        y0().a();
    }

    protected b(org.msgpack.core.buffer.b bVar, h.b bVar2) {
        super(bVar, bVar2);
    }
}
