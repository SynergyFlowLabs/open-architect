package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f66465a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f66466b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f66467c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f66468d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Display f66469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f66470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f66471g;

    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f66469e = display;
        this.f66470f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f66466b);
        SensorManager.getOrientation(this.f66466b, this.f66468d);
        return this.f66468d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f66470f) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f66471g) {
            c.a(this.f66467c, fArr);
            this.f66471g = true;
        }
        float[] fArr2 = this.f66466b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f66466b, 0, this.f66467c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f66466b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f66466b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    @androidx.annotation.g
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f66465a, sensorEvent.values);
        d(this.f66465a, this.f66469e.getRotation());
        float fA = a(this.f66465a);
        e(this.f66465a);
        c(this.f66465a);
        b(this.f66465a, fA);
    }
}
