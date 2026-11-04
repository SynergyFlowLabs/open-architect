package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.u1;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.3")
final class v implements Iterator<u1>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f312953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f312954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f312955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f312956d;

    public /* synthetic */ v(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12);
    }

    public int b() {
        int i10 = this.f312956d;
        if (i10 != this.f312953a) {
            this.f312956d = u1.n(this.f312955c + i10);
            return i10;
        }
        if (!this.f312954b) {
            throw new NoSuchElementException();
        }
        this.f312954b = false;
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312954b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ u1 next() {
        return u1.c(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private v(int i10, int i11, int i12) {
        this.f312953a = i11;
        boolean z10 = false;
        int iCompareUnsigned = Integer.compareUnsigned(i10, i11);
        if (i12 <= 0 ? iCompareUnsigned >= 0 : iCompareUnsigned <= 0) {
            z10 = true;
        }
        this.f312954b = z10;
        this.f312955c = u1.n(i12);
        this.f312956d = this.f312954b ? i10 : i11;
    }
}
