package d2;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Fragment fragment) {
        super(fragment, "Attempting to get target fragment from fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}
