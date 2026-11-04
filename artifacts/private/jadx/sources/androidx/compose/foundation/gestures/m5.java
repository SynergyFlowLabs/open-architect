package androidx.compose.foundation.gestures;

import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,399:1\n326#2:400\n1#3:401\n35#4,5:402\n103#4:407\n35#4,5:408\n104#4:413\n35#4,5:414\n103#4:419\n35#4,5:420\n104#4:425\n103#4:426\n35#4,5:427\n104#4:432\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n268#1:400\n322#1:402,5\n340#1:407\n340#1:408,5\n340#1:413\n376#1:414,5\n387#1:419\n387#1:420,5\n387#1:425\n388#1:426\n388#1:427,5\n388#1:432\n*E\n"})
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f14814a = 545.0f;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {312}, m = "awaitCtrlMouseScrollOrNull", n = {"$this$awaitCtrlMouseScrollOrNull", "scrollConfig"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14818d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14817c = obj;
            this.f14818d |= Integer.MIN_VALUE;
            return m5.f(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {299}, m = "awaitFirstCtrlMouseScroll", n = {"$this$awaitFirstCtrlMouseScroll", "scrollConfig"}, s = {"L$0", "L$1"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14822d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14821c = obj;
            this.f14822d |= Integer.MIN_VALUE;
            return m5.g(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {337, 339, 385}, m = "detectZoom", n = {"$this$detectZoom", AppsFlyerProperties.CHANNEL, "canPan", "panZoomLock", androidx.constraintlayout.motion.widget.f.f45124i, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", AppsFlyerProperties.CHANNEL, "canPan", "panZoomLock", androidx.constraintlayout.motion.widget.f.f45124i, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", AppsFlyerProperties.CHANNEL, "canPan", androidx.core.app.w.I0, "panZoomLock", androidx.constraintlayout.motion.widget.f.f45124i, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "canceled"}, s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f14825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f14826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f14827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f14828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f14829g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f14830h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        long f14831i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f14832j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f14833k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f14834l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f14835m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14836n;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14835m = obj;
            this.f14836n |= Integer.MIN_VALUE;
            return m5.h(null, false, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", f = "Transformable.kt", i = {0, 1}, l = {com.badlogic.gdx.utils.compression.lzma.a.f95331z, 284}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,399:1\n69#2:400\n70#3:401\n22#4:402\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n*L\n276#1:400\n276#1:401\n276#1:402\n*E\n"})
    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f14839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u3 f14840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<i5> f14841e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CoroutineContext coroutineContext, u3 u3Var, kotlinx.coroutines.channels.p<i5> pVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f14839c = coroutineContext;
            this.f14840d = u3Var;
            this.f14841e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f14839c, this.f14840d, this.f14841e, dVar);
            dVar2.f14838b = obj;
            return dVar2;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0047 A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0017, B:28:0x00a3, B:30:0x00a8, B:24:0x0065, B:20:0x0047, B:23:0x0056, B:15:0x0030), top: B:37:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0054  */
        /* JADX WARN: Code duplicated, block: B:23:0x0056 A[Catch: all -> 0x001d, PHI: r1 r14
          0x0056: PHI (r1v2 androidx.compose.ui.input.pointer.c) = (r1v3 androidx.compose.ui.input.pointer.c), (r1v7 androidx.compose.ui.input.pointer.c) binds: [B:21:0x0052, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x0056: PHI (r14v4 java.lang.Object) = (r14v10 java.lang.Object), (r14v0 java.lang.Object) binds: [B:21:0x0052, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0017, B:28:0x00a3, B:30:0x00a8, B:24:0x0065, B:20:0x0047, B:23:0x0056, B:15:0x0030), top: B:37:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
        
            if (r14 == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009f -> B:28:0x00a3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                r12 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r12 = 0
                int r1 = r13.f14837a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L35
                r12 = 0
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L21
                r12 = 6
                java.lang.Object r1 = r13.f14838b
                r12 = 0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r12 = 0
                kotlin.ResultKt.m(r14)     // Catch: java.lang.Throwable -> L1d
                goto La3
            L1d:
                r0 = move-exception
                r14 = r0
                goto Lb6
            L21:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "o stofeluslker o/i w/e i atnemr/rntvocbu/ e//coe/hi"
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                r12 = 1
                throw r13
            L2c:
                java.lang.Object r1 = r13.f14838b
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r12 = 5
                kotlin.ResultKt.m(r14)     // Catch: java.lang.Throwable -> L1d
                goto L56
            L35:
                kotlin.ResultKt.m(r14)
                java.lang.Object r14 = r13.f14838b
                r12 = 3
                androidx.compose.ui.input.pointer.c r14 = (androidx.compose.ui.input.pointer.c) r14
                r1 = r14
            L3e:
                kotlin.coroutines.CoroutineContext r14 = r13.f14839c
                boolean r14 = kotlinx.coroutines.s2.D(r14)
                r12 = 6
                if (r14 == 0) goto Lbe
                androidx.compose.foundation.gestures.u3 r14 = r13.f14840d     // Catch: java.lang.Throwable -> L1d
                r13.f14838b = r1     // Catch: java.lang.Throwable -> L1d
                r13.f14837a = r3     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r14 = androidx.compose.foundation.gestures.m5.c(r1, r14, r13)     // Catch: java.lang.Throwable -> L1d
                r12 = 7
                if (r14 != r0) goto L56
                r12 = 5
                goto La1
            L56:
                n0.g r14 = (n0.g) r14     // Catch: java.lang.Throwable -> L1d
                long r4 = r14.B()     // Catch: java.lang.Throwable -> L1d
                r12 = 1
                kotlinx.coroutines.channels.p<androidx.compose.foundation.gestures.i5> r14 = r13.f14841e     // Catch: java.lang.Throwable -> L1d
                androidx.compose.foundation.gestures.i5$b r6 = androidx.compose.foundation.gestures.i5.b.f14617a     // Catch: java.lang.Throwable -> L1d
                r12 = 6
                r14.p(r6)     // Catch: java.lang.Throwable -> L1d
            L65:
                r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r4 = r4 & r6
                int r14 = (int) r4     // Catch: java.lang.Throwable -> L1d
                float r14 = java.lang.Float.intBitsToFloat(r14)     // Catch: java.lang.Throwable -> L1d
                r12 = 6
                r4 = 1141391360(0x44084000, float:545.0)
                float r14 = r14 / r4
                r4 = 1073741824(0x40000000, float:2.0)
                double r4 = (double) r4     // Catch: java.lang.Throwable -> L1d
                double r6 = (double) r14     // Catch: java.lang.Throwable -> L1d
                r12 = 2
                double r4 = java.lang.Math.pow(r4, r6)     // Catch: java.lang.Throwable -> L1d
                float r7 = (float) r4     // Catch: java.lang.Throwable -> L1d
                kotlinx.coroutines.channels.p<androidx.compose.foundation.gestures.i5> r14 = r13.f14841e     // Catch: java.lang.Throwable -> L1d
                androidx.compose.foundation.gestures.i5$a r6 = new androidx.compose.foundation.gestures.i5$a     // Catch: java.lang.Throwable -> L1d
                n0.g$a r4 = n0.g.f332700b     // Catch: java.lang.Throwable -> L1d
                long r8 = r4.e()     // Catch: java.lang.Throwable -> L1d
                r12 = 1
                r10 = 0
                r11 = 0
                r6.<init>(r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L1d
                r14.p(r6)     // Catch: java.lang.Throwable -> L1d
                androidx.compose.foundation.gestures.u3 r14 = r13.f14840d     // Catch: java.lang.Throwable -> L1d
                r13.f14838b = r1     // Catch: java.lang.Throwable -> L1d
                r12 = 1
                r13.f14837a = r2     // Catch: java.lang.Throwable -> L1d
                r12 = 6
                java.lang.Object r14 = androidx.compose.foundation.gestures.m5.b(r1, r14, r13)     // Catch: java.lang.Throwable -> L1d
                r12 = 1
                if (r14 != r0) goto La3
            La1:
                r12 = 4
                return r0
            La3:
                n0.g r14 = (n0.g) r14     // Catch: java.lang.Throwable -> L1d
                r12 = 0
                if (r14 == 0) goto Lae
                long r4 = r14.B()     // Catch: java.lang.Throwable -> L1d
                r12 = 0
                goto L65
            Lae:
                kotlinx.coroutines.channels.p<androidx.compose.foundation.gestures.i5> r14 = r13.f14841e
                androidx.compose.foundation.gestures.i5$c r4 = androidx.compose.foundation.gestures.i5.c.f14619a
                r14.p(r4)
                goto L3e
            Lb6:
                kotlinx.coroutines.channels.p<androidx.compose.foundation.gestures.i5> r13 = r13.f14841e
                androidx.compose.foundation.gestures.i5$c r0 = androidx.compose.foundation.gestures.i5.c.f14619a
                r13.p(r0)
                throw r14
            Lbe:
                kotlin.Unit r13 = kotlin.Unit.f312394a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.m5.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(androidx.compose.ui.input.pointer.c cVar, u3 u3Var, kotlin.coroutines.d<? super n0.g> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f14818d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f14818d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objD1 = aVar.f14817c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f14818d;
        if (i11 == 0) {
            ResultKt.m(objD1);
            aVar.f14815a = cVar;
            aVar.f14816b = u3Var;
            aVar.f14818d = 1;
            objD1 = androidx.compose.ui.input.pointer.c.d1(cVar, null, aVar, 1, null);
            if (objD1 == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3Var = (u3) aVar.f14816b;
            cVar = (androidx.compose.ui.input.pointer.c) aVar.f14815a;
            ResultKt.m(objD1);
        }
        androidx.compose.ui.input.pointer.q qVar = (androidx.compose.ui.input.pointer.q) objD1;
        if (!androidx.compose.ui.input.pointer.v.i(qVar.h()) || !androidx.compose.ui.input.pointer.u.k(qVar.j(), androidx.compose.ui.input.pointer.u.f39127b.f())) {
            return null;
        }
        long jC = u3Var.c(cVar, qVar, cVar.a());
        if (n0.g.l(jC, n0.g.f332700b.e())) {
            return null;
        }
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        for (int i12 = 0; i12 < size; i12++) {
            listE.get(i12).a();
        }
        return n0.g.d(jC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0051 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(androidx.compose.ui.input.pointer.c r6, androidx.compose.foundation.gestures.u3 r7, kotlin.coroutines.d<? super n0.g> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.m5.b
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.m5$b r0 = (androidx.compose.foundation.gestures.m5.b) r0
            int r1 = r0.f14822d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14822d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.m5$b r0 = new androidx.compose.foundation.gestures.m5$b
            r0.<init>(r8)
        L18:
            r5 = 1
            java.lang.Object r8 = r0.f14821c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14822d
            r3 = 1
            r5 = 4
            if (r2 == 0) goto L42
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f14820b
            androidx.compose.foundation.gestures.u3 r6 = (androidx.compose.foundation.gestures.u3) r6
            java.lang.Object r7 = r0.f14819a
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.ui.input.pointer.c) r7
            r5 = 2
            kotlin.ResultKt.m(r8)
            r4 = r7
            r7 = r6
            r6 = r4
            r5 = 3
            goto L55
        L38:
            r5 = 5
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6.<init>(r7)
            throw r6
        L42:
            kotlin.ResultKt.m(r8)
        L45:
            r0.f14819a = r6
            r0.f14820b = r7
            r0.f14822d = r3
            r5 = 1
            java.lang.Object r8 = f(r6, r7, r0)
            r5 = 4
            if (r8 != r1) goto L55
            r5 = 7
            return r1
        L55:
            r5 = 2
            n0.g r8 = (n0.g) r8
            r5 = 2
            if (r8 == 0) goto L45
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.m5.g(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.gestures.u3, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:107:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x014b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0159 A[LOOP:2: B:28:0x0149->B:32:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x02af -> B:85:0x02be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.c r29, boolean r30, kotlinx.coroutines.channels.p<androidx.compose.foundation.gestures.i5> r31, kotlin.jvm.functions.Function1<? super n0.g, java.lang.Boolean> r32, kotlin.coroutines.d<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.m5.h(androidx.compose.ui.input.pointer.c, boolean, kotlinx.coroutines.channels.p, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(androidx.compose.ui.input.pointer.l0 l0Var, kotlinx.coroutines.channels.p<i5> pVar, u3 u3Var, kotlin.coroutines.d<? super Unit> dVar) {
        Object objG5 = l0Var.g5(new d(dVar.getContext(), u3Var, pVar, null), dVar);
        return objG5 == kotlin.coroutines.intrinsics.b.l() ? objG5 : Unit.f312394a;
    }

    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, @NotNull p5 p5Var, @NotNull Function1<? super n0.g, Boolean> function1, boolean z10, boolean z11) {
        return a0Var.B2(new TransformableElement(p5Var, function1, z10, z11));
    }

    @NotNull
    public static final androidx.compose.ui.a0 k(@NotNull androidx.compose.ui.a0 a0Var, @NotNull p5 p5Var, boolean z10, boolean z11) {
        return j(a0Var, p5Var, new Function1() { // from class: androidx.compose.foundation.gestures.l5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m5.n((n0.g) obj));
            }
        }, z10, z11);
    }

    public static /* synthetic */ androidx.compose.ui.a0 l(androidx.compose.ui.a0 a0Var, p5 p5Var, Function1 function1, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return j(a0Var, p5Var, function1, z10, z11);
    }

    public static /* synthetic */ androidx.compose.ui.a0 m(androidx.compose.ui.a0 a0Var, p5 p5Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return k(a0Var, p5Var, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(n0.g gVar) {
        return true;
    }
}
