package androidx.compose.foundation.text.contextmenu.modifier;

import android.content.Context;
import androidx.compose.ui.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function2<? super a0.a, ? super Context, Unit> function2) {
        return a0Var.B2(new AddTextContextMenuDataComponentsWithContextElement(function2));
    }
}
