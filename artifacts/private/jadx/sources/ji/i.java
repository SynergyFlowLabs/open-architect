package ji;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends e implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f307445a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull e grammar) {
        super(null);
        Intrinsics.checkNotNullParameter(grammar, "grammar");
        this.f307445a = grammar;
    }

    @Override // ji.u
    @NotNull
    public e b() {
        return this.f307445a;
    }
}
