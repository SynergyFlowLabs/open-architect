package com.segment.analytics.kotlin.core.platform.policies;

import com.segment.analytics.kotlin.core.BaseEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f266929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private p2 f266930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f266931c;

    @f(c = "com.segment.analytics.kotlin.core.platform.policies.FrequencyFlushPolicy$schedule$1", f = "FrequencyFlushPolicy.kt", i = {0}, l = {30}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f266932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f266933b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.segment.analytics.kotlin.core.a f266935d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.segment.analytics.kotlin.core.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f266935d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = c.this.new a(this.f266935d, dVar);
            aVar.f266933b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            s0 s0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f266932a;
            if (i10 == 0) {
                ResultKt.m(obj);
                s0 s0Var2 = (s0) this.f266933b;
                if (c.this.e() > 0) {
                    s0Var = s0Var2;
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s0Var = (s0) this.f266933b;
            ResultKt.m(obj);
            while (t0.k(s0Var)) {
                this.f266935d.t();
                long jE = c.this.e();
                this.f266933b = s0Var;
                this.f266932a = 1;
                if (d1.b(jE, this) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c() {
        this(0L, 1, null);
        int i10 = 1 << 0;
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public boolean a() {
        return false;
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void b(@NotNull com.segment.analytics.kotlin.core.a analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        if (!this.f266931c) {
            this.f266931c = true;
            this.f266930b = k.f(analytics.c(), analytics.e(), null, new a(analytics, null), 2, null);
        }
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void c(@NotNull BaseEvent baseEvent) {
        b.a.d(this, baseEvent);
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void d() {
        if (this.f266931c) {
            this.f266931c = false;
            p2 p2Var = this.f266930b;
            if (p2Var != null) {
                p2.a.b(p2Var, null, 1, null);
            }
        }
    }

    public final long e() {
        return this.f266929a;
    }

    @Nullable
    public final p2 f() {
        return this.f266930b;
    }

    public final boolean g() {
        return this.f266931c;
    }

    public final void h(long j10) {
        this.f266929a = j10;
    }

    public final void i(@Nullable p2 p2Var) {
        this.f266930b = p2Var;
    }

    public final void j(boolean z10) {
        this.f266931c = z10;
    }

    @Override // com.segment.analytics.kotlin.core.platform.policies.b
    public void reset() {
        b.a.a(this);
    }

    public c(long j10) {
        this.f266929a = j10;
    }

    public /* synthetic */ c(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 30000L : j10);
    }
}
