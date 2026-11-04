package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@f
final class e extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final OutputStream f312563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f312564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f312565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f312566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final byte[] f312567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final byte[] f312568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f312569g;

    public e(@NotNull OutputStream output, @NotNull a base64) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.f312563a = output;
        this.f312564b = base64;
        this.f312566d = base64.F() ? 76 : -1;
        this.f312567e = new byte[1024];
        this.f312568f = new byte[3];
    }

    private final void a() throws IOException {
        if (this.f312565c) {
            throw new IOException("The output stream is closed.");
        }
    }

    private final int b(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(3 - this.f312569g, i11 - i10);
        ArraysKt.copyInto(bArr, this.f312568f, this.f312569g, i10, i10 + iMin);
        int i12 = this.f312569g + iMin;
        this.f312569g = i12;
        if (i12 == 3) {
            c();
        }
        return iMin;
    }

    private final void c() {
        if (d(this.f312568f, 0, this.f312569g) != 4) {
            throw new IllegalStateException("Check failed.");
        }
        this.f312569g = 0;
    }

    private final int d(byte[] bArr, int i10, int i11) throws IOException {
        int iU = this.f312564b.u(bArr, this.f312567e, 0, i10, i11);
        if (this.f312566d == 0) {
            this.f312563a.write(a.f312530d.L());
            this.f312566d = 76;
            if (iU > 76) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.f312563a.write(this.f312567e, 0, iU);
        this.f312566d -= iU;
        return iU;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f312565c) {
            return;
        }
        this.f312565c = true;
        if (this.f312569g != 0) {
            c();
        }
        this.f312563a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f312563a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        a();
        byte[] bArr = this.f312568f;
        int i11 = this.f312569g;
        int i12 = i11 + 1;
        this.f312569g = i12;
        bArr[i11] = (byte) i10;
        if (i12 == 3) {
            c();
        }
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] source, int i10, int i11) throws IOException {
        int i12;
        Intrinsics.checkNotNullParameter(source, "source");
        a();
        if (i10 < 0 || i11 < 0 || (i12 = i10 + i11) > source.length) {
            throw new IndexOutOfBoundsException("offset: " + i10 + ", length: " + i11 + ", source size: " + source.length);
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.f312569g;
        if (i13 < 3) {
            if (i13 != 0) {
                i10 += b(source, i10, i12);
                if (this.f312569g != 0) {
                    return;
                }
            }
            while (i10 + 3 <= i12) {
                int iMin = Math.min((this.f312564b.F() ? this.f312566d : this.f312567e.length) / 4, (i12 - i10) / 3);
                int i14 = (iMin * 3) + i10;
                if (d(source, i10, i14) != iMin * 4) {
                    throw new IllegalStateException("Check failed.");
                }
                i10 = i14;
            }
            ArraysKt.copyInto(source, this.f312568f, 0, i10, i12);
            this.f312569g = i12 - i10;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
