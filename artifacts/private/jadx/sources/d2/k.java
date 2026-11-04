package d2;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Fragment f269602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f269603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Fragment fragment, @NotNull Fragment targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        this.f269602b = targetFragment;
        this.f269603c = i10;
    }

    public final int b() {
        return this.f269603c;
    }

    @NotNull
    public final Fragment c() {
        return this.f269602b;
    }
}
