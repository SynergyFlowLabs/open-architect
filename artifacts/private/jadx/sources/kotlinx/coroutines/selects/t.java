package kotlinx.coroutines.selects;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@a1
public final class t<R> extends u<R> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.p<R> f315567h;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", f = "SelectOld.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t<R> f315569b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t<R> tVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f315569b = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f315569b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315568a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    t<R> tVar = this.f315569b;
                    this.f315568a = 1;
                    obj = tVar.w(this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                q.c(((t) this.f315569b).f315567h, obj);
                this = (kotlin.coroutines.d<? super R>) Unit.f312394a;
                return this;
            } catch (Throwable th2) {
                q.d(((t) this.f315569b).f315567h, th2);
                return Unit.f312394a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public t(@NotNull kotlin.coroutines.d<? super R> dVar) {
        super(dVar.getContext());
        this.f315567h = new kotlinx.coroutines.p<>(kotlin.coroutines.intrinsics.b.e(dVar), 1);
    }

    @a1
    public final void S(@NotNull Throwable th2) {
        kotlinx.coroutines.p<R> pVar = this.f315567h;
        Result.a aVar = Result.Companion;
        pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
    }

    @a1
    @Nullable
    public final Object T() {
        if (this.f315567h.x()) {
            return this.f315567h.u();
        }
        kotlinx.coroutines.k.f(t0.a(getContext()), null, u0.UNDISPATCHED, new a(this, null), 1, null);
        return this.f315567h.u();
    }
}
