package com.planner5d.library.widget.editor.editor2d.drawable.pr;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.engine.util.math.Matrix4;
import com.planner5d.library.engine.util.math.n;
import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.services.c0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPrCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrCalculator.kt\ncom/planner5d/library/widget/editor/editor2d/drawable/pr/PrCalculator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1863#2,2:229\n2341#2,14:231\n1971#2,14:245\n1863#2,2:260\n1863#2,2:262\n1863#2,2:264\n1863#2,2:266\n1863#2,2:268\n967#2,7:270\n1557#2:277\n1628#2,3:278\n1863#2,2:281\n1#3:259\n*S KotlinDebug\n*F\n+ 1 PrCalculator.kt\ncom/planner5d/library/widget/editor/editor2d/drawable/pr/PrCalculator\n*L\n55#1:229,2\n59#1:231,14\n60#1:245,14\n76#1:260,2\n97#1:262,2\n114#1:264,2\n120#1:266,2\n126#1:268,2\n139#1:270,7\n147#1:277\n147#1:278,3\n156#1:281,2\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final b f255045n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f255046o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final double f255047p = 0.001d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.engine.util.math.b f255048a = new com.planner5d.library.engine.util.math.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Matrix4 f255049b = new Matrix4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Matrix4 f255050c = new Matrix4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m f255051d = new m(0.0f, 0.0f, 0.0f, 7, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c f255052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c f255053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c f255054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final c f255055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c f255056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c f255057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c f255058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final c f255059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final List<c> f255060m;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f255061d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<k> f255062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final c0 f255063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final c f255064c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<? extends k> boxContour, @NotNull c0 bounds, @Nullable c cVar) {
            Intrinsics.checkNotNullParameter(boxContour, "boxContour");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            this.f255062a = boxContour;
            this.f255063b = bounds;
            this.f255064c = cVar;
        }

        @NotNull
        public final c0 a() {
            return this.f255063b;
        }

        @NotNull
        public final List<k> b() {
            return this.f255062a;
        }

        @Nullable
        public final c c() {
            return this.f255064c;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nPrCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrCalculator.kt\ncom/planner5d/library/widget/editor/editor2d/drawable/pr/PrCalculator$PrVertex\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1863#2,2:229\n*S KotlinDebug\n*F\n+ 1 PrCalculator.kt\ncom/planner5d/library/widget/editor/editor2d/drawable/pr/PrCalculator$PrVertex\n*L\n206#1:229,2\n*E\n"})
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f255065c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final m f255066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Set<c> f255067b;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final void a(@NotNull c neighbor1, @NotNull c neighbor2, @NotNull c neighbor3) {
            Intrinsics.checkNotNullParameter(neighbor1, "neighbor1");
            Intrinsics.checkNotNullParameter(neighbor2, "neighbor2");
            Intrinsics.checkNotNullParameter(neighbor3, "neighbor3");
            this.f255067b.add(neighbor1);
            this.f255067b.add(neighbor2);
            this.f255067b.add(neighbor3);
        }

        @NotNull
        public final Set<c> b() {
            return this.f255067b;
        }

        @NotNull
        public final m c() {
            return this.f255066a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            m mVar = this.f255066a;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.planner5d.library.widget.editor.editor2d.drawable.pr.PrCalculator.PrVertex");
            return Intrinsics.areEqual(mVar, ((c) obj).f255066a);
        }

        public int hashCode() {
            return this.f255066a.hashCode();
        }

        public c(@NotNull m point, @NotNull Set<c> neighbors) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(neighbors, "neighbors");
            this.f255066a = point;
            this.f255067b = neighbors;
        }

        public /* synthetic */ c(m mVar, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new m(0.0f, 0.0f, 0.0f, 7, null) : mVar, (i10 & 2) != 0 ? new HashSet() : set);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull c vertex) {
            Intrinsics.checkNotNullParameter(vertex, "vertex");
            m mVar = new m(vertex.f255066a);
            HashSet hashSet = new HashSet();
            Iterator<T> it = vertex.f255067b.iterator();
            while (it.hasNext()) {
                hashSet.add(new c(new m(((c) it.next()).f255066a), null, 2, 0 == true ? 1 : 0));
            }
            Unit unit = Unit.f312394a;
            this(mVar, hashSet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        int i10 = 3;
        c cVar = new c(null, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f255052e = cVar;
        c cVar2 = new c(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f255053f = cVar2;
        c cVar3 = new c(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f255054g = cVar3;
        c cVar4 = new c(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f255055h = cVar4;
        c cVar5 = new c(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f255056i = cVar5;
        c cVar6 = new c(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f255057j = cVar6;
        c cVar7 = new c(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f255058k = cVar7;
        c cVar8 = new c(0 == true ? 1 : 0, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.f255059l = cVar8;
        this.f255060m = CollectionsKt.listOf((Object[]) new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8});
    }

    private final void g(List<c> list) {
        if (list.size() != 8) {
            timber.log.b.f381052a.d("PrCalculator/addVertexNeighborsLinks: Wrong container size expected: 8, got: " + list.size(), new Object[0]);
            return;
        }
        list.get(0).a(list.get(4), list.get(1), list.get(3));
        list.get(1).a(list.get(5), list.get(0), list.get(2));
        list.get(2).a(list.get(6), list.get(1), list.get(3));
        list.get(3).a(list.get(7), list.get(0), list.get(2));
        list.get(4).a(list.get(0), list.get(5), list.get(7));
        list.get(5).a(list.get(1), list.get(4), list.get(6));
        list.get(6).a(list.get(2), list.get(5), list.get(7));
        list.get(7).a(list.get(3), list.get(4), list.get(6));
    }

    private final void h() {
        this.f255048a.a();
        this.f255049b.s();
        this.f255050c.s();
        this.f255051d.y0(0.0f, 0.0f, 0.0f);
        for (c cVar : this.f255060m) {
            cVar.b().clear();
            cVar.c().y0(0.0f, 0.0f, 0.0f);
        }
    }

    private final List<k> i(List<c> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c cVar = list.get(0);
        linkedHashSet.add(cVar);
        int size = list.size() - 1;
        for (int i10 = 0; i10 < size; i10++) {
            Set<c> setB = cVar.b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setB) {
                c cVar2 = (c) obj;
                boolean zAdd = linkedHashSet.add(cVar2);
                if (zAdd) {
                    cVar = cVar2;
                }
                if (zAdd) {
                    break;
                }
                arrayList.add(obj);
            }
        }
        List<c> list2 = CollectionsKt.toList(linkedHashSet);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (c cVar3 : list2) {
            arrayList2.add(new k(cVar3.c().f180482a, cVar3.c().f180484c));
        }
        return arrayList2;
    }

    private final List<k> j(c cVar, c cVar2) {
        List<c> listS = s(this.f255060m);
        List<c> list = listS;
        r1.a(list).remove(cVar);
        r1.a(list).remove(cVar2);
        for (c cVar3 : listS) {
            r1.a(cVar3.b()).remove(cVar);
            r1.a(cVar3.b()).remove(cVar2);
        }
        return i(listS);
    }

    private final List<k> k(final c cVar, c cVar2, boolean z10) {
        List<c> listS = s(this.f255060m);
        if (cVar != null) {
            final Function1 function1 = new Function1() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.pr.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g.q(cVar, (g.c) obj));
                }
            };
            listS.removeIf(new Predicate() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.pr.b
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return g.r(function1, obj);
                }
            });
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (cVar2 != null) {
            for (c cVar3 : listS) {
                if (cVar3.c().f180483b >= ((double) cVar2.c().f180483b) - 0.001d) {
                    linkedHashSet.add(cVar3);
                }
            }
        }
        Iterator<T> it = listS.iterator();
        while (it.hasNext()) {
            Set<c> setB = ((c) it.next()).b();
            final Function1 function2 = new Function1() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.pr.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g.n(cVar, (g.c) obj));
                }
            };
            setB.removeIf(new Predicate() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.pr.d
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return g.m(function2, obj);
                }
            });
        }
        if (!z10 && linkedHashSet.size() < 3) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                Set<c> setB2 = ((c) it2.next()).b();
                final Function1 function3 = new Function1() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.pr.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(g.o(linkedHashSet, (g.c) obj));
                    }
                };
                setB2.removeIf(new Predicate() { // from class: com.planner5d.library.widget.editor.editor2d.drawable.pr.f
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return g.p(function3, obj);
                    }
                });
            }
        }
        return i(listS);
    }

    static /* synthetic */ List l(g gVar, c cVar, c cVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return gVar.k(cVar, cVar2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(c cVar, c neighbor) {
        m mVarC;
        Intrinsics.checkNotNullParameter(neighbor, "neighbor");
        return ((cVar == null || (mVarC = cVar.c()) == null) ? -1 : Double.compare(((double) mVarC.f180483b) + 0.001d, (double) neighbor.c().f180483b)) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(Set set, c neighbor) {
        Intrinsics.checkNotNullParameter(neighbor, "neighbor");
        return set.contains(neighbor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(c cVar, c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((double) it.c().f180483b) <= ((double) cVar.c().f180483b) + 0.001d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<c> s(List<c> list) {
        if (list.size() != 8) {
            timber.log.b.f381052a.d("PrCalculator/getVerticesCopy: Wrong container size expected: 8, got: " + list.size(), new Object[0]);
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i10 = 7 << 0;
            arrayList.add(new c(new m(((c) it.next()).c()), null, 2, 0 == true ? 1 : 0));
        }
        g(arrayList);
        return arrayList;
    }

    private final boolean t(m mVar) {
        float f10 = 90;
        return mVar.f180482a % f10 == 0.0f && mVar.f180483b % f10 == 0.0f && mVar.f180484c % f10 == 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if ((r8 ^ r9) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean u(com.planner5d.library.math.m r9) {
        /*
            r8 = this;
            float r8 = r9.f180482a
            r7 = 3
            r0 = 90
            float r0 = (float) r0
            r7 = 5
            float r1 = r8 % r0
            r7 = 7
            r2 = 0
            r7 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r7 = 3
            r4 = 1
            if (r1 != 0) goto L32
            float r1 = r9.f180483b
            r7 = 7
            float r1 = r1 % r0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r7 = 1
            if (r1 != 0) goto L1e
            r1 = r4
            goto L21
        L1e:
            r7 = 1
            r1 = r3
            r1 = r3
        L21:
            float r5 = r9.f180484c
            float r5 = r5 % r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r7 = 3
            if (r5 != 0) goto L2d
            r7 = 4
            r5 = r4
            r5 = r4
            goto L2e
        L2d:
            r5 = r3
        L2e:
            r7 = 1
            r1 = r1 ^ r5
            if (r1 != 0) goto L76
        L32:
            float r1 = r9.f180483b
            float r5 = r1 % r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 != 0) goto L55
            float r5 = r8 % r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r7 = 5
            if (r5 != 0) goto L45
            r7 = 7
            r5 = r4
            r5 = r4
            goto L47
        L45:
            r5 = r3
            r5 = r3
        L47:
            float r6 = r9.f180484c
            float r6 = r6 % r0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L50
            r6 = r4
            goto L51
        L50:
            r6 = r3
        L51:
            r5 = r5 ^ r6
            r7 = 0
            if (r5 != 0) goto L76
        L55:
            float r9 = r9.f180484c
            r7 = 4
            float r9 = r9 % r0
            r7 = 1
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 != 0) goto L77
            r7 = 4
            float r8 = r8 % r0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 != 0) goto L67
            r8 = r4
            r8 = r4
            goto L68
        L67:
            r8 = r3
        L68:
            float r1 = r1 % r0
            int r9 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r9 != 0) goto L71
            r9 = r4
            r9 = r4
            r7 = 7
            goto L72
        L71:
            r9 = r3
        L72:
            r8 = r8 ^ r9
            r7 = 1
            if (r8 == 0) goto L77
        L76:
            return r4
        L77:
            r7 = 5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.editor.editor2d.drawable.pr.g.u(com.planner5d.library.math.m):boolean");
    }

    private final void w(List<c> list, m mVar, m mVar2) {
        if (list.size() != 8) {
            timber.log.b.f381052a.d("PrCalculator/setVertexBounds: Wrong container size expected: 8, got: " + list.size(), new Object[0]);
            return;
        }
        list.get(0).c().y0(mVar.f180482a, mVar.f180483b, mVar.f180484c);
        list.get(1).c().y0(mVar2.f180482a, mVar.f180483b, mVar.f180484c);
        int i10 = 4 >> 2;
        list.get(2).c().y0(mVar2.f180482a, mVar.f180483b, mVar2.f180484c);
        int i11 = 7 & 3;
        list.get(3).c().y0(mVar.f180482a, mVar.f180483b, mVar2.f180484c);
        list.get(4).c().y0(mVar.f180482a, mVar2.f180483b, mVar.f180484c);
        list.get(5).c().y0(mVar2.f180482a, mVar2.f180483b, mVar.f180484c);
        list.get(6).c().y0(mVar2.f180482a, mVar2.f180483b, mVar2.f180484c);
        int i12 = 3 ^ 7;
        list.get(7).c().y0(mVar.f180482a, mVar2.f180483b, mVar2.f180484c);
    }

    private final void x(List<c> list, m mVar, m mVar2) {
        w(list, mVar, mVar2);
        g(list);
    }

    @NotNull
    public final a v(@NotNull ItemLayout layout) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(layout, "layout");
        h();
        layout.getScale(this.f255051d);
        if (layout.isFlippedHorizontally()) {
            this.f255051d.f180484c *= -1;
        }
        if (layout.isFlippedVertically()) {
            this.f255051d.f180482a *= -1;
        }
        float f10 = 100;
        m mVar = this.f255051d;
        float f11 = mVar.f180482a * f10;
        float f12 = mVar.f180484c * f10;
        float f13 = f10 * mVar.f180483b;
        int i10 = 5 | 2;
        float f14 = 2;
        x(this.f255060m, new m((-f11) / f14, (-f12) / f14, (-f13) / f14), new m(f11 / f14, f12 / f14, f13 / f14));
        layout.getRotation(this.f255051d);
        this.f255049b.w(this.f255050c.c0(1.0f, 0.0f, 0.0f, this.f255051d.f180482a).x(0.0f, -1.0f, 0.0f, (layout.isFlippedVertically() ^ layout.isFlippedHorizontally() ? 180 : 0) + this.f255051d.f180483b).x(0.0f, 0.0f, 1.0f, this.f255051d.f180484c));
        for (c cVar : this.f255060m) {
            n.a(cVar.c(), this.f255049b);
            this.f255048a.g(cVar.c());
        }
        Iterator<T> it = this.f255060m.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float f15 = ((c) next).c().f180483b;
                do {
                    Object next3 = it.next();
                    float f16 = ((c) next3).c().f180483b;
                    if (Float.compare(f15, f16) > 0) {
                        next = next3;
                        f15 = f16;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        c cVar2 = (c) next;
        Iterator<T> it2 = this.f255060m.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                float f17 = ((c) next2).c().f180483b;
                do {
                    Object next4 = it2.next();
                    float f18 = ((c) next4).c().f180483b;
                    if (Float.compare(f17, f18) < 0) {
                        next2 = next4;
                        f17 = f18;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        c cVar3 = (c) next2;
        c cVar4 = cVar3 != null ? new c(cVar3) : null;
        boolean zT = t(this.f255051d);
        return new a((zT || u(this.f255051d)) ? k(cVar2, cVar3, zT) : j(cVar2, cVar3), new c0().p(new k(), this.f255048a.z(), this.f255048a.u()), cVar4);
    }
}
