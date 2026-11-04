package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class b<T, K> extends AbstractIterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Iterator<T> f313003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<T, K> f313004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final HashSet<K> f313005c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Iterator<? extends T> source, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f313003a = source;
        this.f313004b = keySelector;
        this.f313005c = new HashSet<>();
    }

    @Override // kotlin.collections.AbstractIterator
    protected void computeNext() {
        while (this.f313003a.hasNext()) {
            T next = this.f313003a.next();
            if (this.f313005c.add(this.f313004b.invoke(next))) {
                setNext(next);
                return;
            }
        }
        done();
    }
}
