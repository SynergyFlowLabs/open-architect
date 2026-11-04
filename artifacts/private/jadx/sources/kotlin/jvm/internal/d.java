package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class d extends CharIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final char[] f312728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312729b;

    public d(@NotNull char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f312728a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312729b < this.f312728a.length;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        try {
            char[] cArr = this.f312728a;
            int i10 = this.f312729b;
            this.f312729b = i10 + 1;
            return cArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f312729b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
