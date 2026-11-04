package com.planner5d.library.model.manager.statistics.debug;

import android.app.Activity;
import android.content.Intent;
import com.planner5d.library.model.manager.statistics.events.h3;
import com.planner5d.library.model.manager.statistics.g0;
import com.planner5d.library.model.manager.statistics.j;
import com.planner5d.library.model.manager.statistics.m;
import ij.f;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@f
public final class c implements m {
    @ij.a
    public c() {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void a() {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void b(@NotNull g0 user) {
        String str;
        Intrinsics.checkNotNullParameter(user, "user");
        if (user instanceof g0.a) {
            str = "0 (anonymous)";
        } else {
            if (!(user instanceof g0.b)) {
                throw new k0();
            }
            str = ((g0.b) user).a() + " (authenticated)";
        }
        timber.log.b.f381052a.k("Analytics - user changed to #" + str, new Object[0]);
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void c(@Nullable Intent intent) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void d(@Nullable h3 h3Var) throws JSONException {
        Map<String, Object> mapC;
        if (h3Var == null || (mapC = h3Var.c()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : mapC.keySet()) {
            Object obj = mapC.get(str);
            if (obj instanceof Boolean) {
                jSONObject.put(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                jSONObject.put(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                jSONObject.put(str, (int) ((Number) obj).longValue());
            } else if (obj instanceof Double) {
                jSONObject.put(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                jSONObject.put(str, ((Number) obj).floatValue());
            } else {
                jSONObject.put(str, obj != null ? obj.toString() : null);
            }
        }
        timber.log.b.f381052a.k("Analytics - event " + h3Var.b().n() + ": " + jSONObject, new Object[0]);
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void e(@Nullable Activity activity) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void f(@Nullable Activity activity) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void g(@Nullable Activity activity, @NotNull j purchase, @NotNull String paymentMethod, @NotNull String placement) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(placement, "placement");
        timber.log.b.f381052a.k("Analytics - purchase #" + purchase.q() + " " + purchase.p() + " " + paymentMethod, new Object[0]);
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void h(@Nullable String str) {
        timber.log.b.f381052a.k("Analytics - screen " + str, new Object[0]);
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void i(@Nullable Activity activity) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public boolean isEnabled() {
        return false;
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void k(@Nullable Activity activity) {
    }

    @Override // com.planner5d.library.model.manager.statistics.m
    public void m() {
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object l() {
        Result.a aVar = Result.Companion;
        return Result.m785constructorimpl(null);
    }
}
