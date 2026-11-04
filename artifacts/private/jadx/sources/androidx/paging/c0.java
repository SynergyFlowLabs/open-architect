package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.l1
@SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageEventStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1#2:282\n1855#3,2:283\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageEventStorage\n*L\n222#1:283,2\n*E\n"})
public final class c0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f71554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f71555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<g3<T>> f71556c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final e1 f71557d = new e1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private z0 f71558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f71559f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71560a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f71560a = iArr;
        }
    }

    private final void c(g1.b<T> bVar) {
        this.f71557d.e(bVar.u());
        this.f71558e = bVar.q();
        int i10 = a.f71560a[bVar.p().ordinal()];
        if (i10 == 1) {
            this.f71554a = bVar.t();
            Iterator<Integer> it = kotlin.ranges.r.k0(bVar.r().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.f71556c.addFirst(bVar.r().get(((IntIterator) it).nextInt()));
            }
            return;
        }
        if (i10 == 2) {
            this.f71555b = bVar.s();
            this.f71556c.addAll(bVar.r());
        } else {
            if (i10 != 3) {
                return;
            }
            this.f71556c.clear();
            this.f71555b = bVar.s();
            this.f71554a = bVar.t();
            this.f71556c.addAll(bVar.r());
        }
    }

    private final void d(g1.c<T> cVar) {
        this.f71557d.e(cVar.l());
        this.f71558e = cVar.k();
    }

    private final void e(g1.a<T> aVar) {
        this.f71557d.f(aVar.m(), x0.c.f72693b.b());
        int i10 = a.f71560a[aVar.m().ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            this.f71554a = aVar.q();
            int iP = aVar.p();
            while (i11 < iP) {
                this.f71556c.removeFirst();
                i11++;
            }
            return;
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.f71555b = aVar.q();
        int iP2 = aVar.p();
        while (i11 < iP2) {
            this.f71556c.removeLast();
            i11++;
        }
    }

    private final void f(g1.d<T> dVar) {
        if (dVar.n() != null) {
            this.f71557d.e(dVar.n());
        }
        if (dVar.m() != null) {
            this.f71558e = dVar.m();
        }
        this.f71556c.clear();
        this.f71555b = 0;
        this.f71554a = 0;
        this.f71556c.add(new g3<>(0, dVar.l()));
    }

    public final void a(@NotNull g1<T> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71559f = true;
        if (event instanceof g1.b) {
            c((g1.b) event);
            return;
        }
        if (event instanceof g1.a) {
            e((g1.a) event);
        } else if (event instanceof g1.c) {
            d((g1.c) event);
        } else if (event instanceof g1.d) {
            f((g1.d) event);
        }
    }

    @NotNull
    public final List<g1<T>> b() {
        if (!this.f71559f) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        z0 z0VarJ = this.f71557d.j();
        if (this.f71556c.isEmpty()) {
            arrayList.add(new g1.c(z0VarJ, this.f71558e));
            return arrayList;
        }
        arrayList.add(g1.b.f71933g.e(CollectionsKt.toList(this.f71556c), this.f71554a, this.f71555b, z0VarJ, this.f71558e));
        return arrayList;
    }
}
