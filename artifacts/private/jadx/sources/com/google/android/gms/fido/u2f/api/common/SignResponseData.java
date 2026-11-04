package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.fido.h0;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SignResponseDataCreator")
@SafeParcelable.g({1})
@Deprecated
public class SignResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<SignResponseData> CREATOR = new n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public static final String f107431e = "clientData";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public static final String f107432f = "keyHandle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    @VisibleForTesting
    public static final String f107433g = "signatureData";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getKeyHandle", id = 2)
    private final byte[] f107434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getClientDataString", id = 3)
    private final String f107435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSignatureData", id = 4)
    private final byte[] f107436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getApplication", id = 5)
    private final byte[] f107437d;

    @Deprecated
    public SignResponseData(@NonNull byte[] bArr, @NonNull String str, @NonNull byte[] bArr2) {
        this(bArr, str, bArr2, new byte[0]);
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    @NonNull
    public JSONObject O1() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f107432f, Base64.encodeToString(this.f107434a, 11));
            jSONObject.put(f107431e, Base64.encodeToString(this.f107435b.getBytes(), 11));
            jSONObject.put(f107433g, Base64.encodeToString(this.f107436c, 11));
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public String T1() {
        return this.f107435b;
    }

    @NonNull
    public byte[] b2() {
        return this.f107434a;
    }

    @NonNull
    public byte[] e2() {
        return this.f107436c;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.f107434a, signResponseData.f107434a) && u.b(this.f107435b, signResponseData.f107435b) && Arrays.equals(this.f107436c, signResponseData.f107436c) && Arrays.equals(this.f107437d, signResponseData.f107437d);
    }

    public int hashCode() {
        return u.c(Integer.valueOf(Arrays.hashCode(this.f107434a)), this.f107435b, Integer.valueOf(Arrays.hashCode(this.f107436c)), Integer.valueOf(Arrays.hashCode(this.f107437d)));
    }

    @NonNull
    public String toString() {
        com.google.android.gms.internal.fido.k kVarA = com.google.android.gms.internal.fido.l.a(this);
        h0 h0VarC = h0.c();
        byte[] bArr = this.f107434a;
        kVarA.b(f107432f, h0VarC.d(bArr, 0, bArr.length));
        kVarA.b("clientDataString", this.f107435b);
        h0 h0VarC2 = h0.c();
        byte[] bArr2 = this.f107436c;
        kVarA.b(f107433g, h0VarC2.d(bArr2, 0, bArr2.length));
        h0 h0VarC3 = h0.c();
        byte[] bArr3 = this.f107437d;
        kVarA.b("application", h0VarC3.d(bArr3, 0, bArr3.length));
        return kVarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.m(parcel, 2, b2(), false);
        i6.b.Y(parcel, 3, T1(), false);
        i6.b.m(parcel, 4, e2(), false);
        i6.b.m(parcel, 5, this.f107437d, false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    public SignResponseData(@NonNull @SafeParcelable.e(id = 2) byte[] bArr, @NonNull @SafeParcelable.e(id = 3) String str, @NonNull @SafeParcelable.e(id = 4) byte[] bArr2, @NonNull @SafeParcelable.e(id = 5) byte[] bArr3) {
        this.f107434a = (byte[]) w.r(bArr);
        this.f107435b = (String) w.r(str);
        this.f107436c = (byte[]) w.r(bArr2);
        this.f107437d = (byte[]) w.r(bArr3);
    }
}
