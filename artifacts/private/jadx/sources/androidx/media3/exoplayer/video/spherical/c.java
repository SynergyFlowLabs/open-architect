package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import androidx.media3.common.util.t;
import androidx.media3.common.util.v0;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f66461a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f66462b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0<float[]> f66463c = new v0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66464d;

    public static void a(float[] fArr, float[] fArr2) {
        t.b0(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length == 0.0f) {
            t.b0(fArr);
        } else {
            int i10 = 1 << 0;
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArrJ = this.f66463c.j(j10);
        if (fArrJ == null) {
            return false;
        }
        b(this.f66462b, fArrJ);
        if (!this.f66464d) {
            a(this.f66461a, this.f66462b);
            this.f66464d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f66461a, 0, this.f66462b, 0);
        return true;
    }

    public void d() {
        this.f66463c.c();
        this.f66464d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f66463c.a(j10, fArr);
    }
}
