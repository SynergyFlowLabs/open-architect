package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ApiMetadataCreator")
@g6.a
public final class ApiMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = j0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ApiMetadata f105870b = b2().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getComplianceOptions", id = 1)
    @p0
    private final ComplianceOptions f105871a;

    @g6.a
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private ComplianceOptions f105872a;

        @NonNull
        @g6.a
        public ApiMetadata a() {
            return new ApiMetadata(this.f105872a);
        }

        @NonNull
        @g6.a
        public a b(@p0 ComplianceOptions complianceOptions) {
            this.f105872a = complianceOptions;
            return this;
        }
    }

    @SafeParcelable.b
    ApiMetadata(@SafeParcelable.e(id = 1) @p0 ComplianceOptions complianceOptions) {
        this.f105871a = complianceOptions;
    }

    @NonNull
    @g6.a
    public static final ApiMetadata O1(@NonNull ComplianceOptions complianceOptions) {
        a aVarB2 = b2();
        aVarB2.b(complianceOptions);
        return aVarB2.a();
    }

    @NonNull
    @g6.a
    public static final ApiMetadata T1() {
        return f105870b;
    }

    @NonNull
    @g6.a
    public static a b2() {
        return new a();
    }

    public final boolean equals(@p0 Object obj) {
        if (obj instanceof ApiMetadata) {
            return Objects.equals(this.f105871a, ((ApiMetadata) obj).f105871a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f105871a);
    }

    @NonNull
    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.f105871a) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(-204102970);
        ComplianceOptions complianceOptions = this.f105871a;
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 1, complianceOptions, i10, false);
        i6.b.b(parcel, iA);
    }
}
