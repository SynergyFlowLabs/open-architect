package androidx.lifecycle;

import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f2 {

    @Nullable
    private final w2.i impl;

    public f2() {
        this.impl = new w2.i();
    }

    public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        w2.i iVar = this.impl;
        if (iVar != null) {
            iVar.e(key, closeable);
        }
    }

    @androidx.annotation.l0
    public final void clear$lifecycle_viewmodel_release() {
        w2.i iVar = this.impl;
        if (iVar != null) {
            iVar.f();
        }
        onCleared();
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        w2.i iVar = this.impl;
        if (iVar != null) {
            return (T) iVar.h(key);
        }
        return null;
    }

    protected void onCleared() {
    }

    public void addCloseable(@NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        w2.i iVar = this.impl;
        if (iVar != null) {
            iVar.d(closeable);
        }
    }

    public f2(@NotNull kotlinx.coroutines.s0 viewModelScope) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.impl = new w2.i(viewModelScope);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        w2.i iVar = this.impl;
        if (iVar != null) {
            iVar.d(closeable);
        }
    }

    public f2(@NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.impl = new w2.i((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public f2(@NotNull kotlinx.coroutines.s0 viewModelScope, @NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.impl = new w2.i(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ f2(Closeable... closeables) {
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.impl = new w2.i((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }
}
