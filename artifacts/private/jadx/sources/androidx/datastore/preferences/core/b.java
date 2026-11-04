package androidx.datastore.preferences.core;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f49860a;

    public b(boolean z10) {
        this.f49860a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f49860a.get();
    }

    public final void b(boolean z10) {
        this.f49860a.set(z10);
    }
}
