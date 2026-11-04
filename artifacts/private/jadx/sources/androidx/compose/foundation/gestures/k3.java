package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n73#1:360\n103#2:361\n35#2,5:362\n104#2:367\n103#2:368\n35#2,5:369\n104#2:374\n35#2,5:375\n1#3:380\n*S KotlinDebug\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic\n*L\n63#1:360\n63#1:361\n63#1:362,5\n63#1:367\n73#1:368\n73#1:369,5\n73#1:374\n75#1:375,5\n*E\n"})
public final class k3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f14736i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z4 f14737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u3 f14738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super Unit>, Object> f14739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.unit.d f14740d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f14743g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<a> f14741e = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n3 f14744h = new n3();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f14745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f14746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f14747c;

        public /* synthetic */ a(long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10);
        }

        public static /* synthetic */ a e(a aVar, long j10, long j11, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = aVar.f14745a;
            }
            long j12 = j10;
            if ((i10 & 2) != 0) {
                j11 = aVar.f14746b;
            }
            long j13 = j11;
            if ((i10 & 4) != 0) {
                z10 = aVar.f14747c;
            }
            return aVar.d(j12, j13, z10);
        }

        public final long a() {
            return this.f14745a;
        }

        public final long b() {
            return this.f14746b;
        }

        public final boolean c() {
            return this.f14747c;
        }

        @NotNull
        public final a d(long j10, long j11, boolean z10) {
            return new a(j10, j11, z10, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return n0.g.l(this.f14745a, aVar.f14745a) && this.f14746b == aVar.f14746b && this.f14747c == aVar.f14747c;
        }

        public final boolean f() {
            return this.f14747c;
        }

        public final long g() {
            return this.f14746b;
        }

        public final long h() {
            return this.f14745a;
        }

        public int hashCode() {
            return (((n0.g.t(this.f14745a) * 31) + Long.hashCode(this.f14746b)) * 31) + Boolean.hashCode(this.f14747c);
        }

        @NotNull
        public final a i(@NotNull a aVar) {
            return new a(n0.g.w(this.f14745a, aVar.f14745a), Math.max(this.f14746b, aVar.f14746b), this.f14747c, null);
        }

        @NotNull
        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) n0.g.z(this.f14745a)) + ", timeMillis=" + this.f14746b + ", shouldApplyImmediately=" + this.f14747c + ')';
        }

        private a(long j10, long j11, boolean z10) {
            this.f14745a = j10;
            this.f14746b = j11;
            this.f14747c = z10;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", i = {0}, l = {170}, m = "invokeSuspend", n = {"job"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<a> f14750c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", i = {0}, l = {166}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f14752b;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit m(long j10) {
                return Unit.f312394a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f14752b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.s0 s0Var;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f14751a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    s0Var = (kotlinx.coroutines.s0) this.f14752b;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s0Var = (kotlinx.coroutines.s0) this.f14752b;
                    ResultKt.m(obj);
                }
                while (kotlinx.coroutines.s2.D(s0Var.getCoroutineContext())) {
                    Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.l3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return k3.b.a.m(((Long) obj2).longValue());
                        }
                    };
                    this.f14752b = s0Var;
                    this.f14751a = 1;
                    if (androidx.compose.runtime.d3.f(function1, this) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.channels.p<a> pVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f14750c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f14750c, dVar);
            bVar.f14749b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th2;
            kotlinx.coroutines.p2 p2Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14748a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.p2 p2VarF = kotlinx.coroutines.k.f((kotlinx.coroutines.s0) this.f14749b, null, null, new a(null), 3, null);
                try {
                    kotlinx.coroutines.channels.p<a> pVar = this.f14750c;
                    this.f14749b = p2VarF;
                    this.f14748a = 1;
                    Object objJ = pVar.j(this);
                    if (objJ == objL) {
                        return objL;
                    }
                    obj = objJ;
                    p2Var = p2VarF;
                } catch (Throwable th3) {
                    th2 = th3;
                    p2Var = p2VarF;
                    kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p2Var = (kotlinx.coroutines.p2) this.f14749b;
                try {
                    ResultKt.m(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
                    throw th2;
                }
            }
            a aVar = (a) obj;
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super a> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0}, l = {244, 295}, m = "dispatchMouseWheelScroll", n = {"$this$dispatchMouseWheelScroll", "targetValue", "speed"}, s = {"L$0", "L$1", "F$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f14755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14756d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f14758f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14756d = obj;
            this.f14758f |= Integer.MIN_VALUE;
            return k3.this.u(null, null, 0.0f, 0.0f, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {com.planner5d.library.engine.input.f.b.W1, 266, 283}, m = "invokeSuspend", n = {"$this$userScroll", "requiredAnimation", "$this$userScroll", "requiredAnimation", "durationMillis", "$this$userScroll", "requiredAnimation"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<o3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f14763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f14764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s>> f14765g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<a> f14766h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f14767i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k3 f14768j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f14769k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ z4 f14770l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.i1.e eVar, kotlin.jvm.internal.i1.h<androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s>> hVar, kotlin.jvm.internal.i1.h<a> hVar2, float f10, k3 k3Var, float f11, z4 z4Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f14764f = eVar;
            this.f14765g = hVar;
            this.f14766h = hVar2;
            this.f14767i = f10;
            this.f14768j = k3Var;
            this.f14769k = f11;
            this.f14770l = z4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [T, androidx.compose.foundation.gestures.k3$a] */
        public static final boolean n(k3 k3Var, kotlin.jvm.internal.i1.h hVar, kotlin.jvm.internal.i1.e eVar, z4 z4Var, kotlin.jvm.internal.i1.a aVar, float f10) {
            a aVarA = k3Var.A(k3Var.f14741e);
            if (aVarA != null) {
                k3Var.C(aVarA);
                ?? I = ((a) hVar.f312751a).i(aVarA);
                hVar.f312751a = I;
                float fK = z4Var.K(z4Var.B(I.h()));
                eVar.f312748a = fK;
                aVar.f312744a = !h3.d(fK - f10);
            }
            return aVarA != null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f14764f, this.f14765g, this.f14766h, this.f14767i, this.f14768j, this.f14769k, this.f14770l, dVar);
            dVar2.f14763e = obj;
            return dVar2;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0073  */
        /* JADX WARN: Code duplicated, block: B:17:0x0097  */
        /* JADX WARN: Code duplicated, block: B:36:0x0192  */
        /* JADX WARN: Type inference failed for: r2v12, types: [T, androidx.compose.animation.core.q] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x015f -> B:30:0x0161). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x016e -> B:13:0x006f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 421
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.k3.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o3 o3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(o3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0, 0, 0}, l = {227}, m = "dispatchMouseWheelScroll$waitNextScrollDelta", n = {"this$0", "targetScrollDelta", "targetValue", "$this_dispatchMouseWheelScroll", "animationState"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f14773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f14774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f14775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f14776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f14777g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14776f = obj;
            this.f14777g |= Integer.MIN_VALUE;
            int i10 = 5 & 0;
            return k3.v(null, null, null, null, null, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollable.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14778a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k3.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14778a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            k3 k3Var = k3.this;
            kotlinx.coroutines.channels.p pVar = k3Var.f14741e;
            this.f14778a = 1;
            Object objQ = k3Var.q(pVar, this);
            return objQ == objL ? objL : objQ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super a> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", i = {0, 1}, l = {com.planner5d.library.engine.input.f.b.f160745y1, 110}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1#2:360\n*E\n"})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14781b;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = k3.this.new g(dVar);
            gVar.f14781b = obj;
            return gVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
        
            if (r5.u(r6, r7, r8, r9, r10) == r0) goto L29;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009b -> B:39:0x0040). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r12 = 4
                int r1 = r13.f14780a
                r12 = 1
                r2 = 0
                r3 = 2
                r12 = 1
                r4 = 1
                if (r1 == 0) goto L37
                if (r1 == r4) goto L2f
                if (r1 != r3) goto L25
                java.lang.Object r1 = r13.f14781b
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                kotlin.ResultKt.m(r14)     // Catch: java.lang.Throwable -> L1f
                r10 = r13
                r10 = r13
            L1b:
                r14 = r1
                r12 = 0
                goto L9b
            L1f:
                r0 = move-exception
                r14 = r0
                r10 = r13
                r12 = 3
                goto Lb4
            L25:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r12 = 4
                r13.<init>(r14)
                r12 = 3
                throw r13
            L2f:
                java.lang.Object r1 = r13.f14781b
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                kotlin.ResultKt.m(r14)     // Catch: java.lang.Throwable -> L1f
                goto L62
            L37:
                r12 = 5
                kotlin.ResultKt.m(r14)
                r12 = 6
                java.lang.Object r14 = r13.f14781b
                kotlinx.coroutines.s0 r14 = (kotlinx.coroutines.s0) r14
            L40:
                r12 = 2
                kotlin.coroutines.CoroutineContext r1 = r14.getCoroutineContext()     // Catch: java.lang.Throwable -> La3
                r12 = 7
                boolean r1 = kotlinx.coroutines.s2.D(r1)     // Catch: java.lang.Throwable -> La3
                if (r1 == 0) goto La8
                androidx.compose.foundation.gestures.k3 r1 = androidx.compose.foundation.gestures.k3.this     // Catch: java.lang.Throwable -> La3
                kotlinx.coroutines.channels.p r1 = androidx.compose.foundation.gestures.k3.h(r1)     // Catch: java.lang.Throwable -> La3
                r12 = 7
                r13.f14781b = r14     // Catch: java.lang.Throwable -> La3
                r13.f14780a = r4     // Catch: java.lang.Throwable -> La3
                java.lang.Object r1 = r1.j(r13)     // Catch: java.lang.Throwable -> La3
                r12 = 3
                if (r1 != r0) goto L5f
                goto L9a
            L5f:
                r11 = r1
                r1 = r14
                r14 = r11
            L62:
                r7 = r14
                r12 = 1
                androidx.compose.foundation.gestures.k3$a r7 = (androidx.compose.foundation.gestures.k3.a) r7     // Catch: java.lang.Throwable -> La3
                androidx.compose.foundation.gestures.k3 r14 = androidx.compose.foundation.gestures.k3.this     // Catch: java.lang.Throwable -> La3
                androidx.compose.ui.unit.d r14 = androidx.compose.foundation.gestures.k3.i(r14)     // Catch: java.lang.Throwable -> La3
                r12 = 3
                float r5 = androidx.compose.foundation.gestures.h3.b()     // Catch: java.lang.Throwable -> La3
                float r8 = r14.S7(r5)     // Catch: java.lang.Throwable -> La3
                androidx.compose.foundation.gestures.k3 r14 = androidx.compose.foundation.gestures.k3.this     // Catch: java.lang.Throwable -> La3
                androidx.compose.ui.unit.d r14 = androidx.compose.foundation.gestures.k3.i(r14)     // Catch: java.lang.Throwable -> La3
                r12 = 7
                float r5 = androidx.compose.foundation.gestures.h3.a()     // Catch: java.lang.Throwable -> La3
                float r9 = r14.S7(r5)     // Catch: java.lang.Throwable -> La3
                r12 = 3
                androidx.compose.foundation.gestures.k3 r5 = androidx.compose.foundation.gestures.k3.this     // Catch: java.lang.Throwable -> La3
                r12 = 7
                androidx.compose.foundation.gestures.z4 r6 = androidx.compose.foundation.gestures.k3.j(r5)     // Catch: java.lang.Throwable -> La3
                r12 = 2
                r13.f14781b = r1     // Catch: java.lang.Throwable -> La3
                r13.f14780a = r3     // Catch: java.lang.Throwable -> La3
                r10 = r13
                r12 = 6
                java.lang.Object r13 = androidx.compose.foundation.gestures.k3.f(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9e
                r12 = 7
                if (r13 != r0) goto L1b
            L9a:
                return r0
            L9b:
                r13 = r10
                r12 = 0
                goto L40
            L9e:
                r0 = move-exception
            L9f:
                r14 = r0
                r14 = r0
                r12 = 1
                goto Lb4
            La3:
                r0 = move-exception
                r10 = r13
                r10 = r13
                r12 = 5
                goto L9f
            La8:
                r10 = r13
                r12 = 4
                androidx.compose.foundation.gestures.k3 r13 = androidx.compose.foundation.gestures.k3.this
                r12 = 0
                androidx.compose.foundation.gestures.k3.k(r13, r2)
                kotlin.Unit r13 = kotlin.Unit.f312394a
                r12 = 7
                return r13
            Lb4:
                androidx.compose.foundation.gestures.k3 r13 = androidx.compose.foundation.gestures.k3.this
                androidx.compose.foundation.gestures.k3.k(r13, r2)
                r12 = 4
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.k3.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", i = {0}, l = {179}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,359:1\n1#2:360\n*E\n"})
    static final class h<E> extends kotlin.coroutines.jvm.internal.k implements Function2<kotlin.sequences.n<? super E>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f14785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<E> f14786d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function0<? extends E> function0, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f14786d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f14786d, dVar);
            hVar.f14785c = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0032  */
        /* JADX WARN: Code duplicated, block: B:13:0x003f  */
        /* JADX WARN: Code duplicated, block: B:15:0x0041  */
        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003d -> B:16:0x0043). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0041 -> B:16:0x0043). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 4
                int r1 = r5.f14784b
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                r4 = 4
                java.lang.Object r1 = r5.f14783a
                r4 = 1
                java.lang.Object r3 = r5.f14785c
                kotlin.sequences.n r3 = (kotlin.sequences.n) r3
                kotlin.ResultKt.m(r6)
                goto L43
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L20:
                kotlin.ResultKt.m(r6)
                java.lang.Object r6 = r5.f14785c
                kotlin.sequences.n r6 = (kotlin.sequences.n) r6
                r3 = r6
                r3 = r6
            L29:
                r4 = 7
                kotlin.jvm.functions.Function0<E> r6 = r5.f14786d
                java.lang.Object r1 = r6.invoke()
                if (r1 == 0) goto L41
                r5.f14785c = r3
                r5.f14783a = r1
                r5.f14784b = r2
                java.lang.Object r6 = r3.b(r1, r5)
                r4 = 6
                if (r6 != r0) goto L43
                r4 = 1
                return r0
            L41:
                r1 = 0
                r1 = 0
            L43:
                if (r1 != 0) goto L29
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.k3.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.n<? super E> nVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(nVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {}, l = {122}, m = "userScroll", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f14787a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14789c;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14787a = obj;
            this.f14789c |= Integer.MIN_VALUE;
            return k3.this.F(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", f = "MouseWheelScrollable.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z4 f14791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<o3, kotlin.coroutines.d<? super Unit>, Object> f14792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(z4 z4Var, Function2<? super o3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f14791b = z4Var;
            this.f14792c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new j(this.f14791b, this.f14792c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14790a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z4 z4Var = this.f14791b;
                androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.UserInput;
                Function2<o3, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f14792c;
                this.f14790a = 1;
                if (z4Var.C(q3Var, function2, this) == objL) {
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
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k3(@NotNull z4 z4Var, @NotNull u3 u3Var, @NotNull Function2<? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull androidx.compose.ui.unit.d dVar) {
        this.f14737a = z4Var;
        this.f14738b = u3Var;
        this.f14739c = function2;
        this.f14740d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a A(final kotlinx.coroutines.channels.p<a> pVar) {
        a aVarI = null;
        for (a aVar : D(new Function0() { // from class: androidx.compose.foundation.gestures.i3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k3.B(pVar);
            }
        })) {
            aVarI = aVarI == null ? aVar : aVarI.i(aVar);
        }
        return aVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a B(kotlinx.coroutines.channels.p pVar) {
        return (a) kotlinx.coroutines.channels.t.h(pVar.w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(a aVar) {
        this.f14744h.a(aVar.g(), aVar.h());
    }

    private final <E> Sequence<E> D(Function0<? extends E> function0) {
        return kotlin.sequences.o.b(new h(function0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object F(z4 z4Var, Function2<? super o3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
        i iVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f14789c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f14789c = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object obj = iVar.f14787a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f14789c;
        if (i11 == 0) {
            ResultKt.m(obj);
            this.f14742f = true;
            j jVar = new j(z4Var, function2, null);
            iVar.f14789c = 1;
            if (kotlinx.coroutines.q3.e(jVar, iVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.f14742f = false;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(final o3 o3Var, androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s> qVar, float f10, int i10, final Function1<? super Float, Boolean> function1, kotlin.coroutines.d<? super Unit> dVar) {
        final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
        eVar.f312748a = qVar.getValue().floatValue();
        Object objC = androidx.compose.animation.core.f3.C(qVar, kotlin.coroutines.jvm.internal.b.e(f10), androidx.compose.animation.core.p.t(i10, 0, androidx.compose.animation.core.u0.e(), 2, null), true, new Function1() { // from class: androidx.compose.foundation.gestures.j3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k3.p(eVar, this, o3Var, function1, (androidx.compose.animation.core.n) obj);
            }
        }, dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(kotlin.jvm.internal.i1.e eVar, k3 k3Var, o3 o3Var, Function1 function1, androidx.compose.animation.core.n nVar) {
        float fFloatValue = ((Number) nVar.g()).floatValue() - eVar.f312748a;
        if (!h3.d(fFloatValue)) {
            if (!h3.d(fFloatValue - k3Var.t(o3Var, fFloatValue))) {
                nVar.a();
                return Unit.f312394a;
            }
            eVar.f312748a += fFloatValue;
        }
        if (((Boolean) function1.invoke(Float.valueOf(eVar.f312748a))).booleanValue()) {
            nVar.a();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(kotlinx.coroutines.channels.p<a> pVar, kotlin.coroutines.d<? super a> dVar) {
        return kotlinx.coroutines.t0.g(new b(pVar, null), dVar);
    }

    private final boolean r(z4 z4Var, long j10) {
        float fK = z4Var.K(z4Var.B(j10));
        if (fK != 0.0f) {
            return fK > 0.0f ? z4Var.u().f() : z4Var.u().k();
        }
        boolean z10 = false;
        return false;
    }

    private final void s(androidx.compose.ui.input.pointer.q qVar) {
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            listE.get(i10).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float t(o3 o3Var, float f10) {
        z4 z4Var = this.f14737a;
        return z4Var.K(z4Var.B(o3Var.b(z4Var.L(z4Var.A(f10)), androidx.compose.ui.input.nestedscroll.f.f38949b.h())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        if (r0.invoke(r1, r9) == r10) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.foundation.gestures.k3$a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, androidx.compose.animation.core.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(androidx.compose.foundation.gestures.z4 r23, androidx.compose.foundation.gestures.k3.a r24, float r25, float r26, kotlin.coroutines.d<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.k3.u(androidx.compose.foundation.gestures.z4, androidx.compose.foundation.gestures.k3$a, float, float, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.compose.foundation.gestures.k3$a] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, androidx.compose.animation.core.q] */
    public static final Object v(k3 k3Var, kotlin.jvm.internal.i1.h<a> hVar, kotlin.jvm.internal.i1.e eVar, z4 z4Var, kotlin.jvm.internal.i1.h<androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s>> hVar2, long j10, kotlin.coroutines.d<? super Boolean> dVar) {
        e eVar2;
        kotlin.jvm.internal.i1.e eVar3;
        z4 z4Var2;
        kotlin.jvm.internal.i1.h<androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s>> hVar3;
        kotlin.jvm.internal.i1.h<a> hVar4;
        k3 k3Var2 = k3Var;
        if (dVar instanceof e) {
            eVar2 = (e) dVar;
            int i10 = eVar2.f14777g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f14777g = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(dVar);
            }
        } else {
            eVar2 = new e(dVar);
        }
        Object objE = eVar2.f14776f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar2.f14777g;
        boolean z10 = false;
        if (i11 == 0) {
            ResultKt.m(objE);
            if (j10 < 0) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            f fVar = k3Var2.new f(null);
            eVar2.f14771a = k3Var2;
            eVar2.f14772b = hVar;
            eVar3 = eVar;
            eVar2.f14773c = eVar3;
            z4Var2 = z4Var;
            eVar2.f14774d = z4Var2;
            hVar3 = hVar2;
            eVar2.f14775e = hVar3;
            eVar2.f14777g = 1;
            objE = kotlinx.coroutines.b4.e(j10, fVar, eVar2);
            if (objE == objL) {
                return objL;
            }
            hVar4 = hVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.i1.h<androidx.compose.animation.core.q<Float, androidx.compose.animation.core.s>> hVar5 = (kotlin.jvm.internal.i1.h) eVar2.f14775e;
            z4 z4Var3 = (z4) eVar2.f14774d;
            kotlin.jvm.internal.i1.e eVar4 = (kotlin.jvm.internal.i1.e) eVar2.f14773c;
            hVar4 = (kotlin.jvm.internal.i1.h) eVar2.f14772b;
            k3 k3Var3 = (k3) eVar2.f14771a;
            ResultKt.m(objE);
            hVar3 = hVar5;
            z4Var2 = z4Var3;
            eVar3 = eVar4;
            k3Var2 = k3Var3;
        }
        a aVar = (a) objE;
        if (aVar != null) {
            ?? E = a.e(aVar, 0L, 0L, hVar4.f312751a.f(), 3, null);
            hVar4.f312751a = E;
            eVar3.f312748a = z4Var2.K(z4Var2.B(E.h()));
            hVar3.f312751a = androidx.compose.animation.core.r.c(0.0f, 0.0f, 0L, 0L, false, 30, null);
            k3Var2.C(aVar);
            z10 = !h3.d(eVar3.f312748a);
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }

    private final boolean w(androidx.compose.ui.input.pointer.q qVar) {
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listE.get(i10).F()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(androidx.compose.ui.input.pointer.q qVar, long j10) {
        long jC = this.f14738b.c(this.f14740d, qVar, j10);
        if (r(this.f14737a, jC)) {
            return kotlinx.coroutines.channels.t.m(this.f14741e.p(new a(jC, ((androidx.compose.ui.input.pointer.c0) CollectionsKt.first((List) qVar.e())).D(), !this.f14738b.a() || this.f14738b.b(qVar), null)));
        }
        return this.f14742f;
    }

    public final void E(@NotNull androidx.compose.ui.unit.d dVar) {
        this.f14740d = dVar;
    }

    public final void y(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        if (sVar == androidx.compose.ui.input.pointer.s.Main && androidx.compose.ui.input.pointer.u.k(qVar.j(), androidx.compose.ui.input.pointer.u.f39127b.f())) {
            List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
            int size = listE.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (listE.get(i10).F()) {
                    return;
                }
            }
            if (x(qVar, j10)) {
                s(qVar);
            }
        }
    }

    public final void z(@NotNull kotlinx.coroutines.s0 s0Var) {
        if (this.f14743g == null) {
            this.f14743g = kotlinx.coroutines.k.f(s0Var, null, null, new g(null), 3, null);
        }
    }
}
