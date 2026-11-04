package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "RegisteredKeyCreator")
@SafeParcelable.g({1})
@Deprecated
public class RegisteredKey extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getKeyHandle", id = 2)
    private final KeyHandle f107412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAppId", id = 4)
    private final String f107413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getChallengeValue", id = 3)
    String f107414c;

    public RegisteredKey(@NonNull KeyHandle keyHandle) {
        this(keyHandle, null, null);
    }

    @NonNull
    public static RegisteredKey e2(@NonNull JSONObject jSONObject) throws JSONException {
        return new RegisteredKey(KeyHandle.f2(jSONObject), jSONObject.has(a.f107439f) ? jSONObject.getString(a.f107439f) : null, jSONObject.has("appId") ? jSONObject.getString("appId") : null);
    }

    @NonNull
    public String O1() {
        return this.f107413b;
    }

    @NonNull
    public String T1() {
        return this.f107414c;
    }

    @NonNull
    public KeyHandle b2() {
        return this.f107412a;
    }

    public boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.f107414c;
        if (str == null) {
            if (registeredKey.f107414c != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.f107414c)) {
            return false;
        }
        if (!this.f107412a.equals(registeredKey.f107412a)) {
            return false;
        }
        String str2 = this.f107413b;
        if (str2 == null) {
            if (registeredKey.f107413b != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.f107413b)) {
            return false;
        }
        return true;
    }

    @NonNull
    public JSONObject f2() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f107414c;
            if (str != null) {
                jSONObject.put(a.f107439f, str);
            }
            JSONObject jSONObjectP2 = this.f107412a.p2();
            Iterator<String> itKeys = jSONObjectP2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectP2.get(next));
            }
            String str2 = this.f107413b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public int hashCode() {
        String str = this.f107414c;
        int iHashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f107412a.hashCode();
        String str2 = this.f107413b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SignResponseData.f107432f, Base64.encodeToString(this.f107412a.O1(), 11));
            if (this.f107412a.T1() != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", this.f107412a.T1().toString());
            }
            if (this.f107412a.b2() != null) {
                jSONObject.put("transports", this.f107412a.b2().toString());
            }
            String str = this.f107414c;
            if (str != null) {
                jSONObject.put(a.f107439f, str);
            }
            String str2 = this.f107413b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.S(parcel, 2, b2(), i10, false);
        i6.b.Y(parcel, 3, T1(), false);
        i6.b.Y(parcel, 4, O1(), false);
        i6.b.b(parcel, iA);
    }

    @SafeParcelable.b
    public RegisteredKey(@NonNull @SafeParcelable.e(id = 2) KeyHandle keyHandle, @NonNull @SafeParcelable.e(id = 3) String str, @NonNull @SafeParcelable.e(id = 4) String str2) {
        this.f107412a = (KeyHandle) w.r(keyHandle);
        this.f107414c = str;
        this.f107413b = str2;
    }
}
