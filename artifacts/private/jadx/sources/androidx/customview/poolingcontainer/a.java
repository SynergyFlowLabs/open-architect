package androidx.customview.poolingcontainer;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a2;
import androidx.core.view.c2;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@i(name = "PoolingContainer")
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f49186a = d.a.f49190b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f49187b = d.a.f49189a;

    @e.a({"ExecutorRegistration"})
    public static final void a(@NotNull View view, @NotNull b listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        d(view).a(listener);
    }

    public static final void b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator<View> it = c2.i(view).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    public static final void c(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Iterator<View> it = a2.e(viewGroup).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    private static final c d(View view) {
        int i10 = f49186a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final boolean e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(f49187b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (Object obj : c2.j(view)) {
            if ((obj instanceof View) && e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @e.a({"ExecutorRegistration"})
    public static final void g(@NotNull View view, @NotNull b listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        d(view).c(listener);
    }

    public static final void h(@NotNull View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(f49187b, Boolean.valueOf(z10));
    }
}
