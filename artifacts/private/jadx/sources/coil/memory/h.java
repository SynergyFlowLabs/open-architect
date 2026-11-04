package coil.memory;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface h {
    void a(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i10);

    void b(int i10);

    void c();

    boolean d(@NotNull MemoryCache.Key key);

    @Nullable
    MemoryCache.b e(@NotNull MemoryCache.Key key);

    @NotNull
    Set<MemoryCache.Key> r();
}
