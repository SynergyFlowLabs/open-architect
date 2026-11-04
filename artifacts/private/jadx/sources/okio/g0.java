package okio;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final RandomAccessFile f334905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z10, @NotNull RandomAccessFile randomAccessFile) {
        super(z10);
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f334905e = randomAccessFile;
    }

    @Override // okio.t
    protected synchronized void m() {
        this.f334905e.close();
    }

    @Override // okio.t
    protected synchronized void o() {
        try {
            this.f334905e.getFD().sync();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okio.t
    protected synchronized int q(long j10, @NotNull byte[] array, int i10, int i11) {
        try {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f334905e.seek(j10);
            int i12 = 0;
            while (i12 < i11) {
                int i13 = this.f334905e.read(array, i10, i11 - i12);
                if (i13 == -1) {
                    if (i12 != 0) {
                        break;
                    }
                    return -1;
                }
                i12 += i13;
            }
            return i12;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okio.t
    protected synchronized void r(long j10) throws Throwable {
        g0 g0Var;
        try {
            try {
                long size = size();
                long j11 = j10 - size;
                if (j11 > 0) {
                    int i10 = (int) j11;
                    g0Var = this;
                    g0Var.x(size, new byte[i10], 0, i10);
                } else {
                    g0Var = this;
                    g0Var.f334905e.setLength(j10);
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
        throw th;
    }

    @Override // okio.t
    protected synchronized long t() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334905e.length();
    }

    @Override // okio.t
    protected synchronized void x(long j10, @NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f334905e.seek(j10);
        this.f334905e.write(array, i10, i11);
    }
}
