package androidx.compose.foundation.text.input.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCursorAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,99:1\n81#2:100\n114#2,2:101\n*S KotlinDebug\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n*L\n44#1:100\n44#1:101,2\n*E\n"})
public final class d1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f19522d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private AtomicReference<kotlinx.coroutines.p2> f19524b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f19525c = androidx.compose.runtime.g4.b(0.0f);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19527b;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.d1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", i = {}, l = {72, com.planner5d.library.engine.input.f.b.f160716p, com.planner5d.library.engine.input.f.b.X, com.planner5d.library.engine.input.f.b.f160732u0}, m = "invokeSuspend", n = {}, s = {})
        static final class C0136a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19529a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.p2 f19530b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d1 f19531c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0136a(kotlinx.coroutines.p2 p2Var, d1 d1Var, kotlin.coroutines.d<? super C0136a> dVar) {
                super(2, dVar);
                this.f19530b = p2Var;
                this.f19531c = d1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0136a(this.f19530b, this.f19531c, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:32:0x007a  */
            /* JADX WARN: Code duplicated, block: B:33:0x007b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001c, B:36:0x008a, B:30:0x0070, B:33:0x007b, B:14:0x002b, B:15:0x0030, B:28:0x0069, B:29:0x006f, B:23:0x004e, B:25:0x005e), top: B:40:0x0012 }] */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
            
                if (kotlinx.coroutines.d1.b(500, r11) == r0) goto L35;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:36:0x008a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r11.f19529a
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 1
                    r6 = 4
                    r7 = 2
                    r7 = 3
                    r8 = 2
                    r10 = 3
                    r9 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r9) goto L35
                    if (r1 == r8) goto L30
                    if (r1 == r7) goto L2b
                    if (r1 != r6) goto L22
                    kotlin.ResultKt.m(r12)     // Catch: java.lang.Throwable -> L20
                    goto L8a
                L20:
                    r12 = move-exception
                    goto L91
                L22:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r10 = 3
                    r11.<init>(r12)
                    throw r11
                L2b:
                    r10 = 6
                    kotlin.ResultKt.m(r12)     // Catch: java.lang.Throwable -> L20
                    goto L7b
                L30:
                    kotlin.ResultKt.m(r12)     // Catch: java.lang.Throwable -> L20
                    r10 = 5
                    goto L69
                L35:
                    r10 = 2
                    kotlin.ResultKt.m(r12)
                    goto L4e
                L3a:
                    r10 = 4
                    kotlin.ResultKt.m(r12)
                    r10 = 2
                    kotlinx.coroutines.p2 r12 = r11.f19530b
                    if (r12 == 0) goto L4e
                    r11.f19529a = r9
                    r10 = 3
                    java.lang.Object r12 = kotlinx.coroutines.s2.l(r12, r11)
                    if (r12 != r0) goto L4e
                    r10 = 1
                    goto L89
                L4e:
                    r10 = 5
                    androidx.compose.foundation.text.input.internal.d1 r12 = r11.f19531c     // Catch: java.lang.Throwable -> L20
                    r10 = 1
                    androidx.compose.foundation.text.input.internal.d1.b(r12, r5)     // Catch: java.lang.Throwable -> L20
                    r10 = 5
                    androidx.compose.foundation.text.input.internal.d1 r12 = r11.f19531c     // Catch: java.lang.Throwable -> L20
                    boolean r12 = r12.d()     // Catch: java.lang.Throwable -> L20
                    if (r12 != 0) goto L70
                    r11.f19529a = r8     // Catch: java.lang.Throwable -> L20
                    r10 = 7
                    java.lang.Object r12 = kotlinx.coroutines.d1.a(r11)     // Catch: java.lang.Throwable -> L20
                    r10 = 3
                    if (r12 != r0) goto L69
                    goto L89
                L69:
                    kotlin.a0 r12 = new kotlin.a0     // Catch: java.lang.Throwable -> L20
                    r12.<init>()     // Catch: java.lang.Throwable -> L20
                    r10 = 0
                    throw r12     // Catch: java.lang.Throwable -> L20
                L70:
                    r11.f19529a = r7     // Catch: java.lang.Throwable -> L20
                    r10 = 2
                    java.lang.Object r12 = kotlinx.coroutines.d1.b(r3, r11)     // Catch: java.lang.Throwable -> L20
                    r10 = 0
                    if (r12 != r0) goto L7b
                    goto L89
                L7b:
                    androidx.compose.foundation.text.input.internal.d1 r12 = r11.f19531c     // Catch: java.lang.Throwable -> L20
                    androidx.compose.foundation.text.input.internal.d1.b(r12, r2)     // Catch: java.lang.Throwable -> L20
                    r11.f19529a = r6     // Catch: java.lang.Throwable -> L20
                    r10 = 0
                    java.lang.Object r12 = kotlinx.coroutines.d1.b(r3, r11)     // Catch: java.lang.Throwable -> L20
                    if (r12 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    androidx.compose.foundation.text.input.internal.d1 r12 = r11.f19531c     // Catch: java.lang.Throwable -> L20
                    r10 = 2
                    androidx.compose.foundation.text.input.internal.d1.b(r12, r5)     // Catch: java.lang.Throwable -> L20
                    goto L70
                L91:
                    androidx.compose.foundation.text.input.internal.d1 r11 = r11.f19531c
                    r10 = 3
                    androidx.compose.foundation.text.input.internal.d1.b(r11, r2)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.d1.a.C0136a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0136a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = d1.this.new a(dVar);
            aVar.f19527b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f19526a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            int i10 = 5 << 0;
            return kotlin.coroutines.jvm.internal.b.a(androidx.compose.animation.core.z1.a(d1.this.f19524b, null, kotlinx.coroutines.k.f((kotlinx.coroutines.s0) this.f19527b, null, null, new C0136a((kotlinx.coroutines.p2) d1.this.f19524b.getAndSet(null), d1.this, null), 3, null)));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public d1(boolean z10) {
        this.f19523a = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(float f10) {
        this.f19525c.q(f10);
    }

    public final void c() {
        kotlinx.coroutines.p2 andSet = this.f19524b.getAndSet(null);
        if (andSet != null) {
            kotlinx.coroutines.p2.a.b(andSet, null, 1, null);
        }
    }

    public final boolean d() {
        return this.f19523a;
    }

    public final float e() {
        return this.f19525c.V0();
    }

    @Nullable
    public final Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new a(null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }
}
