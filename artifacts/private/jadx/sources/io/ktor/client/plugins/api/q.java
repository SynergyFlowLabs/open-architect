package io.ktor.client.plugins.api;

import fi.y;
import io.ktor.client.plugins.a0;
import io.ktor.client.plugins.c1;
import io.ktor.client.plugins.r1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements io.ktor.client.plugins.api.a<pj.n<? super a, ? super y, ? super kotlin.coroutines.d<? super io.ktor.client.call.b>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f294412a = new q();

    public static final class a implements s0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final r1 f294413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final CoroutineContext f294414b;

        public a(@NotNull r1 httpSendSender, @NotNull CoroutineContext coroutineContext) {
            Intrinsics.checkNotNullParameter(httpSendSender, "httpSendSender");
            Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            this.f294413a = httpSendSender;
            this.f294414b = coroutineContext;
        }

        @Nullable
        public final Object c(@NotNull y yVar, @NotNull kotlin.coroutines.d<? super io.ktor.client.call.b> dVar) {
            return this.f294413a.a(yVar, dVar);
        }

        @Override // kotlinx.coroutines.s0
        @NotNull
        public CoroutineContext getCoroutineContext() {
            return this.f294414b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.api.Send$install$1", f = "CommonHooks.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<r1, y, kotlin.coroutines.d<? super io.ktor.client.call.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<a, y, kotlin.coroutines.d<? super io.ktor.client.call.b>, Object> f294418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.c f294419e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super a, ? super y, ? super kotlin.coroutines.d<? super io.ktor.client.call.b>, ? extends Object> nVar, io.ktor.client.c cVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f294418d = nVar;
            this.f294419e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294415a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            r1 r1Var = (r1) this.f294416b;
            y yVar = (y) this.f294417c;
            pj.n<a, y, kotlin.coroutines.d<? super io.ktor.client.call.b>, Object> nVar = this.f294418d;
            a aVar = new a(r1Var, this.f294419e.getCoroutineContext());
            this.f294416b = null;
            this.f294415a = 1;
            Object objInvoke = nVar.invoke(aVar, yVar, this);
            return objInvoke == objL ? objL : objInvoke;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r1 r1Var, y yVar, kotlin.coroutines.d<? super io.ktor.client.call.b> dVar) {
            b bVar = new b(this.f294418d, this.f294419e, dVar);
            bVar.f294416b = r1Var;
            bVar.f294417c = yVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    private q() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.n<? super a, ? super y, ? super kotlin.coroutines.d<? super io.ktor.client.call.b>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        ((c1) a0.b(client, c1.f294447c)).d(new b(handler, client, null));
    }
}
