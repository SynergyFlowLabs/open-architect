package io.customer.datapipelines.plugins;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements com.segment.analytics.kotlin.core.platform.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.customer.sdk.data.store.h f288329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f288330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f288331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f288332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private volatile String f288333e;

    public f(@NotNull io.customer.sdk.data.store.h deviceStore, @NotNull g eventProcessor) {
        Intrinsics.checkNotNullParameter(deviceStore, "deviceStore");
        Intrinsics.checkNotNullParameter(eventProcessor, "eventProcessor");
        this.f288329a = deviceStore;
        this.f288330b = eventProcessor;
        this.f288331c = com.segment.analytics.kotlin.core.platform.e.b.Before;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(f fVar) {
        return fVar.f288333e;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public BaseEvent a(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f288330b.a(event, this.f288329a, new Function0() { // from class: io.customer.datapipelines.plugins.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.m(this.f288328a);
            }
        });
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        com.segment.analytics.kotlin.core.platform.e.a.b(this, aVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f288331c;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f288332d = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f288332d;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @Nullable
    public final String n() {
        return this.f288333e;
    }

    public final void o(@Nullable String str) {
        this.f288333e = str;
    }

    public /* synthetic */ f(io.customer.sdk.data.store.h hVar, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i10 & 2) != 0 ? new j() : gVar);
    }
}
