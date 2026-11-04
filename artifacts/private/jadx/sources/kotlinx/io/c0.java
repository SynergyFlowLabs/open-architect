package kotlinx.io;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface c0 extends p {
    @k
    static /* synthetic */ void K1() {
    }

    static /* synthetic */ int y8(c0 c0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAtMostTo");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return c0Var.Rc(bArr, i10, i11);
    }

    int Rc(@NotNull byte[] bArr, int i10, int i11);

    long T8(@NotNull o oVar);

    void ic(@NotNull o oVar, long j10);

    @NotNull
    b n();

    @NotNull
    c0 peek();

    void q1(long j10);

    byte readByte();

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j10);

    void skip(long j10);

    boolean y1();
}
