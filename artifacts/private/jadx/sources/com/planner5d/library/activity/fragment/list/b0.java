package com.planner5d.library.activity.fragment.list;

import com.devtodev.core.data.metrics.Metric;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nMainListActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListActions.kt\ncom/planner5d/library/activity/fragment/list/MainListActions\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,108:1\n116#2,7:109\n124#2,2:118\n37#3,2:116\n*S KotlinDebug\n*F\n+ 1 MainListActions.kt\ncom/planner5d/library/activity/fragment/list/MainListActions\n*L\n70#1:109,7\n70#1:118,2\n76#1:116,2\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f133982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<a[], Unit> f133983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f133984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.h f133985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<a> f133986e;

    public enum a {
        CreatingProject(com.planner5d.library.view.d.q.C4),
        ImportingProject(com.planner5d.library.view.d.q.Nc),
        JoiningContest(com.planner5d.library.view.d.q.K3),
        Loading(com.planner5d.library.view.d.q.f248145zd),
        Refreshing(com.planner5d.library.view.d.q.uo),
        Selecting(com.planner5d.library.view.d.q.uq),
        Synchronizing(com.planner5d.library.view.d.q.wu),
        ProcessingDeeplink(com.planner5d.library.view.d.q.Gj);


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f133996k = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f133997a;

        a(int i10) {
            this.f133997a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f133996k;
        }

        public final int n() {
            return this.f133997a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final b0 f133998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.sync.h f133999b;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListActions$Execution", f = "MainListActions.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {com.planner5d.library.engine.input.f.b.f160697i1, com.planner5d.library.engine.input.f.b.f160703k1, com.planner5d.library.engine.input.f.b.f160715o1, 102, 102}, m = "execute", n = {"this", com.facebook.internal.w0.f100156c1, "executor", "withPermits", "this", com.facebook.internal.w0.f100156c1, "executor", "withPermits", "this", com.facebook.internal.w0.f100156c1, "withPermits"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "Z$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f134000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f134001b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f134002c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f134003d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f134004e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f134006g;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f134004e = obj;
                this.f134006g |= Integer.MIN_VALUE;
                return b.this.b(null, false, null, this);
            }
        }

        protected b(@NotNull b0 actions, @NotNull kotlinx.coroutines.sync.h permits) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(permits, "permits");
            this.f133998a = actions;
            this.f133999b = permits;
        }

        @Nullable
        public final Object a(@NotNull a aVar, @NotNull Function2<? super b, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
            Object objB = b(aVar, false, function2, dVar);
            return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00d8 A[DONT_INVERT, PHI: r11 r12 r13
          0x00d8: PHI (r11v10 'this' ??) = (r11v24 'this' ??), (r11v25 'this' ??) binds: [B:37:0x00d5, B:20:0x0055] A[DONT_GENERATE, DONT_INLINE]
          0x00d8: PHI (r12v12 com.planner5d.library.activity.fragment.list.b0$a) = (r12v9 com.planner5d.library.activity.fragment.list.b0$a), (r12v18 com.planner5d.library.activity.fragment.list.b0$a) binds: [B:37:0x00d5, B:20:0x0055] A[DONT_GENERATE, DONT_INLINE]
          0x00d8: PHI (r13v9 ??) = (r13v15 ??), (r13v16 ??) binds: [B:37:0x00d5, B:20:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x00da  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
        
            if (r11.e(r12, false, r0) == r1) goto L50;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r11v0, types: [com.planner5d.library.activity.fragment.list.b0$b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v24 */
        /* JADX WARN: Type inference failed for: r11v25 */
        /* JADX WARN: Type inference failed for: r11v26 */
        /* JADX WARN: Type inference failed for: r11v27 */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v29 */
        /* JADX WARN: Type inference failed for: r11v4, types: [com.planner5d.library.activity.fragment.list.b0$b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v15 */
        /* JADX WARN: Type inference failed for: r13v16 */
        /* JADX WARN: Type inference failed for: r13v17 */
        /* JADX WARN: Type inference failed for: r13v18 */
        /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
        /* JADX WARN: Type inference failed for: r13v4 */
        /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r13v9, types: [com.planner5d.library.activity.fragment.list.b0$b] */
        /* JADX WARN: Type inference failed for: r14v15 */
        /* JADX WARN: Type inference failed for: r14v2, types: [com.planner5d.library.activity.fragment.list.b0$b] */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v5 */
        /* JADX WARN: Type inference failed for: r14v8 */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected final java.lang.Object b(@org.jetbrains.annotations.NotNull com.planner5d.library.activity.fragment.list.b0.a r12, boolean r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super com.planner5d.library.activity.fragment.list.b0.b, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.list.b0.b.b(com.planner5d.library.activity.fragment.list.b0$a, boolean, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
        }
    }

    private static final class c extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull b0 actions, @NotNull kotlinx.coroutines.sync.h permits) {
            super(actions, permits);
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(permits, "permits");
        }

        @Nullable
        public final Object c(@NotNull a aVar, @NotNull Function2<? super b, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
            Object objB = b(aVar, true, function2, dVar);
            return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListActions$queue$2", f = "MainListActions.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134007a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f134009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<b, kotlin.coroutines.d<? super Unit>, Object> f134010d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(a aVar, Function2<? super b, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f134009c = aVar;
            this.f134010d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b0.this.new d(this.f134009c, this.f134010d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134007a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b0 b0Var = b0.this;
                c cVar = new c(b0Var, b0Var.f133985d);
                a aVar = this.f134009c;
                Function2<b, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f134010d;
                this.f134007a = 1;
                if (cVar.c(aVar, function2, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListActions$queueForeground$1", f = "MainListActions.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134011a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f134013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<b, kotlin.coroutines.d<? super Unit>, Object> f134014d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(a aVar, Function2<? super b, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f134013c = aVar;
            this.f134014d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b0.this.new e(this.f134013c, this.f134014d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134011a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b0 b0Var = b0.this;
                a aVar = this.f134013c;
                Function2<b, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f134014d;
                this.f134011a = 1;
                if (b0Var.c(aVar, function2, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListActions", f = "MainListActions.kt", i = {0, 0, 0, 0}, l = {113}, m = "setInProgress", n = {"this", com.facebook.internal.w0.f100156c1, "$this$withLock_u24default$iv", Metric.IN_PROGRESS_KEY}, s = {"L$0", "L$1", "L$2", "Z$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f134015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f134016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f134017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f134018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f134019e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f134021g;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f134019e = obj;
            this.f134021g |= Integer.MIN_VALUE;
            return b0.this.e(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListActions$start$1", f = "MainListActions.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134022a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f134024c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a aVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f134024c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b0.this.new g(this.f134024c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134022a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b0 b0Var = b0.this;
                a aVar = this.f134024c;
                this.f134022a = 1;
                if (b0Var.e(aVar, true, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.list.MainListActions$stop$1", f = "MainListActions.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f134025a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f134027c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a aVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f134027c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b0.this.new h(this.f134027c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f134025a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b0 b0Var = b0.this;
                a aVar = this.f134027c;
                this.f134025a = 1;
                if (b0Var.e(aVar, false, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@NotNull kotlinx.coroutines.s0 scope, @NotNull Function1<? super a[], Unit> onChange) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        this.f133982a = scope;
        this.f133983b = onChange;
        this.f133984c = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f133985d = kotlinx.coroutines.sync.l.b(2, 0, 2, null);
        this.f133986e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object e(a aVar, boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
        f fVar;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f134021g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f134021g = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f134019e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f134021g;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar2 = this.f133984c;
            fVar.f134015a = this;
            fVar.f134016b = aVar;
            fVar.f134017c = aVar2;
            fVar.f134018d = z10;
            fVar.f134021g = 1;
            if (aVar2.h(null, fVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = fVar.f134018d;
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) fVar.f134017c;
            aVar = (a) fVar.f134016b;
            b0 b0Var = (b0) fVar.f134015a;
            ResultKt.m(obj);
            aVar2 = aVar3;
            this = b0Var;
        }
        try {
            if (z10) {
                this.f133986e.add(aVar);
            } else {
                this.f133986e.remove(aVar);
            }
            this.f133983b.invoke(this.f133986e.toArray(new a[0]));
            Unit unit = Unit.f312394a;
            aVar2.i(null);
            return unit;
        } catch (Throwable th2) {
            aVar2.i(null);
            throw th2;
        }
    }

    @Nullable
    public final Object c(@NotNull a aVar, @NotNull Function2<? super b, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.a(), new d(aVar, function2, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    public final void d(@NotNull a action, @NotNull Function2<? super b, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> executor) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(executor, "executor");
        int i10 = 2 | 0;
        kotlinx.coroutines.k.f(this.f133982a, null, null, new e(action, executor, null), 3, null);
    }

    public final void f(@NotNull a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        kotlinx.coroutines.k.f(this.f133982a, com.planner5d.library.services.utility.s.f229729a.a(), null, new g(action, null), 2, null);
    }

    public final void g(@NotNull a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        kotlinx.coroutines.k.f(this.f133982a, com.planner5d.library.services.utility.s.f229729a.a(), null, new h(action, null), 2, null);
    }
}
