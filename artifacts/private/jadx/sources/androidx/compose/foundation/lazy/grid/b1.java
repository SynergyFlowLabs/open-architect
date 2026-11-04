package androidx.compose.foundation.lazy.grid;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class b1 implements a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16777c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Integer> f16779b;

    public b1(int i10, @NotNull List<Integer> list) {
        this.f16778a = i10;
        this.f16779b = list;
    }

    @Override // androidx.compose.foundation.lazy.grid.a1
    public int a(int i10) {
        return this.f16779b.get(i10).intValue();
    }

    @Override // androidx.compose.foundation.lazy.grid.a1
    public int b() {
        return this.f16778a;
    }

    @Override // androidx.compose.foundation.lazy.grid.a1
    public int c() {
        return this.f16779b.size();
    }
}
