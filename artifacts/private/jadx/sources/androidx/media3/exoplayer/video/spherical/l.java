package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.k1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.t;
import androidx.media3.exoplayer.video.w;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l extends GLSurfaceView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f66535m = 90;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f66536n = 0.1f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f66537o = 100.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f66538s = 25.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final float f66539t = 3.1415927f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f66540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f66541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final Sensor f66542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f66543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f66544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f66545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f66546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private SurfaceTexture f66547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private Surface f66548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f66549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f66550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f66551l;

    @l1
    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f66552a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f66555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f66556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f66557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f66558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f66559h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f66553b = new float[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f66554c = new float[16];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float[] f66560i = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f66561j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f66555d = fArr;
            float[] fArr2 = new float[16];
            this.f66556e = fArr2;
            float[] fArr3 = new float[16];
            this.f66557f = fArr3;
            this.f66552a = iVar;
            t.b0(fArr);
            t.b0(fArr2);
            t.b0(fArr3);
            this.f66559h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        @androidx.annotation.d
        private void d() {
            Matrix.setRotateM(this.f66556e, 0, -this.f66558g, (float) Math.cos(this.f66559h), (float) Math.sin(this.f66559h), 0.0f);
        }

        @Override // androidx.media3.exoplayer.video.spherical.d.a
        @androidx.annotation.g
        public synchronized void a(float[] fArr, float f10) {
            try {
                float[] fArr2 = this.f66555d;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                this.f66559h = -f10;
                d();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.m.a
        @k1
        public synchronized void b(PointF pointF) {
            try {
                this.f66558g = pointF.y;
                d();
                Matrix.setRotateM(this.f66557f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                try {
                    Matrix.multiplyMM(this.f66561j, 0, this.f66555d, 0, this.f66557f, 0);
                    Matrix.multiplyMM(this.f66560i, 0, this.f66556e, 0, this.f66561j, 0);
                } finally {
                }
            }
            Matrix.multiplyMM(this.f66554c, 0, this.f66553b, 0, this.f66560i, 0);
            this.f66552a.d(this.f66554c, false);
        }

        @Override // androidx.media3.exoplayer.video.spherical.m.a
        @k1
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f66553b, 0, c(f10), f10, 0.1f, l.f66537o);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.e(this.f66552a.e());
        }
    }

    public interface b {
        void v(Surface surface);

        void x(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(l lVar) {
        Surface surface = lVar.f66548i;
        if (surface != null) {
            Iterator<b> it = lVar.f66540a.iterator();
            while (it.hasNext()) {
                it.next().v(surface);
            }
        }
        f(lVar.f66547h, surface);
        boolean z10 = false & false;
        lVar.f66547h = null;
        lVar.f66548i = null;
    }

    public static /* synthetic */ void b(l lVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = lVar.f66547h;
        Surface surface = lVar.f66548i;
        Surface surface2 = new Surface(surfaceTexture);
        lVar.f66547h = surfaceTexture;
        lVar.f66548i = surface2;
        Iterator<b> it = lVar.f66540a.iterator();
        while (it.hasNext()) {
            it.next().x(surface2);
        }
        f(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SurfaceTexture surfaceTexture) {
        this.f66544e.post(new Runnable() { // from class: androidx.media3.exoplayer.video.spherical.k
            @Override // java.lang.Runnable
            public final void run() {
                l.b(this.f66533a, surfaceTexture);
            }
        });
    }

    private static void f(@p0 SurfaceTexture surfaceTexture, @p0 Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void h() {
        boolean z10 = this.f66549j && this.f66550k;
        Sensor sensor = this.f66542c;
        if (sensor == null || z10 == this.f66551l) {
            return;
        }
        if (z10) {
            this.f66541b.registerListener(this.f66543d, sensor, 0);
        } else {
            this.f66541b.unregisterListener(this.f66543d);
        }
        this.f66551l = z10;
    }

    public void d(b bVar) {
        this.f66540a.add(bVar);
    }

    public void g(b bVar) {
        this.f66540a.remove(bVar);
    }

    public androidx.media3.exoplayer.video.spherical.a getCameraMotionListener() {
        return this.f66546g;
    }

    public w getVideoFrameMetadataListener() {
        return this.f66546g;
    }

    @p0
    public Surface getVideoSurface() {
        return this.f66548i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f66544e.post(new Runnable() { // from class: androidx.media3.exoplayer.video.spherical.j
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f66532a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f66550k = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f66550k = true;
        h();
    }

    public void setDefaultStereoMode(int i10) {
        this.f66546g.f(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f66549j = z10;
        h();
    }

    public l(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66540a = new CopyOnWriteArrayList<>();
        this.f66544e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) androidx.media3.common.util.a.g(context.getSystemService("sensor"));
        this.f66541b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f66542c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f66546g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, f66538s);
        this.f66545f = mVar;
        this.f66543d = new d(((WindowManager) androidx.media3.common.util.a.g((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f66549j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
