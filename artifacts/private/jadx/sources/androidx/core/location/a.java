package androidx.core.location;

import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f47866a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f47867b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f47868c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f47869d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f47870e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f47871f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f47872g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e.a({"InlinedApi"})
    public static final int f47873h = 7;

    /* JADX INFO: renamed from: androidx.core.location.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0390a {
        public void a(@g0(from = 0) int i10) {
        }

        public void b(@NonNull a aVar) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface b {
    }

    a() {
    }

    @NonNull
    @w0(24)
    public static a n(@NonNull GnssStatus gnssStatus) {
        return new androidx.core.location.b(gnssStatus);
    }

    @NonNull
    @e.a({"ReferencesDeprecated"})
    public static a o(@NonNull GpsStatus gpsStatus) {
        return new c(gpsStatus);
    }

    @androidx.annotation.x(from = 0.0d, to = 360.0d)
    public abstract float a(@g0(from = 0) int i10);

    @androidx.annotation.x(from = 0.0d, to = 63.0d)
    public abstract float b(@g0(from = 0) int i10);

    @androidx.annotation.x(from = 0.0d)
    public abstract float c(@g0(from = 0) int i10);

    @androidx.annotation.x(from = 0.0d, to = 63.0d)
    public abstract float d(@g0(from = 0) int i10);

    public abstract int e(@g0(from = 0) int i10);

    @androidx.annotation.x(from = -90.0d, to = 90.0d)
    public abstract float f(@g0(from = 0) int i10);

    @g0(from = 0)
    public abstract int g();

    @g0(from = 1, to = 200)
    public abstract int h(@g0(from = 0) int i10);

    public abstract boolean i(@g0(from = 0) int i10);

    public abstract boolean j(@g0(from = 0) int i10);

    public abstract boolean k(@g0(from = 0) int i10);

    public abstract boolean l(@g0(from = 0) int i10);

    public abstract boolean m(@g0(from = 0) int i10);
}
