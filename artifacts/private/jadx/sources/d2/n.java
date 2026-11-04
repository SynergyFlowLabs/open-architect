package d2;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fragment f269605a;

    public /* synthetic */ n(Fragment fragment, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }

    @NotNull
    public final Fragment a() {
        return this.f269605a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Fragment fragment, @Nullable String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f269605a = fragment;
    }
}
