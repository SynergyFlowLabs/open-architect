package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ByteIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class c extends ByteIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f312726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f312727b;

    public c(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f312726a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312727b < this.f312726a.length;
    }

    @Override // kotlin.collections.ByteIterator
    public byte nextByte() {
        try {
            byte[] bArr = this.f312726a;
            int i10 = this.f312727b;
            this.f312727b = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f312727b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
