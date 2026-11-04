package io.customer.datapipelines.plugins;

import androidx.annotation.l1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.o0;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements com.segment.analytics.kotlin.core.platform.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f288323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f288324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final o0 f288325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.customer.datapipelines.util.c f288326d;

    @SourceDebugExtension({"SMAP\nAutomaticApplicationLifecycleTrackingPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutomaticApplicationLifecycleTrackingPlugin.kt\nio/customer/datapipelines/plugins/AutomaticApplicationLifecycleTrackingPlugin$registerProcessLifecycleObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
    public static final class a implements DefaultLifecycleObserver {
        a() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(o0 owner) {
            Object objM785constructorimpl;
            Intrinsics.checkNotNullParameter(owner, "owner");
            try {
                Result.a aVar = Result.Companion;
                int i10 = 4 | 0;
                io.customer.sdk.l.J(io.customer.sdk.g.f288542m.d(), "Application Foregrounded", null, 2, null);
                objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            d dVar = d.this;
            if (Result.d(objM785constructorimpl) != null) {
                com.segment.analytics.kotlin.core.a.z0(dVar.j(), "Application Foregrounded", null, null, 6, null);
            }
        }
    }

    public d() {
        this(ProcessLifecycleOwner.f52139i.a(), new io.customer.datapipelines.util.c());
    }

    private final void m() {
        this.f288325c.getLifecycle().c(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(d dVar) {
        dVar.m();
        return Unit.f312394a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @Nullable
    public BaseEvent a(@NotNull BaseEvent baseEvent) {
        return com.segment.analytics.kotlin.core.platform.e.a.a(this, baseEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        com.segment.analytics.kotlin.core.platform.e.a.b(this, analytics);
        this.f288326d.b(new Function0() { // from class: io.customer.datapipelines.plugins.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.n(this.f288322a);
            }
        });
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f288323a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f288324b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f288324b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        int i10 = 1 >> 0;
        return null;
    }

    @l1
    public d(@NotNull o0 processLifecycleOwner, @NotNull io.customer.datapipelines.util.c uiThreadRunner) {
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        Intrinsics.checkNotNullParameter(uiThreadRunner, "uiThreadRunner");
        this.f288323a = com.segment.analytics.kotlin.core.platform.e.b.Utility;
        this.f288325c = processLifecycleOwner;
        this.f288326d = uiThreadRunner;
    }
}
