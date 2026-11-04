package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AccessToken implements Parcelable {

    @oj.f
    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR;

    @NotNull
    private static final String H1 = "expires_at";

    @NotNull
    private static final Date X;

    @NotNull
    private static final Date Y;

    @NotNull
    private static final g Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private static final String f98361g3 = "declined_permissions";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private static final String f98362h3 = "expired_permissions";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private static final String f98363i3 = "token";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private static final String f98364j3 = "source";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private static final String f98365k3 = "last_refresh";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final d f98366l = new d(null);

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private static final String f98367l3 = "application_id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f98368m = "access_token";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f98369n = "expires_in";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f98370o = "user_id";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f98371p0 = 1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final String f98372p1 = "version";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private static final String f98373p2 = "permissions";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f98374s = "data_access_expiration_time";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f98375t = "graph_domain";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f98376v = "facebook";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final Date f98377w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f98378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<String> f98379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<String> f98380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<String> f98381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f98382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final g f98383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Date f98384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f98385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f98386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Date f98387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final String f98388k;

    public interface a {
        void a(@Nullable u uVar);

        void b(@Nullable AccessToken accessToken);
    }

    public interface b {
        void a(@Nullable u uVar);

        void b(@Nullable AccessToken accessToken);
    }

    public static final class c implements Parcelable.Creator<AccessToken> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AccessToken(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int i10) {
            return new AccessToken[i10];
        }
    }

    public static final class d {

        public static final class a implements com.facebook.internal.e1.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f98389a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f98390b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f98391c;

            a(Bundle bundle, a aVar, String str) {
                this.f98389a = bundle;
                this.f98390b = aVar;
                this.f98391c = str;
            }

            @Override // com.facebook.internal.e1.a
            public void a(@Nullable JSONObject jSONObject) {
                String string;
                if (jSONObject == null) {
                    string = null;
                } else {
                    try {
                        string = jSONObject.getString("id");
                    } catch (Exception unused) {
                        this.f98390b.a(new u("Unable to generate access token due to missing user id"));
                        return;
                    }
                }
                if (string == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.f98389a.putString("user_id", string);
                this.f98390b.b(AccessToken.f98366l.c(null, this.f98389a, g.FACEBOOK_APPLICATION_WEB, new Date(), this.f98391c));
            }

            @Override // com.facebook.internal.e1.a
            public void b(@Nullable u uVar) {
                this.f98390b.a(uVar);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AccessToken c(List<String> list, Bundle bundle, g gVar, Date date, String str) {
            String string;
            String string2 = bundle.getString("access_token");
            if (string2 == null) {
                return null;
            }
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            Date dateW = com.facebook.internal.e1.w(bundle, AccessToken.f98369n, date);
            if (dateW == null || (string = bundle.getString("user_id")) == null) {
                return null;
            }
            return new AccessToken(string2, str, string, list, null, null, gVar, dateW, new Date(), com.facebook.internal.e1.w(bundle, AccessToken.f98374s, new Date(0L)), null, 1024, null);
        }

        @NotNull
        public final AccessToken b(@NotNull AccessToken current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return new AccessToken(current.t(), current.i(), current.u(), current.q(), current.l(), current.m(), current.s(), new Date(), new Date(), current.k(), null, 1024, null);
        }

        @oj.n
        @NotNull
        public final AccessToken d(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new u("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong(AccessToken.H1));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray(AccessToken.f98361g3);
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(AccessToken.f98362h3);
            Date date2 = new Date(jsonObject.getLong(AccessToken.f98365k3));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            g gVarValueOf = g.valueOf(string);
            String applicationId = jsonObject.getString(AccessToken.f98367l3);
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong(AccessToken.f98374s, 0L));
            String strOptString = jsonObject.optString("graph_domain", null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            List<String> listD0 = com.facebook.internal.e1.d0(permissionsArray);
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            return new AccessToken(token, applicationId, userId, listD0, com.facebook.internal.e1.d0(declinedPermissionsArray), jSONArrayOptJSONArray == null ? new ArrayList() : com.facebook.internal.e1.d0(jSONArrayOptJSONArray), gVarValueOf, date, date2, date3, strOptString);
        }

        @oj.n
        @Nullable
        public final AccessToken e(@NotNull Bundle bundle) throws JSONException {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List<String> listJ = j(bundle, s0.f101777h);
            List<String> listJ2 = j(bundle, s0.f101778i);
            List<String> listJ3 = j(bundle, s0.f101779j);
            s0.a aVar = s0.f101772c;
            String strA = aVar.a(bundle);
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            if (com.facebook.internal.e1.Z(strA)) {
                g0 g0Var = g0.f99617a;
                strA = g0.o();
            }
            String str = strA;
            String strI = aVar.i(bundle);
            if (strI == null) {
                return null;
            }
            JSONObject jSONObjectF = com.facebook.internal.e1.f(strI);
            if (jSONObjectF == null) {
                string = null;
            } else {
                try {
                    string = jSONObjectF.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(strI, str, string, listJ, listJ2, listJ3, aVar.h(bundle), aVar.c(bundle), aVar.e(bundle), null, null, 1024, null);
        }

        @oj.n
        public final void f(@NotNull Intent intent, @NotNull String applicationId, @NotNull a accessTokenCallback) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(accessTokenCallback, "accessTokenCallback");
            if (intent.getExtras() == null) {
                accessTokenCallback.a(new u("No extras found on intent"));
                return;
            }
            Bundle bundle = new Bundle(intent.getExtras());
            String string = bundle.getString("access_token");
            if (string == null || string.length() == 0) {
                accessTokenCallback.a(new u("No access token found on intent"));
                return;
            }
            String string2 = bundle.getString("user_id");
            if (string2 != null && string2.length() != 0) {
                accessTokenCallback.b(c(null, bundle, g.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
            } else {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.D(string, new a(bundle, accessTokenCallback, applicationId));
            }
        }

        @oj.n
        @e.a({"FieldGetter"})
        @Nullable
        public final AccessToken g(@NotNull AccessToken current, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (current.s() != g.FACEBOOK_APPLICATION_WEB && current.s() != g.FACEBOOK_APPLICATION_NATIVE && current.s() != g.FACEBOOK_APPLICATION_SERVICE) {
                throw new u(Intrinsics.stringPlus("Invalid token source: ", current.s()));
            }
            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
            Date dateW = com.facebook.internal.e1.w(bundle, AccessToken.f98369n, new Date(0L));
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            String string2 = bundle.getString("graph_domain");
            Date dateW2 = com.facebook.internal.e1.w(bundle, AccessToken.f98374s, new Date(0L));
            if (com.facebook.internal.e1.Z(string)) {
                return null;
            }
            return new AccessToken(string, current.i(), current.u(), current.q(), current.l(), current.m(), current.s(), dateW, new Date(), dateW2, string2);
        }

        @oj.n
        public final void h() {
            AccessToken accessTokenI = f.f99550f.e().i();
            if (accessTokenI != null) {
                p(b(accessTokenI));
            }
        }

        @oj.n
        @Nullable
        public final AccessToken i() {
            return f.f99550f.e().i();
        }

        @oj.n
        @NotNull
        public final List<String> j(@NotNull Bundle bundle, @Nullable String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return CollectionsKt.emptyList();
            }
            List<String> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return listUnmodifiableList;
        }

        @oj.n
        public final boolean k() {
            AccessToken accessTokenI = f.f99550f.e().i();
            return (accessTokenI == null || accessTokenI.y()) ? false : true;
        }

        @oj.n
        public final boolean l() {
            AccessToken accessTokenI = f.f99550f.e().i();
            if (accessTokenI == null || accessTokenI.x()) {
                return false;
            }
            boolean z10 = false & true;
            return true;
        }

        @oj.n
        public final boolean m() {
            AccessToken accessTokenI = f.f99550f.e().i();
            return (accessTokenI == null || accessTokenI.y() || !accessTokenI.z()) ? false : true;
        }

        @oj.n
        public final void n() {
            f.f99550f.e().l(null);
        }

        @oj.n
        public final void o(@Nullable b bVar) {
            f.f99550f.e().l(bVar);
        }

        @oj.n
        public final void p(@Nullable AccessToken accessToken) {
            f.f99550f.e().s(accessToken);
        }

        private d() {
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98392a;

        static {
            int[] iArr = new int[g.valuesCustom().length];
            iArr[g.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[g.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[g.WEB_VIEW.ordinal()] = 3;
            f98392a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f98377w = date;
        X = date;
        Y = new Date();
        Z = g.FACEBOOK_APPLICATION_WEB;
        CREATOR = new c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public AccessToken(@NotNull String accessToken, @NotNull String applicationId, @NotNull String userId, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable g gVar, @Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
        this(accessToken, applicationId, userId, collection, collection2, collection3, gVar, date, date2, date3, null, 1024, null);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
    }

    @oj.n
    public static final boolean A() {
        return f98366l.m();
    }

    @oj.n
    public static final void B() {
        f98366l.n();
    }

    @oj.n
    public static final void C(@Nullable b bVar) {
        f98366l.o(bVar);
    }

    @oj.n
    public static final void D(@Nullable AccessToken accessToken) {
        f98366l.p(accessToken);
    }

    private final String F() {
        g0 g0Var = g0.f99617a;
        return g0.P(t0.INCLUDE_ACCESS_TOKENS) ? this.f98382e : "ACCESS_TOKEN_REMOVED";
    }

    private final void a(StringBuilder sb2) {
        sb2.append(" permissions:");
        sb2.append("[");
        sb2.append(TextUtils.join(", ", this.f98379b));
        sb2.append("]");
    }

    private final g b(g gVar, String str) {
        if (str == null || !str.equals(g0.O)) {
            return gVar;
        }
        int i10 = e.f98392a[gVar.ordinal()];
        if (i10 == 1) {
            return g.INSTAGRAM_APPLICATION_WEB;
        }
        if (i10 != 2) {
            return i10 != 3 ? gVar : g.INSTAGRAM_WEB_VIEW;
        }
        return g.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    @oj.n
    @NotNull
    public static final AccessToken c(@NotNull JSONObject jSONObject) throws JSONException {
        return f98366l.d(jSONObject);
    }

    @oj.n
    @Nullable
    public static final AccessToken e(@NotNull Bundle bundle) {
        return f98366l.e(bundle);
    }

    @oj.n
    public static final void f(@NotNull Intent intent, @NotNull String str, @NotNull a aVar) {
        f98366l.f(intent, str, aVar);
    }

    @oj.n
    @e.a({"FieldGetter"})
    @Nullable
    public static final AccessToken g(@NotNull AccessToken accessToken, @NotNull Bundle bundle) {
        return f98366l.g(accessToken, bundle);
    }

    @oj.n
    public static final void h() {
        f98366l.h();
    }

    @oj.n
    @Nullable
    public static final AccessToken j() {
        return f98366l.i();
    }

    @oj.n
    @NotNull
    public static final List<String> r(@NotNull Bundle bundle, @Nullable String str) {
        return f98366l.j(bundle, str);
    }

    @oj.n
    public static final boolean v() {
        return f98366l.k();
    }

    @oj.n
    public static final boolean w() {
        return f98366l.l();
    }

    @NotNull
    public final JSONObject E() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f98382e);
        jSONObject.put(H1, this.f98378a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f98379b));
        jSONObject.put(f98361g3, new JSONArray((Collection) this.f98380c));
        jSONObject.put(f98362h3, new JSONArray((Collection) this.f98381d));
        jSONObject.put(f98365k3, this.f98384g.getTime());
        jSONObject.put("source", this.f98383f.name());
        jSONObject.put(f98367l3, this.f98385h);
        jSONObject.put("user_id", this.f98386i);
        jSONObject.put(f98374s, this.f98387j.getTime());
        String str = this.f98388k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        boolean zAreEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (Intrinsics.areEqual(this.f98378a, accessToken.f98378a) && Intrinsics.areEqual(this.f98379b, accessToken.f98379b) && Intrinsics.areEqual(this.f98380c, accessToken.f98380c) && Intrinsics.areEqual(this.f98381d, accessToken.f98381d) && Intrinsics.areEqual(this.f98382e, accessToken.f98382e) && this.f98383f == accessToken.f98383f && Intrinsics.areEqual(this.f98384g, accessToken.f98384g) && Intrinsics.areEqual(this.f98385h, accessToken.f98385h) && Intrinsics.areEqual(this.f98386i, accessToken.f98386i) && Intrinsics.areEqual(this.f98387j, accessToken.f98387j)) {
            String str = this.f98388k;
            if (str == null) {
                zAreEqual = accessToken.f98388k == null;
            } else {
                zAreEqual = Intrinsics.areEqual(str, accessToken.f98388k);
            }
            if (zAreEqual) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.f98378a.hashCode()) * 31) + this.f98379b.hashCode()) * 31) + this.f98380c.hashCode()) * 31) + this.f98381d.hashCode()) * 31) + this.f98382e.hashCode()) * 31) + this.f98383f.hashCode()) * 31) + this.f98384g.hashCode()) * 31) + this.f98385h.hashCode()) * 31) + this.f98386i.hashCode()) * 31) + this.f98387j.hashCode()) * 31;
        String str = this.f98388k;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String i() {
        return this.f98385h;
    }

    @NotNull
    public final Date k() {
        return this.f98387j;
    }

    @NotNull
    public final Set<String> l() {
        return this.f98380c;
    }

    @NotNull
    public final Set<String> m() {
        return this.f98381d;
    }

    @NotNull
    public final Date n() {
        return this.f98378a;
    }

    @Nullable
    public final String o() {
        return this.f98388k;
    }

    @NotNull
    public final Date p() {
        return this.f98384g;
    }

    @NotNull
    public final Set<String> q() {
        return this.f98379b;
    }

    @NotNull
    public final g s() {
        return this.f98383f;
    }

    @NotNull
    public final String t() {
        return this.f98382e;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(F());
        a(sb2);
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    @NotNull
    public final String u() {
        return this.f98386i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f98378a.getTime());
        dest.writeStringList(new ArrayList(this.f98379b));
        dest.writeStringList(new ArrayList(this.f98380c));
        dest.writeStringList(new ArrayList(this.f98381d));
        dest.writeString(this.f98382e);
        dest.writeString(this.f98383f.name());
        dest.writeLong(this.f98384g.getTime());
        dest.writeString(this.f98385h);
        dest.writeString(this.f98386i);
        dest.writeLong(this.f98387j.getTime());
        dest.writeString(this.f98388k);
    }

    public final boolean x() {
        return new Date().after(this.f98387j);
    }

    public final boolean y() {
        return new Date().after(this.f98378a);
    }

    public final boolean z() {
        String str = this.f98388k;
        return str != null && str.equals(g0.O);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, g gVar, Date date, Date date2, Date date3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, gVar, date, date2, date3, (i10 & 1024) != 0 ? f98376v : str4);
    }

    @oj.j
    public AccessToken(@NotNull String accessToken, @NotNull String applicationId, @NotNull String userId, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable g gVar, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.p(accessToken, "accessToken");
        com.facebook.internal.f1.p(applicationId, "applicationId");
        com.facebook.internal.f1.p(userId, "userId");
        this.f98378a = date == null ? X : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f98379b = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f98380c = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f98381d = setUnmodifiableSet3;
        this.f98382e = accessToken;
        this.f98383f = b(gVar == null ? Z : gVar, str);
        this.f98384g = date2 == null ? Y : date2;
        this.f98385h = applicationId;
        this.f98386i = userId;
        this.f98387j = (date3 == null || date3.getTime() == 0) ? X : date3;
        this.f98388k = str == null ? f98376v : str;
    }

    public AccessToken(@NotNull Parcel parcel) {
        g gVarValueOf;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f98378a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f98379b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f98380c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f98381d = setUnmodifiableSet3;
        String string = parcel.readString();
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        this.f98382e = com.facebook.internal.f1.t(string, "token");
        String string2 = parcel.readString();
        if (string2 != null) {
            gVarValueOf = g.valueOf(string2);
        } else {
            gVarValueOf = Z;
        }
        this.f98383f = gVarValueOf;
        this.f98384g = new Date(parcel.readLong());
        this.f98385h = com.facebook.internal.f1.t(parcel.readString(), "applicationId");
        this.f98386i = com.facebook.internal.f1.t(parcel.readString(), "userId");
        this.f98387j = new Date(parcel.readLong());
        this.f98388k = parcel.readString();
    }
}
