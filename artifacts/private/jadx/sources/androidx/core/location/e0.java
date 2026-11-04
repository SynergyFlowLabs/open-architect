package androidx.core.location;

import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.collection.g3;
import androidx.core.util.j0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f47909h = Long.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f47910i = 100;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f47911j = 102;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f47912k = 104;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f47913l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f47914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f47915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f47916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f47917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f47918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f47919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f47920g;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Class<?> f47921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f47922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f47923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static Method f47924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Method f47925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Method f47926f;

        private a() {
        }

        @e.a({"BanUncheckedReflection"})
        public static Object a(e0 e0Var, String str) {
            try {
                if (f47921a == null) {
                    f47921a = Class.forName("android.location.LocationRequest");
                }
                Method method = f47922b;
                Class cls = Long.TYPE;
                boolean z10 = !true;
                if (method == null) {
                    Method declaredMethod = f47921a.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                    f47922b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object objInvoke = f47922b.invoke(null, str, Long.valueOf(e0Var.b()), Float.valueOf(e0Var.e()), Boolean.FALSE);
                if (objInvoke == null) {
                    return null;
                }
                Method method2 = f47923c;
                Class cls2 = Integer.TYPE;
                if (method2 == null) {
                    Method declaredMethod2 = f47921a.getDeclaredMethod("setQuality", cls2);
                    f47923c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f47923c.invoke(objInvoke, Integer.valueOf(e0Var.g()));
                if (f47924d == null) {
                    Method declaredMethod3 = f47921a.getDeclaredMethod("setFastestInterval", cls);
                    f47924d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f47924d.invoke(objInvoke, Long.valueOf(e0Var.f()));
                if (e0Var.d() < Integer.MAX_VALUE) {
                    if (f47925e == null) {
                        Method declaredMethod4 = f47921a.getDeclaredMethod("setNumUpdates", cls2);
                        f47925e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f47925e.invoke(objInvoke, Integer.valueOf(e0Var.d()));
                }
                if (e0Var.a() < Long.MAX_VALUE) {
                    if (f47926f == null) {
                        Method declaredMethod5 = f47921a.getDeclaredMethod("setExpireIn", cls);
                        f47926f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f47926f.invoke(objInvoke, Long.valueOf(e0Var.a()));
                }
                return objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    @w0(31)
    private static class b {
        private b() {
        }

        public static LocationRequest a(e0 e0Var) {
            return new LocationRequest.Builder(e0Var.b()).setQuality(e0Var.g()).setMinUpdateIntervalMillis(e0Var.f()).setDurationMillis(e0Var.a()).setMaxUpdates(e0Var.d()).setMinUpdateDistanceMeters(e0Var.e()).setMaxUpdateDelayMillis(e0Var.c()).build();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface d {
    }

    e0(long j10, int i10, long j11, int i11, long j12, float f10, long j13) {
        this.f47915b = j10;
        this.f47914a = i10;
        this.f47916c = j12;
        this.f47917d = j11;
        this.f47918e = i11;
        this.f47919f = f10;
        this.f47920g = j13;
    }

    @g0(from = 1)
    public long a() {
        return this.f47917d;
    }

    @g0(from = 0)
    public long b() {
        return this.f47915b;
    }

    @g0(from = 0)
    public long c() {
        return this.f47920g;
    }

    @g0(from = 1, to = g3.f12256c)
    public int d() {
        return this.f47918e;
    }

    @androidx.annotation.x(from = 0.0d, to = 3.4028234663852886E38d)
    public float e() {
        return this.f47919f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f47914a == e0Var.f47914a && this.f47915b == e0Var.f47915b && this.f47916c == e0Var.f47916c && this.f47917d == e0Var.f47917d && this.f47918e == e0Var.f47918e && Float.compare(e0Var.f47919f, this.f47919f) == 0 && this.f47920g == e0Var.f47920g;
    }

    @g0(from = 0)
    public long f() {
        long j10 = this.f47916c;
        return j10 == -1 ? this.f47915b : j10;
    }

    public int g() {
        return this.f47914a;
    }

    @NonNull
    @w0(31)
    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        int i10 = this.f47914a * 31;
        long j10 = this.f47915b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f47916c;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    @e.a({"NewApi"})
    @p0
    public LocationRequest i(@NonNull String str) {
        return Build.VERSION.SDK_INT >= 31 ? h() : d0.a(a.a(this, str));
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (this.f47915b != Long.MAX_VALUE) {
            sb2.append("@");
            j0.e(this.f47915b, sb2);
            int i10 = this.f47914a;
            if (i10 == 100) {
                sb2.append(" HIGH_ACCURACY");
            } else if (i10 == 102) {
                sb2.append(" BALANCED");
            } else if (i10 == 104) {
                sb2.append(" LOW_POWER");
            }
        } else {
            sb2.append("PASSIVE");
        }
        if (this.f47917d != Long.MAX_VALUE) {
            sb2.append(", duration=");
            j0.e(this.f47917d, sb2);
        }
        if (this.f47918e != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f47918e);
        }
        long j10 = this.f47916c;
        if (j10 != -1 && j10 < this.f47915b) {
            sb2.append(", minUpdateInterval=");
            j0.e(this.f47916c, sb2);
        }
        if (this.f47919f > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f47919f);
        }
        if (this.f47920g / 2 > this.f47915b) {
            sb2.append(", maxUpdateDelay=");
            j0.e(this.f47920g, sb2);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f47927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f47928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f47929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f47930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f47931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f47932f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f47933g;

        public c(long j10) {
            d(j10);
            this.f47928b = 102;
            this.f47929c = Long.MAX_VALUE;
            this.f47930d = Integer.MAX_VALUE;
            this.f47931e = -1L;
            this.f47932f = 0.0f;
            this.f47933g = 0L;
        }

        @NonNull
        public e0 a() {
            androidx.core.util.t.o((this.f47927a == Long.MAX_VALUE && this.f47931e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j10 = this.f47927a;
            return new e0(j10, this.f47928b, this.f47929c, this.f47930d, Math.min(this.f47931e, j10), this.f47932f, this.f47933g);
        }

        @NonNull
        public c b() {
            this.f47931e = -1L;
            return this;
        }

        @NonNull
        public c c(@g0(from = 1) long j10) {
            this.f47929c = androidx.core.util.t.h(j10, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @NonNull
        public c d(@g0(from = 0) long j10) {
            this.f47927a = androidx.core.util.t.h(j10, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @NonNull
        public c e(@g0(from = 0) long j10) {
            this.f47933g = j10;
            this.f47933g = androidx.core.util.t.h(j10, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @NonNull
        public c f(@g0(from = 1, to = g3.f12256c) int i10) {
            this.f47930d = androidx.core.util.t.g(i10, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @NonNull
        public c g(@androidx.annotation.x(from = 0.0d, to = 3.4028234663852886E38d) float f10) {
            this.f47932f = f10;
            this.f47932f = androidx.core.util.t.f(f10, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @NonNull
        public c h(@g0(from = 0) long j10) {
            this.f47931e = androidx.core.util.t.h(j10, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @NonNull
        public c i(int i10) {
            androidx.core.util.t.c(i10 == 104 || i10 == 102 || i10 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i10));
            this.f47928b = i10;
            return this;
        }

        public c(@NonNull e0 e0Var) {
            this.f47927a = e0Var.f47915b;
            this.f47928b = e0Var.f47914a;
            this.f47929c = e0Var.f47917d;
            this.f47930d = e0Var.f47918e;
            this.f47931e = e0Var.f47916c;
            this.f47932f = e0Var.f47919f;
            this.f47933g = e0Var.f47920g;
        }
    }
}
