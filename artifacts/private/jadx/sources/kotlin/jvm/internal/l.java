package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ShortIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class l extends ShortIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final short[] f312760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312761b;

    public l(@NotNull short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f312760a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312761b < this.f312760a.length;
    }

    @Override // kotlin.collections.ShortIterator
    public short nextShort() {
        try {
            short[] sArr = this.f312760a;
            int i10 = this.f312761b;
            this.f312761b = i10 + 1;
            return sArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f312761b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
