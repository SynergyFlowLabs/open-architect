package androidx.compose.foundation.text;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m5 {

    @SourceDebugExtension({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,103:1\n75#2:104\n75#2:112\n1282#3,6:105\n1282#3,6:113\n1282#3,6:119\n640#4:111\n57#5:125\n60#6:126\n53#6,3:129\n53#6,3:133\n22#7:127\n30#8:128\n30#8:132\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n*L\n47#1:104\n55#1:112\n48#1:105,6\n59#1:113,6\n62#1:119,6\n50#1:111\n77#1:125\n77#1:126\n89#1:129,3\n90#1:133,3\n77#1:127\n89#1:128\n90#1:132\n*E\n"})
    static final class a implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.i0 f20508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g4 f20509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.y0 f20510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.m0 f20511d;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.m5$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
        static final class C0152a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f20512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.input.internal.d1 f20513b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0152a(androidx.compose.foundation.text.input.internal.d1 d1Var, kotlin.coroutines.d<? super C0152a> dVar) {
                super(2, dVar);
                this.f20513b = d1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0152a(this.f20513b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f20512a;
                int i11 = 6 ^ 1;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    androidx.compose.foundation.text.input.internal.d1 d1Var = this.f20513b;
                    this.f20512a = 1;
                    if (d1Var.g(this) == objL) {
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
                return ((C0152a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(androidx.compose.ui.graphics.i0 i0Var, g4 g4Var, androidx.compose.ui.text.input.y0 y0Var, androidx.compose.ui.text.input.m0 m0Var) {
            this.f20508a = i0Var;
            this.f20509b = g4Var;
            this.f20510c = y0Var;
            this.f20511d = m0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.foundation.text.input.internal.d1 d1Var, androidx.compose.ui.text.input.m0 m0Var, androidx.compose.ui.text.input.y0 y0Var, g4 g4Var, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.drawscope.c cVar) {
            n0.j jVar;
            androidx.compose.ui.text.p3 p3VarI;
            cVar.E4();
            float fE = d1Var.e();
            if (fE != 0.0f) {
                int iB = m0Var.b(androidx.compose.ui.text.w3.n(y0Var.l()));
                y6 y6VarN = g4Var.n();
                if (y6VarN == null || (p3VarI = y6VarN.i()) == null || (jVar = p3VarI.e(iB)) == null) {
                    jVar = new n0.j(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fT = kotlin.ranges.r.t((float) Math.floor(cVar.S7(n5.a())), 1.0f);
                float f10 = fT / 2;
                float fT2 = kotlin.ranges.r.t(kotlin.ranges.r.A(jVar.t() + f10, Float.intBitsToFloat((int) (cVar.d() >> 32)) - f10), f10);
                float fFloor = ((int) fT) % 2 == 1 ? ((float) Math.floor(fT2)) + 0.5f : (float) Math.rint(fT2);
                androidx.compose.ui.graphics.drawscope.f.D8(cVar, i0Var, n0.g.g((((long) Float.floatToRawIntBits(jVar.B())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fFloor)) << 32)), n0.g.g((((long) Float.floatToRawIntBits(jVar.j())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(fFloor)) << 32)), fT, 0, null, fE, null, 0, 432, null);
            }
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.ui.a0 a0VarD;
            c0Var.E(-84507373);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-84507373, i10, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
            }
            boolean zBooleanValue = ((Boolean) c0Var.W(androidx.compose.ui.platform.q1.l())).booleanValue();
            boolean zG = c0Var.G(zBooleanValue);
            Object objI0 = c0Var.i0();
            if (zG || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new androidx.compose.foundation.text.input.internal.d1(zBooleanValue);
                c0Var.Y(objI0);
            }
            final androidx.compose.foundation.text.input.internal.d1 d1Var = (androidx.compose.foundation.text.input.internal.d1) objI0;
            androidx.compose.ui.graphics.i0 i0Var = this.f20508a;
            boolean z10 = ((i0Var instanceof androidx.compose.ui.graphics.s3) && ((androidx.compose.ui.graphics.s3) i0Var).c() == 16) ? false : true;
            if (((androidx.compose.ui.platform.w4) c0Var.W(androidx.compose.ui.platform.q1.E())).c() && this.f20509b.h() && androidx.compose.ui.text.w3.h(this.f20510c.l()) && z10) {
                c0Var.E(-707487962);
                androidx.compose.ui.text.f fVarJ = this.f20510c.j();
                androidx.compose.ui.text.w3 w3VarB = androidx.compose.ui.text.w3.b(this.f20510c.l());
                boolean zK0 = c0Var.k0(d1Var);
                Object objI1 = c0Var.i0();
                if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new C0152a(d1Var, null);
                    c0Var.Y(objI1);
                }
                androidx.compose.runtime.b2.h(fVarJ, w3VarB, (Function2) objI1, c0Var, 0);
                boolean zK1 = c0Var.k0(d1Var) | c0Var.k0(this.f20511d) | c0Var.D(this.f20510c) | c0Var.k0(this.f20509b) | c0Var.D(this.f20508a);
                final androidx.compose.ui.text.input.m0 m0Var = this.f20511d;
                final androidx.compose.ui.text.input.y0 y0Var = this.f20510c;
                final g4 g4Var = this.f20509b;
                final androidx.compose.ui.graphics.i0 i0Var2 = this.f20508a;
                Object objI2 = c0Var.i0();
                if (zK1 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                    Object obj = new Function1() { // from class: androidx.compose.foundation.text.l5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return m5.a.f(d1Var, m0Var, y0Var, g4Var, i0Var2, (androidx.compose.ui.graphics.drawscope.c) obj2);
                        }
                    };
                    c0Var.Y(obj);
                    objI2 = obj;
                }
                a0VarD = androidx.compose.ui.draw.n.d(a0Var, (Function1) objI2);
                c0Var.A();
            } else {
                c0Var.E(-705473241);
                c0Var.A();
                a0VarD = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarD;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return d(a0Var, c0Var, num.intValue());
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull g4 g4Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, boolean z10) {
        return z10 ? androidx.compose.ui.m.k(a0Var, null, new a(i0Var, g4Var, y0Var, m0Var), 1, null) : a0Var;
    }
}
