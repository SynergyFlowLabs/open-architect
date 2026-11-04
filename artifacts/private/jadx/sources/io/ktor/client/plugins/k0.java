package io.ktor.client.plugins;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f294865a = pi.a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<Unit> f294866b = io.ktor.client.plugins.api.i.c("RequestLifecycle", new Function1() { // from class: io.ktor.client.plugins.j0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return k0.d((io.ktor.client.plugins.api.d) obj);
        }
    });

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1", f = "HttpRequestLifecycle.kt", i = {0}, l = {29}, m = "invokeSuspend", n = {"executionContext"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<fi.y, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.plugins.api.d<Unit> f294870d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.ktor.client.plugins.api.d<Unit> dVar, kotlin.coroutines.d<? super a> dVar2) {
            super(3, dVar2);
            this.f294870d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.a0 a0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294867a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0Var = (kotlinx.coroutines.a0) this.f294868b;
                try {
                    ResultKt.m(obj);
                    a0Var.complete();
                    return Unit.f312394a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        a0Var.f(th);
                        throw th;
                    } catch (Throwable th3) {
                        a0Var.complete();
                        throw th3;
                    }
                }
            }
            ResultKt.m(obj);
            fi.y yVar = (fi.y) this.f294868b;
            Function1 function1 = (Function1) this.f294869c;
            kotlinx.coroutines.a0 a0VarA = q3.a(yVar.g());
            CoroutineContext.Element element = this.f294870d.b().getCoroutineContext().get(p2.M2);
            Intrinsics.checkNotNull(element);
            k0.f(a0VarA, (p2) element);
            try {
                yVar.o(a0VarA);
                this.f294868b = a0VarA;
                this.f294867a = 1;
                if (function1.invoke(this) == objL) {
                    return objL;
                }
                a0Var = a0VarA;
                a0Var.complete();
                return Unit.f312394a;
            } catch (Throwable th4) {
                th = th4;
                a0Var = a0VarA;
                a0Var.f(th);
                throw th;
            }
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fi.y yVar, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f294870d, dVar);
            aVar.f294868b = yVar;
            aVar.f294869c = function1;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(t1.f295127a, new a(createClientPlugin, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final kotlinx.coroutines.a0 a0Var, p2 p2Var) {
        final kotlinx.coroutines.o1 o1VarE = p2Var.E(new Function1() { // from class: io.ktor.client.plugins.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k0.g(a0Var, (Throwable) obj);
            }
        });
        a0Var.E(new Function1() { // from class: io.ktor.client.plugins.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k0.h(o1VarE, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(kotlinx.coroutines.a0 a0Var, Throwable th2) {
        if (th2 != null) {
            f294865a.J("Cancelling request because engine Job failed with error: " + th2);
            s2.g(a0Var, "Engine failed", th2);
        } else {
            f294865a.J("Cancelling request because engine Job completed");
            a0Var.complete();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(kotlinx.coroutines.o1 o1Var, Throwable th2) {
        o1Var.dispose();
        return Unit.f312394a;
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<Unit> i() {
        return f294866b;
    }
}
