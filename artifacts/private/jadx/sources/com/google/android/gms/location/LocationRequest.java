package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.n3;
import com.google.android.gms.internal.location.zze;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LocationRequestCreator")
@SafeParcelable.g({4, 5, 14, 1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new c0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final int f109557o = 100;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f109558s = 102;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f109559t = 104;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f109560v = 105;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    private int f109561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    private long f109562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    private long f109563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.appevents.p.f99189d0, getter = "getMaxUpdateDelayMillis", id = 8)
    private long f109564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    private long f109565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    private int f109566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = com.facebook.appevents.p.f99189d0, getter = "getMinUpdateDistanceMeters", id = 7)
    private float f109567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "isWaitForAccurateLocation", id = 9)
    private boolean f109568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = CreateTicketViewModelKt.EmailId, getter = "getMaxUpdateAgeMillis", id = 11)
    private long f109569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    private final int f109570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    private final int f109571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "isBypass", id = 15)
    private final boolean f109572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)
    private final WorkSource f109573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SafeParcelable.c(getter = "getImpersonation", id = 17)
    @androidx.annotation.p0
    private final zze f109574n;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, AuthenticationTokenClaims.Z, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    @NonNull
    @Deprecated
    public static LocationRequest O1() {
        return new LocationRequest(102, 3600000L, AuthenticationTokenClaims.Z, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String s4(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : n3.b(j10);
    }

    @xl.d
    public long B2() {
        return this.f109563c;
    }

    @Deprecated
    @xl.d
    public int D2() {
        return s2();
    }

    @Deprecated
    @xl.d
    public long D6() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f109565e;
        long j11 = jElapsedRealtime + j10;
        if (((jElapsedRealtime ^ j11) & (j10 ^ j11)) < 0) {
            return Long.MAX_VALUE;
        }
        return j11;
    }

    @NonNull
    @Deprecated
    public LocationRequest F3(long j10) {
        this.f109565e = Math.max(1L, j10 - SystemClock.elapsedRealtime());
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest G3(long j10) {
        com.google.android.gms.common.internal.w.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.f109563c = j10;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest I3(long j10) {
        com.google.android.gms.common.internal.w.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f109563c;
        long j12 = this.f109562b;
        if (j11 == j12 / 6) {
            this.f109563c = j10 / 6;
        }
        if (this.f109569i == j12) {
            this.f109569i = j10;
        }
        this.f109562b = j10;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest S3(long j10) {
        com.google.android.gms.common.internal.w.c(j10 >= 0, "illegal max wait time: %d", Long.valueOf(j10));
        this.f109564d = j10;
        return this;
    }

    @xl.d
    public long T1() {
        return this.f109565e;
    }

    @NonNull
    @Deprecated
    public LocationRequest T3(int i10) {
        if (i10 > 0) {
            this.f109566f = i10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
        sb2.append("invalid numUpdates: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    @xl.d
    public int U2() {
        return this.f109561a;
    }

    @Deprecated
    @xl.d
    public float W2() {
        return z2();
    }

    @Deprecated
    @xl.d
    public long b2() {
        return B2();
    }

    @xl.d
    public int e2() {
        return this.f109570j;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f109561a == locationRequest.f109561a && ((r3() || this.f109562b == locationRequest.f109562b) && this.f109563c == locationRequest.f109563c && h3() == locationRequest.h3() && ((!h3() || this.f109564d == locationRequest.f109564d) && this.f109565e == locationRequest.f109565e && this.f109566f == locationRequest.f109566f && this.f109567g == locationRequest.f109567g && this.f109568h == locationRequest.f109568h && this.f109570j == locationRequest.f109570j && this.f109571k == locationRequest.f109571k && this.f109572l == locationRequest.f109572l && this.f109573m.equals(locationRequest.f109573m) && com.google.android.gms.common.internal.u.b(this.f109574n, locationRequest.f109574n)))) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    @xl.d
    public long f2() {
        return n2();
    }

    @NonNull
    @Deprecated
    public LocationRequest f4(int i10) {
        j0.a(i10);
        this.f109561a = i10;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest g4(float f10) {
        if (f10 >= 0.0f) {
            this.f109567g = f10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(f10).length() + 22);
        sb2.append("invalid displacement: ");
        sb2.append(f10);
        throw new IllegalArgumentException(sb2.toString());
    }

    @xl.d
    public boolean h3() {
        long j10 = this.f109564d;
        if (j10 <= 0) {
            return false;
        }
        int i10 = 3 & 1;
        return (j10 >> 1) >= this.f109562b;
    }

    @NonNull
    @Deprecated
    public LocationRequest h4(boolean z10) {
        this.f109568h = z10;
        return this;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f109561a), Long.valueOf(this.f109562b), Long.valueOf(this.f109563c), this.f109573m);
    }

    @Deprecated
    @xl.d
    public boolean k3() {
        return true;
    }

    @xl.d
    public final int k4() {
        return this.f109571k;
    }

    @xl.d
    public long n2() {
        return this.f109562b;
    }

    @xl.d
    public final boolean n4() {
        return this.f109572l;
    }

    @NonNull
    @xl.d
    public final WorkSource o4() {
        return this.f109573m;
    }

    @xl.d
    public long p2() {
        return this.f109569i;
    }

    @xl.d
    public long q2() {
        return this.f109564d;
    }

    @xl.d
    public boolean r3() {
        return this.f109561a == 105;
    }

    @androidx.annotation.p0
    @xl.d
    public final zze r4() {
        return this.f109574n;
    }

    @xl.d
    public int s2() {
        return this.f109566f;
    }

    public boolean t3() {
        return this.f109568h;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (r3()) {
            sb2.append(j0.b(this.f109561a));
            if (this.f109564d > 0) {
                sb2.append("/");
                n3.c(this.f109564d, sb2);
            }
        } else {
            sb2.append("@");
            if (h3()) {
                n3.c(this.f109562b, sb2);
                sb2.append("/");
                n3.c(this.f109564d, sb2);
            } else {
                n3.c(this.f109562b, sb2);
            }
            sb2.append(" ");
            sb2.append(j0.b(this.f109561a));
        }
        if (r3() || this.f109563c != this.f109562b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(s4(this.f109563c));
        }
        if (this.f109567g > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f109567g);
        }
        if (!r3() ? this.f109569i != this.f109562b : this.f109569i != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(s4(this.f109569i));
        }
        if (this.f109565e != Long.MAX_VALUE) {
            sb2.append(", duration=");
            n3.c(this.f109565e, sb2);
        }
        if (this.f109566f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f109566f);
        }
        if (this.f109571k != 0) {
            sb2.append(", ");
            sb2.append(n0.b(this.f109571k));
        }
        if (this.f109570j != 0) {
            sb2.append(", ");
            sb2.append(d1.b(this.f109570j));
        }
        if (this.f109568h) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f109572l) {
            sb2.append(", bypass");
        }
        if (!com.google.android.gms.common.util.d0.h(this.f109573m)) {
            sb2.append(", ");
            sb2.append(this.f109573m);
        }
        if (this.f109574n != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f109574n);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Deprecated
    @xl.d
    public long u2() {
        return Math.max(this.f109564d, this.f109562b);
    }

    @NonNull
    @Deprecated
    public LocationRequest w3(long j10) {
        com.google.android.gms.common.internal.w.b(j10 > 0, "durationMillis must be greater than 0");
        this.f109565e = j10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, U2());
        i6.b.K(parcel, 2, n2());
        i6.b.K(parcel, 3, B2());
        int i11 = 2 ^ 6;
        i6.b.F(parcel, 6, s2());
        i6.b.w(parcel, 7, z2());
        i6.b.K(parcel, 8, q2());
        i6.b.g(parcel, 9, t3());
        i6.b.K(parcel, 10, T1());
        i6.b.K(parcel, 11, p2());
        i6.b.F(parcel, 12, e2());
        i6.b.F(parcel, 13, this.f109571k);
        i6.b.g(parcel, 15, this.f109572l);
        i6.b.S(parcel, 16, this.f109573m, i10, false);
        i6.b.S(parcel, 17, this.f109574n, i10, false);
        i6.b.b(parcel, iA);
    }

    @xl.d
    public float z2() {
        return this.f109567g;
    }

    public static final class a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final long f109575o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final long f109576p = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f109577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f109578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f109579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f109580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f109581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f109582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f109583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f109584h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f109585i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f109586j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f109587k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f109588l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.annotation.p0
        private WorkSource f109589m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @androidx.annotation.p0
        private zze f109590n;

        public a(int i10, long j10) {
            this(j10);
            j(i10);
        }

        @NonNull
        public LocationRequest a() {
            int i10 = this.f109577a;
            long j10 = this.f109578b;
            long jMin = this.f109579c;
            if (jMin == -1) {
                jMin = j10;
            } else if (i10 != 105) {
                jMin = Math.min(jMin, j10);
            }
            long jMax = Math.max(this.f109580d, this.f109578b);
            long j11 = jMin;
            long j12 = this.f109581e;
            int i11 = this.f109582f;
            float f10 = this.f109583g;
            boolean z10 = this.f109584h;
            long j13 = this.f109585i;
            if (j13 == -1) {
                j13 = this.f109578b;
            }
            return new LocationRequest(i10, j10, j11, jMax, Long.MAX_VALUE, j12, i11, f10, z10, j13, this.f109586j, this.f109587k, this.f109588l, new WorkSource(this.f109589m), this.f109590n);
        }

        @NonNull
        public a b(long j10) {
            com.google.android.gms.common.internal.w.b(j10 > 0, "durationMillis must be greater than 0");
            this.f109581e = j10;
            return this;
        }

        @NonNull
        public a c(int i10) {
            d1.a(i10);
            this.f109586j = i10;
            return this;
        }

        @NonNull
        public a d(long j10) {
            com.google.android.gms.common.internal.w.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f109578b = j10;
            return this;
        }

        @NonNull
        public a e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            com.google.android.gms.common.internal.w.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f109585i = j10;
            return this;
        }

        @NonNull
        public a f(long j10) {
            com.google.android.gms.common.internal.w.b(j10 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f109580d = j10;
            return this;
        }

        @NonNull
        public a g(int i10) {
            com.google.android.gms.common.internal.w.b(i10 > 0, "maxUpdates must be greater than 0");
            this.f109582f = i10;
            return this;
        }

        @NonNull
        public a h(float f10) {
            com.google.android.gms.common.internal.w.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f109583g = f10;
            return this;
        }

        @NonNull
        public a i(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            com.google.android.gms.common.internal.w.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f109579c = j10;
            return this;
        }

        @NonNull
        public a j(int i10) {
            j0.a(i10);
            this.f109577a = i10;
            return this;
        }

        @NonNull
        public a k(boolean z10) {
            this.f109584h = z10;
            return this;
        }

        @NonNull
        public final a l(int i10) {
            n0.a(i10);
            this.f109587k = i10;
            return this;
        }

        @NonNull
        @androidx.annotation.a1(anyOf = {"android.permission.WRITE_SECURE_SETTINGS", "android.permission.LOCATION_BYPASS"})
        public final a m(boolean z10) {
            this.f109588l = z10;
            return this;
        }

        @NonNull
        @androidx.annotation.a1("android.permission.UPDATE_DEVICE_STATS")
        public final a n(@androidx.annotation.p0 WorkSource workSource) {
            this.f109589m = workSource;
            return this;
        }

        public a(long j10) {
            this.f109577a = 102;
            this.f109579c = -1L;
            this.f109580d = 0L;
            this.f109581e = Long.MAX_VALUE;
            this.f109582f = Integer.MAX_VALUE;
            this.f109583g = 0.0f;
            this.f109584h = true;
            this.f109585i = -1L;
            this.f109586j = 0;
            this.f109587k = 0;
            this.f109588l = false;
            this.f109589m = null;
            this.f109590n = null;
            d(j10);
        }

        public a(@NonNull LocationRequest locationRequest) {
            this(locationRequest.U2(), locationRequest.n2());
            i(locationRequest.B2());
            f(locationRequest.q2());
            b(locationRequest.T1());
            g(locationRequest.s2());
            h(locationRequest.z2());
            k(locationRequest.t3());
            e(locationRequest.p2());
            c(locationRequest.e2());
            int iK4 = locationRequest.k4();
            n0.a(iK4);
            this.f109587k = iK4;
            this.f109588l = locationRequest.n4();
            this.f109589m = locationRequest.o4();
            zze zzeVarR4 = locationRequest.r4();
            boolean z10 = true;
            if (zzeVarR4 != null && zzeVarR4.a()) {
                z10 = false;
            }
            com.google.android.gms.common.internal.w.a(z10);
            this.f109590n = zzeVarR4;
        }
    }

    @SafeParcelable.b
    LocationRequest(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 3) long j11, @SafeParcelable.e(id = 8) long j12, @SafeParcelable.f(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j13, @SafeParcelable.e(id = 10) long j14, @SafeParcelable.e(id = 6) int i11, @SafeParcelable.e(id = 7) float f10, @SafeParcelable.e(id = 9) boolean z10, @SafeParcelable.e(id = 11) long j15, @SafeParcelable.e(id = 12) int i12, @SafeParcelable.e(id = 13) int i13, @SafeParcelable.e(id = 15) boolean z11, @SafeParcelable.e(id = 16) WorkSource workSource, @SafeParcelable.e(id = 17) @androidx.annotation.p0 zze zzeVar) {
        this.f109561a = i10;
        if (i10 == 105) {
            this.f109562b = Long.MAX_VALUE;
        } else {
            this.f109562b = j10;
        }
        this.f109563c = j11;
        this.f109564d = j12;
        this.f109565e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f109566f = i11;
        this.f109567g = f10;
        this.f109568h = z10;
        this.f109569i = j15 != -1 ? j15 : j10;
        this.f109570j = i12;
        this.f109571k = i13;
        this.f109572l = z11;
        this.f109573m = workSource;
        this.f109574n = zzeVar;
    }
}
