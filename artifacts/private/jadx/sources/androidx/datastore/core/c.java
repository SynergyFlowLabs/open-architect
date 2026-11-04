package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f49487a;

    public c(boolean z10) {
        this.f49487a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f49487a.get();
    }

    public final void b(boolean z10) {
        this.f49487a.set(z10);
    }
}
