package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface m1 {
    @NotNull
    ClipboardManager a();

    @Nullable
    Object b(@NotNull kotlin.coroutines.d<? super k1> dVar);

    @Nullable
    Object c(@Nullable k1 k1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
