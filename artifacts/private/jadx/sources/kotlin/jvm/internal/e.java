package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.DoubleIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class e extends DoubleIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final double[] f312730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312731b;

    public e(@NotNull double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f312730a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312731b < this.f312730a.length;
    }

    @Override // kotlin.collections.DoubleIterator
    public double nextDouble() {
        try {
            double[] dArr = this.f312730a;
            int i10 = this.f312731b;
            this.f312731b = i10 + 1;
            return dArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f312731b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
