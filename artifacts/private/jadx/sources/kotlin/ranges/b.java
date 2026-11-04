package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends CharIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f312913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f312914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f312915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f312916d;

    public b(char c10, char c11, int i10) {
        this.f312913a = i10;
        this.f312914b = c11;
        boolean z10 = false;
        int i11 = 4 & 1;
        if (i10 <= 0 ? Intrinsics.compare((int) c10, (int) c11) >= 0 : Intrinsics.compare((int) c10, (int) c11) <= 0) {
            z10 = true;
        }
        this.f312915c = z10;
        this.f312916d = z10 ? c10 : c11;
    }

    public final int b() {
        return this.f312913a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312915c;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int i10 = this.f312916d;
        if (i10 != this.f312914b) {
            this.f312916d = this.f312913a + i10;
        } else {
            if (!this.f312915c) {
                throw new NoSuchElementException();
            }
            this.f312915c = false;
        }
        return (char) i10;
    }
}
