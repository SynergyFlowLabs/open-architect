package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class c0 implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f67181b;

    public c0(s sVar) {
        this.f67181b = sVar;
    }

    @Override // androidx.media3.extractor.s
    public int b(int i10) throws IOException {
        return this.f67181b.b(i10);
    }

    @Override // androidx.media3.extractor.s
    public boolean d(int i10, boolean z10) throws IOException {
        return this.f67181b.d(i10, z10);
    }

    @Override // androidx.media3.extractor.s
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f67181b.e(bArr, i10, i11, z10);
    }

    @Override // androidx.media3.extractor.s
    public <E extends Throwable> void g(long j10, E e10) throws Throwable {
        this.f67181b.g(j10, e10);
    }

    @Override // androidx.media3.extractor.s
    public long getLength() {
        return this.f67181b.getLength();
    }

    @Override // androidx.media3.extractor.s
    public long getPosition() {
        return this.f67181b.getPosition();
    }

    @Override // androidx.media3.extractor.s
    public void i(byte[] bArr, int i10, int i11) throws IOException {
        this.f67181b.i(bArr, i10, i11);
    }

    @Override // androidx.media3.extractor.s
    public boolean k(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f67181b.k(bArr, i10, i11, z10);
    }

    @Override // androidx.media3.extractor.s
    public void l() {
        this.f67181b.l();
    }

    @Override // androidx.media3.extractor.s
    public long m() {
        return this.f67181b.m();
    }

    @Override // androidx.media3.extractor.s
    public void n(int i10) throws IOException {
        this.f67181b.n(i10);
    }

    @Override // androidx.media3.extractor.s
    public void o(int i10) throws IOException {
        this.f67181b.o(i10);
    }

    @Override // androidx.media3.extractor.s
    public boolean p(int i10, boolean z10) throws IOException {
        return this.f67181b.p(i10, z10);
    }

    @Override // androidx.media3.extractor.s
    public int r(byte[] bArr, int i10, int i11) throws IOException {
        return this.f67181b.r(bArr, i10, i11);
    }

    @Override // androidx.media3.extractor.s, androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f67181b.read(bArr, i10, i11);
    }

    @Override // androidx.media3.extractor.s
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f67181b.readFully(bArr, i10, i11);
    }
}
