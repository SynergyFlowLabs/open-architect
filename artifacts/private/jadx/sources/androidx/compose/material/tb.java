package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class tb implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f24994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f24995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24996c;

    public tb(@NotNull View view, @NotNull Function0<Unit> function0) {
        this.f24994a = view;
        this.f24995b = function0;
        view.addOnAttachStateChangeListener(this);
        b();
    }

    private final void b() {
        if (this.f24996c || !this.f24994a.isAttachedToWindow()) {
            return;
        }
        this.f24994a.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f24996c = true;
    }

    private final void c() {
        if (this.f24996c) {
            this.f24994a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f24996c = false;
        }
    }

    public final void a() {
        c();
        this.f24994a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f24995b.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View view) {
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View view) {
        c();
    }
}
