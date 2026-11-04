package kotlinx.io;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface x extends o {
    @k
    static /* synthetic */ void K1() {
    }

    static /* synthetic */ void X3(x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        xVar.write(bArr, i10, i11);
    }

    void Rd(@NotNull p pVar, long j10);

    @k
    void Z3();

    void f1();

    @Override // kotlinx.io.o, java.io.Flushable
    void flush();

    long la(@NotNull p pVar);

    void m6(byte b10);

    @NotNull
    b n();

    void oc(short s10);

    void write(@NotNull byte[] bArr, int i10, int i11);

    void writeInt(int i10);

    void writeLong(long j10);
}
