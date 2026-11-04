package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends IntIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f312931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f312932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f312933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f312934d;

    public k(int i10, int i11, int i12) {
        this.f312931a = i12;
        this.f312932b = i11;
        boolean z10 = false;
        int i13 = 4 >> 0;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f312933c = z10;
        this.f312934d = z10 ? i10 : i11;
    }

    public final int b() {
        return this.f312931a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312933c;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i10 = this.f312934d;
        if (i10 != this.f312932b) {
            this.f312934d = this.f312931a + i10;
            return i10;
        }
        if (!this.f312933c) {
            throw new NoSuchElementException();
        }
        this.f312933c = false;
        return i10;
    }
}
