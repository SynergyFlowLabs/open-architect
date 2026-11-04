package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Profile implements Parcelable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f98557j = "id";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f98558k = "first_name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f98559l = "middle_name";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f98560m = "last_name";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f98561n = "name";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f98562o = "link_uri";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f98563s = "picture_uri";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f98564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f98565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f98566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f98567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f98568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Uri f98569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Uri f98570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f98555h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f98556i = Profile.class.getSimpleName();

    @oj.f
    @NotNull
    public static final Parcelable.Creator<Profile> CREATOR = new a();

    public static final class a implements Parcelable.Creator<Profile> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Profile createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Profile(source, null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Profile[] newArray(int i10) {
            return new Profile[i10];
        }
    }

    public static final class b {

        public static final class a implements com.facebook.internal.e1.a {
            a() {
            }

            @Override // com.facebook.internal.e1.a
            public void a(@Nullable JSONObject jSONObject) {
                String strOptString = jSONObject == null ? null : jSONObject.optString("id");
                if (strOptString == null) {
                    String unused = Profile.f98556i;
                    return;
                }
                String strOptString2 = jSONObject.optString("link");
                String strOptString3 = jSONObject.optString("profile_picture", null);
                Profile.f98555h.c(new Profile(strOptString, jSONObject.optString(Profile.f98558k), jSONObject.optString("middle_name"), jSONObject.optString(Profile.f98560m), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
            }

            @Override // com.facebook.internal.e1.a
            public void b(@Nullable u uVar) {
                String unused = Profile.f98556i;
                Intrinsics.stringPlus("Got unexpected exception: ", uVar);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        public final void a() {
            AccessToken.d dVar = AccessToken.f98366l;
            AccessToken accessTokenI = dVar.i();
            if (accessTokenI == null) {
                return;
            }
            if (!dVar.k()) {
                c(null);
            } else {
                com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                com.facebook.internal.e1.D(accessTokenI.t(), new a());
            }
        }

        @oj.n
        @Nullable
        public final Profile b() {
            return w0.f102166d.a().c();
        }

        @oj.n
        public final void c(@Nullable Profile profile) {
            w0.f102166d.a().g(profile);
        }

        private b() {
        }
    }

    public /* synthetic */ Profile(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @oj.n
    public static final void b() {
        f98555h.a();
    }

    @oj.n
    @Nullable
    public static final Profile c() {
        return f98555h.b();
    }

    @oj.n
    public static final void m(@Nullable Profile profile) {
        f98555h.c(profile);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String e() {
        return this.f98565b;
    }

    public boolean equals(@Nullable Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.f98564a;
        return ((str5 == null && ((Profile) obj).f98564a == null) || Intrinsics.areEqual(str5, ((Profile) obj).f98564a)) && (((str = this.f98565b) == null && ((Profile) obj).f98565b == null) || Intrinsics.areEqual(str, ((Profile) obj).f98565b)) && ((((str2 = this.f98566c) == null && ((Profile) obj).f98566c == null) || Intrinsics.areEqual(str2, ((Profile) obj).f98566c)) && ((((str3 = this.f98567d) == null && ((Profile) obj).f98567d == null) || Intrinsics.areEqual(str3, ((Profile) obj).f98567d)) && ((((str4 = this.f98568e) == null && ((Profile) obj).f98568e == null) || Intrinsics.areEqual(str4, ((Profile) obj).f98568e)) && ((((uri = this.f98569f) == null && ((Profile) obj).f98569f == null) || Intrinsics.areEqual(uri, ((Profile) obj).f98569f)) && (((uri2 = this.f98570g) == null && ((Profile) obj).f98570g == null) || Intrinsics.areEqual(uri2, ((Profile) obj).f98570g))))));
    }

    @Nullable
    public final String f() {
        return this.f98564a;
    }

    @Nullable
    public final String g() {
        return this.f98567d;
    }

    @Nullable
    public final Uri h() {
        return this.f98569f;
    }

    public int hashCode() {
        String str = this.f98564a;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f98565b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f98566c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f98567d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f98568e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f98569f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f98570g;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    @Nullable
    public final String i() {
        return this.f98566c;
    }

    @Nullable
    public final String j() {
        return this.f98568e;
    }

    @Nullable
    public final Uri k() {
        return this.f98570g;
    }

    @NotNull
    public final Uri l(int i10, int i11) {
        String strT;
        Uri uri = this.f98570g;
        if (uri != null) {
            return uri;
        }
        AccessToken.d dVar = AccessToken.f98366l;
        if (dVar.k()) {
            AccessToken accessTokenI = dVar.i();
            strT = accessTokenI == null ? null : accessTokenI.t();
        } else {
            strT = "";
        }
        return com.facebook.internal.l0.f99974f.b(this.f98564a, i10, i11, strT);
    }

    @Nullable
    public final JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f98564a);
            jSONObject.put(f98558k, this.f98565b);
            jSONObject.put("middle_name", this.f98566c);
            jSONObject.put(f98560m, this.f98567d);
            jSONObject.put("name", this.f98568e);
            Uri uri = this.f98569f;
            if (uri != null) {
                jSONObject.put(f98562o, uri.toString());
            }
            Uri uri2 = this.f98570g;
            if (uri2 != null) {
                jSONObject.put(f98563s, uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98564a);
        dest.writeString(this.f98565b);
        dest.writeString(this.f98566c);
        dest.writeString(this.f98567d);
        dest.writeString(this.f98568e);
        Uri uri = this.f98569f;
        boolean z10 = false;
        dest.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f98570g;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    @oj.j
    public Profile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri) {
        this(str, str2, str3, str4, str5, uri, null, 64, null);
    }

    public /* synthetic */ Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, uri, (i10 & 64) != 0 ? null : uri2);
    }

    @oj.j
    public Profile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri, @Nullable Uri uri2) {
        com.facebook.internal.f1 f1Var = com.facebook.internal.f1.f99837a;
        com.facebook.internal.f1.t(str, "id");
        this.f98564a = str;
        this.f98565b = str2;
        this.f98566c = str3;
        this.f98567d = str4;
        this.f98568e = str5;
        this.f98569f = uri;
        this.f98570g = uri2;
    }

    public Profile(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f98564a = jsonObject.optString("id", null);
        this.f98565b = jsonObject.optString(f98558k, null);
        this.f98566c = jsonObject.optString("middle_name", null);
        this.f98567d = jsonObject.optString(f98560m, null);
        this.f98568e = jsonObject.optString("name", null);
        String strOptString = jsonObject.optString(f98562o, null);
        this.f98569f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jsonObject.optString(f98563s, null);
        this.f98570g = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    private Profile(Parcel parcel) {
        this.f98564a = parcel.readString();
        this.f98565b = parcel.readString();
        this.f98566c = parcel.readString();
        this.f98567d = parcel.readString();
        this.f98568e = parcel.readString();
        String string = parcel.readString();
        this.f98569f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f98570g = string2 != null ? Uri.parse(string2) : null;
    }
}
