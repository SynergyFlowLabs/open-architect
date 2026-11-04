package com.segment.analytics.kotlin.core.platform;

import com.segment.analytics.kotlin.core.AliasEvent;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.GroupEvent;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.TrackEvent;
import com.segment.analytics.kotlin.core.utilities.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.k0;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f266841c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e.b f266839a = e.b.Destination;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f266840b = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f266842d = true;

    /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.platform.a$a, reason: collision with other inner class name */
    static final class C1864a extends l0 implements Function1<e, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Settings f266843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.c f266844b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1864a(Settings settings, e.c cVar) {
            super(1);
            this.f266843a = settings;
            this.f266844b = cVar;
        }

        public final void c(@NotNull e it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.i(this.f266843a, this.f266844b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
            c(eVar);
            return Unit.f312394a;
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.c, com.segment.analytics.kotlin.core.platform.e
    @Nullable
    public final BaseEvent a(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return q(event);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        c.a.h(this, analytics);
        this.f266840b.l(analytics);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public e.b c() {
        return this.f266839a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent d(@NotNull IdentifyEvent identifyEvent) {
        return c.a.e(this, identifyEvent);
    }

    public final void e(@NotNull e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        plugin.f(j());
        this.f266840b.a(plugin);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f266841c = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    public void flush() {
        c.a.c(this);
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent g(@NotNull TrackEvent trackEvent) {
        return c.a.i(this, trackEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent h(@NotNull ScreenEvent screenEvent) {
        return c.a.g(this, screenEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull e.c type) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f266842d = settings.q(this);
        this.f266840b.b(new C1864a(settings, type));
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f266841c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent k(@NotNull GroupEvent groupEvent) {
        return c.a.d(this, groupEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    @Nullable
    public BaseEvent l(@NotNull AliasEvent aliasEvent) {
        return c.a.a(this, aliasEvent);
    }

    @NotNull
    public final <T extends e> List<T> m(@NotNull kotlin.reflect.d<T> pluginClass) {
        Intrinsics.checkNotNullParameter(pluginClass, "pluginClass");
        return this.f266840b.g(pluginClass);
    }

    public final boolean n() {
        return this.f266842d;
    }

    @NotNull
    public abstract String o();

    public final boolean p(@Nullable BaseEvent baseEvent) {
        JsonObject jsonObjectG;
        Boolean boolA;
        return this.f266842d && ((baseEvent == null || (jsonObjectG = baseEvent.g()) == null || (boolA = o.a(jsonObjectG, o())) == null) ? true : boolA.booleanValue());
    }

    @Nullable
    public final BaseEvent q(@Nullable BaseEvent baseEvent) {
        BaseEvent baseEventL;
        BaseEvent baseEvent2 = null;
        if (!p(baseEvent)) {
            return null;
        }
        BaseEvent baseEventD = this.f266840b.d(e.b.Enrichment, this.f266840b.d(e.b.Before, baseEvent));
        if (baseEventD != null) {
            if (baseEventD instanceof IdentifyEvent) {
                baseEventL = d((IdentifyEvent) baseEventD);
            } else if (baseEventD instanceof TrackEvent) {
                baseEventL = g((TrackEvent) baseEventD);
            } else if (baseEventD instanceof GroupEvent) {
                baseEventL = k((GroupEvent) baseEventD);
            } else if (baseEventD instanceof ScreenEvent) {
                baseEventL = h((ScreenEvent) baseEventD);
            } else {
                if (!(baseEventD instanceof AliasEvent)) {
                    throw new k0();
                }
                baseEventL = l((AliasEvent) baseEventD);
            }
            baseEvent2 = baseEventL;
        }
        return this.f266840b.d(e.b.After, baseEvent2);
    }

    public final void r(@NotNull e plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.f266840b.k(plugin);
    }

    @Override // com.segment.analytics.kotlin.core.platform.c
    public void reset() {
        c.a.f(this);
    }

    public final void s(boolean z10) {
        this.f266842d = z10;
    }
}
