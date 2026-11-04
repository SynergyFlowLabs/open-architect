package androidx.collection;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCircularIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,212:1\n59#2,5:213\n59#2,5:218\n24#3:223\n24#3:224\n24#3:225\n24#3:226\n24#3:227\n24#3:228\n24#3:229\n*S KotlinDebug\n*F\n+ 1 CircularIntArray.kt\nandroidx/collection/CircularIntArray\n*L\n37#1:213,5\n38#1:218,5\n101#1:223\n114#1:224\n138#1:225\n155#1:226\n168#1:227\n180#1:228\n192#1:229\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f12238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12241d;

    @oj.j
    public g() {
        this(0, 1, null);
    }

    private final void d() {
        int[] iArr = this.f12238a;
        int length = iArr.length;
        int i10 = this.f12239b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        ArraysKt.copyInto(iArr, iArr2, 0, i10, length);
        ArraysKt.copyInto(this.f12238a, iArr2, i11, 0, this.f12239b);
        this.f12238a = iArr2;
        this.f12239b = 0;
        this.f12240c = length;
        this.f12241d = i12 - 1;
    }

    public final void a(int i10) {
        int i11 = (this.f12239b - 1) & this.f12241d;
        this.f12239b = i11;
        this.f12238a[i11] = i10;
        if (i11 == this.f12240c) {
            d();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.f12238a;
        int i11 = this.f12240c;
        iArr[i11] = i10;
        int i12 = this.f12241d & (i11 + 1);
        this.f12240c = i12;
        if (i12 == this.f12239b) {
            d();
        }
    }

    public final void c() {
        this.f12240c = this.f12239b;
    }

    public final int e(int i10) {
        if (i10 < 0 || i10 >= m()) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f12238a[this.f12241d & (this.f12239b + i10)];
    }

    public final int f() {
        int i10 = this.f12239b;
        if (i10 != this.f12240c) {
            return this.f12238a[i10];
        }
        h hVar = h.f12266a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int g() {
        int i10 = this.f12239b;
        int i11 = this.f12240c;
        if (i10 == i11) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f12238a[this.f12241d & (i11 - 1)];
    }

    public final boolean h() {
        return this.f12239b == this.f12240c;
    }

    public final int i() {
        int i10 = this.f12239b;
        if (i10 == this.f12240c) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f12238a[i10];
        this.f12239b = (i10 + 1) & this.f12241d;
        return i11;
    }

    public final int j() {
        int i10 = this.f12239b;
        int i11 = this.f12240c;
        if (i10 == i11) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f12241d & (i11 - 1);
        int i13 = this.f12238a[i12];
        this.f12240c = i12;
        return i13;
    }

    public final void k(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f12240c = this.f12241d & (this.f12240c - i10);
    }

    public final void l(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > m()) {
            h hVar = h.f12266a;
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f12239b = this.f12241d & (this.f12239b + i10);
    }

    public final int m() {
        return this.f12241d & (this.f12240c - this.f12239b);
    }

    @oj.j
    public g(int i10) {
        if (!(i10 >= 1)) {
            t.f.c("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            t.f.c("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f12241d = i10 - 1;
        this.f12238a = new int[i10];
    }

    public /* synthetic */ g(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
