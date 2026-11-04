package com.planner5d.library.model.manager.config;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f181534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f181535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final JSONObject f181536c;

    public g(@Nullable Boolean bool, @Nullable Integer num, @Nullable JSONObject jSONObject) {
        this.f181534a = bool;
        this.f181535b = num;
        this.f181536c = jSONObject;
    }

    @NotNull
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("enabled", this.f181534a).put("priority", this.f181535b).put("value", this.f181536c);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    @Nullable
    public final Boolean b() {
        return this.f181534a;
    }

    @Nullable
    public final Integer c() {
        return this.f181535b;
    }

    @Nullable
    public final JSONObject d() {
        return this.f181536c;
    }

    public g(boolean z10) {
        this(Boolean.valueOf(z10), null, null);
    }

    public g(boolean z10, int i10) {
        this(Boolean.valueOf(z10), Integer.valueOf(i10), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(@NotNull JSONObject json) {
        Boolean boolValueOf;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = null;
        if (!json.has("enabled") || json.isNull("enabled")) {
            boolValueOf = null;
        } else {
            try {
                boolValueOf = Boolean.valueOf(json.getBoolean("enabled"));
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
                boolValueOf = null;
            }
        }
        if (!json.has("priority") || json.isNull("priority")) {
            numValueOf = null;
        } else {
            try {
                numValueOf = Integer.valueOf(json.getInt("priority"));
            } catch (Throwable th3) {
                timber.log.b.f381052a.e(th3);
                numValueOf = null;
            }
        }
        if (json.has("value") && !json.isNull("value")) {
            try {
                jSONObject = json.getJSONObject("value");
            } catch (Throwable th4) {
                timber.log.b.f381052a.e(th4);
            }
        }
        this(boolValueOf, numValueOf, jSONObject);
    }
}
