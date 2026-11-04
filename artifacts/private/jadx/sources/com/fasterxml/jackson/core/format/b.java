package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.io.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InputStream f102357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final byte[] f102358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f102359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f102360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final f f102361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final d f102362f;

    protected b(InputStream inputStream, byte[] bArr, int i10, int i11, f fVar, d dVar) {
        this.f102357a = inputStream;
        this.f102358b = bArr;
        this.f102359c = i10;
        this.f102360d = i11;
        this.f102361e = fVar;
        this.f102362f = dVar;
        if ((i10 | i11) < 0 || i10 + i11 > bArr.length) {
            throw new IllegalArgumentException(String.format("Illegal start/length (%d/%d) wrt input array of %d bytes", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)));
        }
    }

    public JsonParser a() throws IOException {
        f fVar = this.f102361e;
        if (fVar == null) {
            return null;
        }
        return this.f102357a == null ? fVar.a0(this.f102358b, this.f102359c, this.f102360d) : fVar.V(b());
    }

    public InputStream b() {
        return this.f102357a == null ? new ByteArrayInputStream(this.f102358b, this.f102359c, this.f102360d) : new h(null, this.f102357a, this.f102358b, this.f102359c, this.f102360d);
    }

    public f c() {
        return this.f102361e;
    }

    public d d() {
        d dVar = this.f102362f;
        return dVar == null ? d.INCONCLUSIVE : dVar;
    }

    public String e() {
        return this.f102361e.l0();
    }

    public boolean f() {
        return this.f102361e != null;
    }
}
