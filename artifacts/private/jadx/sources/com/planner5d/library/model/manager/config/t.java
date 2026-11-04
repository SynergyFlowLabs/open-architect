package com.planner5d.library.model.manager.config;

import com.planner5d.library.services.utility.k1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f190888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f190889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final u f190890c;

    public t(int i10, @Nullable String str, @Nullable u uVar) {
        this.f190888a = i10;
        this.f190889b = str;
        this.f190890c = uVar;
    }

    public final int a() {
        return this.f190888a;
    }

    @Nullable
    public final String b() {
        return this.f190889b;
    }

    @Nullable
    public final u c() {
        return this.f190890c;
    }

    public t(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        int i10 = json.getInt(com.planner5d.library.services.r.id.f224891a);
        u uVar = null;
        String strY = k1.y(json, com.planner5d.library.services.r.type, null, 4, null);
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.uris;
        if (json.has(rVar.f224891a) && !json.isNull(rVar.f224891a)) {
            try {
                JSONObject jSONObject = json.getJSONObject(rVar.f224891a);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                uVar = new u(jSONObject);
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
        }
        this(i10, strY, uVar);
    }
}
