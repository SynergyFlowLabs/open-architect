package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.c2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@c2
public abstract class a<T> implements i<T>, c<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {226}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    static final class C2273a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<T> f314026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2273a(a<T> aVar, kotlin.coroutines.d<? super C2273a> dVar) {
            super(dVar);
            this.f314026c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314025b = obj;
            this.f314027d |= Integer.MIN_VALUE;
            return this.f314026c.collect(null, this);
        }
    }

    @Nullable
    public abstract Object c(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // kotlinx.coroutines.flow.i
    @Nullable
    public final Object collect(@NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        C2273a c2273a;
        kotlinx.coroutines.flow.internal.w wVar;
        if (dVar instanceof C2273a) {
            c2273a = (C2273a) dVar;
            int i10 = c2273a.f314027d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2273a.f314027d = i10 - Integer.MIN_VALUE;
            } else {
                c2273a = new C2273a(this, dVar);
            }
        } else {
            c2273a = new C2273a(this, dVar);
        }
        Object obj = c2273a.f314025b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c2273a.f314027d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (kotlinx.coroutines.flow.internal.w) c2273a.f314024a;
            try {
                ResultKt.m(obj);
                wVar.releaseIntercepted();
                return Unit.f312394a;
            } catch (Throwable th2) {
                th = th2;
                wVar.releaseIntercepted();
                throw th;
            }
        }
        ResultKt.m(obj);
        kotlinx.coroutines.flow.internal.w wVar2 = new kotlinx.coroutines.flow.internal.w(jVar, c2273a.getContext());
        try {
            c2273a.f314024a = wVar2;
            c2273a.f314027d = 1;
            if (c(wVar2, c2273a) == objL) {
                return objL;
            }
            wVar = wVar2;
            wVar.releaseIntercepted();
            return Unit.f312394a;
        } catch (Throwable th3) {
            th = th3;
            wVar = wVar2;
            wVar.releaseIntercepted();
            throw th;
        }
    }
}
