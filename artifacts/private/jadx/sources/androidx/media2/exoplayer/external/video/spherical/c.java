package androidx.media2.exoplayer.external.video.spherical;

import android.opengl.Matrix;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.j0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f57888a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f57889b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0<float[]> f57890c = new j0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f57891d;

    public static void a(float[] recenterMatrix, float[] rotationMatrix) {
        Matrix.setIdentityM(recenterMatrix, 0);
        float f10 = rotationMatrix[10];
        float f11 = rotationMatrix[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = rotationMatrix[10];
        recenterMatrix[0] = f12 / fSqrt;
        float f13 = rotationMatrix[8];
        recenterMatrix[2] = f13 / fSqrt;
        recenterMatrix[8] = (-f13) / fSqrt;
        recenterMatrix[10] = f12 / fSqrt;
    }

    private static void b(float[] matrix, float[] angleAxis) {
        float f10 = angleAxis[0];
        float f11 = -angleAxis[1];
        float f12 = -angleAxis[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(matrix, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(matrix, 0);
        }
    }

    public boolean c(float[] matrix, long timestampUs) {
        float[] fArrI = this.f57890c.i(timestampUs);
        if (fArrI == null) {
            return false;
        }
        b(this.f57889b, fArrI);
        if (!this.f57891d) {
            a(this.f57888a, this.f57889b);
            this.f57891d = true;
        }
        Matrix.multiplyMM(matrix, 0, this.f57888a, 0, this.f57889b, 0);
        return true;
    }

    public void d() {
        this.f57890c.c();
        this.f57891d = false;
    }

    public void e(long timestampUs, float[] angleAxis) {
        this.f57890c.a(timestampUs, angleAxis);
    }
}
