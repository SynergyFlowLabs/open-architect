package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.a1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.collection.h3;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f47939a = 30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f47940b = 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f47941c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f47942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Class<?> f47943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f47944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Method f47945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("sLocationListeners")
    static final WeakHashMap<l, WeakReference<m>> f47946h = new WeakHashMap<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Class<?> f47947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f47948b;

        private a() {
        }

        @e.a({"BanUncheckedReflection"})
        static boolean a(LocationManager locationManager, String str, e0 e0Var, androidx.core.location.f fVar, Looper looper) {
            try {
                if (f47947a == null) {
                    f47947a = Class.forName("android.location.LocationRequest");
                }
                if (f47948b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f47947a, LocationListener.class, Looper.class);
                    f47948b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestI = e0Var.i(str);
                if (locationRequestI != null) {
                    f47948b.invoke(locationManager, locationRequestI, fVar, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @e.a({"BanUncheckedReflection"})
        static boolean b(LocationManager locationManager, String str, e0 e0Var, m mVar) {
            try {
                if (f47947a == null) {
                    f47947a = Class.forName("android.location.LocationRequest");
                }
                if (f47948b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f47947a, LocationListener.class, Looper.class);
                    f47948b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestI = e0Var.i(str);
                if (locationRequestI != null) {
                    synchronized (j.f47946h) {
                        try {
                            f47948b.invoke(locationManager, locationRequestI, mVar, Looper.getMainLooper());
                            j.o(locationManager, mVar);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    @w0(24)
    static class b {
        private b() {
        }

        @a1("android.permission.ACCESS_FINE_LOCATION")
        static boolean a(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        @a1("android.permission.ACCESS_FINE_LOCATION")
        static boolean b(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback, @NonNull Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static boolean c(LocationManager locationManager, Handler handler, Executor executor, androidx.core.location.a.AbstractC0390a abstractC0390a) {
            androidx.core.util.t.a(handler != null);
            h3<Object, Object> h3Var = g.f47957a;
            synchronized (h3Var) {
                try {
                    n nVar = (n) h3Var.get(abstractC0390a);
                    if (nVar == null) {
                        nVar = new n(abstractC0390a);
                    } else {
                        nVar.f();
                    }
                    nVar.e(executor);
                    if (!locationManager.registerGnssStatusCallback(nVar, handler)) {
                        return false;
                    }
                    h3Var.put(abstractC0390a, nVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        static void d(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        static void e(LocationManager locationManager, Object obj) {
            if (obj instanceof n) {
                ((n) obj).f();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    @w0(28)
    private static class c {
        private c() {
        }

        static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @w0(30)
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Class<?> f47949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f47950b;

        private d() {
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void a(LocationManager locationManager, @NonNull String str, @p0 CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final androidx.core.util.e<Location> eVar) {
            Objects.requireNonNull(eVar);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: androidx.core.location.k
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    eVar.accept((Location) obj);
                }
            });
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, androidx.core.location.a.AbstractC0390a abstractC0390a) {
            h3<Object, Object> h3Var = g.f47957a;
            synchronized (h3Var) {
                try {
                    i iVar = (i) h3Var.get(abstractC0390a);
                    if (iVar == null) {
                        iVar = new i(abstractC0390a);
                    }
                    if (!locationManager.registerGnssStatusCallback(executor, iVar)) {
                        return false;
                    }
                    h3Var.put(abstractC0390a, iVar);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public static boolean c(LocationManager locationManager, String str, e0 e0Var, Executor executor, androidx.core.location.f fVar) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            try {
                if (f47949a == null) {
                    f47949a = Class.forName("android.location.LocationRequest");
                }
                if (f47950b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f47949a, Executor.class, LocationListener.class);
                    f47950b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestI = e0Var.i(str);
                if (locationRequestI == null) {
                    return false;
                }
                f47950b.invoke(locationManager, locationRequestI, executor, fVar);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    @w0(31)
    private static class e {
        private e() {
        }

        static boolean a(LocationManager locationManager, @NonNull String str) {
            return locationManager.hasProvider(str);
        }

        @a1("android.permission.ACCESS_FINE_LOCATION")
        static boolean b(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void c(LocationManager locationManager, @NonNull String str, @NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LocationManager f47951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f47952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f47953c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.util.e<Location> f47954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private boolean f47955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        Runnable f47956f;

        f(LocationManager locationManager, Executor executor, androidx.core.util.e<Location> eVar) {
            this.f47951a = locationManager;
            this.f47952b = executor;
            this.f47954d = eVar;
        }

        public static /* synthetic */ void a(f fVar) {
            fVar.f47956f = null;
            fVar.onLocationChanged((Location) null);
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void d() {
            this.f47954d = null;
            this.f47951a.removeUpdates(this);
            Runnable runnable = this.f47956f;
            if (runnable != null) {
                this.f47953c.removeCallbacks(runnable);
                this.f47956f = null;
            }
        }

        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void c() {
            synchronized (this) {
                try {
                    if (this.f47955e) {
                        return;
                    }
                    this.f47955e = true;
                    d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @e.a({"MissingPermission"})
        public void e(long j10) {
            synchronized (this) {
                try {
                    if (this.f47955e) {
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: androidx.core.location.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            j.f.a(this.f47973a);
                        }
                    };
                    this.f47956f = runnable;
                    this.f47953c.postDelayed(runnable, j10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.location.LocationListener
        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@p0 final Location location) {
            synchronized (this) {
                try {
                    if (this.f47955e) {
                        return;
                    }
                    this.f47955e = true;
                    final androidx.core.util.e<Location> eVar = this.f47954d;
                    this.f47952b.execute(new Runnable() { // from class: androidx.core.location.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            eVar.accept(location);
                        }
                    });
                    d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.location.LocationListener
        @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@NonNull String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@NonNull String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.b0("sGnssStatusListeners")
        static final h3<Object, Object> f47957a = new h3<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.b0("sGnssMeasurementListeners")
        static final h3<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> f47958b = new h3<>();

        private g() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @w0(24)
    static class h extends GnssMeasurementsEvent.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final GnssMeasurementsEvent.Callback f47959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        volatile Executor f47960b;

        h(@NonNull GnssMeasurementsEvent.Callback callback, @NonNull Executor executor) {
            this.f47959a = callback;
            this.f47960b = executor;
        }

        public static /* synthetic */ void a(h hVar, Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (hVar.f47960b != executor) {
                return;
            }
            hVar.f47959a.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        public static /* synthetic */ void b(h hVar, Executor executor, int i10) {
            if (hVar.f47960b != executor) {
                return;
            }
            hVar.f47959a.onStatusChanged(i10);
        }

        public void c() {
            this.f47960b = null;
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            final Executor executor = this.f47960b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.n
                @Override // java.lang.Runnable
                public final void run() {
                    j.h.a(this.f47976a, executor, gnssMeasurementsEvent);
                }
            });
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int i10) {
            final Executor executor = this.f47960b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.o
                @Override // java.lang.Runnable
                public final void run() {
                    j.h.b(this.f47979a, executor, i10);
                }
            });
        }
    }

    @w0(30)
    private static class i extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.core.location.a.AbstractC0390a f47961a;

        i(androidx.core.location.a.AbstractC0390a abstractC0390a) {
            androidx.core.util.t.b(abstractC0390a != null, "invalid null callback");
            this.f47961a = abstractC0390a;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i10) {
            this.f47961a.a(i10);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f47961a.b(androidx.core.location.a.n(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f47961a.c();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f47961a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.core.location.j$j, reason: collision with other inner class name */
    static class C0393j implements GpsStatus.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LocationManager f47962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.core.location.a.AbstractC0390a f47963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        volatile Executor f47964c;

        C0393j(LocationManager locationManager, androidx.core.location.a.AbstractC0390a abstractC0390a) {
            androidx.core.util.t.b(abstractC0390a != null, "invalid null callback");
            this.f47962a = locationManager;
            this.f47963b = abstractC0390a;
        }

        public static /* synthetic */ void a(C0393j c0393j, Executor executor) {
            if (c0393j.f47964c != executor) {
                return;
            }
            c0393j.f47963b.d();
        }

        public static /* synthetic */ void b(C0393j c0393j, Executor executor) {
            if (c0393j.f47964c != executor) {
                return;
            }
            c0393j.f47963b.c();
        }

        public static /* synthetic */ void c(C0393j c0393j, Executor executor, int i10) {
            if (c0393j.f47964c != executor) {
                return;
            }
            c0393j.f47963b.a(i10);
        }

        public static /* synthetic */ void d(C0393j c0393j, Executor executor, androidx.core.location.a aVar) {
            if (c0393j.f47964c != executor) {
                return;
            }
            c0393j.f47963b.b(aVar);
        }

        public void e(Executor executor) {
            androidx.core.util.t.n(this.f47964c == null);
            this.f47964c = executor;
        }

        public void f() {
            this.f47964c = null;
        }

        @Override // android.location.GpsStatus.Listener
        @a1("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i10) {
            GpsStatus gpsStatus;
            final Executor executor = this.f47964c;
            if (executor == null) {
                return;
            }
            if (i10 == 1) {
                executor.execute(new Runnable() { // from class: androidx.core.location.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.C0393j.b(this.f47982a, executor);
                    }
                });
                return;
            }
            if (i10 == 2) {
                executor.execute(new Runnable() { // from class: androidx.core.location.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.C0393j.a(this.f47984a, executor);
                    }
                });
                return;
            }
            if (i10 != 3) {
                if (i10 == 4 && (gpsStatus = this.f47962a.getGpsStatus(null)) != null) {
                    final androidx.core.location.a aVarO = androidx.core.location.a.o(gpsStatus);
                    executor.execute(new Runnable() { // from class: androidx.core.location.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            j.C0393j.d(this.f47989a, executor, aVarO);
                        }
                    });
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.f47962a.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: androidx.core.location.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.C0393j.c(this.f47986a, executor, timeToFirstFix);
                    }
                });
            }
        }
    }

    private static final class k implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f47965a;

        k(@NonNull Handler handler) {
            this.f47965a = (Handler) androidx.core.util.t.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (Looper.myLooper() == this.f47965a.getLooper()) {
                runnable.run();
            } else {
                if (this.f47965a.post((Runnable) androidx.core.util.t.l(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.f47965a + " is shutting down");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f47966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.core.location.f f47967b;

        l(String str, androidx.core.location.f fVar) {
            this.f47966a = (String) androidx.core.util.o.e(str, "invalid null provider");
            this.f47967b = (androidx.core.location.f) androidx.core.util.o.e(fVar, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f47966a.equals(lVar.f47966a) && this.f47967b.equals(lVar.f47967b);
        }

        public int hashCode() {
            return androidx.core.util.o.b(this.f47966a, this.f47967b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @w0(24)
    static class n extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.core.location.a.AbstractC0390a f47970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        volatile Executor f47971b;

        n(androidx.core.location.a.AbstractC0390a abstractC0390a) {
            androidx.core.util.t.b(abstractC0390a != null, "invalid null callback");
            this.f47970a = abstractC0390a;
        }

        public static /* synthetic */ void a(n nVar, Executor executor) {
            if (nVar.f47971b != executor) {
                return;
            }
            nVar.f47970a.d();
        }

        public static /* synthetic */ void b(n nVar, Executor executor, int i10) {
            if (nVar.f47971b != executor) {
                return;
            }
            nVar.f47970a.a(i10);
        }

        public static /* synthetic */ void c(n nVar, Executor executor) {
            if (nVar.f47971b != executor) {
                return;
            }
            nVar.f47970a.c();
        }

        public static /* synthetic */ void d(n nVar, Executor executor, GnssStatus gnssStatus) {
            if (nVar.f47971b != executor) {
                return;
            }
            nVar.f47970a.b(androidx.core.location.a.n(gnssStatus));
        }

        public void e(Executor executor) {
            androidx.core.util.t.b(executor != null, "invalid null executor");
            androidx.core.util.t.n(this.f47971b == null);
            this.f47971b = executor;
        }

        public void f() {
            this.f47971b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i10) {
            final Executor executor = this.f47971b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.z
                @Override // java.lang.Runnable
                public final void run() {
                    j.n.b(this.f48006a, executor, i10);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f47971b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.a0
                @Override // java.lang.Runnable
                public final void run() {
                    j.n.d(this.f47874a, executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f47971b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.c0
                @Override // java.lang.Runnable
                public final void run() {
                    j.n.c(this.f47896a, executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f47971b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.b0
                @Override // java.lang.Runnable
                public final void run() {
                    j.n.a(this.f47878a, executor);
                }
            });
        }
    }

    private j() {
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void c(@NonNull LocationManager locationManager, @NonNull String str, @p0 CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final androidx.core.util.e<Location> eVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.a(locationManager, str, cancellationSignal, executor, eVar);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - androidx.core.location.d.c(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: androidx.core.location.g
                @Override // java.lang.Runnable
                public final void run() {
                    eVar.accept(lastKnownLocation);
                }
            });
            return;
        }
        final f fVar = new f(locationManager, executor, eVar);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, fVar, Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.core.location.h
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    fVar.c();
                }
            });
        }
        fVar.e(30000L);
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @Deprecated
    public static void d(@NonNull LocationManager locationManager, @NonNull String str, @p0 androidx.core.os.f fVar, @NonNull Executor executor, @NonNull androidx.core.util.e<Location> eVar) {
        c(locationManager, str, fVar != null ? (CancellationSignal) fVar.b() : null, executor, eVar);
    }

    @p0
    public static String e(@NonNull LocationManager locationManager) {
        return c.a(locationManager);
    }

    public static int f(@NonNull LocationManager locationManager) {
        return c.b(locationManager);
    }

    public static boolean g(@NonNull LocationManager locationManager, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            if (locationManager.getProvider(str) != null) {
                return true;
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    public static boolean h(@NonNull LocationManager locationManager) {
        return c.c(locationManager);
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    @w0(24)
    public static boolean i(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback, @NonNull Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 30) {
            return b.b(locationManager, callback, handler);
        }
        if (i10 == 30) {
            return k(locationManager, androidx.core.os.j.a(handler), callback);
        }
        h3<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> h3Var = g.f47958b;
        synchronized (h3Var) {
            try {
                s(locationManager, callback);
                if (!b.b(locationManager, callback, handler)) {
                    return false;
                }
                h3Var.put(callback, callback);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    @w0(24)
    public static boolean j(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 30) {
            return e.b(locationManager, executor, callback);
        }
        if (i10 == 30) {
            return k(locationManager, executor, callback);
        }
        h3<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> h3Var = g.f47958b;
        synchronized (h3Var) {
            try {
                h hVar = new h(callback, executor);
                s(locationManager, callback);
                if (!b.a(locationManager, hVar)) {
                    return false;
                }
                h3Var.put(callback, hVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @w0(30)
    private static boolean k(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT != 30) {
            throw new IllegalStateException();
        }
        try {
            if (f47943e == null) {
                f47943e = Class.forName("android.location.GnssRequest$Builder");
            }
            if (f47944f == null) {
                Method declaredMethod = f47943e.getDeclaredMethod("build", null);
                f47944f = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (f47945g == null) {
                Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class);
                f47945g = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
            Object objInvoke = f47945g.invoke(locationManager, f47944f.invoke(f47943e.getDeclaredConstructor(null).newInstance(null), null), executor, callback);
            return objInvoke != null && ((Boolean) objInvoke).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    private static boolean l(LocationManager locationManager, Handler handler, Executor executor, androidx.core.location.a.AbstractC0390a abstractC0390a) {
        return Build.VERSION.SDK_INT >= 30 ? d.b(locationManager, handler, executor, abstractC0390a) : b.c(locationManager, handler, executor, abstractC0390a);
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    public static boolean m(@NonNull LocationManager locationManager, @NonNull androidx.core.location.a.AbstractC0390a abstractC0390a, @NonNull Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? n(locationManager, androidx.core.os.j.a(handler), abstractC0390a) : n(locationManager, new k(handler), abstractC0390a);
    }

    @a1("android.permission.ACCESS_FINE_LOCATION")
    public static boolean n(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull androidx.core.location.a.AbstractC0390a abstractC0390a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return l(locationManager, null, executor, abstractC0390a);
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return l(locationManager, new Handler(looperMyLooper), executor, abstractC0390a);
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.b0("sLocationListeners")
    static void o(LocationManager locationManager, m mVar) {
        WeakReference<m> weakReferencePut = f47946h.put(mVar.g(), new WeakReference<>(mVar));
        m mVar2 = weakReferencePut != null ? weakReferencePut.get() : null;
        if (mVar2 != null) {
            mVar2.h();
            locationManager.removeUpdates(mVar2);
        }
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void p(@NonNull LocationManager locationManager, @NonNull androidx.core.location.f fVar) {
        WeakHashMap<l, WeakReference<m>> weakHashMap = f47946h;
        synchronized (weakHashMap) {
            try {
                Iterator<WeakReference<m>> it = weakHashMap.values().iterator();
                ArrayList arrayList = null;
                while (it.hasNext()) {
                    m mVar = it.next().get();
                    if (mVar != null) {
                        l lVarG = mVar.g();
                        if (lVarG.f47967b == fVar) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(lVarG);
                            mVar.h();
                            locationManager.removeUpdates(mVar);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f47946h.remove((l) it2.next());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        locationManager.removeUpdates(fVar);
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void q(@NonNull LocationManager locationManager, @NonNull String str, @NonNull e0 e0Var, @NonNull androidx.core.location.f fVar, @NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(locationManager, str, e0Var.h(), androidx.core.os.j.a(new Handler(looper)), fVar);
        } else {
            if (a.a(locationManager, str, e0Var, fVar, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, e0Var.b(), e0Var.e(), fVar, looper);
        }
    }

    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void r(@NonNull LocationManager locationManager, @NonNull String str, @NonNull e0 e0Var, @NonNull Executor executor, @NonNull androidx.core.location.f fVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            e.c(locationManager, str, e0Var.h(), executor, fVar);
            return;
        }
        if (i10 < 30 || !d.c(locationManager, str, e0Var, executor, fVar)) {
            m mVar = new m(new l(str, fVar), executor);
            if (a.b(locationManager, str, e0Var, mVar)) {
                return;
            }
            synchronized (f47946h) {
                locationManager.requestLocationUpdates(str, e0Var.b(), e0Var.e(), mVar, Looper.getMainLooper());
                o(locationManager, mVar);
            }
        }
    }

    @w0(24)
    public static void s(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.d(locationManager, callback);
            return;
        }
        h3<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> h3Var = g.f47958b;
        synchronized (h3Var) {
            try {
                GnssMeasurementsEvent.Callback callbackRemove = h3Var.remove(callback);
                if (callbackRemove != null) {
                    if (callbackRemove instanceof h) {
                        ((h) callbackRemove).c();
                    }
                    b.d(locationManager, callbackRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void t(@NonNull LocationManager locationManager, @NonNull androidx.core.location.a.AbstractC0390a abstractC0390a) {
        h3<Object, Object> h3Var = g.f47957a;
        synchronized (h3Var) {
            try {
                Object objRemove = h3Var.remove(abstractC0390a);
                if (objRemove != null) {
                    b.e(locationManager, objRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class m implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        volatile l f47968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f47969b;

        m(@p0 l lVar, Executor executor) {
            this.f47968a = lVar;
            this.f47969b = executor;
        }

        public static /* synthetic */ void a(m mVar, String str) {
            l lVar = mVar.f47968a;
            if (lVar == null) {
                return;
            }
            lVar.f47967b.onProviderEnabled(str);
        }

        public static /* synthetic */ void b(m mVar, String str, int i10, Bundle bundle) {
            l lVar = mVar.f47968a;
            if (lVar == null) {
                return;
            }
            lVar.f47967b.onStatusChanged(str, i10, bundle);
        }

        public static /* synthetic */ void c(m mVar, Location location) {
            l lVar = mVar.f47968a;
            if (lVar == null) {
                return;
            }
            lVar.f47967b.onLocationChanged(location);
        }

        public static /* synthetic */ void d(m mVar, List list) {
            l lVar = mVar.f47968a;
            if (lVar == null) {
                return;
            }
            lVar.f47967b.onLocationChanged((List<Location>) list);
        }

        public static /* synthetic */ void e(m mVar, String str) {
            l lVar = mVar.f47968a;
            if (lVar == null) {
                return;
            }
            lVar.f47967b.onProviderDisabled(str);
        }

        public static /* synthetic */ void f(m mVar, int i10) {
            l lVar = mVar.f47968a;
            if (lVar == null) {
                return;
            }
            lVar.f47967b.onFlushComplete(i10);
        }

        public l g() {
            return (l) androidx.core.util.o.d(this.f47968a);
        }

        public void h() {
            this.f47968a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i10) {
            if (this.f47968a == null) {
                return;
            }
            this.f47969b.execute(new Runnable() { // from class: androidx.core.location.x
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.f(this.f48000a, i10);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@NonNull final Location location) {
            if (this.f47968a == null) {
                return;
            }
            this.f47969b.execute(new Runnable() { // from class: androidx.core.location.w
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.c(this.f47998a, location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@NonNull final String str) {
            if (this.f47968a == null) {
                return;
            }
            this.f47969b.execute(new Runnable() { // from class: androidx.core.location.u
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.e(this.f47994a, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@NonNull final String str) {
            if (this.f47968a == null) {
                return;
            }
            this.f47969b.execute(new Runnable() { // from class: androidx.core.location.t
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.a(this.f47992a, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i10, final Bundle bundle) {
            if (this.f47968a == null) {
                return;
            }
            this.f47969b.execute(new Runnable() { // from class: androidx.core.location.y
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.b(this.f48002a, str, i10, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@NonNull final List<Location> list) {
            if (this.f47968a == null) {
                return;
            }
            this.f47969b.execute(new Runnable() { // from class: androidx.core.location.v
                @Override // java.lang.Runnable
                public final void run() {
                    j.m.d(this.f47996a, list);
                }
            });
        }
    }
}
