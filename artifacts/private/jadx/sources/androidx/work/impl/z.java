package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f77333a = "androidx.work.impl.background.gcm.GcmScheduler";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f77334b = androidx.work.v.i("Schedulers");

    private z() {
    }

    public static /* synthetic */ void b(List list, androidx.work.impl.model.n nVar, androidx.work.c cVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((w) it.next()).b(nVar.f());
        }
        f(cVar, workDatabase, list);
    }

    @NonNull
    static w c(@NonNull Context context, @NonNull WorkDatabase workDatabase, androidx.work.c configuration) {
        androidx.work.impl.background.systemjob.c cVar = new androidx.work.impl.background.systemjob.c(context, workDatabase, configuration);
        androidx.work.impl.utils.r.e(context, SystemJobService.class, true);
        androidx.work.v.e().a(f77334b, "Created SystemJobScheduler and enabled SystemJobService");
        return cVar;
    }

    private static void d(androidx.work.impl.model.w dao, androidx.work.b clock, List<androidx.work.impl.model.v> workSpecs) {
        if (workSpecs.size() > 0) {
            long jCurrentTimeMillis = clock.currentTimeMillis();
            Iterator<androidx.work.impl.model.v> it = workSpecs.iterator();
            while (it.hasNext()) {
                dao.K(it.next().f76983a, jCurrentTimeMillis);
            }
        }
    }

    public static void e(@NonNull final List<w> schedulers, @NonNull u processor, @NonNull final Executor executor, @NonNull final WorkDatabase workDatabase, @NonNull final androidx.work.c configuration) {
        processor.e(new f() { // from class: androidx.work.impl.x
            @Override // androidx.work.impl.f
            public final void d(androidx.work.impl.model.n nVar, boolean z10) {
                executor.execute(new Runnable() { // from class: androidx.work.impl.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.b(list, nVar, cVar, workDatabase);
                    }
                });
            }
        });
    }

    public static void f(@NonNull androidx.work.c configuration, @NonNull WorkDatabase workDatabase, @androidx.annotation.p0 List<w> schedulers) {
        if (schedulers == null || schedulers.size() == 0) {
            return;
        }
        androidx.work.impl.model.w wVarK = workDatabase.k();
        workDatabase.beginTransaction();
        try {
            List<androidx.work.impl.model.v> listX = wVarK.x();
            d(wVarK, configuration.a(), listX);
            List<androidx.work.impl.model.v> listM = wVarK.M(configuration.h());
            d(wVarK, configuration.a(), listM);
            if (listX != null) {
                listM.addAll(listX);
            }
            List<androidx.work.impl.model.v> listO = wVarK.o(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (listM.size() > 0) {
                androidx.work.impl.model.v[] vVarArr = (androidx.work.impl.model.v[]) listM.toArray(new androidx.work.impl.model.v[listM.size()]);
                for (w wVar : schedulers) {
                    if (wVar.a()) {
                        wVar.c(vVarArr);
                    }
                }
            }
            if (listO.size() > 0) {
                androidx.work.impl.model.v[] vVarArr2 = (androidx.work.impl.model.v[]) listO.toArray(new androidx.work.impl.model.v[listO.size()]);
                for (w wVar2 : schedulers) {
                    if (!wVar2.a()) {
                        wVar2.c(vVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }

    @androidx.annotation.p0
    private static w g(@NonNull Context context, androidx.work.b clock) {
        try {
            w wVar = (w) Class.forName(f77333a).getConstructor(Context.class, androidx.work.b.class).newInstance(context, clock);
            androidx.work.v.e().a(f77334b, "Created androidx.work.impl.background.gcm.GcmScheduler");
            return wVar;
        } catch (Throwable th2) {
            androidx.work.v.e().b(f77334b, "Unable to create GCM Scheduler", th2);
            return null;
        }
    }
}
