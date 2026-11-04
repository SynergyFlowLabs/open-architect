package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,120:1\n326#2:121\n326#2:136\n103#3:122\n35#3,5:123\n104#3:128\n103#3:129\n35#3,5:130\n104#3:135\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:121\n98#1:136\n71#1:122\n71#1:123,5\n71#1:128\n85#1:129\n85#1:130,5\n85#1:135\n*E\n"})
public final class e3 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14543b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f14543b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14542a;
            int i11 = 6 | 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f14543b;
                this.f14542a = 1;
                if (e3.d(cVar, null, this, 1, null) == objL) {
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
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.B0}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp", "pass"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14547d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14546c = obj;
            this.f14547d |= Integer.MIN_VALUE;
            return e3.b(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {102, 105, 110}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f14550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> f14551d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(CoroutineContext coroutineContext, Function2<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f14550c = coroutineContext;
            this.f14551d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f14550c, this.f14551d, dVar);
            cVar.f14549b = obj;
            return cVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:42|22|23|(1:25)(2:26|27)|36) */
        /* JADX WARN: Code duplicated, block: B:25:0x005d  */
        /* JADX WARN: Code duplicated, block: B:26:0x005f  */
        /* JADX WARN: Code duplicated, block: B:34:0x0079  */
        /* JADX WARN: Code duplicated, block: B:37:0x0086  */
        /* JADX WARN: Code duplicated, block: B:38:0x0087  */
        /* JADX WARN: Code duplicated, block: B:42:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
        
            if (r10 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        
            r1 = r10;
            r10 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
        
            if (androidx.compose.foundation.gestures.e3.d(r1, null, r9, 1, null) == r0) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0068 -> B:13:0x002f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0083 -> B:13:0x002f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f14548a
                r2 = 3
                r8 = 7
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L3d
                r8 = 0
                if (r1 == r5) goto L34
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1c
                java.lang.Object r1 = r9.f14549b
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.ResultKt.m(r10)
                goto L2f
            L1c:
                r8 = 1
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r8 = 4
                r9.<init>(r10)
                throw r9
            L26:
                r8 = 0
                java.lang.Object r1 = r9.f14549b
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r8 = 2
                kotlin.ResultKt.m(r10)     // Catch: java.util.concurrent.CancellationException -> L31
            L2f:
                r10 = r1
                goto L45
            L31:
                r10 = move-exception
                r8 = 1
                goto L70
            L34:
                java.lang.Object r1 = r9.f14549b
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r8 = 5
                kotlin.ResultKt.m(r10)     // Catch: java.util.concurrent.CancellationException -> L31
                goto L60
            L3d:
                kotlin.ResultKt.m(r10)
                r8 = 5
                java.lang.Object r10 = r9.f14549b
                androidx.compose.ui.input.pointer.c r10 = (androidx.compose.ui.input.pointer.c) r10
            L45:
                r8 = 4
                kotlin.coroutines.CoroutineContext r1 = r9.f14550c
                boolean r1 = kotlinx.coroutines.s2.D(r1)
                if (r1 == 0) goto L87
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r9.f14551d     // Catch: java.util.concurrent.CancellationException -> L6b
                r8 = 0
                r9.f14549b = r10     // Catch: java.util.concurrent.CancellationException -> L6b
                r9.f14548a = r5     // Catch: java.util.concurrent.CancellationException -> L6b
                r8 = 3
                java.lang.Object r1 = r1.invoke(r10, r9)     // Catch: java.util.concurrent.CancellationException -> L6b
                r8 = 7
                if (r1 != r0) goto L5f
                r8 = 6
                goto L85
            L5f:
                r1 = r10
            L60:
                r9.f14549b = r1     // Catch: java.util.concurrent.CancellationException -> L31
                r9.f14548a = r3     // Catch: java.util.concurrent.CancellationException -> L31
                java.lang.Object r10 = androidx.compose.foundation.gestures.e3.d(r1, r4, r9, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L31
                if (r10 != r0) goto L2f
                goto L85
            L6b:
                r1 = move-exception
                r7 = r1
                r1 = r10
                r1 = r10
                r10 = r7
            L70:
                r8 = 3
                kotlin.coroutines.CoroutineContext r6 = r9.f14550c
                boolean r6 = kotlinx.coroutines.s2.D(r6)
                if (r6 == 0) goto L86
                r8 = 0
                r9.f14549b = r1
                r9.f14548a = r2
                java.lang.Object r10 = androidx.compose.foundation.gestures.e3.d(r1, r4, r9, r5, r4)
                r8 = 4
                if (r10 != r0) goto L2f
            L85:
                return r0
            L86:
                throw r10
            L87:
                r8 = 1
                kotlin.Unit r9 = kotlin.Unit.f312394a
                r8 = 5
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e3.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {48, 51, com.planner5d.library.engine.input.f.b.f160729t0}, m = "forEachGesture", n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f14554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14556e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14555d = obj;
            this.f14556e |= Integer.MIN_VALUE;
            return e3.f(null, null, this);
        }
    }

    public static final boolean a(@NotNull androidx.compose.ui.input.pointer.c cVar) {
        List<androidx.compose.ui.input.pointer.c0> listE = cVar.J6().e();
        int size = listE.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (listE.get(i10).w()) {
                z10 = true;
                break;
            }
        }
        return !z10;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b A[LOOP:0: B:21:0x0077->B:26:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:20:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r8, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.s r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r7 = 0
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.e3.b
            r7 = 1
            if (r0 == 0) goto L17
            r0 = r10
            r0 = r10
            androidx.compose.foundation.gestures.e3$b r0 = (androidx.compose.foundation.gestures.e3.b) r0
            int r1 = r0.f14547d
            r7 = 5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f14547d = r1
            goto L1d
        L17:
            androidx.compose.foundation.gestures.e3$b r0 = new androidx.compose.foundation.gestures.e3$b
            r7 = 7
            r0.<init>(r10)
        L1d:
            java.lang.Object r10 = r0.f14546c
            r7 = 6
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14547d
            r7 = 3
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L3f
            java.lang.Object r8 = r0.f14545b
            androidx.compose.ui.input.pointer.s r8 = (androidx.compose.ui.input.pointer.s) r8
            java.lang.Object r9 = r0.f14544a
            r7 = 6
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.ui.input.pointer.c) r9
            r7 = 4
            kotlin.ResultKt.m(r10)
            r6 = r9
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = 2
            goto L67
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 7
            java.lang.String r9 = "/esekecw i ro  //uro/mii/ooo tfsllr/entece/b /ahvtu"
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            r7 = 7
            throw r8
        L4b:
            kotlin.ResultKt.m(r10)
            boolean r10 = a(r8)
            r7 = 7
            if (r10 != 0) goto L8e
        L55:
            r7 = 3
            r0.f14544a = r8
            r7 = 7
            r0.f14545b = r9
            r7 = 2
            r0.f14547d = r3
            java.lang.Object r10 = r8.I6(r9, r0)
            r7 = 4
            if (r10 != r1) goto L67
            r7 = 6
            return r1
        L67:
            androidx.compose.ui.input.pointer.q r10 = (androidx.compose.ui.input.pointer.q) r10
            r7 = 0
            java.util.List r10 = r10.e()
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r7 = 5
            r4 = 0
        L77:
            r7 = 1
            if (r4 >= r2) goto L8e
            r7 = 6
            java.lang.Object r5 = r10.get(r4)
            r7 = 5
            androidx.compose.ui.input.pointer.c0 r5 = (androidx.compose.ui.input.pointer.c0) r5
            boolean r5 = r5.w()
            r7 = 6
            if (r5 == 0) goto L8b
            r7 = 5
            goto L55
        L8b:
            int r4 = r4 + 1
            goto L77
        L8e:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            r7 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e3.b(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.s, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public static final Object c(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG5 = l0Var.g5(new a(null), dVar);
        return objG5 == kotlin.coroutines.intrinsics.b.l() ? objG5 : Unit.f312394a;
    }

    public static /* synthetic */ Object d(androidx.compose.ui.input.pointer.c cVar, androidx.compose.ui.input.pointer.s sVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = androidx.compose.ui.input.pointer.s.Final;
        }
        return b(cVar, sVar, dVar);
    }

    @Nullable
    public static final Object e(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull Function2<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 4 ^ 0;
        Object objG5 = l0Var.g5(new c(dVar.getContext(), function2, null), dVar);
        return objG5 == kotlin.coroutines.intrinsics.b.l() ? objG5 : Unit.f312394a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:46|28|(1:30)(3:31|32|33)|42) */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r2 = r9;
        r9 = r11;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        if (c(r2, r0) == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.l0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.l0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.input.pointer.l0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ad -> B:19:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00cd -> B:19:0x0063). Please report as a decompilation issue!!! */
    @kotlin.l(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @kotlin.b1(expression = "awaitEachGesture(block)", imports = {}))
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.l0 r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.l0, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e3.f(androidx.compose.ui.input.pointer.l0, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }
}
