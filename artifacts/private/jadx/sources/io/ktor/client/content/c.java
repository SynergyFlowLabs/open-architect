package io.ktor.client.content;

import io.ktor.client.call.j;
import io.ktor.http.content.w;
import io.ktor.http.l1;
import io.ktor.http.m;
import io.ktor.http.v0;
import io.ktor.utils.io.e1;
import io.ktor.utils.io.h;
import io.ktor.utils.io.p;
import io.ktor.utils.io.t;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.coroutines.f2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends w.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f294275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f294276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final d f294277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final h f294278e;

    @f(c = "io.ktor.client.content.ObservableContent$getContent$1", f = "ObservableContent.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<e1, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f294281c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w wVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f294281c = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f294281c, dVar);
            aVar.f294280b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294279a;
            if (i10 == 0) {
                ResultKt.m(obj);
                e1 e1Var = (e1) this.f294280b;
                w.f fVar = (w.f) this.f294281c;
                p pVarC = e1Var.c();
                this.f294279a = 1;
                if (fVar.h(pVarC, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e1 e1Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(e1Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public c(@NotNull w delegate, @NotNull CoroutineContext callContext, @NotNull d listener) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f294275b = delegate;
        this.f294276c = callContext;
        this.f294277d = listener;
        this.f294278e = j(delegate);
    }

    private final h j(w wVar) {
        if (wVar instanceof w.b) {
            return j(((w.b) wVar).i());
        }
        if (wVar instanceof w.a) {
            return io.ktor.utils.io.c.e(((w.a) wVar).h(), 0, 0, 6, null);
        }
        if (wVar instanceof w.d) {
            throw new j(wVar);
        }
        if (wVar instanceof w.c) {
            return h.f296881a.a();
        }
        if (wVar instanceof w.e) {
            return ((w.e) wVar).h();
        }
        if (wVar instanceof w.f) {
            return t.E(f2.f314023a, this.f294276c, true, new a(wVar, null)).b();
        }
        throw new k0();
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public Long a() {
        return this.f294275b.a();
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public m b() {
        return this.f294275b.b();
    }

    @Override // io.ktor.http.content.w
    @NotNull
    public v0 c() {
        return this.f294275b.c();
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public <T> T d(@NotNull io.ktor.util.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.f294275b.d(key);
    }

    @Override // io.ktor.http.content.w
    @Nullable
    public l1 e() {
        return this.f294275b.e();
    }

    @Override // io.ktor.http.content.w
    public <T> void f(@NotNull io.ktor.util.a<T> key, @Nullable T t10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f294275b.f(key, t10);
    }

    @Override // io.ktor.http.content.w.e
    @NotNull
    public h h() {
        return io.ktor.client.utils.a.a(this.f294278e, this.f294276c, a(), this.f294277d);
    }
}
