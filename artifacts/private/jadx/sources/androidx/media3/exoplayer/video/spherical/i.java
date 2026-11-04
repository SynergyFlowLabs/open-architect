package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.p0;
import androidx.media3.common.util.t;
import androidx.media3.common.util.v0;
import androidx.media3.common.util.z;
import androidx.media3.exoplayer.video.w;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class i implements w, a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f66518n = "SceneRenderer";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f66527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceTexture f66528j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private byte[] f66531m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f66519a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f66520b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f66521c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f66522d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v0<Long> f66523e = new v0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v0<e> f66524f = new v0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f66525g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f66526h = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f66529k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f66530l = -1;

    private void g(@p0 byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f66531m;
        int i11 = this.f66530l;
        this.f66531m = bArr;
        if (i10 == -1) {
            i10 = this.f66529k;
        }
        this.f66530l = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f66531m)) {
            return;
        }
        byte[] bArr3 = this.f66531m;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f66530l) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f66530l);
        }
        this.f66524f.a(j10, eVarA);
    }

    @Override // androidx.media3.exoplayer.video.spherical.a
    public void b(long j10, float[] fArr) {
        this.f66522d.e(j10, fArr);
    }

    @Override // androidx.media3.exoplayer.video.spherical.a
    public void c() {
        this.f66523e.c();
        this.f66522d.d();
        this.f66520b.set(true);
    }

    public void d(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            t.f();
        } catch (t.a e10) {
            z.e(f66518n, "Failed to draw a frame", e10);
        }
        if (this.f66519a.compareAndSet(true, false)) {
            ((SurfaceTexture) androidx.media3.common.util.a.g(this.f66528j)).updateTexImage();
            try {
                t.f();
            } catch (t.a e11) {
                z.e(f66518n, "Failed to draw a frame", e11);
            }
            if (this.f66520b.compareAndSet(true, false)) {
                t.b0(this.f66525g);
            }
            long timestamp = this.f66528j.getTimestamp();
            Long lG = this.f66523e.g(timestamp);
            if (lG != null) {
                this.f66522d.c(this.f66525g, lG.longValue());
            }
            e eVarJ = this.f66524f.j(timestamp);
            if (eVarJ != null) {
                this.f66521c.d(eVarJ);
            }
        }
        Matrix.multiplyMM(this.f66526h, 0, fArr, 0, this.f66525g, 0);
        this.f66521c.a(this.f66527i, this.f66526h, z10);
    }

    public SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            t.f();
            this.f66521c.b();
            t.f();
            this.f66527i = t.o();
        } catch (t.a e10) {
            z.e(f66518n, "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f66527i);
        this.f66528j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f66517a.f66519a.set(true);
            }
        });
        return this.f66528j;
    }

    public void f(int i10) {
        this.f66529k = i10;
    }

    @Override // androidx.media3.exoplayer.video.w
    public void h(long j10, long j11, androidx.media3.common.w wVar, @p0 MediaFormat mediaFormat) {
        this.f66523e.a(j11, Long.valueOf(j10));
        g(wVar.A, wVar.B, j11);
    }

    public void i() {
        this.f66521c.e();
    }
}
