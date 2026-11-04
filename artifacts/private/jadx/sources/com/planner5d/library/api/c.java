package com.planner5d.library.api;

import com.planner5d.library.services.utility.k1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\ncom/planner5d/library/api/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f142243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final JSONArray f142244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f142245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f142246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Integer f142247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f142248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f142249g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull JSONObject body) throws JSONException {
        this(body, (JSONArray) null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    private final boolean j() {
        String str;
        int i10 = this.f142245c;
        if (i10 != 403) {
            return i10 == 401;
        }
        if (Intrinsics.areEqual(this.f142248f, "forbidden_not_authenticated") || (str = this.f142246d) == null || StringsKt.V2(str, "Authorization error", false, 2, null) || StringsKt.V2(this.f142246d, "Forbidden", false, 2, null)) {
            return true;
        }
        String str2 = this.f142246d;
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode == -886456451) {
                if (!str2.equals("Auth is required")) {
                }
                return true;
            }
            if (iHashCode == 0) {
                if (!str2.equals("")) {
                }
                return true;
            }
            if (iHashCode == 1749573703 && str2.equals("Invalid user id")) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final JSONObject a() {
        return this.f142243a;
    }

    @NotNull
    public final JSONArray b() {
        return this.f142244b;
    }

    public final int c() {
        return this.f142245c;
    }

    @Nullable
    public final String d() {
        return this.f142249g;
    }

    @Nullable
    public final Integer e() {
        return this.f142247e;
    }

    @Nullable
    public final String f() {
        return this.f142246d;
    }

    @Nullable
    public final String g() {
        return this.f142248f;
    }

    public final boolean h() {
        return this.f142245c > 0;
    }

    public final boolean i(@NotNull com.planner5d.library.modules.user.user.w userAuthorization) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        return userAuthorization.b() && j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull JSONArray body) throws JSONException {
        this((JSONObject) null, body);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    public c(@NotNull Throwable exception, int i10) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f142243a = new JSONObject();
        this.f142244b = new JSONArray();
        this.f142245c = i10;
        this.f142246d = exception.toString();
        this.f142247e = null;
        this.f142248f = null;
        this.f142249g = null;
    }

    private c(JSONObject jSONObject, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject2 = jSONArray == null ? null : new JSONObject();
        if (jSONObject2 != null) {
            jSONObject = jSONObject2;
        } else if (jSONObject == null) {
            jSONObject = new JSONObject("{\"error\":505050,\"errorMessage\":\"Null json\"}");
        }
        this.f142243a = jSONObject;
        this.f142244b = jSONArray == null ? new JSONArray() : jSONArray;
        this.f142245c = k1.n(jSONObject, "error", 0);
        this.f142246d = k1.z(jSONObject, "errorMessage", null, 4, null);
        this.f142247e = k1.q(jSONObject, "errorCode");
        this.f142248f = k1.z(jSONObject, "errorName", null, 4, null);
        this.f142249g = k1.z(jSONObject, "errorCategory", null, 4, null);
    }
}
