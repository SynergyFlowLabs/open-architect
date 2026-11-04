package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/Ripple_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n1#2:363\n*E\n"})
public final class z {
    /* JADX INFO: Access modifiers changed from: private */
    public static final o c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof o) {
                return (o) childAt;
            }
        }
        o oVar = new o(viewGroup.getContext());
        viewGroup.addView(oVar);
        return oVar;
    }

    @NotNull
    public static final androidx.compose.ui.node.j d(@NotNull androidx.compose.foundation.interaction.h hVar, boolean z10, float f10, @NotNull x0 x0Var, @NotNull Function0<l> function0) {
        return new d(hVar, z10, f10, x0Var, function0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup e(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
