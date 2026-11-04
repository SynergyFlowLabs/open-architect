package e3;

import androidx.compose.runtime.internal.w0;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(parameters = 0)
public final class c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f274613b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<T> f274614a;

    public c(@NotNull T t10) {
        this.f274614a = new WeakReference<>(t10);
    }

    public final void a() {
        this.f274614a.clear();
    }

    @Nullable
    public final T b() {
        return this.f274614a.get();
    }
}
