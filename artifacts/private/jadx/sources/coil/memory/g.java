package coil.memory;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface g {
    int a();

    void b(int i10);

    void c();

    boolean d(@NotNull MemoryCache.Key key);

    @Nullable
    MemoryCache.b e(@NotNull MemoryCache.Key key);

    void f(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map);

    int getSize();

    @NotNull
    Set<MemoryCache.Key> r();
}
