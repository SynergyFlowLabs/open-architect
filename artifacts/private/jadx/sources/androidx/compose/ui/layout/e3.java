package androidx.compose.ui.layout;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTestModifierUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,63:1\n1282#2,6:64\n282#3,9:70\n291#3,2:85\n4360#4,6:79\n*S KotlinDebug\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n*L\n51#1:64,6\n54#1:70,9\n54#1:85,2\n58#1:79,6\n*E\n"})
public final class e3 {

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<d3, Unit> f39312a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super d3, Unit> function1) {
            super(1);
            this.f39312a = function1;
        }

        public final void c(androidx.compose.ui.node.l0 l0Var) {
            this.f39312a.invoke(new d3(l0Var));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<d3, Unit> f39313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super d3, Unit> function1, int i10) {
            super(2);
            this.f39313a = function1;
            this.f39314b = i10;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            e3.a(this.f39313a, c0Var, t4.a(this.f39314b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f39315a = new c();

        static final class a extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f39316a = new a();

            a() {
                super(1);
            }

            public final void c(i2.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
                c(aVar);
                return Unit.f312394a;
            }
        }

        c() {
        }

        @Override // androidx.compose.ui.layout.a1
        public final b1 a(c1 c1Var, List<? extends z0> list, long j10) {
            return c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.b.o(j10), null, a.f39316a, 4, null);
        }
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "It is a test API, do not use it in the real applications")
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public static final void a(@NotNull Function1<? super d3, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1673066036);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1673066036, i11, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:48)");
            }
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = c.f39315a;
                c0VarR.Y(objI0);
            }
            a1 a1Var = (a1) objI0;
            Function0<androidx.compose.ui.node.l0> function0A = androidx.compose.ui.node.l0.f39845y3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.V();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            y7.n(c0VarD, a1Var, aVar.e());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.i(c0VarD, new a(function1));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(function1, i10));
        }
    }
}
