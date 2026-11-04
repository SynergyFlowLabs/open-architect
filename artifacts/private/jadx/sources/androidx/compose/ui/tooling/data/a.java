package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.unit.s;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@n
public final class a extends e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f42503k = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<h> f42504j;

    public a(@Nullable Object obj, @Nullable String str, @NotNull s sVar, @Nullable m mVar, @Nullable Object obj2, @NotNull List<h> list, @NotNull Collection<? extends Object> collection, @NotNull Collection<? extends e> collection2, boolean z10) {
        super(obj, str, mVar, obj2, sVar, collection, collection2, z10, null);
        this.f42504j = list;
    }

    @Override // androidx.compose.ui.tooling.data.e
    @NotNull
    public List<h> i() {
        return this.f42504j;
    }
}
