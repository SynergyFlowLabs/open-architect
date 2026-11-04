package com.planner5d.library.services.utility;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;

/* JADX INFO: loaded from: classes10.dex */
@kotlin.l(message = "Rewrite calling side with coroutines")
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.u1 f229797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f1 f229798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.z1 f229799c;

    public interface a<T> {
        T run() throws Throwable;
    }

    public interface b<T> {
        T a(@NotNull Subscriber<? super T> subscriber) throws Throwable;
    }

    public static abstract class c<T> {
        public void a() {
        }

        public void b(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        public void c(T t10) {
        }

        public abstract T d() throws Throwable;
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineExecutor$execute$1", f = "CoroutineExecutor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0, 65}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c<T> f229801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f229802c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineExecutor$execute$1$1", f = "CoroutineExecutor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f229803a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<T> f229804b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f229805c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c<T> cVar, T t10, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f229804b = cVar;
                this.f229805c = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f229804b, this.f229805c, dVar);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f229803a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f229804b.c(this.f229805c);
                this.f229804b.a();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineExecutor$execute$1$2", f = "CoroutineExecutor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f229806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<T> f229807b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f229808c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c<T> cVar, Throwable th2, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f229807b = cVar;
                this.f229808c = th2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f229807b, this.f229808c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f229806a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f229807b.b(this.f229808c);
                this.f229807b.a();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c<T> cVar, w wVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f229801b = cVar;
            this.f229802c = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f229801b, this.f229802c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        
            if (kotlinx.coroutines.i.h(r1, r4, r8) == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v8 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r7 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f229800a
                r2 = 0
                r3 = 2
                r4 = 1
                r7 = 0
                if (r1 == 0) goto L27
                if (r1 == r4) goto L20
                if (r1 != r3) goto L16
                r7 = 7
                kotlin.ResultKt.m(r9)
                goto L77
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r7 = 1
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 3
                r8.<init>(r9)
                throw r8
            L20:
                r7 = 2
                kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L25
                goto L77
            L25:
                r9 = move-exception
                goto L4c
            L27:
                kotlin.ResultKt.m(r9)
                r7 = 0
                com.planner5d.library.services.utility.w$c<T> r9 = r8.f229801b     // Catch: java.lang.Throwable -> L25
                r7 = 1
                java.lang.Object r9 = r9.d()     // Catch: java.lang.Throwable -> L25
                com.planner5d.library.services.utility.s r1 = com.planner5d.library.services.utility.s.f229729a     // Catch: java.lang.Throwable -> L25
                r7 = 1
                kotlinx.coroutines.a3 r1 = r1.a()     // Catch: java.lang.Throwable -> L25
                r7 = 2
                com.planner5d.library.services.utility.w$d$a r5 = new com.planner5d.library.services.utility.w$d$a     // Catch: java.lang.Throwable -> L25
                com.planner5d.library.services.utility.w$c<T> r6 = r8.f229801b     // Catch: java.lang.Throwable -> L25
                r5.<init>(r6, r9, r2)     // Catch: java.lang.Throwable -> L25
                r7 = 4
                r8.f229800a = r4     // Catch: java.lang.Throwable -> L25
                java.lang.Object r8 = kotlinx.coroutines.i.h(r1, r5, r8)     // Catch: java.lang.Throwable -> L25
                if (r8 != r0) goto L77
                r7 = 0
                goto L76
            L4c:
                com.planner5d.library.services.utility.w r1 = r8.f229802c
                com.planner5d.library.model.manager.u1 r1 = com.planner5d.library.services.utility.w.c(r1)
                r7 = 3
                java.lang.String r4 = "gnsBIduaroknurn"
                java.lang.String r4 = "runInBackground"
                r7 = 0
                java.lang.String r5 = "rormorE"
                java.lang.String r5 = "onError"
                r1.b(r4, r5, r9)
                r7 = 4
                com.planner5d.library.services.utility.s r1 = com.planner5d.library.services.utility.s.f229729a
                kotlinx.coroutines.a3 r1 = r1.a()
                r7 = 3
                com.planner5d.library.services.utility.w$d$b r4 = new com.planner5d.library.services.utility.w$d$b
                com.planner5d.library.services.utility.w$c<T> r5 = r8.f229801b
                r4.<init>(r5, r9, r2)
                r8.f229800a = r3
                java.lang.Object r8 = kotlinx.coroutines.i.h(r1, r4, r8)
                if (r8 != r0) goto L77
            L76:
                return r0
            L77:
                r7 = 7
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.utility.w.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineExecutor$execute$2", f = "CoroutineExecutor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<Unit> f229810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f229811c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a<Unit> aVar, w wVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f229810b = aVar;
            this.f229811c = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f229810b, this.f229811c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f229809a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                this.f229810b.run();
            } catch (Throwable th2) {
                this.f229811c.f229797a.b("runInBackground", "onError", th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineExecutor$executeRx$1$1", f = "CoroutineExecutor.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160717p0, 89}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f229813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f229814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Subscriber<? super T> f229815d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineExecutor$executeRx$1$1$1", f = "CoroutineExecutor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f229816a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Subscriber<? super T> f229817b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f229818c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Subscriber<? super T> subscriber, T t10, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f229817b = subscriber;
                this.f229818c = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f229817b, this.f229818c, dVar);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f229816a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f229817b.onNext(this.f229818c);
                this.f229817b.onCompleted();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineExecutor$executeRx$1$1$2", f = "CoroutineExecutor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f229819a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Subscriber<? super T> f229820b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f229821c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Subscriber<? super T> subscriber, Throwable th2, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f229820b = subscriber;
                this.f229821c = th2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f229820b, this.f229821c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f229819a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f229820b.onError(this.f229821c);
                this.f229820b.onCompleted();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a<T> aVar, w wVar, Subscriber<? super T> subscriber, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f229813b = aVar;
            this.f229814c = wVar;
            this.f229815d = subscriber;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f229813b, this.f229814c, this.f229815d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        
            if (r8 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        
            if (kotlinx.coroutines.i.h(r1, r4, r8) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v8 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r7 = 4
                int r1 = r8.f229812a
                r2 = 0
                r7 = r7 & r2
                r3 = 2
                r4 = 5
                r4 = 1
                r7 = 6
                if (r1 == 0) goto L2e
                r7 = 6
                if (r1 == r4) goto L27
                r7 = 6
                if (r1 != r3) goto L1b
                r7 = 6
                kotlin.ResultKt.m(r9)
                r7 = 7
                goto L7c
            L1b:
                r7 = 4
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "/csfte e/l cio/rh  soimt/erlvb o/r tewieoou/a/ke/nn"
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 6
                r8.<init>(r9)
                throw r8
            L27:
                kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L2b
                goto L7c
            L2b:
                r9 = move-exception
                r7 = 7
                goto L54
            L2e:
                kotlin.ResultKt.m(r9)
                r7 = 5
                com.planner5d.library.services.utility.w$a<T> r9 = r8.f229813b     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r9 = r9.run()     // Catch: java.lang.Throwable -> L2b
                r7 = 6
                com.planner5d.library.services.utility.s r1 = com.planner5d.library.services.utility.s.f229729a     // Catch: java.lang.Throwable -> L2b
                kotlinx.coroutines.a3 r1 = r1.a()     // Catch: java.lang.Throwable -> L2b
                r7 = 6
                com.planner5d.library.services.utility.w$f$a r5 = new com.planner5d.library.services.utility.w$f$a     // Catch: java.lang.Throwable -> L2b
                r7 = 4
                rx.Subscriber<? super T> r6 = r8.f229815d     // Catch: java.lang.Throwable -> L2b
                r7 = 6
                r5.<init>(r6, r9, r2)     // Catch: java.lang.Throwable -> L2b
                r7 = 2
                r8.f229812a = r4     // Catch: java.lang.Throwable -> L2b
                r7 = 2
                java.lang.Object r8 = kotlinx.coroutines.i.h(r1, r5, r8)     // Catch: java.lang.Throwable -> L2b
                if (r8 != r0) goto L7c
                goto L7a
            L54:
                com.planner5d.library.services.utility.w r1 = r8.f229814c
                com.planner5d.library.model.manager.u1 r1 = com.planner5d.library.services.utility.w.c(r1)
                java.lang.String r4 = "runInBackground"
                java.lang.String r5 = "rromEro"
                java.lang.String r5 = "onError"
                r7 = 4
                r1.b(r4, r5, r9)
                com.planner5d.library.services.utility.s r1 = com.planner5d.library.services.utility.s.f229729a
                kotlinx.coroutines.a3 r1 = r1.a()
                com.planner5d.library.services.utility.w$f$b r4 = new com.planner5d.library.services.utility.w$f$b
                rx.Subscriber<? super T> r5 = r8.f229815d
                r4.<init>(r5, r9, r2)
                r8.f229812a = r3
                java.lang.Object r8 = kotlinx.coroutines.i.h(r1, r4, r8)
                r7 = 7
                if (r8 != r0) goto L7c
            L7a:
                r7 = 2
                return r0
            L7c:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                r7 = 1
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.utility.w.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineExecutor$executeWithSubscriber$1$1", f = "CoroutineExecutor.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b<T> f229823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Subscriber<? super T> f229824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f229825d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.CoroutineExecutor$executeWithSubscriber$1$1$1", f = "CoroutineExecutor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f229826a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Subscriber<? super T> f229827b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Throwable f229828c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Subscriber<? super T> subscriber, Throwable th2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f229827b = subscriber;
                this.f229828c = th2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f229827b, this.f229828c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f229826a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f229827b.onError(this.f229828c);
                this.f229827b.onCompleted();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b<T> bVar, Subscriber<? super T> subscriber, w wVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f229823b = bVar;
            this.f229824c = subscriber;
            this.f229825d = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f229823b, this.f229824c, this.f229825d, dVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f229822a;
            if (i10 == 0) {
                ResultKt.m(obj);
                try {
                    b<T> bVar = this.f229823b;
                    Object obj2 = this.f229824c;
                    Intrinsics.checkNotNull(obj2);
                    bVar.a(obj2);
                } catch (Throwable th2) {
                    this.f229825d.f229797a.b("runInBackground", "onError", th2);
                    kotlinx.coroutines.a3 a3VarA = s.f229729a.a();
                    a aVar = new a(this.f229824c, th2, null);
                    this.f229822a = 1;
                    if (kotlinx.coroutines.i.h(a3VarA, aVar, this) == objL) {
                        return objL;
                    }
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public w(@NotNull com.planner5d.library.model.manager.u1 loggingService, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(loggingService, "loggingService");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f229797a = loggingService;
        this.f229798b = coroutineScope;
        this.f229799c = s.f229729a.h();
    }

    private final <T> void g(c<T> cVar, kotlinx.coroutines.n0 n0Var) {
        kotlinx.coroutines.k.f(this.f229798b, n0Var, null, new d(cVar, this, null), 2, null);
    }

    public static /* synthetic */ void h(w wVar, a aVar, kotlinx.coroutines.n0 n0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            n0Var = wVar.f229799c;
        }
        wVar.e(aVar, n0Var);
    }

    static /* synthetic */ void i(w wVar, c cVar, kotlinx.coroutines.n0 n0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            n0Var = wVar.f229799c;
        }
        wVar.g(cVar, n0Var);
    }

    private final <T> Observable<T> k(final a<T> aVar, final kotlinx.coroutines.n0 n0Var) {
        Observable observableCreate = Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.services.utility.u
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                w.m(this.f229758a, n0Var, aVar, (Subscriber) obj);
            }
        });
        Scheduler scheduler = com.planner5d.library.services.rx.c.f224934d;
        Observable<T> observableObserveOn = observableCreate.subscribeOn(scheduler).observeOn(scheduler);
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    static /* synthetic */ Observable l(w wVar, a aVar, kotlinx.coroutines.n0 n0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            n0Var = wVar.f229799c;
        }
        return wVar.k(aVar, n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(w wVar, kotlinx.coroutines.n0 n0Var, a aVar, Subscriber subscriber) {
        kotlinx.coroutines.k.f(wVar.f229798b, n0Var, null, new f(aVar, wVar, subscriber, null), 2, null);
    }

    private final <T> Observable<T> o(final b<T> bVar, final kotlinx.coroutines.n0 n0Var) {
        Observable observableCreate = Observable.create(new Observable.OnSubscribe() { // from class: com.planner5d.library.services.utility.v
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                w.q(this.f229766a, n0Var, bVar, (Subscriber) obj);
            }
        });
        Scheduler scheduler = com.planner5d.library.services.rx.c.f224934d;
        Observable<T> observableObserveOn = observableCreate.subscribeOn(scheduler).observeOn(scheduler);
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        return observableObserveOn;
    }

    static /* synthetic */ Observable p(w wVar, b bVar, kotlinx.coroutines.n0 n0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            n0Var = wVar.f229799c;
        }
        return wVar.o(bVar, n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(w wVar, kotlinx.coroutines.n0 n0Var, b bVar, Subscriber subscriber) {
        kotlinx.coroutines.k.f(wVar.f229798b, n0Var, null, new g(bVar, subscriber, wVar, null), 2, null);
    }

    @kotlin.l(message = "")
    public final void d(@NotNull a<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        e(runnable, this.f229799c);
    }

    public final void e(@NotNull a<Unit> runnable, @NotNull kotlinx.coroutines.n0 coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        int i10 = 5 ^ 0;
        kotlinx.coroutines.k.f(this.f229798b, coroutineDispatcher, null, new e(runnable, this, null), 2, null);
    }

    public final <T> void f(@NotNull c<T> callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        g(callbacks, this.f229799c);
    }

    @NotNull
    public final <T> Observable<T> j(@NotNull a<T> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return k(callback, this.f229799c);
    }

    @NotNull
    public final <T> Observable<T> n(@NotNull b<T> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return o(callback, this.f229799c);
    }
}
