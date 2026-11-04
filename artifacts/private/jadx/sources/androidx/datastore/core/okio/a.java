package androidx.datastore.core.okio;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f49715a;

    public a(boolean z10) {
        this.f49715a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f49715a.get();
    }

    public final void b(boolean z10) {
        this.f49715a.set(z10);
    }
}
