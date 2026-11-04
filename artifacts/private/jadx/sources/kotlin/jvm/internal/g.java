package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class g extends IntIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f312734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312735b;

    public g(@NotNull int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f312734a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312735b < this.f312734a.length;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        try {
            int[] iArr = this.f312734a;
            int i10 = this.f312735b;
            this.f312735b = i10 + 1;
            return iArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f312735b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
