package coil.network;

import okhttp3.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f87600a;

    public f(@NotNull f0 f0Var) {
        super("HTTP " + f0Var.E() + ": " + f0Var.f0());
        this.f87600a = f0Var;
    }

    @NotNull
    public final f0 a() {
        return this.f87600a;
    }
}
