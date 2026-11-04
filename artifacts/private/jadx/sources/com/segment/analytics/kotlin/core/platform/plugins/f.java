package com.segment.analytics.kotlin.core.platform.plugins;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.v;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.n;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements com.segment.analytics.kotlin.core.platform.e, sovran.kotlin.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f266918b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f266917a = com.segment.analytics.kotlin.core.platform.e.b.Before;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f266919c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f266920d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Queue<BaseEvent> f266921e = new ConcurrentLinkedQueue();

    @kotlin.coroutines.jvm.internal.f(c = "com.segment.analytics.kotlin.core.platform.plugins.StartupQueue$setup$1$1", f = "StartupQueue.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.segment.analytics.kotlin.core.a f266923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f266924c;

        /* JADX INFO: renamed from: com.segment.analytics.kotlin.core.platform.plugins.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1868a extends kotlin.jvm.internal.a implements Function2<v, kotlin.coroutines.d<? super Unit>, Object>, n {
            C1868a(Object obj) {
                super(2, obj, f.class, "runningUpdate", "runningUpdate(Lcom/segment/analytics/kotlin/core/System;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull v vVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                return a.m((f) this.receiver, vVar, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.segment.analytics.kotlin.core.a aVar, f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f266923b = aVar;
            this.f266924c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(f fVar, v vVar, kotlin.coroutines.d dVar) {
            fVar.n(vVar);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f266923b, this.f266924c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266922a;
            if (i10 == 0) {
                ResultKt.m(obj);
                sovran.kotlin.e eVarA = this.f266923b.a();
                f fVar = this.f266924c;
                kotlin.reflect.d dVarD = j1.d(v.class);
                C1868a c1868a = new C1868a(this.f266924c);
                this.f266922a = 1;
                if (sovran.kotlin.e.s(eVarA, fVar, dVarD, true, null, c1868a, this, 8, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private final void m() {
        while (!this.f266921e.isEmpty()) {
            BaseEvent baseEventPoll = this.f266921e.poll();
            if (baseEventPoll != null) {
                j().Y(baseEventPoll, baseEventPoll.f());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(v vVar) {
        int i10 = 5 << 2;
        vf.e.c(j(), "Analytics starting = " + vVar.k(), null, 2, null);
        this.f266920d.set(vVar.k());
        if (this.f266920d.get()) {
            m();
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @Nullable
    public BaseEvent a(@NotNull BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f266920d.get()) {
            return event;
        }
        vf.e.c(j(), "SegmentStartupQueue queueing event", null, 2, null);
        if (this.f266921e.size() >= this.f266919c) {
            this.f266921e.remove();
        }
        this.f266921e.offer(event);
        return null;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        com.segment.analytics.kotlin.core.platform.e.a.b(this, analytics);
        k.f(analytics.c(), analytics.d(), null, new a(analytics, this, null), 2, null);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f266917a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f266918b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c cVar) {
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, cVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f266918b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }
}
