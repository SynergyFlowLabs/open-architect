package androidx.compose.foundation.text;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f20780a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20781b = 0;

    @SourceDebugExtension({"SMAP\nTextFieldDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,455:1\n54#2:456\n59#2:458\n85#3:457\n90#3:459\n1#4:460\n640#5:461\n*S KotlinDebug\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n*L\n111#1:456\n111#1:458\n111#1:457\n111#1:459\n150#1:461\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.q5$a$a, reason: collision with other inner class name */
        static final class C0154a implements Function1<androidx.compose.ui.graphics.c2, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.g0 f20782a;

            C0154a(androidx.compose.ui.layout.g0 g0Var) {
                this.f20782a = g0Var;
            }

            public final void c(float[] fArr) {
                if (this.f20782a.I()) {
                    androidx.compose.ui.layout.h0.d(this.f20782a).y0(this.f20782a, fArr);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.c2 c2Var) {
                c(c2Var.A());
                return Unit.f312394a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void e(androidx.compose.ui.graphics.k0 k0Var, long j10, androidx.compose.ui.text.input.m0 m0Var, androidx.compose.ui.text.p3 p3Var, androidx.compose.ui.graphics.h2 h2Var) {
            int iB = m0Var.b(androidx.compose.ui.text.w3.l(j10));
            int iB2 = m0Var.b(androidx.compose.ui.text.w3.k(j10));
            if (iB != iB2) {
                k0Var.M(p3Var.A(iB, iB2), h2Var);
            }
        }

        public static /* synthetic */ kotlin.n1 g(a aVar, i5 i5Var, long j10, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.p3 p3Var, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                p3Var = null;
            }
            return aVar.f(i5Var, j10, wVar, p3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.u i(i5 i5Var) {
            return androidx.compose.ui.unit.u.b(r5.b(i5Var.m(), i5Var.a(), i5Var.b(), null, 0, 24, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit n(androidx.compose.ui.text.input.m mVar, Function1 function1, kotlin.jvm.internal.i1.h hVar, List list) {
            q5.f20780a.k(list, mVar, function1, (androidx.compose.ui.text.input.g1) hVar.f312751a);
            return Unit.f312394a;
        }

        @NotNull
        public final androidx.compose.ui.text.input.h1 c(long j10, @NotNull androidx.compose.ui.text.input.h1 h1Var) {
            int iB = h1Var.a().b(androidx.compose.ui.text.w3.n(j10));
            int iB2 = h1Var.a().b(androidx.compose.ui.text.w3.i(j10));
            int iMin = Math.min(iB, iB2);
            int iMax = Math.max(iB, iB2);
            androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(h1Var.b());
            bVar.g(new androidx.compose.ui.text.c3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, androidx.compose.ui.text.style.k.f42215b.f(), (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 61439, (DefaultConstructorMarker) null), iMin, iMax);
            return new androidx.compose.ui.text.input.h1(bVar.C(), h1Var.a());
        }

        @oj.n
        public final void d(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, long j10, long j11, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull androidx.compose.ui.graphics.h2 h2Var, long j12) {
            if (!androidx.compose.ui.text.w3.h(j10)) {
                h2Var.S(j12);
                e(k0Var, j10, m0Var, p3Var, h2Var);
            } else if (!androidx.compose.ui.text.w3.h(j11)) {
                androidx.compose.ui.graphics.q0 q0VarN = androidx.compose.ui.graphics.q0.n(p3Var.l().m().t());
                if (q0VarN.M() == 16) {
                    q0VarN = null;
                }
                long jM = q0VarN != null ? q0VarN.M() : androidx.compose.ui.graphics.q0.f38131b.a();
                h2Var.S(androidx.compose.ui.graphics.q0.w(jM, androidx.compose.ui.graphics.q0.A(jM) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                e(k0Var, j11, m0Var, p3Var, h2Var);
            } else if (!androidx.compose.ui.text.w3.h(y0Var.l())) {
                h2Var.S(j12);
                e(k0Var, y0Var.l(), m0Var, p3Var, h2Var);
            }
            androidx.compose.ui.text.u3.f42312a.a(k0Var, p3Var);
        }

        @oj.n
        @NotNull
        public final kotlin.n1<Integer, Integer, androidx.compose.ui.text.p3> f(@NotNull i5 i5Var, long j10, @NotNull androidx.compose.ui.unit.w wVar, @Nullable androidx.compose.ui.text.p3 p3Var) {
            androidx.compose.ui.text.p3 p3VarO = i5Var.o(j10, wVar, p3Var);
            return new kotlin.n1<>(Integer.valueOf((int) (p3VarO.C() >> 32)), Integer.valueOf((int) (p3VarO.C() & com.rabbitmq.client.k0.f265952a)), p3VarO);
        }

        @oj.n
        public final void h(@NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull final i5 i5Var, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull androidx.compose.ui.layout.g0 g0Var, @NotNull androidx.compose.ui.text.input.g1 g1Var, boolean z10, @NotNull androidx.compose.ui.text.input.m0 m0Var) {
            if (z10) {
                g1Var.e(r5.c(p3Var, g0Var, m0Var.b(androidx.compose.ui.text.w3.k(y0Var.l())), new Function0() { // from class: androidx.compose.foundation.text.p5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q5.a.i(i5Var);
                    }
                }));
            }
        }

        @oj.n
        public final void j(@NotNull androidx.compose.ui.text.input.g1 g1Var, @NotNull androidx.compose.ui.text.input.m mVar, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1) {
            function1.invoke(androidx.compose.ui.text.input.y0.h(mVar.i(), null, 0L, null, 3, null));
            g1Var.a();
        }

        @oj.n
        public final void k(@NotNull List<? extends androidx.compose.ui.text.input.j> list, @NotNull androidx.compose.ui.text.input.m mVar, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, @Nullable androidx.compose.ui.text.input.g1 g1Var) {
            androidx.compose.ui.text.input.y0 y0VarB = mVar.b(list);
            if (g1Var != null) {
                g1Var.g(null, y0VarB);
            }
            function1.invoke(y0VarB);
        }

        @oj.n
        @NotNull
        public final androidx.compose.ui.text.input.g1 l(@NotNull androidx.compose.ui.text.input.a1 a1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m mVar, @NotNull androidx.compose.ui.text.input.u uVar, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, @NotNull Function1<? super androidx.compose.ui.text.input.t, Unit> function2) {
            return m(a1Var, y0Var, mVar, uVar, function1, function2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.g1] */
        @oj.n
        @NotNull
        public final androidx.compose.ui.text.input.g1 m(@NotNull androidx.compose.ui.text.input.a1 a1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull final androidx.compose.ui.text.input.m mVar, @NotNull androidx.compose.ui.text.input.u uVar, @NotNull final Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, @NotNull Function1<? super androidx.compose.ui.text.input.t, Unit> function2) {
            final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
            ?? D = a1Var.d(y0Var, uVar, new Function1() { // from class: androidx.compose.foundation.text.o5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q5.a.n(mVar, function1, hVar, (List) obj);
                }
            }, function2);
            hVar.f312751a = D;
            return D;
        }

        @oj.n
        public final void o(long j10, @NotNull y6 y6Var, @NotNull androidx.compose.ui.text.input.m mVar, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1) {
            function1.invoke(androidx.compose.ui.text.input.y0.h(mVar.i(), null, androidx.compose.ui.text.x3.a(m0Var.a(y6.h(y6Var, j10, false, 2, null))), null, 5, null));
        }

        @oj.n
        public final void p(@NotNull androidx.compose.ui.text.input.g1 g1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull y6 y6Var) {
            androidx.compose.ui.layout.g0 g0VarB;
            androidx.compose.ui.layout.g0 g0VarC = y6Var.c();
            if (g0VarC == null || !g0VarC.I() || (g0VarB = y6Var.b()) == null) {
                return;
            }
            g1Var.h(y0Var, m0Var, y6Var.i(), new C0154a(g0VarC), androidx.compose.foundation.text.selection.n2.i(g0VarC), g0VarC.e0(g0VarB, false));
        }

        private a() {
        }
    }

    @oj.n
    public static final void a(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, long j10, long j11, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull androidx.compose.ui.graphics.h2 h2Var, long j12) {
        f20780a.d(k0Var, y0Var, j10, j11, m0Var, p3Var, h2Var, j12);
    }

    @oj.n
    @NotNull
    public static final kotlin.n1<Integer, Integer, androidx.compose.ui.text.p3> b(@NotNull i5 i5Var, long j10, @NotNull androidx.compose.ui.unit.w wVar, @Nullable androidx.compose.ui.text.p3 p3Var) {
        return f20780a.f(i5Var, j10, wVar, p3Var);
    }

    @oj.n
    public static final void c(@NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull i5 i5Var, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull androidx.compose.ui.layout.g0 g0Var, @NotNull androidx.compose.ui.text.input.g1 g1Var, boolean z10, @NotNull androidx.compose.ui.text.input.m0 m0Var) {
        f20780a.h(y0Var, i5Var, p3Var, g0Var, g1Var, z10, m0Var);
    }

    @oj.n
    public static final void d(@NotNull androidx.compose.ui.text.input.g1 g1Var, @NotNull androidx.compose.ui.text.input.m mVar, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1) {
        f20780a.j(g1Var, mVar, function1);
    }

    @oj.n
    public static final void e(@NotNull List<? extends androidx.compose.ui.text.input.j> list, @NotNull androidx.compose.ui.text.input.m mVar, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, @Nullable androidx.compose.ui.text.input.g1 g1Var) {
        f20780a.k(list, mVar, function1, g1Var);
    }

    @oj.n
    @NotNull
    public static final androidx.compose.ui.text.input.g1 f(@NotNull androidx.compose.ui.text.input.a1 a1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m mVar, @NotNull androidx.compose.ui.text.input.u uVar, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, @NotNull Function1<? super androidx.compose.ui.text.input.t, Unit> function2) {
        return f20780a.l(a1Var, y0Var, mVar, uVar, function1, function2);
    }

    @oj.n
    @NotNull
    public static final androidx.compose.ui.text.input.g1 g(@NotNull androidx.compose.ui.text.input.a1 a1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m mVar, @NotNull androidx.compose.ui.text.input.u uVar, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1, @NotNull Function1<? super androidx.compose.ui.text.input.t, Unit> function2) {
        return f20780a.m(a1Var, y0Var, mVar, uVar, function1, function2);
    }

    @oj.n
    public static final void h(long j10, @NotNull y6 y6Var, @NotNull androidx.compose.ui.text.input.m mVar, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull Function1<? super androidx.compose.ui.text.input.y0, Unit> function1) {
        f20780a.o(j10, y6Var, mVar, m0Var, function1);
    }

    @oj.n
    public static final void i(@NotNull androidx.compose.ui.text.input.g1 g1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull y6 y6Var) {
        f20780a.p(g1Var, y0Var, m0Var, y6Var);
    }
}
