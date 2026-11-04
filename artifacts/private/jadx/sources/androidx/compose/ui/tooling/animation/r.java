package androidx.compose.ui.tooling.animation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n49#1:499\n50#1:515\n51#1:528\n1611#2,9:453\n1863#2:462\n295#2,2:463\n1864#2:466\n1620#2:467\n1611#2,9:468\n1863#2:477\n1864#2:479\n1620#2:480\n1611#2,9:481\n1863#2:490\n295#2,2:491\n1864#2:494\n1620#2:495\n295#2,2:496\n1611#2,9:500\n1863#2:509\n295#2,2:510\n1864#2:513\n1620#2:514\n1611#2,9:516\n1863#2,2:525\n1620#2:527\n1611#2,9:529\n1863#2:538\n295#2,2:539\n1864#2:541\n1620#2:542\n1368#2:543\n1454#2,5:544\n1368#2:549\n1454#2,5:550\n295#2,2:555\n1368#2:557\n1454#2,5:558\n1368#2:563\n1454#2,5:564\n295#2,2:569\n1#3:465\n1#3:478\n1#3:493\n1#3:498\n1#3:512\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n57#1:499\n57#1:515\n57#1:528\n49#1:453,9\n49#1:462\n49#1:463,2\n49#1:466\n49#1:467\n50#1:468,9\n50#1:477\n50#1:479\n50#1:480\n51#1:481,9\n51#1:490\n51#1:491,2\n51#1:494\n51#1:495\n56#1:496,2\n57#1:500,9\n57#1:509\n57#1:510,2\n57#1:513\n57#1:514\n57#1:516,9\n57#1:525,2\n57#1:527\n57#1:529,9\n57#1:538\n57#1:539,2\n57#1:541\n57#1:542\n67#1:543\n67#1:544,5\n69#1:549\n69#1:550,5\n70#1:555,2\n67#1:557\n67#1:558,5\n69#1:563\n69#1:564,5\n70#1:569,2\n49#1:465\n50#1:478\n51#1:493\n57#1:512\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f42463a = "updateTransition";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f42464b = "AnimatedContent";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f42465c = "AnimatedVisibility";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f42466d = "animateValueAsState";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f42467e = "remember";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f42468f = "rememberInfiniteTransition";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f42469g = "rememberUpdatedState";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f42470h = "androidx.compose.animation.SizeAnimationModifierElement";

    public static final class a implements Function1<androidx.compose.ui.tooling.data.e, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42471a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.tooling.data.e eVar) {
            return Boolean.valueOf(Intrinsics.areEqual(eVar.h(), r.f42467e));
        }
    }

    private static final /* synthetic */ <T> T a(androidx.compose.ui.tooling.data.e eVar, boolean z10) {
        Collection<Object> collectionC = eVar.c();
        List listB = eVar.b();
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((androidx.compose.ui.tooling.data.e) it.next()).b());
            }
            listB = CollectionsKt.plus((Collection) listB, (Iterable) arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = listB.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((androidx.compose.ui.tooling.data.e) it2.next()).c());
        }
        for (T t10 : CollectionsKt.plus((Collection) collectionC, (Iterable) arrayList2)) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (t10 != null) {
                Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
                return t10;
            }
        }
        t10 = null;
        Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
        return t10;
    }

    static /* synthetic */ Object b(androidx.compose.ui.tooling.data.e eVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        Collection<Object> collectionC = eVar.c();
        List listB = eVar.b();
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((androidx.compose.ui.tooling.data.e) it.next()).b());
            }
            listB = CollectionsKt.plus((Collection) listB, (Iterable) arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = listB.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((androidx.compose.ui.tooling.data.e) it2.next()).c());
        }
        for (Object obj2 : CollectionsKt.plus((Collection) collectionC, (Iterable) arrayList2)) {
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            if (obj2 != null) {
                Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
                return obj2;
            }
        }
        obj2 = null;
        Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
        return obj2;
    }

    private static final /* synthetic */ <T> List<T> c(androidx.compose.ui.tooling.data.e eVar) {
        T next;
        T next2;
        T next3;
        List listListOf;
        Iterator<T> it = eVar.c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
        } while (next == null);
        Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
        List listEmptyList = (next == null || (listListOf = CollectionsKt.listOf(next)) == null) ? CollectionsKt.emptyList() : listListOf;
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
                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            } while (next3 == null);
            Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
            if (next3 != null) {
                arrayList.add(next3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it4 = collectionB.iterator();
        while (it4.hasNext()) {
            androidx.compose.ui.tooling.data.e eVarE = androidx.compose.ui.tooling.v.e((androidx.compose.ui.tooling.data.e) it4.next(), a.f42471a);
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
                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            } while (next2 == null);
            Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
            if (next2 != null) {
                arrayList3.add(next2);
            }
        }
        return CollectionsKt.plus((Collection) listEmptyList, (Iterable) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList3));
    }

    private static final /* synthetic */ <T> List<T> d(Collection<? extends androidx.compose.ui.tooling.data.e> collection) {
        T next;
        Collection<? extends androidx.compose.ui.tooling.data.e> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (true) {
            T t10 = null;
            if (!it.hasNext()) {
                break;
            }
            for (T t11 : ((androidx.compose.ui.tooling.data.e) it.next()).c()) {
                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
                if (t11 != null) {
                    t10 = t11;
                    break;
                }
            }
            Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            androidx.compose.ui.tooling.data.e eVarE = androidx.compose.ui.tooling.v.e((androidx.compose.ui.tooling.data.e) it2.next(), a.f42471a);
            if (eVarE != null) {
                arrayList2.add(eVarE);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Iterator<T> it4 = ((androidx.compose.ui.tooling.data.e) it3.next()).c().iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                Intrinsics.reifiedOperationMarker(3, androidx.exifinterface.media.a.f51379e5);
            } while (next == null);
            Intrinsics.reifiedOperationMarker(2, androidx.exifinterface.media.a.f51379e5);
            if (next != null) {
                arrayList3.add(next);
            }
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList3);
    }
}
