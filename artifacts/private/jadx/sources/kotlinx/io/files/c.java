package kotlinx.io.files;

import java.util.Collection;
import kotlinx.io.o;
import kotlinx.io.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface c {
    static /* synthetic */ void a(c cVar, i iVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        cVar.k(iVar, z10);
    }

    static /* synthetic */ o f(c cVar, i iVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return cVar.b(iVar, z10);
    }

    static /* synthetic */ void l(c cVar, i iVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        cVar.e(iVar, z10);
    }

    @NotNull
    o b(@NotNull i iVar, boolean z10);

    @NotNull
    i c(@NotNull i iVar);

    void d(@NotNull i iVar, @NotNull i iVar2);

    void e(@NotNull i iVar, boolean z10);

    @NotNull
    Collection<i> g(@NotNull i iVar);

    @NotNull
    p h(@NotNull i iVar);

    @Nullable
    b i(@NotNull i iVar);

    boolean j(@NotNull i iVar);

    void k(@NotNull i iVar, boolean z10);
}
