package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.g3;
import androidx.compose.animation.core.i1;
import androidx.compose.animation.core.l3;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.ui.layout.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,452:1\n1755#2,2:453\n1755#2,3:455\n1757#2:458\n1863#2:459\n1863#2,2:460\n1864#2:462\n1863#2,2:463\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n*L\n129#1:453,2\n131#1:455,3\n129#1:458\n144#1:459\n146#1:460,2\n144#1:462\n156#1:463,2\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f42434i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<c0> f42435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f42436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l f42437c = new l(new Function1() { // from class: androidx.compose.ui.tooling.animation.i
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return q.v(this.f42428a, (l3) obj);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final d f42438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final e f42439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Set<j<? extends Object>> f42440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Set<j<? extends Object>> f42441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Set<j<? extends Object>> f42442h;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,452:1\n1755#2,3:453\n774#2:456\n865#2,2:457\n1863#2:459\n1863#2,2:460\n1864#2:462\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n*L\n360#1:453,3\n369#1:456\n369#1:457,2\n370#1:459\n371#1:460,2\n370#1:462\n*E\n"})
    public static final class a extends j<Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f42443d = 8;

        public a(@NotNull Function1<Object, Unit> function1) {
            super(function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean h(a aVar, androidx.compose.ui.a0.c cVar) {
            if (!Intrinsics.areEqual(cVar.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement")) {
                return false;
            }
            aVar.b().add(cVar);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(androidx.compose.ui.a0.c cVar) {
            return Intrinsics.areEqual(cVar.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement");
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public void a(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (!((androidx.compose.ui.tooling.data.e) obj).g().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((androidx.compose.ui.tooling.data.e) it.next()).g().iterator();
                while (it2.hasNext()) {
                    ((g1) it2.next()).c().X(new Function1() { // from class: androidx.compose.ui.tooling.animation.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(q.a.h(this.f42433a, (androidx.compose.ui.a0.c) obj2));
                        }
                    });
                }
            }
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public boolean c(@NotNull androidx.compose.ui.tooling.data.e eVar) {
            if (!eVar.g().isEmpty()) {
                List<g1> listG = eVar.g();
                if (!(listG instanceof Collection) || !listG.isEmpty()) {
                    Iterator<T> it = listG.iterator();
                    while (it.hasNext()) {
                        if (((g1) it.next()).c().X(new Function1() { // from class: androidx.compose.ui.tooling.animation.o
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(q.a.i((androidx.compose.ui.a0.c) obj));
                            }
                        })) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,452:1\n1#2:453\n1#2:464\n1#2:477\n1#2:484\n1#2:569\n1611#3,9:454\n1863#3:463\n1864#3:465\n1620#3:466\n1611#3,9:467\n1863#3:476\n1864#3:478\n1620#3:479\n295#3,2:481\n1611#3,9:486\n1863#3,2:495\n1620#3:497\n1611#3,9:499\n1863#3,2:508\n1620#3:510\n1611#3,9:512\n1863#3,2:521\n1620#3:523\n774#3:524\n865#3,2:525\n1368#3:527\n1454#3,5:528\n1368#3:533\n1454#3,5:534\n808#3,11:539\n1557#3:550\n1628#3,3:551\n808#3,11:554\n295#3,2:566\n1611#3,9:571\n1863#3,2:580\n1620#3:582\n1611#3,9:584\n1863#3,2:593\n1620#3:595\n1611#3,9:597\n1863#3,2:606\n1620#3:608\n56#4:480\n57#4:483\n49#4:485\n50#4:498\n51#4:511\n56#4:565\n57#4:568\n49#4:570\n50#4:583\n51#4:596\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n*L\n310#1:464\n311#1:477\n336#1:484\n351#1:569\n310#1:454,9\n310#1:463\n310#1:465\n310#1:466\n311#1:467,9\n311#1:476\n311#1:478\n311#1:479\n336#1:481,2\n336#1:486,9\n336#1:495,2\n336#1:497\n336#1:499,9\n336#1:508,2\n336#1:510\n336#1:512,9\n336#1:521,2\n336#1:523\n341#1:524\n341#1:525,2\n342#1:527\n342#1:528,5\n343#1:533\n343#1:534,5\n344#1:539,11\n345#1:550\n345#1:551,3\n346#1:554,11\n351#1:566,2\n351#1:571,9\n351#1:580,2\n351#1:582\n351#1:584,9\n351#1:593,2\n351#1:595\n351#1:597,9\n351#1:606,2\n351#1:608\n336#1:480\n336#1:483\n336#1:485\n336#1:498\n336#1:511\n351#1:565\n351#1:568\n351#1:570\n351#1:583\n351#1:596\n*E\n"})
    public static final class b extends j<c<?, ?>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f42444d = 8;

        public b(@NotNull Function1<? super c<?, ?>, Unit> function1) {
            super(function1);
        }

        private final <T> androidx.compose.animation.core.c<T, androidx.compose.animation.core.w> f(androidx.compose.ui.tooling.data.a aVar) {
            T next;
            List listEmptyList;
            T next2;
            T next3;
            Iterator<T> it = aVar.c().iterator();
            do {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof androidx.compose.animation.core.c));
            if (!(next instanceof androidx.compose.animation.core.c)) {
                next = null;
            }
            androidx.compose.animation.core.c cVar = next;
            if (cVar == null || (listEmptyList = CollectionsKt.listOf(cVar)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List list = listEmptyList;
            Collection<androidx.compose.ui.tooling.data.e> collectionB = aVar.b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = collectionB.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((androidx.compose.ui.tooling.data.e) it2.next()).c().iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = (T) null;
                        break;
                    }
                    next3 = it3.next();
                } while (!(next3 instanceof androidx.compose.animation.core.c));
                if (!(next3 instanceof androidx.compose.animation.core.c)) {
                    next3 = null;
                }
                androidx.compose.animation.core.c cVar2 = next3;
                if (cVar2 != null) {
                    arrayList.add(cVar2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = collectionB.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.e eVarE = androidx.compose.ui.tooling.v.e((androidx.compose.ui.tooling.data.e) it4.next(), r.a.f42471a);
                if (eVarE != null) {
                    arrayList2.add(eVarE);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((androidx.compose.ui.tooling.data.e) it5.next()).c().iterator();
                do {
                    if (!it6.hasNext()) {
                        next2 = (T) null;
                        break;
                    }
                    next2 = it6.next();
                } while (!(next2 instanceof androidx.compose.animation.core.c));
                if (!(next2 instanceof androidx.compose.animation.core.c)) {
                    next2 = null;
                }
                androidx.compose.animation.core.c cVar3 = next2;
                if (cVar3 != null) {
                    arrayList3.add(cVar3);
                }
            }
            return (androidx.compose.animation.core.c) CollectionsKt.firstOrNull(CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList3)));
        }

        private final <T> androidx.compose.animation.core.o<T> g(androidx.compose.ui.tooling.data.a aVar) {
            Collection<androidx.compose.ui.tooling.data.e> collectionB = aVar.b();
            ArrayList arrayList = new ArrayList();
            for (T t10 : collectionB) {
                if (Intrinsics.areEqual(((androidx.compose.ui.tooling.data.e) t10).h(), "rememberUpdatedState")) {
                    arrayList.add(t10);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((androidx.compose.ui.tooling.data.e) it.next()).b());
            }
            List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = listPlus.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList3, ((androidx.compose.ui.tooling.data.e) it2.next()).c());
            }
            ArrayList arrayList4 = new ArrayList();
            for (T t11 : arrayList3) {
                if (t11 instanceof n7) {
                    arrayList4.add(t11);
                }
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator<T> it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((n7) it3.next()).getValue());
            }
            ArrayList arrayList6 = new ArrayList();
            for (T t12 : arrayList5) {
                if (t12 instanceof androidx.compose.animation.core.o) {
                    arrayList6.add(t12);
                }
            }
            return (androidx.compose.animation.core.o) CollectionsKt.firstOrNull((List) arrayList6);
        }

        private final <T> List<c<T, androidx.compose.animation.core.w>> h(Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            ArrayList<androidx.compose.ui.tooling.data.a> arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.tooling.data.a aVarJ = j((androidx.compose.ui.tooling.data.e) it.next());
                if (aVarJ != null) {
                    arrayList.add(aVarJ);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (androidx.compose.ui.tooling.data.a aVar : arrayList) {
                androidx.compose.animation.core.c<T, androidx.compose.animation.core.w> cVarF = f(aVar);
                androidx.compose.animation.core.o<T> oVarG = g(aVar);
                n3<n7<T>> n3VarI = i(aVar);
                c cVar = null;
                cVar = null;
                cVar = null;
                if (cVarF != null && oVarG != null && n3VarI != null) {
                    if (n3VarI.getValue() == null) {
                        n3VarI.setValue(new d0(cVarF.v()));
                    }
                    n7<T> value = n3VarI.getValue();
                    d0 d0Var = value instanceof d0 ? (d0) value : null;
                    if (d0Var == null) {
                        d0Var = new d0(cVarF.v());
                    }
                    cVar = new c(cVarF, oVarG, d0Var);
                }
                if (cVar != null) {
                    arrayList2.add(cVar);
                }
            }
            return arrayList2;
        }

        private final <T> n3<n7<T>> i(androidx.compose.ui.tooling.data.e eVar) {
            T next;
            List listEmptyList;
            T next2;
            T next3;
            Iterator<T> it = eVar.c().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof n3));
            if (!(next instanceof n3)) {
                next = null;
            }
            n3 n3Var = (n3) next;
            if (n3Var == null || (listEmptyList = CollectionsKt.listOf(n3Var)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List list = listEmptyList;
            Collection<androidx.compose.ui.tooling.data.e> collectionB = eVar.b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = collectionB.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((androidx.compose.ui.tooling.data.e) it2.next()).c().iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!(next3 instanceof n3));
                if (!(next3 instanceof n3)) {
                    next3 = null;
                }
                n3 n3Var2 = (n3) next3;
                if (n3Var2 != null) {
                    arrayList.add(n3Var2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = collectionB.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.e eVarE = androidx.compose.ui.tooling.v.e((androidx.compose.ui.tooling.data.e) it4.next(), r.a.f42471a);
                if (eVarE != null) {
                    arrayList2.add(eVarE);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((androidx.compose.ui.tooling.data.e) it5.next()).c().iterator();
                do {
                    if (!it6.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                } while (!(next2 instanceof n3));
                if (!(next2 instanceof n3)) {
                    next2 = null;
                }
                n3 n3Var3 = (n3) next2;
                if (n3Var3 != null) {
                    arrayList3.add(n3Var3);
                }
            }
            return (n3) CollectionsKt.firstOrNull(CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList3)));
        }

        private final androidx.compose.ui.tooling.data.a j(androidx.compose.ui.tooling.data.e eVar) {
            if (eVar.f() == null || !Intrinsics.areEqual(eVar.h(), "animateValueAsState")) {
                eVar = null;
            }
            if (eVar == null || !(eVar instanceof androidx.compose.ui.tooling.data.a)) {
                return null;
            }
            return (androidx.compose.ui.tooling.data.a) eVar;
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public void a(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            b().addAll(h(collection));
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public boolean c(@NotNull androidx.compose.ui.tooling.data.e eVar) {
            androidx.compose.ui.tooling.data.a aVarJ = j(eVar);
            return (aVarJ == null || f(aVarJ) == null || g(aVarJ) == null || i(aVarJ) == null) ? false : true;
        }
    }

    @w0(parameters = 0)
    public static final class c<T, V extends androidx.compose.animation.core.w> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f42445d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.animation.core.c<T, V> f42446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.animation.core.o<T> f42447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final d0<T> f42448c;

        public c(@NotNull androidx.compose.animation.core.c<T, V> cVar, @NotNull androidx.compose.animation.core.o<T> oVar, @NotNull d0<T> d0Var) {
            this.f42446a = cVar;
            this.f42447b = oVar;
            this.f42448c = d0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c e(c cVar, androidx.compose.animation.core.c cVar2, androidx.compose.animation.core.o oVar, d0 d0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar2 = cVar.f42446a;
            }
            if ((i10 & 2) != 0) {
                oVar = cVar.f42447b;
            }
            if ((i10 & 4) != 0) {
                d0Var = cVar.f42448c;
            }
            return cVar.d(cVar2, oVar, d0Var);
        }

        @NotNull
        public final androidx.compose.animation.core.c<T, V> a() {
            return this.f42446a;
        }

        @NotNull
        public final androidx.compose.animation.core.o<T> b() {
            return this.f42447b;
        }

        @NotNull
        public final d0<T> c() {
            return this.f42448c;
        }

        @NotNull
        public final c<T, V> d(@NotNull androidx.compose.animation.core.c<T, V> cVar, @NotNull androidx.compose.animation.core.o<T> oVar, @NotNull d0<T> d0Var) {
            return new c<>(cVar, oVar, d0Var);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f42446a, cVar.f42446a) && Intrinsics.areEqual(this.f42447b, cVar.f42447b) && Intrinsics.areEqual(this.f42448c, cVar.f42448c);
        }

        @NotNull
        public final androidx.compose.animation.core.c<T, V> f() {
            return this.f42446a;
        }

        @NotNull
        public final androidx.compose.animation.core.o<T> g() {
            return this.f42447b;
        }

        @NotNull
        public final d0<T> h() {
            return this.f42448c;
        }

        public int hashCode() {
            return (((this.f42446a.hashCode() * 31) + this.f42447b.hashCode()) * 31) + this.f42448c.hashCode();
        }

        @NotNull
        public String toString() {
            return "AnimateXAsStateSearchInfo(animatable=" + this.f42446a + ", animationSpec=" + this.f42447b + ", toolingState=" + this.f42448c + ')';
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,452:1\n1611#2,9:453\n1863#2:462\n1864#2:464\n1620#2:465\n1863#2:467\n295#2,2:468\n1864#2:470\n1620#2:471\n1863#2,2:473\n1620#2:475\n1863#2:477\n295#2,2:478\n1864#2:480\n1620#2:481\n295#2,2:483\n1#3:463\n1#3:482\n49#4:466\n50#4:472\n51#4:476\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n*L\n437#1:453,9\n437#1:462\n437#1:464\n437#1:465\n437#1:467\n437#1:468,2\n437#1:470\n437#1:471\n437#1:473,2\n437#1:475\n437#1:477\n437#1:478,2\n437#1:480\n437#1:481\n445#1:483,2\n437#1:463\n437#1:466\n437#1:472\n437#1:476\n*E\n"})
    public static final class d extends j<l3<?>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f42449d = 8;

        public d(@NotNull Function1<? super l3<?>, Unit> function1) {
            super(function1);
        }

        private final androidx.compose.ui.tooling.data.e f(androidx.compose.ui.tooling.data.e eVar) {
            Object obj = null;
            if (eVar.f() == null || !Intrinsics.areEqual(eVar.h(), "AnimatedContent")) {
                eVar = null;
            }
            if (eVar == null) {
                return null;
            }
            for (Object obj2 : eVar.b()) {
                if (Intrinsics.areEqual(((androidx.compose.ui.tooling.data.e) obj2).h(), "updateTransition")) {
                    obj = obj2;
                    break;
                }
            }
            return (androidx.compose.ui.tooling.data.e) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public void a(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            Object next;
            Object next2;
            Set<l3<?>> setB = b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.tooling.data.e eVarF = f((androidx.compose.ui.tooling.data.e) it.next());
                if (eVarF != null) {
                    arrayList.add(eVarF);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((androidx.compose.ui.tooling.data.e) it2.next()).c().iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!(next2 instanceof l3));
                l3 l3Var = (l3) (next2 instanceof l3 ? next2 : null);
                if (l3Var != null) {
                    arrayList2.add(l3Var);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.e eVarE = androidx.compose.ui.tooling.v.e((androidx.compose.ui.tooling.data.e) it4.next(), r.a.f42471a);
                if (eVarE != null) {
                    arrayList3.add(eVarE);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((androidx.compose.ui.tooling.data.e) it5.next()).c().iterator();
                do {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                } while (!(next instanceof l3));
                if (!(next instanceof l3)) {
                    next = null;
                }
                l3 l3Var2 = (l3) next;
                if (l3Var2 != null) {
                    arrayList4.add(l3Var2);
                }
            }
            setB.addAll(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4));
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public boolean c(@NotNull androidx.compose.ui.tooling.data.e eVar) {
            return f(eVar) != null;
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,452:1\n1611#2,9:453\n1863#2:462\n1864#2:464\n1620#2:465\n1863#2:467\n295#2,2:468\n1864#2:470\n1620#2:471\n1863#2,2:473\n1620#2:475\n1863#2:477\n295#2,2:478\n1864#2:480\n1620#2:481\n295#2,2:483\n1#3:463\n1#3:482\n49#4:466\n50#4:472\n51#4:476\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n*L\n411#1:453,9\n411#1:462\n411#1:464\n411#1:465\n411#1:467\n411#1:468,2\n411#1:470\n411#1:471\n411#1:473,2\n411#1:475\n411#1:477\n411#1:478,2\n411#1:480\n411#1:481\n421#1:483,2\n411#1:463\n411#1:466\n411#1:472\n411#1:476\n*E\n"})
    public static final class e extends j<l3<?>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f42450d = 8;

        public e(@NotNull Function1<? super l3<?>, Unit> function1) {
            super(function1);
        }

        private final androidx.compose.ui.tooling.data.e f(androidx.compose.ui.tooling.data.e eVar) {
            Object obj = null;
            if (eVar.f() == null || !Intrinsics.areEqual(eVar.h(), "AnimatedVisibility")) {
                eVar = null;
            }
            if (eVar == null) {
                return null;
            }
            for (Object obj2 : eVar.b()) {
                if (Intrinsics.areEqual(((androidx.compose.ui.tooling.data.e) obj2).h(), "updateTransition")) {
                    obj = obj2;
                    break;
                }
            }
            return (androidx.compose.ui.tooling.data.e) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public void a(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            Object next;
            Object next2;
            Set<l3<?>> setB = b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.tooling.data.e eVarF = f((androidx.compose.ui.tooling.data.e) it.next());
                if (eVarF != null) {
                    arrayList.add(eVarF);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((androidx.compose.ui.tooling.data.e) it2.next()).c().iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!(next2 instanceof l3));
                l3 l3Var = (l3) (next2 instanceof l3 ? next2 : null);
                if (l3Var != null) {
                    arrayList2.add(l3Var);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.e eVarE = androidx.compose.ui.tooling.v.e((androidx.compose.ui.tooling.data.e) it4.next(), r.a.f42471a);
                if (eVarE != null) {
                    arrayList3.add(eVarE);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((androidx.compose.ui.tooling.data.e) it5.next()).c().iterator();
                do {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                } while (!(next instanceof l3));
                if (!(next instanceof l3)) {
                    next = null;
                }
                l3 l3Var2 = (l3) next;
                if (l3Var2 != null) {
                    arrayList4.add(l3Var2);
                }
            }
            setB.addAll(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4));
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public boolean c(@NotNull androidx.compose.ui.tooling.data.e eVar) {
            return f(eVar) != null;
        }
    }

    @w0(parameters = 0)
    public static final class f extends i<androidx.compose.animation.core.f0<?, ?>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f42451f = 8;

        public f(@NotNull Function1<? super androidx.compose.animation.core.f0<?, ?>, Unit> function1) {
            super(j1.d(androidx.compose.animation.core.f0.class), function1);
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n+ 2 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n60#2,8:453\n69#2,2:467\n60#2,8:495\n69#2:509\n63#2,8:510\n64#2,4:523\n69#2:533\n63#2,8:534\n1368#3:461\n1454#3,5:462\n295#3,2:469\n1611#3,9:472\n1863#3:481\n1864#3:483\n1620#3:484\n1611#3,9:485\n1863#3:494\n1368#3:503\n1454#3,5:504\n295#3,2:518\n1864#3:521\n1620#3:522\n1368#3:527\n1454#3,5:528\n295#3,2:542\n1#4:471\n1#4:482\n1#4:520\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n*L\n224#1:453,8\n224#1:467,2\n243#1:495,8\n243#1:509\n243#1:510,8\n264#1:523,4\n264#1:533\n264#1:534,8\n224#1:461\n224#1:462,5\n224#1:469,2\n241#1:472,9\n241#1:481\n241#1:483\n241#1:484\n242#1:485,9\n242#1:494\n243#1:503\n243#1:504,5\n243#1:518,2\n242#1:521\n242#1:522\n264#1:527\n264#1:528,5\n264#1:542,2\n241#1:482\n242#1:520\n*E\n"})
    public static final class g extends j<h> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f42452d = 8;

        public g(@NotNull Function1<? super h, Unit> function1) {
            super(function1);
        }

        private final List<h> f(Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            h hVar;
            Object next;
            ArrayList<androidx.compose.ui.tooling.data.a> arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.tooling.data.a aVarH = h((androidx.compose.ui.tooling.data.e) it.next());
                if (aVarH != null) {
                    arrayList.add(aVarH);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (androidx.compose.ui.tooling.data.a aVar : arrayList) {
                Collection<Object> collectionC = aVar.c();
                Collection<androidx.compose.ui.tooling.data.e> collectionB = aVar.b();
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = collectionB.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.addAll(arrayList3, ((androidx.compose.ui.tooling.data.e) it2.next()).c());
                }
                Iterator it3 = CollectionsKt.plus((Collection) collectionC, (Iterable) arrayList3).iterator();
                do {
                    hVar = null;
                    hVar = null;
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!(next instanceof i1));
                if (!(next instanceof i1)) {
                    next = null;
                }
                i1 i1Var = (i1) next;
                n3<n7<Long>> n3VarG = g(aVar);
                if (i1Var != null && n3VarG != null) {
                    if (n3VarG.getValue() == null) {
                        n3VarG.setValue(new d0(0L));
                    }
                    n7<Long> value = n3VarG.getValue();
                    d0 d0Var = value instanceof d0 ? (d0) value : null;
                    if (d0Var == null) {
                        d0Var = new d0(0L);
                    }
                    hVar = new h(i1Var, d0Var);
                }
                if (hVar != null) {
                    arrayList2.add(hVar);
                }
            }
            return arrayList2;
        }

        private final n3<n7<Long>> g(androidx.compose.ui.tooling.data.e eVar) {
            Object next;
            Collection<Object> collectionC = eVar.c();
            Collection<androidx.compose.ui.tooling.data.e> collectionB = eVar.b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collectionB.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((androidx.compose.ui.tooling.data.e) it.next()).b());
            }
            List listPlus = CollectionsKt.plus((Collection) collectionB, (Iterable) arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listPlus.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((androidx.compose.ui.tooling.data.e) it2.next()).c());
            }
            Iterator it3 = CollectionsKt.plus((Collection) collectionC, (Iterable) arrayList2).iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!(next instanceof n3));
            return (n3) (next instanceof n3 ? next : null);
        }

        private final androidx.compose.ui.tooling.data.a h(androidx.compose.ui.tooling.data.e eVar) {
            if (eVar.f() == null || !Intrinsics.areEqual(eVar.h(), "rememberInfiniteTransition")) {
                eVar = null;
            }
            if (eVar == null || !(eVar instanceof androidx.compose.ui.tooling.data.a)) {
                return null;
            }
            return (androidx.compose.ui.tooling.data.a) eVar;
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public void a(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            b().addAll(f(collection));
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public boolean c(@NotNull androidx.compose.ui.tooling.data.e eVar) {
            Object next;
            if (h(eVar) != null) {
                Collection<Object> collectionC = eVar.c();
                Collection<androidx.compose.ui.tooling.data.e> collectionB = eVar.b();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = collectionB.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((androidx.compose.ui.tooling.data.e) it.next()).c());
                }
                Iterator it2 = CollectionsKt.plus((Collection) collectionC, (Iterable) arrayList).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(next instanceof i1));
                if (((i1) (next instanceof i1 ? next : null)) != null && g(eVar) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    @w0(parameters = 0)
    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f42453c = i1.f13005f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final i1 f42454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final d0<Long> f42455b;

        public h(@NotNull i1 i1Var, @NotNull d0<Long> d0Var) {
            this.f42454a = i1Var;
            this.f42455b = d0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ h d(h hVar, i1 i1Var, d0 d0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i1Var = hVar.f42454a;
            }
            if ((i10 & 2) != 0) {
                d0Var = hVar.f42455b;
            }
            return hVar.c(i1Var, d0Var);
        }

        @NotNull
        public final i1 a() {
            return this.f42454a;
        }

        @NotNull
        public final d0<Long> b() {
            return this.f42455b;
        }

        @NotNull
        public final h c(@NotNull i1 i1Var, @NotNull d0<Long> d0Var) {
            return new h(i1Var, d0Var);
        }

        @NotNull
        public final i1 e() {
            return this.f42454a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f42454a, hVar.f42454a) && Intrinsics.areEqual(this.f42455b, hVar.f42455b);
        }

        @NotNull
        public final d0<Long> f() {
            return this.f42455b;
        }

        public int hashCode() {
            return (this.f42454a.hashCode() * 31) + this.f42455b.hashCode();
        }

        @NotNull
        public String toString() {
            return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.f42454a + ", toolingState=" + this.f42455b + ')';
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n774#2:453\n865#2,2:454\n1611#2,9:456\n1863#2:465\n1864#2:467\n1620#2:468\n295#2,2:469\n1#3:466\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n*L\n188#1:453\n188#1:454,2\n197#1:456,9\n197#1:465\n197#1:467\n197#1:468\n203#1:469,2\n197#1:466\n*E\n"})
    public static class i<T> extends j<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f42456e = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final kotlin.reflect.d<T> f42457d;

        public i(@NotNull kotlin.reflect.d<T> dVar, @NotNull Function1<? super T, Unit> function1) {
            super(function1);
            this.f42457d = dVar;
        }

        private final <T> T f(androidx.compose.ui.tooling.data.e eVar, kotlin.reflect.d<T> dVar) {
            Object obj;
            T next;
            Iterator<T> it = eVar.c().iterator();
            do {
                obj = null;
                if (it.hasNext()) {
                    next = it.next();
                }
                return (T) kotlin.reflect.e.b(dVar, obj);
            } while (!Intrinsics.areEqual(next != null ? oj.b.i(next.getClass()) : null, dVar));
            obj = next;
            return (T) kotlin.reflect.e.b(dVar, obj);
        }

        private final <T> List<T> g(Collection<? extends androidx.compose.ui.tooling.data.e> collection, kotlin.reflect.d<T> dVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                T tF = f((androidx.compose.ui.tooling.data.e) it.next(), dVar);
                if (tF != null) {
                    arrayList.add(tF);
                }
            }
            return arrayList;
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public void a(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            ArrayList arrayList = new ArrayList();
            for (T t10 : collection) {
                if (((androidx.compose.ui.tooling.data.e) t10).f() != null) {
                    arrayList.add(t10);
                }
            }
            b().addAll(CollectionsKt.toSet(g(arrayList, this.f42457d)));
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public boolean c(@NotNull androidx.compose.ui.tooling.data.e eVar) {
            return (eVar.f() == null || f(eVar, this.f42457d) == null) ? false : true;
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,452:1\n1755#2,3:453\n1863#2,2:456\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n*L\n163#1:453,3\n180#1:456,2\n*E\n"})
    public static abstract class j<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f42458c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<T, Unit> f42459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Set<T> f42460b = new LinkedHashSet();

        /* JADX WARN: Multi-variable type inference failed */
        public j(@NotNull Function1<? super T, Unit> function1) {
            this.f42459a = function1;
        }

        public void a(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
        }

        @NotNull
        public final Set<T> b() {
            return this.f42460b;
        }

        public abstract boolean c(@NotNull androidx.compose.ui.tooling.data.e eVar);

        public final boolean d(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            Collection<? extends androidx.compose.ui.tooling.data.e> collection2 = collection;
            if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                return false;
            }
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (c((androidx.compose.ui.tooling.data.e) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final void e() {
            List listReversed = CollectionsKt.reversed(this.f42460b);
            Function1<T, Unit> function1 = this.f42459a;
            Iterator<T> it = listReversed.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
        }
    }

    @w0(parameters = 0)
    public static final class k extends i<g3<?, ?>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f42461f = 8;

        public k(@NotNull Function1<? super g3<?, ?>, Unit> function1) {
            super(j1.d(g3.class), function1);
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,452:1\n1611#2,9:453\n1863#2:462\n1864#2:464\n1620#2:465\n1863#2:467\n295#2,2:468\n1864#2:470\n1620#2:471\n1863#2,2:473\n1620#2:475\n1863#2:477\n295#2,2:478\n1864#2:480\n1620#2:481\n1#3:463\n1#3:482\n49#4:466\n50#4:472\n51#4:476\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n*L\n392#1:453,9\n392#1:462\n392#1:464\n392#1:465\n392#1:467\n392#1:468,2\n392#1:470\n392#1:471\n392#1:473,2\n392#1:475\n392#1:477\n392#1:478,2\n392#1:480\n392#1:481\n392#1:463\n392#1:466\n392#1:472\n392#1:476\n*E\n"})
    public static final class l extends j<l3<?>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f42462d = 8;

        public l(@NotNull Function1<? super l3<?>, Unit> function1) {
            super(function1);
        }

        private final androidx.compose.ui.tooling.data.e f(androidx.compose.ui.tooling.data.e eVar) {
            if (eVar.f() == null || !Intrinsics.areEqual(eVar.h(), "updateTransition")) {
                return null;
            }
            return eVar;
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public void a(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
            Object next;
            Object next2;
            Set<l3<?>> setB = b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                androidx.compose.ui.tooling.data.e eVarF = f((androidx.compose.ui.tooling.data.e) it.next());
                if (eVarF != null) {
                    arrayList.add(eVarF);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((androidx.compose.ui.tooling.data.e) it2.next()).c().iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!(next2 instanceof l3));
                l3 l3Var = (l3) (next2 instanceof l3 ? next2 : null);
                if (l3Var != null) {
                    arrayList2.add(l3Var);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                androidx.compose.ui.tooling.data.e eVarE = androidx.compose.ui.tooling.v.e((androidx.compose.ui.tooling.data.e) it4.next(), r.a.f42471a);
                if (eVarE != null) {
                    arrayList3.add(eVarE);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((androidx.compose.ui.tooling.data.e) it5.next()).c().iterator();
                do {
                    if (!it6.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it6.next();
                } while (!(next instanceof l3));
                if (!(next instanceof l3)) {
                    next = null;
                }
                l3 l3Var2 = (l3) next;
                if (l3Var2 != null) {
                    arrayList4.add(l3Var2);
                }
            }
            setB.addAll(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4));
        }

        @Override // androidx.compose.ui.tooling.animation.q.j
        public boolean c(@NotNull androidx.compose.ui.tooling.data.e eVar) {
            return f(eVar) != null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull Function0<? extends c0> function0, @NotNull Function0<Unit> function1) {
        this.f42435a = function0;
        this.f42436b = function1;
        d dVar = new d(new Function1() { // from class: androidx.compose.ui.tooling.animation.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.m(this.f42429a, (l3) obj);
            }
        });
        this.f42438d = dVar;
        this.f42439e = new e(new Function1() { // from class: androidx.compose.ui.tooling.animation.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.n(this.f42430a, (l3) obj);
            }
        });
        Set<j<? extends Object>> setU = u();
        this.f42440f = setU;
        Set<j<? extends Object>> setPlus = SetsKt.plus((Set) setU, (Iterable) w());
        this.f42441g = setPlus;
        this.f42442h = SetsKt.plus((Set) setPlus, (Iterable) SetsKt.setOf(dVar));
    }

    private final Collection<b> k() {
        return androidx.compose.ui.tooling.animation.a.f42376g.a() ? SetsKt.setOf(new b(new Function1() { // from class: androidx.compose.ui.tooling.animation.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.l(this.f42431a, (q.c) obj);
            }
        })) : CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(q qVar, c cVar) {
        qVar.f42435a.invoke().L(cVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(q qVar, l3 l3Var) {
        qVar.f42435a.invoke().N(l3Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(q qVar, l3 l3Var) {
        qVar.f42435a.invoke().P(l3Var, qVar.f42436b);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(androidx.compose.ui.tooling.data.e eVar) {
        return true;
    }

    private final Set<g> q() {
        return s.f42472f.a() ? SetsKt.setOf(new g(new Function1() { // from class: androidx.compose.ui.tooling.animation.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.r(this.f42432a, (q.h) obj);
            }
        })) : SetsKt.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(q qVar, h hVar) {
        qVar.f42435a.invoke().V(hVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(androidx.compose.ui.tooling.data.e eVar) {
        return true;
    }

    private final Set<j<? extends Object>> u() {
        return SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.setOf((Object[]) new j[]{this.f42437c, this.f42439e}), (Iterable) k()), (Iterable) q()), (Iterable) (androidx.compose.ui.tooling.animation.b.f42387e.a() ? SetsKt.setOf(this.f42438d) : SetsKt.emptySet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(q qVar, l3 l3Var) {
        qVar.f42435a.invoke().Z(l3Var);
        return Unit.f312394a;
    }

    private final Collection<j<? extends Object>> w() {
        return h0.f42421e.b() ? SetsKt.setOf((Object[]) new j[]{new a(new Function1() { // from class: androidx.compose.ui.tooling.animation.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.x(this.f42413a, obj);
            }
        }), new k(new Function1() { // from class: androidx.compose.ui.tooling.animation.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.y(this.f42419a, (g3) obj);
            }
        }), new f(new Function1() { // from class: androidx.compose.ui.tooling.animation.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.z(this.f42420a, (androidx.compose.animation.core.f0) obj);
            }
        })}) : CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(q qVar, Object obj) {
        qVar.f42435a.invoke().K(obj);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(q qVar, g3 g3Var) {
        qVar.f42435a.invoke().Y(g3Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(q qVar, androidx.compose.animation.core.f0 f0Var) {
        qVar.f42435a.invoke().U(f0Var);
        return Unit.f312394a;
    }

    public final void o(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            List<androidx.compose.ui.tooling.data.e> listB = androidx.compose.ui.tooling.v.b((androidx.compose.ui.tooling.data.e) it.next(), new Function1() { // from class: androidx.compose.ui.tooling.animation.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(q.p((androidx.compose.ui.tooling.data.e) obj));
                }
            });
            Iterator<T> it2 = this.f42442h.iterator();
            while (it2.hasNext()) {
                ((j) it2.next()).a(listB);
            }
            this.f42437c.b().removeAll(this.f42439e.b());
            this.f42437c.b().removeAll(this.f42438d.b());
        }
        Iterator<T> it3 = this.f42441g.iterator();
        while (it3.hasNext()) {
            ((j) it3.next()).e();
        }
    }

    public final boolean s(@NotNull Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
        Collection<? extends androidx.compose.ui.tooling.data.e> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            List<androidx.compose.ui.tooling.data.e> listB = androidx.compose.ui.tooling.v.b((androidx.compose.ui.tooling.data.e) it.next(), new Function1() { // from class: androidx.compose.ui.tooling.animation.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(q.t((androidx.compose.ui.tooling.data.e) obj));
                }
            });
            Set<j<? extends Object>> set = this.f42440f;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((j) it2.next()).d(listB)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
