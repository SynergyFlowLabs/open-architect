package com.planner5d.library.activity.fragment.smartwizard.decorator;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.r;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class k implements pe.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f135442b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k0<Pair<com.planner5d.library.activity.fragment.smartwizard.b, JSONObject>> f135443a;

    public k(@NotNull k0<Pair<com.planner5d.library.activity.fragment.smartwizard.b, JSONObject>> publisher) {
        Intrinsics.checkNotNullParameter(publisher, "publisher");
        this.f135443a = publisher;
    }

    private final JSONObject e(JSONObject jSONObject) {
        if (jSONObject.has("project")) {
            return jSONObject.getJSONObject("project");
        }
        return null;
    }

    @Override // pe.e
    public void a(@Nullable JSONObject jSONObject) {
        this.f135443a.setValue(TuplesKt.to(com.planner5d.library.activity.fragment.smartwizard.b.ConnectedWaitingForData, null));
    }

    @Override // pe.e
    public void b(@Nullable JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObjectE;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(r.rabbitMQData.f224891a)) == null || (jSONObjectE = e(jSONObject2)) == null) {
            return;
        }
        this.f135443a.setValue(TuplesKt.to(com.planner5d.library.activity.fragment.smartwizard.b.LoadedData, jSONObjectE));
    }

    @Override // pe.e
    public void c(@Nullable JSONObject jSONObject) {
        this.f135443a.setValue(TuplesKt.to(com.planner5d.library.activity.fragment.smartwizard.b.Finished, null));
    }

    @Override // pe.e
    public void d(@Nullable JSONObject jSONObject) {
        this.f135443a.setValue(TuplesKt.to(com.planner5d.library.activity.fragment.smartwizard.b.Error, null));
        timber.log.b.f381052a.d("Error with data:" + jSONObject, new Object[0]);
    }
}
