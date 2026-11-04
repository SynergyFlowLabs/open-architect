package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37184b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final DragEvent f37185a;

    public b(@NotNull DragEvent dragEvent) {
        this.f37185a = dragEvent;
    }

    @NotNull
    public final DragEvent a() {
        return this.f37185a;
    }
}
