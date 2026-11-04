package u9;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes5.dex */
public class a implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f381194b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SensorManager f381198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Sensor f381199g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f381193a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f381195c = new b(120, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f381196d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f381197e = false;

    public a(Activity activity) {
        this.f381194b = activity;
    }

    private void a(boolean z10) {
        if (z10 == this.f381197e) {
            return;
        }
        if (z10) {
            this.f381194b.getWindow().addFlags(128);
        } else {
            this.f381194b.getWindow().clearFlags(128);
        }
        this.f381197e = z10;
    }

    private void e() {
        if (this.f381193a || !this.f381195c.f()) {
            a(true);
        } else {
            a(this.f381195c.c() > 0.2f);
        }
    }

    public void b(boolean z10) {
        this.f381193a = z10;
        e();
    }

    public void c() {
        if (this.f381198f == null) {
            this.f381198f = (SensorManager) this.f381194b.getSystemService("sensor");
        }
        if (this.f381199g == null) {
            this.f381199g = this.f381198f.getDefaultSensor(1);
        }
        this.f381197e = false;
        a(true);
        this.f381195c.e();
        this.f381198f.registerListener(this, this.f381199g, 250000);
    }

    public void d() {
        SensorManager sensorManager = this.f381198f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        a(false);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if ((sensorEvent.timestamp - this.f381196d) / 1000000 < 250) {
            return;
        }
        this.f381195c.a(sensorEvent.values);
        this.f381196d = sensorEvent.timestamp;
        e();
    }
}
