package androidx.compose.ui.node;

import androidx.compose.ui.graphics.l3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface w1 {
    void a(@NotNull float[] fArr);

    void b(@NotNull Function2<? super androidx.compose.ui.graphics.k0, ? super androidx.compose.ui.graphics.layer.c, Unit> function2, @NotNull Function0<Unit> function0);

    void c(@NotNull androidx.compose.ui.graphics.k0 k0Var, @Nullable androidx.compose.ui.graphics.layer.c cVar);

    void d(@NotNull n0.e eVar, boolean z10);

    void destroy();

    long f(long j10, boolean z10);

    void g(long j10);

    float getFrameRate();

    @NotNull
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo3getUnderlyingMatrixsQKQjiQ();

    boolean h(long j10);

    void i(@NotNull l3 l3Var);

    void invalidate();

    void j(@NotNull float[] fArr);

    void k(long j10);

    void l();

    boolean m();

    void setFrameRate(float f10);

    void setFrameRateFromParent(boolean z10);
}
