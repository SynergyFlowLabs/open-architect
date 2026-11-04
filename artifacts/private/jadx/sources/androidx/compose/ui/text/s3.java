package androidx.compose.ui.text;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,51:1\n75#2:52\n75#2:53\n75#2:54\n1282#3,6:55\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n43#1:52\n44#1:53\n45#1:54\n47#1:55,6\n*E\n"})
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f42140a = 8;

    @androidx.compose.runtime.o
    @NotNull
    public static final r3 a(int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = f42140a;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1538166871, i11, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        androidx.compose.ui.text.font.y.b bVar = (androidx.compose.ui.text.font.y.b) c0Var.W(androidx.compose.ui.platform.q1.o());
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) c0Var.W(androidx.compose.ui.platform.q1.u());
        boolean zD = c0Var.D(bVar) | c0Var.D(dVar) | c0Var.K(wVar.ordinal());
        if ((((i11 & 14) ^ 6) <= 4 || !c0Var.K(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        boolean z11 = zD | z10;
        Object objI0 = c0Var.i0();
        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new r3(bVar, dVar, wVar, i10);
            c0Var.Y(objI0);
        }
        r3 r3Var = (r3) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return r3Var;
    }
}
