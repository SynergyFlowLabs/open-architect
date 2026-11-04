package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.l6;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class s implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final y5 f64661a;

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(23)
    static final class b implements y5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private AudioManager f64662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioDeviceCallback f64663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media3.common.util.g<Boolean> f64664c;

        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f64664c.f(Boolean.valueOf(b.this.i()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f64664c.f(Boolean.valueOf(b.this.i()));
            }
        }

        private b() {
        }

        public static /* synthetic */ void e(b bVar, Context context) {
            AudioManager audioManager;
            androidx.media3.common.util.a.g(bVar.f64664c);
            if (androidx.media3.common.util.k1.q1(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                bVar.f64662a = audioManager;
                a aVar = bVar.new a();
                bVar.f64663b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) androidx.media3.common.util.a.g(Looper.myLooper())));
                bVar.f64664c.f(Boolean.valueOf(bVar.i()));
            }
        }

        public static /* synthetic */ void f(b bVar) {
            AudioManager audioManager = bVar.f64662a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) androidx.media3.common.util.a.g(bVar.f64663b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) androidx.media3.common.util.a.k(this.f64662a)).getDevices(2)) {
                if (audioDeviceInfo.getType() != 8 && audioDeviceInfo.getType() != 5 && audioDeviceInfo.getType() != 6 && audioDeviceInfo.getType() != 11 && audioDeviceInfo.getType() != 4 && audioDeviceInfo.getType() != 3) {
                    int i10 = androidx.media3.common.util.k1.f61540a;
                    if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                        return true;
                    }
                    if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                        return true;
                    }
                    if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                        return true;
                    }
                    if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                        return true;
                    }
                }
                return true;
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.y5
        public boolean a() {
            androidx.media3.common.util.g<Boolean> gVar = this.f64664c;
            if (gVar == null) {
                return true;
            }
            return gVar.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.y5
        public void b(final y5.a aVar, final Context context, Looper looper, Looper looper2, androidx.media3.common.util.j jVar) {
            androidx.media3.common.util.g<Boolean> gVar = new androidx.media3.common.util.g<>(Boolean.TRUE, looper2, looper, jVar, new androidx.media3.common.util.g.a() { // from class: androidx.media3.exoplayer.u
                @Override // androidx.media3.common.util.g.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f64664c = gVar;
            gVar.e(new Runnable() { // from class: androidx.media3.exoplayer.v
                @Override // java.lang.Runnable
                public final void run() {
                    s.b.e(this.f66215a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.y5
        public void d() {
            ((androidx.media3.common.util.g) androidx.media3.common.util.a.g(this.f64664c)).e(new Runnable() { // from class: androidx.media3.exoplayer.t
                @Override // java.lang.Runnable
                public final void run() {
                    s.b.f(this.f65594a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.w0(35)
    static final class c implements y5 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final RouteDiscoveryPreference f64666e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediaRouter2 f64667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaRouter2$RouteCallback f64668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private MediaRouter2$ControllerCallback f64669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.common.util.g<Boolean> f64670d;

        class a extends MediaRouter2$RouteCallback {
            a() {
            }
        }

        class b extends MediaRouter2$ControllerCallback {
            b() {
            }

            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f64670d.f(Boolean.valueOf(c.k(c.this.f64667a)));
            }
        }

        static {
            e0.a();
            f64666e = d0.a(l6.F(), false).build();
        }

        private c() {
        }

        public static /* synthetic */ void c(c cVar) {
            h0.a(androidx.media3.common.util.a.g(cVar.f64667a)).unregisterControllerCallback(z.a(androidx.media3.common.util.a.g(cVar.f64669c)));
            cVar.f64669c = null;
            cVar.f64667a.unregisterRouteCallback(b0.a(androidx.media3.common.util.a.g(cVar.f64668b)));
        }

        public static /* synthetic */ void f(c cVar, Context context) {
            androidx.media3.common.util.a.g(cVar.f64670d);
            cVar.f64667a = MediaRouter2.getInstance(context);
            cVar.f64668b = cVar.new a();
            final androidx.media3.common.util.g<Boolean> gVar = cVar.f64670d;
            Objects.requireNonNull(gVar);
            Executor executor = new Executor() { // from class: androidx.media3.exoplayer.o0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    gVar.e(runnable);
                }
            };
            cVar.f64667a.registerRouteCallback(executor, cVar.f64668b, f64666e);
            b bVar = cVar.new b();
            cVar.f64669c = bVar;
            cVar.f64667a.registerControllerCallback(executor, bVar);
            cVar.f64670d.f(Boolean.valueOf(k(cVar.f64667a)));
        }

        private static boolean j(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                return (i10 == 1 || i10 == 2) && z10;
            }
            return suitabilityStatus == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean k(MediaRouter2 mediaRouter2) {
            int transferReason = h0.a(androidx.media3.common.util.a.g(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (j(n0.a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.y5
        public boolean a() {
            androidx.media3.common.util.g<Boolean> gVar = this.f64670d;
            if (gVar == null) {
                return true;
            }
            return gVar.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.y5
        @e.a({"ThreadSafe"})
        public void b(final y5.a aVar, final Context context, Looper looper, Looper looper2, androidx.media3.common.util.j jVar) {
            androidx.media3.common.util.g<Boolean> gVar = new androidx.media3.common.util.g<>(Boolean.TRUE, looper2, looper, jVar, new androidx.media3.common.util.g.a() { // from class: androidx.media3.exoplayer.q0
                @Override // androidx.media3.common.util.g.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f64670d = gVar;
            gVar.e(new Runnable() { // from class: androidx.media3.exoplayer.r0
                @Override // java.lang.Runnable
                public final void run() {
                    s.c.f(this.f64630a, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.y5
        public void d() {
            ((androidx.media3.common.util.g) androidx.media3.common.util.a.k(this.f64670d)).e(new Runnable() { // from class: androidx.media3.exoplayer.p0
                @Override // java.lang.Runnable
                public final void run() {
                    s.c.c(this.f64596a);
                }
            });
        }
    }

    public s() {
        int i10 = androidx.media3.common.util.k1.f61540a;
        if (i10 >= 35) {
            this.f64661a = new c();
        } else if (i10 >= 23) {
            this.f64661a = new b();
        } else {
            this.f64661a = null;
        }
    }

    @Override // androidx.media3.exoplayer.y5
    public boolean a() {
        y5 y5Var = this.f64661a;
        return y5Var == null || y5Var.a();
    }

    @Override // androidx.media3.exoplayer.y5
    public void b(y5.a aVar, Context context, Looper looper, Looper looper2, androidx.media3.common.util.j jVar) {
        y5 y5Var = this.f64661a;
        if (y5Var != null) {
            y5Var.b(aVar, context, looper, looper2, jVar);
        }
    }

    @Override // androidx.media3.exoplayer.y5
    public void d() {
        y5 y5Var = this.f64661a;
        if (y5Var != null) {
            y5Var.d();
        }
    }
}
