package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import io.sentry.k9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class LoginClient implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private LoginMethodHandler[] f100365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f100366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Fragment f100367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private d f100368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private a f100369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f100370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Request f100371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Map<String, String> f100372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Map<String, String> f100373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private v f100374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f100375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f100376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final c f100364m = new c(null);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<LoginClient> CREATOR = new b();

    public static final class Request implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final p f100378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private Set<String> f100379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final e f100380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f100381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private String f100382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f100383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private String f100384g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private String f100385h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private String f100386i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        private String f100387j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f100388k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        private final d0 f100389l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f100390m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f100391n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        private final String f100392o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        private final String f100393s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        private final String f100394t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        private final com.facebook.login.b f100395v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        public static final b f100377w = new b(null);

        @oj.f
        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Request> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Request(source, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int i10) {
                return new Request[i10];
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ Request(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public final void A(@NotNull Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.f100379b = set;
        }

        public final void B(boolean z10) {
            this.f100383f = z10;
        }

        public final void C(boolean z10) {
            this.f100388k = z10;
        }

        public final void D(boolean z10) {
            this.f100391n = z10;
        }

        public final boolean E() {
            return this.f100391n;
        }

        @NotNull
        public final String a() {
            return this.f100381d;
        }

        @NotNull
        public final String b() {
            return this.f100382e;
        }

        @NotNull
        public final String c() {
            return this.f100385h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final String e() {
            return this.f100394t;
        }

        @Nullable
        public final com.facebook.login.b f() {
            return this.f100395v;
        }

        @Nullable
        public final String g() {
            return this.f100393s;
        }

        @NotNull
        public final e h() {
            return this.f100380c;
        }

        @Nullable
        public final String i() {
            return this.f100386i;
        }

        @Nullable
        public final String j() {
            return this.f100384g;
        }

        @NotNull
        public final p k() {
            return this.f100378a;
        }

        @NotNull
        public final d0 l() {
            return this.f100389l;
        }

        @Nullable
        public final String m() {
            return this.f100387j;
        }

        @NotNull
        public final String n() {
            return this.f100392o;
        }

        @NotNull
        public final Set<String> o() {
            return this.f100379b;
        }

        public final boolean p() {
            return this.f100388k;
        }

        public final boolean q() {
            Iterator<String> it = this.f100379b.iterator();
            while (it.hasNext()) {
                if (z.f101684j.h(it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean r() {
            return this.f100390m;
        }

        public final boolean s() {
            return this.f100389l == d0.INSTAGRAM;
        }

        public final boolean t() {
            return this.f100383f;
        }

        public final void u(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f100382e = str;
        }

        public final void v(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f100385h = str;
        }

        public final void w(@Nullable String str) {
            this.f100386i = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100378a.name());
            dest.writeStringList(new ArrayList(this.f100379b));
            dest.writeString(this.f100380c.name());
            dest.writeString(this.f100381d);
            dest.writeString(this.f100382e);
            dest.writeByte(this.f100383f ? (byte) 1 : (byte) 0);
            dest.writeString(this.f100384g);
            dest.writeString(this.f100385h);
            dest.writeString(this.f100386i);
            dest.writeString(this.f100387j);
            dest.writeByte(this.f100388k ? (byte) 1 : (byte) 0);
            dest.writeString(this.f100389l.name());
            dest.writeByte(this.f100390m ? (byte) 1 : (byte) 0);
            dest.writeByte(this.f100391n ? (byte) 1 : (byte) 0);
            dest.writeString(this.f100392o);
            dest.writeString(this.f100393s);
            dest.writeString(this.f100394t);
            com.facebook.login.b bVar = this.f100395v;
            dest.writeString(bVar == null ? null : bVar.name());
        }

        public final void x(@Nullable String str) {
            this.f100384g = str;
        }

        public final void y(boolean z10) {
            this.f100390m = z10;
        }

        public final void z(@Nullable String str) {
            this.f100387j = str;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public Request(@NotNull p loginBehavior, @Nullable Set<String> set, @NotNull e defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, null, null, null, null, null, 1984, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public Request(@NotNull p loginBehavior, @Nullable Set<String> set, @NotNull e defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable d0 d0Var) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, d0Var, null, null, null, null, 1920, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public Request(@NotNull p loginBehavior, @Nullable Set<String> set, @NotNull e defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable d0 d0Var, @Nullable String str) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, d0Var, str, null, null, null, 1792, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public Request(@NotNull p loginBehavior, @Nullable Set<String> set, @NotNull e defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable d0 d0Var, @Nullable String str, @Nullable String str2) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, d0Var, str, str2, null, null, 1536, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @oj.j
        public Request(@NotNull p loginBehavior, @Nullable Set<String> set, @NotNull e defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable d0 d0Var, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, d0Var, str, str2, str3, null, 1024, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        public /* synthetic */ Request(p pVar, Set set, e eVar, String str, String str2, String str3, d0 d0Var, String str4, String str5, String str6, com.facebook.login.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(pVar, set, eVar, str, str2, str3, (i10 & 64) != 0 ? d0.FACEBOOK : d0Var, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : bVar);
        }

        @oj.j
        public Request(@NotNull p loginBehavior, @Nullable Set<String> set, @NotNull e defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable d0 d0Var, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable com.facebook.login.b bVar) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
            this.f100378a = loginBehavior;
            this.f100379b = set == null ? new HashSet<>() : set;
            this.f100380c = defaultAudience;
            this.f100385h = authType;
            this.f100381d = applicationId;
            this.f100382e = authId;
            this.f100389l = d0Var == null ? d0.FACEBOOK : d0Var;
            if (str != null && str.length() != 0) {
                this.f100392o = str;
            } else {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                this.f100392o = string;
            }
            this.f100393s = str2;
            this.f100394t = str3;
            this.f100395v = bVar;
        }

        private Request(Parcel parcel) {
            e eVarValueOf;
            f1 f1Var = f1.f99837a;
            this.f100378a = p.valueOf(f1.t(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f100379b = new HashSet(arrayList);
            String string = parcel.readString();
            if (string != null) {
                eVarValueOf = e.valueOf(string);
            } else {
                eVarValueOf = e.NONE;
            }
            this.f100380c = eVarValueOf;
            this.f100381d = f1.t(parcel.readString(), "applicationId");
            this.f100382e = f1.t(parcel.readString(), "authId");
            this.f100383f = parcel.readByte() != 0;
            this.f100384g = parcel.readString();
            this.f100385h = f1.t(parcel.readString(), "authType");
            this.f100386i = parcel.readString();
            this.f100387j = parcel.readString();
            this.f100388k = parcel.readByte() != 0;
            String string2 = parcel.readString();
            this.f100389l = string2 != null ? d0.valueOf(string2) : d0.FACEBOOK;
            this.f100390m = parcel.readByte() != 0;
            this.f100391n = parcel.readByte() != 0;
            this.f100392o = f1.t(parcel.readString(), "nonce");
            this.f100393s = parcel.readString();
            this.f100394t = parcel.readString();
            String string3 = parcel.readString();
            this.f100395v = string3 == null ? null : com.facebook.login.b.valueOf(string3);
        }
    }

    public static final class Result implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final a f100397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @Nullable
        public final AccessToken f100398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @Nullable
        public final AuthenticationToken f100399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        @Nullable
        public final String f100400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oj.f
        @Nullable
        public final String f100401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oj.f
        @Nullable
        public final Request f100402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oj.f
        @Nullable
        public Map<String, String> f100403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @oj.f
        @Nullable
        public Map<String, String> f100404h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final c f100396i = new c(null);

        @oj.f
        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new b();

        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f100409a;

            a(String str) {
                this.f100409a = str;
            }

            /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
            public static a[] valuesCustom() {
                a[] aVarArrValuesCustom = values();
                return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
            }

            @NotNull
            public final String l() {
                return this.f100409a;
            }
        }

        public static final class b implements Parcelable.Creator<Result> {
            b() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Result(source, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int i10) {
                return new Result[i10];
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Result e(c cVar, Request request, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return cVar.d(request, str, str2, str3);
            }

            @oj.n
            @NotNull
            public final Result a(@Nullable Request request, @Nullable String str) {
                return new Result(request, a.CANCEL, null, str, null);
            }

            @oj.n
            @NotNull
            public final Result b(@Nullable Request request, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
                return new Result(request, a.SUCCESS, accessToken, authenticationToken, null, null);
            }

            @oj.j
            @oj.n
            @NotNull
            public final Result c(@Nullable Request request, @Nullable String str, @Nullable String str2) {
                return e(this, request, str, str2, null, 8, null);
            }

            @oj.j
            @oj.n
            @NotNull
            public final Result d(@Nullable Request request, @Nullable String str, @Nullable String str2, @Nullable String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            @oj.n
            @NotNull
            public final Result f(@Nullable Request request, @NotNull AccessToken token) {
                Intrinsics.checkNotNullParameter(token, "token");
                return new Result(request, a.SUCCESS, token, null, null);
            }

            private c() {
            }
        }

        public /* synthetic */ Result(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @oj.n
        @NotNull
        public static final Result a(@Nullable Request request, @Nullable String str) {
            return f100396i.a(request, str);
        }

        @oj.n
        @NotNull
        public static final Result b(@Nullable Request request, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
            return f100396i.b(request, accessToken, authenticationToken);
        }

        @oj.j
        @oj.n
        @NotNull
        public static final Result c(@Nullable Request request, @Nullable String str, @Nullable String str2) {
            return f100396i.c(request, str, str2);
        }

        @oj.j
        @oj.n
        @NotNull
        public static final Result e(@Nullable Request request, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            return f100396i.d(request, str, str2, str3);
        }

        @oj.n
        @NotNull
        public static final Result f(@Nullable Request request, @NotNull AccessToken accessToken) {
            return f100396i.f(request, accessToken);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100397a.name());
            dest.writeParcelable(this.f100398b, i10);
            dest.writeParcelable(this.f100399c, i10);
            dest.writeString(this.f100400d);
            dest.writeString(this.f100401e);
            dest.writeParcelable(this.f100402f, i10);
            e1 e1Var = e1.f99794a;
            e1.L0(dest, this.f100403g);
            e1.L0(dest, this.f100404h);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(@Nullable Request request, @NotNull a code, @Nullable AccessToken accessToken, @Nullable String str, @Nullable String str2) {
            this(request, code, accessToken, null, str, str2);
            Intrinsics.checkNotNullParameter(code, "code");
        }

        public Result(@Nullable Request request, @NotNull a code, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f100402f = request;
            this.f100398b = accessToken;
            this.f100399c = authenticationToken;
            this.f100400d = str;
            this.f100397a = code;
            this.f100401e = str2;
        }

        private Result(Parcel parcel) {
            String string = parcel.readString();
            this.f100397a = a.valueOf(string == null ? "error" : string);
            this.f100398b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f100399c = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.f100400d = parcel.readString();
            this.f100401e = parcel.readString();
            this.f100402f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            e1 e1Var = e1.f99794a;
            this.f100403g = e1.q0(parcel);
            this.f100404h = e1.q0(parcel);
        }
    }

    public interface a {
        void a();

        void b();
    }

    public static final class b implements Parcelable.Creator<LoginClient> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new LoginClient(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int i10) {
            return new LoginClient[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(k9.b.f305796c, System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "e2e.toString()");
            return string;
        }

        @oj.n
        public final int b() {
            return com.facebook.internal.f.c.Login.l();
        }

        private c() {
        }
    }

    public interface d {
        void a(@NotNull Result result);
    }

    public LoginClient(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f100366b = -1;
        J(fragment);
    }

    private final void A(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.f100371g;
        String str5 = v.f101558f;
        if (request == null) {
            u().y(v.f101558f, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        v vVarU = u();
        String strB = request.b();
        if (request.r()) {
            str5 = v.f101567o;
        }
        vVarU.d(strB, str, str2, str3, str4, map, str5);
    }

    private final void D(Result result) {
        d dVar = this.f100368d;
        if (dVar == null) {
            return;
        }
        dVar.a(result);
    }

    private final void b(String str, String str2, boolean z10) {
        Map<String, String> map = this.f100372h;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f100372h == null) {
            this.f100372h = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + AbstractJsonLexerKt.COMMA + str2;
        }
        map.put(str, str2);
    }

    private final void j() {
        h(Result.c.e(Result.f100396i, this.f100371g, "Login attempt failed.", null, null, 8, null));
    }

    @oj.n
    @NotNull
    public static final String o() {
        return f100364m.a();
    }

    private final v u() {
        String strA;
        v vVar = this.f100374j;
        if (vVar != null) {
            String strB = vVar.b();
            Request request = this.f100371g;
            if (Intrinsics.areEqual(strB, request == null ? null : request.a())) {
                return vVar;
            }
        }
        Context contextK = k();
        if (contextK == null) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            contextK = com.facebook.g0.n();
        }
        Request request2 = this.f100371g;
        if (request2 == null) {
            com.facebook.g0 g0Var2 = com.facebook.g0.f99617a;
            strA = com.facebook.g0.o();
        } else {
            strA = request2.a();
        }
        v vVar2 = new v(contextK, strA);
        this.f100374j = vVar2;
        return vVar2;
    }

    @oj.n
    public static final int w() {
        return f100364m.b();
    }

    private final void z(String str, Result result, Map<String, String> map) {
        A(str, result.f100397a.l(), result.f100400d, result.f100401e, map);
    }

    public final void B() {
        a aVar = this.f100369e;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void C() {
        a aVar = this.f100369e;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public final boolean E(int i10, int i11, @Nullable Intent intent) {
        this.f100375k++;
        if (this.f100371g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f98470j, false)) {
                Q();
                return false;
            }
            LoginMethodHandler loginMethodHandlerN = n();
            if (loginMethodHandlerN != null && (!loginMethodHandlerN.u() || intent != null || this.f100375k >= this.f100376l)) {
                return loginMethodHandlerN.p(i10, i11, intent);
            }
        }
        return false;
    }

    public final void F(@Nullable a aVar) {
        this.f100369e = aVar;
    }

    public final void G(boolean z10) {
        this.f100370f = z10;
    }

    protected final void H(int i10) {
        this.f100366b = i10;
    }

    public final void I(@Nullable Map<String, String> map) {
        this.f100373i = map;
    }

    public final void J(@Nullable Fragment fragment) {
        if (this.f100367c != null) {
            throw new com.facebook.u("Can't set fragment once it is already set.");
        }
        this.f100367c = fragment;
    }

    public final void K(@Nullable LoginMethodHandler[] loginMethodHandlerArr) {
        this.f100365a = loginMethodHandlerArr;
    }

    public final void L(@Nullable Map<String, String> map) {
        this.f100372h = map;
    }

    public final void M(@Nullable d dVar) {
        this.f100368d = dVar;
    }

    public final void N(@Nullable Request request) {
        this.f100371g = request;
    }

    public final void O(@Nullable Request request) {
        if (t()) {
            return;
        }
        c(request);
    }

    public final boolean P() {
        LoginMethodHandler loginMethodHandlerN = n();
        if (loginMethodHandlerN == null) {
            return false;
        }
        if (loginMethodHandlerN.o() && !f()) {
            b(v.C, "1", false);
            return false;
        }
        Request request = this.f100371g;
        if (request == null) {
            return false;
        }
        int iV = loginMethodHandlerN.v(request);
        this.f100375k = 0;
        if (iV > 0) {
            u().j(request.b(), loginMethodHandlerN.k(), request.r() ? v.f101566n : v.f101557e);
            this.f100376l = iV;
        } else {
            u().g(request.b(), loginMethodHandlerN.k(), request.r() ? v.f101568p : v.f101559g);
            b(v.D, loginMethodHandlerN.k(), true);
        }
        return iV > 0;
    }

    public final void Q() {
        LoginClient loginClient;
        LoginMethodHandler loginMethodHandlerN = n();
        if (loginMethodHandlerN != null) {
            loginClient = this;
            loginClient.A(loginMethodHandlerN.k(), v.f101560h, null, null, loginMethodHandlerN.j());
        } else {
            loginClient = this;
        }
        LoginMethodHandler[] loginMethodHandlerArr = loginClient.f100365a;
        while (loginMethodHandlerArr != null) {
            int i10 = loginClient.f100366b;
            if (i10 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            loginClient.f100366b = i10 + 1;
            if (loginClient.P()) {
                return;
            }
        }
        if (loginClient.f100371g != null) {
            loginClient.j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:6:0x0016, B:8:0x0027, B:12:0x004b, B:11:0x003a), top: B:18:0x0016 }] */
    public final void R(@NotNull Result pendingResult) {
        Result resultB;
        Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
        if (pendingResult.f100398b == null) {
            throw new com.facebook.u("Can't validate without a token");
        }
        AccessToken accessTokenI = AccessToken.f98366l.i();
        AccessToken accessToken = pendingResult.f100398b;
        if (accessTokenI != null) {
            try {
                if (Intrinsics.areEqual(accessTokenI.u(), accessToken.u())) {
                    resultB = Result.f100396i.b(this.f100371g, pendingResult.f100398b, pendingResult.f100399c);
                } else {
                    resultB = Result.c.e(Result.f100396i, this.f100371g, "User logged in as different Facebook user.", null, null, 8, null);
                }
            } catch (Exception e10) {
                h(Result.c.e(Result.f100396i, this.f100371g, "Caught exception", e10.getMessage(), null, 8, null));
                return;
            }
        } else {
            resultB = Result.c.e(Result.f100396i, this.f100371g, "User logged in as different Facebook user.", null, null, 8, null);
        }
        h(resultB);
    }

    public final void a(@NotNull String key, @NotNull String value, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<String, String> map = this.f100373i;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f100373i == null) {
            this.f100373i = map;
        }
        if (map.containsKey(key) && z10) {
            value = ((Object) map.get(key)) + AbstractJsonLexerKt.COMMA + value;
        }
        map.put(key, value);
    }

    public final void c(@Nullable Request request) {
        if (request == null) {
            return;
        }
        if (this.f100371g != null) {
            throw new com.facebook.u("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.f98366l.k() || f()) {
            this.f100371g = request;
            this.f100365a = s(request);
            Q();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e() {
        LoginMethodHandler loginMethodHandlerN = n();
        if (loginMethodHandlerN == null) {
            return;
        }
        loginMethodHandlerN.b();
    }

    public final boolean f() {
        if (this.f100370f) {
            return true;
        }
        if (g("android.permission.INTERNET") == 0) {
            this.f100370f = true;
            return true;
        }
        androidx.fragment.app.s sVarK = k();
        h(Result.c.e(Result.f100396i, this.f100371g, sVarK == null ? null : sVarK.getString(l5.b.l.E), sVarK != null ? sVarK.getString(l5.b.l.D) : null, null, 8, null));
        return false;
    }

    public final int g(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        androidx.fragment.app.s sVarK = k();
        if (sVarK == null) {
            return -1;
        }
        return sVarK.checkCallingOrSelfPermission(permission);
    }

    public final void h(@NotNull Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        LoginMethodHandler loginMethodHandlerN = n();
        if (loginMethodHandlerN != null) {
            z(loginMethodHandlerN.k(), outcome, loginMethodHandlerN.j());
        }
        Map<String, String> map = this.f100372h;
        if (map != null) {
            outcome.f100403g = map;
        }
        Map<String, String> map2 = this.f100373i;
        if (map2 != null) {
            outcome.f100404h = map2;
        }
        this.f100365a = null;
        this.f100366b = -1;
        this.f100371g = null;
        this.f100372h = null;
        this.f100375k = 0;
        this.f100376l = 0;
        D(outcome);
    }

    public final void i(@NotNull Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (outcome.f100398b == null || !AccessToken.f98366l.k()) {
            h(outcome);
        } else {
            R(outcome);
        }
    }

    @Nullable
    public final androidx.fragment.app.s k() {
        Fragment fragment = this.f100367c;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    @Nullable
    public final a l() {
        return this.f100369e;
    }

    public final boolean m() {
        return this.f100370f;
    }

    @Nullable
    public final LoginMethodHandler n() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i10 = this.f100366b;
        if (i10 < 0 || (loginMethodHandlerArr = this.f100365a) == null) {
            return null;
        }
        return loginMethodHandlerArr[i10];
    }

    @Nullable
    public final Map<String, String> p() {
        return this.f100373i;
    }

    @Nullable
    public final Fragment q() {
        return this.f100367c;
    }

    @Nullable
    public final LoginMethodHandler[] r() {
        return this.f100365a;
    }

    @Nullable
    public LoginMethodHandler[] s(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = new ArrayList();
        p pVarK = request.k();
        if (!request.s()) {
            if (pVarK.p()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!com.facebook.g0.N && pVarK.r()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!com.facebook.g0.N && pVarK.q()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (pVarK.l()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (pVarK.s()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.s() && pVarK.n()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            return (LoginMethodHandler[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean t() {
        return this.f100371g != null && this.f100366b >= 0;
    }

    @Nullable
    public final Map<String, String> v() {
        return this.f100372h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.f100365a, i10);
        dest.writeInt(this.f100366b);
        dest.writeParcelable(this.f100371g, i10);
        e1 e1Var = e1.f99794a;
        e1.L0(dest, this.f100372h);
        e1.L0(dest, this.f100373i);
    }

    @Nullable
    public final d x() {
        return this.f100368d;
    }

    @Nullable
    public final Request y() {
        return this.f100371g;
    }

    public LoginClient(@NotNull Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f100366b = -1;
        Parcelable[] parcelableArray = source.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i10];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.s(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f100365a = (LoginMethodHandler[]) array;
        this.f100366b = source.readInt();
        this.f100371g = (Request) source.readParcelable(Request.class.getClassLoader());
        e1 e1Var = e1.f99794a;
        Map<String, String> mapQ0 = e1.q0(source);
        this.f100372h = mapQ0 == null ? null : MapsKt.toMutableMap(mapQ0);
        Map<String, String> mapQ1 = e1.q0(source);
        this.f100373i = mapQ1 != null ? MapsKt.toMutableMap(mapQ1) : null;
    }
}
