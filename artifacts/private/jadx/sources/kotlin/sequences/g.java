package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class g implements Sequence, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f313018a = new g();

    private g() {
    }

    @Override // kotlin.sequences.e
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g a(int i10) {
        return f313018a;
    }

    @Override // kotlin.sequences.e
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public g b(int i10) {
        return f313018a;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return EmptyIterator.INSTANCE;
    }
}
