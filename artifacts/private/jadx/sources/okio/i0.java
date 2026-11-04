package okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final FileChannel f334922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(boolean z10, @NotNull FileChannel fileChannel) {
        super(z10);
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.f334922e = fileChannel;
    }

    @Override // okio.t
    protected synchronized void m() {
        this.f334922e.close();
    }

    @Override // okio.t
    protected synchronized void o() {
        this.f334922e.force(true);
    }

    @Override // okio.t
    protected synchronized int q(long j10, @NotNull byte[] array, int i10, int i11) {
        try {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f334922e.position(j10);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, i10, i11);
            int i12 = 0;
            while (i12 < i11) {
                int i13 = this.f334922e.read(byteBufferWrap);
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
        i0 i0Var;
        try {
            try {
                long size = size();
                long j11 = j10 - size;
                if (j11 > 0) {
                    int i10 = (int) j11;
                    i0Var = this;
                    i0Var.x(size, new byte[i10], 0, i10);
                } else {
                    i0Var = this;
                    i0Var.f334922e.truncate(j10);
                }
                return;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    @Override // okio.t
    protected synchronized long t() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334922e.size();
    }

    @Override // okio.t
    protected synchronized void x(long j10, @NotNull byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f334922e.position(j10);
        this.f334922e.write(ByteBuffer.wrap(array, i10, i11));
    }
}
