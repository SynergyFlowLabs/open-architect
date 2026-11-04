package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.BooleanIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class b extends BooleanIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final boolean[] f312723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312724b;

    public b(@NotNull boolean[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f312723a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312724b < this.f312723a.length;
    }

    @Override // kotlin.collections.BooleanIterator
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.f312723a;
            int i10 = this.f312724b;
            this.f312724b = i10 + 1;
            return zArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f312724b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
