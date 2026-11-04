package com.planner5d.library.model.manager.push;

import android.os.Bundle;
import com.google.firebase.messaging.RemoteMessage;
import com.planner5d.library.model.manager.statistics.events.h3;
import com.planner5d.library.model.manager.statistics.events.u3;
import com.planner5d.library.services.r;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f193307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f193308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f193309c;

    public k(@NotNull RemoteMessage remoteMessage) {
        String string;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Bundle extras = remoteMessage.h3().getExtras();
        String strX8 = null;
        this.f193307a = extras != null ? extras.getString(r.link.f224891a) : null;
        this.f193308b = extras != null ? extras.getString(r.title.f224891a) : null;
        if (extras != null && (string = extras.getString("CIO-Delivery-Token")) != null) {
            strX8 = StringsKt.X8(string, 5);
        }
        this.f193309c = strX8;
    }

    private final h3 a(String str) {
        return new h3(u3.R3, MapsKt.mapOf(TuplesKt.to(r.action.f224891a, str), TuplesKt.to(r.token.f224891a, this.f193309c), TuplesKt.to(r.title.f224891a, this.f193308b), TuplesKt.to(r.link.f224891a, this.f193307a)), null);
    }

    @NotNull
    public final h3 b() {
        return a(io.sentry.protocol.j.b.f306354d);
    }

    @NotNull
    public final h3 c() {
        return a(MetricTracker.Action.RECEIVED);
    }
}
