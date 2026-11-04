package com.segment.analytics.kotlin.core.platform.plugins;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.EventType;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.Settings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements com.segment.analytics.kotlin.core.platform.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f266925a = com.segment.analytics.kotlin.core.platform.e.b.Before;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f266926b;

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public BaseEvent a(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.j() == EventType.Identify) {
            j().y().k(event.k());
            j().y().i(event.d());
            j().y().j(((IdentifyEvent) event).z());
            return event;
        }
        if (event.j() == EventType.Alias) {
            j().y().i(event.d());
            return event;
        }
        if (j().y().h() != null) {
            event.t(String.valueOf(j().y().h()));
        }
        if (j().y().f() != null) {
            event.m(j().y().f().toString());
        }
        return event;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        com.segment.analytics.kotlin.core.platform.e.a.b(this, aVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f266925a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f266926b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f266926b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }
}
