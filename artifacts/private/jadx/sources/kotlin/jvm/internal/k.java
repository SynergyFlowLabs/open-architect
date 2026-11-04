package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class k extends LongIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final long[] f312757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312758b;

    public k(@NotNull long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f312757a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312758b < this.f312757a.length;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        try {
            long[] jArr = this.f312757a;
            int i10 = this.f312758b;
            this.f312758b = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f312758b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
