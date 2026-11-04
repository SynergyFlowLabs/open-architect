package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@f
final class d extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InputStream f312554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f312555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f312556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f312557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final byte[] f312558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final byte[] f312559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final byte[] f312560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f312561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f312562i;

    public d(@NotNull InputStream input, @NotNull a base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f312554a = input;
        this.f312555b = base64;
        this.f312558e = new byte[1];
        this.f312559f = new byte[1024];
        this.f312560g = new byte[1024];
    }

    private final void a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f312560g;
        int i12 = this.f312561h;
        ArraysKt.copyInto(bArr2, bArr, i10, i12, i12 + i11);
        this.f312561h += i11;
        f();
    }

    private final int b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = this.f312562i;
        this.f312562i = i13 + this.f312555b.o(this.f312559f, this.f312560g, i13, 0, i12);
        int iMin = Math.min(c(), i11 - i10);
        a(bArr, i10, iMin);
        g();
        return iMin;
    }

    private final int c() {
        return this.f312562i - this.f312561h;
    }

    private final int d(int i10) throws IOException {
        this.f312559f[i10] = a.f312535i;
        if ((i10 & 3) != 2) {
            return i10 + 1;
        }
        int iE = e();
        if (iE >= 0) {
            this.f312559f[i10 + 1] = (byte) iE;
        }
        return i10 + 2;
    }

    private final int e() throws IOException {
        int i10;
        if (!this.f312555b.F()) {
            return this.f312554a.read();
        }
        do {
            i10 = this.f312554a.read();
            if (i10 == -1) {
                break;
            }
        } while (!c.g(i10));
        return i10;
    }

    private final void f() {
        if (this.f312561h == this.f312562i) {
            this.f312561h = 0;
            this.f312562i = 0;
        }
    }

    private final void g() {
        byte[] bArr = this.f312560g;
        int length = bArr.length;
        int i10 = this.f312562i;
        if ((this.f312559f.length / 4) * 3 > length - i10) {
            ArraysKt.copyInto(bArr, bArr, 0, this.f312561h, i10);
            this.f312562i -= this.f312561h;
            this.f312561h = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f312556c) {
            return;
        }
        this.f312556c = true;
        this.f312554a.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f312561h;
        if (i10 < this.f312562i) {
            int i11 = this.f312560g[i10] & 255;
            this.f312561h = i10 + 1;
            f();
            return i11;
        }
        int i12 = read(this.f312558e, 0, 1);
        if (i12 == -1) {
            return -1;
        }
        if (i12 == 1) {
            return this.f312558e[0] & 255;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] destination, int i10, int i11) throws IOException {
        int i12;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (i10 >= 0 && i11 >= 0 && (i12 = i10 + i11) <= destination.length) {
            if (!this.f312556c) {
                if (this.f312557d) {
                    return -1;
                }
                if (i11 == 0) {
                    return 0;
                }
                if (c() >= i11) {
                    a(destination, i10, i11);
                    return i11;
                }
                int iC = (((i11 - c()) + 2) / 3) * 4;
                int iB = i10;
                while (true) {
                    z10 = this.f312557d;
                    if (z10 || iC <= 0) {
                        break;
                    }
                    int iMin = Math.min(this.f312559f.length, iC);
                    int iD = 0;
                    while (true) {
                        z11 = this.f312557d;
                        if (z11 || iD >= iMin) {
                            break;
                        }
                        int iE = e();
                        if (iE == -1) {
                            this.f312557d = true;
                        } else if (iE != 61) {
                            this.f312559f[iD] = (byte) iE;
                            iD++;
                        } else {
                            iD = d(iD);
                            this.f312557d = true;
                        }
                    }
                    if (!z11 && iD != iMin) {
                        throw new IllegalStateException("Check failed.");
                    }
                    iC -= iD;
                    iB += b(destination, iB, i12, iD);
                }
                if (iB == i10 && z10) {
                    return -1;
                }
                return iB - i10;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + i10 + ", length: " + i11 + ", buffer size: " + destination.length);
    }
}
