package androidx.media2.exoplayer.external.video;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public final List<byte[]> f57758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57759b;

    private c(@p0 List<byte[]> initializationData, int nalUnitLengthFieldLength) {
        this.f57758a = initializationData;
        this.f57759b = nalUnitLengthFieldLength;
    }

    public static c a(x data) throws k0 {
        try {
            data.R(21);
            int iD = data.D() & 3;
            int iD2 = data.D();
            int iC = data.c();
            int i10 = 0;
            for (int i11 = 0; i11 < iD2; i11++) {
                data.R(1);
                int iJ = data.J();
                for (int i12 = 0; i12 < iJ; i12++) {
                    int iJ2 = data.J();
                    i10 += iJ2 + 4;
                    data.R(iJ2);
                }
            }
            data.Q(iC);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            for (int i14 = 0; i14 < iD2; i14++) {
                data.R(1);
                int iJ3 = data.J();
                for (int i15 = 0; i15 < iJ3; i15++) {
                    int iJ4 = data.J();
                    byte[] bArr2 = androidx.media2.exoplayer.external.util.t.f57686b;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(data.f57720a, data.c(), bArr, length, iJ4);
                    i13 = length + iJ4;
                    data.R(iJ4);
                }
            }
            return new c(i10 == 0 ? null : Collections.singletonList(bArr), iD + 1);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new k0("Error parsing HEVC config", e10);
        }
    }
}
