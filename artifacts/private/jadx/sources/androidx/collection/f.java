package androidx.collection;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,266:1\n59#2,5:267\n59#2,5:272\n24#3:277\n24#3:278\n24#3:279\n24#3:280\n24#3:281\n24#3:282\n24#3:283\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n38#1:267,5\n39#1:272,5\n104#1:277\n121#1:278\n148#1:279\n183#1:280\n217#1:281\n231#1:282\n245#1:283\n*E\n"})
public final class f<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private E[] f12211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12214d;

    @oj.j
    public f() {
        this(0, 1, null);
    }

    private final void d() {
        E[] eArr = this.f12211a;
        int length = eArr.length;
        int i10 = this.f12212b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i12];
        ArraysKt.copyInto(eArr, eArr2, 0, i10, length);
        ArraysKt.copyInto(this.f12211a, eArr2, i11, 0, this.f12212b);
        this.f12211a = eArr2;
        this.f12212b = 0;
        this.f12213c = length;
        this.f12214d = i12 - 1;
    }

    public final void a(E e10) {
        int i10 = (this.f12212b - 1) & this.f12214d;
        this.f12212b = i10;
        this.f12211a[i10] = e10;
        if (i10 == this.f12213c) {
            d();
        }
    }

    public final void b(E e10) {
        E[] eArr = this.f12211a;
        int i10 = this.f12213c;
        eArr[i10] = e10;
        int i11 = this.f12214d & (i10 + 1);
        this.f12213c = i11;
        if (i11 == this.f12212b) {
            d();
        }
    }

    public final void c() {
        l(m());
    }

    public final E e(int i10) {
        if (i10 < 0 || i10 >= m()) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f12211a[this.f12214d & (this.f12212b + i10)];
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final E f() {
        int i10 = this.f12212b;
        if (i10 == this.f12213c) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f12211a[i10];
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final E g() {
        int i10 = this.f12212b;
        int i11 = this.f12213c;
        if (i10 == i11) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.f12211a[this.f12214d & (i11 - 1)];
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final boolean h() {
        return this.f12212b == this.f12213c;
    }

    public final E i() {
        int i10 = this.f12212b;
        if (i10 == this.f12213c) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f12211a;
        E e10 = eArr[i10];
        eArr[i10] = null;
        this.f12212b = (i10 + 1) & this.f12214d;
        return e10;
    }

    public final E j() {
        int i10 = this.f12212b;
        int i11 = this.f12213c;
        if (i10 == i11) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f12214d & (i11 - 1);
        E[] eArr = this.f12211a;
        E e10 = eArr[i12];
        eArr[i12] = null;
        this.f12213c = i12;
        return e10;
    }

    public final void k(int i10) {
        if (i10 > 0) {
            if (i10 > m()) {
                h hVar = h.f12266a;
                throw new ArrayIndexOutOfBoundsException();
            }
            int i11 = this.f12213c;
            int i12 = i10 < i11 ? i11 - i10 : 0;
            for (int i13 = i12; i13 < i11; i13++) {
                this.f12211a[i13] = null;
            }
            int i14 = this.f12213c;
            int i15 = i14 - i12;
            int i16 = i10 - i15;
            this.f12213c = i14 - i15;
            if (i16 > 0) {
                int length = this.f12211a.length;
                this.f12213c = length;
                int i17 = length - i16;
                for (int i18 = i17; i18 < length; i18++) {
                    this.f12211a[i18] = null;
                }
                this.f12213c = i17;
            }
        }
    }

    public final void l(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f12211a.length;
        int i11 = this.f12212b;
        if (i10 < length - i11) {
            length = i11 + i10;
        }
        while (i11 < length) {
            this.f12211a[i11] = null;
            i11++;
        }
        int i12 = this.f12212b;
        int i13 = length - i12;
        int i14 = i10 - i13;
        this.f12212b = this.f12214d & (i12 + i13);
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
                this.f12211a[i15] = null;
            }
            this.f12212b = i14;
        }
    }

    public final int m() {
        return this.f12214d & (this.f12213c - this.f12212b);
    }

    @oj.j
    public f(int i10) {
        if (!(i10 >= 1)) {
            t.f.c("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            t.f.c("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f12214d = i10 - 1;
        this.f12211a = (E[]) new Object[i10];
    }

    public /* synthetic */ f(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
