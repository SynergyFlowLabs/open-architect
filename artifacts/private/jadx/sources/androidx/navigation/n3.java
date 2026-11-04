package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n3 f71157a = new n3();

    private n3() {
    }

    @oj.j
    @oj.n
    @NotNull
    public static final View.OnClickListener e(@androidx.annotation.d0 int i10) {
        return h(i10, null, 2, null);
    }

    @oj.j
    @oj.n
    @NotNull
    public static final View.OnClickListener f(@androidx.annotation.d0 final int i10, @Nullable final Bundle bundle) {
        return new View.OnClickListener() { // from class: androidx.navigation.k3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n3.i(i10, bundle, view);
            }
        };
    }

    @oj.n
    @NotNull
    public static final View.OnClickListener g(@NotNull final c2 directions) {
        Intrinsics.checkNotNullParameter(directions, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.j3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n3.j(directions, view);
            }
        };
    }

    public static /* synthetic */ View.OnClickListener h(int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return f(i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int i10, Bundle bundle, View view) {
        Intrinsics.checkNotNull(view);
        l(view).c0(i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(c2 c2Var, View view) {
        Intrinsics.checkNotNull(view);
        l(view).m0(c2Var);
    }

    @oj.n
    @NotNull
    public static final w0 k(@NotNull Activity activity, @androidx.annotation.d0 int i10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewN = androidx.core.app.b.N(activity, i10);
        Intrinsics.checkNotNullExpressionValue(viewN, "requireViewById(...)");
        w0 w0VarM = f71157a.m(viewN);
        if (w0VarM != null) {
            return w0VarM;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i10);
    }

    @oj.n
    @NotNull
    public static final w0 l(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        w0 w0VarM = f71157a.m(view);
        if (w0VarM != null) {
            return w0VarM;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final w0 m(View view) {
        return (w0) kotlin.sequences.o.F0(kotlin.sequences.o.p1(kotlin.sequences.o.l(view, new Function1() { // from class: androidx.navigation.l3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.n((View) obj);
            }
        }), new Function1() { // from class: androidx.navigation.m3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n3.o((View) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View n(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0 o(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return f71157a.p(it);
    }

    private final w0 p(View view) {
        Object tag = view.getTag(y3.b.f71462a);
        if (tag instanceof WeakReference) {
            return (w0) ((WeakReference) tag).get();
        }
        if (tag instanceof w0) {
            return (w0) tag;
        }
        return null;
    }

    @oj.n
    public static final void q(@NotNull View view, @Nullable w0 w0Var) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(y3.b.f71462a, w0Var);
    }
}
