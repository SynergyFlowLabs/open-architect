package ke;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f312181a;

    public g(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f312181a = title;
    }

    @NotNull
    public final String a() {
        return this.f312181a;
    }
}
