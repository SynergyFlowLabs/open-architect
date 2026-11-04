package d2;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f269606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Fragment fragment, @NotNull ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f269606b = container;
    }

    @NotNull
    public final ViewGroup b() {
        return this.f269606b;
    }
}
