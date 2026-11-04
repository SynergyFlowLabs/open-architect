package androidx.compose.material3.carousel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nKeylineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,569:1\n1863#2,2:570\n1863#2,2:572\n*S KotlinDebug\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n*L\n458#1:570,2\n486#1:572,2\n*E\n"})
final class s0 implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26672b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f26674d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26671a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26673c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<a> f26675e = new ArrayList();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f26676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f26677b;

        public a(float f10, boolean z10) {
            this.f26676a = f10;
            this.f26677b = z10;
        }

        public static /* synthetic */ a d(a aVar, float f10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f26676a;
            }
            if ((i10 & 2) != 0) {
                z10 = aVar.f26677b;
            }
            return aVar.c(f10, z10);
        }

        public final float a() {
            return this.f26676a;
        }

        public final boolean b() {
            return this.f26677b;
        }

        @NotNull
        public final a c(float f10, boolean z10) {
            return new a(f10, z10);
        }

        public final float e() {
            return this.f26676a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f26676a, aVar.f26676a) == 0 && this.f26677b == aVar.f26677b;
        }

        public final boolean f() {
            return this.f26677b;
        }

        public int hashCode() {
            return (Float.hashCode(this.f26676a) * 31) + Boolean.hashCode(this.f26677b);
        }

        @NotNull
        public String toString() {
            return "TmpKeyline(size=" + this.f26676a + ", isAnchor=" + this.f26677b + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008e  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:21:0x00be  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:31:0x0109  */
    /* JADX WARN: Code duplicated, block: B:33:0x0128  */
    /* JADX WARN: Code duplicated, block: B:34:0x0132  */
    /* JADX WARN: Code duplicated, block: B:39:0x0141  */
    private final List<o0> c(int i10, float f10, int i11, int i12, float f11, float f12, float f13, List<a> list) {
        float f14;
        float fE;
        boolean z10;
        float f15;
        float f16;
        float fE2;
        Iterator<Integer> it;
        float f17;
        float fE3;
        Iterator<Integer> it2;
        float f18;
        int iNextInt;
        a aVar;
        float fE4;
        float fE5;
        boolean z11;
        int iNextInt2;
        a aVar2;
        float fE6;
        float fAbs;
        boolean z12;
        a aVar3 = list.get(i10);
        ArrayList arrayList = new ArrayList();
        if (!g(aVar3.e(), f10)) {
            if (h(aVar3.e(), f10, f12)) {
                fE = ((aVar3.e() / 2) + f10) - f12;
            } else {
                f14 = 0.0f;
            }
            float fE7 = aVar3.e();
            if (i11 <= i10 || i10 > i12) {
                z10 = false;
            } else {
                z10 = true;
            }
            arrayList.add(new o0(fE7, f10, f10, z10, aVar3.f(), true, f14));
            f15 = 2;
            f16 = f11 / f15;
            fE2 = (f10 - f16) - f13;
            it = kotlin.ranges.r.k0(i10 - 1, 0).iterator();
            f17 = fE2;
            while (it.hasNext()) {
                iNextInt2 = ((IntIterator) it).nextInt();
                aVar2 = list.get(iNextInt2);
                fE6 = fE2 - (aVar2.e() / f15);
                float f19 = f17 - f16;
                if (g(aVar2.e(), fE6)) {
                    fAbs = Math.abs(fE6 - (aVar2.e() / f15));
                } else {
                    fAbs = 0.0f;
                }
                float fE8 = aVar2.e();
                if (i11 <= iNextInt2 || iNextInt2 > i12) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                arrayList.add(0, new o0(fE8, fE6, f19, z12, aVar2.f(), false, fAbs));
                fE2 -= aVar2.e() + f13;
                f17 -= f11 + f13;
            }
            fE3 = f10 + f16 + f13;
            it2 = kotlin.ranges.r.W1(i10 + 1, list.size()).iterator();
            f18 = fE3;
            while (it2.hasNext()) {
                iNextInt = ((IntIterator) it2).nextInt();
                aVar = list.get(iNextInt);
                fE4 = (aVar.e() / f15) + fE3;
                float f20 = f18 + f16;
                if (h(aVar.e(), fE4, f12)) {
                    fE5 = ((aVar.e() / f15) + fE4) - f12;
                } else {
                    fE5 = 0.0f;
                }
                float fE9 = aVar.e();
                if (i11 <= iNextInt || iNextInt > i12) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                arrayList.add(new o0(fE9, fE4, f20, z11, aVar.f(), false, fE5));
                fE3 += aVar.e() + f13;
                f18 += f11 + f13;
            }
            return arrayList;
        }
        fE = f10 - (aVar3.e() / 2);
        f14 = fE;
        float fE10 = aVar3.e();
        if (i11 <= i10) {
            z10 = false;
        } else {
            z10 = false;
        }
        arrayList.add(new o0(fE10, f10, f10, z10, aVar3.f(), true, f14));
        f15 = 2;
        f16 = f11 / f15;
        fE2 = (f10 - f16) - f13;
        it = kotlin.ranges.r.k0(i10 - 1, 0).iterator();
        f17 = fE2;
        while (it.hasNext()) {
            iNextInt2 = ((IntIterator) it).nextInt();
            aVar2 = list.get(iNextInt2);
            fE6 = fE2 - (aVar2.e() / f15);
            float f110 = f17 - f16;
            if (g(aVar2.e(), fE6)) {
                fAbs = Math.abs(fE6 - (aVar2.e() / f15));
            } else {
                fAbs = 0.0f;
            }
            float fE11 = aVar2.e();
            if (i11 <= iNextInt2) {
                z12 = false;
            } else {
                z12 = false;
            }
            arrayList.add(0, new o0(fE11, fE6, f110, z12, aVar2.f(), false, fAbs));
            fE2 -= aVar2.e() + f13;
            f17 -= f11 + f13;
        }
        fE3 = f10 + f16 + f13;
        it2 = kotlin.ranges.r.W1(i10 + 1, list.size()).iterator();
        f18 = fE3;
        while (it2.hasNext()) {
            iNextInt = ((IntIterator) it2).nextInt();
            aVar = list.get(iNextInt);
            fE4 = (aVar.e() / f15) + fE3;
            float f21 = f18 + f16;
            if (h(aVar.e(), fE4, f12)) {
                fE5 = ((aVar.e() / f15) + fE4) - f12;
            } else {
                fE5 = 0.0f;
            }
            float fE12 = aVar.e();
            if (i11 <= iNextInt) {
                z11 = false;
            } else {
                z11 = false;
            }
            arrayList.add(new o0(fE12, fE4, f21, z11, aVar.f(), false, fE5));
            fE3 += aVar.e() + f13;
            f18 += f11 + f13;
        }
        return arrayList;
    }

    private final int f() {
        int i10 = this.f26671a;
        while (i10 < CollectionsKt.getLastIndex(this.f26675e)) {
            int i11 = i10 + 1;
            if (this.f26675e.get(i11).e() != this.f26672b) {
                break;
            }
            i10 = i11;
        }
        return i10;
    }

    private final boolean g(float f10, float f11) {
        float f12 = f10 / 2;
        return f11 - f12 < 0.0f && f11 + f12 > 0.0f;
    }

    private final boolean h(float f10, float f11, float f12) {
        float f13 = f10 / 2;
        return f11 - f13 < f12 && f11 + f13 > f12;
    }

    @Override // androidx.compose.material3.carousel.r0
    public void a(float f10, boolean z10) {
        this.f26675e.add(new a(f10, z10));
        if (f10 > this.f26672b) {
            this.f26671a = CollectionsKt.getLastIndex(this.f26675e);
            this.f26672b = f10;
        }
    }

    @NotNull
    public final p0 d(float f10, float f11, int i10) {
        float f12;
        int iF = f();
        int i11 = this.f26671a;
        int i12 = iF - i11;
        this.f26673c = i11;
        b.a aVar = b.f26536b;
        if (b.g(i10, aVar.a())) {
            float f13 = 0.0f;
            if (f11 != 0.0f) {
                int i13 = i12 % 2;
                if (i13 + ((((i13 ^ 2) & ((-i13) | i13)) >> 31) & 2) != 0) {
                    f13 = f11 / 2.0f;
                }
            }
            float f14 = 2;
            f12 = ((f10 / f14) - ((this.f26672b / f14) * i12)) - f13;
        } else {
            f12 = b.g(i10, aVar.b()) ? f10 - (this.f26672b / 2) : this.f26672b / 2;
        }
        this.f26674d = f12;
        return new p0(c(this.f26673c, f12, this.f26671a, iF, this.f26672b, f10, f11, this.f26675e));
    }

    @NotNull
    public final p0 e(float f10, float f11, int i10, float f12) {
        return new p0(c(i10, f12, this.f26671a, f(), this.f26672b, f10, f11, this.f26675e));
    }
}
