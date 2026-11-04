package androidx.compose.material3.internal;

import androidx.compose.material3.zw;
import androidx.compose.runtime.d7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimatedShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedShape.kt\nandroidx/compose/material3/internal/AnimatedShapeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,148:1\n75#2:149\n1282#3,6:150\n1282#3,6:156\n1282#3,6:162\n1282#3,6:168\n1282#3,6:174\n*S KotlinDebug\n*F\n+ 1 AnimatedShape.kt\nandroidx/compose/material3/internal/AnimatedShapeKt\n*L\n91#1:149\n94#1:150,6\n134#1:156,6\n136#1:162,6\n138#1:168,6\n139#1:174,6\n*E\n"})
public final class h0 {

    @SourceDebugExtension({"SMAP\nAnimatedShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedShape.kt\nandroidx/compose/material3/internal/AnimatedShapeKt$rememberAnimatedShape$1$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,148:1\n85#2:149\n117#2,2:150\n61#3:152\n70#4:153\n22#5:154\n*S KotlinDebug\n*F\n+ 1 AnimatedShape.kt\nandroidx/compose/material3/internal/AnimatedShapeKt$rememberAnimatedShape$1$1\n*L\n96#1:149\n96#1:150,2\n115#1:152\n115#1:153\n115#1:154\n*E\n"})
    public static final class a implements zw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.compose.runtime.n3 f28901a = d7.g(kotlin.ranges.r.e(0.0f, 1.0f), null, 2, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0 f28902b;

        a(i0 i0Var) {
            this.f28902b = i0Var;
        }

        public final kotlin.ranges.f<Float> a() {
            return (kotlin.ranges.f) this.f28901a.getValue();
        }

        public final void b(kotlin.ranges.f<Float> fVar) {
            this.f28901a.setValue(fVar);
        }

        @Override // androidx.compose.ui.graphics.q3
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public androidx.compose.ui.graphics.f2 mo0createOutlinePq9zytI(long j10, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar) {
            this.f28902b.o(j10);
            b(kotlin.ranges.r.e(0.0f, Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10)) / 2));
            int i10 = 0 << 0;
            return androidx.compose.foundation.shape.o.b(((Number) kotlin.ranges.r.N(Float.valueOf(i0.s(this.f28902b, 0L, null, 3, null)), a())).floatValue(), ((Number) kotlin.ranges.r.N(Float.valueOf(i0.q(this.f28902b, 0L, null, 3, null)), a())).floatValue(), ((Number) kotlin.ranges.r.N(Float.valueOf(i0.g(this.f28902b, 0L, null, 3, null)), a())).floatValue(), ((Number) kotlin.ranges.r.N(Float.valueOf(i0.i(this.f28902b, 0L, null, 3, null)), a())).floatValue()).mo0createOutlinePq9zytI(j10, wVar, dVar);
        }

        @Override // androidx.compose.material3.zw
        public float offset() {
            int i10 = 5 << 3;
            float f10 = 2;
            return (((((Number) kotlin.ranges.r.N(Float.valueOf(i0.s(this.f28902b, 0L, null, 3, null)), a())).floatValue() + ((Number) kotlin.ranges.r.N(Float.valueOf(i0.i(this.f28902b, 0L, null, 3, null)), a())).floatValue()) / f10) - ((((Number) kotlin.ranges.r.N(Float.valueOf(i0.q(this.f28902b, 0L, null, 3, null)), a())).floatValue() + ((Number) kotlin.ranges.r.N(Float.valueOf(i0.g(this.f28902b, 0L, null, 3, null)), a())).floatValue()) / f10)) * 0.11f;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1", f = "AnimatedShape.kt", i = {0}, l = {androidx.media2.widget.f.i.f59773f0}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f28905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<androidx.compose.foundation.shape.n> f28906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i0 f28907e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1", f = "AnimatedShape.kt", i = {}, l = {androidx.media2.widget.f.i.f59777h0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i0 f28909b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.shape.n f28910c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i0 i0Var, androidx.compose.foundation.shape.n nVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f28909b = i0Var;
                this.f28910c = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f28909b, this.f28910c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28908a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    i0 i0Var = this.f28909b;
                    androidx.compose.foundation.shape.n nVar = this.f28910c;
                    this.f28908a = 1;
                    if (i0Var.e(nVar, this) == objL) {
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
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.channels.p<androidx.compose.foundation.shape.n> pVar, i0 i0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f28906d = pVar;
            this.f28907e = i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f28906d, this.f28907e, dVar);
            bVar.f28905c = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0042 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x004c  */
        /* JADX WARN: Code duplicated, block: B:17:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0040 -> B:12:0x0043). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x004c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r9 = 7
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r9 = 1
                int r1 = r10.f28904b
                r9 = 3
                r2 = 1
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r10.f28903a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r3 = r10.f28905c
                kotlinx.coroutines.s0 r3 = (kotlinx.coroutines.s0) r3
                kotlin.ResultKt.m(r11)
                goto L43
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = " hs/te esaolo/ nrle/ c retiv/cekbinr if/u/too/mwoeu"
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L24:
                r9 = 3
                kotlin.ResultKt.m(r11)
                java.lang.Object r11 = r10.f28905c
                kotlinx.coroutines.s0 r11 = (kotlinx.coroutines.s0) r11
                r9 = 7
                kotlinx.coroutines.channels.p<androidx.compose.foundation.shape.n> r1 = r10.f28906d
                kotlinx.coroutines.channels.r r1 = r1.iterator()
                r3 = r11
                r3 = r11
            L35:
                r9 = 4
                r10.f28905c = r3
                r10.f28903a = r1
                r10.f28904b = r2
                java.lang.Object r11 = r1.c(r10)
                if (r11 != r0) goto L43
                return r0
            L43:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                r9 = 1
                if (r11 == 0) goto L7a
                java.lang.Object r11 = r1.next()
                r9 = 3
                androidx.compose.foundation.shape.n r11 = (androidx.compose.foundation.shape.n) r11
                r9 = 3
                kotlinx.coroutines.channels.p<androidx.compose.foundation.shape.n> r4 = r10.f28906d
                java.lang.Object r4 = r4.w()
                java.lang.Object r4 = kotlinx.coroutines.channels.t.h(r4)
                androidx.compose.foundation.shape.n r4 = (androidx.compose.foundation.shape.n) r4
                r9 = 6
                if (r4 != 0) goto L64
                goto L66
            L64:
                r11 = r4
                r11 = r4
            L66:
                r9 = 7
                androidx.compose.material3.internal.h0$b$a r6 = new androidx.compose.material3.internal.h0$b$a
                androidx.compose.material3.internal.i0 r4 = r10.f28907e
                r9 = 5
                r5 = 0
                r6.<init>(r4, r11, r5)
                r7 = 6
                r7 = 3
                r8 = 0
                r4 = 0
                r9 = 0
                kotlinx.coroutines.i.e(r3, r4, r5, r6, r7, r8)
                r9 = 7
                goto L35
            L7a:
                r9 = 3
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.h0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.ui.graphics.q3 b(@NotNull final androidx.compose.foundation.shape.n nVar, @NotNull androidx.compose.animation.core.y0<Float> y0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-288714613, i10, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:131)");
        }
        boolean zD = c0Var.D(y0Var);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new i0(nVar, y0Var);
            c0Var.Y(objI0);
        }
        i0 i0Var = (i0) objI0;
        Object objI1 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI1 == aVar.a()) {
            objI1 = kotlinx.coroutines.channels.s.d(-1, null, null, 6, null);
            c0Var.Y(objI1);
        }
        final kotlinx.coroutines.channels.p pVar = (kotlinx.coroutines.channels.p) objI1;
        boolean zK0 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(nVar)) || (i10 & 6) == 4) | c0Var.k0(pVar);
        Object objI2 = c0Var.i0();
        if (zK0 || objI2 == aVar.a()) {
            objI2 = new Function0() { // from class: androidx.compose.material3.internal.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h0.d(pVar, nVar);
                }
            };
            c0Var.Y(objI2);
        }
        androidx.compose.runtime.b2.m((Function0) objI2, c0Var, 0);
        boolean zK1 = c0Var.k0(pVar) | c0Var.D(i0Var);
        Object objI3 = c0Var.i0();
        if (zK1 || objI3 == aVar.a()) {
            objI3 = new b(pVar, i0Var, null);
            c0Var.Y(objI3);
        }
        androidx.compose.runtime.b2.h(i0Var, pVar, (Function2) objI3, c0Var, 0);
        androidx.compose.ui.graphics.q3 q3VarC = c(i0Var, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarC;
    }

    @androidx.compose.runtime.o
    private static final androidx.compose.ui.graphics.q3 c(i0 i0Var, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1383367813, i10, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:89)");
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        i0Var.n(dVar);
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.D(i0Var)) || (i10 & 6) == 4) | c0Var.D(dVar);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new a(i0Var);
            c0Var.Y(objI0);
        }
        a aVar = (a) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(kotlinx.coroutines.channels.p pVar, androidx.compose.foundation.shape.n nVar) {
        pVar.p(nVar);
        return Unit.f312394a;
    }
}
