package io.ktor.util.pipeline;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class p<TSubject, TContext> extends e<TSubject, TContext> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> f296788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<Unit> f296789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private TSubject f296790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<TSubject>[] f296791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f296792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f296793g;

    public static final class a implements kotlin.coroutines.d<Unit>, kotlin.coroutines.jvm.internal.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f296794a = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<TSubject, TContext> f296795b;

        a(p<TSubject, TContext> pVar) {
            this.f296795b = pVar;
        }

        private final kotlin.coroutines.d<?> b() {
            if (this.f296794a == Integer.MIN_VALUE) {
                this.f296794a = ((p) this.f296795b).f296792f;
            }
            if (this.f296794a < 0) {
                this.f296794a = Integer.MIN_VALUE;
                return null;
            }
            try {
                kotlin.coroutines.d<?>[] dVarArr = ((p) this.f296795b).f296791e;
                int i10 = this.f296794a;
                kotlin.coroutines.d<?> dVar = dVarArr[i10];
                if (dVar == null) {
                    return o.f296787a;
                }
                this.f296794a = i10 - 1;
                return dVar;
            } catch (Throwable unused) {
                return o.f296787a;
            }
        }

        public final int a() {
            return this.f296794a;
        }

        public final void d(int i10) {
            this.f296794a = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.e
        public kotlin.coroutines.jvm.internal.e getCallerFrame() {
            kotlin.coroutines.d<?> dVarB = b();
            if (dVarB instanceof kotlin.coroutines.jvm.internal.e) {
                return (kotlin.coroutines.jvm.internal.e) dVarB;
            }
            return null;
        }

        @Override // kotlin.coroutines.d
        public CoroutineContext getContext() {
            kotlin.coroutines.d dVar = ((p) this.f296795b).f296791e[((p) this.f296795b).f296792f];
            if (dVar != this && dVar != null) {
                return dVar.getContext();
            }
            int i10 = ((p) this.f296795b).f296792f - 1;
            while (i10 >= 0) {
                int i11 = i10 - 1;
                kotlin.coroutines.d dVar2 = ((p) this.f296795b).f296791e[i10];
                if (dVar2 != this && dVar2 != null) {
                    return dVar2.getContext();
                }
                i10 = i11;
            }
            throw new IllegalStateException("Not started");
        }

        @Override // kotlin.coroutines.jvm.internal.e
        public StackTraceElement getStackTraceElement() {
            return null;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(Object obj) {
            if (!Result.m786isFailureimpl(obj)) {
                this.f296795b.u(false);
                return;
            }
            p<TSubject, TContext> pVar = this.f296795b;
            Result.a aVar = Result.Companion;
            Throwable thD = Result.d(obj);
            Intrinsics.checkNotNull(thD);
            pVar.v(Result.m785constructorimpl(ResultKt.createFailure(thD)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull TSubject initial, @NotNull TContext context, @NotNull List<? extends pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> blocks) {
        super(context);
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f296788b = blocks;
        this.f296789c = new a(this);
        this.f296790d = initial;
        this.f296791e = new kotlin.coroutines.d[blocks.size()];
        this.f296792f = -1;
    }

    private final void r() {
        int i10 = this.f296792f;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        kotlin.coroutines.d<TSubject>[] dVarArr = this.f296791e;
        this.f296792f = i10 - 1;
        dVarArr[i10] = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(boolean z10) {
        int i10;
        do {
            i10 = this.f296793g;
            if (i10 == this.f296788b.size()) {
                if (z10) {
                    return true;
                }
                Result.a aVar = Result.Companion;
                v(Result.m785constructorimpl(i()));
                return false;
            }
            this.f296793g = i10 + 1;
            try {
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                v(Result.m785constructorimpl(ResultKt.createFailure(th2)));
                return false;
            }
        } while (h.a(this.f296788b.get(i10), this, i(), this.f296789c) != kotlin.coroutines.intrinsics.b.l());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Object obj) {
        int i10 = this.f296792f;
        if (i10 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        kotlin.coroutines.d<TSubject> dVar = this.f296791e[i10];
        Intrinsics.checkNotNull(dVar);
        kotlin.coroutines.d<TSubject>[] dVarArr = this.f296791e;
        int i11 = this.f296792f;
        this.f296792f = i11 - 1;
        dVarArr[i11] = null;
        if (!Result.m786isFailureimpl(obj)) {
            dVar.resumeWith(obj);
            return;
        }
        Throwable thD = Result.d(obj);
        Intrinsics.checkNotNull(thD);
        Throwable thA = m.a(thD, dVar);
        Result.a aVar = Result.Companion;
        dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(thA)));
    }

    @Override // io.ktor.util.pipeline.e
    @Nullable
    public Object c(@NotNull TSubject tsubject, @NotNull kotlin.coroutines.d<? super TSubject> dVar) {
        this.f296793g = 0;
        if (this.f296788b.size() == 0) {
            return tsubject;
        }
        l(tsubject);
        if (this.f296792f < 0) {
            return j(dVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // io.ktor.util.pipeline.e
    public void e() {
        this.f296793g = this.f296788b.size();
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f296789c.getContext();
    }

    @Override // io.ktor.util.pipeline.e
    @NotNull
    public TSubject i() {
        return this.f296790d;
    }

    @Override // io.ktor.util.pipeline.e
    @Nullable
    public Object j(@NotNull kotlin.coroutines.d<? super TSubject> dVar) {
        Object objL;
        if (this.f296793g == this.f296788b.size()) {
            objL = i();
        } else {
            q(kotlin.coroutines.intrinsics.b.e(dVar));
            if (u(true)) {
                r();
                objL = i();
            } else {
                objL = kotlin.coroutines.intrinsics.b.l();
            }
        }
        if (objL == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objL;
    }

    @Override // io.ktor.util.pipeline.e
    @Nullable
    public Object k(@NotNull TSubject tsubject, @NotNull kotlin.coroutines.d<? super TSubject> dVar) {
        l(tsubject);
        return j(dVar);
    }

    @Override // io.ktor.util.pipeline.e
    public void l(@NotNull TSubject tsubject) {
        Intrinsics.checkNotNullParameter(tsubject, "<set-?>");
        this.f296790d = tsubject;
    }

    public final void q(@NotNull kotlin.coroutines.d<? super TSubject> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        kotlin.coroutines.d<TSubject>[] dVarArr = this.f296791e;
        int i10 = this.f296792f + 1;
        this.f296792f = i10;
        dVarArr[i10] = continuation;
    }

    @NotNull
    public final kotlin.coroutines.d<Unit> t() {
        return this.f296789c;
    }
}
