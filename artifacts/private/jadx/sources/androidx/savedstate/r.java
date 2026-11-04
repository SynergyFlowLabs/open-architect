package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "ViewTreeSavedStateRegistryOwner")
public final class r {
    @oj.i(name = "get")
    @Nullable
    public static final m a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(a.C0747a.f75136a);
            m mVar = tag instanceof m ? (m) tag : null;
            if (mVar != null) {
                return mVar;
            }
            Object objA = q1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    @oj.i(name = "set")
    public static final void b(@NotNull View view, @Nullable m mVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(a.C0747a.f75136a, mVar);
    }
}
