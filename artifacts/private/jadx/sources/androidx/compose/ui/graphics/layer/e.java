package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.f2;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nGraphicsLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,415:1\n233#2:416\n30#3:417\n30#3:431\n53#4,3:418\n53#4,3:428\n53#4,3:432\n53#4,3:436\n60#4:440\n57#5,6:421\n33#6:427\n33#6:435\n48#7:439\n22#8:441\n*S KotlinDebug\n*F\n+ 1 GraphicsLayer.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerKt\n*L\n51#1:416\n393#1:417\n407#1:431\n393#1:418,3\n394#1:428,3\n407#1:432,3\n408#1:436,3\n409#1:440\n394#1:421,6\n394#1:427\n408#1:435\n409#1:439\n409#1:441\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f37915a = 8.0f;

    public static final void a(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, @NotNull c cVar) {
        cVar.h(fVar.Z3().f(), fVar.Z3().h());
    }

    public static final void b(@NotNull c cVar, @NotNull f2 f2Var) {
        if (f2Var instanceof f2.b) {
            f2.b bVar = (f2.b) f2Var;
            long jG = n0.g.g((((long) Float.floatToRawIntBits(bVar.b().t())) << 32) | (((long) Float.floatToRawIntBits(bVar.b().B())) & k0.f265952a));
            n0.j jVarB = bVar.b();
            float fX = jVarB.x() - jVarB.t();
            n0.j jVarB2 = bVar.b();
            cVar.f0(jG, n0.n.f((((long) Float.floatToRawIntBits(jVarB2.j() - jVarB2.B())) & k0.f265952a) | (Float.floatToRawIntBits(fX) << 32)));
            return;
        }
        if (f2Var instanceof f2.a) {
            cVar.c0(((f2.a) f2Var).b());
            return;
        }
        if (!(f2Var instanceof f2.c)) {
            throw new kotlin.k0();
        }
        f2.c cVar2 = (f2.c) f2Var;
        if (cVar2.c() != null) {
            cVar.c0(cVar2.c());
            return;
        }
        n0.l lVarB = cVar2.b();
        long jG2 = n0.g.g((((long) Float.floatToRawIntBits(lVarB.q())) << 32) | (((long) Float.floatToRawIntBits(lVarB.s())) & k0.f265952a));
        float fV = lVarB.v();
        cVar.l0(jG2, n0.n.f((((long) Float.floatToRawIntBits(lVarB.p())) & k0.f265952a) | (Float.floatToRawIntBits(fV) << 32)), Float.intBitsToFloat((int) (lVarB.n() >> 32)));
    }
}
