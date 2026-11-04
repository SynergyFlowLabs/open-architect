package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.n3;
import com.google.android.gms.internal.location.zze;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "CurrentLocationRequestCreator")
@SafeParcelable.g({8})
public final class CurrentLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long f109486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int f109487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 3)
    private final int f109488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 4)
    private final long f109489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "isBypass", id = 5)
    private final boolean f109490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 7)
    private final int f109491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 6)
    private final WorkSource f109492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getImpersonation", id = 9)
    @androidx.annotation.p0
    private final zze f109493h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f109494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f109495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f109496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f109497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f109498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f109499f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private final WorkSource f109500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private final zze f109501h;

        public a() {
            this.f109494a = 10000L;
            this.f109495b = 0;
            this.f109496c = 102;
            this.f109497d = Long.MAX_VALUE;
            this.f109498e = false;
            this.f109499f = 0;
            this.f109500g = null;
            this.f109501h = null;
        }

        @NonNull
        public CurrentLocationRequest a() {
            return new CurrentLocationRequest(this.f109494a, this.f109495b, this.f109496c, this.f109497d, this.f109498e, this.f109499f, new WorkSource(this.f109500g), this.f109501h);
        }

        @NonNull
        public a b(long j10) {
            com.google.android.gms.common.internal.w.b(j10 > 0, "durationMillis must be greater than 0");
            this.f109497d = j10;
            return this;
        }

        @NonNull
        public a c(int i10) {
            d1.a(i10);
            this.f109495b = i10;
            return this;
        }

        @NonNull
        public a d(long j10) {
            com.google.android.gms.common.internal.w.b(j10 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.f109494a = j10;
            return this;
        }

        @NonNull
        public a e(int i10) {
            j0.a(i10);
            this.f109496c = i10;
            return this;
        }

        public a(@NonNull CurrentLocationRequest currentLocationRequest) {
            this.f109494a = currentLocationRequest.b2();
            this.f109495b = currentLocationRequest.T1();
            this.f109496c = currentLocationRequest.e2();
            this.f109497d = currentLocationRequest.O1();
            this.f109498e = currentLocationRequest.a();
            this.f109499f = currentLocationRequest.f2();
            this.f109500g = new WorkSource(currentLocationRequest.n2());
            this.f109501h = currentLocationRequest.p2();
        }
    }

    @SafeParcelable.b
    CurrentLocationRequest(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) long j11, @SafeParcelable.e(id = 5) boolean z10, @SafeParcelable.e(id = 7) int i12, @SafeParcelable.e(id = 6) WorkSource workSource, @SafeParcelable.e(id = 9) @androidx.annotation.p0 zze zzeVar) {
        this.f109486a = j10;
        this.f109487b = i10;
        this.f109488c = i11;
        this.f109489d = j11;
        this.f109490e = z10;
        this.f109491f = i12;
        this.f109492g = workSource;
        this.f109493h = zzeVar;
    }

    @xl.d
    public long O1() {
        return this.f109489d;
    }

    @xl.d
    public int T1() {
        return this.f109487b;
    }

    @xl.d
    public final boolean a() {
        return this.f109490e;
    }

    @xl.d
    public long b2() {
        return this.f109486a;
    }

    @xl.d
    public int e2() {
        return this.f109488c;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.f109486a == currentLocationRequest.f109486a && this.f109487b == currentLocationRequest.f109487b && this.f109488c == currentLocationRequest.f109488c && this.f109489d == currentLocationRequest.f109489d && this.f109490e == currentLocationRequest.f109490e && this.f109491f == currentLocationRequest.f109491f && com.google.android.gms.common.internal.u.b(this.f109492g, currentLocationRequest.f109492g) && com.google.android.gms.common.internal.u.b(this.f109493h, currentLocationRequest.f109493h);
    }

    @xl.d
    public final int f2() {
        return this.f109491f;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Long.valueOf(this.f109486a), Integer.valueOf(this.f109487b), Integer.valueOf(this.f109488c), Long.valueOf(this.f109489d));
    }

    @NonNull
    @xl.d
    public final WorkSource n2() {
        return this.f109492g;
    }

    @androidx.annotation.p0
    @xl.d
    public final zze p2() {
        return this.f109493h;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(j0.b(this.f109488c));
        if (this.f109486a != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            n3.c(this.f109486a, sb2);
        }
        if (this.f109489d != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.f109489d);
            sb2.append("ms");
        }
        if (this.f109487b != 0) {
            sb2.append(", ");
            sb2.append(d1.b(this.f109487b));
        }
        if (this.f109490e) {
            sb2.append(", bypass");
        }
        if (this.f109491f != 0) {
            sb2.append(", ");
            sb2.append(n0.b(this.f109491f));
        }
        if (!com.google.android.gms.common.util.d0.h(this.f109492g)) {
            sb2.append(", workSource=");
            sb2.append(this.f109492g);
        }
        if (this.f109493h != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f109493h);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 1, b2());
        i6.b.F(parcel, 2, T1());
        i6.b.F(parcel, 3, e2());
        i6.b.K(parcel, 4, O1());
        i6.b.g(parcel, 5, this.f109490e);
        i6.b.S(parcel, 6, this.f109492g, i10, false);
        i6.b.F(parcel, 7, this.f109491f);
        i6.b.S(parcel, 9, this.f109493h, i10, false);
        i6.b.b(parcel, iA);
    }
}
