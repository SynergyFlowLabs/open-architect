package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.l1;
import java.net.HttpURLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@t5.b({@t5.a(reason = "Legacy migration", type = "KOTLIN_JVM_FIELD")})
public final class FacebookRequestError implements Parcelable {

    @NotNull
    private static final String H1 = "error_subcode";

    @NotNull
    private static final String X = "error";

    @NotNull
    private static final String Y = "type";

    @NotNull
    private static final String Z = "code";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private static final String f98480g3 = "error_reason";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private static final String f98481h3 = "error_user_title";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private static final String f98482i3 = "error_user_msg";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private static final String f98483j3 = "is_transient";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private static final String f98486p0 = "message";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final String f98487p1 = "error_code";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private static final String f98488p2 = "error_msg";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f98489s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f98490t = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f98491v = "code";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String f98492w = "body";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f98493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f98494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f98495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f98496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f98497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f98498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final JSONObject f98499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final JSONObject f98500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final Object f98501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final HttpURLConnection f98502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final String f98503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private u f98504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final a f98505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final String f98506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final c f98485o = new c(null);

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private static final d f98484k3 = new d(200, 299);

    @oj.f
    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new b();

    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }
    }

    public static final class b implements Parcelable.Creator<FacebookRequestError> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int i10) {
            return new FacebookRequestError[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @Nullable
        public final FacebookRequestError a(@NotNull JSONObject singleResult, @Nullable Object obj, @Nullable HttpURLConnection httpURLConnection) {
            String strOptString;
            int iOptInt;
            String str;
            boolean z10;
            String str2;
            String strOptString2;
            String str3 = "body";
            Intrinsics.checkNotNullParameter(singleResult, "singleResult");
            try {
                if (singleResult.has("code")) {
                    int i10 = singleResult.getInt("code");
                    com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                    Object objK = com.facebook.internal.e1.K(singleResult, "body", q0.f101748k);
                    if (objK == null || !(objK instanceof JSONObject)) {
                        str3 = "body";
                    } else {
                        boolean z11 = true;
                        boolean zOptBoolean = false;
                        int iOptInt2 = -1;
                        if (((JSONObject) objK).has("error")) {
                            JSONObject jSONObject = (JSONObject) com.facebook.internal.e1.K((JSONObject) objK, "error", null);
                            String strOptString3 = jSONObject == null ? null : jSONObject.optString("type", null);
                            strOptString = jSONObject == null ? null : jSONObject.optString("message", null);
                            int iOptInt3 = jSONObject == null ? -1 : jSONObject.optInt("code", -1);
                            if (jSONObject != null) {
                                iOptInt2 = jSONObject.optInt("error_subcode", -1);
                            }
                            strOptString2 = jSONObject == null ? null : jSONObject.optString(FacebookRequestError.f98482i3, null);
                            String strOptString4 = jSONObject == null ? null : jSONObject.optString(FacebookRequestError.f98481h3, null);
                            if (jSONObject != null) {
                                zOptBoolean = jSONObject.optBoolean(FacebookRequestError.f98483j3, false);
                            }
                            iOptInt = iOptInt2;
                            iOptInt2 = iOptInt3;
                            str = strOptString3;
                            str2 = strOptString4;
                            z10 = zOptBoolean;
                        } else if (((JSONObject) objK).has("error_code") || ((JSONObject) objK).has(FacebookRequestError.f98488p2) || ((JSONObject) objK).has(FacebookRequestError.f98480g3)) {
                            String strOptString5 = ((JSONObject) objK).optString(FacebookRequestError.f98480g3, null);
                            strOptString = ((JSONObject) objK).optString(FacebookRequestError.f98488p2, null);
                            iOptInt2 = ((JSONObject) objK).optInt("error_code", -1);
                            iOptInt = ((JSONObject) objK).optInt("error_subcode", -1);
                            str = strOptString5;
                            z10 = false;
                            str2 = null;
                            strOptString2 = null;
                        } else {
                            z11 = false;
                            z10 = false;
                            iOptInt = -1;
                            str = null;
                            str2 = null;
                            strOptString = null;
                            strOptString2 = null;
                        }
                        if (z11) {
                            return new FacebookRequestError(i10, iOptInt2, iOptInt, str, strOptString, str2, strOptString2, (JSONObject) objK, singleResult, obj, httpURLConnection, null, z10, null);
                        }
                    }
                    if (!c().a(i10)) {
                        return new FacebookRequestError(i10, -1, -1, null, null, null, null, singleResult.has(str3) ? (JSONObject) com.facebook.internal.e1.K(singleResult, str3, q0.f101748k) : null, singleResult, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        @oj.n
        @NotNull
        public final synchronized com.facebook.internal.p b() {
            try {
                com.facebook.internal.b0 b0Var = com.facebook.internal.b0.f99725a;
                g0 g0Var = g0.f99617a;
                com.facebook.internal.x xVarF = com.facebook.internal.b0.f(g0.o());
                if (xVarF == null) {
                    return com.facebook.internal.p.f100023g.b();
                }
                return xVarF.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @NotNull
        public final d c() {
            return FacebookRequestError.f98484k3;
        }

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f98511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f98512b;

        public d(int i10, int i11) {
            this.f98511a = i10;
            this.f98512b = i11;
        }

        public final boolean a(int i10) {
            return i10 <= this.f98512b && this.f98511a <= i10;
        }
    }

    public /* synthetic */ FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, u uVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, uVar, z10);
    }

    @oj.n
    @Nullable
    public static final FacebookRequestError b(@NotNull JSONObject jSONObject, @Nullable Object obj, @Nullable HttpURLConnection httpURLConnection) {
        return f98485o.a(jSONObject, obj, httpURLConnection);
    }

    @oj.n
    @NotNull
    public static final synchronized com.facebook.internal.p g() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return f98485o.b();
    }

    @Nullable
    public final Object c() {
        return this.f98501i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final a e() {
        return this.f98505m;
    }

    @Nullable
    public final HttpURLConnection f() {
        return this.f98502j;
    }

    public final int h() {
        return this.f98494b;
    }

    @Nullable
    public final String i() {
        String str = this.f98503k;
        if (str != null) {
            return str;
        }
        u uVar = this.f98504l;
        if (uVar == null) {
            return null;
        }
        return uVar.getLocalizedMessage();
    }

    @Nullable
    public final String j() {
        return this.f98506n;
    }

    @Nullable
    public final String k() {
        return this.f98496d;
    }

    @Nullable
    public final String l() {
        return this.f98498f;
    }

    @Nullable
    public final String m() {
        return this.f98497e;
    }

    @Nullable
    public final u n() {
        return this.f98504l;
    }

    @Nullable
    public final JSONObject o() {
        return this.f98500h;
    }

    @Nullable
    public final JSONObject p() {
        return this.f98499g;
    }

    public final int q() {
        return this.f98493a;
    }

    public final int r() {
        return this.f98495c;
    }

    @NotNull
    public String toString() {
        String str = "{HttpStatus: " + this.f98493a + ", errorCode: " + this.f98494b + ", subErrorCode: " + this.f98495c + ", errorType: " + this.f98496d + ", errorMessage: " + i() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f98493a);
        out.writeInt(this.f98494b);
        out.writeInt(this.f98495c);
        out.writeString(this.f98496d);
        out.writeString(i());
        out.writeString(this.f98497e);
        out.writeString(this.f98498f);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, u uVar, boolean z10) {
        a aVarC;
        this.f98493a = i10;
        this.f98494b = i11;
        this.f98495c = i12;
        this.f98496d = str;
        this.f98497e = str3;
        this.f98498f = str4;
        this.f98499g = jSONObject;
        this.f98500h = jSONObject2;
        this.f98501i = obj;
        this.f98502j = httpURLConnection;
        this.f98503k = str2;
        if (uVar != null) {
            this.f98504l = uVar;
            aVarC = a.OTHER;
        } else {
            this.f98504l = new j0(this, i());
            aVarC = f98485o.b().c(i11, i12, z10);
        }
        this.f98505m = aVarC;
        this.f98506n = f98485o.b().h(aVarC);
    }

    @l1(otherwise = 4)
    public FacebookRequestError(@Nullable HttpURLConnection httpURLConnection, @Nullable Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof u ? (u) exc : new u(exc), false);
    }

    public FacebookRequestError(int i10, @Nullable String str, @Nullable String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
