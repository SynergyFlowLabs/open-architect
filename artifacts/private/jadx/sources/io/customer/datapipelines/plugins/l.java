package io.customer.datapipelines.plugins;

import com.segment.analytics.kotlin.core.AliasEvent;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.GroupEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.TrackEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements com.segment.analytics.kotlin.core.platform.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final tg.b f288341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f288342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f288343c;

    public l(@NotNull tg.b screenViewUse) {
        Intrinsics.checkNotNullParameter(screenViewUse, "screenViewUse");
        this.f288341a = screenViewUse;
        this.f288343c = com.segment.analytics.kotlin.core.platform.e.b.Enrichment;
    }

    @Override // com.segment.analytics.kotlin.core.platform.c, com.segment.analytics.kotlin.core.platform.e
    @Nullable
    public BaseEvent a(@NotNull BaseEvent baseEvent) {
        return com.segment.analytics.kotlin.core.platform.c.a.b(this, baseEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        com.segment.analytics.kotlin.core.platform.c.a.h(this, aVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f288343c;
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent d(@NotNull IdentifyEvent identifyEvent) {
        return com.segment.analytics.kotlin.core.platform.c.a.e(this, identifyEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f288342b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    public void flush() {
        com.segment.analytics.kotlin.core.platform.c.a.c(this);
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent g(@NotNull TrackEvent trackEvent) {
        return com.segment.analytics.kotlin.core.platform.c.a.i(this, trackEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent h(@NotNull ScreenEvent payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        tg.b bVar = this.f288341a;
        if (Intrinsics.areEqual(bVar, tg.b.a.f381048c)) {
            return payload;
        }
        if (Intrinsics.areEqual(bVar, tg.b.c.f381049c)) {
            return null;
        }
        throw new k0();
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.c.a.j(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f288342b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent k(@NotNull GroupEvent groupEvent) {
        return com.segment.analytics.kotlin.core.platform.c.a.d(this, groupEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent l(@NotNull AliasEvent aliasEvent) {
        return com.segment.analytics.kotlin.core.platform.c.a.a(this, aliasEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    public void reset() {
        com.segment.analytics.kotlin.core.platform.c.a.f(this);
    }
}
