package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@kotlin.l(message = "FlowLayout overflow is no longer maintained")
@u1
public final class d2 extends u2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f15960g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f15961h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final d2 f15962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final d2 f15963j;

    @kotlin.l(message = "FlowLayout overflow is no longer maintained")
    @u1
    @SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowColumnOverflow$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n113#2:852\n75#3:853\n1#4:854\n1282#5,6:855\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowColumnOverflow$Companion\n*L\n267#1:852\n270#1:853\n271#1:855,6\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.d2$a$a, reason: collision with other inner class name */
        static final class C0098a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y2 f15964a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<e2, androidx.compose.runtime.c0, Integer, Unit> f15965b;

            /* JADX WARN: Multi-variable type inference failed */
            C0098a(y2 y2Var, pj.n<? super e2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f15964a = y2Var;
                this.f15965b = nVar;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1176120337, i10, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:231)");
                }
                this.f15965b.invoke(new h2(this.f15964a), c0Var, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                c(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y2 f15966a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<e2, androidx.compose.runtime.c0, Integer, Unit> f15967b;

            /* JADX WARN: Multi-variable type inference failed */
            b(y2 y2Var, pj.n<? super e2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f15966a = y2Var;
                this.f15967b = nVar;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-892739916, i10, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:285)");
                }
                this.f15967b.invoke(new h2(this.f15966a), c0Var, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                c(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y2 f15968a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<e2, androidx.compose.runtime.c0, Integer, Unit> f15969b;

            /* JADX WARN: Multi-variable type inference failed */
            c(y2 y2Var, pj.n<? super e2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f15968a = y2Var;
                this.f15969b = nVar;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1455675245, i10, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:278)");
                }
                this.f15969b.invoke(new h2(this.f15968a), c0Var, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                c(c0Var, num.intValue());
                return Unit.f312394a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function2 e(pj.n nVar, y2 y2Var) {
            return androidx.compose.runtime.internal.w.c(-1176120337, true, new C0098a(y2Var, nVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function2 g(pj.n nVar, y2 y2Var) {
            return androidx.compose.runtime.internal.w.c(1455675245, true, new c(y2Var, nVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function2 h(pj.n nVar, y2 y2Var) {
            return androidx.compose.runtime.internal.w.c(-892739916, true, new b(y2Var, nVar));
        }

        @u1
        public static /* synthetic */ void j() {
        }

        @u1
        public static /* synthetic */ void l() {
        }

        @u1
        @NotNull
        public final d2 d(@NotNull final pj.n<? super e2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            int i10 = 1 << 0;
            return new d2(u2.a.ExpandIndicator, 0, 0, new Function1() { // from class: androidx.compose.foundation.layout.a2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d2.a.e(nVar, (y2) obj);
                }
            }, null, 22, null);
        }

        @androidx.compose.runtime.o
        @u1
        @NotNull
        public final d2 f(@NotNull final pj.n<? super e2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @NotNull final pj.n<? super e2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, int i10, float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
            boolean z10 = true;
            int i13 = (i12 & 4) != 0 ? 1 : i10;
            if ((i12 & 8) != 0) {
                f10 = androidx.compose.ui.unit.h.r(0);
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(582202068, i11, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:267)");
            }
            int iG6 = ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).g6(f10);
            boolean zK = ((((i11 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.K(i13)) || (i11 & androidx.media3.exoplayer.a5.S0) == 256) | c0Var.K(iG6) | ((((i11 & 14) ^ 6) > 4 && c0Var.D(nVar)) || (i11 & 6) == 4);
            if ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.D(nVar2)) && (i11 & 48) != 32) {
                z10 = false;
            }
            boolean z11 = zK | z10;
            Object objI0 = c0Var.i0();
            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                d2 d2Var = new d2(u2.a.ExpandOrCollapseIndicator, i13, iG6, new Function1() { // from class: androidx.compose.foundation.layout.b2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d2.a.g(nVar, (y2) obj);
                    }
                }, new Function1() { // from class: androidx.compose.foundation.layout.c2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d2.a.h(nVar2, (y2) obj);
                    }
                }, null);
                c0Var.Y(d2Var);
                objI0 = d2Var;
            }
            d2 d2Var2 = (d2) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return d2Var2;
        }

        @NotNull
        public final d2 i() {
            return d2.f15963j;
        }

        @NotNull
        public final d2 k() {
            return d2.f15962i;
        }

        private a() {
        }
    }

    static {
        int i10 = 0;
        Function1 function1 = null;
        f15962i = new d2(u2.a.Visible, 0, i10, null, function1, 30, null);
        f15963j = new d2(u2.a.Clip, i10, 0, function1, null, 30, null);
    }

    public /* synthetic */ d2(u2.a aVar, int i10, int i11, Function1 function1, Function1 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i10, i11, function1, function2);
    }

    /* synthetic */ d2(u2.a aVar, int i10, int i11, Function1 function1, Function1 function2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : function1, (i12 & 16) != 0 ? null : function2);
    }

    private d2(u2.a aVar, int i10, int i11, Function1<? super y2, ? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> function1, Function1<? super y2, ? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> function2) {
        super(aVar, i10, i11, function1, function2, null);
    }
}
