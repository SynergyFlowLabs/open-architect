package ji;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f307446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f307447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull String name, @NotNull e grammar) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        this.f307446a = name;
        this.f307447b = grammar;
    }

    @NotNull
    public final e b() {
        return this.f307447b;
    }

    @NotNull
    public final String c() {
        return this.f307446a;
    }
}
