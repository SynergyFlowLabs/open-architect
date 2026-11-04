package androidx.compose.foundation.text;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super kotlinx.coroutines.p2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f20964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.l0 f20965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k5 f20966d;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.s4$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {}, s = {})
        static final class C0157a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f20967a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f20968b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k5 f20969c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0157a(androidx.compose.ui.input.pointer.l0 l0Var, k5 k5Var, kotlin.coroutines.d<? super C0157a> dVar) {
                super(2, dVar);
                this.f20968b = l0Var;
                this.f20969c = k5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0157a(this.f20968b, this.f20969c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f20967a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f20968b;
                    k5 k5Var = this.f20969c;
                    this.f20967a = 1;
                    if (s4.v(l0Var, k5Var, this) == objL) {
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
                return ((C0157a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f20970a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f20971b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k5 f20972c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.input.pointer.l0 l0Var, k5 k5Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f20971b = l0Var;
                this.f20972c = k5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f20971b, this.f20972c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f20970a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f20971b;
                    k5 k5Var = this.f20972c;
                    this.f20970a = 1;
                    if (s4.q(l0Var, k5Var, this) == objL) {
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
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.input.pointer.l0 l0Var, k5 k5Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f20965c = l0Var;
            this.f20966d = k5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f20965c, this.f20966d, dVar);
            aVar.f20964b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f20963a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f20964b;
            kotlinx.coroutines.u0 u0Var = kotlinx.coroutines.u0.UNDISPATCHED;
            kotlinx.coroutines.k.f(s0Var, null, u0Var, new C0157a(this.f20965c, this.f20966d, null), 1, null);
            return kotlinx.coroutines.k.f(s0Var, null, u0Var, new b(this.f20965c, this.f20966d, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super kotlinx.coroutines.p2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {com.planner5d.library.engine.input.f.b.f160690g0, com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nLongPressTextDragObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,106:1\n103#2:107\n35#2,5:108\n104#2:113\n*S KotlinDebug\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n*L\n92#1:107\n92#1:108,5\n92#1:113\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f20975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k5 f20976d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k5 k5Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f20976d = k5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f20976d, dVar);
            bVar.f20975c = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        
            if (r14 == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:18:0x006d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r13.f20974b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r1 = r13.f20973a
                androidx.compose.ui.input.pointer.c0 r1 = (androidx.compose.ui.input.pointer.c0) r1
                java.lang.Object r4 = r13.f20975c
                r12 = 4
                androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                kotlin.ResultKt.m(r14)
                r7 = r13
                goto L6d
            L1c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L24:
                java.lang.Object r1 = r13.f20975c
                r12 = 5
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r12 = 5
                kotlin.ResultKt.m(r14)
                r7 = r13
                goto L4c
            L2f:
                kotlin.ResultKt.m(r14)
                java.lang.Object r14 = r13.f20975c
                r4 = r14
                androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                r12 = 0
                r13.f20975c = r4
                r13.f20974b = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r12 = r8
                r9 = 0
                r7 = r13
                r7 = r13
                r12 = 3
                java.lang.Object r14 = androidx.compose.foundation.gestures.c5.g(r4, r5, r6, r7, r8, r9)
                if (r14 != r0) goto L4b
                goto L6c
            L4b:
                r1 = r4
            L4c:
                r12 = 7
                androidx.compose.ui.input.pointer.c0 r14 = (androidx.compose.ui.input.pointer.c0) r14
                androidx.compose.foundation.text.k5 r13 = r7.f20976d
                r12 = 2
                long r4 = r14.u()
                r12 = 0
                r13.b(r4)
                r4 = r1
                r1 = r14
            L5c:
                r7.f20975c = r4
                r7.f20973a = r1
                r7.f20974b = r2
                r12 = 6
                r13 = 0
                r12 = 7
                java.lang.Object r14 = androidx.compose.ui.input.pointer.c.d1(r4, r13, r7, r3, r13)
                r12 = 7
                if (r14 != r0) goto L6d
            L6c:
                return r0
            L6d:
                androidx.compose.ui.input.pointer.q r14 = (androidx.compose.ui.input.pointer.q) r14
                java.util.List r13 = r14.e()
                r14 = r13
                r14 = r13
                r12 = 0
                java.util.Collection r14 = (java.util.Collection) r14
                int r14 = r14.size()
                r12 = 0
                r5 = 0
            L7e:
                if (r5 >= r14) goto La1
                java.lang.Object r6 = r13.get(r5)
                androidx.compose.ui.input.pointer.c0 r6 = (androidx.compose.ui.input.pointer.c0) r6
                long r8 = r6.s()
                long r10 = r1.s()
                r12 = 0
                boolean r8 = androidx.compose.ui.input.pointer.b0.d(r8, r10)
                r12 = 2
                if (r8 == 0) goto L9e
                r12 = 4
                boolean r6 = r6.w()
                if (r6 == 0) goto L9e
                goto L5c
            L9e:
                int r5 = r5 + 1
                goto L7e
            La1:
                r12 = 6
                androidx.compose.foundation.text.k5 r13 = r7.f20976d
                r13.e()
                kotlin.Unit r13 = kotlin.Unit.f312394a
                r12 = 7
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.s4.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Object k(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull k5 k5Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new a(l0Var, k5Var, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Nullable
    public static final Object l(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull final k5 k5Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objX = androidx.compose.foundation.gestures.x1.X(l0Var, new Function1() { // from class: androidx.compose.foundation.text.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s4.m(k5Var, (n0.g) obj);
            }
        }, new Function0() { // from class: androidx.compose.foundation.text.p4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s4.n(k5Var);
            }
        }, new Function0() { // from class: androidx.compose.foundation.text.q4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s4.o(k5Var);
            }
        }, new Function2() { // from class: androidx.compose.foundation.text.r4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return s4.p(k5Var, (androidx.compose.ui.input.pointer.c0) obj, (n0.g) obj2);
            }
        }, dVar);
        return objX == kotlin.coroutines.intrinsics.b.l() ? objX : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(k5 k5Var, n0.g gVar) {
        k5Var.d(gVar.B());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(k5 k5Var) {
        k5Var.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(k5 k5Var) {
        k5Var.onCancel();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(k5 k5Var, androidx.compose.ui.input.pointer.c0 c0Var, n0.g gVar) {
        k5Var.c(gVar.B());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(androidx.compose.ui.input.pointer.l0 l0Var, final k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
        Object objK = androidx.compose.foundation.gestures.x1.K(l0Var, new Function1() { // from class: androidx.compose.foundation.text.k4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s4.r(k5Var, (n0.g) obj);
            }
        }, new Function0() { // from class: androidx.compose.foundation.text.l4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s4.s(k5Var);
            }
        }, new Function0() { // from class: androidx.compose.foundation.text.m4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s4.t(k5Var);
            }
        }, new Function2() { // from class: androidx.compose.foundation.text.n4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return s4.u(k5Var, (androidx.compose.ui.input.pointer.c0) obj, (n0.g) obj2);
            }
        }, dVar);
        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(k5 k5Var, n0.g gVar) {
        k5Var.d(gVar.B());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(k5 k5Var) {
        k5Var.a();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(k5 k5Var) {
        k5Var.onCancel();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(k5 k5Var, androidx.compose.ui.input.pointer.c0 c0Var, n0.g gVar) {
        k5Var.c(gVar.B());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object v(androidx.compose.ui.input.pointer.l0 l0Var, k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = androidx.compose.foundation.gestures.e3.e(l0Var, new b(k5Var, null), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }
}
