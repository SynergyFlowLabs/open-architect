package com.davidehrmann.vcdiff;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class d<OUT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<OUT> f97801a;

    public d(h<OUT> hVar) {
        this.f97801a = (h) com.davidehrmann.vcdiff.util.a.b(hVar, "encoder was null");
    }

    public void a(byte[] bArr, int i10, int i11, OUT out) throws IOException {
        this.f97801a.b(out);
        this.f97801a.a(bArr, i10, i11, out);
        this.f97801a.Q0(out);
    }

    public void b(byte[] bArr, OUT out) throws IOException {
        a(bArr, 0, bArr.length, out);
    }
}
