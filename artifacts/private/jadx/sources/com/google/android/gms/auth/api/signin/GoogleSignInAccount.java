package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleSignInAccountCreator")
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    @l1
    public static final com.google.android.gms.common.util.g f105603m = com.google.android.gms.common.util.k.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.c(getter = "getId", id = 2)
    @p0
    private final String f105604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIdToken", id = 3)
    @p0
    private final String f105605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEmail", id = 4)
    @p0
    private final String f105606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDisplayName", id = 5)
    @p0
    private final String f105607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPhotoUrl", id = 6)
    @p0
    private final Uri f105608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getServerAuthCode", id = 7)
    @p0
    private String f105609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getExpirationTimeSecs", id = 8)
    private final long f105610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getObfuscatedIdentifier", id = 9)
    private final String f105611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(id = 10)
    final List f105612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(getter = "getGivenName", id = 11)
    @p0
    private final String f105613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SafeParcelable.c(getter = "getFamilyName", id = 12)
    @p0
    private final String f105614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f105615l = new HashSet();

    @SafeParcelable.b
    GoogleSignInAccount(@SafeParcelable.e(id = 2) @p0 String str, @SafeParcelable.e(id = 3) @p0 String str2, @SafeParcelable.e(id = 4) @p0 String str3, @SafeParcelable.e(id = 5) @p0 String str4, @SafeParcelable.e(id = 6) @p0 Uri uri, @SafeParcelable.e(id = 7) @p0 String str5, @SafeParcelable.e(id = 8) long j10, @SafeParcelable.e(id = 9) String str6, @SafeParcelable.e(id = 10) List list, @SafeParcelable.e(id = 11) @p0 String str7, @SafeParcelable.e(id = 12) @p0 String str8) {
        this.f105604a = str;
        this.f105605b = str2;
        this.f105606c = str3;
        this.f105607d = str4;
        this.f105608e = uri;
        this.f105609f = str5;
        this.f105610g = j10;
        this.f105611h = str6;
        this.f105612i = list;
        this.f105613j = str7;
        this.f105614k = str8;
    }

    @NonNull
    @g6.a
    public static GoogleSignInAccount O1() {
        return t3(new Account("<<default account>>", "com.google"), new HashSet());
    }

    @NonNull
    @g6.a
    public static GoogleSignInAccount T1(@NonNull Account account) {
        return t3(account, new androidx.collection.c());
    }

    @NonNull
    public static GoogleSignInAccount W2(@p0 String str, @p0 String str2, @p0 String str3, @p0 String str4, @p0 String str5, @p0 String str6, @p0 Uri uri, @p0 Long l10, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(str, str2, str3, str4, uri, null, l10.longValue(), w.l(str7), new ArrayList((Collection) w.r(set)), str5, str6);
    }

    @NonNull
    @a0
    @g6.a
    public static GoogleSignInAccount b2(@NonNull Account account, @NonNull Scope scope, @NonNull Scope... scopeArr) {
        w.r(account);
        w.r(scope);
        HashSet hashSet = new HashSet();
        hashSet.add(scope);
        hashSet.addAll(Arrays.asList(scopeArr));
        return t3(account, hashSet);
    }

    @p0
    public static GoogleSignInAccount h3(@p0 String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountW2 = W2(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountW2.f105609f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountW2;
    }

    private static GoogleSignInAccount t3(Account account, Set set) {
        return W2(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    @p0
    public String B2() {
        return this.f105609f;
    }

    @g6.a
    public boolean D2() {
        return f105603m.currentTimeMillis() / 1000 >= this.f105610g + (-300);
    }

    @NonNull
    @g6.a
    public GoogleSignInAccount U2(@NonNull Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.f105615l, scopeArr);
        }
        return this;
    }

    @p0
    public String e2() {
        return this.f105607d;
    }

    public boolean equals(@p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f105611h.equals(this.f105611h) && googleSignInAccount.z2().equals(z2());
    }

    @p0
    public String f2() {
        return this.f105606c;
    }

    @p0
    public String getId() {
        return this.f105604a;
    }

    public int hashCode() {
        return ((this.f105611h.hashCode() + 527) * 31) + z2().hashCode();
    }

    @NonNull
    public final String k3() {
        return this.f105611h;
    }

    @p0
    public String n2() {
        return this.f105614k;
    }

    @p0
    public String p2() {
        return this.f105613j;
    }

    @NonNull
    public Set<Scope> q2() {
        return new HashSet(this.f105612i);
    }

    @p0
    public Account r() {
        String str = this.f105606c;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    @NonNull
    public final String r3() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (s2() != null) {
                jSONObject.put("tokenId", s2());
            }
            if (f2() != null) {
                jSONObject.put("email", f2());
            }
            if (e2() != null) {
                jSONObject.put("displayName", e2());
            }
            if (p2() != null) {
                jSONObject.put("givenName", p2());
            }
            if (n2() != null) {
                jSONObject.put("familyName", n2());
            }
            Uri uriU2 = u2();
            if (uriU2 != null) {
                jSONObject.put("photoUrl", uriU2.toString());
            }
            if (B2() != null) {
                jSONObject.put("serverAuthCode", B2());
            }
            jSONObject.put("expirationTime", this.f105610g);
            jSONObject.put("obfuscatedIdentifier", this.f105611h);
            JSONArray jSONArray = new JSONArray();
            List list = this.f105612i;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.g
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).O1().compareTo(((Scope) obj2).O1());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.O1());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @p0
    public String s2() {
        return this.f105605b;
    }

    @p0
    public Uri u2() {
        return this.f105608e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.Y(parcel, 2, getId(), false);
        i6.b.Y(parcel, 3, s2(), false);
        i6.b.Y(parcel, 4, f2(), false);
        i6.b.Y(parcel, 5, e2(), false);
        i6.b.S(parcel, 6, u2(), i10, false);
        i6.b.Y(parcel, 7, B2(), false);
        i6.b.K(parcel, 8, this.f105610g);
        i6.b.Y(parcel, 9, this.f105611h, false);
        i6.b.d0(parcel, 10, this.f105612i, false);
        i6.b.Y(parcel, 11, p2(), false);
        i6.b.Y(parcel, 12, n2(), false);
        i6.b.b(parcel, iA);
    }

    @NonNull
    @g6.a
    public Set<Scope> z2() {
        HashSet hashSet = new HashSet(this.f105612i);
        hashSet.addAll(this.f105615l);
        return hashSet;
    }
}
