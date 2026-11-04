package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.r7;
import androidx.compose.ui.a0;
import androidx.compose.ui.input.pointer.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    @NotNull
    public static final a0 a(@NotNull a0 a0Var, @NotNull Function0<Unit> function0) {
        return j.a() ? y.c(a0Var, r7.a(), false, h.a()).B2(new HandwritingDetectorElement(function0)) : a0Var;
    }
}
