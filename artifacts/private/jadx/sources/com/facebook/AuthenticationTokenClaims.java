package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.l1;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class AuthenticationTokenClaims implements Parcelable {

    @NotNull
    public static final String H1 = "aud";
    public static final long Z = 600000;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    public static final String f98405g3 = "exp";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    public static final String f98406h3 = "iat";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    public static final String f98407i3 = "sub";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    public static final String f98408j3 = "name";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    public static final String f98409k3 = "given_name";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    public static final String f98410l3 = "middle_name";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    public static final String f98411m3 = "family_name";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    public static final String f98412n3 = "email";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    public static final String f98413o3 = "picture";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final String f98414p0 = "jti";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    public static final String f98415p1 = "iss";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    public static final String f98416p2 = "nonce";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    public static final String f98417p3 = "user_friends";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    public static final String f98418q3 = "user_birthday";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    public static final String f98419r3 = "user_age_range";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NotNull
    public static final String f98420s3 = "user_hometown";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NotNull
    public static final String f98421t3 = "user_gender";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @NotNull
    public static final String f98422u3 = "user_link";

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @NotNull
    public static final String f98423v3 = "user_location";

    @Nullable
    private final String X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f98425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f98426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f98427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f98428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f98429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f98430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f98431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f98432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final String f98433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final String f98434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final String f98435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final String f98436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final Set<String> f98437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final String f98438o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final Map<String, Integer> f98439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f98440t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f98441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private final String f98442w;

    @NotNull
    public static final b Y = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new a();

    /* JADX INFO: loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<AuthenticationTokenClaims> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationTokenClaims(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims[] newArray(int i10) {
            return new AuthenticationTokenClaims[i10];
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final AuthenticationTokenClaims a(@NotNull JSONObject jsonObject) throws JSONException {
            List<String> listD0;
            Map<String, Object> mapN;
            Map<String, String> mapO;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String jti = jsonObject.getString(AuthenticationTokenClaims.f98414p0);
            String iss = jsonObject.getString(AuthenticationTokenClaims.f98415p1);
            String aud = jsonObject.getString(AuthenticationTokenClaims.H1);
            String nonce = jsonObject.getString("nonce");
            long j10 = jsonObject.getLong(AuthenticationTokenClaims.f98405g3);
            long j11 = jsonObject.getLong(AuthenticationTokenClaims.f98406h3);
            String sub = jsonObject.getString(AuthenticationTokenClaims.f98407i3);
            String strB = b(jsonObject, "name");
            String strB2 = b(jsonObject, AuthenticationTokenClaims.f98409k3);
            String strB3 = b(jsonObject, AuthenticationTokenClaims.f98410l3);
            String strB4 = b(jsonObject, AuthenticationTokenClaims.f98411m3);
            String strB5 = b(jsonObject, "email");
            String strB6 = b(jsonObject, "picture");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(AuthenticationTokenClaims.f98417p3);
            String strB7 = b(jsonObject, AuthenticationTokenClaims.f98418q3);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(AuthenticationTokenClaims.f98419r3);
            JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject(AuthenticationTokenClaims.f98420s3);
            JSONObject jSONObjectOptJSONObject3 = jsonObject.optJSONObject(AuthenticationTokenClaims.f98423v3);
            String strB8 = b(jsonObject, AuthenticationTokenClaims.f98421t3);
            String strB9 = b(jsonObject, AuthenticationTokenClaims.f98422u3);
            Intrinsics.checkNotNullExpressionValue(jti, "jti");
            Intrinsics.checkNotNullExpressionValue(iss, "iss");
            Intrinsics.checkNotNullExpressionValue(aud, "aud");
            Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
            Intrinsics.checkNotNullExpressionValue(sub, "sub");
            Map<String, String> mapO2 = null;
            if (jSONArrayOptJSONArray == null) {
                listD0 = null;
            } else {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                listD0 = com.facebook.internal.e1.d0(jSONArrayOptJSONArray);
            }
            List<String> list = listD0;
            if (jSONObjectOptJSONObject == null) {
                mapN = null;
            } else {
                com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
                mapN = com.facebook.internal.e1.n(jSONObjectOptJSONObject);
            }
            if (jSONObjectOptJSONObject2 == null) {
                mapO = null;
            } else {
                com.facebook.internal.e1 e1Var3 = com.facebook.internal.e1.f99794a;
                mapO = com.facebook.internal.e1.o(jSONObjectOptJSONObject2);
            }
            if (jSONObjectOptJSONObject3 != null) {
                com.facebook.internal.e1 e1Var4 = com.facebook.internal.e1.f99794a;
                mapO2 = com.facebook.internal.e1.o(jSONObjectOptJSONObject3);
            }
            return new AuthenticationTokenClaims(jti, iss, aud, nonce, j10, j11, sub, strB, strB2, strB3, strB4, strB5, strB6, list, strB7, mapN, mapO, mapO2, strB8, strB9);
        }

        @Nullable
        public final String b(@NotNull JSONObject jSONObject, @NotNull String name) {
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub) {
        this(jti, iss, aud, nonce, j10, j11, sub, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048448, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    @oj.n
    @NotNull
    public static final AuthenticationTokenClaims a(@NotNull JSONObject jSONObject) throws JSONException {
        return Y.a(jSONObject);
    }

    private final boolean w(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String jti = jSONObject.optString(f98414p0);
        Intrinsics.checkNotNullExpressionValue(jti, "jti");
        if (jti.length() == 0) {
            return false;
        }
        try {
            String iss = jSONObject.optString(f98415p1);
            Intrinsics.checkNotNullExpressionValue(iss, "iss");
            if (iss.length() != 0 && (Intrinsics.areEqual(new URL(iss).getHost(), g0.Q) || Intrinsics.areEqual(new URL(iss).getHost(), "www.facebook.com"))) {
                String aud = jSONObject.optString(H1);
                Intrinsics.checkNotNullExpressionValue(aud, "aud");
                if (aud.length() != 0) {
                    g0 g0Var = g0.f99617a;
                    if (Intrinsics.areEqual(aud, g0.o())) {
                        long j10 = 1000;
                        if (new Date().after(new Date(jSONObject.optLong(f98405g3) * j10))) {
                            return false;
                        }
                        if (new Date().after(new Date((jSONObject.optLong(f98406h3) * j10) + Z))) {
                            return false;
                        }
                        String sub = jSONObject.optString(f98407i3);
                        Intrinsics.checkNotNullExpressionValue(sub, "sub");
                        if (sub.length() == 0) {
                            return false;
                        }
                        String nonce = jSONObject.optString("nonce");
                        Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
                        return nonce.length() != 0 && Intrinsics.areEqual(nonce, str);
                    }
                }
                return false;
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @NotNull
    public final String b() {
        return this.f98426c;
    }

    @Nullable
    public final String c() {
        return this.f98435l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f98428e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return Intrinsics.areEqual(this.f98424a, authenticationTokenClaims.f98424a) && Intrinsics.areEqual(this.f98425b, authenticationTokenClaims.f98425b) && Intrinsics.areEqual(this.f98426c, authenticationTokenClaims.f98426c) && Intrinsics.areEqual(this.f98427d, authenticationTokenClaims.f98427d) && this.f98428e == authenticationTokenClaims.f98428e && this.f98429f == authenticationTokenClaims.f98429f && Intrinsics.areEqual(this.f98430g, authenticationTokenClaims.f98430g) && Intrinsics.areEqual(this.f98431h, authenticationTokenClaims.f98431h) && Intrinsics.areEqual(this.f98432i, authenticationTokenClaims.f98432i) && Intrinsics.areEqual(this.f98433j, authenticationTokenClaims.f98433j) && Intrinsics.areEqual(this.f98434k, authenticationTokenClaims.f98434k) && Intrinsics.areEqual(this.f98435l, authenticationTokenClaims.f98435l) && Intrinsics.areEqual(this.f98436m, authenticationTokenClaims.f98436m) && Intrinsics.areEqual(this.f98437n, authenticationTokenClaims.f98437n) && Intrinsics.areEqual(this.f98438o, authenticationTokenClaims.f98438o) && Intrinsics.areEqual(this.f98439s, authenticationTokenClaims.f98439s) && Intrinsics.areEqual(this.f98440t, authenticationTokenClaims.f98440t) && Intrinsics.areEqual(this.f98441v, authenticationTokenClaims.f98441v) && Intrinsics.areEqual(this.f98442w, authenticationTokenClaims.f98442w) && Intrinsics.areEqual(this.X, authenticationTokenClaims.X);
    }

    @Nullable
    public final String f() {
        return this.f98434k;
    }

    @Nullable
    public final String g() {
        return this.f98432i;
    }

    public final long h() {
        return this.f98429f;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((527 + this.f98424a.hashCode()) * 31) + this.f98425b.hashCode()) * 31) + this.f98426c.hashCode()) * 31) + this.f98427d.hashCode()) * 31) + Long.hashCode(this.f98428e)) * 31) + Long.hashCode(this.f98429f)) * 31) + this.f98430g.hashCode()) * 31;
        String str = this.f98431h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98432i;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f98433j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f98434k;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f98435l;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f98436m;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.f98437n;
        int iHashCode8 = (iHashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f98438o;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.f98439s;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f98440t;
        int iHashCode11 = (iHashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.f98441v;
        int iHashCode12 = (iHashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.f98442w;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.X;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public final String i() {
        return this.f98425b;
    }

    @NotNull
    public final String j() {
        return this.f98424a;
    }

    @Nullable
    public final String k() {
        return this.f98433j;
    }

    @Nullable
    public final String l() {
        return this.f98431h;
    }

    @NotNull
    public final String m() {
        return this.f98427d;
    }

    @Nullable
    public final String n() {
        return this.f98436m;
    }

    @NotNull
    public final String o() {
        return this.f98430g;
    }

    @Nullable
    public final Map<String, Integer> p() {
        return this.f98439s;
    }

    @Nullable
    public final String q() {
        return this.f98438o;
    }

    @Nullable
    public final Set<String> r() {
        return this.f98437n;
    }

    @Nullable
    public final String s() {
        return this.f98442w;
    }

    @Nullable
    public final Map<String, String> t() {
        return this.f98440t;
    }

    @NotNull
    public String toString() {
        String string = y().toString();
        Intrinsics.checkNotNullExpressionValue(string, "claimsJsonObject.toString()");
        return string;
    }

    @Nullable
    public final String u() {
        return this.X;
    }

    @Nullable
    public final Map<String, String> v() {
        return this.f98441v;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98424a);
        dest.writeString(this.f98425b);
        dest.writeString(this.f98426c);
        dest.writeString(this.f98427d);
        dest.writeLong(this.f98428e);
        dest.writeLong(this.f98429f);
        dest.writeString(this.f98430g);
        dest.writeString(this.f98431h);
        dest.writeString(this.f98432i);
        dest.writeString(this.f98433j);
        dest.writeString(this.f98434k);
        dest.writeString(this.f98435l);
        dest.writeString(this.f98436m);
        if (this.f98437n == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(this.f98437n));
        }
        dest.writeString(this.f98438o);
        dest.writeMap(this.f98439s);
        dest.writeMap(this.f98440t);
        dest.writeMap(this.f98441v);
        dest.writeString(this.f98442w);
        dest.writeString(this.X);
    }

    @l1(otherwise = 2)
    @NotNull
    public final String x() {
        String string = toString();
        Charset charset = Charsets.UTF_8;
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes, 8);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.URL_SAFE)");
        return strEncodeToString;
    }

    @l1(otherwise = 2)
    @NotNull
    public final JSONObject y() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f98414p0, this.f98424a);
        jSONObject.put(f98415p1, this.f98425b);
        jSONObject.put(H1, this.f98426c);
        jSONObject.put("nonce", this.f98427d);
        jSONObject.put(f98405g3, this.f98428e);
        jSONObject.put(f98406h3, this.f98429f);
        String str = this.f98430g;
        if (str != null) {
            jSONObject.put(f98407i3, str);
        }
        String str2 = this.f98431h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f98432i;
        if (str3 != null) {
            jSONObject.put(f98409k3, str3);
        }
        String str4 = this.f98433j;
        if (str4 != null) {
            jSONObject.put(f98410l3, str4);
        }
        String str5 = this.f98434k;
        if (str5 != null) {
            jSONObject.put(f98411m3, str5);
        }
        String str6 = this.f98435l;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f98436m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f98437n != null) {
            jSONObject.put(f98417p3, new JSONArray((Collection) this.f98437n));
        }
        String str8 = this.f98438o;
        if (str8 != null) {
            jSONObject.put(f98418q3, str8);
        }
        if (this.f98439s != null) {
            jSONObject.put(f98419r3, new JSONObject(this.f98439s));
        }
        if (this.f98440t != null) {
            jSONObject.put(f98420s3, new JSONObject(this.f98440t));
        }
        if (this.f98441v != null) {
            jSONObject.put(f98423v3, new JSONObject(this.f98441v));
        }
        String str9 = this.f98442w;
        if (str9 != null) {
            jSONObject.put(f98421t3, str9);
        }
        String str10 = this.X;
        if (str10 != null) {
            jSONObject.put(f98422u3, str10);
        }
        return jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, null, null, null, null, null, null, null, null, null, null, null, null, 1048320, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, null, null, null, null, null, null, null, null, null, null, null, 1048064, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, null, null, null, null, null, null, null, null, null, null, 1047552, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, str4, null, null, null, null, null, null, null, null, null, 1046528, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, str4, str5, null, null, null, null, null, null, null, null, 1044480, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, str4, str5, str6, null, null, null, null, null, null, null, 1040384, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, str4, str5, str6, collection, null, null, null, null, null, null, 1032192, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, str4, str5, str6, collection, str7, null, null, null, null, null, 1015808, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, str4, str5, str6, collection, str7, map, null, null, null, null, 983040, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, str4, str5, str6, collection, str7, map, map2, null, null, null, 917504, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, str4, str5, str6, collection, str7, map, map2, map3, null, null, 786432, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable String str8) {
        this(jti, iss, aud, nonce, j10, j11, sub, str, str2, str3, str4, str5, str6, collection, str7, map, map2, map3, str8, null, 524288, null);
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
    }

    @oj.j
    public AuthenticationTokenClaims(@NotNull String encodedClaims, @NotNull String expectedNonce) throws JSONException {
        Set<String> setUnmodifiableSet;
        Map<String, Integer> mapUnmodifiableMap;
        Map<String, String> mapUnmodifiableMap2;
        Intrinsics.checkNotNullParameter(encodedClaims, "encodedClaims");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.p(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
        if (w(jSONObject, expectedNonce)) {
            String string = jSONObject.getString(f98414p0);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(JSON_KEY_JIT)");
            this.f98424a = string;
            String string2 = jSONObject.getString(f98415p1);
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(JSON_KEY_ISS)");
            this.f98425b = string2;
            String string3 = jSONObject.getString(H1);
            Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(JSON_KEY_AUD)");
            this.f98426c = string3;
            String string4 = jSONObject.getString("nonce");
            Intrinsics.checkNotNullExpressionValue(string4, "jsonObj.getString(JSON_KEY_NONCE)");
            this.f98427d = string4;
            this.f98428e = jSONObject.getLong(f98405g3);
            this.f98429f = jSONObject.getLong(f98406h3);
            String string5 = jSONObject.getString(f98407i3);
            Intrinsics.checkNotNullExpressionValue(string5, "jsonObj.getString(JSON_KEY_SUB)");
            this.f98430g = string5;
            b bVar = Y;
            this.f98431h = bVar.b(jSONObject, "name");
            this.f98432i = bVar.b(jSONObject, f98409k3);
            this.f98433j = bVar.b(jSONObject, f98410l3);
            this.f98434k = bVar.b(jSONObject, f98411m3);
            this.f98435l = bVar.b(jSONObject, "email");
            this.f98436m = bVar.b(jSONObject, "picture");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(f98417p3);
            Map<String, String> mapUnmodifiableMap3 = null;
            if (jSONArrayOptJSONArray == null) {
                setUnmodifiableSet = null;
            } else {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                setUnmodifiableSet = Collections.unmodifiableSet(com.facebook.internal.e1.c0(jSONArrayOptJSONArray));
            }
            this.f98437n = setUnmodifiableSet;
            this.f98438o = bVar.b(jSONObject, f98418q3);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f98419r3);
            if (jSONObjectOptJSONObject == null) {
                mapUnmodifiableMap = null;
            } else {
                com.facebook.internal.e1 e1Var2 = com.facebook.internal.e1.f99794a;
                mapUnmodifiableMap = Collections.unmodifiableMap(com.facebook.internal.e1.n(jSONObjectOptJSONObject));
            }
            this.f98439s = mapUnmodifiableMap;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(f98420s3);
            if (jSONObjectOptJSONObject2 == null) {
                mapUnmodifiableMap2 = null;
            } else {
                com.facebook.internal.e1 e1Var3 = com.facebook.internal.e1.f99794a;
                mapUnmodifiableMap2 = Collections.unmodifiableMap(com.facebook.internal.e1.o(jSONObjectOptJSONObject2));
            }
            this.f98440t = mapUnmodifiableMap2;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(f98423v3);
            if (jSONObjectOptJSONObject3 != null) {
                com.facebook.internal.e1 e1Var4 = com.facebook.internal.e1.f99794a;
                mapUnmodifiableMap3 = Collections.unmodifiableMap(com.facebook.internal.e1.o(jSONObjectOptJSONObject3));
            }
            this.f98441v = mapUnmodifiableMap3;
            this.f98442w = bVar.b(jSONObject, f98421t3);
            this.X = bVar.b(jSONObject, f98422u3);
            return;
        }
        throw new IllegalArgumentException("Invalid claims");
    }

    public /* synthetic */ AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j10, long j11, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection collection, String str12, Map map, Map map2, Map map3, String str13, String str14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j10, j11, str5, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? null : str7, (i10 & 512) != 0 ? null : str8, (i10 & 1024) != 0 ? null : str9, (i10 & 2048) != 0 ? null : str10, (i10 & 4096) != 0 ? null : str11, (i10 & 8192) != 0 ? null : collection, (i10 & 16384) != 0 ? null : str12, (32768 & i10) != 0 ? null : map, (65536 & i10) != 0 ? null : map2, (131072 & i10) != 0 ? null : map3, (262144 & i10) != 0 ? null : str13, (i10 & 524288) != 0 ? null : str14);
    }

    @oj.j
    @l1(otherwise = 2)
    public AuthenticationTokenClaims(@NotNull String jti, @NotNull String iss, @NotNull String aud, @NotNull String nonce, long j10, long j11, @NotNull String sub, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Collection<String> collection, @Nullable String str7, @Nullable Map<String, Integer> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable String str8, @Nullable String str9) {
        Intrinsics.checkNotNullParameter(jti, "jti");
        Intrinsics.checkNotNullParameter(iss, "iss");
        Intrinsics.checkNotNullParameter(aud, "aud");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(sub, "sub");
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.p(jti, f98414p0);
        com.facebook.internal.f1.p(iss, f98415p1);
        com.facebook.internal.f1.p(aud, H1);
        com.facebook.internal.f1.p(nonce, "nonce");
        com.facebook.internal.f1.p(sub, f98407i3);
        this.f98424a = jti;
        this.f98425b = iss;
        this.f98426c = aud;
        this.f98427d = nonce;
        this.f98428e = j10;
        this.f98429f = j11;
        this.f98430g = sub;
        this.f98431h = str;
        this.f98432i = str2;
        this.f98433j = str3;
        this.f98434k = str4;
        this.f98435l = str5;
        this.f98436m = str6;
        this.f98437n = collection != null ? Collections.unmodifiableSet(new HashSet(collection)) : null;
        this.f98438o = str7;
        this.f98439s = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
        this.f98440t = map2 != null ? Collections.unmodifiableMap(new HashMap(map2)) : null;
        this.f98441v = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
        this.f98442w = str8;
        this.X = str9;
    }

    public AuthenticationTokenClaims(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        this.f98424a = com.facebook.internal.f1.t(string, f98414p0);
        this.f98425b = com.facebook.internal.f1.t(parcel.readString(), f98415p1);
        this.f98426c = com.facebook.internal.f1.t(parcel.readString(), H1);
        this.f98427d = com.facebook.internal.f1.t(parcel.readString(), "nonce");
        this.f98428e = parcel.readLong();
        this.f98429f = parcel.readLong();
        this.f98430g = com.facebook.internal.f1.t(parcel.readString(), f98407i3);
        this.f98431h = parcel.readString();
        this.f98432i = parcel.readString();
        this.f98433j = parcel.readString();
        this.f98434k = parcel.readString();
        this.f98435l = parcel.readString();
        this.f98436m = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f98437n = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.f98438o = parcel.readString();
        HashMap hashMap = parcel.readHashMap(kotlin.jvm.internal.i0.f312739a.getClass().getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.f98439s = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        q1 q1Var = q1.f312784a;
        HashMap hashMap2 = parcel.readHashMap(q1Var.getClass().getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.f98440t = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(q1Var.getClass().getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.f98441v = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.f98442w = parcel.readString();
        this.X = parcel.readString();
    }
}
