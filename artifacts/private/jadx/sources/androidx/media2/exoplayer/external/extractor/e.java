package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e implements j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f53998h = 65536;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f53999i = 524288;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f54000j = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l f54002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f54004d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54007g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f54005e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f54001a = new byte[4096];

    public e(androidx.media2.exoplayer.external.upstream.l dataSource, long position, long length) {
        this.f54002b = dataSource;
        this.f54004d = position;
        this.f54003c = length;
    }

    private void a(int bytesRead) {
        if (bytesRead != -1) {
            this.f54004d += (long) bytesRead;
        }
    }

    private void c(int length) {
        int i10 = this.f54006f + length;
        byte[] bArr = this.f54005e;
        if (i10 > bArr.length) {
            this.f54005e = Arrays.copyOf(this.f54005e, q0.r(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    private int f(byte[] target, int offset, int length, int bytesAlreadyRead, boolean allowEndOfInput) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i10 = this.f54002b.read(target, offset + bytesAlreadyRead, length - bytesAlreadyRead);
        if (i10 != -1) {
            return bytesAlreadyRead + i10;
        }
        if (bytesAlreadyRead == 0 && allowEndOfInput) {
            return -1;
        }
        throw new EOFException();
    }

    private int h(byte[] target, int offset, int length) {
        int i10 = this.f54007g;
        if (i10 == 0) {
            return 0;
        }
        int iMin = Math.min(i10, length);
        System.arraycopy(this.f54005e, 0, target, offset, iMin);
        q(iMin);
        return iMin;
    }

    private int j(int length) {
        int iMin = Math.min(this.f54007g, length);
        q(iMin);
        return iMin;
    }

    private void q(int bytesConsumed) {
        int i10 = this.f54007g - bytesConsumed;
        this.f54007g = i10;
        this.f54006f = 0;
        byte[] bArr = this.f54005e;
        byte[] bArr2 = i10 < bArr.length - 524288 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, bytesConsumed, bArr2, 0, i10);
        this.f54005e = bArr2;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public int b(int length) throws InterruptedException, IOException {
        e eVar;
        int iJ = j(length);
        if (iJ == 0) {
            byte[] bArr = this.f54001a;
            eVar = this;
            iJ = eVar.f(bArr, 0, Math.min(length, bArr.length), 0, true);
        } else {
            eVar = this;
        }
        eVar.a(iJ);
        return iJ;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public boolean d(int length, boolean allowEndOfInput) throws InterruptedException, IOException {
        int iJ = j(length);
        while (iJ < length && iJ != -1) {
            iJ = f(this.f54001a, -iJ, Math.min(length, this.f54001a.length + iJ), iJ, allowEndOfInput);
        }
        a(iJ);
        return iJ != -1;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public boolean e(byte[] target, int offset, int length, boolean allowEndOfInput) throws InterruptedException, IOException {
        int iH = h(target, offset, length);
        while (iH < length && iH != -1) {
            iH = f(target, offset, length, iH, allowEndOfInput);
        }
        a(iH);
        return iH != -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // androidx.media2.exoplayer.external.extractor.j
    public <E extends Throwable> void g(long position, E e10) throws Throwable {
        androidx.media2.exoplayer.external.util.a.a(position >= 0);
        this.f54004d = position;
        throw e10;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public long getLength() {
        return this.f54003c;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public long getPosition() {
        return this.f54004d;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public void i(byte[] target, int offset, int length) throws InterruptedException, IOException {
        k(target, offset, length, false);
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public boolean k(byte[] target, int offset, int length, boolean allowEndOfInput) throws InterruptedException, IOException {
        if (!p(length, allowEndOfInput)) {
            return false;
        }
        System.arraycopy(this.f54005e, this.f54006f - length, target, offset, length);
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public void l() {
        this.f54006f = 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public long m() {
        return this.f54004d + ((long) this.f54006f);
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public void n(int length) throws InterruptedException, IOException {
        p(length, false);
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public void o(int length) throws InterruptedException, IOException {
        d(length, false);
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public boolean p(int length, boolean allowEndOfInput) throws InterruptedException, IOException {
        c(length);
        int iF = this.f54007g - this.f54006f;
        while (iF < length) {
            e eVar = this;
            int i10 = length;
            boolean z10 = allowEndOfInput;
            iF = eVar.f(this.f54005e, this.f54006f, i10, iF, z10);
            if (iF == -1) {
                return false;
            }
            eVar.f54007g = eVar.f54006f + iF;
            this = eVar;
            length = i10;
            allowEndOfInput = z10;
        }
        this.f54006f += length;
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public int read(byte[] target, int offset, int length) throws InterruptedException, IOException {
        e eVar;
        int iH = h(target, offset, length);
        if (iH == 0) {
            eVar = this;
            iH = eVar.f(target, offset, length, 0, true);
        } else {
            eVar = this;
        }
        eVar.a(iH);
        return iH;
    }

    @Override // androidx.media2.exoplayer.external.extractor.j
    public void readFully(byte[] target, int offset, int length) throws InterruptedException, IOException {
        e(target, offset, length, false);
    }
}
