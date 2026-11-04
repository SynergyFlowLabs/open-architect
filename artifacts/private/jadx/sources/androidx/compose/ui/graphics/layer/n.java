package androidx.compose.ui.graphics.layer;

import android.view.View;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f38004a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static Method f38005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f38006c;

    private n() {
    }

    public final boolean a(@NotNull View view) {
        view.invalidateOutline();
        return true;
    }
}
