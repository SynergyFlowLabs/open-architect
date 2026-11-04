package androidx.compose.ui.semantics;

import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class j0 implements Comparator<Pair<? extends n0.j, ? extends List<u>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j0 f41135a = new j0();

    private j0() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull Pair<n0.j, ? extends List<u>> pair, @NotNull Pair<n0.j, ? extends List<u>> pair2) {
        int iCompare = Float.compare(pair.getFirst().B(), pair2.getFirst().B());
        return iCompare != 0 ? iCompare : Float.compare(pair.getFirst().j(), pair2.getFirst().j());
    }
}
