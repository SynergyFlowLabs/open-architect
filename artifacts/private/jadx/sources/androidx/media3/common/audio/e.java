package androidx.media3.common.audio;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f60323a = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f60324b = 1.0f;

    private e() {
    }

    public static boolean a(g.a aVar) {
        if (aVar.f60333a == -1 || aVar.f60334b == -1) {
            return false;
        }
        int i10 = aVar.f60335c;
        return i10 == 2 || i10 == 4;
    }

    public static boolean b(g.a aVar, g.a aVar2) {
        return aVar.f60333a == aVar2.f60333a && a(aVar) && a(aVar2);
    }

    private static float c(float f10) {
        return k1.v(f10 * (f10 < 0.0f ? 32768 : 32767), -32768.0f, 32767.0f);
    }

    private static float d(ByteBuffer byteBuffer, boolean z10, boolean z11) {
        if (z11) {
            return z10 ? byteBuffer.getShort() : c(byteBuffer.getFloat());
        }
        return z10 ? e(byteBuffer.getShort()) : byteBuffer.getFloat();
    }

    private static float e(short s10) {
        return s10 / (s10 < 0 ? 32768 : 32767);
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, g.a aVar, ByteBuffer byteBuffer2, g.a aVar2, k kVar, int i10, boolean z10, boolean z11) {
        boolean z12 = aVar.f60335c == 2;
        boolean z13 = aVar2.f60335c == 2;
        int iH = kVar.h();
        int iJ = kVar.j();
        float[] fArr = new float[iH];
        float[] fArr2 = new float[iJ];
        for (int i11 = 0; i11 < i10; i11++) {
            if (z10) {
                int iPosition = byteBuffer2.position();
                for (int i12 = 0; i12 < iJ; i12++) {
                    fArr2[i12] = d(byteBuffer2, z13, z13);
                }
                byteBuffer2.position(iPosition);
            }
            for (int i13 = 0; i13 < iH; i13++) {
                fArr[i13] = d(byteBuffer, z12, z13);
            }
            for (int i14 = 0; i14 < iJ; i14++) {
                for (int i15 = 0; i15 < iH; i15++) {
                    fArr2[i14] = fArr2[i14] + (fArr[i15] * kVar.i(i15, i14));
                }
                if (z13) {
                    byteBuffer2.putShort((short) k1.v(fArr2[i14], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(z11 ? k1.v(fArr2[i14], -1.0f, 1.0f) : fArr2[i14]);
                }
                fArr2[i14] = 0.0f;
            }
        }
        return byteBuffer2;
    }
}
