package coil.memory;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f87552a;

    public a(@NotNull h hVar) {
        this.f87552a = hVar;
    }

    @Override // coil.memory.g
    public int a() {
        return 0;
    }

    @Override // coil.memory.g
    public void b(int i10) {
    }

    @Override // coil.memory.g
    public void c() {
    }

    @Override // coil.memory.g
    public boolean d(@NotNull MemoryCache.Key key) {
        return false;
    }

    @Override // coil.memory.g
    @Nullable
    public MemoryCache.b e(@NotNull MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.g
    public void f(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        this.f87552a.a(key, bitmap, map, coil.util.a.a(bitmap));
    }

    @Override // coil.memory.g
    public int getSize() {
        return 0;
    }

    @Override // coil.memory.g
    @NotNull
    public Set<MemoryCache.Key> r() {
        return SetsKt.emptySet();
    }
}
