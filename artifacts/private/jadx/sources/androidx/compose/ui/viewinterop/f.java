package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.a0;
import androidx.compose.ui.focus.r;
import androidx.compose.ui.focus.w;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupNode_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n1#2:269\n*E\n"})
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final a0 e(@NotNull a0 a0Var) {
        return r.b(r.b(a0Var.B2(FocusGroupPropertiesElement.f42732c)).B2(FocusTargetPropertiesElement.f42733c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect f(w wVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        n0.j jVarX = wVar.x();
        if (jVarX == null) {
            return null;
        }
        return new Rect((((int) jVarX.t()) + iArr[0]) - iArr2[0], (((int) jVarX.B()) + iArr[1]) - iArr2[1], (((int) jVarX.x()) + iArr[0]) - iArr2[0], (((int) jVarX.j()) + iArr[1]) - iArr2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View g(a0.d dVar) {
        View viewK = androidx.compose.ui.node.k.u(dVar.w()).k();
        if (viewK != null) {
            return viewK;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
