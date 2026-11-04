package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,206:1\n97#2,4:207\n97#2,4:225\n403#3,7:211\n403#3,7:218\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n36#1:207,4\n190#1:225,4\n165#1:211,7\n185#1:218,7\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f17758d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f17759e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f17760f = 131072;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17761g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f17762h = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private int[] f17764b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<b> f17765c = new ArrayDeque<>();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private int[] f17767b;

        public b(int i10, @NotNull int[] iArr) {
            this.f17766a = i10;
            this.f17767b = iArr;
        }

        @NotNull
        public final int[] a() {
            return this.f17767b;
        }

        public final int b() {
            return this.f17766a;
        }

        public final void c(@NotNull int[] iArr) {
            this.f17767b = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n+ 2 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n1#1,409:1\n185#2:410\n*E\n"})
    public static final class c extends kotlin.jvm.internal.l0 implements Function1<b, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparable f17768a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Comparable comparable) {
            super(1);
            this.f17768a = comparable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(b bVar) {
            return Integer.valueOf(kotlin.comparisons.a.l(Integer.valueOf(bVar.b()), this.f17768a));
        }
    }

    @SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n+ 2 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n1#1,409:1\n165#2:410\n*E\n"})
    public static final class d extends kotlin.jvm.internal.l0 implements Function1<b, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparable f17769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Comparable comparable) {
            super(1);
            this.f17769a = comparable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(b bVar) {
            return Integer.valueOf(kotlin.comparisons.a.l(Integer.valueOf(bVar.b()), this.f17769a));
        }
    }

    private final void b(int i10, int i11) {
        if (!(i10 <= 131072)) {
            androidx.compose.foundation.internal.e.g("Requested item capacity " + i10 + " is larger than max supported: 131072!");
        }
        int[] iArr = this.f17764b;
        if (iArr.length < i10) {
            int length = iArr.length;
            while (length < i10) {
                length *= 2;
            }
            this.f17764b = ArraysKt.copyInto$default(this.f17764b, new int[length], i11, 0, 0, 12, (Object) null);
        }
    }

    static /* synthetic */ void c(b0 b0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        b0Var.b(i10, i11);
    }

    public final boolean a(int i10, int i11) {
        int iH = h(i10);
        if (iH != i11 && iH != -1 && iH != -2) {
            return false;
        }
        return true;
    }

    public final void d(int i10) {
        int i11 = this.f17763a;
        int i12 = i10 - i11;
        if (i12 < 0 || i12 >= 131072) {
            int iMax = Math.max(i10 - (this.f17764b.length / 2), 0);
            this.f17763a = iMax;
            int i13 = iMax - i11;
            if (i13 >= 0) {
                int[] iArr = this.f17764b;
                if (i13 < iArr.length) {
                    ArraysKt.copyInto(iArr, iArr, 0, i13, iArr.length);
                }
                int[] iArr2 = this.f17764b;
                ArraysKt.fill(iArr2, 0, Math.max(0, iArr2.length - i13), this.f17764b.length);
            } else {
                int i14 = -i13;
                int[] iArr3 = this.f17764b;
                if (iArr3.length + i14 < 131072) {
                    b(iArr3.length + i14 + 1, i14);
                } else {
                    if (i14 < iArr3.length) {
                        ArraysKt.copyInto(iArr3, iArr3, i14, 0, iArr3.length - i14);
                    }
                    int[] iArr4 = this.f17764b;
                    ArraysKt.fill(iArr4, 0, 0, Math.min(iArr4.length, i14));
                }
            }
        } else {
            c(this, i12 + 1, 0, 2, null);
        }
        while (!this.f17765c.isEmpty() && this.f17765c.first().b() < i()) {
            this.f17765c.removeFirst();
        }
        while (!this.f17765c.isEmpty() && this.f17765c.last().b() > m()) {
            this.f17765c.removeLast();
        }
    }

    public final int e(int i10, int i11) {
        int iM = m();
        for (int i12 = i10 + 1; i12 < iM; i12++) {
            if (a(i12, i11)) {
                return i12;
            }
        }
        return m();
    }

    public final int f(int i10, int i11) {
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!a(i10, i11));
        return i10;
    }

    @Nullable
    public final int[] g(int i10) {
        ArrayDeque<b> arrayDeque = this.f17765c;
        b bVar = (b) CollectionsKt.getOrNull(this.f17765c, CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new c(Integer.valueOf(i10))));
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final int h(int i10) {
        if (i10 < i() || i10 >= m()) {
            return -1;
        }
        return this.f17764b[i10 - this.f17763a] - 1;
    }

    public final int i() {
        return this.f17763a;
    }

    public final void j() {
        ArraysKt.fill$default(this.f17764b, 0, 0, 0, 6, (Object) null);
        this.f17765c.clear();
    }

    public final void k(int i10, @Nullable int[] iArr) {
        ArrayDeque<b> arrayDeque = this.f17765c;
        int iBinarySearch = CollectionsKt.binarySearch(arrayDeque, 0, arrayDeque.size(), new d(Integer.valueOf(i10)));
        if (iBinarySearch < 0) {
            if (iArr == null) {
                return;
            }
            this.f17765c.add(-(iBinarySearch + 1), new b(i10, iArr));
            return;
        }
        if (iArr == null) {
            this.f17765c.remove(iBinarySearch);
        } else {
            this.f17765c.get(iBinarySearch).c(iArr);
        }
    }

    public final void l(int i10, int i11) {
        if (!(i10 >= 0)) {
            androidx.compose.foundation.internal.e.g("Negative lanes are not supported");
        }
        d(i10);
        this.f17764b[i10 - this.f17763a] = i11 + 1;
    }

    public final int m() {
        return this.f17763a + this.f17764b.length;
    }
}
