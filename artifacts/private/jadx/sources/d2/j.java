package d2;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Fragment fragment) {
        super(fragment, "Attempting to set retain instance for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}
