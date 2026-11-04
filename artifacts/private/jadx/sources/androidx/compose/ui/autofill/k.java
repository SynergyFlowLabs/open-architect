package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@androidx.annotation.w0(28)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f36982a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36983b = 0;

    private k() {
    }

    @androidx.annotation.w0(28)
    public final void a(@NotNull ViewStructure viewStructure, int i10) {
        viewStructure.setMaxTextLength(i10);
    }
}
