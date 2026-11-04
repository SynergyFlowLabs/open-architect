package coil.memory;

import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements MemoryCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f87562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f87563b;

    public d(@NotNull g gVar, @NotNull h hVar) {
        this.f87562a = gVar;
        this.f87563b = hVar;
    }

    @Override // coil.memory.MemoryCache
    public int a() {
        return this.f87562a.a();
    }

    @Override // coil.memory.MemoryCache
    public void b(int i10) {
        this.f87562a.b(i10);
        this.f87563b.b(i10);
    }

    @Override // coil.memory.MemoryCache
    public void clear() {
        this.f87562a.c();
        this.f87563b.c();
    }

    @Override // coil.memory.MemoryCache
    public boolean d(@NotNull MemoryCache.Key key) {
        boolean zD = this.f87562a.d(key);
        boolean zD2 = this.f87563b.d(key);
        if (!zD && !zD2) {
            return false;
        }
        return true;
    }

    @Override // coil.memory.MemoryCache
    @Nullable
    public MemoryCache.b e(@NotNull MemoryCache.Key key) {
        MemoryCache.b bVarE = this.f87562a.e(key);
        return bVarE == null ? this.f87563b.e(key) : bVarE;
    }

    @Override // coil.memory.MemoryCache
    public void f(@NotNull MemoryCache.Key key, @NotNull MemoryCache.b bVar) {
        this.f87562a.f(MemoryCache.Key.b(key, null, coil.util.c.h(key.c()), 1, null), bVar.c(), coil.util.c.h(bVar.d()));
    }

    @Override // coil.memory.MemoryCache
    public int getSize() {
        return this.f87562a.getSize();
    }

    @Override // coil.memory.MemoryCache
    @NotNull
    public Set<MemoryCache.Key> r() {
        return SetsKt.plus((Set) this.f87562a.r(), (Iterable) this.f87563b.r());
    }
}
