package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "KeyHandleCreator")
@Deprecated
public class KeyHandle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<KeyHandle> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(getter = "getVersionCode", id = 1)
    private final int f107379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getBytes", id = 2)
    private final byte[] f107380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getProtocolVersionAsString", id = 3, type = "java.lang.String")
    private final ProtocolVersion f107381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTransports", id = 4)
    @p0
    private final List f107382d;

    @SafeParcelable.b
    KeyHandle(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) byte[] bArr, @SafeParcelable.e(id = 3) String str, @SafeParcelable.e(id = 4) @p0 List list) {
        this.f107379a = i10;
        this.f107380b = bArr;
        try {
            this.f107381c = ProtocolVersion.c(str);
            this.f107382d = list;
        } catch (ProtocolVersion.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public static KeyHandle f2(@NonNull JSONObject jSONObject) throws JSONException {
        List<Transport> listC = null;
        try {
            ProtocolVersion protocolVersionC = ProtocolVersion.c(jSONObject.has("version") ? jSONObject.getString("version") : null);
            try {
                byte[] bArrDecode = Base64.decode(jSONObject.getString(SignResponseData.f107432f), 8);
                if (jSONObject.has("transports")) {
                    listC = Transport.c(jSONObject.getJSONArray("transports"));
                }
                return new KeyHandle(bArrDecode, protocolVersionC, listC);
            } catch (IllegalArgumentException e10) {
                throw new JSONException(e10.toString());
            }
        } catch (ProtocolVersion.a e11) {
            throw new JSONException(e11.toString());
        }
    }

    @NonNull
    public byte[] O1() {
        return this.f107380b;
    }

    @NonNull
    public ProtocolVersion T1() {
        return this.f107381c;
    }

    @NonNull
    public List<Transport> b2() {
        return this.f107382d;
    }

    public int e2() {
        return this.f107379a;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.f107380b, keyHandle.f107380b) || !this.f107381c.equals(keyHandle.f107381c)) {
            return false;
        }
        List list2 = this.f107382d;
        if (list2 == null && keyHandle.f107382d == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.f107382d) != null && list2.containsAll(list) && keyHandle.f107382d.containsAll(this.f107382d);
    }

    public int hashCode() {
        return u.c(Integer.valueOf(Arrays.hashCode(this.f107380b)), this.f107381c, this.f107382d);
    }

    @NonNull
    public JSONObject n2() {
        return p2();
    }

    @NonNull
    public final JSONObject p2() {
        JSONObject jSONObject = new JSONObject();
        try {
            byte[] bArr = this.f107380b;
            if (bArr != null) {
                jSONObject.put(SignResponseData.f107432f, Base64.encodeToString(bArr, 11));
            }
            ProtocolVersion protocolVersion = this.f107381c;
            if (protocolVersion != null) {
                jSONObject.put("version", protocolVersion.toString());
            }
            if (this.f107382d != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f107382d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Transport) it.next()).toString());
                }
                jSONObject.put("transports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public String toString() {
        List list = this.f107382d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", com.google.android.gms.common.util.c.d(this.f107380b), this.f107381c, list == null ? AbstractJsonLexerKt.NULL : list.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, e2());
        i6.b.m(parcel, 2, O1(), false);
        i6.b.Y(parcel, 3, this.f107381c.toString(), false);
        i6.b.d0(parcel, 4, b2(), false);
        i6.b.b(parcel, iA);
    }

    public KeyHandle(@NonNull byte[] bArr, @NonNull ProtocolVersion protocolVersion, @p0 List<Transport> list) {
        this.f107379a = 1;
        this.f107380b = bArr;
        this.f107381c = protocolVersion;
        this.f107382d = list;
    }
}
