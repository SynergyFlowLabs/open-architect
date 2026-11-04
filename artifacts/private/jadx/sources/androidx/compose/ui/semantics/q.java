package androidx.compose.ui.semantics;

import androidx.collection.g2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSemanticsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsInfo.kt\nandroidx/compose/ui/semantics/SemanticsInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,104:1\n1#2:105\n80#3:106\n*S KotlinDebug\n*F\n+ 1 SemanticsInfo.kt\nandroidx/compose/ui/semantics/SemanticsInfoKt\n*L\n88#1:106\n*E\n"})
public final class q {
    @Nullable
    public static final p a(@NotNull p pVar) {
        for (p pVarO = pVar.o(); pVarO != null; pVarO = pVarO.o()) {
            SemanticsConfiguration semanticsConfigurationQ0 = pVarO.q0();
            if (semanticsConfigurationQ0 != null && semanticsConfigurationQ0.v()) {
                return pVarO;
            }
        }
        return null;
    }

    @Nullable
    public static final SemanticsConfiguration b(@NotNull p pVar) {
        SemanticsConfiguration semanticsConfigurationQ0 = pVar.q0();
        if (semanticsConfigurationQ0 != null && semanticsConfigurationQ0.v() && !semanticsConfigurationQ0.u()) {
            semanticsConfigurationQ0 = semanticsConfigurationQ0.l();
            g2 g2Var = new g2(pVar.r0().size());
            g2Var.h0(pVar.r0());
            while (g2Var.I()) {
                p pVar2 = (p) g2Var.J0(g2Var.f12450b - 1);
                SemanticsConfiguration semanticsConfigurationQ1 = pVar2.q0();
                if (semanticsConfigurationQ1 != null && !semanticsConfigurationQ1.v()) {
                    semanticsConfigurationQ0.w(semanticsConfigurationQ1);
                    if (!semanticsConfigurationQ1.u()) {
                        g2Var.h0(pVar2.r0());
                    }
                }
            }
        }
        return semanticsConfigurationQ0;
    }

    @Nullable
    public static final p c(@NotNull p pVar) {
        for (p pVarO = pVar.o(); pVarO != null; pVarO = pVarO.o()) {
            if (pVarO.q0() != null) {
                return pVarO;
            }
        }
        return null;
    }
}
