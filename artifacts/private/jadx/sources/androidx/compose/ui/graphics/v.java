package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class v extends e3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final RenderEffect f38261b;

    public v(@NotNull RenderEffect renderEffect) {
        super(null);
        this.f38261b = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.e3
    @NotNull
    protected RenderEffect b() {
        return this.f38261b;
    }

    @NotNull
    public final RenderEffect d() {
        return this.f38261b;
    }
}
