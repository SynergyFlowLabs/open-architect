package com.davidehrmann.vcdiff.engine;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes3.dex */
public class p<OUT> implements com.davidehrmann.vcdiff.h<OUT> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final org.slf4j.c f97956f = org.slf4j.e.k(p.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final l f97957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final EnumSet<com.davidehrmann.vcdiff.f> f97958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f97959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final com.davidehrmann.vcdiff.a<OUT> f97960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f97961e;

    public p(com.davidehrmann.vcdiff.a<OUT> aVar, c cVar, EnumSet<com.davidehrmann.vcdiff.f> enumSet, boolean z10) {
        this.f97957a = cVar.a();
        this.f97958b = enumSet.clone();
        this.f97959c = z10;
        this.f97960d = aVar;
    }

    @Override // com.davidehrmann.vcdiff.h
    public void Q0(OUT out) throws IOException {
        if (!this.f97961e) {
            throw new IllegalStateException("finishEncoding called before startEncoding");
        }
        this.f97961e = false;
        this.f97960d.Q0(out);
    }

    @Override // com.davidehrmann.vcdiff.h
    public void a(byte[] bArr, int i10, int i11, OUT out) throws IOException {
        if (!this.f97961e) {
            throw new IllegalStateException("encodeChunk called before startEncoding");
        }
        if (this.f97958b.contains(com.davidehrmann.vcdiff.f.GOOGLE_CHECKSUM)) {
            com.davidehrmann.vcdiff.util.c cVar = new com.davidehrmann.vcdiff.util.c();
            cVar.update(bArr, i10, i11);
            this.f97960d.S0((int) cVar.getValue());
        }
        this.f97957a.b(ByteBuffer.wrap(bArr, i10, i11).slice(), this.f97959c, out, this.f97960d);
    }

    @Override // com.davidehrmann.vcdiff.h
    public void b(OUT out) throws IOException {
        this.f97960d.W0(this.f97957a.e());
        this.f97960d.U0(out, this.f97958b);
        this.f97961e = true;
    }

    @Override // com.davidehrmann.vcdiff.h
    public void c(byte[] bArr, OUT out) throws IOException {
        a(bArr, 0, bArr.length, out);
    }
}
