package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.w;
import androidx.media3.datasource.x;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class k extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f64924l = 16384;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f64925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f64926k;

    public k(androidx.media3.datasource.p pVar, x xVar, int i10, w wVar, int i11, @p0 Object obj, @p0 byte[] bArr) {
        super(pVar, xVar, i10, wVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f64925j = bArr == null ? k1.f61545f : bArr;
    }

    private void i(int i10) {
        byte[] bArr = this.f64925j;
        if (bArr.length < i10 + 16384) {
            this.f64925j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public final void a() throws IOException {
        try {
            this.f64888i.c(this.f64881b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f64926k) {
                i(i11);
                i10 = this.f64888i.read(this.f64925j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f64926k) {
                g(this.f64925j, i11);
            }
            androidx.media3.datasource.w.a(this.f64888i);
        } catch (Throwable th2) {
            androidx.media3.datasource.w.a(this.f64888i);
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.o.e
    public final void b() {
        this.f64926k = true;
    }

    protected abstract void g(byte[] bArr, int i10) throws IOException;

    public byte[] h() {
        return this.f64925j;
    }
}
