package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {
    @NotNull
    public static final e0 a(@NotNull InputConnection inputConnection, @NotNull Function1<? super e0, Unit> function1) {
        return Build.VERSION.SDK_INT >= 34 ? new k0(inputConnection, function1) : new h0(inputConnection, function1);
    }
}
