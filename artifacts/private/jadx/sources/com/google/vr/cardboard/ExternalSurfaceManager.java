package com.google.vr.cardboard;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
@UsedByNative
public class ExternalSurfaceManager {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f126774g = "ExternalSurfaceManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f126775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f126776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f126777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile g f126778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f126779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f126780f;

    class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f126781a;

        a(long j10) {
            this.f126781a = j10;
        }

        @Override // com.google.vr.cardboard.ExternalSurfaceManager.j
        public void a(int i10, int i11, long j10, float[] fArr) {
            ExternalSurfaceManager.nativeUpdateSurface(this.f126781a, i10, i11, j10, fArr);
        }
    }

    class b implements i {
        b() {
        }

        @Override // com.google.vr.cardboard.ExternalSurfaceManager.i
        public SurfaceTexture a(int i10) {
            return new SurfaceTexture(i10);
        }
    }

    static class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f126782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f126783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f126784c;

        public c(Runnable runnable, Runnable runnable2, Handler handler) {
            this.f126782a = runnable;
            this.f126783b = runnable2;
            this.f126784c = handler;
        }

        @Override // com.google.vr.cardboard.ExternalSurfaceManager.e
        public void a() {
            Runnable runnable = this.f126783b;
            if (runnable != null) {
                this.f126784c.post(runnable);
            }
        }

        @Override // com.google.vr.cardboard.ExternalSurfaceManager.e
        public void b() {
            Runnable runnable = this.f126782a;
            if (runnable != null) {
                this.f126784c.post(runnable);
            }
        }

        @Override // com.google.vr.cardboard.ExternalSurfaceManager.e
        public void c() {
            Runnable runnable = this.f126782a;
            if (runnable != null) {
                this.f126784c.removeCallbacks(runnable);
            }
            Runnable runnable2 = this.f126783b;
            if (runnable2 != null) {
                this.f126784c.removeCallbacks(runnable2);
            }
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f126785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f126786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i f126787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f126788d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f126792h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f126793i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile SurfaceTexture f126794j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private volatile Surface f126795k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicInteger f126789e = new AtomicInteger(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f126790f = new AtomicBoolean(false);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int[] f126791g = new int[1];

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private volatile boolean f126796l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private volatile boolean f126797m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f126798n = new Object();

        class a implements SurfaceTexture.OnFrameAvailableListener {
            a() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                d.this.f126789e.getAndIncrement();
                synchronized (d.this.f126798n) {
                    try {
                        if (!d.this.f126797m && d.this.f126786b != null) {
                            d.this.f126786b.a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        d(int i10, int i11, int i12, e eVar, i iVar) {
            float[] fArr = new float[16];
            this.f126788d = fArr;
            this.f126785a = i10;
            this.f126792h = i11;
            this.f126793i = i12;
            this.f126786b = eVar;
            this.f126787c = iVar;
            Matrix.setIdentityM(fArr, 0);
        }

        Surface f() {
            if (this.f126796l) {
                return this.f126795k;
            }
            return null;
        }

        void g() {
            if (this.f126796l) {
                return;
            }
            GLES20.glGenTextures(1, this.f126791g, 0);
            h(this.f126791g[0]);
        }

        void h(int i10) {
            if (!this.f126796l) {
                this.f126791g[0] = i10;
                if (this.f126794j == null) {
                    this.f126794j = this.f126787c.a(this.f126791g[0]);
                    if (this.f126792h > 0 && this.f126793i > 0) {
                        this.f126794j.setDefaultBufferSize(this.f126792h, this.f126793i);
                    }
                    this.f126794j.setOnFrameAvailableListener(new a(), new Handler(Looper.getMainLooper()));
                    this.f126795k = new Surface(this.f126794j);
                } else {
                    this.f126794j.attachToGLContext(this.f126791g[0]);
                }
                this.f126796l = true;
                e eVar = this.f126786b;
                if (eVar != null) {
                    eVar.b();
                }
            }
        }

        void i() {
            if (this.f126796l) {
                e eVar = this.f126786b;
                if (eVar != null) {
                    eVar.c();
                }
                this.f126794j.detachFromGLContext();
                this.f126796l = false;
            }
        }

        void j(j jVar) {
            synchronized (this.f126798n) {
                try {
                    this.f126797m = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f126790f.getAndSet(true)) {
                return;
            }
            e eVar = this.f126786b;
            if (eVar != null) {
                eVar.c();
            }
            if (this.f126794j != null) {
                this.f126794j.release();
                this.f126794j = null;
                if (this.f126795k != null) {
                    this.f126795k.release();
                }
                this.f126795k = null;
            }
            jVar.a(this.f126785a, 0, 0L, this.f126788d);
        }

        void k(j jVar) {
            if (this.f126796l) {
                if (this.f126789e.getAndSet(0) > 0) {
                    this.f126794j.updateTexImage();
                    this.f126794j.getTransformMatrix(this.f126788d);
                    jVar.a(this.f126785a, this.f126791g[0], this.f126794j.getTimestamp(), this.f126788d);
                }
            }
        }

        void l(j jVar) {
            if (this.f126796l && this.f126789e.get() > 0) {
                this.f126789e.decrementAndGet();
                this.f126794j.updateTexImage();
                this.f126794j.getTransformMatrix(this.f126788d);
                jVar.a(this.f126785a, this.f126791g[0], this.f126794j.getTimestamp(), this.f126788d);
            }
        }
    }

    interface e {
        void a();

        void b();

        void c();
    }

    interface f {
        void a(d dVar);
    }

    static class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f126802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f126803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f126804c = new Handler(Looper.getMainLooper());

        public h(final long j10, long j11) {
            this.f126802a = new Runnable(j10) { // from class: com.google.vr.cardboard.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final long f126836a;

                {
                    this.f126836a = j10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ExternalSurfaceManager.nativeCallback(this.f126836a);
                }
            };
            this.f126803b = j11;
        }

        @Override // com.google.vr.cardboard.ExternalSurfaceManager.e
        public void a() {
            ExternalSurfaceManager.nativeCallback(this.f126803b);
        }

        @Override // com.google.vr.cardboard.ExternalSurfaceManager.e
        public void b() {
            this.f126804c.post(this.f126802a);
        }

        @Override // com.google.vr.cardboard.ExternalSurfaceManager.e
        public void c() {
            this.f126804c.removeCallbacks(this.f126802a);
        }
    }

    public interface i {
        SurfaceTexture a(int i10);
    }

    public interface j {
        void a(int i10, int i11, long j10, float[] fArr);
    }

    @UsedByNative
    public ExternalSurfaceManager(long j10) {
        this(new a(j10), new b());
    }

    private void c(f fVar) {
        g gVar = this.f126778d;
        if (this.f126780f && !gVar.f126800a.isEmpty()) {
            for (d dVar : gVar.f126800a.values()) {
                dVar.g();
                fVar.a(dVar);
            }
        }
        if (gVar.f126801b.isEmpty()) {
            return;
        }
        Iterator<d> it = gVar.f126801b.values().iterator();
        while (it.hasNext()) {
            it.next().j(this.f126775a);
        }
    }

    private int d(int i10, int i11, e eVar) {
        int i12;
        synchronized (this.f126777c) {
            g gVar = new g(this.f126778d);
            i12 = this.f126779e;
            this.f126779e = i12 + 1;
            gVar.f126800a.put(Integer.valueOf(i12), new d(i12, i10, i11, eVar, this.f126776b));
            this.f126778d = gVar;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeCallback(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeUpdateSurface(long j10, int i10, int i11, long j11, float[] fArr);

    @UsedByNative
    public void consumerAttachToCurrentGLContext() {
        this.f126780f = true;
        g gVar = this.f126778d;
        if (!gVar.f126800a.isEmpty()) {
            Iterator<d> it = gVar.f126800a.values().iterator();
            while (it.hasNext()) {
                it.next().g();
            }
        }
    }

    @UsedByNative
    public void consumerDetachFromCurrentGLContext() {
        this.f126780f = false;
        g gVar = this.f126778d;
        if (!gVar.f126800a.isEmpty()) {
            Iterator<d> it = gVar.f126800a.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    @UsedByNative
    public void consumerUpdateManagedSurfaces() {
        c(new f(this) { // from class: com.google.vr.cardboard.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ExternalSurfaceManager f126834a;

            {
                this.f126834a = this;
            }

            @Override // com.google.vr.cardboard.ExternalSurfaceManager.f
            public final void a(ExternalSurfaceManager.d dVar) {
                this.f126834a.e(dVar);
            }
        });
    }

    @UsedByNative
    public void consumerUpdateManagedSurfacesSequentially() {
        c(new f(this) { // from class: com.google.vr.cardboard.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ExternalSurfaceManager f126835a;

            {
                this.f126835a = this;
            }

            @Override // com.google.vr.cardboard.ExternalSurfaceManager.f
            public final void a(ExternalSurfaceManager.d dVar) {
                this.f126835a.f(dVar);
            }
        });
    }

    @UsedByNative
    public int createExternalSurface() {
        return d(-1, -1, null);
    }

    @UsedByNative
    public int createExternalSurfaceWithNativeCallback(int i10, int i11, long j10, long j11) {
        return d(i10, i11, new h(j10, j11));
    }

    final /* synthetic */ void e(d dVar) {
        dVar.k(this.f126775a);
    }

    final /* synthetic */ void f(d dVar) {
        dVar.l(this.f126775a);
    }

    @UsedByNative
    public Surface getSurface(int i10) {
        g gVar = this.f126778d;
        if (gVar.f126800a.containsKey(Integer.valueOf(i10))) {
            return gVar.f126800a.get(Integer.valueOf(i10)).f();
        }
        return null;
    }

    @UsedByNative
    public void releaseExternalSurface(int i10) {
        synchronized (this.f126777c) {
            try {
                g gVar = new g(this.f126778d);
                d dVarRemove = gVar.f126800a.remove(Integer.valueOf(i10));
                if (dVarRemove != null) {
                    gVar.f126801b.put(Integer.valueOf(i10), dVarRemove);
                    this.f126778d = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @UsedByNative
    public void shutdown() {
        synchronized (this.f126777c) {
            try {
                g gVar = this.f126778d;
                this.f126778d = new g();
                if (!gVar.f126800a.isEmpty()) {
                    Iterator<Map.Entry<Integer, d>> it = gVar.f126800a.entrySet().iterator();
                    while (it.hasNext()) {
                        it.next().getValue().j(this.f126775a);
                    }
                }
                if (!gVar.f126801b.isEmpty()) {
                    Iterator<Map.Entry<Integer, d>> it2 = gVar.f126801b.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next().getValue().j(this.f126775a);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ExternalSurfaceManager(j jVar, i iVar) {
        this.f126777c = new Object();
        this.f126778d = new g();
        this.f126779e = 1;
        this.f126775a = jVar;
        this.f126776b = iVar;
    }

    @UsedByNative
    public int createExternalSurface(int i10, int i11, Runnable runnable, Runnable runnable2, Handler handler) {
        if (runnable == null || handler == null) {
            throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
        }
        return d(i10, i11, new c(runnable, runnable2, handler));
    }

    static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final HashMap<Integer, d> f126800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final HashMap<Integer, d> f126801b;

        g() {
            this.f126800a = new HashMap<>();
            this.f126801b = new HashMap<>();
        }

        g(g gVar) {
            this.f126800a = new HashMap<>(gVar.f126800a);
            HashMap<Integer, d> map = new HashMap<>(gVar.f126801b);
            this.f126801b = map;
            Iterator<Map.Entry<Integer, d>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().f126790f.get()) {
                    it.remove();
                }
            }
        }
    }

    @UsedByNative
    public void consumerAttachToCurrentGLContext(Map<Integer, Integer> map) {
        this.f126780f = true;
        g gVar = this.f126778d;
        if (!this.f126778d.f126800a.isEmpty()) {
            for (Integer num : this.f126778d.f126800a.keySet()) {
                if (!map.containsKey(num)) {
                    String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", num);
                    return;
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (gVar.f126800a.containsKey(entry.getKey())) {
                gVar.f126800a.get(entry.getKey()).h(entry.getValue().intValue());
            } else {
                String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey());
            }
        }
    }
}
