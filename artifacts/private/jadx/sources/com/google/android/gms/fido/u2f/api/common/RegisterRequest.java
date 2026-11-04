package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "RegisterRequestCreator")
@Deprecated
public class RegisterRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f107388e = 65;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(getter = "getVersionCode", id = 1)
    private final int f107389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getProtocolVersionAsString", id = 2, type = "java.lang.String")
    private final ProtocolVersion f107390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getChallengeValue", id = 3)
    private final byte[] f107391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAppId", id = 4)
    private final String f107392d;

    @SafeParcelable.b
    RegisterRequest(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) byte[] bArr, @SafeParcelable.e(id = 4) String str2) {
        this.f107389a = i10;
        try {
            this.f107390b = ProtocolVersion.c(str);
            this.f107391c = bArr;
            this.f107392d = str2;
        } catch (ProtocolVersion.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public static RegisterRequest f2(@NonNull JSONObject jSONObject) throws JSONException {
        try {
            try {
                try {
                    return new RegisterRequest(ProtocolVersion.c(jSONObject.has("version") ? jSONObject.getString("version") : null), Base64.decode(jSONObject.getString(a.f107439f), 8), jSONObject.has("appId") ? jSONObject.getString("appId") : null);
                } catch (IllegalArgumentException e10) {
                    throw new JSONException(e10.getMessage());
                }
            } catch (IllegalArgumentException e11) {
                throw new JSONException(e11.toString());
            }
        } catch (ProtocolVersion.a e12) {
            throw new JSONException(e12.toString());
        }
    }

    @NonNull
    public String O1() {
        return this.f107392d;
    }

    @NonNull
    public byte[] T1() {
        return this.f107391c;
    }

    @NonNull
    public ProtocolVersion b2() {
        return this.f107390b;
    }

    public int e2() {
        return this.f107389a;
    }

    public boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.f107391c, registerRequest.f107391c) || this.f107390b != registerRequest.f107390b) {
            return false;
        }
        String str = this.f107392d;
        if (str == null) {
            if (registerRequest.f107392d != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.f107392d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.f107391c) + 31) * 31) + this.f107390b.hashCode();
        String str = this.f107392d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @NonNull
    public JSONObject n2() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.f107390b.toString());
            jSONObject.put(a.f107439f, Base64.encodeToString(this.f107391c, 11));
            String str = this.f107392d;
            if (str != null) {
                jSONObject.put("appId", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, e2());
        i6.b.Y(parcel, 2, this.f107390b.toString(), false);
        i6.b.m(parcel, 3, T1(), false);
        i6.b.Y(parcel, 4, O1(), false);
        i6.b.b(parcel, iA);
    }

    public RegisterRequest(@NonNull ProtocolVersion protocolVersion, @NonNull byte[] bArr, @NonNull String str) {
        boolean z10 = true;
        this.f107389a = 1;
        this.f107390b = (ProtocolVersion) w.r(protocolVersion);
        this.f107391c = (byte[]) w.r(bArr);
        if (protocolVersion == ProtocolVersion.V1) {
            if (bArr.length != 65) {
                z10 = false;
            }
            w.b(z10, "invalid challengeValue length for V1");
        }
        this.f107392d = str;
    }
}
