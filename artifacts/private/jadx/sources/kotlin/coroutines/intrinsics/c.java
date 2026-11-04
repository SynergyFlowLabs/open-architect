package kotlin.coroutines.intrinsics;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a1;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
public class c {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f312458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f312459b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.coroutines.d<? super T> dVar, Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1) {
            super(dVar);
            this.f312459b = function1;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.c$a for r3v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        protected java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.String r2 = "Androeed.ru"
                int r0 = r3.f312458a
                r2 = 0
                r1 = 1
                if (r0 == 0) goto L1c
                r2 = 3
                if (r0 != r1) goto L13
                r0 = 2
                r3.f312458a = r0
                r2 = 2
                kotlin.ResultKt.m(r4)
                return r4
            L13:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "This coroutine had already completed"
                r3.<init>(r4)
                r2 = 0
                throw r3
            L1c:
                r3.f312458a = r1
                kotlin.ResultKt.m(r4)
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super T>, java.lang.Object> r4 = r3.f312459b
                java.lang.Object r3 = r4.invoke(r3)
                r2 = 7
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f312460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f312461b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.coroutines.d<? super T> dVar, CoroutineContext coroutineContext, Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1) {
            super(dVar, coroutineContext);
            this.f312461b = function1;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.c$b for r3v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        protected java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.String r2 = "Androeed.ru"
                int r0 = r3.f312460a
                r2 = 7
                r1 = 1
                if (r0 == 0) goto L1b
                if (r0 != r1) goto L12
                r0 = 2
                r2 = 4
                r3.f312460a = r0
                kotlin.ResultKt.m(r4)
                return r4
            L12:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "This coroutine had already completed"
                r3.<init>(r4)
                r2 = 4
                throw r3
            L1b:
                r3.f312460a = r1
                kotlin.ResultKt.m(r4)
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super T>, java.lang.Object> r4 = r3.f312461b
                r2 = 4
                java.lang.Object r3 = r4.invoke(r3)
                r2 = 6
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.intrinsics.c$c, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,222:1\n131#2:223\n*E\n"})
    public static final class C2253c extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f312462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f312463b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2253c(kotlin.coroutines.d dVar, Function1 function1) {
            super(dVar);
            this.f312463b = function1;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f312462a;
            if (i10 == 0) {
                this.f312462a = 1;
                ResultKt.m(obj);
                Intrinsics.checkNotNull(this.f312463b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((Function1) r1.q(this.f312463b, 1)).invoke(this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f312462a = 2;
            ResultKt.m(obj);
            return obj;
        }
    }

    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,240:1\n131#2:241\n*E\n"})
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f312464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f312465b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.coroutines.d dVar, CoroutineContext coroutineContext, Function1 function1) {
            super(dVar, coroutineContext);
            this.f312465b = function1;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f312464a;
            if (i10 == 0) {
                this.f312464a = 1;
                ResultKt.m(obj);
                Intrinsics.checkNotNull(this.f312465b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((Function1) r1.q(this.f312465b, 1)).invoke(this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f312464a = 2;
            ResultKt.m(obj);
            return obj;
        }
    }

    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,222:1\n166#2:223\n*E\n"})
    public static final class e extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f312466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f312467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f312468c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.coroutines.d dVar, Function2 function2, Object obj) {
            super(dVar);
            this.f312467b = function2;
            this.f312468c = obj;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f312466a;
            if (i10 == 0) {
                this.f312466a = 1;
                ResultKt.m(obj);
                Intrinsics.checkNotNull(this.f312467b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((Function2) r1.q(this.f312467b, 2)).invoke(this.f312468c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f312466a = 2;
            ResultKt.m(obj);
            return obj;
        }
    }

    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,240:1\n166#2:241\n*E\n"})
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f312469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f312470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f312471c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.coroutines.d dVar, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(dVar, coroutineContext);
            this.f312470b = function2;
            this.f312471c = obj;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f312469a;
            if (i10 == 0) {
                this.f312469a = 1;
                ResultKt.m(obj);
                Intrinsics.checkNotNull(this.f312470b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((Function2) r1.q(this.f312470b, 2)).invoke(this.f312471c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f312469a = 2;
            ResultKt.m(obj);
            return obj;
        }
    }

    public static final class g extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.coroutines.d<? super T> dVar) {
            super(dVar);
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            ResultKt.m(obj);
            return obj;
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(kotlin.coroutines.d<? super T> dVar, CoroutineContext coroutineContext) {
            super(dVar, coroutineContext);
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            ResultKt.m(obj);
            return obj;
        }
    }

    @e1(version = "1.3")
    private static final <T> kotlin.coroutines.d<Unit> a(kotlin.coroutines.d<? super T> dVar, Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1) {
        CoroutineContext context = dVar.getContext();
        return context == kotlin.coroutines.h.f312451a ? new a(dVar, function1) : new b(dVar, context, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @NotNull
    public static <T> kotlin.coroutines.d<Unit> b(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        kotlin.coroutines.d<?> dVarA = kotlin.coroutines.jvm.internal.h.a(completion);
        if (function1 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function1).create(dVarA);
        }
        CoroutineContext context = dVarA.getContext();
        return context == kotlin.coroutines.h.f312451a ? new C2253c(dVarA, function1) : new d(dVarA, context, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @NotNull
    public static <R, T> kotlin.coroutines.d<Unit> c(@NotNull Function2<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, R r10, @NotNull kotlin.coroutines.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        kotlin.coroutines.d<?> dVarA = kotlin.coroutines.jvm.internal.h.a(completion);
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(r10, dVarA);
        }
        CoroutineContext context = dVarA.getContext();
        return context == kotlin.coroutines.h.f312451a ? new e(dVarA, function2, r10) : new f(dVarA, context, function2, r10);
    }

    private static final <T> kotlin.coroutines.d<T> d(kotlin.coroutines.d<? super T> dVar) {
        CoroutineContext context = dVar.getContext();
        return context == kotlin.coroutines.h.f312451a ? new g(dVar) : new h(dVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.3")
    @NotNull
    public static <T> kotlin.coroutines.d<T> e(@NotNull kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d<T> dVar2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar3 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar3 == null || (dVar2 = (kotlin.coroutines.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object f(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return !(function1 instanceof kotlin.coroutines.jvm.internal.a) ? i(function1, completion) : ((Function1) r1.q(function1, 1)).invoke(completion);
    }

    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object g(Function2<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, R r10, kotlin.coroutines.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? j(function2, r10, completion) : ((Function2) r1.q(function2, 2)).invoke(r10, completion);
    }

    @kotlin.internal.f
    private static final <R, P, T> Object h(n<? super R, ? super P, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar, R r10, P p10, kotlin.coroutines.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return !(nVar instanceof kotlin.coroutines.jvm.internal.a) ? k(nVar, r10, p10, completion) : ((n) r1.q(nVar, 3)).invoke(r10, p10, completion);
    }

    @a1
    @Nullable
    public static final <T> Object i(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function1) r1.q(function1, 1)).invoke(d(kotlin.coroutines.jvm.internal.h.a(completion)));
    }

    @a1
    @Nullable
    public static <R, T> Object j(@NotNull Function2<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, R r10, @NotNull kotlin.coroutines.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) r1.q(function2, 2)).invoke(r10, d(kotlin.coroutines.jvm.internal.h.a(completion)));
    }

    @a1
    @Nullable
    public static <R, P, T> Object k(@NotNull n<? super R, ? super P, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar, R r10, P p10, @NotNull kotlin.coroutines.d<? super T> completion) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((n) r1.q(nVar, 3)).invoke(r10, p10, d(kotlin.coroutines.jvm.internal.h.a(completion)));
    }
}
