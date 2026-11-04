package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface s extends androidx.media3.common.l {
    int b(int i10) throws IOException;

    boolean d(int i10, boolean z10) throws IOException;

    boolean e(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    <E extends Throwable> void g(long j10, E e10) throws Throwable;

    long getLength();

    long getPosition();

    void i(byte[] bArr, int i10, int i11) throws IOException;

    boolean k(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void l();

    long m();

    void n(int i10) throws IOException;

    void o(int i10) throws IOException;

    boolean p(int i10, boolean z10) throws IOException;

    int r(byte[] bArr, int i10, int i11) throws IOException;

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    int read(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
