package d2;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f269604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Fragment fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f269604b = z10;
    }

    public final boolean b() {
        return this.f269604b;
    }
}
