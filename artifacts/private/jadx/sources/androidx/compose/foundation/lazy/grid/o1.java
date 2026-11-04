package androidx.compose.foundation.lazy.grid;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,258:1\n1#2:259\n51#3,4:260\n51#3,4:264\n97#3,4:268\n97#3,4:272\n*S KotlinDebug\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n*L\n122#1:260,4\n151#1:264,4\n185#1:268,4\n197#1:272,4\n*E\n"})
public final class o1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f16920j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f16921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList<a> f16922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<Integer> f16927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private List<androidx.compose.foundation.lazy.grid.c> f16928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16929i;

    private static final class b implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f16932a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16934c;

        private b() {
        }

        @Override // androidx.compose.foundation.lazy.grid.h0
        public int a() {
            return f16933b;
        }

        @Override // androidx.compose.foundation.lazy.grid.h0
        public int b() {
            return f16934c;
        }

        public void c(int i10) {
            f16933b = i10;
        }

        public void d(int i10) {
            f16934c = i10;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f16935c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<androidx.compose.foundation.lazy.grid.c> f16937b;

        public c(int i10, @NotNull List<androidx.compose.foundation.lazy.grid.c> list) {
            this.f16936a = i10;
            this.f16937b = list;
        }

        public final int a() {
            return this.f16936a;
        }

        @NotNull
        public final List<androidx.compose.foundation.lazy.grid.c> b() {
            return this.f16937b;
        }
    }

    public o1(@NotNull w wVar) {
        this.f16921a = wVar;
        ArrayList<a> arrayList = new ArrayList<>();
        int i10 = 0;
        arrayList.add(new a(i10, i10, 2, null));
        this.f16922b = arrayList;
        this.f16926f = -1;
        this.f16927g = new ArrayList();
        this.f16928h = CollectionsKt.emptyList();
    }

    private final int b() {
        return ((int) Math.sqrt((((double) h()) * 1.0d) / ((double) this.f16929i))) + 1;
    }

    private final List<androidx.compose.foundation.lazy.grid.c> c(int i10) {
        if (i10 == this.f16928h.size()) {
            return this.f16928h;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(androidx.compose.foundation.lazy.grid.c.a(m1.a(1)));
        }
        this.f16928h = arrayList;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i10, a aVar) {
        return aVar.a() - i10;
    }

    private final void i() {
        this.f16922b.clear();
        int i10 = 0;
        this.f16922b.add(new a(i10, i10, 2, null));
        this.f16923c = 0;
        this.f16924d = 0;
        this.f16925e = 0;
        this.f16926f = -1;
        this.f16927g.clear();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    @NotNull
    public final c d(int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (!this.f16921a.P()) {
            int i14 = i10 * this.f16929i;
            return new c(i14, c(kotlin.ranges.r.u(kotlin.ranges.r.B(this.f16929i, h() - i14), 0)));
        }
        int iMin = Math.min(i10 / b(), this.f16922b.size() - 1);
        int iB = b() * iMin;
        int iA = this.f16922b.get(iMin).a();
        int iB2 = this.f16922b.get(iMin).b();
        int i15 = this.f16923c;
        if (iB <= i15 && i15 <= i10) {
            iA = this.f16924d;
            iB2 = this.f16925e;
            iB = i15;
        } else if (iMin == this.f16926f && (i11 = i10 - iB) < this.f16927g.size()) {
            iA = this.f16927g.get(i11).intValue();
            iB = i10;
            iB2 = 0;
        }
        if (iB % b() == 0) {
            int iB3 = b();
            int i16 = i10 - iB;
            if (2 > i16 || i16 >= iB3) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            this.f16926f = iMin;
            this.f16927g.clear();
        }
        if (!(iB <= i10)) {
            androidx.compose.foundation.internal.e.i("currentLine (" + iB + ") > lineIndex (" + i10 + ')');
        }
        while (iB < i10 && iA < h()) {
            if (z10) {
                this.f16927g.add(Integer.valueOf(iA));
            }
            int i17 = 0;
            while (i17 < this.f16929i && iA < h()) {
                if (iB2 == 0) {
                    i13 = iB2;
                    iB2 = k(iA, this.f16929i - i17);
                } else {
                    i13 = 0;
                }
                i17 += iB2;
                if (i17 > this.f16929i) {
                    break;
                }
                iA++;
                iB2 = i13;
            }
            iB++;
            if (iB % b() == 0 && iA < h()) {
                if (!(this.f16922b.size() == iB / b())) {
                    androidx.compose.foundation.internal.e.i("invalid starting point");
                }
                this.f16922b.add(new a(iA, iB2));
            }
        }
        this.f16923c = i10;
        this.f16924d = iA;
        this.f16925e = iB2;
        ArrayList arrayList = new ArrayList();
        int i18 = 0;
        int i19 = iA;
        while (i18 < this.f16929i && i19 < h()) {
            if (iB2 == 0) {
                int i20 = iB2;
                iB2 = k(i19, this.f16929i - i18);
                i12 = i20;
            } else {
                i12 = 0;
            }
            i18 += iB2;
            if (i18 > this.f16929i) {
                break;
            }
            i19++;
            arrayList.add(androidx.compose.foundation.lazy.grid.c.a(m1.a(iB2)));
            iB2 = i12;
        }
        return new c(iA, arrayList);
    }

    public final int e(final int i10) {
        int i11 = 0;
        if (h() <= 0) {
            return 0;
        }
        if (!(i10 < h())) {
            androidx.compose.foundation.internal.e.g("ItemIndex > total count");
        }
        if (!this.f16921a.P()) {
            return i10 / this.f16929i;
        }
        int iBinarySearch$default = CollectionsKt.binarySearch$default(this.f16922b, 0, 0, new Function1() { // from class: androidx.compose.foundation.lazy.grid.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(o1.f(i10, (o1.a) obj));
            }
        }, 3, (Object) null);
        int i12 = 2;
        if (iBinarySearch$default < 0) {
            iBinarySearch$default = (-iBinarySearch$default) - 2;
        }
        int iB = b() * iBinarySearch$default;
        int iA = this.f16922b.get(iBinarySearch$default).a();
        if (!(iA <= i10)) {
            androidx.compose.foundation.internal.e.g("currentItemIndex > itemIndex");
        }
        int i13 = 0;
        while (iA < i10) {
            int i14 = iA + 1;
            int iK = k(iA, this.f16929i - i13);
            i13 += iK;
            int i15 = this.f16929i;
            if (i13 >= i15) {
                if (i13 == i15) {
                    iB++;
                    i13 = 0;
                } else {
                    iB++;
                    i13 = iK;
                }
            }
            if (iB % b() == 0 && iB / b() >= this.f16922b.size()) {
                this.f16922b.add(new a(i14 - (i13 > 0 ? 1 : 0), i11, i12, null));
            }
            iA = i14;
        }
        if (i13 + k(i10, this.f16929i - i13) > this.f16929i) {
            iB++;
        }
        return iB;
    }

    public final int g() {
        return this.f16929i;
    }

    public final int h() {
        return this.f16921a.E().getSize();
    }

    public final void j(int i10) {
        if (i10 != this.f16929i) {
            this.f16929i = i10;
            i();
        }
    }

    public final int k(int i10, int i11) {
        b bVar = b.f16932a;
        bVar.c(i11);
        bVar.d(this.f16929i);
        androidx.compose.foundation.lazy.layout.m.a<q> aVar = this.f16921a.E().get(i10);
        return androidx.compose.foundation.lazy.grid.c.e(aVar.c().b().invoke(bVar, Integer.valueOf(i10 - aVar.b())).h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16931b;

        public a(int i10, int i11) {
            this.f16930a = i10;
            this.f16931b = i11;
        }

        public final int a() {
            return this.f16930a;
        }

        public final int b() {
            return this.f16931b;
        }

        public /* synthetic */ a(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }
    }
}
