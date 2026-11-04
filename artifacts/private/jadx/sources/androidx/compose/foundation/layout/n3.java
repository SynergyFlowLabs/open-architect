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
public final class n3 extends u2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f16241g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f16242h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final n3 f16243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final n3 f16244j;

    @SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowRowOverflow$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n113#2:852\n75#3:853\n1#4:854\n1282#5,6:855\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowRowOverflow$Companion\n*L\n134#1:852\n137#1:853\n138#1:855,6\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.n3$a$a, reason: collision with other inner class name */
        static final class C0101a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y2 f16245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<o3, androidx.compose.runtime.c0, Integer, Unit> f16246b;

            /* JADX WARN: Multi-variable type inference failed */
            C0101a(y2 y2Var, pj.n<? super o3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f16245a = y2Var;
                this.f16246b = nVar;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-982932461, i10, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:98)");
                }
                this.f16246b.invoke(new r3(this.f16245a), c0Var, 0);
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
            final /* synthetic */ y2 f16247a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<o3, androidx.compose.runtime.c0, Integer, Unit> f16248b;

            /* JADX WARN: Multi-variable type inference failed */
            b(y2 y2Var, pj.n<? super o3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f16247a = y2Var;
                this.f16248b = nVar;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1862526094, i10, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:152)");
                }
                this.f16248b.invoke(new r3(this.f16247a), c0Var, 0);
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
            final /* synthetic */ y2 f16249a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<o3, androidx.compose.runtime.c0, Integer, Unit> f16250b;

            /* JADX WARN: Multi-variable type inference failed */
            c(y2 y2Var, pj.n<? super o3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f16249a = y2Var;
                this.f16250b = nVar;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1742323353, i10, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:145)");
                }
                this.f16250b.invoke(new r3(this.f16249a), c0Var, 0);
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
            return androidx.compose.runtime.internal.w.c(-982932461, true, new C0101a(y2Var, nVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function2 g(pj.n nVar, y2 y2Var) {
            return androidx.compose.runtime.internal.w.c(1742323353, true, new c(y2Var, nVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function2 h(pj.n nVar, y2 y2Var) {
            return androidx.compose.runtime.internal.w.c(-1862526094, true, new b(y2Var, nVar));
        }

        @u1
        public static /* synthetic */ void j() {
        }

        @u1
        public static /* synthetic */ void l() {
        }

        @u1
        @NotNull
        public final n3 d(@NotNull final pj.n<? super o3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            int i10 = (0 >> 0) & 0;
            return new n3(u2.a.ExpandIndicator, 0, 0, new Function1() { // from class: androidx.compose.foundation.layout.m3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n3.a.e(nVar, (y2) obj);
                }
            }, null, 22, null);
        }

        @androidx.compose.runtime.o
        @u1
        @NotNull
        public final n3 f(@NotNull final pj.n<? super o3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @NotNull final pj.n<? super o3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, int i10, float f10, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
            boolean z10 = true;
            int i13 = (i12 & 4) != 0 ? 1 : i10;
            if ((i12 & 8) != 0) {
                f10 = androidx.compose.ui.unit.h.r(0);
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1512952504, i11, -1, "androidx.compose.foundation.layout.FlowRowOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:134)");
            }
            int iG6 = ((androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m())).g6(f10);
            boolean zK = ((((i11 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.K(i13)) || (i11 & androidx.media3.exoplayer.a5.S0) == 256) | c0Var.K(iG6) | ((((i11 & 14) ^ 6) > 4 && c0Var.D(nVar)) || (i11 & 6) == 4);
            if ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.D(nVar2)) && (i11 & 48) != 32) {
                z10 = false;
            }
            boolean z11 = zK | z10;
            Object objI0 = c0Var.i0();
            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                n3 n3Var = new n3(u2.a.ExpandOrCollapseIndicator, i13, iG6, new Function1() { // from class: androidx.compose.foundation.layout.k3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n3.a.g(nVar, (y2) obj);
                    }
                }, new Function1() { // from class: androidx.compose.foundation.layout.l3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n3.a.h(nVar2, (y2) obj);
                    }
                }, null);
                c0Var.Y(n3Var);
                objI0 = n3Var;
            }
            n3 n3Var2 = (n3) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return n3Var2;
        }

        @NotNull
        public final n3 i() {
            return n3.f16244j;
        }

        @NotNull
        public final n3 k() {
            return n3.f16243i;
        }

        private a() {
        }
    }

    static {
        int i10 = 0;
        Function1 function1 = null;
        boolean z10 = false & false;
        f16243i = new n3(u2.a.Visible, 0, i10, null, function1, 30, null);
        f16244j = new n3(u2.a.Clip, i10, 0, function1, null, 30, null);
    }

    public /* synthetic */ n3(u2.a aVar, int i10, int i11, Function1 function1, Function1 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i10, i11, function1, function2);
    }

    /* synthetic */ n3(u2.a aVar, int i10, int i11, Function1 function1, Function1 function2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : function1, (i12 & 16) != 0 ? null : function2);
    }

    private n3(u2.a aVar, int i10, int i11, Function1<? super y2, ? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> function1, Function1<? super y2, ? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> function2) {
        super(aVar, i10, i11, function1, function2, null);
    }
}
