package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.facebook.internal.z0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ComplianceOptionsCreator")
@g6.a
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final ComplianceOptions f105873e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallerProductId", id = 1)
    private final int f105874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDataOwnerProductId", id = 2)
    private final int f105875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getProcessingReason", id = 3)
    private final int f105876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = z0.P, getter = "isUserData", id = 4)
    private final boolean f105877d;

    @g6.a
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f105878a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f105879b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f105880c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f105881d = true;

        @NonNull
        @g6.a
        public ComplianceOptions a() {
            return new ComplianceOptions(this.f105878a, this.f105879b, this.f105880c, this.f105881d);
        }

        @NonNull
        @g6.a
        public a b(int i10) {
            this.f105878a = i10;
            return this;
        }

        @NonNull
        @g6.a
        public a c(int i10) {
            this.f105879b = i10;
            return this;
        }

        @NonNull
        @g6.a
        public a d(boolean z10) {
            this.f105881d = z10;
            return this;
        }

        @NonNull
        @g6.a
        public a e(int i10) {
            this.f105880c = i10;
            return this;
        }
    }

    static {
        a aVarO1 = O1();
        aVarO1.b(-1);
        aVarO1.c(-1);
        aVarO1.e(0);
        aVarO1.d(true);
        f105873e = aVarO1.a();
        CREATOR = new l0();
    }

    @SafeParcelable.b
    ComplianceOptions(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) boolean z10) {
        this.f105874a = i10;
        this.f105875b = i11;
        this.f105876c = i12;
        this.f105877d = z10;
    }

    @NonNull
    @g6.a
    public static a O1() {
        return new a();
    }

    @NonNull
    @g6.a
    public static final a T1(@NonNull Context context) {
        return O1();
    }

    @NonNull
    @g6.a
    public a b2() {
        a aVar = new a();
        aVar.b(this.f105874a);
        aVar.c(this.f105875b);
        aVar.e(this.f105876c);
        aVar.d(this.f105877d);
        return aVar;
    }

    public final boolean equals(@p0 Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f105874a == complianceOptions.f105874a && this.f105875b == complianceOptions.f105875b && this.f105876c == complianceOptions.f105876c && this.f105877d == complianceOptions.f105877d;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.u.c(Integer.valueOf(this.f105874a), Integer.valueOf(this.f105875b), Integer.valueOf(this.f105876c), Boolean.valueOf(this.f105877d));
    }

    @NonNull
    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.f105874a + ", dataOwnerProductId=" + this.f105875b + ", processingReason=" + this.f105876c + ", isUserData=" + this.f105877d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f105874a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.F(parcel, 2, this.f105875b);
        i6.b.F(parcel, 3, this.f105876c);
        i6.b.g(parcel, 4, this.f105877d);
        i6.b.b(parcel, iA);
    }
}
