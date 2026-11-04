package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationToken implements Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f98394g = "id_token";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f98395h = "token_string";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f98396i = "expected_nonce";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f98397j = "header";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f98398k = "claims";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f98399l = "signature";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f98401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AuthenticationTokenHeader f98402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AuthenticationTokenClaims f98403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f98404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f98393f = new b(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new a();

    public static final class a implements Parcelable.Creator<AuthenticationToken> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationToken(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken[] newArray(int i10) {
            return new AuthenticationToken[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @Nullable
        public final AuthenticationToken a() {
            return AuthenticationTokenManager.f98447d.a().d();
        }

        @oj.n
        public final void b(@Nullable AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.f98447d.a().h(authenticationToken);
        }

        private b() {
        }
    }

    @oj.j
    public AuthenticationToken(@NotNull String token, @NotNull String expectedNonce) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.p(token, net.openid.appauth.x.f333313b);
        com.facebook.internal.f1.p(expectedNonce, "expectedNonce");
        List listSplit$default = StringsKt.split$default(token, new String[]{"."}, false, 0, 6, null);
        if (!(listSplit$default.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str = (String) listSplit$default.get(0);
        String str2 = (String) listSplit$default.get(1);
        String str3 = (String) listSplit$default.get(2);
        this.f98400a = token;
        this.f98401b = expectedNonce;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str);
        this.f98402c = authenticationTokenHeader;
        this.f98403d = new AuthenticationTokenClaims(str2, expectedNonce);
        if (!h(str, str2, str3, authenticationTokenHeader.b())) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.f98404e = str3;
    }

    @oj.n
    @Nullable
    public static final AuthenticationToken b() {
        return f98393f.a();
    }

    private final boolean h(String str, String str2, String str3, String str4) {
        try {
            u5.c cVar = u5.c.f381188a;
            String strD = u5.c.d(str4);
            if (strD == null) {
                return false;
            }
            return u5.c.f(u5.c.c(strD), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    @oj.n
    public static final void i(@Nullable AuthenticationToken authenticationToken) {
        f98393f.b(authenticationToken);
    }

    @NotNull
    public final AuthenticationTokenClaims a() {
        return this.f98403d;
    }

    @NotNull
    public final String c() {
        return this.f98401b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final AuthenticationTokenHeader e() {
        return this.f98402c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return Intrinsics.areEqual(this.f98400a, authenticationToken.f98400a) && Intrinsics.areEqual(this.f98401b, authenticationToken.f98401b) && Intrinsics.areEqual(this.f98402c, authenticationToken.f98402c) && Intrinsics.areEqual(this.f98403d, authenticationToken.f98403d) && Intrinsics.areEqual(this.f98404e, authenticationToken.f98404e);
    }

    @NotNull
    public final String f() {
        return this.f98404e;
    }

    @NotNull
    public final String g() {
        return this.f98400a;
    }

    public int hashCode() {
        return ((((((((527 + this.f98400a.hashCode()) * 31) + this.f98401b.hashCode()) * 31) + this.f98402c.hashCode()) * 31) + this.f98403d.hashCode()) * 31) + this.f98404e.hashCode();
    }

    @NotNull
    public final JSONObject j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f98395h, this.f98400a);
        jSONObject.put(f98396i, this.f98401b);
        jSONObject.put(f98397j, this.f98402c.g());
        jSONObject.put(f98398k, this.f98403d.y());
        jSONObject.put(f98399l, this.f98404e);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98400a);
        dest.writeString(this.f98401b);
        dest.writeParcelable(this.f98402c, i10);
        dest.writeParcelable(this.f98403d, i10);
        dest.writeString(this.f98404e);
    }

    public AuthenticationToken(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        this.f98400a = com.facebook.internal.f1.t(string, net.openid.appauth.x.f333313b);
        this.f98401b = com.facebook.internal.f1.t(parcel.readString(), "expectedNonce");
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f98402c = (AuthenticationTokenHeader) parcelable;
        Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
        if (parcelable2 != null) {
            this.f98403d = (AuthenticationTokenClaims) parcelable2;
            this.f98404e = com.facebook.internal.f1.t(parcel.readString(), f98399l);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AuthenticationToken(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString(f98395h);
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(TOKEN_STRING_KEY)");
        this.f98400a = string;
        String string2 = jsonObject.getString(f98396i);
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(EXPECTED_NONCE_KEY)");
        this.f98401b = string2;
        String string3 = jsonObject.getString(f98399l);
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(SIGNATURE_KEY)");
        this.f98404e = string3;
        JSONObject headerJSONObject = jsonObject.getJSONObject(f98397j);
        JSONObject claimsJSONObject = jsonObject.getJSONObject(f98398k);
        Intrinsics.checkNotNullExpressionValue(headerJSONObject, "headerJSONObject");
        this.f98402c = new AuthenticationTokenHeader(headerJSONObject);
        AuthenticationTokenClaims.b bVar = AuthenticationTokenClaims.Y;
        Intrinsics.checkNotNullExpressionValue(claimsJSONObject, "claimsJSONObject");
        this.f98403d = bVar.a(claimsJSONObject);
    }
}
