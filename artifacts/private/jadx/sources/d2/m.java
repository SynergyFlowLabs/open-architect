package d2;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends n {
    public /* synthetic */ m(Fragment fragment, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Fragment fragment, @Nullable String str) {
        super(fragment, str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }
}
