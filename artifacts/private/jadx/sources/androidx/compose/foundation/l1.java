package androidx.compose.foundation;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f15766a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f15766a;
    }

    public static final boolean b(@NotNull androidx.compose.ui.node.j jVar) {
        return c(androidx.compose.ui.node.l.a(jVar));
    }

    private static final boolean c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
