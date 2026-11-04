package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.FloatIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class f extends FloatIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f312732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312733b;

    public f(@NotNull float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f312732a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312733b < this.f312732a.length;
    }

    @Override // kotlin.collections.FloatIterator
    public float nextFloat() {
        try {
            float[] fArr = this.f312732a;
            int i10 = this.f312733b;
            this.f312733b = i10 + 1;
            return fArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f312733b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
