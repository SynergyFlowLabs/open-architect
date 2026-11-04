package androidx.media2.exoplayer.external.video;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f57750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f57754e;

    private a(List<byte[]> initializationData, int nalUnitLengthFieldLength, int width, int height, float pixelWidthAspectRatio) {
        this.f57750a = initializationData;
        this.f57751b = nalUnitLengthFieldLength;
        this.f57752c = width;
        this.f57753d = height;
        this.f57754e = pixelWidthAspectRatio;
    }

    private static byte[] a(x data) {
        int iJ = data.J();
        int iC = data.c();
        data.R(iJ);
        return androidx.media2.exoplayer.external.util.d.d(data.f57720a, iC, iJ);
    }

    public static a b(x data) throws k0 {
        float f10;
        int i10;
        int i11;
        try {
            data.R(4);
            int iD = (data.D() & 3) + 1;
            if (iD == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iD2 = data.D() & 31;
            for (int i12 = 0; i12 < iD2; i12++) {
                arrayList.add(a(data));
            }
            int iD3 = data.D();
            for (int i13 = 0; i13 < iD3; i13++) {
                arrayList.add(a(data));
            }
            if (iD2 > 0) {
                androidx.media2.exoplayer.external.util.t.b bVarI = androidx.media2.exoplayer.external.util.t.i((byte[]) arrayList.get(0), iD, ((byte[]) arrayList.get(0)).length);
                int i14 = bVarI.f57701e;
                int i15 = bVarI.f57702f;
                f10 = bVarI.f57703g;
                i10 = i14;
                i11 = i15;
            } else {
                f10 = 1.0f;
                i10 = -1;
                i11 = -1;
            }
            return new a(arrayList, iD, i10, i11, f10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new k0("Error parsing AVC config", e10);
        }
    }
}
