package com.planner5d.library.model.manager.statistics;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.model.manager.statistics.events.h3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.statistics.events.u3;
import com.planner5d.library.services.utility.c3;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@ij.f
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f217773c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f217774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, r3.i> f217775b;

    @ij.a
    public g(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f217774a = application;
        Pair pair = TuplesKt.to("projects_pages", r3.i.projects);
        Pair pair2 = TuplesKt.to("contest_pages", r3.i.design_battle);
        r3.i iVar = r3.i.paywall;
        this.f217775b = MapsKt.mapOf(pair, pair2, TuplesKt.to("purchase_green", iVar), TuplesKt.to(FirebaseAnalytics.c.D, iVar), TuplesKt.to("superwall_purchase_controller", iVar), TuplesKt.to("project2_d", r3.i.project2d), TuplesKt.to("project3_d", r3.i.project3d));
    }

    private final String b(String str) {
        String strName;
        String strX5 = StringsKt.x5(StringsKt.k2(StringsKt.k2(str, "_fragment", "", false, 4, null), "_dialog", "", false, 4, null), ":", null, 2, null);
        r3.i iVar = this.f217775b.get(strX5);
        return (iVar == null || (strName = iVar.name()) == null) ? strX5 : strName;
    }

    @NotNull
    public final h3 a(@NotNull String screenName) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        return new h3(u3.O4, MapsKt.mapOf(TuplesKt.to("name", b(c3.f225174a.b(screenName))), TuplesKt.to(io.sentry.protocol.e.c.f306223k, com.planner5d.library.services.utility.h3.W(this.f217774a) ? "portrait" : "landscape")), null);
    }
}
