package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.layout.g1;
import androidx.compose.ui.unit.s;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@n
public final class g extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f42525l = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f42526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<g1> f42527k;

    public g(@Nullable Object obj, @NotNull Object obj2, @NotNull s sVar, @NotNull Collection<? extends Object> collection, @NotNull List<g1> list, @NotNull Collection<? extends e> collection2) {
        super(obj, null, null, null, sVar, collection, collection2, false, null);
        this.f42526j = obj2;
        this.f42527k = list;
    }

    @Override // androidx.compose.ui.tooling.data.e
    @NotNull
    public List<g1> g() {
        return this.f42527k;
    }

    @NotNull
    public final Object k() {
        return this.f42526j;
    }
}
