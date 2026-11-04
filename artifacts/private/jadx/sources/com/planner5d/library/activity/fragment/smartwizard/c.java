package com.planner5d.library.activity.fragment.smartwizard;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.a4;
import com.planner5d.library.model.manager.statistics.events.p2;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class c implements pe.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f135385d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b2 f135386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k0<Pair<b, JSONObject>> f135387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a4.e f135388c;

    public c(@NotNull b2 messageManager, @NotNull k0<Pair<b, JSONObject>> publisher, @NotNull a4.e statisticsSource) {
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(publisher, "publisher");
        Intrinsics.checkNotNullParameter(statisticsSource, "statisticsSource");
        this.f135386a = messageManager;
        this.f135387b = publisher;
        this.f135388c = statisticsSource;
    }

    private final JSONObject e(JSONObject jSONObject) {
        if (jSONObject.has("room")) {
            return jSONObject.getJSONObject("room");
        }
        return null;
    }

    @Override // pe.e
    public void a(@Nullable JSONObject jSONObject) {
        this.f135387b.setValue(TuplesKt.to(b.ConnectedWaitingForData, null));
    }

    @Override // pe.e
    public void b(@Nullable JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObjectE;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(com.planner5d.library.services.r.rabbitMQData.f224891a)) == null || (jSONObjectE = e(jSONObject2)) == null) {
            return;
        }
        this.f135387b.setValue(TuplesKt.to(b.LoadedData, jSONObjectE));
    }

    @Override // pe.e
    public void c(@Nullable JSONObject jSONObject) {
        this.f135387b.setValue(TuplesKt.to(b.Finished, null));
        if (jSONObject != null && jSONObject.getInt(com.planner5d.library.services.r.rabbitMQMessageCount.f224891a) < 1) {
            p2.f217307b.w0(a4.f.room_wizard_style, this.f135388c, a4.c.no_result);
            this.f135386a.b(com.planner5d.library.f.s.lC, new Object[0]);
        }
    }

    @Override // pe.e
    public void d(@Nullable JSONObject jSONObject) {
        this.f135387b.setValue(TuplesKt.to(b.Error, null));
        timber.log.b.f381052a.d("Error with data:" + jSONObject, new Object[0]);
    }
}
