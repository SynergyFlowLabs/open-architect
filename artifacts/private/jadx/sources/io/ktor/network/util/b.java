package io.ktor.network.util;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.h4;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f296373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f296374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Long> f296375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final s0 f296376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f296377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private p2 f296378f;

    @NotNull
    volatile /* synthetic */ int isStarted;

    @NotNull
    volatile /* synthetic */ long lastActivityTime;

    @f(c = "io.ktor.network.util.Timeout$initTimeoutJob$1", f = "Utils.kt", i = {}, l = {55, com.planner5d.library.engine.input.f.b.f160707m, com.planner5d.library.engine.input.f.b.f160710n}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296379a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0093 A[EDGE_INSN: B:27:0x0093->B:31:0x009e BREAK  A[LOOP:0: B:15:0x002d->B:39:?]] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            Function1 function1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296379a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.m(obj);
                    } else if (i10 == 2) {
                        ResultKt.m(obj);
                        function1 = b.this.f296377e;
                        this.f296379a = 3;
                        if (function1.invoke(this) == objL) {
                            break;
                            return objL;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    return Unit.f312394a;
                }
                ResultKt.m(obj);
                do {
                    if (b.this.isStarted == 0) {
                        b bVar = b.this;
                        bVar.lastActivityTime = ((Number) bVar.f296375c.invoke()).longValue();
                    }
                    jLongValue = (b.this.lastActivityTime + b.this.f296374b) - ((Number) b.this.f296375c.invoke()).longValue();
                    if (jLongValue <= 0 && b.this.isStarted != 0) {
                        this.f296379a = 2;
                        if (h4.a(this) == objL) {
                            break;
                        }
                        function1 = b.this.f296377e;
                        this.f296379a = 3;
                        if (function1.invoke(this) == objL) {
                            break;
                        }
                        return Unit.f312394a;
                    }
                    this.f296379a = 1;
                } while (d1.b(jLongValue, this) != objL);
                return objL;
            } catch (Throwable unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull String name, long j10, @NotNull Function0<Long> clock, @NotNull s0 scope, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> onTimeout) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
        this.f296373a = name;
        this.f296374b = j10;
        this.f296375c = clock;
        this.f296376d = scope;
        this.f296377e = onTimeout;
        this.lastActivityTime = 0L;
        int i10 = 2 ^ 0;
        this.isStarted = 0;
        this.f296378f = e();
    }

    private final p2 e() {
        if (this.f296374b == Long.MAX_VALUE) {
            return null;
        }
        s0 s0Var = this.f296376d;
        int i10 = 0 | 2;
        return k.f(s0Var, s0Var.getCoroutineContext().plus(new r0("Timeout " + this.f296373a)), null, new a(null), 2, null);
    }

    public final void d() {
        p2 p2Var = this.f296378f;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
    }

    public final void f() {
        this.lastActivityTime = this.f296375c.invoke().longValue();
        this.isStarted = 1;
    }

    public final void g() {
        this.isStarted = 0;
    }
}
