package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.o0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEnqueueUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnqueueUtils.kt\nandroidx/work/impl/utils/EnqueueUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1774#2,4:118\n1747#2,3:123\n1#3:122\n*S KotlinDebug\n*F\n+ 1 EnqueueUtils.kt\nandroidx/work/impl/utils/EnqueueUtilsKt\n*L\n44#1:118,4\n112#1:123,3\n*E\n"})
public final class e {
    public static final void a(@NotNull WorkDatabase workDatabase, @NotNull androidx.work.c configuration, @NotNull androidx.work.impl.c0 continuation) {
        int i10;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        List listMutableListOf = CollectionsKt.mutableListOf(continuation);
        int i11 = 0;
        while (!listMutableListOf.isEmpty()) {
            androidx.work.impl.c0 c0Var = (androidx.work.impl.c0) CollectionsKt.removeLast(listMutableListOf);
            List<? extends o0> listM = c0Var.m();
            Intrinsics.checkNotNullExpressionValue(listM, "current.work");
            List<? extends o0> list = listM;
            if ((list instanceof Collection) && list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((o0) it.next()).d().f76992j.e() && (i10 = i10 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            i11 += i10;
            List<androidx.work.impl.c0> listL = c0Var.l();
            if (listL != null) {
                listMutableListOf.addAll(listL);
            }
        }
        if (i11 == 0) {
            return;
        }
        int iA = workDatabase.k().A();
        int iB = configuration.b();
        if (iA + i11 <= iB) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + iB + ";\nalready enqueued count: " + iA + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    @NotNull
    public static final androidx.work.impl.model.v b(@NotNull androidx.work.impl.model.v workSpec) throws Throwable {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        androidx.work.e eVar = workSpec.f76992j;
        String str = workSpec.f76985c;
        if (Intrinsics.areEqual(str, ConstraintTrackingWorker.class.getName()) || !(eVar.f() || eVar.i())) {
            return workSpec;
        }
        androidx.work.h hVarA = new androidx.work.h.a().c(workSpec.f76987e).q(f4.d.f274937b, str).a();
        Intrinsics.checkNotNullExpressionValue(hVarA, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return androidx.work.impl.model.v.B(workSpec, null, null, name, null, hVarA, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388587, null);
    }

    private static final boolean c(List<? extends androidx.work.impl.w> list, String str) {
        try {
            Class<?> cls = Class.forName(str);
            List<? extends androidx.work.impl.w> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((androidx.work.impl.w) it.next()).getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    @NotNull
    public static final androidx.work.impl.model.v d(@NotNull List<? extends androidx.work.impl.w> schedulers, @NotNull androidx.work.impl.model.v workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec;
    }
}
