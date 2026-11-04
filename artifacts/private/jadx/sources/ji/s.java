package ji;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f307455a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NotNull String value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f307455a = value;
    }

    @NotNull
    public final String c() {
        return this.f307455a;
    }
}
