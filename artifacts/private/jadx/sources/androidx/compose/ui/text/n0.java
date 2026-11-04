package androidx.compose.ui.text;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface n0 {

    public static final class a {
    }

    static /* synthetic */ void C(n0 n0Var, androidx.compose.ui.graphics.k0 k0Var, long j10, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        n0Var.x(k0Var, (i11 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10, (i11 & 4) != 0 ? null : o3Var, (i11 & 8) != 0 ? null : kVar, (i11 & 16) == 0 ? iVar : null, (i11 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : i10);
    }

    static /* synthetic */ void t(n0 n0Var, androidx.compose.ui.graphics.k0 k0Var, long j10, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.k kVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i10 & 2) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        n0Var.J(k0Var, j10, (i10 & 4) != 0 ? null : o3Var, (i10 & 8) != 0 ? null : kVar);
    }

    static /* synthetic */ void u(n0 n0Var, androidx.compose.ui.graphics.k0 k0Var, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        n0Var.D(k0Var, i0Var, f10, (i11 & 8) != 0 ? null : o3Var, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : iVar, (i11 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : i10);
    }

    static /* synthetic */ int v(n0 n0Var, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return n0Var.o(i10, z10);
    }

    @NotNull
    androidx.compose.ui.graphics.k2 A(int i10, int i11);

    float B(int i10, boolean z10);

    void D(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, float f10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10);

    float E();

    int F(int i10);

    @NotNull
    androidx.compose.ui.text.style.i G(int i10);

    @NotNull
    List<n0.j> H();

    float I(int i10);

    void J(@NotNull androidx.compose.ui.graphics.k0 k0Var, long j10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar);

    float a(int i10);

    int b(int i10);

    float c(int i10);

    float d(int i10);

    float e(int i10);

    float f();

    int g();

    float getHeight();

    float getWidth();

    float h(int i10);

    float i();

    @NotNull
    n0.j j(int i10);

    @NotNull
    androidx.compose.ui.text.style.i k(int i10);

    long l(int i10);

    float m();

    int n(long j10);

    int o(int i10, boolean z10);

    float p(int i10);

    int q(float f10);

    long r(@NotNull n0.j jVar, int i10, @NotNull m3 m3Var);

    void s(long j10, @NotNull float[] fArr, @androidx.annotation.g0(from = 0) int i10);

    @NotNull
    n0.j w(int i10);

    void x(@NotNull androidx.compose.ui.graphics.k0 k0Var, long j10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10);

    boolean y(int i10);

    boolean z();
}
