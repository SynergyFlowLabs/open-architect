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
public final class e<R> extends m<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.p<R> f315513g;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<R> f315515b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<R> eVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f315515b = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f315515b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315514a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    e<R> eVar = this.f315515b;
                    this.f315514a = 1;
                    obj = eVar.w(this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                q.c(((e) this.f315515b).f315513g, obj);
                this = (kotlin.coroutines.d<? super R>) Unit.f312394a;
                return this;
            } catch (Throwable th2) {
                q.d(((e) this.f315515b).f315513g, th2);
                return Unit.f312394a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public e(@NotNull kotlin.coroutines.d<? super R> dVar) {
        super(dVar.getContext());
        this.f315513g = new kotlinx.coroutines.p<>(kotlin.coroutines.intrinsics.b.e(dVar), 1);
    }

    @a1
    @Nullable
    public final Object Q() {
        if (this.f315513g.x()) {
            return this.f315513g.u();
        }
        kotlinx.coroutines.k.f(t0.a(getContext()), null, u0.UNDISPATCHED, new a(this, null), 1, null);
        return this.f315513g.u();
    }

    @a1
    public final void R(@NotNull Throwable th2) {
        kotlinx.coroutines.p<R> pVar = this.f315513g;
        Result.a aVar = Result.Companion;
        pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
    }
}
