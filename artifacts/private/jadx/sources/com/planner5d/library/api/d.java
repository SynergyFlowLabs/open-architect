package com.planner5d.library.api;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends com.planner5d.library.api.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f142250b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f142251a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final c a(Throwable th2) {
            Response<c> responseB;
            g0 g0VarErrorBody;
            String strString;
            e eVar = th2 instanceof e ? (e) th2 : null;
            if (eVar == null || (responseB = eVar.b()) == null || (g0VarErrorBody = responseB.errorBody()) == null || (strString = g0VarErrorBody.string()) == null) {
                return null;
            }
            try {
                return new c(new JSONObject(strString));
            } catch (JSONException unused) {
                timber.log.b.f381052a.f(th2, "Failed to extract Response from RetrofitError", new Object[0]);
                return null;
            }
        }

        @oj.n
        @Nullable
        public final c b(@Nullable Throwable th2) {
            c cVarB;
            Throwable cause = th2 != null ? th2.getCause() : null;
            d dVar = cause instanceof d ? (d) cause : null;
            return (dVar == null || (cVarB = dVar.b()) == null) ? a(th2) : cVarB;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull c response) {
        super(response.f());
        Intrinsics.checkNotNullParameter(response, "response");
        this.f142251a = response;
    }

    @oj.n
    @Nullable
    public static final c a(@Nullable Throwable th2) {
        return f142250b.b(th2);
    }

    @NotNull
    public final c b() {
        return this.f142251a;
    }
}
