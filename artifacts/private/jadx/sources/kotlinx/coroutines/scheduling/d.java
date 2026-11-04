package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final d f315477h = new d();

    private d() {
        super(k.f315489c, k.f315490d, k.f315491e, k.f315487a);
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public n0 Y(int i10, @Nullable String str) {
        a0.a(i10);
        return i10 >= k.f315489c ? a0.b(this, str) : super.Y(i10, str);
    }

    @Override // kotlinx.coroutines.scheduling.g, kotlinx.coroutines.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final void g1() {
        super.close();
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }
}
