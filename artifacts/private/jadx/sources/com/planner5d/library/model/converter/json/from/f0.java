package com.planner5d.library.model.converter.json.from;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class f0 implements ib.a<a, id.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f180586b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final jb.a f180587a = new jb.a();

    @Override // ib.a
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public id.a convert(@NotNull a from) throws JSONException {
        Intrinsics.checkNotNullParameter(from, "from");
        JSONObject jSONObjectA = from.a();
        id.a aVarB = from.b();
        if (aVarB == null) {
            k1 k1Var = k1.f225294a;
            Intrinsics.checkNotNull(jSONObjectA);
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.uid;
            if (!k1Var.B(jSONObjectA, rVar)) {
                throw new JSONException("Missing user id");
            }
            aVarB = new id.a(jSONObjectA.getLong(rVar.f224891a));
        } else {
            Intrinsics.checkNotNull(jSONObjectA);
            Long lV = k1.v(jSONObjectA, com.planner5d.library.services.r.uid);
            long j10 = aVarB.f287075a;
            if (lV == null || lV.longValue() != j10) {
                throw new JSONException("Invalid user id");
            }
        }
        aVarB.f287076b = k1.y(jSONObjectA, com.planner5d.library.services.r.uName, null, 4, null);
        aVarB.f287079e = k1.y(jSONObjectA, com.planner5d.library.services.r.email, null, 4, null);
        k1 k1Var2 = k1.f225294a;
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.filled;
        if (k1Var2.B(jSONObjectA, rVar2)) {
            aVarB.f287082h = Boolean.valueOf(k1.a(jSONObjectA, rVar2));
        }
        if (aVarB.f287077c == null || k1Var2.B(jSONObjectA, com.planner5d.library.services.r.hash)) {
            aVarB.f287077c = k1.y(jSONObjectA, com.planner5d.library.services.r.hash, null, 4, null);
        }
        if (aVarB.f287078d == null) {
            com.planner5d.library.services.r rVar3 = com.planner5d.library.services.r.supportHash;
            if (k1Var2.B(jSONObjectA, rVar3)) {
                aVarB.f287078d = k1.y(jSONObjectA.getJSONObject(rVar3.f224891a), com.planner5d.library.services.r.android, null, 4, null);
            }
        }
        String strConvert = this.f180587a.convert(jSONObjectA);
        if (strConvert != null) {
            aVarB.f287080f = strConvert;
        }
        aVarB.f287083i = k1.e(jSONObjectA, com.planner5d.library.services.r.isCommercialAccount, null, 4, null);
        aVarB.f287084j = k1.e(jSONObjectA, com.planner5d.library.services.r.isTester, null, 4, null);
        aVarB.f287086l = Boolean.valueOf(k1.a(jSONObjectA, com.planner5d.library.services.r.hasPassword));
        return aVarB;
    }

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f180588c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final id.a f180589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f180590b;

        public a(@NotNull JSONObject json, @Nullable id.a aVar) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            this.f180589a = aVar;
            k1 k1Var = k1.f225294a;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.info;
            if (k1Var.B(json, rVar) && !k1Var.B(json, com.planner5d.library.services.r.uid)) {
                json = json.getJSONObject(rVar.f224891a);
            }
            this.f180590b = json;
        }

        public final JSONObject a() {
            return this.f180590b;
        }

        @Nullable
        public final id.a b() {
            return this.f180589a;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull com.planner5d.library.api.c response, @Nullable id.a aVar) {
            this(response.a(), aVar);
            Intrinsics.checkNotNullParameter(response, "response");
        }
    }
}
