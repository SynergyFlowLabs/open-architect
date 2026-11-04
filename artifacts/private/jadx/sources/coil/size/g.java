package coil.size;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T extends View> implements l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f87776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f87777b;

    public g(@NotNull T t10, boolean z10) {
        this.f87776a = t10;
        this.f87777b = z10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (Intrinsics.areEqual(getView(), gVar.getView()) && f() == gVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.size.l
    public boolean f() {
        return this.f87777b;
    }

    @Override // coil.size.l
    @NotNull
    public T getView() {
        return this.f87776a;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(f());
    }
}
