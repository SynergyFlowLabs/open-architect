package androidx.compose.ui.node;

import java.util.Comparator;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class l2<E> extends TreeSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39906a = 8;

    public l2(@NotNull Comparator<? super E> comparator) {
        super(comparator);
    }

    public /* bridge */ int c() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return c();
    }
}
