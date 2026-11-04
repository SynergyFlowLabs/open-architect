package com.planner5d.library.activity.fragment.projects;

import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.database.model.project.Project;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nMainListSortingHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListSortingHelper.kt\ncom/planner5d/library/activity/fragment/projects/MainListSortingHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1863#2,2:88\n1863#2,2:90\n*S KotlinDebug\n*F\n+ 1 MainListSortingHelper.kt\ncom/planner5d/library/activity/fragment/projects/MainListSortingHelper\n*L\n42#1:88,2\n49#1:90,2\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f135031a = 0;

    private static abstract class a<T extends Comparable<? super T>> implements Comparator<com.planner5d.library.activity.fragment.list.h0> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@NotNull com.planner5d.library.activity.fragment.list.h0 itemA, @NotNull com.planner5d.library.activity.fragment.list.h0 itemB) {
            Intrinsics.checkNotNullParameter(itemA, "itemA");
            Intrinsics.checkNotNullParameter(itemB, "itemB");
            Comparable comparableB = b(itemA);
            Comparable comparableB2 = b(itemB);
            if ((comparableB instanceof String) && (comparableB2 instanceof String)) {
                return StringsKt.u1((String) comparableB, (String) comparableB2, true);
            }
            if (comparableB == null || comparableB2 == null) {
                return 0;
            }
            return comparableB.compareTo(comparableB2);
        }

        @Nullable
        protected abstract T b(@NotNull com.planner5d.library.activity.fragment.list.h0 h0Var);
    }

    private static final class b implements Comparator<com.planner5d.library.activity.fragment.list.h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f135032a = new b();

        private b() {
        }

        private final int b(com.planner5d.library.activity.fragment.list.h0 h0Var) {
            return h0Var.f() == com.planner5d.library.activity.fragment.list.h0.a.Folder ? 0 : 1;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@NotNull com.planner5d.library.activity.fragment.list.h0 itemA, @NotNull com.planner5d.library.activity.fragment.list.h0 itemB) {
            Intrinsics.checkNotNullParameter(itemA, "itemA");
            Intrinsics.checkNotNullParameter(itemB, "itemB");
            return b(itemA) - b(itemB);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135033a;

        static {
            int[] iArr = new int[l1.j.values().length];
            try {
                iArr[l1.j.FLOOR_PLANS_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l1.j.SNAPSHOTS_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l1.j.FOLDERS_FIRST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l1.j.BY_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l1.j.BY_DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f135033a = iArr;
        }
    }

    public static final class d extends a<String> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.planner5d.library.activity.fragment.projects.l.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(com.planner5d.library.activity.fragment.list.h0 h0Var) {
            Intrinsics.checkNotNullParameter(h0Var, "<this>");
            return h0Var.c();
        }
    }

    public static final class e extends a<Date> {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.planner5d.library.activity.fragment.projects.l.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Date b(com.planner5d.library.activity.fragment.list.h0 h0Var) {
            Intrinsics.checkNotNullParameter(h0Var, "<this>");
            return h0Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(com.planner5d.library.database.model.spaces.documents.c cVar, com.planner5d.library.database.model.spaces.documents.c cVar2) {
        if (cVar.u()) {
            return -1;
        }
        if (cVar2.u()) {
            return 1;
        }
        Date dateO = cVar2.o();
        int iCompareTo = dateO != null ? dateO.compareTo(cVar.o()) : 0;
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        List<String> listT = cVar.t();
        boolean z10 = listT != null && listT.contains(com.planner5d.library.database.model.spaces.documents.c.a.builtIn.n());
        List<String> listT2 = cVar2.t();
        if (z10 != (listT2 != null && listT2.contains(com.planner5d.library.database.model.spaces.documents.c.a.builtIn.n()))) {
            return z10 ? 1 : -1;
        }
        String title = cVar2.getTitle();
        if (title == null) {
            return 0;
        }
        String title2 = cVar.getTitle();
        if (title2 == null) {
            title2 = "";
        }
        return title.compareTo(title2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @NotNull
    public final <T> List<com.planner5d.library.activity.fragment.list.h0> c(@NotNull l1.j sortOrder, @NotNull List<? extends T> data, @NotNull List<? extends com.planner5d.library.model.g<? extends T>> folders) {
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(folders, "folders");
        ArrayList arrayList = new ArrayList();
        for (T t10 : data) {
            if (t10 instanceof Project) {
                arrayList.add(new com.planner5d.library.activity.fragment.list.h0((Project) t10));
            } else if (t10 instanceof gd.b) {
                arrayList.add(new com.planner5d.library.activity.fragment.list.h0((gd.b) t10));
            } else if (t10 instanceof com.planner5d.library.database.model.spaces.documents.a) {
                arrayList.add(new com.planner5d.library.activity.fragment.list.h0((com.planner5d.library.database.model.spaces.documents.a) t10));
            }
        }
        Iterator<T> it = folders.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.planner5d.library.activity.fragment.list.h0((com.planner5d.library.model.g<?>) it.next()));
        }
        int i10 = c.f135033a[sortOrder.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Comparator<com.planner5d.library.activity.fragment.list.h0> comparatorReversed = b.f135032a.reversed();
            Intrinsics.checkNotNullExpressionValue(comparatorReversed, "reversed(...)");
            CollectionsKt.sortWith(arrayList, comparatorReversed);
            return arrayList;
        }
        if (i10 == 3) {
            CollectionsKt.sortWith(arrayList, b.f135032a);
            return arrayList;
        }
        if (i10 == 4) {
            CollectionsKt.sortWith(arrayList, new d());
            return arrayList;
        }
        if (i10 != 5) {
            throw new kotlin.k0();
        }
        Comparator<com.planner5d.library.activity.fragment.list.h0> comparatorReversed2 = new e().reversed();
        Intrinsics.checkNotNullExpressionValue(comparatorReversed2, "reversed(...)");
        CollectionsKt.sortWith(arrayList, comparatorReversed2);
        return arrayList;
    }

    @NotNull
    public final List<com.planner5d.library.database.model.spaces.documents.c> d(@NotNull List<com.planner5d.library.database.model.spaces.documents.c> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final Function2 function2 = new Function2() { // from class: com.planner5d.library.activity.fragment.projects.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(l.e((com.planner5d.library.database.model.spaces.documents.c) obj, (com.planner5d.library.database.model.spaces.documents.c) obj2));
            }
        };
        return CollectionsKt.sortedWith(data, new Comparator() { // from class: com.planner5d.library.activity.fragment.projects.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l.f(function2, obj, obj2);
            }
        });
    }
}
