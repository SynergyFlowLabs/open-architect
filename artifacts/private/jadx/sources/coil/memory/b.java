package coil.memory;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements h {
    @Override // coil.memory.h
    public void a(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i10) {
    }

    @Override // coil.memory.h
    public void b(int i10) {
    }

    @Override // coil.memory.h
    public void c() {
    }

    @Override // coil.memory.h
    public boolean d(@NotNull MemoryCache.Key key) {
        return false;
    }

    @Override // coil.memory.h
    @Nullable
    public MemoryCache.b e(@NotNull MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.h
    @NotNull
    public Set<MemoryCache.Key> r() {
        return SetsKt.emptySet();
    }
}
