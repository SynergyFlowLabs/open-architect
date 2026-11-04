package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.fido.h0;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "RegisterResponseDataCreator")
@SafeParcelable.g({1})
@Deprecated
public class RegisterResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRegisterData", id = 2)
    private final byte[] f107409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getProtocolVersionAsString", id = 3, type = "java.lang.String")
    private final ProtocolVersion f107410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getClientDataString", id = 4)
    @p0
    private final String f107411c;

    public RegisterResponseData(@NonNull byte[] bArr) {
        this.f107409a = (byte[]) w.r(bArr);
        this.f107410b = ProtocolVersion.V1;
        this.f107411c = null;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    @NonNull
    public JSONObject O1() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("registrationData", Base64.encodeToString(this.f107409a, 11));
            jSONObject.put("version", this.f107410b.toString());
            String str = this.f107411c;
            if (str != null) {
                jSONObject.put(SignResponseData.f107431e, Base64.encodeToString(str.getBytes(), 11));
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public String T1() {
        return this.f107411c;
    }

    @NonNull
    public ProtocolVersion b2() {
        return this.f107410b;
    }

    @NonNull
    public byte[] e2() {
        return this.f107409a;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return u.b(this.f107410b, registerResponseData.f107410b) && Arrays.equals(this.f107409a, registerResponseData.f107409a) && u.b(this.f107411c, registerResponseData.f107411c);
    }

    public int f2() {
        ProtocolVersion protocolVersion = ProtocolVersion.UNKNOWN;
        int iOrdinal = this.f107410b.ordinal();
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            int i11 = 4 >> 2;
            if (iOrdinal != 2) {
                return -1;
            }
        }
        return i10;
    }

    public int hashCode() {
        return u.c(this.f107410b, Integer.valueOf(Arrays.hashCode(this.f107409a)), this.f107411c);
    }

    @NonNull
    public String toString() {
        com.google.android.gms.internal.fido.k kVarA = com.google.android.gms.internal.fido.l.a(this);
        kVarA.b("protocolVersion", this.f107410b);
        h0 h0VarC = h0.c();
        byte[] bArr = this.f107409a;
        kVarA.b("registerData", h0VarC.d(bArr, 0, bArr.length));
        String str = this.f107411c;
        if (str != null) {
            kVarA.b("clientDataString", str);
        }
        return kVarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.m(parcel, 2, e2(), false);
        i6.b.Y(parcel, 3, this.f107410b.toString(), false);
        i6.b.Y(parcel, 4, T1(), false);
        i6.b.b(parcel, iA);
    }

    public RegisterResponseData(@NonNull byte[] bArr, @NonNull ProtocolVersion protocolVersion, @p0 String str) {
        this.f107409a = (byte[]) w.r(bArr);
        this.f107410b = (ProtocolVersion) w.r(protocolVersion);
        w.a(protocolVersion != ProtocolVersion.UNKNOWN);
        if (protocolVersion != ProtocolVersion.V1) {
            this.f107411c = (String) w.r(str);
        } else {
            w.a(str == null);
            this.f107411c = null;
        }
    }

    @SafeParcelable.b
    RegisterResponseData(@SafeParcelable.e(id = 2) byte[] bArr, @SafeParcelable.e(id = 3) String str, @SafeParcelable.e(id = 4) @p0 String str2) {
        this.f107409a = bArr;
        try {
            this.f107410b = ProtocolVersion.c(str);
            this.f107411c = str2;
        } catch (ProtocolVersion.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
