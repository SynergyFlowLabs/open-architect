package d2;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Fragment f269607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f269608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Fragment fragment, @NotNull Fragment expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        this.f269607b = expectedParentFragment;
        this.f269608c = i10;
    }

    public final int b() {
        return this.f269608c;
    }

    @NotNull
    public final Fragment c() {
        return this.f269607b;
    }
}
