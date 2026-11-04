package io.ktor.client.plugins.observer;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import pj.n;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<h> f294939a = io.ktor.client.plugins.api.i.b("ResponseObserver", a.f294940a, new Function1() { // from class: io.ktor.client.plugins.observer.j
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return l.d((io.ktor.client.plugins.api.d) obj);
        }
    });

    /* synthetic */ class a extends g0 implements Function0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f294940a = new a();

        a() {
            super(0, h.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return new h();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1", f = "ResponseObserver.kt", i = {0, 0, 0}, l = {71, 80}, m = "invokeSuspend", n = {"$this$on", "newResponse", "sideResponse"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends o implements n<io.ktor.client.plugins.observer.a.C2067a, io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f294943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f294944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f294945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<io.ktor.client.call.b, Boolean> f294946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ io.ktor.client.plugins.api.d<h> f294947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> f294948h;

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1$1", f = "ResponseObserver.kt", i = {0}, l = {72, 76}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nResponseObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseObserver.kt\nio/ktor/client/plugins/observer/ResponseObserverKt$ResponseObserver$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294949a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f294950b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.ktor.client.statement.c f294951c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> f294952d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(io.ktor.client.statement.c cVar, Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f294951c = cVar;
                this.f294952d = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f294951c, this.f294952d, dVar);
                aVar.f294950b = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
            
                if (r11 == r1) goto L26;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r9 = 4
                    int r0 = r10.f294949a
                    r9 = 7
                    r2 = 2
                    r3 = 1
                    if (r0 == 0) goto L2c
                    if (r0 == r3) goto L1f
                    if (r0 != r2) goto L15
                    r9 = 3
                    kotlin.ResultKt.m(r11)     // Catch: java.lang.Throwable -> L86
                    goto L77
                L15:
                    r9 = 7
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r9 = 0
                    r10.<init>(r11)
                    throw r10
                L1f:
                    r9 = 0
                    java.lang.Object r0 = r10.f294950b
                    kotlinx.coroutines.s0 r0 = (kotlinx.coroutines.s0) r0
                    kotlin.ResultKt.m(r11)     // Catch: java.lang.Throwable -> L28
                    goto L46
                L28:
                    r0 = move-exception
                    r11 = r0
                    r9 = 6
                    goto L4d
                L2c:
                    kotlin.ResultKt.m(r11)
                    java.lang.Object r11 = r10.f294950b
                    kotlinx.coroutines.s0 r11 = (kotlinx.coroutines.s0) r11
                    kotlin.jvm.functions.Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r0 = r10.f294952d
                    io.ktor.client.statement.c r4 = r10.f294951c
                    r9 = 2
                    kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L28
                    r10.f294950b = r11     // Catch: java.lang.Throwable -> L28
                    r10.f294949a = r3     // Catch: java.lang.Throwable -> L28
                    java.lang.Object r11 = r0.invoke(r4, r10)     // Catch: java.lang.Throwable -> L28
                    r9 = 4
                    if (r11 != r1) goto L46
                    goto L76
                L46:
                    kotlin.Unit r11 = kotlin.Unit.f312394a     // Catch: java.lang.Throwable -> L28
                    kotlin.Result.m785constructorimpl(r11)     // Catch: java.lang.Throwable -> L28
                    r9 = 6
                    goto L56
                L4d:
                    kotlin.Result$a r0 = kotlin.Result.Companion
                    java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
                    kotlin.Result.m785constructorimpl(r11)
                L56:
                    io.ktor.client.statement.c r11 = r10.f294951c
                    io.ktor.utils.io.h r3 = r11.c()
                    boolean r11 = r3.k()
                    r9 = 3
                    if (r11 != 0) goto L95
                    kotlin.Result$a r11 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L86
                    r11 = 0
                    r10.f294950b = r11     // Catch: java.lang.Throwable -> L86
                    r10.f294949a = r2     // Catch: java.lang.Throwable -> L86
                    r4 = 0
                    r9 = 1
                    r7 = 1
                    r8 = 0
                    r6 = r10
                    java.lang.Object r11 = io.ktor.utils.io.k.j(r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L86
                    if (r11 != r1) goto L77
                L76:
                    return r1
                L77:
                    java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L86
                    r9 = 5
                    long r10 = r11.longValue()     // Catch: java.lang.Throwable -> L86
                    java.lang.Long r10 = kotlin.coroutines.jvm.internal.b.g(r10)     // Catch: java.lang.Throwable -> L86
                    kotlin.Result.m785constructorimpl(r10)     // Catch: java.lang.Throwable -> L86
                    goto L95
                L86:
                    r0 = move-exception
                    r10 = r0
                    r10 = r0
                    r9 = 5
                    kotlin.Result$a r11 = kotlin.Result.Companion
                    r9 = 0
                    java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
                    r9 = 4
                    kotlin.Result.m785constructorimpl(r10)
                L95:
                    kotlin.Unit r10 = kotlin.Unit.f312394a
                    r9 = 0
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.observer.l.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super io.ktor.client.call.b, Boolean> function1, io.ktor.client.plugins.api.d<h> dVar, Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super b> dVar2) {
            super(3, dVar2);
            this.f294946f = function1;
            this.f294947g = dVar;
            this.f294948h = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e4, code lost:
        
            if (r10.a(r9, r13) == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.observer.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.plugins.observer.a.C2067a c2067a, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(this.f294946f, this.f294947g, this.f294948h, dVar);
            bVar.f294944d = c2067a;
            bVar.f294945e = cVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    public static final void c(@NotNull io.ktor.client.j<?> jVar, @NotNull final Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jVar.r(f294939a, new Function1() { // from class: io.ktor.client.plugins.observer.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.e(block, (h) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> function2C = ((h) createClientPlugin.f()).c();
        createClientPlugin.g(io.ktor.client.plugins.observer.a.f294921a, new b(((h) createClientPlugin.f()).b(), createClientPlugin, function2C, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function2 function2, h install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        install.f(function2);
        return Unit.f312394a;
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<h> f() {
        return f294939a;
    }

    public static /* synthetic */ void g() {
    }
}
