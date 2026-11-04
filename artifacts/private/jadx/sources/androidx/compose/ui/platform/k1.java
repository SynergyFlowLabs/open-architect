package androidx.compose.ui.platform;

import android.content.ClipData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40598b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ClipData f40599a;

    public k1(@NotNull ClipData clipData) {
        this.f40599a = clipData;
    }

    @NotNull
    public final ClipData a() {
        return this.f40599a;
    }

    @NotNull
    public final l1 b() {
        return g.d(this.f40599a.getDescription());
    }
}
