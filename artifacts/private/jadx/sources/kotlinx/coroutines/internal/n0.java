package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@k2
public final class n0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n0 f315102a = new n0();

    private n0() {
    }

    @Override // kotlinx.coroutines.internal.j0
    public int a() {
        return -1;
    }

    @Override // kotlinx.coroutines.internal.j0
    @Nullable
    public String b() {
        return j0.a.a(this);
    }

    @Override // kotlinx.coroutines.internal.j0
    @NotNull
    public a3 c(@NotNull List<? extends j0> list) {
        return new m0(null, null, 2, null);
    }
}
