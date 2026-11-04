package d2;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f269575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        this.f269575b = previousFragmentId;
    }

    @NotNull
    public final String b() {
        return this.f269575b;
    }
}
