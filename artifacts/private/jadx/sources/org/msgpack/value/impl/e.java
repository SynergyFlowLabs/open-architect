package org.msgpack.value.impl;

import java.io.IOException;
import java.util.Arrays;
import org.msgpack.value.x;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes14.dex */
public class e extends a implements org.msgpack.value.g {
    public e(byte[] bArr) {
        super(bArr);
    }

    @Override // org.msgpack.value.x
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public org.msgpack.value.g M() {
        return this;
    }

    @Override // org.msgpack.value.x
    public void N(org.msgpack.core.j jVar) throws IOException {
        jVar.j(this.f339377a.length);
        jVar.r0(this.f339377a);
    }

    @Override // org.msgpack.value.x
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.A()) {
            return xVar instanceof e ? Arrays.equals(this.f339377a, ((e) xVar).f339377a) : Arrays.equals(this.f339377a, xVar.n().k());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f339377a);
    }

    @Override // org.msgpack.value.x
    public z i1() {
        return z.BINARY;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public org.msgpack.value.g n() {
        return this;
    }
}
