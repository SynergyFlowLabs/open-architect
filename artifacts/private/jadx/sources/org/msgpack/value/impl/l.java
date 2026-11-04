package org.msgpack.value.impl;

import java.io.IOException;
import java.util.Arrays;
import org.msgpack.value.p;
import org.msgpack.value.x;
import org.msgpack.value.z;

/* JADX INFO: loaded from: classes14.dex */
public class l extends a implements p {
    public l(byte[] bArr) {
        super(bArr);
    }

    @Override // org.msgpack.value.x
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public p M() {
        return this;
    }

    @Override // org.msgpack.value.x
    public void N(org.msgpack.core.j jVar) throws IOException {
        jVar.H(this.f339377a.length);
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
        if (xVar.J()) {
            return xVar instanceof l ? Arrays.equals(this.f339377a, ((l) xVar).f339377a) : Arrays.equals(this.f339377a, xVar.r().k());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f339377a);
    }

    @Override // org.msgpack.value.x
    public z i1() {
        return z.STRING;
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public p r() {
        return this;
    }

    public l(String str) {
        super(str);
    }
}
