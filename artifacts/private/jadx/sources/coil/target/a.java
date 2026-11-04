package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T extends View> implements d<T>, coil.transition.d, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f87793a;

    @Override // coil.transition.d
    @Nullable
    public abstract Drawable f();

    public abstract void l(@Nullable Drawable drawable);

    protected final void m() {
        Object objF = f();
        Animatable animatable = objF instanceof Animatable ? (Animatable) objF : null;
        if (animatable == null) {
            return;
        }
        if (this.f87793a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    protected final void n(@Nullable Drawable drawable) {
        Object objF = f();
        Animatable animatable = objF instanceof Animatable ? (Animatable) objF : null;
        if (animatable != null) {
            animatable.stop();
        }
        l(drawable);
        m();
    }

    @Override // coil.target.c
    public void onError(@Nullable Drawable drawable) {
        n(drawable);
    }

    @Override // coil.target.c
    public void onStart(@Nullable Drawable drawable) {
        n(drawable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull o0 o0Var) {
        this.f87793a = false;
        m();
    }

    @Override // coil.target.c
    public void onSuccess(@NotNull Drawable drawable) {
        n(drawable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull o0 o0Var) {
        this.f87793a = true;
        m();
    }
}
