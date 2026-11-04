package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,174:1\n51#2,4:175\n*S KotlinDebug\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n*L\n90#1:175,4\n*E\n"})
public final class y5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final float f15404h = 0.01f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.u4<androidx.compose.animation.core.s> f15406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f15407b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.compose.animation.core.s f15408c = f15405i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f15410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final a f15402f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f15403g = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.s f15405i = new androidx.compose.animation.core.s(0.0f);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.animation.core.s a() {
            return y5.f15405i;
        }

        public final boolean b(float f10) {
            return Math.abs(f10) < 0.01f;
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 1}, l = {100, 151}, m = "animateToZero", n = {"beforeFrame", "afterFrame", "durationScale", "afterFrame"}, s = {"L$0", "L$1", "F$0", "L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f15413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f15414d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f15416f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15414d = obj;
            this.f15416f |= Integer.MIN_VALUE;
            return y5.this.d(null, null, this);
        }
    }

    public y5(@NotNull androidx.compose.animation.core.o<Float> oVar) {
        this.f15406a = oVar.a(androidx.compose.animation.core.t4.P(kotlin.jvm.internal.z.f312833a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(y5 y5Var, float f10, Function1 function1, long j10) {
        if (y5Var.f15407b == Long.MIN_VALUE) {
            y5Var.f15407b = j10;
        }
        androidx.compose.animation.core.s sVar = new androidx.compose.animation.core.s(y5Var.f15410e);
        long jC = f10 == 0.0f ? y5Var.f15406a.c(new androidx.compose.animation.core.s(y5Var.f15410e), f15405i, y5Var.f15408c) : kotlin.math.b.N0((j10 - y5Var.f15407b) / f10);
        androidx.compose.animation.core.u4<androidx.compose.animation.core.s> u4Var = y5Var.f15406a;
        androidx.compose.animation.core.s sVar2 = f15405i;
        float f11 = ((androidx.compose.animation.core.s) u4Var.i(jC, sVar, sVar2, y5Var.f15408c)).f();
        y5Var.f15408c = (androidx.compose.animation.core.s) y5Var.f15406a.g(jC, sVar, sVar2, y5Var.f15408c);
        y5Var.f15407b = j10;
        float f12 = y5Var.f15410e - f11;
        y5Var.f15410e = f11;
        function1.invoke(Float.valueOf(f12));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(y5 y5Var, Function1 function1, long j10) {
        float f10 = y5Var.f15410e;
        y5Var.f15410e = 0.0f;
        function1.invoke(Float.valueOf(f10));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d A[Catch: all -> 0x0040, PHI: r13 r14 r15
      0x008d: PHI (r13v5 float) = (r13v2 float), (r13v6 float) binds: [B:31:0x0085, B:38:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r14v8 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
      (r14v3 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
      (r14v9 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
     binds: [B:31:0x0085, B:38:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r15v16 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r15v8 kotlin.jvm.functions.Function0<kotlin.Unit>), (r15v17 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:31:0x0085, B:38:0x00b5] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003a, B:46:0x00dc, B:22:0x0059, B:37:0x00b0, B:32:0x008d, B:34:0x0098, B:39:0x00b7, B:42:0x00c6), top: B:51:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003a, B:46:0x00dc, B:22:0x0059, B:37:0x00b0, B:32:0x008d, B:34:0x0098, B:39:0x00b7, B:42:0x00c6), top: B:51:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0040, PHI: r13 r14 r15
      0x00b0: PHI (r13v6 float) = (r13v5 float), (r13v9 float) binds: [B:35:0x00ac, B:23:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r14v9 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
      (r14v8 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
      (r14v12 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
     binds: [B:35:0x00ac, B:23:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r15v17 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r15v16 kotlin.jvm.functions.Function0<kotlin.Unit>), (r15v18 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:35:0x00ac, B:23:0x005d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003a, B:46:0x00dc, B:22:0x0059, B:37:0x00b0, B:32:0x008d, B:34:0x0098, B:39:0x00b7, B:42:0x00c6), top: B:51:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7 A[Catch: all -> 0x0040, PHI: r14 r15
      0x00b7: PHI (r14v4 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
      (r14v8 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
      (r14v9 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
     binds: [B:33:0x0096, B:38:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r15v11 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r15v16 kotlin.jvm.functions.Function0<kotlin.Unit>), (r15v17 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:33:0x0096, B:38:0x00b5] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003a, B:46:0x00dc, B:22:0x0059, B:37:0x00b0, B:32:0x008d, B:34:0x0098, B:39:0x00b7, B:42:0x00c6), top: B:51:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003a, B:46:0x00dc, B:22:0x0059, B:37:0x00b0, B:32:0x008d, B:34:0x0098, B:39:0x00b7, B:42:0x00c6), top: B:51:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ac -> B:37:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.y5.d(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }

    public final float g() {
        return this.f15410e;
    }

    public final void h(float f10) {
        this.f15410e = f10;
    }
}
