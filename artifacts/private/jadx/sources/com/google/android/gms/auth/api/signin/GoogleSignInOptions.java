package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "GoogleSignInOptionsCreator")
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements com.google.android.gms.common.api.a.d.f, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public static final GoogleSignInOptions f105616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public static final GoogleSignInOptions f105617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    @l1
    public static final Scope f105618n = new Scope("profile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    @l1
    public static final Scope f105619o = new Scope("email");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    @l1
    public static final Scope f105620s = new Scope("openid");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    @l1
    public static final Scope f105621t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    @l1
    public static final Scope f105622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Comparator f105623w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f105624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getScopes", id = 2)
    private final ArrayList f105625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAccount", id = 3)
    @p0
    private Account f105626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "isIdTokenRequested", id = 4)
    private boolean f105627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "isServerAuthCodeRequested", id = 5)
    private final boolean f105628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "isForceCodeForRefreshToken", id = 6)
    private final boolean f105629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getServerClientId", id = 7)
    @p0
    private String f105630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getHostedDomain", id = 8)
    @p0
    private String f105631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getExtensions", id = 9)
    private ArrayList f105632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(getter = "getLogSessionId", id = 10)
    @p0
    private String f105633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f105634k;

    static {
        Scope scope = new Scope(s.f106819i);
        f105621t = scope;
        f105622v = new Scope(s.f106818h);
        a aVar = new a();
        aVar.d();
        aVar.f();
        f105616l = aVar.b();
        a aVar2 = new a();
        aVar2.g(scope, new Scope[0]);
        f105617m = aVar2.b();
        CREATOR = new k();
        f105623w = new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map F3(@p0 List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.O1()), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    @p0
    public static GoogleSignInOptions u2(@p0 String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    @NonNull
    @g6.a
    public ArrayList<GoogleSignInOptionsExtensionParcelable> O1() {
        return this.f105632i;
    }

    @p0
    @g6.a
    public String T1() {
        return this.f105633j;
    }

    @NonNull
    public final String U2() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f105625b, f105623w);
            Iterator it = this.f105625b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).O1());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f105626c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f105627d);
            jSONObject.put("forceCodeForRefreshToken", this.f105629f);
            jSONObject.put("serverAuthRequested", this.f105628e);
            if (!TextUtils.isEmpty(this.f105630g)) {
                jSONObject.put("serverClientId", this.f105630g);
            }
            if (!TextUtils.isEmpty(this.f105631h)) {
                jSONObject.put("hostedDomain", this.f105631h);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public Scope[] b2() {
        return (Scope[]) this.f105625b.toArray(new Scope[this.f105625b.size()]);
    }

    @NonNull
    @g6.a
    public ArrayList<Scope> e2() {
        return new ArrayList<>(this.f105625b);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b A[Catch: ClassCastException -> 0x00a5, TryCatch #0 {ClassCastException -> 0x00a5, blocks: (B:5:0x0004, B:7:0x000f, B:10:0x001b, B:12:0x002d, B:15:0x003b, B:17:0x003f, B:22:0x0052, B:24:0x005b, B:30:0x0078, B:32:0x0081, B:34:0x008b, B:36:0x0094, B:27:0x0068, B:20:0x0047), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[Catch: ClassCastException -> 0x00a5, TryCatch #0 {ClassCastException -> 0x00a5, blocks: (B:5:0x0004, B:7:0x000f, B:10:0x001b, B:12:0x002d, B:15:0x003b, B:17:0x003f, B:22:0x0052, B:24:0x005b, B:30:0x0078, B:32:0x0081, B:34:0x008b, B:36:0x0094, B:27:0x0068, B:20:0x0047), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078 A[Catch: ClassCastException -> 0x00a5, TryCatch #0 {ClassCastException -> 0x00a5, blocks: (B:5:0x0004, B:7:0x000f, B:10:0x001b, B:12:0x002d, B:15:0x003b, B:17:0x003f, B:22:0x0052, B:24:0x005b, B:30:0x0078, B:32:0x0081, B:34:0x008b, B:36:0x0094, B:27:0x0068, B:20:0x0047), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: ClassCastException -> 0x00a5, TryCatch #0 {ClassCastException -> 0x00a5, blocks: (B:5:0x0004, B:7:0x000f, B:10:0x001b, B:12:0x002d, B:15:0x003b, B:17:0x003f, B:22:0x0052, B:24:0x005b, B:30:0x0078, B:32:0x0081, B:34:0x008b, B:36:0x0094, B:27:0x0068, B:20:0x0047), top: B:42:0x0004 }] */
    public boolean equals(@p0 Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f105632i.isEmpty() && googleSignInOptions.f105632i.isEmpty() && this.f105625b.size() == googleSignInOptions.e2().size() && this.f105625b.containsAll(googleSignInOptions.e2())) {
                Account account = this.f105626c;
                if (account == null) {
                    if (googleSignInOptions.r() == null) {
                        if (TextUtils.isEmpty(this.f105630g)) {
                            if (TextUtils.isEmpty(googleSignInOptions.f2())) {
                                if (this.f105629f == googleSignInOptions.n2() && this.f105627d == googleSignInOptions.p2() && this.f105628e == googleSignInOptions.q2() && TextUtils.equals(this.f105633j, googleSignInOptions.T1())) {
                                    return true;
                                }
                            }
                        } else if (!this.f105630g.equals(googleSignInOptions.f2())) {
                            if (this.f105629f == googleSignInOptions.n2()) {
                                return true;
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.r())) {
                    if (TextUtils.isEmpty(this.f105630g)) {
                        if (TextUtils.isEmpty(googleSignInOptions.f2())) {
                            if (this.f105629f == googleSignInOptions.n2()) {
                                return true;
                            }
                        }
                    } else if (!this.f105630g.equals(googleSignInOptions.f2())) {
                        if (this.f105629f == googleSignInOptions.n2()) {
                            return true;
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    @p0
    @g6.a
    public String f2() {
        return this.f105630g;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f105625b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).O1());
        }
        Collections.sort(arrayList);
        com.google.android.gms.auth.api.signin.internal.a aVar = new com.google.android.gms.auth.api.signin.internal.a();
        aVar.a(arrayList);
        aVar.a(this.f105626c);
        aVar.a(this.f105630g);
        aVar.c(this.f105629f);
        aVar.c(this.f105627d);
        aVar.c(this.f105628e);
        aVar.a(this.f105633j);
        return aVar.b();
    }

    @g6.a
    public boolean n2() {
        return this.f105629f;
    }

    @g6.a
    public boolean p2() {
        return this.f105627d;
    }

    @g6.a
    public boolean q2() {
        return this.f105628e;
    }

    @p0
    @g6.a
    public Account r() {
        return this.f105626c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f105624a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.d0(parcel, 2, e2(), false);
        i6.b.S(parcel, 3, r(), i10, false);
        i6.b.g(parcel, 4, p2());
        i6.b.g(parcel, 5, q2());
        i6.b.g(parcel, 6, n2());
        i6.b.Y(parcel, 7, f2(), false);
        i6.b.Y(parcel, 8, this.f105631h, false);
        i6.b.d0(parcel, 9, O1(), false);
        i6.b.Y(parcel, 10, T1(), false);
        i6.b.b(parcel, iA);
    }

    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set f105635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f105636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f105637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f105638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        private String f105639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        private Account f105640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private String f105641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f105642h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        private String f105643i;

        public a() {
            this.f105635a = new HashSet();
            this.f105642h = new HashMap();
        }

        private final String m(String str) {
            w.l(str);
            String str2 = this.f105639e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            w.b(z10, "two different server client ids provided");
            return str;
        }

        @NonNull
        public a a(@NonNull d dVar) {
            if (this.f105642h.containsKey(Integer.valueOf(dVar.a()))) {
                throw new IllegalStateException("Only one extension per type may be added");
            }
            List<Scope> listC = dVar.c();
            if (listC != null) {
                this.f105635a.addAll(listC);
            }
            this.f105642h.put(Integer.valueOf(dVar.a()), new GoogleSignInOptionsExtensionParcelable(dVar));
            return this;
        }

        @NonNull
        public GoogleSignInOptions b() {
            if (this.f105635a.contains(GoogleSignInOptions.f105622v)) {
                Set set = this.f105635a;
                Scope scope = GoogleSignInOptions.f105621t;
                if (set.contains(scope)) {
                    this.f105635a.remove(scope);
                }
            }
            if (this.f105638d && (this.f105640f == null || !this.f105635a.isEmpty())) {
                d();
            }
            return new GoogleSignInOptions(new ArrayList(this.f105635a), this.f105640f, this.f105638d, this.f105636b, this.f105637c, this.f105639e, this.f105641g, this.f105642h, this.f105643i);
        }

        @NonNull
        public a c() {
            this.f105635a.add(GoogleSignInOptions.f105619o);
            return this;
        }

        @NonNull
        public a d() {
            this.f105635a.add(GoogleSignInOptions.f105620s);
            return this;
        }

        @NonNull
        public a e(@NonNull String str) {
            this.f105638d = true;
            m(str);
            this.f105639e = str;
            return this;
        }

        @NonNull
        public a f() {
            this.f105635a.add(GoogleSignInOptions.f105618n);
            return this;
        }

        @NonNull
        public a g(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f105635a.add(scope);
            this.f105635a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        public a h(@NonNull String str) {
            i(str, false);
            return this;
        }

        @NonNull
        public a i(@NonNull String str, boolean z10) {
            this.f105636b = true;
            m(str);
            this.f105639e = str;
            this.f105637c = z10;
            return this;
        }

        @NonNull
        public a j(@NonNull String str) {
            this.f105640f = new Account(w.l(str), "com.google");
            return this;
        }

        @NonNull
        public a k(@NonNull String str) {
            this.f105641g = w.l(str);
            return this;
        }

        @NonNull
        @g6.a
        public a l(@NonNull String str) {
            this.f105643i = str;
            return this;
        }

        public a(@NonNull GoogleSignInOptions googleSignInOptions) {
            this.f105635a = new HashSet();
            this.f105642h = new HashMap();
            w.r(googleSignInOptions);
            this.f105635a = new HashSet(googleSignInOptions.f105625b);
            this.f105636b = googleSignInOptions.f105628e;
            this.f105637c = googleSignInOptions.f105629f;
            this.f105638d = googleSignInOptions.f105627d;
            this.f105639e = googleSignInOptions.f105630g;
            this.f105640f = googleSignInOptions.f105626c;
            this.f105641g = googleSignInOptions.f105631h;
            this.f105642h = GoogleSignInOptions.F3(googleSignInOptions.f105632i);
            this.f105643i = googleSignInOptions.f105633j;
        }
    }

    @SafeParcelable.b
    GoogleSignInOptions(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ArrayList arrayList, @SafeParcelable.e(id = 3) @p0 Account account, @SafeParcelable.e(id = 4) boolean z10, @SafeParcelable.e(id = 5) boolean z11, @SafeParcelable.e(id = 6) boolean z12, @SafeParcelable.e(id = 7) @p0 String str, @SafeParcelable.e(id = 8) @p0 String str2, @SafeParcelable.e(id = 9) ArrayList arrayList2, @SafeParcelable.e(id = 10) @p0 String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, F3(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, @p0 Account account, boolean z10, boolean z11, boolean z12, @p0 String str, @p0 String str2, Map map, @p0 String str3) {
        this.f105624a = i10;
        this.f105625b = arrayList;
        this.f105626c = account;
        this.f105627d = z10;
        this.f105628e = z11;
        this.f105629f = z12;
        this.f105630g = str;
        this.f105631h = str2;
        this.f105632i = new ArrayList(map.values());
        this.f105634k = map;
        this.f105633j = str3;
    }
}
