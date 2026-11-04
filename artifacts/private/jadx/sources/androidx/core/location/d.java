package androidx.core.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.v0;
import androidx.annotation.w0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f47898a = "mockLocation";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f47899b = "verticalAccuracy";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f47900c = "speedAccuracy";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f47901d = "bearingAccuracy";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f47902e = "androidx.core.location.extra.MSL_ALTITUDE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f47903f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private static Method f47904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private static Field f47905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private static Integer f47906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private static Integer f47907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private static Integer f47908k;

    @w0(26)
    private static class a {
        private a() {
        }

        static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        static void g(Location location) {
            try {
                d.e().setByte(location, (byte) (d.e().getByte(location) & (~d.f())));
            } catch (IllegalAccessException e10) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e10);
                throw illegalAccessError;
            } catch (NoSuchFieldException e11) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e11);
                throw noSuchFieldError;
            }
        }

        static void h(Location location) {
            try {
                d.e().setByte(location, (byte) (d.e().getByte(location) & (~d.g())));
            } catch (IllegalAccessException e10) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e10);
                throw illegalAccessError;
            } catch (NoSuchFieldException e11) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e11);
                throw noSuchFieldError;
            }
        }

        static void i(Location location) {
            try {
                d.e().setByte(location, (byte) (d.e().getByte(location) & (~d.h())));
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e10);
                throw illegalAccessError;
            }
        }

        static void j(Location location, float f10) {
            location.setBearingAccuracyDegrees(f10);
        }

        static void k(Location location, float f10) {
            location.setSpeedAccuracyMetersPerSecond(f10);
        }

        static void l(Location location, float f10) {
            location.setVerticalAccuracyMeters(f10);
        }
    }

    @w0(28)
    private static class b {
        private b() {
        }

        static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    @w0(29)
    private static class c {
        private c() {
        }

        static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.a(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.b(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.c(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.d$d, reason: collision with other inner class name */
    @w0(31)
    static class C0392d {
        private C0392d() {
        }

        static boolean a(Location location) {
            return location.isMock();
        }
    }

    @w0(33)
    private static class e {
        private e() {
        }

        static void a(Location location) {
            location.removeBearingAccuracy();
        }

        static void b(Location location) {
            location.removeSpeedAccuracy();
        }

        static void c(Location location) {
            location.removeVerticalAccuracy();
        }
    }

    @w0(34)
    private static class f {
        private f() {
        }

        static float a(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        static double b(Location location) {
            return location.getMslAltitudeMeters();
        }

        static boolean c(Location location) {
            return location.hasMslAltitude();
        }

        static boolean d(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        static void e(Location location) {
            location.removeMslAltitude();
        }

        static void f(Location location) {
            location.removeMslAltitudeAccuracy();
        }

        static void g(Location location, float f10) {
            location.setMslAltitudeAccuracyMeters(f10);
        }

        static void h(Location location, double d10) {
            location.setMslAltitudeMeters(d10);
        }
    }

    private d() {
    }

    public static void A(@NonNull Location location, float f10) {
        a.j(location, f10);
    }

    @e.a({"BanUncheckedReflection"})
    public static void B(@NonNull Location location, boolean z10) {
        try {
            l().invoke(location, Boolean.valueOf(z10));
        } catch (IllegalAccessException e10) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e10);
            throw illegalAccessError;
        } catch (NoSuchMethodException e11) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e11);
            throw noSuchMethodError;
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static void C(@NonNull Location location, @androidx.annotation.x(from = 0.0d) float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.g(location, f10);
        } else {
            k(location).putFloat(f47903f, f10);
        }
    }

    public static void D(@NonNull Location location, double d10) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.h(location, d10);
        } else {
            k(location).putDouble(f47902e, d10);
        }
    }

    public static void E(@NonNull Location location, float f10) {
        a.k(location, f10);
    }

    public static void F(@NonNull Location location, float f10) {
        a.l(location, f10);
    }

    private static boolean a(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    public static float b(@NonNull Location location) {
        return a.a(location);
    }

    public static long c(@NonNull Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    @v0(expression = "location.getElapsedRealtimeNanos()")
    @Deprecated
    public static long d(@NonNull Location location) {
        return location.getElapsedRealtimeNanos();
    }

    @e.a({"BlockedPrivateApi"})
    static Field e() throws NoSuchFieldException {
        if (f47905h == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f47905h = declaredField;
            declaredField.setAccessible(true);
        }
        return f47905h;
    }

    @e.a({"SoonBlockedPrivateApi"})
    static int f() throws IllegalAccessException, NoSuchFieldException {
        if (f47907j == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f47907j = Integer.valueOf(declaredField.getInt(null));
        }
        return f47907j.intValue();
    }

    @e.a({"SoonBlockedPrivateApi"})
    static int g() throws IllegalAccessException, NoSuchFieldException {
        if (f47906i == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f47906i = Integer.valueOf(declaredField.getInt(null));
        }
        return f47906i.intValue();
    }

    @e.a({"SoonBlockedPrivateApi"})
    static int h() throws IllegalAccessException, NoSuchFieldException {
        if (f47908k == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f47908k = Integer.valueOf(declaredField.getInt(null));
        }
        return f47908k.intValue();
    }

    @androidx.annotation.x(from = 0.0d)
    public static float i(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.a(location) : k(location).getFloat(f47903f);
    }

    public static double j(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.b(location) : k(location).getDouble(f47902e);
    }

    private static Bundle k(@NonNull Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    private static Method l() throws NoSuchMethodException {
        if (f47904g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f47904g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f47904g;
    }

    public static float m(@NonNull Location location) {
        return a.b(location);
    }

    public static float n(@NonNull Location location) {
        return a.c(location);
    }

    public static boolean o(@NonNull Location location) {
        return a.d(location);
    }

    public static boolean p(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.c(location) : a(location, f47902e);
    }

    public static boolean q(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? f.d(location) : a(location, f47903f);
    }

    public static boolean r(@NonNull Location location) {
        return a.e(location);
    }

    public static boolean s(@NonNull Location location) {
        return a.f(location);
    }

    public static boolean t(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 31 ? C0392d.a(location) : location.isFromMockProvider();
    }

    public static void u(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 33) {
            e.a(location);
        } else {
            c.a(location);
        }
    }

    private static void v(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static void w(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.e(location);
        } else {
            v(location, f47902e);
        }
    }

    public static void x(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            f.f(location);
        } else {
            v(location, f47903f);
        }
    }

    public static void y(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 33) {
            e.b(location);
        } else {
            c.b(location);
        }
    }

    public static void z(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 33) {
            e.c(location);
        } else {
            c.c(location);
        }
    }
}
