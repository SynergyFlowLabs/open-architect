package androidx.paging;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPageStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageStore.kt\nandroidx/paging/PageStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,255:1\n1#2:256\n1360#3:257\n1446#3,5:258\n1360#3:263\n1446#3,5:264\n1360#3:269\n1446#3,5:270\n12774#4,2:275\n*S KotlinDebug\n*F\n+ 1 PageStore.kt\nandroidx/paging/PageStore\n*L\n79#1:257\n79#1:258,5\n168#1:263\n168#1:264,5\n183#1:269\n183#1:270,5\n200#1:275,2\n*E\n"})
public final class p1<T> implements l2<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f72423e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final p1<Object> f72424f = new p1<>(g1.b.f71933g.g());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<g3<T>> f72425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f72426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f72427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f72428d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> p1<T> a(@Nullable g1.b<T> bVar) {
            if (bVar != null) {
                return new p1<>(bVar);
            }
            p1<T> p1Var = p1.f72424f;
            Intrinsics.checkNotNull(p1Var, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
            return p1Var;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72429a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72429a = iArr;
        }
    }

    public p1(@NotNull List<g3<T>> pages, int i10, int i11) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f72425a = CollectionsKt.toMutableList((Collection) pages);
        this.f72426b = g(pages);
        this.f72427c = i10;
        this.f72428d = i11;
    }

    private final void d(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + getSize());
        }
    }

    private final z1<T> e(g1.a<T> aVar) {
        int iF = f(new IntRange(aVar.o(), aVar.n()));
        this.f72426b = c() - iF;
        if (aVar.m() == a1.PREPEND) {
            int i10 = i();
            this.f72427c = aVar.q();
            return new z1.c(iF, i(), i10);
        }
        int iK = k();
        this.f72428d = aVar.q();
        return new z1.b(i() + c(), iF, aVar.q(), iK);
    }

    private final int f(IntRange intRange) {
        Iterator<g3<T>> it = this.f72425a.iterator();
        int size = 0;
        while (it.hasNext()) {
            g3<T> next = it.next();
            for (int i10 : next.k()) {
                if (intRange.t(i10)) {
                    size += next.h().size();
                    it.remove();
                    break;
                }
            }
        }
        return size;
    }

    private final int g(List<g3<T>> list) {
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((g3) it.next()).h().size();
        }
        return size;
    }

    private final int j() {
        Integer numMinOrNull = ArraysKt.minOrNull(((g3) CollectionsKt.first((List) this.f72425a)).k());
        Intrinsics.checkNotNull(numMinOrNull);
        return numMinOrNull.intValue();
    }

    private final int l() {
        Integer numMaxOrNull = ArraysKt.maxOrNull(((g3) CollectionsKt.last((List) this.f72425a)).k());
        Intrinsics.checkNotNull(numMaxOrNull);
        return numMaxOrNull.intValue();
    }

    private final z1<T> n(g1.b<T> bVar) {
        int iG = g(bVar.r());
        int i10 = b.f72429a[bVar.p().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (i10 == 2) {
            int i11 = i();
            this.f72425a.addAll(0, bVar.r());
            this.f72426b = c() + iG;
            this.f72427c = bVar.t();
            List<g3<T>> listR = bVar.r();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listR.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((g3) it.next()).h());
            }
            return new z1.d(arrayList, i(), i11);
        }
        if (i10 != 3) {
            throw new kotlin.k0();
        }
        int iK = k();
        int iC = c();
        List<g3<T>> list = this.f72425a;
        list.addAll(list.size(), bVar.r());
        this.f72426b = c() + iG;
        this.f72428d = bVar.s();
        int i12 = i() + iC;
        List<g3<T>> listR2 = bVar.r();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = listR2.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((g3) it2.next()).h());
        }
        return new z1.a(i12, arrayList2, k(), iK);
    }

    @NotNull
    public final j3.a b(int i10) {
        int i11 = 0;
        int i12 = i10 - i();
        while (i12 >= this.f72425a.get(i11).h().size() && i11 < CollectionsKt.getLastIndex(this.f72425a)) {
            i12 -= this.f72425a.get(i11).h().size();
            i11++;
        }
        return this.f72425a.get(i11).l(i12, i10 - i(), ((getSize() - i10) - k()) - 1, j(), l());
    }

    @Override // androidx.paging.l2
    public int c() {
        return this.f72426b;
    }

    @Override // androidx.paging.l2
    @NotNull
    public T getItem(int i10) {
        int size = this.f72425a.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = this.f72425a.get(i11).h().size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return this.f72425a.get(i11).h().get(i10);
    }

    @Override // androidx.paging.l2
    public int getSize() {
        return i() + c() + k();
    }

    @Nullable
    public final T h(int i10) {
        d(i10);
        int i11 = i10 - i();
        if (i11 < 0 || i11 >= c()) {
            return null;
        }
        return getItem(i11);
    }

    @Override // androidx.paging.l2
    public int i() {
        return this.f72427c;
    }

    @Override // androidx.paging.l2
    public int k() {
        return this.f72428d;
    }

    @NotNull
    public final j3.b m() {
        int iC = c() / 2;
        return new j3.b(iC, iC, j(), l());
    }

    @NotNull
    public final z1<T> o(@NotNull g1<T> pageEvent) {
        Intrinsics.checkNotNullParameter(pageEvent, "pageEvent");
        if (pageEvent instanceof g1.b) {
            return n((g1.b) pageEvent);
        }
        if (pageEvent instanceof g1.a) {
            return e((g1.a) pageEvent);
        }
        throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    @NotNull
    public final q0<T> p() {
        int i10 = i();
        int iK = k();
        List<g3<T>> list = this.f72425a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((g3) it.next()).h());
        }
        return new q0<>(i10, iK, arrayList);
    }

    @NotNull
    public String toString() {
        int iC = c();
        ArrayList arrayList = new ArrayList(iC);
        for (int i10 = 0; i10 < iC; i10++) {
            arrayList.add(getItem(i10));
        }
        return "[(" + i() + " placeholders), " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null) + ", (" + k() + " placeholders)]";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p1(@NotNull g1.b<T> insertEvent) {
        this(insertEvent.r(), insertEvent.t(), insertEvent.s());
        Intrinsics.checkNotNullParameter(insertEvent, "insertEvent");
    }
}
