package com.planner5d.library.services.utility;

import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nStrictlyOrderedCoroutinesFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrictlyOrderedCoroutinesFactory.kt\ncom/planner5d/library/services/utility/StrictlyOrderedCoroutinesFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private WeakReference<kotlinx.coroutines.p2> f229876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f229877b = new Object();

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.StrictlyOrderedCoroutinesFactory$launch$1$1", f = "StrictlyOrderedCoroutinesFactory.kt", i = {0}, l = {54, com.planner5d.library.engine.input.f.b.f160707m}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f229878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f229879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f229880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p2 f229881d;

        /* JADX INFO: renamed from: com.planner5d.library.services.utility.z2$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.services.utility.StrictlyOrderedCoroutinesFactory$launch$1$1$1", f = "StrictlyOrderedCoroutinesFactory.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
        static final class C1692a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f229882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.p2 f229883b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1692a(kotlinx.coroutines.p2 p2Var, kotlin.coroutines.d<? super C1692a> dVar) {
                super(2, dVar);
                this.f229883b = p2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1692a(this.f229883b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f229882a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.p2 p2Var = this.f229883b;
                    if (p2Var == null) {
                        return null;
                    }
                    this.f229882a = 1;
                    if (p2Var.d1(this) == objL) {
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
                return ((C1692a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlinx.coroutines.p2 p2Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f229880c = function2;
            this.f229881d = p2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f229880c, this.f229881d, dVar);
            aVar.f229879b = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r9.invoke(r1, r8) == r0) goto L15;
         */
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
                int r1 = r8.f229878a
                r2 = 0
                r3 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L15
                kotlin.ResultKt.m(r9)
                goto L53
            L15:
                r7 = 7
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1e:
                java.lang.Object r1 = r8.f229879b
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                r7 = 7
                kotlin.ResultKt.m(r9)
                goto L46
            L27:
                kotlin.ResultKt.m(r9)
                java.lang.Object r9 = r8.f229879b
                r1 = r9
                r7 = 2
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                kotlinx.coroutines.c3 r9 = kotlinx.coroutines.c3.f313552a
                r7 = 7
                com.planner5d.library.services.utility.z2$a$a r5 = new com.planner5d.library.services.utility.z2$a$a
                kotlinx.coroutines.p2 r6 = r8.f229881d
                r5.<init>(r6, r2)
                r8.f229879b = r1
                r8.f229878a = r4
                java.lang.Object r9 = kotlinx.coroutines.i.h(r9, r5, r8)
                r7 = 1
                if (r9 != r0) goto L46
                goto L52
            L46:
                kotlin.jvm.functions.Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r9 = r8.f229880c
                r8.f229879b = r2
                r8.f229878a = r3
                java.lang.Object r8 = r9.invoke(r1, r8)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                r7 = 7
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.services.utility.z2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public z2() {
    }

    public static /* synthetic */ kotlinx.coroutines.p2 b(z2 z2Var, kotlinx.coroutines.s0 s0Var, CoroutineContext coroutineContext, kotlinx.coroutines.u0 u0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i10 & 4) != 0) {
            u0Var = kotlinx.coroutines.u0.DEFAULT;
        }
        return z2Var.a(s0Var, coroutineContext, u0Var, function2);
    }

    @NotNull
    public final kotlinx.coroutines.p2 a(@NotNull kotlinx.coroutines.s0 scope, @NotNull CoroutineContext context, @NotNull kotlinx.coroutines.u0 start, @NotNull Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        kotlinx.coroutines.p2 p2VarD;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f229877b) {
            try {
                WeakReference<kotlinx.coroutines.p2> weakReference = this.f229876a;
                p2VarD = kotlinx.coroutines.i.d(scope, context, start, new a(block, weakReference != null ? weakReference.get() : null, null));
                this.f229876a = new WeakReference<>(p2VarD);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p2VarD;
    }
}
