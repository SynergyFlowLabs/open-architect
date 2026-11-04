package ji;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f307457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull String value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f307457a = value;
    }

    @NotNull
    public final String c() {
        return this.f307457a;
    }
}
