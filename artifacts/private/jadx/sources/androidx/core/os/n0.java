package androidx.core.os;

import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.b1;
import androidx.annotation.w0;
import androidx.core.os.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(api = 35)
public abstract class n0<T extends n0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f48067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private CancellationSignal f48068b;

    @NotNull
    public final m0 a() {
        return new m0(c(), b(), this.f48067a, this.f48068b);
    }

    @b1({b1.a.SUBCLASSES})
    @NotNull
    protected abstract Bundle b();

    @b1({b1.a.SUBCLASSES})
    protected abstract int c();

    @b1({b1.a.SUBCLASSES})
    @NotNull
    protected abstract T d();

    @NotNull
    public final T e(@NotNull CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        this.f48068b = cancellationSignal;
        return (T) d();
    }

    @NotNull
    public final T f(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f48067a = tag;
        return (T) d();
    }
}
