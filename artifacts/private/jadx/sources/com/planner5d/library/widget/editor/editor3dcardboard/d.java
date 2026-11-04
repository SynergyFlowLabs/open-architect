package com.planner5d.library.widget.editor.editor3dcardboard;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f255937a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f255938b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f255939c = new Handler();

    private static class a implements Runnable, SensorEventListener {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f255940k = 20;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f255941l = 40;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final float f255942m = 30.0f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final float f255943n = 130.0f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SensorManager f255944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Sensor f255945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<float[]> f255946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float[] f255947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.planner5d.library.activity.b f255948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Handler f255949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Thread f255950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f255951h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Object f255952i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f255953j;

        private void a(float[] fArr) {
            if (this.f255946c.size() > 40) {
                this.f255946c.remove(0);
            }
            this.f255946c.add(fArr);
            e();
        }

        private float b(float[] fArr) {
            float fMax = 0.0f;
            for (float f10 : fArr) {
                fMax = Math.max(f10, fMax);
            }
            return fMax;
        }

        private float c(float[] fArr) {
            float fMin = 0.0f;
            for (float f10 : fArr) {
                fMin = Math.min(f10, fMin);
            }
            return fMin;
        }

        private float[] d(int i10, float[] fArr) {
            for (int i11 = 0; i11 < 20; i11++) {
                float[] fArr2 = this.f255946c.get(i10 + i11);
                float[] fArr3 = {fArr2[0] - fArr[0], fArr2[1] - fArr[1], fArr2[2] - fArr[2]};
                float[] fArr4 = this.f255947d;
                float f10 = fArr3[0];
                float f11 = fArr3[1];
                float f12 = (f10 * f10) + (f11 * f11);
                float f13 = fArr3[2];
                fArr4[i11] = (float) Math.sqrt(f12 + (f13 * f13));
            }
            return this.f255947d;
        }

        private void e() {
            if (this.f255946c.size() < 40) {
                return;
            }
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            ArrayList<float[]> arrayList = this.f255946c;
            boolean z10 = true | true;
            float[] fArr3 = arrayList.get(arrayList.size() - 1);
            for (int i10 = 0; i10 < 2; i10++) {
                float[] fArrD = d(i10 * 20, fArr3);
                fArr[i10] = b(fArrD);
                fArr2[i10] = c(fArrD);
            }
            if (fArr2[0] >= f255942m || fArr[1] <= f255943n) {
                return;
            }
            f();
        }

        private void f() {
            this.f255946c.clear();
            synchronized (this) {
                try {
                    final com.planner5d.library.activity.b bVar = this.f255948e;
                    if (bVar != null) {
                        Handler handler = this.f255949f;
                        Objects.requireNonNull(bVar);
                        handler.post(new Runnable() { // from class: com.planner5d.library.widget.editor.editor3dcardboard.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                bVar.F();
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void g() {
            synchronized (this.f255952i) {
                try {
                    this.f255953j = true;
                    Handler handler = this.f255951h;
                    if (handler == null) {
                        return;
                    }
                    handler.getLooper().quit();
                    this.f255944a.unregisterListener(this);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.equals(this.f255945b)) {
                float[] fArr = sensorEvent.values;
                if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
                    a((float[]) fArr.clone());
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Looper.prepare();
            synchronized (this.f255952i) {
                try {
                    if (this.f255953j) {
                        return;
                    }
                    this.f255951h = new Handler(Looper.myLooper());
                    this.f255944a.registerListener(this, this.f255945b, 1);
                    Looper.loop();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private a(com.planner5d.library.activity.b bVar, Handler handler) {
            this.f255946c = new ArrayList<>();
            this.f255947d = new float[20];
            this.f255951h = null;
            this.f255952i = new Object();
            this.f255953j = false;
            SensorManager sensorManager = (SensorManager) bVar.getSystemService("sensor");
            this.f255944a = sensorManager;
            this.f255945b = sensorManager.getDefaultSensor(2);
            this.f255948e = bVar;
            this.f255949f = handler;
            Thread thread = new Thread(this, "MagnetTriggerDetector");
            this.f255950g = thread;
            thread.start();
        }
    }

    public void a(com.planner5d.library.activity.b bVar) {
        a aVar;
        synchronized (this.f255938b) {
            try {
                aVar = this.f255937a;
                this.f255937a = new a(bVar, this.f255939c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.g();
        }
    }

    public void b() {
        a aVar;
        synchronized (this.f255938b) {
            aVar = this.f255937a;
            this.f255937a = null;
        }
        if (aVar != null) {
            aVar.g();
        }
    }
}
