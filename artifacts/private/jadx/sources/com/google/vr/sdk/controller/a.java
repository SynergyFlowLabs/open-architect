package com.google.vr.sdk.controller;

import android.graphics.PointF;
import android.opengl.Matrix;
import com.google.vr.vrcore.controller.api.ControllerBatteryEvent;
import com.google.vr.vrcore.controller.api.ControllerButtonEvent;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.ControllerPositionEvent;
import com.google.vr.vrcore.controller.api.ControllerTouchEvent;
import com.google.vr.vrcore.controller.api.ControllerTrackingStatusEvent;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f127631v = "Controller";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f127632w = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f127633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.vr.sdk.controller.c f127634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f127635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f127636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f127637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PointF f127638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f127639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f127640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f127641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f127642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f127643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f127644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f127645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f127646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f127647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f127648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f127649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a f127650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f127651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.google.vr.sdk.controller.c f127652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.vr.sdk.controller.c f127653u;

    /* JADX INFO: renamed from: com.google.vr.sdk.controller.a$a, reason: collision with other inner class name */
    public static class C1236a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127654a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127655b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127656c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f127657d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f127658e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f127659f = 5;

        public static final String a(int i10) {
            if (i10 == 0) {
                return "UNKNOWN";
            }
            if (i10 == 1) {
                return "CRITICAL_LOW";
            }
            if (i10 == 2) {
                return "LOW";
            }
            if (i10 == 3) {
                return "MEDIUM";
            }
            if (i10 == 4) {
                return "ALMOST_FULL";
            }
            if (i10 == 5) {
                return "FULL";
            }
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("[UNKNOWN BATTERY LEVEL: ");
            sb2.append(i10);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127660a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127661b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127662c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f127663d = 8;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127664a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127665b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127666c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f127667d = 3;

        private c() {
        }

        public static final String a(int i10) {
            if (i10 == 0) {
                return "DISCONNECTED";
            }
            if (i10 == 1) {
                return "SCANNING";
            }
            if (i10 == 2) {
                return "CONNECTING";
            }
            if (i10 == 3) {
                return "CONNECTED";
            }
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("[UNKNOWN CONTROLLER STATE: ");
            sb2.append(i10);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class d {
        public void c(int i10) {
        }

        public void d() {
        }
    }

    a(int i10) {
        this(i10, new a(-1, null));
    }

    private void l(float f10, float f11, float f12, float f13) {
        this.f127652t.c(f10, f11, f12, f13);
        this.f127634b.d(this.f127653u);
        this.f127634b.b(this.f127652t);
    }

    public int a() {
        return this.f127648p;
    }

    public float[] b(float[] fArr) {
        this.f127634b.f(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = this.f127635c;
        Matrix.translateM(fArr, 0, fArr2[0], fArr2[1], fArr2[2]);
        Matrix.rotateM(fArr, 0, f13, f10, f11, f12);
        return fArr;
    }

    void c(ControllerBatteryEvent controllerBatteryEvent) {
        synchronized (this.f127649q) {
            try {
                a aVar = this.f127650r;
                aVar.f127647o = controllerBatteryEvent.f129968d;
                int i10 = controllerBatteryEvent.f129967c;
                if (i10 == 0) {
                    aVar.f127646n = 0;
                } else if (i10 == 1) {
                    aVar.f127646n = 1;
                } else if (i10 == 2) {
                    aVar.f127646n = 2;
                } else if (i10 == 3) {
                    aVar.f127646n = 3;
                } else if (i10 == 4) {
                    aVar.f127646n = 4;
                } else if (i10 != 5) {
                    aVar.f127646n = 0;
                } else {
                    aVar.f127646n = 5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d(ControllerButtonEvent controllerButtonEvent) {
        synchronized (this.f127649q) {
            try {
                a aVar = this.f127650r;
                aVar.f127633a = controllerButtonEvent.f129972a;
                int i10 = controllerButtonEvent.f129970c;
                switch (i10) {
                    case 1:
                        aVar.f127639g = controllerButtonEvent.f129971d;
                        break;
                    case 2:
                        aVar.f127641i = controllerButtonEvent.f129971d;
                        break;
                    case 3:
                        aVar.f127640h = controllerButtonEvent.f129971d;
                        break;
                    case 4:
                    default:
                        String.format("handleButtonEvent didn't handle %d", Integer.valueOf(i10));
                        break;
                    case 5:
                        aVar.f127644l = controllerButtonEvent.f129971d;
                        break;
                    case 6:
                        aVar.f127645m = controllerButtonEvent.f129971d;
                        break;
                    case 7:
                        aVar.f127642j = controllerButtonEvent.f129971d;
                        break;
                    case 8:
                        aVar.f127643k = controllerButtonEvent.f129971d;
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void e(ControllerOrientationEvent controllerOrientationEvent) {
        synchronized (this.f127649q) {
            try {
                a aVar = this.f127650r;
                aVar.f127633a = controllerOrientationEvent.f129972a;
                aVar.l(controllerOrientationEvent.f130001c, controllerOrientationEvent.f130002d, controllerOrientationEvent.f130003e, controllerOrientationEvent.f130004f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void f(ControllerPositionEvent controllerPositionEvent) {
        synchronized (this.f127649q) {
            try {
                a aVar = this.f127650r;
                aVar.f127633a = controllerPositionEvent.f129972a;
                float[] fArr = aVar.f127635c;
                fArr[0] = controllerPositionEvent.f130005c;
                fArr[1] = controllerPositionEvent.f130006d;
                fArr[2] = controllerPositionEvent.f130007e;
            } finally {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:4:0x0004, B:8:0x001e, B:10:0x0022, B:14:0x002a, B:20:0x0048, B:17:0x0040, B:18:0x0043), top: B:24:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:4:0x0004, B:8:0x001e, B:10:0x0022, B:14:0x002a, B:20:0x0048, B:17:0x0040, B:18:0x0043), top: B:24:0x0004 }] */
    void g(ControllerTouchEvent controllerTouchEvent) {
        synchronized (this.f127649q) {
            try {
                a aVar = this.f127650r;
                aVar.f127633a = controllerTouchEvent.f129972a;
                PointF pointF = aVar.f127638f;
                pointF.x = controllerTouchEvent.f130010e;
                pointF.y = controllerTouchEvent.f130011f;
                int i10 = controllerTouchEvent.f130009d;
                if (i10 == 0) {
                    aVar.f127637e = false;
                } else if (i10 != 1) {
                    int i11 = 3 ^ 2;
                    if (i10 != 2) {
                        int i12 = i11 & 3;
                        if (i10 == 3 || i10 == 4) {
                            aVar.f127637e = false;
                        } else {
                            String.format(".handleTouchEvent didn't handle %d", Integer.valueOf(i10));
                        }
                    } else {
                        aVar.f127637e = true;
                    }
                } else {
                    aVar.f127637e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void h(ControllerTrackingStatusEvent controllerTrackingStatusEvent) {
        synchronized (this.f127649q) {
            try {
                a aVar = this.f127650r;
                aVar.f127633a = controllerTrackingStatusEvent.f129972a;
                aVar.f127636d = controllerTrackingStatusEvent.f130012c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void i() {
        this.f127651s.d();
    }

    void j(int i10) {
        this.f127651s.c(i10);
    }

    public void k(d dVar) {
        this.f127651s = dVar;
    }

    public void m() {
        synchronized (this.f127649q) {
            try {
                long j10 = this.f127633a;
                a aVar = this.f127650r;
                long j11 = aVar.f127633a;
                if (j10 == j11) {
                    return;
                }
                this.f127633a = j11;
                com.google.vr.sdk.controller.c cVar = this.f127634b;
                com.google.vr.sdk.controller.c cVar2 = aVar.f127634b;
                cVar.f127685d = cVar2.f127685d;
                cVar.f127682a = cVar2.f127682a;
                cVar.f127683b = cVar2.f127683b;
                cVar.f127684c = cVar2.f127684c;
                this.f127637e = aVar.f127637e;
                PointF pointF = this.f127638f;
                PointF pointF2 = aVar.f127638f;
                pointF.x = pointF2.x;
                pointF.y = pointF2.y;
                float[] fArr = aVar.f127635c;
                float[] fArr2 = this.f127635c;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                a aVar2 = this.f127650r;
                this.f127636d = aVar2.f127636d;
                this.f127640h = aVar2.f127640h;
                this.f127641i = aVar2.f127641i;
                this.f127639g = aVar2.f127639g;
                this.f127642j = aVar2.f127642j;
                this.f127643k = aVar2.f127643k;
                this.f127645m = aVar2.f127645m;
                this.f127644l = aVar2.f127644l;
                this.f127647o = aVar2.f127647o;
                this.f127646n = aVar2.f127646n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private a(int i10, a aVar) {
        this.f127633a = 0L;
        this.f127634b = new com.google.vr.sdk.controller.c();
        this.f127635c = new float[3];
        this.f127636d = 0;
        this.f127638f = new PointF();
        this.f127649q = new Object();
        this.f127651s = new d();
        this.f127652t = new com.google.vr.sdk.controller.c();
        this.f127653u = new com.google.vr.sdk.controller.c();
        this.f127648p = i10;
        this.f127650r = aVar;
    }
}
