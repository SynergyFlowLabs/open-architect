package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w6 {

    @SourceDebugExtension({"SMAP\nTextFieldSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,113:1\n75#2:114\n75#2:115\n75#2:116\n1282#3,6:117\n1282#3,6:123\n1282#3,6:129\n1282#3,6:135\n85#4:141\n54#5:142\n59#5:144\n85#6:143\n90#6:145\n*S KotlinDebug\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n*L\n38#1:114\n39#1:115\n40#1:116\n42#1:117,6\n44#1:123,6\n53#1:129,6\n59#1:135,6\n44#1:141\n64#1:142\n65#1:144\n64#1:143\n65#1:145\n*E\n"})
    static final class a implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f21717a;

        a(androidx.compose.ui.text.y3 y3Var) {
            this.f21717a = y3Var;
        }

        private static final Object i(androidx.compose.runtime.n7<? extends Object> n7Var) {
            return n7Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.layout.b1 k(t6 t6Var, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
            long jE = t6Var.e();
            final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(bVar.x(), kotlin.ranges.r.I((int) (jE >> 32), androidx.compose.ui.unit.b.r(bVar.x()), androidx.compose.ui.unit.b.p(bVar.x())), 0, kotlin.ranges.r.I((int) (jE & com.rabbitmq.client.k0.f265952a), androidx.compose.ui.unit.b.q(bVar.x()), androidx.compose.ui.unit.b.o(bVar.x())), 0, 10, null));
            return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new Function1() { // from class: androidx.compose.foundation.text.u6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w6.a.m(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, 0, 0.0f, 4, null);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(1582736677);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1582736677, i10, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
            }
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            androidx.compose.ui.text.font.y.b bVar = (androidx.compose.ui.text.font.y.b) c0Var.W(androidx.compose.ui.platform.q1.o());
            androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) c0Var.W(androidx.compose.ui.platform.q1.u());
            boolean zD = c0Var.D(this.f21717a) | c0Var.K(wVar.ordinal());
            androidx.compose.ui.text.y3 y3Var = this.f21717a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.ui.text.z3.d(y3Var, wVar);
                c0Var.Y(objI0);
            }
            androidx.compose.ui.text.y3 y3Var2 = (androidx.compose.ui.text.y3) objI0;
            boolean zD2 = c0Var.D(bVar) | c0Var.D(y3Var2);
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.ui.text.font.y yVarV = y3Var2.v();
                androidx.compose.ui.text.font.v0 v0VarA = y3Var2.A();
                if (v0VarA == null) {
                    v0VarA = androidx.compose.ui.text.font.v0.f41742b.m();
                }
                androidx.compose.ui.text.font.q0 q0VarY = y3Var2.y();
                int iJ = q0VarY != null ? q0VarY.j() : androidx.compose.ui.text.font.q0.f41690b.c();
                androidx.compose.ui.text.font.r0 r0VarZ = y3Var2.z();
                objI1 = bVar.b(yVarV, v0VarA, iJ, r0VarZ != null ? r0VarZ.m() : androidx.compose.ui.text.font.r0.f41699b.a());
                c0Var.Y(objI1);
            }
            androidx.compose.runtime.n7 n7Var = (androidx.compose.runtime.n7) objI1;
            androidx.compose.ui.text.y3 y3Var3 = this.f21717a;
            Object objI2 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI2 == aVar.a()) {
                Object t6Var = new t6(wVar, dVar, bVar, y3Var3, i(n7Var));
                c0Var.Y(t6Var);
                objI2 = t6Var;
            }
            final t6 t6Var2 = (t6) objI2;
            t6Var2.m(wVar, dVar, bVar, y3Var2, i(n7Var));
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            boolean zK0 = c0Var.k0(t6Var2);
            Object objI3 = c0Var.i0();
            if (zK0 || objI3 == aVar.a()) {
                objI3 = new pj.n() { // from class: androidx.compose.foundation.text.v6
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return w6.a.k(t6Var2, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
                    }
                };
                c0Var.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarA = androidx.compose.ui.layout.q0.a(aVar2, (pj.n) objI3);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarA;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return f(a0Var, c0Var, num.intValue());
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.text.y3 y3Var) {
        return androidx.compose.ui.m.k(a0Var, null, new a(y3Var), 1, null);
    }
}
