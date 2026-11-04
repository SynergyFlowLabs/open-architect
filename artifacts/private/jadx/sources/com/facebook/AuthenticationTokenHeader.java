package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.l1;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class AuthenticationTokenHeader implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f98445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f98446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f98443d = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new a();

    public static final class a implements Parcelable.Creator<AuthenticationTokenHeader> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationTokenHeader(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader[] newArray(int i10) {
            return new AuthenticationTokenHeader[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public AuthenticationTokenHeader(@NotNull String encodedHeaderString) throws JSONException {
        Intrinsics.checkNotNullParameter(encodedHeaderString, "encodedHeaderString");
        if (!e(encodedHeaderString)) {
            throw new IllegalArgumentException("Invalid Header");
        }
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
        String string = jSONObject.getString("alg");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(\"alg\")");
        this.f98444a = string;
        String string2 = jSONObject.getString(com.google.android.gms.fido.u2f.api.common.a.f107438e);
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"typ\")");
        this.f98445b = string2;
        String string3 = jSONObject.getString("kid");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(\"kid\")");
        this.f98446c = string3;
    }

    private final boolean e(String str) {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.p(str, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
            String alg = jSONObject.optString("alg");
            Intrinsics.checkNotNullExpressionValue(alg, "alg");
            boolean z10 = alg.length() > 0 && Intrinsics.areEqual(alg, "RS256");
            String strOptString = jSONObject.optString("kid");
            Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObj.optString(\"kid\")");
            boolean z11 = strOptString.length() > 0;
            String strOptString2 = jSONObject.optString(com.google.android.gms.fido.u2f.api.common.a.f107438e);
            Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObj.optString(\"typ\")");
            boolean z12 = strOptString2.length() > 0;
            if (z10 && z11 && z12) {
                return true;
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    @NotNull
    public final String a() {
        return this.f98444a;
    }

    @NotNull
    public final String b() {
        return this.f98446c;
    }

    @NotNull
    public final String c() {
        return this.f98445b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return Intrinsics.areEqual(this.f98444a, authenticationTokenHeader.f98444a) && Intrinsics.areEqual(this.f98445b, authenticationTokenHeader.f98445b) && Intrinsics.areEqual(this.f98446c, authenticationTokenHeader.f98446c);
    }

    @l1(otherwise = 2)
    @NotNull
    public final String f() {
        String string = toString();
        Charset charset = Charsets.UTF_8;
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.DEFAULT)");
        return strEncodeToString;
    }

    @NotNull
    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f98444a);
        jSONObject.put(com.google.android.gms.fido.u2f.api.common.a.f107438e, this.f98445b);
        jSONObject.put("kid", this.f98446c);
        return jSONObject;
    }

    public int hashCode() {
        return ((((527 + this.f98444a.hashCode()) * 31) + this.f98445b.hashCode()) * 31) + this.f98446c.hashCode();
    }

    @NotNull
    public String toString() {
        String string = g().toString();
        Intrinsics.checkNotNullExpressionValue(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98444a);
        dest.writeString(this.f98445b);
        dest.writeString(this.f98446c);
    }

    public AuthenticationTokenHeader(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        this.f98444a = com.facebook.internal.f1.t(string, "alg");
        this.f98445b = com.facebook.internal.f1.t(parcel.readString(), com.google.android.gms.fido.u2f.api.common.a.f107438e);
        this.f98446c = com.facebook.internal.f1.t(parcel.readString(), "kid");
    }

    public AuthenticationTokenHeader(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("alg");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"alg\")");
        this.f98444a = string;
        String string2 = jsonObject.getString(com.google.android.gms.fido.u2f.api.common.a.f107438e);
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"typ\")");
        this.f98445b = string2;
        String string3 = jsonObject.getString("kid");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(\"kid\")");
        this.f98446c = string3;
    }

    @l1(otherwise = 2)
    public AuthenticationTokenHeader(@NotNull String alg, @NotNull String typ, @NotNull String kid) {
        Intrinsics.checkNotNullParameter(alg, "alg");
        Intrinsics.checkNotNullParameter(typ, "typ");
        Intrinsics.checkNotNullParameter(kid, "kid");
        this.f98444a = alg;
        this.f98445b = typ;
        this.f98446c = kid;
    }
}
