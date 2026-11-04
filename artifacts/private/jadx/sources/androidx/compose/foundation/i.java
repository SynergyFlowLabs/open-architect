package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class i extends y implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15516g;

    public i(@NotNull kotlinx.coroutines.s0 s0Var) {
        super(s0Var);
        this.f15515f = -1;
        this.f15516g = -1;
    }

    public final int j() {
        return this.f15516g;
    }

    public final int k() {
        return this.f15515f;
    }

    public final void l(int i10) {
        this.f15516g = i10;
    }

    public final void m(int i10) {
        this.f15515f = i10;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NotNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (this.f15515f == i11 && this.f15516g == i12) {
            return;
        }
        this.f15515f = i11;
        this.f15516g = i12;
        f(surfaceHolder.getSurface(), i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.f15515f = surfaceFrame.width();
        this.f15516g = surfaceFrame.height();
        g(surfaceHolder.getSurface(), this.f15515f, this.f15516g);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder surfaceHolder) {
        h(surfaceHolder.getSurface());
    }
}
