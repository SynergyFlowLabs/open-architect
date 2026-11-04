package androidx.navigation.internal;

import androidx.annotation.b1;
import androidx.collection.j3;
import androidx.collection.l3;
import androidx.navigation.e2;
import androidx.navigation.w1;
import androidx.navigation.y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavGraphImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphImpl.kt\nandroidx/navigation/internal/NavGraphImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,372:1\n1611#2,9:373\n1863#2:382\n1864#2:384\n1620#2:385\n1611#2,9:386\n1863#2:395\n1864#2:397\n1620#2:398\n1246#2,4:404\n1#3:383\n1#3:396\n1#3:399\n183#4,2:400\n462#5:402\n412#5:403\n*S KotlinDebug\n*F\n+ 1 NavGraphImpl.kt\nandroidx/navigation/internal/NavGraphImpl\n*L\n55#1:373,9\n55#1:382\n55#1:384\n55#1:385\n94#1:386,9\n94#1:395\n94#1:397\n94#1:398\n322#1:404,4\n55#1:383\n94#1:396\n221#1:400,2\n322#1:402\n322#1:403\n*E\n"})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e2 f71052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final j3<y1> f71053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f71054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f71055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f71056e;

    @SourceDebugExtension({"SMAP\nNavGraphImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphImpl.kt\nandroidx/navigation/internal/NavGraphImpl$iterator$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
    public static final class a implements Iterator<y1>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f71057a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f71058b;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y1 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f71058b = true;
            j3<y1> j3VarQ = f0.this.q();
            int i10 = this.f71057a + 1;
            this.f71057a = i10;
            return j3VarQ.z(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f71057a + 1 < f0.this.q().size();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f71058b) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            j3<y1> j3VarQ = f0.this.q();
            j3VarQ.z(this.f71057a).s0(null);
            j3VarQ.t(this.f71057a);
            this.f71057a--;
            this.f71058b = false;
        }
    }

    public f0(@NotNull e2 graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.f71052a = graph;
        this.f71053b = new j3<>(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String D(y1 startDestination) {
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        String strM = startDestination.M();
        Intrinsics.checkNotNull(strM);
        return strM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E(Object obj, y1 startDestination) {
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Map<String, androidx.navigation.j0> mapU = startDestination.u();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapU.size()));
        Iterator<T> it = mapU.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((androidx.navigation.j0) entry.getValue()).b());
        }
        return androidx.navigation.serialization.p.t(obj, linkedHashMap);
    }

    public static /* synthetic */ y1 n(f0 f0Var, int i10, y1 y1Var, boolean z10, y1 y1Var2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            y1Var2 = null;
        }
        return f0Var.m(i10, y1Var, z10, y1Var2);
    }

    public final void A(@NotNull y1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int iJ = this.f71053b.j(node.D());
        if (iJ >= 0) {
            this.f71053b.z(iJ).s0(null);
            this.f71053b.t(iJ);
        }
    }

    public final void B(int i10) {
        this.f71054c = i10;
    }

    public final void C(@Nullable String str) {
        this.f71055d = str;
    }

    public final void F(int i10) {
        K(i10);
    }

    public final <T> void G(@NotNull final T startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        J(m0.i(j1.d(startDestRoute.getClass())), new Function1() { // from class: androidx.navigation.internal.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.E(startDestRoute, (y1) obj);
            }
        });
    }

    public final void H(@NotNull String startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        L(startDestRoute);
    }

    public final <T> void I(@NotNull kotlin.reflect.d<T> startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        J(m0.i(startDestRoute), new Function1() { // from class: androidx.navigation.internal.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.D((y1) obj);
            }
        });
    }

    public final <T> void J(@NotNull KSerializer<T> serializer, @NotNull Function1<? super y1, String> parseRoute) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(parseRoute, "parseRoute");
        int iK = androidx.navigation.serialization.p.k(serializer);
        y1 y1VarH = h(iK);
        if (y1VarH != null) {
            L(parseRoute.invoke(y1VarH));
            this.f71054c = iK;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.getDescriptor().getSerialName() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }

    public final void K(int i10) {
        if (i10 != this.f71052a.D()) {
            if (this.f71056e != null) {
                L(null);
            }
            this.f71054c = i10;
            this.f71055d = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this.f71052a).toString());
    }

    public final void L(@Nullable String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (Intrinsics.areEqual(str, this.f71052a.M())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this.f71052a).toString());
            }
            if (StringsKt.w3(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = y1.f71443f.c(str).hashCode();
        }
        this.f71054c = iHashCode;
        this.f71056e = str;
    }

    public final void c(@NotNull e2 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<y1> it = other.iterator();
        while (it.hasNext()) {
            y1 next = it.next();
            it.remove();
            d(next);
        }
    }

    public final void d(@NotNull y1 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int iD = node.D();
        String strM = node.M();
        if (iD == 0 && strM == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (this.f71052a.M() != null && Intrinsics.areEqual(strM, this.f71052a.M())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this.f71052a).toString());
        }
        if (iD == this.f71052a.D()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this.f71052a).toString());
        }
        y1 y1VarG = this.f71053b.g(iD);
        if (y1VarG == node) {
            return;
        }
        if (node.L() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (y1VarG != null) {
            y1VarG.s0(null);
        }
        node.s0(this.f71052a);
        this.f71053b.o(node.D(), node);
    }

    public final void e(@NotNull Collection<? extends y1> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        for (y1 y1Var : nodes) {
            if (y1Var != null) {
                d(y1Var);
            }
        }
    }

    public final void f(@NotNull y1... nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        for (y1 y1Var : nodes) {
            d(y1Var);
        }
    }

    public final void g() {
        Iterator<y1> itW = w();
        while (itW.hasNext()) {
            itW.next();
            itW.remove();
        }
    }

    @Nullable
    public final y1 h(int i10) {
        return n(this, i10, this.f71052a, false, null, 8, null);
    }

    @Nullable
    public final <T> y1 i(@Nullable T t10) {
        if (t10 != null) {
            return h(androidx.navigation.serialization.p.k(m0.i(j1.d(t10.getClass()))));
        }
        return null;
    }

    @Nullable
    public final y1 j(@Nullable String str) {
        if (str == null || StringsKt.w3(str)) {
            return null;
        }
        return k(str, true);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1 k(@NotNull String route, boolean z10) {
        Object next;
        y1 y1Var;
        Intrinsics.checkNotNullParameter(route, "route");
        Iterator it = kotlin.sequences.o.e(l3.k(this.f71053b)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            y1Var = (y1) next;
            if (StringsKt.O1(y1Var.M(), route, false, 2, null)) {
                break;
            }
        } while (y1Var.Y(route) == null);
        y1 y1Var2 = (y1) next;
        if (y1Var2 != null) {
            return y1Var2;
        }
        if (!z10 || this.f71052a.L() == null) {
            return null;
        }
        e2 e2VarL = this.f71052a.L();
        Intrinsics.checkNotNull(e2VarL);
        return e2VarL.I0(route);
    }

    @Nullable
    public final y1 l(@NotNull kotlin.reflect.d<?> route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return h(androidx.navigation.serialization.p.k(m0.i(route)));
    }

    @Nullable
    public final y1 m(int i10, @Nullable y1 y1Var, boolean z10, @Nullable y1 y1Var2) {
        y1 y1VarG = this.f71053b.g(i10);
        if (y1Var2 != null) {
            if (Intrinsics.areEqual(y1VarG, y1Var2) && Intrinsics.areEqual(y1VarG.L(), y1Var2.L())) {
                return y1VarG;
            }
            y1VarG = null;
        } else if (y1VarG != null) {
            return y1VarG;
        }
        if (z10) {
            Iterator it = kotlin.sequences.o.e(l3.k(this.f71053b)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    y1VarG = null;
                    break;
                }
                y1 y1Var3 = (y1) it.next();
                y1 y1VarL0 = (!(y1Var3 instanceof e2) || Intrinsics.areEqual(y1Var3, y1Var)) ? null : ((e2) y1Var3).L0(i10, this.f71052a, true, y1Var2);
                if (y1VarL0 != null) {
                    y1VarG = y1VarL0;
                    break;
                }
            }
        }
        if (y1VarG != null) {
            return y1VarG;
        }
        if (this.f71052a.L() == null || Intrinsics.areEqual(this.f71052a.L(), y1Var)) {
            return null;
        }
        e2 e2VarL = this.f71052a.L();
        Intrinsics.checkNotNull(e2VarL);
        return e2VarL.L0(i10, this.f71052a, z10, y1Var2);
    }

    @NotNull
    public final String o(@NotNull String superName) {
        Intrinsics.checkNotNullParameter(superName, "superName");
        return this.f71052a.D() != 0 ? superName : "the root navigation";
    }

    @NotNull
    public final e2 p() {
        return this.f71052a;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public final j3<y1> q() {
        return this.f71053b;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @NotNull
    public final String r() {
        if (this.f71055d == null) {
            String strValueOf = this.f71056e;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.f71054c);
            }
            this.f71055d = strValueOf;
        }
        String str = this.f71055d;
        Intrinsics.checkNotNull(str);
        return str;
    }

    public final int s() {
        return this.f71054c;
    }

    @Nullable
    public final String t() {
        return this.f71055d;
    }

    public final int u() {
        return this.f71054c;
    }

    @Nullable
    public final String v() {
        return this.f71056e;
    }

    @NotNull
    public final Iterator<y1> w() {
        return new a();
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1.c x(@Nullable y1.c cVar, @NotNull w1 navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return y(cVar, navDeepLinkRequest, true, false, this.f71052a);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1.c y(@Nullable y1.c cVar, @NotNull w1 navDeepLinkRequest, boolean z10, boolean z11, @NotNull y1 lastVisited) {
        y1.c cVar2;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        y1.c cVarD1 = null;
        if (z10) {
            e2 e2Var = this.f71052a;
            ArrayList arrayList = new ArrayList();
            for (y1 y1Var : e2Var) {
                y1.c cVarT = !Intrinsics.areEqual(y1Var, lastVisited) ? y1Var.T(navDeepLinkRequest) : null;
                if (cVarT != null) {
                    arrayList.add(cVarT);
                }
            }
            cVar2 = (y1.c) CollectionsKt.maxOrNull((Iterable) arrayList);
        } else {
            cVar2 = null;
        }
        e2 e2VarL = this.f71052a.L();
        if (e2VarL != null && z11 && !Intrinsics.areEqual(e2VarL, lastVisited)) {
            cVarD1 = e2VarL.d1(navDeepLinkRequest, z10, true, this.f71052a);
        }
        return (y1.c) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new y1.c[]{cVar, cVar2, cVarD1}));
    }

    @b1({b1.a.LIBRARY_GROUP})
    @Nullable
    public final y1.c z(@NotNull String route, boolean z10, boolean z11, @NotNull y1 lastVisited) {
        y1.c cVar;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        y1.c cVarY = this.f71052a.Y(route);
        y1.c cVarF1 = null;
        if (z10) {
            e2 e2Var = this.f71052a;
            ArrayList arrayList = new ArrayList();
            for (y1 y1Var : e2Var) {
                y1.c cVarF2 = Intrinsics.areEqual(y1Var, lastVisited) ? null : y1Var instanceof e2 ? ((e2) y1Var).f1(route, true, false, this.f71052a) : y1Var.Y(route);
                if (cVarF2 != null) {
                    arrayList.add(cVarF2);
                }
            }
            cVar = (y1.c) CollectionsKt.maxOrNull((Iterable) arrayList);
        } else {
            cVar = null;
        }
        e2 e2VarL = this.f71052a.L();
        if (e2VarL != null && z11 && !Intrinsics.areEqual(e2VarL, lastVisited)) {
            cVarF1 = e2VarL.f1(route, z10, true, this.f71052a);
        }
        return (y1.c) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new y1.c[]{cVarY, cVar, cVarF1}));
    }
}
