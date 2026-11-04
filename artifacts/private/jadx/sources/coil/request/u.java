package coil.request;

import android.view.View;
import kotlinx.coroutines.a1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f87753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private volatile a1<? extends j> f87754b;

    public u(@NotNull View view, @NotNull a1<? extends j> a1Var) {
        this.f87753a = view;
        this.f87754b = a1Var;
    }

    @Override // coil.request.e
    @NotNull
    public a1<j> a() {
        return this.f87754b;
    }

    public void b(@NotNull a1<? extends j> a1Var) {
        this.f87754b = a1Var;
    }

    @Override // coil.request.e
    public void dispose() {
        if (k()) {
            return;
        }
        coil.util.l.t(this.f87753a).a();
    }

    @Override // coil.request.e
    public boolean k() {
        return coil.util.l.t(this.f87753a).d(this);
    }
}
