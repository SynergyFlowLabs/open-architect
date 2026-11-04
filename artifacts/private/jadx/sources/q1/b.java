package q1;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@i(name = "ViewTree")
public final class b {
    @Nullable
    public static final ViewParent a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(a.C2462a.f350240a);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void b(@NotNull View view, @Nullable ViewParent viewParent) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(a.C2462a.f350240a, viewParent);
    }
}
