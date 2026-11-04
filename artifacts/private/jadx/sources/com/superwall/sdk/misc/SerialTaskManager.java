package com.superwall.sdk.misc;

import java.util.LinkedList;
import java.util.Queue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SerialTaskManager {

    @NotNull
    private final s0 coroutineScope;

    @Nullable
    private a1<Unit> currentTask;

    @NotNull
    private final Queue<Function1<kotlin.coroutines.d<? super Unit>, Object>> taskQueue;

    /* JADX INFO: renamed from: com.superwall.sdk.misc.SerialTaskManager$addTask$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.misc.SerialTaskManager$addTask$1", f = "SerialTaskManager.kt", i = {}, l = {17, 24}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> $task;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$task = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return SerialTaskManager.this.new AnonymousClass1(this.$task, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (r6.executeNextTask(r5) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 5
                int r1 = r5.label
                r4 = 4
                r2 = 2
                r3 = 1
                r4 = 6
                if (r1 == 0) goto L28
                if (r1 == r3) goto L24
                r4 = 6
                if (r1 != r2) goto L18
                r4 = 5
                kotlin.ResultKt.m(r6)
                r4 = 2
                goto L63
            L18:
                r4 = 7
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 2
                java.lang.String r6 = "aesetuni/nt/kecrr oi/l /firtolv bwo/c  eesmu/e o/o/"
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L24:
                kotlin.ResultKt.m(r6)
                goto L3e
            L28:
                r4 = 1
                kotlin.ResultKt.m(r6)
                com.superwall.sdk.misc.SerialTaskManager r6 = com.superwall.sdk.misc.SerialTaskManager.this
                kotlinx.coroutines.a1 r6 = com.superwall.sdk.misc.SerialTaskManager.access$getCurrentTask$p(r6)
                r4 = 4
                if (r6 == 0) goto L3e
                r5.label = r3
                java.lang.Object r6 = r6.q(r5)
                if (r6 != r0) goto L3e
                goto L61
            L3e:
                com.superwall.sdk.misc.SerialTaskManager r6 = com.superwall.sdk.misc.SerialTaskManager.this
                java.util.Queue r6 = com.superwall.sdk.misc.SerialTaskManager.access$getTaskQueue$p(r6)
                kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r5.$task
                r6.offer(r1)
                com.superwall.sdk.misc.SerialTaskManager r6 = com.superwall.sdk.misc.SerialTaskManager.this
                r4 = 3
                java.util.Queue r6 = com.superwall.sdk.misc.SerialTaskManager.access$getTaskQueue$p(r6)
                r4 = 5
                int r6 = r6.size()
                if (r6 != r3) goto L63
                com.superwall.sdk.misc.SerialTaskManager r6 = com.superwall.sdk.misc.SerialTaskManager.this
                r5.label = r2
                java.lang.Object r5 = com.superwall.sdk.misc.SerialTaskManager.access$executeNextTask(r6, r5)
                if (r5 != r0) goto L63
            L61:
                r4 = 2
                return r0
            L63:
                r4 = 1
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.misc.SerialTaskManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.misc.SerialTaskManager$executeNextTask$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.misc.SerialTaskManager", f = "SerialTaskManager.kt", i = {0}, l = {43, 47}, m = "executeNextTask", n = {"this"}, s = {"L$0"})
    static final class C26631 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26631(kotlin.coroutines.d<? super C26631> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SerialTaskManager.this.executeNextTask(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.misc.SerialTaskManager$executeNextTask$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.misc.SerialTaskManager$executeNextTask$2", f = "SerialTaskManager.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> $nextTask;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$nextTask = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(this.$nextTask, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.$nextTask;
                this.label = 1;
                if (function1.invoke(this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerialTaskManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r13.executeNextTask(r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeNextTask(kotlin.coroutines.d<? super kotlin.Unit> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.superwall.sdk.misc.SerialTaskManager.C26631
            r12 = 3
            if (r0 == 0) goto L17
            r0 = r14
            r12 = 0
            com.superwall.sdk.misc.SerialTaskManager$executeNextTask$1 r0 = (com.superwall.sdk.misc.SerialTaskManager.C26631) r0
            int r1 = r0.label
            r12 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            r12 = 7
            int r1 = r1 - r2
            r0.label = r1
            goto L1d
        L17:
            com.superwall.sdk.misc.SerialTaskManager$executeNextTask$1 r0 = new com.superwall.sdk.misc.SerialTaskManager$executeNextTask$1
            r12 = 1
            r0.<init>(r14)
        L1d:
            r12 = 4
            java.lang.Object r14 = r0.result
            r12 = 7
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r12 = 2
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            r12 = 1
            if (r2 == r5) goto L41
            r12 = 1
            if (r2 != r4) goto L37
            kotlin.ResultKt.m(r14)
            goto La2
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "//sfon eu/ole/erot/tloasekc o/bne ii/rhviucemr   w/"
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L41:
            r12 = 0
            java.lang.Object r13 = r0.L$0
            r12 = 7
            com.superwall.sdk.misc.SerialTaskManager r13 = (com.superwall.sdk.misc.SerialTaskManager) r13
            kotlin.ResultKt.m(r14)
            goto L8c
        L4b:
            kotlin.ResultKt.m(r14)
            java.util.Queue<kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object>> r14 = r13.taskQueue
            boolean r14 = r14.isEmpty()
            r12 = 0
            if (r14 == 0) goto L5b
            r12 = 3
            kotlin.Unit r13 = kotlin.Unit.f312394a
            return r13
        L5b:
            java.util.Queue<kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object>> r14 = r13.taskQueue
            java.lang.Object r14 = r14.poll()
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            if (r14 != 0) goto L69
            r12 = 0
            kotlin.Unit r13 = kotlin.Unit.f312394a
            return r13
        L69:
            kotlinx.coroutines.s0 r6 = r13.coroutineScope
            com.superwall.sdk.misc.SerialTaskManager$executeNextTask$2 r9 = new com.superwall.sdk.misc.SerialTaskManager$executeNextTask$2
            r9.<init>(r14, r3)
            r10 = 3
            r11 = 0
            r7 = 0
            r12 = 1
            r8 = 0
            kotlinx.coroutines.a1 r14 = kotlinx.coroutines.i.b(r6, r7, r8, r9, r10, r11)
            r12 = 6
            r13.currentTask = r14
            r12 = 3
            if (r14 == 0) goto L8c
            r12 = 7
            r0.L$0 = r13
            r0.label = r5
            java.lang.Object r14 = r14.q(r0)
            r12 = 2
            if (r14 != r1) goto L8c
            goto La1
        L8c:
            r12 = 3
            java.util.Queue<kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object>> r14 = r13.taskQueue
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto La5
            r12 = 7
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r13 = r13.executeNextTask(r0)
            r12 = 1
            if (r13 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r13 = kotlin.Unit.f312394a
            return r13
        La5:
            r12 = 3
            kotlin.Unit r13 = kotlin.Unit.f312394a
            r12 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.misc.SerialTaskManager.executeNextTask(kotlin.coroutines.d):java.lang.Object");
    }

    public final void addTask(@NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        k.f(this.coroutineScope, null, null, new AnonymousClass1(task, null), 3, null);
    }

    public SerialTaskManager(@NotNull s0 coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.taskQueue = new LinkedList();
    }

    public /* synthetic */ SerialTaskManager(s0 s0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? t0.a(n0.d0(l1.c(), 1, null, 2, null)) : s0Var);
    }
}
