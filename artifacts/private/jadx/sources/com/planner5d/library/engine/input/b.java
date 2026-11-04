package com.planner5d.library.engine.input;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.planner5d.library.engine.k;
import com.planner5d.library.engine.l;
import com.planner5d.library.services.utility.k2;
import com.planner5d.library.services.utility.o3;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class b implements f, View.OnKeyListener, View.OnTouchListener {

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final int f160570y3 = 20;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f160571z3 = 260;
    private int H1;
    private Handler Y;
    public final com.planner5d.library.engine.a Z;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    protected final Vibrator f160581h3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public boolean f160585j3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f160590m;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    final Context f160596p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final com.planner5d.library.engine.input.d f160597p1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private l f160599p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private final vb.b f160600q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private final f.c f160601r3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private SensorEventListener f160605t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private SensorEventListener f160606u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private SensorManager f160607v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    k2<c> f160572a = new a(16, 1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k2<e> f160573b = new C1543b(16, 1000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<View.OnKeyListener> f160574c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<c> f160575d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<e> f160576e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f160577f = new int[20];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int[] f160578g = new int[20];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f160580h = new int[20];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f160582i = new int[20];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean[] f160584j = new boolean[20];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int[] f160586k = new int[20];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int[] f160588l = new int[20];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f160592n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean[] f160594o = new boolean[f160571z3];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f160602s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean[] f160604t = new boolean[f160571z3];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f160609w = false;
    private final float[] X = new float[3];

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f160598p2 = false;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f160579g3 = false;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f160583i3 = false;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private final float[] f160587k3 = new float[3];

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private float f160589l3 = 0.0f;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private float f160591m3 = 0.0f;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private float f160593n3 = 0.0f;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private boolean f160595o3 = false;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private long f160603s3 = System.nanoTime();

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    boolean f160608v3 = true;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    final float[] f160610w3 = new float[9];

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    final float[] f160611x3 = new float[3];

    class a extends k2<c> {
        a(int i10, int i11) {
            super(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.planner5d.library.services.utility.k2
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public c d() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.engine.input.b$b, reason: collision with other inner class name */
    class C1543b extends k2<e> {
        C1543b(int i10, int i11) {
            super(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.planner5d.library.services.utility.k2
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public e d() {
            return new e();
        }
    }

    static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f160614e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f160615f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f160616g = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f160617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f160618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f160619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        char f160620d;

        c() {
        }
    }

    private class d implements SensorEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float[] f160621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f160622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final f.c f160623c;

        d(f.c cVar, float[] fArr, float[] fArr2) {
            this.f160621a = fArr;
            this.f160622b = fArr2;
            this.f160623c = cVar;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                if (this.f160623c == f.c.Portrait) {
                    float[] fArr = sensorEvent.values;
                    float[] fArr2 = this.f160621a;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                } else {
                    float[] fArr3 = this.f160621a;
                    float[] fArr4 = sensorEvent.values;
                    fArr3[0] = fArr4[1];
                    fArr3[1] = -fArr4[0];
                    fArr3[2] = fArr4[2];
                }
            }
            if (sensorEvent.sensor.getType() == 2) {
                float[] fArr5 = sensorEvent.values;
                float[] fArr6 = this.f160622b;
                System.arraycopy(fArr5, 0, fArr6, 0, fArr6.length);
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f160625h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f160626i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f160627j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f160628k = 3;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f160629l = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f160630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f160631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f160632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f160633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f160634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f160635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f160636g;
    }

    public b(com.planner5d.library.engine.a aVar, Context context, Object obj, vb.b bVar) {
        int i10 = 0;
        this.H1 = 0;
        if (obj instanceof View) {
            View view = (View) obj;
            view.setOnKeyListener(this);
            view.setOnTouchListener(this);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
        this.f160600q3 = bVar;
        while (true) {
            int[] iArr = this.f160588l;
            if (i10 >= iArr.length) {
                break;
            }
            iArr[i10] = -1;
            i10++;
        }
        this.Y = new Handler();
        this.Z = aVar;
        this.f160596p0 = context;
        this.H1 = bVar.f385719j;
        com.planner5d.library.engine.input.c cVar = new com.planner5d.library.engine.input.c();
        this.f160597p1 = cVar;
        this.f160590m = cVar.a(context);
        this.f160581h3 = (Vibrator) context.getSystemService("vibrator");
        int iT6 = t6();
        k.b bVarB = aVar.m().b();
        if (((iT6 == 0 || iT6 == 180) && bVarB.f160766a >= bVarB.f160767b) || ((iT6 == 90 || iT6 == 270) && bVarB.f160766a <= bVarB.f160767b)) {
            this.f160601r3 = f.c.Landscape;
        } else {
            this.f160601r3 = f.c.Portrait;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(boolean z10) {
        InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.d.s(this.f160596p0, InputMethodManager.class);
        if (!z10) {
            inputMethodManager.hideSoftInputFromWindow(((vb.a) this.Z).getView().getWindowToken(), 0);
            return;
        }
        View view = ((vb.a) this.Z).getView();
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        inputMethodManager.showSoftInput(((vb.a) this.Z).getView(), 0);
    }

    private int[] j(int[] iArr) {
        int[] iArr2 = new int[iArr.length + 2];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private boolean[] k(boolean[] zArr) {
        boolean[] zArr2 = new boolean[zArr.length + 2];
        System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
        return zArr2;
    }

    private void m() {
        if (SensorManager.getRotationMatrix(this.f160610w3, null, this.X, this.f160587k3)) {
            SensorManager.getOrientation(this.f160610w3, this.f160611x3);
            this.f160589l3 = (float) Math.toDegrees(this.f160611x3[0]);
            this.f160591m3 = (float) Math.toDegrees(this.f160611x3[1]);
            this.f160593n3 = (float) Math.toDegrees(this.f160611x3[2]);
        }
    }

    @Override // com.planner5d.library.engine.input.f
    public int I3(int i10) {
        int i11;
        synchronized (this) {
            i11 = this.f160578g[i10];
        }
        return i11;
    }

    @Override // com.planner5d.library.engine.input.f
    public int N5(int i10) {
        int i11;
        synchronized (this) {
            try {
                i11 = this.f160577f[i10];
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    @Override // com.planner5d.library.engine.input.f
    public void O5(int i10, int i11) {
    }

    @Override // com.planner5d.library.engine.input.f
    public synchronized boolean P5(int i10) {
        try {
            if (i10 == -1) {
                return this.f160592n > 0;
            }
            if (i10 >= 0 && i10 < 260) {
                return this.f160594o[i10];
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.planner5d.library.engine.input.f
    public void Q5(boolean z10) {
        this.f160598p2 = z10;
    }

    @Override // com.planner5d.library.engine.input.f
    public boolean R5() {
        return false;
    }

    @Override // com.planner5d.library.engine.input.f
    public void S5(long[] jArr, int i10) {
        this.f160581h3.vibrate(jArr, i10);
    }

    @Override // com.planner5d.library.engine.input.f
    public long T5() {
        return this.f160603s3;
    }

    @Override // com.planner5d.library.engine.input.f
    public int U5() {
        return this.f160580h[0];
    }

    @Override // com.planner5d.library.engine.input.f
    public boolean V5() {
        synchronized (this) {
            try {
                if (this.f160590m) {
                    for (int i10 = 0; i10 < 20; i10++) {
                        if (this.f160584j[i10]) {
                            return true;
                        }
                    }
                }
                return this.f160584j[0];
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.engine.input.f
    public boolean W5() {
        return this.f160595o3;
    }

    @Override // com.planner5d.library.engine.input.f
    public void X5(l lVar) {
        synchronized (this) {
            try {
                this.f160599p3 = lVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.engine.input.f
    public void Y5(float[] fArr) {
        SensorManager.getRotationMatrix(fArr, null, this.X, this.f160587k3);
    }

    @Override // com.planner5d.library.engine.input.f
    public void Z5() {
        this.f160581h3.cancel();
    }

    @Override // com.planner5d.library.engine.input.f
    public void a6(int i10) {
        this.f160581h3.vibrate(i10);
    }

    public void b(View.OnKeyListener onKeyListener) {
        this.f160574c.add(onKeyListener);
    }

    @Override // com.planner5d.library.engine.input.f
    public synchronized boolean b6(int i10) {
        try {
            if (i10 == -1) {
                return this.f160602s;
            }
            if (i10 >= 0 && i10 < 260) {
                return this.f160604t[i10];
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int c() {
        int length = this.f160588l.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f160588l[i10] == -1) {
                return i10;
            }
        }
        this.f160588l = j(this.f160588l);
        this.f160577f = j(this.f160577f);
        this.f160578g = j(this.f160578g);
        this.f160580h = j(this.f160580h);
        this.f160582i = j(this.f160582i);
        this.f160584j = k(this.f160584j);
        this.f160586k = j(this.f160586k);
        return length;
    }

    @Override // com.planner5d.library.engine.input.f
    public int c6() {
        int i10;
        synchronized (this) {
            try {
                i10 = this.f160577f[0];
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // com.planner5d.library.engine.input.f
    public void d6(final boolean z10) {
        this.Y.post(new Runnable() { // from class: com.planner5d.library.engine.input.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f160568a.d(z10);
            }
        });
    }

    public int e(int i10) {
        int length = this.f160588l.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f160588l[i11] == i10) {
                return i11;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < length; i12++) {
            stringBuffer.append(i12 + ":" + this.f160588l[i12] + " ");
        }
        return -1;
    }

    @Override // com.planner5d.library.engine.input.f
    public l e6() {
        return this.f160599p3;
    }

    public void f() {
        l();
        Arrays.fill(this.f160588l, -1);
        Arrays.fill(this.f160584j, false);
    }

    @Override // com.planner5d.library.engine.input.f
    public float f6() {
        if (!this.f160583i3) {
            return 0.0f;
        }
        m();
        return this.f160593n3;
    }

    public void g() {
        i();
    }

    @Override // com.planner5d.library.engine.input.f
    public boolean g6() {
        return this.f160598p2;
    }

    public void h() {
        synchronized (this) {
            try {
                this.f160595o3 = false;
                if (this.f160602s) {
                    this.f160602s = false;
                    int i10 = 0;
                    while (true) {
                        boolean[] zArr = this.f160604t;
                        if (i10 >= zArr.length) {
                            break;
                        }
                        zArr[i10] = false;
                        i10++;
                    }
                }
                l lVar = this.f160599p3;
                if (lVar != null) {
                    int size = this.f160575d.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        c cVar = this.f160575d.get(i11);
                        this.f160603s3 = cVar.f160617a;
                        int i12 = cVar.f160618b;
                        if (i12 == 0) {
                            lVar.r(cVar.f160619c);
                            this.f160602s = true;
                            this.f160604t[cVar.f160619c] = true;
                        } else if (i12 == 1) {
                            lVar.p(cVar.f160619c);
                        } else if (i12 == 2) {
                            lVar.s(cVar.f160620d);
                        }
                        this.f160572a.b(cVar);
                    }
                    int size2 = this.f160576e.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        e eVar = this.f160576e.get(i13);
                        this.f160603s3 = eVar.f160630a;
                        int i14 = eVar.f160631b;
                        if (i14 == 0) {
                            lVar.d(eVar.f160632c, eVar.f160633d, eVar.f160636g, eVar.f160635f);
                            this.f160595o3 = true;
                        } else if (i14 == 1) {
                            lVar.c(eVar.f160632c, eVar.f160633d, eVar.f160636g, eVar.f160635f);
                        } else if (i14 != 2) {
                            int i15 = 2 | 3;
                            if (i14 == 3) {
                                lVar.l(eVar.f160634e);
                            } else if (i14 == 4) {
                                lVar.n(eVar.f160632c, eVar.f160633d);
                            }
                        } else {
                            lVar.k(eVar.f160632c, eVar.f160633d, eVar.f160636g);
                        }
                        this.f160573b.b(eVar);
                    }
                } else {
                    int size3 = this.f160576e.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        e eVar2 = this.f160576e.get(i16);
                        if (eVar2.f160631b == 0) {
                            this.f160595o3 = true;
                        }
                        this.f160573b.b(eVar2);
                    }
                    int size4 = this.f160575d.size();
                    for (int i17 = 0; i17 < size4; i17++) {
                        this.f160572a.b(this.f160575d.get(i17));
                    }
                }
                if (this.f160576e.size() == 0) {
                    int i18 = 0;
                    while (true) {
                        int[] iArr = this.f160580h;
                        if (i18 >= iArr.length) {
                            break;
                        }
                        iArr[0] = 0;
                        this.f160582i[0] = 0;
                        i18++;
                    }
                }
                this.f160575d.clear();
                this.f160576e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.engine.input.f
    public float h6() {
        if (!this.f160583i3) {
            return 0.0f;
        }
        m();
        return this.f160591m3;
    }

    void i() {
        if (this.f160600q3.f385717h) {
            SensorManager sensorManager = (SensorManager) this.f160596p0.getSystemService("sensor");
            this.f160607v = sensorManager;
            if (sensorManager.getSensorList(1).size() == 0) {
                this.f160609w = false;
            } else {
                Sensor sensor = this.f160607v.getSensorList(1).get(0);
                d dVar = new d(this.f160601r3, this.X, this.f160587k3);
                this.f160605t3 = dVar;
                this.f160609w = this.f160607v.registerListener(dVar, sensor, 1);
            }
        } else {
            this.f160609w = false;
        }
        if (!this.f160600q3.f385718i) {
            this.f160583i3 = false;
            return;
        }
        if (this.f160607v == null) {
            this.f160607v = (SensorManager) this.f160596p0.getSystemService("sensor");
        }
        Sensor defaultSensor = this.f160607v.getDefaultSensor(2);
        if (defaultSensor == null) {
            this.f160583i3 = false;
            return;
        }
        boolean z10 = this.f160609w;
        this.f160583i3 = z10;
        if (z10) {
            d dVar2 = new d(this.f160601r3, this.X, this.f160587k3);
            this.f160606u3 = dVar2;
            this.f160583i3 = this.f160607v.registerListener(dVar2, defaultSensor, 1);
        }
    }

    @Override // com.planner5d.library.engine.input.f
    public void i6(boolean z10) {
        this.f160579g3 = z10;
    }

    @Override // com.planner5d.library.engine.input.f
    public float j6() {
        return this.X[0];
    }

    @Override // com.planner5d.library.engine.input.f
    public boolean k6(int i10) {
        synchronized (this) {
            try {
                boolean z10 = true;
                if (this.f160590m) {
                    for (int i11 = 0; i11 < 20; i11++) {
                        if (this.f160584j[i11] && this.f160586k[i11] == i10) {
                            return true;
                        }
                    }
                }
                if (!this.f160584j[0] || this.f160586k[0] != i10) {
                    z10 = false;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void l() {
        SensorManager sensorManager = this.f160607v;
        if (sensorManager != null) {
            SensorEventListener sensorEventListener = this.f160605t3;
            if (sensorEventListener != null) {
                sensorManager.unregisterListener(sensorEventListener);
                this.f160605t3 = null;
            }
            SensorEventListener sensorEventListener2 = this.f160606u3;
            if (sensorEventListener2 != null) {
                this.f160607v.unregisterListener(sensorEventListener2);
                this.f160606u3 = null;
            }
            this.f160607v = null;
        }
    }

    @Override // com.planner5d.library.engine.input.f
    public void l6(boolean z10) {
    }

    @Override // com.planner5d.library.engine.input.f
    public boolean m6(int i10) {
        boolean z10;
        synchronized (this) {
            z10 = this.f160584j[i10];
        }
        return z10;
    }

    @Override // com.planner5d.library.engine.input.f
    public f.c n6() {
        return this.f160601r3;
    }

    @Override // com.planner5d.library.engine.input.f
    public float o6() {
        if (!this.f160583i3) {
            return 0.0f;
        }
        m();
        return this.f160589l3;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        int size = this.f160574c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f160574c.get(i11).onKey(view, i10, keyEvent)) {
                return true;
            }
        }
        synchronized (this) {
            try {
                if (keyEvent.getKeyCode() == 0 && keyEvent.getAction() == 2) {
                    String characters = keyEvent.getCharacters();
                    for (int i12 = 0; i12 < characters.length(); i12++) {
                        c cVarE = this.f160572a.e();
                        cVarE.f160617a = System.nanoTime();
                        cVarE.f160619c = 0;
                        cVarE.f160620d = characters.charAt(i12);
                        cVarE.f160618b = 2;
                        this.f160575d.add(cVarE);
                    }
                    return false;
                }
                char unicodeChar = (char) keyEvent.getUnicodeChar();
                if (i10 == 67) {
                    unicodeChar = '\b';
                }
                if (keyEvent.getKeyCode() >= 260) {
                    return false;
                }
                int action = keyEvent.getAction();
                if (action == 0) {
                    c cVarE2 = this.f160572a.e();
                    cVarE2.f160617a = System.nanoTime();
                    cVarE2.f160620d = (char) 0;
                    cVarE2.f160619c = keyEvent.getKeyCode();
                    cVarE2.f160618b = 0;
                    if (i10 == 4 && keyEvent.isAltPressed()) {
                        cVarE2.f160619c = 255;
                        i10 = 255;
                    }
                    this.f160575d.add(cVarE2);
                    boolean[] zArr = this.f160594o;
                    int i13 = cVarE2.f160619c;
                    if (!zArr[i13]) {
                        this.f160592n++;
                        zArr[i13] = true;
                    }
                } else if (action == 1) {
                    long jNanoTime = System.nanoTime();
                    c cVarE3 = this.f160572a.e();
                    cVarE3.f160617a = jNanoTime;
                    cVarE3.f160620d = (char) 0;
                    cVarE3.f160619c = keyEvent.getKeyCode();
                    cVarE3.f160618b = 1;
                    if (i10 == 4 && keyEvent.isAltPressed()) {
                        cVarE3.f160619c = 255;
                        i10 = 255;
                    }
                    this.f160575d.add(cVarE3);
                    c cVarE4 = this.f160572a.e();
                    cVarE4.f160617a = jNanoTime;
                    cVarE4.f160620d = unicodeChar;
                    cVarE4.f160619c = 0;
                    cVarE4.f160618b = 2;
                    this.f160575d.add(cVarE4);
                    if (i10 == 255) {
                        boolean[] zArr2 = this.f160594o;
                        if (zArr2[255]) {
                            this.f160592n--;
                            zArr2[255] = false;
                        }
                    } else if (this.f160594o[keyEvent.getKeyCode()]) {
                        this.f160592n--;
                        this.f160594o[keyEvent.getKeyCode()] = false;
                    }
                }
                this.Z.m().a();
                if (i10 == 255) {
                    return true;
                }
                if (this.f160598p2 && i10 == 4) {
                    return true;
                }
                return this.f160579g3 && i10 == 82;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f160608v3 && view != null) {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            this.f160608v3 = false;
        }
        this.f160597p1.b(motionEvent, this);
        int i10 = this.H1;
        if (i10 != 0) {
            o3.c(i10);
        }
        return true;
    }

    @Override // com.planner5d.library.engine.input.f
    public int p6() {
        int i10;
        synchronized (this) {
            try {
                i10 = this.f160578g[0];
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // com.planner5d.library.engine.input.f
    public boolean q6(f.d dVar) {
        if (dVar == f.d.Accelerometer) {
            return this.f160609w;
        }
        if (dVar == f.d.Compass) {
            return this.f160583i3;
        }
        if (dVar == f.d.HardwareKeyboard) {
            return this.f160585j3;
        }
        if (dVar == f.d.OnscreenKeyboard) {
            return true;
        }
        if (dVar == f.d.Vibrator) {
            return this.f160581h3 != null;
        }
        if (dVar == f.d.MultitouchScreen) {
            return this.f160590m;
        }
        return false;
    }

    @Override // com.planner5d.library.engine.input.f
    public int r6() {
        return this.f160582i[0];
    }

    @Override // com.planner5d.library.engine.input.f
    public float s6() {
        return this.X[2];
    }

    @Override // com.planner5d.library.engine.input.f
    public int t6() {
        Context context = this.f160596p0;
        int rotation = context instanceof Activity ? ((Activity) context).getWindowManager().getDefaultDisplay().getRotation() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    @Override // com.planner5d.library.engine.input.f
    public int u6(int i10) {
        return this.f160582i[i10];
    }

    @Override // com.planner5d.library.engine.input.f
    public float v6() {
        return this.X[1];
    }

    @Override // com.planner5d.library.engine.input.f
    public int w6(int i10) {
        return this.f160580h[i10];
    }
}
