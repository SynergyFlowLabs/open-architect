package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class e<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<V> f52309a;

    public e(V v10) {
        this.f52309a = new AtomicReference<>(v10);
    }

    public final boolean a(V v10, V v11) {
        return androidx.compose.animation.core.z1.a(this.f52309a, v10, v11);
    }

    public final V b() {
        return this.f52309a.get();
    }
}
