package com.planner5d.library.model.manager.statistics.events;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f216964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f216965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, Object> f216966c;

    public h3(@NotNull a name, @NotNull Map<String, ? extends Object> parameters, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f216964a = name;
        this.f216965b = parameters;
        this.f216966c = map;
    }

    @Nullable
    public final Map<String, Object> a() {
        return this.f216966c;
    }

    @NotNull
    public final a b() {
        return this.f216964a;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.f216965b;
    }

    @NotNull
    public final JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(com.planner5d.library.services.r.eventName.f224891a, this.f216964a.n());
        String str = com.planner5d.library.services.r.parameters.f224891a;
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : this.f216965b.keySet()) {
            Object obj = this.f216965b.get(str2);
            if (obj instanceof Boolean) {
                jSONObject2.put(str2, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                jSONObject2.put(str2, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                jSONObject2.put(str2, ((Number) obj).longValue());
            } else if (obj instanceof Double) {
                jSONObject2.put(str2, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                jSONObject2.put(str2, ((Number) obj).floatValue());
            } else {
                jSONObject2.put(str2, obj != null ? obj.toString() : null);
            }
        }
        Unit unit = Unit.f312394a;
        jSONObject.put(str, jSONObject2);
        return jSONObject;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h3(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        u3.a aVar = u3.f217523d;
        String string = json.getString(com.planner5d.library.services.r.eventName.f224891a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a aVarA = aVar.a(string);
        com.planner5d.library.services.utility.k1 k1Var = com.planner5d.library.services.utility.k1.f225294a;
        JSONObject jSONObject = json.getJSONObject(com.planner5d.library.services.r.parameters.f224891a);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        this(aVarA, k1Var.H(jSONObject), null);
    }
}
