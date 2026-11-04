package io.ktor.util.pipeline;

import io.ktor.utils.io.r0;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@r0
public final class a<TSubject, TContext> extends e<TSubject, TContext> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> f296754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f296755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private TSubject f296756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f296757e;

    /* JADX INFO: renamed from: io.ktor.util.pipeline.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.X}, m = "proceedLoop", n = {}, s = {})
    static final class C2093a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f296758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<TSubject, TContext> f296759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2093a(a<TSubject, TContext> aVar, kotlin.coroutines.d<? super C2093a> dVar) {
            super(dVar);
            this.f296759b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296758a = obj;
            this.f296760c |= Integer.MIN_VALUE;
            return this.f296759b.n(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull TContext context, @NotNull List<? extends pj.n<? super e<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> interceptors, @NotNull TSubject subject, @NotNull CoroutineContext coroutineContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f296754b = interceptors;
        this.f296755c = coroutineContext;
        this.f296756d = subject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object n(kotlin.coroutines.d<? super TSubject> dVar) {
        C2093a c2093a;
        pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object> nVar;
        TSubject tsubjectI;
        if (dVar instanceof C2093a) {
            c2093a = (C2093a) dVar;
            int i10 = c2093a.f296760c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2093a.f296760c = i10 - Integer.MIN_VALUE;
            } else {
                c2093a = new C2093a(this, dVar);
            }
        } else {
            c2093a = new C2093a(this, dVar);
        }
        Object obj = c2093a.f296758a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2093a.f296760c;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        do {
            int i12 = this.f296757e;
            if (i12 != -1) {
                List<pj.n<e<TSubject, TContext>, TSubject, kotlin.coroutines.d<? super Unit>, Object>> list = this.f296754b;
                if (i12 >= list.size()) {
                    e();
                } else {
                    nVar = list.get(i12);
                    this.f296757e = i12 + 1;
                    tsubjectI = i();
                    c2093a.f296760c = 1;
                }
            }
            return i();
        } while (nVar.invoke(this, tsubjectI, c2093a) != objL);
        return objL;
    }

    @Override // io.ktor.util.pipeline.e
    @Nullable
    public Object c(@NotNull TSubject tsubject, @NotNull kotlin.coroutines.d<? super TSubject> dVar) {
        this.f296757e = 0;
        l(tsubject);
        return j(dVar);
    }

    @Override // io.ktor.util.pipeline.e
    public void e() {
        this.f296757e = -1;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f296755c;
    }

    @Override // io.ktor.util.pipeline.e
    @NotNull
    public TSubject i() {
        return this.f296756d;
    }

    @Override // io.ktor.util.pipeline.e
    @Nullable
    public Object j(@NotNull kotlin.coroutines.d<? super TSubject> dVar) {
        int i10 = this.f296757e;
        if (i10 < 0) {
            return i();
        }
        if (i10 < this.f296754b.size()) {
            return n(dVar);
        }
        e();
        return i();
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
        this.f296756d = tsubject;
    }
}
