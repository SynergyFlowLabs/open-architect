package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "ErrorResponseDataCreator")
@SafeParcelable.g({1})
@Deprecated
public class ErrorResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public static final String f107375c = "errorCode";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public static final String f107376d = "errorMessage";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorCodeAsInt", id = 2, type = "int")
    private final ErrorCode f107377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorMessage", id = 3)
    private final String f107378b;

    @SafeParcelable.b
    ErrorResponseData(@SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) String str) {
        this.f107377a = ErrorCode.l(i10);
        this.f107378b = str;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    @NonNull
    public final JSONObject O1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.f107377a.k());
            String str = this.f107378b;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public ErrorCode T1() {
        return this.f107377a;
    }

    public int b2() {
        return this.f107377a.k();
    }

    @NonNull
    public String e2() {
        return this.f107378b;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return u.b(this.f107377a, errorResponseData.f107377a) && u.b(this.f107378b, errorResponseData.f107378b);
    }

    public int hashCode() {
        return u.c(this.f107377a, this.f107378b);
    }

    @NonNull
    public String toString() {
        com.google.android.gms.internal.fido.k kVarA = com.google.android.gms.internal.fido.l.a(this);
        kVarA.a("errorCode", this.f107377a.k());
        String str = this.f107378b;
        if (str != null) {
            kVarA.b("errorMessage", str);
        }
        return kVarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 2, b2());
        i6.b.Y(parcel, 3, e2(), false);
        i6.b.b(parcel, iA);
    }

    public ErrorResponseData(@NonNull ErrorCode errorCode) {
        this.f107377a = (ErrorCode) w.r(errorCode);
        this.f107378b = null;
    }

    public ErrorResponseData(@NonNull ErrorCode errorCode, @NonNull String str) {
        this.f107377a = (ErrorCode) w.r(errorCode);
        this.f107378b = str;
    }
}
