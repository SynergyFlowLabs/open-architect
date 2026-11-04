package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.snapshots.l0;
import androidx.compose.runtime.w6;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class o extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f39635c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l0<c<?>, Object> f39636b;

    public o(@NotNull Pair<? extends c<?>, ? extends Object> pair, @NotNull Pair<? extends c<?>, ? extends Object>... pairArr) {
        super(null);
        l0<c<?>, Object> l0VarI = w6.i();
        this.f39636b = l0VarI;
        l0VarI.put(pair.getFirst(), pair.getSecond());
        l0VarI.putAll(MapsKt.toMap(pairArr));
    }

    @Override // androidx.compose.ui.modifier.i
    public boolean a(@NotNull c<?> cVar) {
        return this.f39636b.containsKey(cVar);
    }

    @Override // androidx.compose.ui.modifier.i
    @Nullable
    public <T> T b(@NotNull c<T> cVar) {
        T t10 = (T) this.f39636b.get(cVar);
        if (t10 == null) {
            t10 = null;
        }
        return t10;
    }

    @Override // androidx.compose.ui.modifier.i
    public <T> void c(@NotNull c<T> cVar, T t10) {
        this.f39636b.put(cVar, t10);
    }
}
