package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,255:1\n134#2,2:256\n35#2,5:258\n136#2:263\n35#2,5:264\n35#2,5:274\n35#2,5:279\n65#3:269\n69#3:272\n60#4:270\n70#4:273\n22#5:271\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,2\n116#1:258,5\n116#1:263\n131#1:264,5\n217#1:274,5\n242#1:279,5\n162#1:269\n162#1:272\n162#1:270\n162#1:273\n162#1:271\n*E\n"})
public final class j5 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {60, com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {"$this$awaitEachGesture", androidx.constraintlayout.motion.widget.f.f45124i, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", androidx.constraintlayout.motion.widget.f.f45124i, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    @SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n103#2:256\n35#2,5:257\n104#2:262\n35#2,5:263\n103#2:268\n35#2,5:269\n104#2:274\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n63#1:256\n63#1:257,5\n63#1:262\n95#1:263,5\n102#1:268\n102#1:269,5\n102#1:274\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f14670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f14671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f14672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f14673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f14675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f14676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f14677h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f14678i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pj.o<n0.g, n0.g, Float, Float, Unit> f14679j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, pj.o<? super n0.g, ? super n0.g, ? super Float, ? super Float, Unit> oVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f14678i = z10;
            this.f14679j = oVar;
            int i10 = 4 & 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f14678i, this.f14679j, dVar);
            aVar.f14677h = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00af  */
        /* JADX WARN: Code duplicated, block: B:22:0x00bd A[LOOP:0: B:18:0x00ad->B:22:0x00bd, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:74:0x00c0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x00bb A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0094 -> B:17:0x0097). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 447
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.j5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private static final float a(long j10) {
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) == 0.0f && Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a))))) * 180.0f) / 3.1415927f;
    }

    public static final long b(@NotNull androidx.compose.ui.input.pointer.q qVar, boolean z10) {
        long jE = n0.g.f332700b.e();
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.input.pointer.c0 c0Var = listE.get(i11);
            if (c0Var.w() && c0Var.z()) {
                jE = n0.g.w(jE, z10 ? c0Var.u() : c0Var.y());
                i10++;
            }
        }
        return i10 == 0 ? n0.g.f332700b.c() : n0.g.j(jE, i10);
    }

    public static /* synthetic */ long c(androidx.compose.ui.input.pointer.q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return b(qVar, z10);
    }

    public static final float d(@NotNull androidx.compose.ui.input.pointer.q qVar, boolean z10) {
        long jB = b(qVar, z10);
        float fM = 0.0f;
        if (n0.g.l(jB, n0.g.f332700b.c())) {
            return 0.0f;
        }
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.input.pointer.c0 c0Var = listE.get(i11);
            if (c0Var.w() && c0Var.z()) {
                fM += n0.g.m(n0.g.v(z10 ? c0Var.u() : c0Var.y(), jB));
                i10++;
            }
        }
        return fM / i10;
    }

    public static /* synthetic */ float e(androidx.compose.ui.input.pointer.q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return d(qVar, z10);
    }

    public static final long f(@NotNull androidx.compose.ui.input.pointer.q qVar) {
        long jB = b(qVar, true);
        n0.g.a aVar = n0.g.f332700b;
        return n0.g.l(jB, aVar.c()) ? aVar.e() : n0.g.v(jB, b(qVar, false));
    }

    public static final float g(@NotNull androidx.compose.ui.input.pointer.q qVar) {
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= size) {
                break;
            }
            androidx.compose.ui.input.pointer.c0 c0Var = listE.get(i10);
            if (!c0Var.z() || !c0Var.w()) {
                i12 = 0;
            }
            i11 += i12;
            i10++;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        long jB = b(qVar, true);
        long jB2 = b(qVar, false);
        List<androidx.compose.ui.input.pointer.c0> listE2 = qVar.e();
        int size2 = listE2.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i13 = 0; i13 < size2; i13++) {
            androidx.compose.ui.input.pointer.c0 c0Var2 = listE2.get(i13);
            if (c0Var2.w() && c0Var2.z()) {
                long jU = c0Var2.u();
                long jV = n0.g.v(c0Var2.y(), jB2);
                long jV2 = n0.g.v(jU, jB);
                float fA = a(jV2) - a(jV);
                float fM = n0.g.m(n0.g.w(jV2, jV)) / 2.0f;
                if (fA > 180.0f) {
                    fA -= 360.0f;
                } else if (fA < -180.0f) {
                    fA += 360.0f;
                }
                f11 += fA * fM;
                f10 += fM;
            }
        }
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f11 / f10;
    }

    public static final float h(@NotNull androidx.compose.ui.input.pointer.q qVar) {
        float fD = d(qVar, true);
        float fD2 = d(qVar, false);
        if (fD == 0.0f || fD2 == 0.0f) {
            return 1.0f;
        }
        return fD / fD2;
    }

    @Nullable
    public static final Object i(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, boolean z10, @NotNull pj.o<? super n0.g, ? super n0.g, ? super Float, ? super Float, Unit> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE = e3.e(l0Var, new a(z10, oVar, null), dVar);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    public static /* synthetic */ Object j(androidx.compose.ui.input.pointer.l0 l0Var, boolean z10, pj.o oVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return i(l0Var, z10, oVar, dVar);
    }
}
