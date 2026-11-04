package cb;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.s2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.a0;
import androidx.compose.ui.unit.h;
import androidx.media3.exoplayer.a5;
import com.planner5d.library.engine.input.f;
import com.rabbitmq.client.k0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPreviewWireframe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewWireframe.kt\ncom/planner5d/library/compose/view/util/PreviewWireframeKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,47:1\n57#2:48\n61#2:52\n60#3:49\n70#3:53\n22#4:50\n123#5:51\n*S KotlinDebug\n*F\n+ 1 PreviewWireframe.kt\ncom/planner5d/library/compose/view/util/PreviewWireframeKt\n*L\n43#1:48\n43#1:52\n43#1:49\n43#1:53\n43#1:50\n43#1:51\n*E\n"})
public final class c {
    @o
    @p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(@NotNull final String figmaFileKey, @NotNull final String figmaNodeId, @NotNull final Function2<? super c0, ? super Integer, Unit> content, @Nullable c0 c0Var, final int i10) throws IOException {
        int i11;
        Intrinsics.checkNotNullParameter(figmaFileKey, "figmaFileKey");
        Intrinsics.checkNotNullParameter(figmaNodeId, "figmaNodeId");
        Intrinsics.checkNotNullParameter(content, "content");
        c0 c0VarR = c0Var.R(167365735);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(figmaFileKey) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(figmaNodeId) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(content) ? 256 : 128;
        }
        if ((i11 & f.b.F1) == 146 && c0VarR.d()) {
            c0VarR.u();
        } else {
            if (m0.l0()) {
                m0.A0(167365735, i11, -1, "com.planner5d.library.compose.view.util.PreviewWireframe (PreviewWireframe.kt:37)");
            }
            androidx.compose.ui.graphics.painter.b bVarC = a.f82538a.c(mc.b.f322895a.a(figmaFileKey, figmaNodeId), c0VarR, 48);
            s2.d(bVarC, "Figma preview", i6.i(i6.B(a0.E, h.r(Float.intBitsToFloat((int) (bVarC.l() >> 32)))), h.r(Float.intBitsToFloat((int) (bVarC.l() & k0.f265952a)))), null, null, 0.0f, null, c0VarR, 48, 120);
            content.invoke(c0VarR, Integer.valueOf((i11 >> 6) & 14));
            if (m0.l0()) {
                m0.z0();
            }
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: cb.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c.c(figmaFileKey, figmaNodeId, content, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, String str2, Function2 function2, int i10, c0 c0Var, int i11) throws IOException {
        b(str, str2, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
