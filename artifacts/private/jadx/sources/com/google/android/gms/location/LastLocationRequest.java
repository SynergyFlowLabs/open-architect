package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.n3;
import com.google.android.gms.internal.location.zze;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "LastLocationRequestCreator")
@SafeParcelable.g({4})
public final class LastLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long f109542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int f109543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "isBypass", id = 3)
    private final boolean f109544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getImpersonation", id = 5)
    @androidx.annotation.p0
    private final zze f109545d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f109546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f109547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f109548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private final zze f109549d;

        public a() {
            this.f109546a = Long.MAX_VALUE;
            this.f109547b = 0;
            this.f109548c = false;
            this.f109549d = null;
        }

        @NonNull
        public LastLocationRequest a() {
            return new LastLocationRequest(this.f109546a, this.f109547b, this.f109548c, this.f109549d);
        }

        @NonNull
        public a b(int i10) {
            d1.a(i10);
            this.f109547b = i10;
            return this;
        }

        @NonNull
        public a c(long j10) {
            com.google.android.gms.common.internal.w.b(j10 > 0, "maxUpdateAgeMillis must be greater than 0");
            this.f109546a = j10;
            return this;
        }

        public a(@NonNull LastLocationRequest lastLocationRequest) {
            this.f109546a = lastLocationRequest.T1();
            this.f109547b = lastLocationRequest.O1();
            this.f109548c = lastLocationRequest.a();
            this.f109549d = lastLocationRequest.b2();
        }
    }

    @SafeParcelable.b
    LastLocationRequest(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) boolean z10, @SafeParcelable.e(id = 5) @androidx.annotation.p0 zze zzeVar) {
        this.f109542a = j10;
        this.f109543b = i10;
        this.f109544c = z10;
        this.f109545d = zzeVar;
    }

    @xl.d
    public int O1() {
        return this.f109543b;
    }

    @xl.d
    public long T1() {
        return this.f109542a;
    }

    @xl.d
    public final boolean a() {
        return this.f109544c;
    }

    @androidx.annotation.p0
    @xl.d
    public final zze b2() {
        return this.f109545d;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.f109542a == lastLocationRequest.f109542a && this.f109543b == lastLocationRequest.f109543b && this.f109544c == lastLocationRequest.f109544c && com.google.android.gms.common.internal.u.b(this.f109545d, lastLocationRequest.f109545d);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.u.c(Long.valueOf(this.f109542a), Integer.valueOf(this.f109543b), Boolean.valueOf(this.f109544c));
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f109542a != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            n3.c(this.f109542a, sb2);
        }
        if (this.f109543b != 0) {
            sb2.append(", ");
            sb2.append(d1.b(this.f109543b));
        }
        if (this.f109544c) {
            sb2.append(", bypass");
        }
        if (this.f109545d != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f109545d);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.K(parcel, 1, T1());
        i6.b.F(parcel, 2, O1());
        i6.b.g(parcel, 3, this.f109544c);
        int i11 = 7 & 0;
        i6.b.S(parcel, 5, this.f109545d, i10, false);
        i6.b.b(parcel, iA);
    }
}
