package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface v1 {
    void A(@Nullable androidx.compose.ui.graphics.e3 e3Var);

    float B();

    void C(float f10);

    float D();

    void E(float f10);

    float F();

    void G(boolean z10);

    void H(int i10);

    void I(float f10);

    void J(int i10);

    float K();

    float L();

    @NotNull
    w1 M();

    boolean N();

    boolean O(boolean z10);

    void P(@NotNull Matrix matrix);

    void Q(int i10);

    void R(float f10);

    void S(float f10);

    int T();

    void U(@Nullable Outline outline);

    void V(boolean z10);

    void W(@NotNull Matrix matrix);

    boolean X(int i10, int i11, int i12, int i13);

    int Y();

    int Z();

    boolean a();

    void a0(int i10);

    int b();

    void b0(@NotNull androidx.compose.ui.graphics.l0 l0Var, @Nullable androidx.compose.ui.graphics.k2 k2Var, @NotNull Function1<? super androidx.compose.ui.graphics.k0, Unit> function1);

    void c();

    void c0(int i10);

    boolean d();

    float d0();

    @Nullable
    androidx.compose.ui.graphics.r0 e();

    void f(@Nullable androidx.compose.ui.graphics.r0 r0Var);

    @Nullable
    androidx.compose.ui.graphics.e3 g();

    int getHeight();

    int getWidth();

    void h(float f10);

    float i();

    void j(float f10);

    void k(float f10);

    void l(float f10);

    void m(float f10);

    int n();

    float o();

    float p();

    float q();

    float r();

    void s(int i10);

    void setAlpha(float f10);

    int t();

    long u();

    float v();

    void w(@NotNull Canvas canvas);

    int x();

    int y();

    void z(float f10);
}
