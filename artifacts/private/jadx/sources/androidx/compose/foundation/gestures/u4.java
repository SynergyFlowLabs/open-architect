package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1070:1\n59#2:1071\n54#2:1077\n90#3:1072\n53#3,3:1074\n85#3:1078\n53#3,3:1080\n30#4:1073\n30#4:1079\n103#5:1083\n35#5,5:1084\n104#5:1089\n1#6:1090\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode\n*L\n455#1:1071\n466#1:1077\n455#1:1072\n464#1:1074,3\n466#1:1078\n475#1:1080,3\n464#1:1073\n475#1:1079\n505#1:1083\n505#1:1084,5\n505#1:1089\n*E\n"})
public final class u4 extends j2 implements androidx.compose.ui.input.key.g, androidx.compose.ui.node.i2, androidx.compose.ui.node.h, p3 {

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final int f15129v3 = 8;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.x3 f15130j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private c3 f15131k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final boolean f15132l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.nestedscroll.b f15133m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private final j4 f15134n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final x0 f15135o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private final z4 f15136p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private final p4 f15137q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    private final p0 f15138r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @Nullable
    private Function2<? super Float, ? super Float, Boolean> f15139s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @Nullable
    private Function2<? super n0.g, ? super kotlin.coroutines.d<? super n0.g>, ? extends Object> f15140t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @Nullable
    private k3 f15141u3;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<o3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> f15144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z4 f15145d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, z4 z4Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f15144c = function2;
            this.f15145d = z4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(o3 o3Var, z4 z4Var, d1.b bVar) {
            o3Var.a(z4Var.H(bVar.a()), androidx.compose.ui.input.nestedscroll.f.f38949b.h());
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f15144c, this.f15145d, dVar);
            aVar.f15143b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15142a;
            int i11 = 7 | 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                final o3 o3Var = (o3) this.f15143b;
                Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f15144c;
                final z4 z4Var = this.f15145d;
                Function1<? super d1.b, Unit> function1 = new Function1() { // from class: androidx.compose.foundation.gestures.t4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return u4.a.n(o3Var, z4Var, (d1.b) obj2);
                    }
                };
                this.f15142a = 1;
                if (function2.invoke(function1, this) == objL) {
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
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o3 o3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(o3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2<androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        b(Object obj) {
            super(2, obj, u4.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        }

        public final Object c(long j10, kotlin.coroutines.d<? super Unit> dVar) {
            return u4.pa((u4) this.receiver, j10, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.ui.unit.c0 c0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return c(c0Var.v(), dVar);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", i = {}, l = {351}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15146a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15148c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f15148c = j10;
            int i10 = 7 & 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u4.this.new c(this.f15148c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15146a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z4 z4Var = u4.this.f15136p3;
                long j10 = this.f15148c;
                this.f15146a = 1;
                if (z4Var.x(j10, false, this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", i = {}, l = {485}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15149a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15151c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<o3, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f15152a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f15153b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f15154c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f15154c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f15154c, dVar);
                aVar.f15153b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f15152a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((o3) this.f15153b).b(this.f15154c, androidx.compose.ui.input.nestedscroll.f.f38949b.h());
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o3 o3Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(o3Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f15151c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u4.this.new d(this.f15151c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15149a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z4 z4Var = u4.this.f15136p3;
                androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.UserInput;
                a aVar = new a(this.f15151c, null);
                this.f15149a = 1;
                if (z4Var.C(q3Var, aVar, this) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1", f = "Scrollable.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15155a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15157c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f15157c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u4.this.new e(this.f15157c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15155a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z4 z4Var = u4.this.f15136p3;
                long j10 = this.f15157c;
                this.f15155a = 1;
                if (z4Var.x(j10, true, this) == objL) {
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
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", i = {}, l = {528}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode$setScrollSemanticsActions$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1070:1\n30#2:1071\n53#3,3:1072\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode$setScrollSemanticsActions$1$1\n*L\n528#1:1071\n528#1:1072,3\n*E\n"})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15158a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f15160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15161d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f10, float f11, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f15160c = f10;
            this.f15161d = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u4.this.new f(this.f15160c, this.f15161d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15158a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z4 z4Var = u4.this.f15136p3;
                float f10 = this.f15160c;
                float f11 = this.f15161d;
                long jG = n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a));
                this.f15158a = 1;
                if (n4.n(z4Var, jG, this) == objL) {
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
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", i = {}, l = {532}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<n0.g, kotlin.coroutines.d<? super n0.g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ long f15163b;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = u4.this.new g(dVar);
            gVar.f15163b = ((n0.g) obj).B();
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(n0.g gVar, kotlin.coroutines.d<? super n0.g> dVar) {
            return k(gVar.B(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15162a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            long j10 = this.f15163b;
            z4 z4Var = u4.this.f15136p3;
            this.f15162a = 1;
            Object objN = n4.n(z4Var, j10, this);
            return objN == objL ? objL : objN;
        }

        public final Object k(long j10, kotlin.coroutines.d<? super n0.g> dVar) {
            return ((g) create(n0.g.d(j10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u4(@NotNull v4 v4Var, @Nullable androidx.compose.foundation.x3 x3Var, @Nullable c3 c3Var, @NotNull q3 q3Var, boolean z10, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable m0 m0Var) {
        super(n4.f(), z10, jVar, q3Var);
        this.f15130j3 = x3Var;
        this.f15131k3 = c3Var;
        androidx.compose.ui.input.nestedscroll.b bVar = new androidx.compose.ui.input.nestedscroll.b();
        this.f15133m3 = bVar;
        this.f15134n3 = (j4) v9(new j4(z10));
        x0 x0Var = new x0(androidx.compose.animation.l1.c(n4.i()), null, 2, 0 == true ? 1 : 0);
        this.f15135o3 = x0Var;
        androidx.compose.foundation.x3 x3Var2 = this.f15130j3;
        c3 c3Var2 = this.f15131k3;
        z4 z4Var = new z4(v4Var, x3Var2, c3Var2 == null ? x0Var : c3Var2, q3Var, z11, bVar, this, new Function0() { // from class: androidx.compose.foundation.gestures.q4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(u4.ra(this.f14967a));
            }
        });
        this.f15136p3 = z4Var;
        p4 p4Var = new p4(z4Var, z10);
        this.f15137q3 = p4Var;
        p0 p0Var = (p0) v9(new p0(q3Var, z4Var, z11, m0Var));
        this.f15138r3 = p0Var;
        v9(androidx.compose.ui.input.nestedscroll.e.c(p4Var, bVar));
        v9(androidx.compose.ui.focus.s0.c(androidx.compose.ui.focus.w0.f37469b.b(), null, 2, null));
        v9(new androidx.compose.foundation.relocation.j(p0Var));
        v9(new androidx.compose.foundation.j2(new Function1() { // from class: androidx.compose.foundation.gestures.r4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u4.ka(this.f14984a, (androidx.compose.ui.layout.g0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ka(u4 u4Var, androidx.compose.ui.layout.g0 g0Var) {
        u4Var.f15138r3.P9(g0Var);
        return Unit.f312394a;
    }

    private final void na() {
        this.f15139s3 = null;
        this.f15140t3 = null;
    }

    private final void oa() {
        if (this.f15141u3 == null) {
            this.f15141u3 = new k3(this.f15136p3, f0.a(this), new b(this), androidx.compose.ui.node.k.q(this));
        }
        k3 k3Var = this.f15141u3;
        if (k3Var != null) {
            k3Var.z(Q8());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pa(u4 u4Var, long j10, kotlin.coroutines.d dVar) {
        u4Var.qa(j10);
        return Unit.f312394a;
    }

    private final void qa(long j10) {
        kotlinx.coroutines.k.f(this.f15133m3.f(), null, null, new e(j10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ra(u4 u4Var) {
        return u4Var.a9();
    }

    private final void sa() {
        this.f15139s3 = new Function2() { // from class: androidx.compose.foundation.gestures.s4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(u4.ta(this.f15004a, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            }
        };
        this.f15140t3 = new g(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ta(u4 u4Var, float f10, float f11) {
        kotlinx.coroutines.k.f(u4Var.Q8(), null, null, u4Var.new f(f10, f11, null), 3, null);
        return true;
    }

    private final void va() {
        if (a9()) {
            this.f15135o3.d(androidx.compose.ui.node.k.q(this));
        }
    }

    @Override // androidx.compose.foundation.gestures.j2
    @Nullable
    public Object T9(@NotNull Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        z4 z4Var = this.f15136p3;
        Object objC = z4Var.C(androidx.compose.foundation.q3.UserInput, new a(function2, z4Var, null), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.f15132l3;
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Y9(long j10) {
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Z9(long j10) {
        kotlinx.coroutines.k.f(this.f15133m3.f(), null, null, new c(j10, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.j2
    public boolean da() {
        return this.f15136p3.G();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        va();
        k3 k3Var = this.f15141u3;
        if (k3Var != null) {
            k3Var.E(androidx.compose.ui.node.k.q(this));
        }
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean h7(@NotNull KeyEvent keyEvent) {
        long jG;
        if (V9()) {
            long jA = androidx.compose.ui.input.key.e.a(keyEvent);
            androidx.compose.ui.input.key.b.a aVar = androidx.compose.ui.input.key.b.f38761b;
            if ((androidx.compose.ui.input.key.b.E4(jA, aVar.C2()) || androidx.compose.ui.input.key.b.E4(androidx.compose.ui.input.key.e.a(keyEvent), aVar.D2())) && androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.a()) && !androidx.compose.ui.input.key.e.e(keyEvent)) {
                if (this.f15136p3.w()) {
                    int iL9 = (int) (this.f15138r3.L9() & com.rabbitmq.client.k0.f265952a);
                    jG = n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(androidx.compose.ui.input.key.b.E4(androidx.compose.ui.input.key.e.a(keyEvent), aVar.D2()) ? iL9 : -iL9)) & com.rabbitmq.client.k0.f265952a));
                } else {
                    int iL10 = (int) (this.f15138r3.L9() >> 32);
                    jG = n0.g.g((((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.input.key.b.E4(androidx.compose.ui.input.key.e.a(keyEvent), aVar.D2()) ? iL10 : -iL10)) << 32));
                }
                kotlinx.coroutines.k.f(Q8(), null, null, new d(jG, null), 3, null);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.d2
    public void l0() {
        p3();
        va();
        k3 k3Var = this.f15141u3;
        if (k3Var != null) {
            k3Var.E(androidx.compose.ui.node.k.q(this));
        }
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        if (V9() && (this.f15139s3 == null || this.f15140t3 == null)) {
            sa();
        }
        Function2<? super Float, ? super Float, Boolean> function2 = this.f15139s3;
        if (function2 != null) {
            androidx.compose.ui.semantics.b0.m1(e0Var, null, function2, 1, null);
        }
        Function2<? super n0.g, ? super kotlin.coroutines.d<? super n0.g>, ? extends Object> function3 = this.f15140t3;
        if (function3 != null) {
            androidx.compose.ui.semantics.b0.n1(e0Var, function3);
        }
    }

    @Override // androidx.compose.foundation.gestures.j2, androidx.compose.ui.node.d2
    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (U9().invoke(listE.get(i10)).booleanValue()) {
                super.p5(qVar, sVar, j10);
                break;
            }
        }
        if (V9()) {
            if (sVar == androidx.compose.ui.input.pointer.s.Initial && androidx.compose.ui.input.pointer.u.k(qVar.j(), androidx.compose.ui.input.pointer.u.f39127b.f())) {
                oa();
            }
            k3 k3Var = this.f15141u3;
            if (k3Var != null) {
                k3Var.y(qVar, sVar, j10);
            }
        }
    }

    public final void ua(@NotNull v4 v4Var, @NotNull q3 q3Var, @Nullable androidx.compose.foundation.x3 x3Var, boolean z10, boolean z11, @Nullable c3 c3Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable m0 m0Var) {
        boolean z12;
        if (V9() != z10) {
            this.f15137q3.c(z10);
            this.f15134n3.w9(z10);
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z13 = z12;
        boolean zN = this.f15136p3.N(v4Var, q3Var, x3Var, z11, c3Var == null ? this.f15135o3 : c3Var, this.f15133m3);
        this.f15138r3.S9(q3Var, z11, m0Var);
        this.f15130j3 = x3Var;
        this.f15131k3 = c3Var;
        fa(n4.f(), z10, jVar, this.f15136p3.w() ? q3.Vertical : q3.Horizontal, zN);
        if (z13) {
            na();
            androidx.compose.ui.node.j2.b(this);
        }
    }

    @Override // androidx.compose.foundation.gestures.p3
    public void v1(long j10) {
        if (a9()) {
            androidx.compose.ui.node.k.g(this, j10);
        }
    }

    @Override // androidx.compose.ui.input.key.g
    public boolean w2(@NotNull KeyEvent keyEvent) {
        return false;
    }
}
