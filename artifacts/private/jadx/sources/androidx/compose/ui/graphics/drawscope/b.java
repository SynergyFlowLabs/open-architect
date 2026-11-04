package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.w1;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.o;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    @SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,776:1\n57#2:777\n61#2:780\n57#2:786\n61#2:789\n60#3:778\n70#3:781\n53#3,3:783\n60#3:787\n70#3:790\n60#3:796\n70#3:799\n60#3:801\n70#3:804\n60#3:806\n70#3:809\n60#3:811\n70#3:814\n22#4:779\n22#4:788\n22#4:797\n22#4:802\n22#4:807\n22#4:812\n33#5:782\n34#6,4:791\n65#7:795\n69#7:798\n65#7:800\n69#7:803\n65#7:805\n69#7:808\n65#7:810\n69#7:813\n*S KotlinDebug\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScopeKt$asDrawTransform$1\n*L\n729#1:777\n729#1:780\n730#1:786\n730#1:789\n729#1:778\n729#1:781\n729#1:783,3\n730#1:787\n730#1:790\n758#1:796\n758#1:799\n760#1:801\n760#1:804\n766#1:806\n766#1:809\n768#1:811\n768#1:814\n729#1:779\n730#1:788\n758#1:797\n760#1:802\n766#1:807\n768#1:812\n729#1:782\n730#1:791,4\n758#1:795\n758#1:798\n760#1:800\n760#1:803\n766#1:805\n766#1:808\n768#1:810\n768#1:813\n*E\n"})
    public static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f37736a;

        a(d dVar) {
            this.f37736a = dVar;
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public long Y() {
            return o.b(d());
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void a(float[] fArr) {
            this.f37736a.f().L(fArr);
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void b(float f10, float f11, float f12, float f13, int i10) {
            this.f37736a.f().b(f10, f11, f12, f13, i10);
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void c(float f10, float f11) {
            this.f37736a.f().c(f10, f11);
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public long d() {
            return this.f37736a.d();
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void e(k2 k2Var, int i10) {
            this.f37736a.f().e(k2Var, i10);
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void g(float f10, float f11, long j10) {
            k0 k0VarF = this.f37736a.f();
            int i10 = (int) (j10 >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i10);
            int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            k0VarF.c(fIntBitsToFloat, Float.intBitsToFloat(i11));
            k0VarF.v(f10, f11);
            k0VarF.c(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void h(float f10, long j10) {
            k0 k0VarF = this.f37736a.f();
            int i10 = (int) (j10 >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i10);
            int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            k0VarF.c(fIntBitsToFloat, Float.intBitsToFloat(i11));
            k0VarF.H(f10);
            k0VarF.c(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void i(float f10, float f11, float f12, float f13) {
            k0 k0VarF = this.f37736a.f();
            d dVar = this.f37736a;
            long jF = n0.n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (d() >> 32)) - (f12 + f10))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (d() & com.rabbitmq.client.k0.f265952a)) - (f13 + f11))) & com.rabbitmq.client.k0.f265952a));
            if (!(Float.intBitsToFloat((int) (jF >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jF & com.rabbitmq.client.k0.f265952a)) >= 0.0f)) {
                w1.b("Width and height must be greater than or equal to zero");
            }
            dVar.g(jF);
            k0VarF.c(f10, f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j b(d dVar) {
        return new a(dVar);
    }
}
