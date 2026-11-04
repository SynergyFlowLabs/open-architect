package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.r0;
import androidx.work.l0;
import androidx.work.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f77175c = androidx.work.v.i("EnqueueRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.c0 f77176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.q f77177b;

    public d(@NonNull androidx.work.impl.c0 workContinuation) {
        this(workContinuation, new androidx.work.impl.q());
    }

    private static boolean b(@NonNull androidx.work.impl.c0 workContinuation) {
        boolean zC = c(workContinuation.n(), workContinuation.m(), (String[]) androidx.work.impl.c0.s(workContinuation).toArray(new String[0]), workContinuation.k(), workContinuation.i());
        workContinuation.r();
        return zC;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0160  */
    private static boolean c(r0 workManagerImpl, @NonNull List<? extends o0> workList, String[] prerequisiteIds, String name, androidx.work.m existingWorkPolicy) {
        boolean z10;
        boolean z11;
        boolean z12;
        r0 r0Var;
        WorkDatabase workDatabase;
        boolean z13;
        String[] strArr = prerequisiteIds;
        long jCurrentTimeMillis = workManagerImpl.o().a().currentTimeMillis();
        WorkDatabase workDatabaseS = workManagerImpl.S();
        boolean z14 = strArr != null && strArr.length > 0;
        if (z14) {
            z10 = false;
            z11 = false;
            z12 = true;
            for (String str : strArr) {
                androidx.work.impl.model.v vVarH = workDatabaseS.k().H(str);
                if (vVarH == null) {
                    androidx.work.v.e().c(f77175c, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    return false;
                }
                l0.c cVar = vVarH.f76984b;
                z12 &= cVar == l0.c.SUCCEEDED;
                if (cVar == l0.c.FAILED) {
                    z11 = true;
                } else if (cVar == l0.c.CANCELLED) {
                    z10 = true;
                }
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(name);
        if (zIsEmpty || z14) {
            r0Var = workManagerImpl;
            workDatabase = workDatabaseS;
            z13 = false;
        } else {
            List<androidx.work.impl.model.v.b> listL = workDatabaseS.k().L(name);
            if (listL.isEmpty()) {
                r0Var = workManagerImpl;
                workDatabase = workDatabaseS;
            } else if (existingWorkPolicy == androidx.work.m.APPEND || existingWorkPolicy == androidx.work.m.APPEND_OR_REPLACE) {
                r0Var = workManagerImpl;
                androidx.work.impl.model.b bVarE = workDatabaseS.e();
                List arrayList = new ArrayList();
                for (androidx.work.impl.model.v.b bVar : listL) {
                    if (!bVarE.e(bVar.f77006a)) {
                        l0.c cVar2 = bVar.f77007b;
                        boolean z15 = (cVar2 == l0.c.SUCCEEDED) & z12;
                        if (cVar2 == l0.c.FAILED) {
                            z11 = true;
                        } else if (cVar2 == l0.c.CANCELLED) {
                            z10 = true;
                        }
                        arrayList.add(bVar.f77006a);
                        z12 = z15;
                    }
                    workDatabaseS = workDatabaseS;
                }
                workDatabase = workDatabaseS;
                if (existingWorkPolicy == androidx.work.m.APPEND_OR_REPLACE && (z10 || z11)) {
                    androidx.work.impl.model.w wVarK = workDatabase.k();
                    Iterator<androidx.work.impl.model.v.b> it = wVarK.L(name).iterator();
                    while (it.hasNext()) {
                        wVarK.a(it.next().f77006a);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z10 = false;
                    z11 = false;
                }
                strArr = (String[]) arrayList.toArray(strArr);
                z14 = strArr.length > 0;
            } else {
                if (existingWorkPolicy == androidx.work.m.KEEP) {
                    Iterator<androidx.work.impl.model.v.b> it2 = listL.iterator();
                    while (it2.hasNext()) {
                        l0.c cVar3 = it2.next().f77007b;
                        if (cVar3 == l0.c.ENQUEUED || cVar3 == l0.c.RUNNING) {
                            return false;
                        }
                    }
                }
                r0Var = workManagerImpl;
                b.d(name, r0Var, false).run();
                androidx.work.impl.model.w wVarK2 = workDatabaseS.k();
                Iterator<androidx.work.impl.model.v.b> it3 = listL.iterator();
                while (it3.hasNext()) {
                    wVarK2.a(it3.next().f77006a);
                }
                workDatabase = workDatabaseS;
                z13 = true;
            }
            z13 = false;
        }
        Iterator<? extends o0> it4 = workList.iterator();
        while (it4.hasNext()) {
            o0 next = it4.next();
            androidx.work.impl.model.v vVarD = next.d();
            if (!z14 || z12) {
                vVarD.f76996n = jCurrentTimeMillis;
            } else if (z11) {
                vVarD.f76984b = l0.c.FAILED;
            } else if (z10) {
                vVarD.f76984b = l0.c.CANCELLED;
            } else {
                vVarD.f76984b = l0.c.BLOCKED;
            }
            if (vVarD.f76984b == l0.c.ENQUEUED) {
                z13 = true;
            }
            workDatabase.k().f(e.d(r0Var.Q(), vVarD));
            if (z14) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    workDatabase.e().a(new androidx.work.impl.model.a(next.b(), strArr[i10]));
                    i10++;
                    it4 = it4;
                    strArr = strArr;
                }
            }
            String[] strArr2 = strArr;
            Iterator<? extends o0> it5 = it4;
            workDatabase.l().c(next.b(), next.c());
            if (!zIsEmpty) {
                workDatabase.i().a(new androidx.work.impl.model.o(name, next.b()));
            }
            it4 = it5;
            strArr = strArr2;
        }
        return z13;
    }

    private static boolean e(@NonNull androidx.work.impl.c0 workContinuation) {
        List<androidx.work.impl.c0> listL = workContinuation.l();
        boolean zE = false;
        if (listL != null) {
            for (androidx.work.impl.c0 c0Var : listL) {
                if (c0Var.q()) {
                    androidx.work.v.e().l(f77175c, "Already enqueued work ids (" + TextUtils.join(", ", c0Var.j()) + ")");
                } else {
                    zE |= e(c0Var);
                }
            }
        }
        return b(workContinuation) | zE;
    }

    @l1
    public boolean a() {
        r0 r0VarN = this.f77176a.n();
        WorkDatabase workDatabaseS = r0VarN.S();
        workDatabaseS.beginTransaction();
        try {
            e.a(workDatabaseS, r0VarN.o(), this.f77176a);
            boolean zE = e(this.f77176a);
            workDatabaseS.setTransactionSuccessful();
            return zE;
        } finally {
            workDatabaseS.endTransaction();
        }
    }

    @NonNull
    public androidx.work.a0 d() {
        return this.f77177b;
    }

    @l1
    public void f() {
        r0 r0VarN = this.f77176a.n();
        androidx.work.impl.z.f(r0VarN.o(), r0VarN.S(), r0VarN.Q());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f77176a.o()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f77176a + ")");
            }
            if (a()) {
                r.e(this.f77176a.n().K(), RescheduleReceiver.class, true);
                f();
            }
            this.f77177b.a(androidx.work.a0.f76489a);
        } catch (Throwable th2) {
            this.f77177b.a(new androidx.work.a0.b.a(th2));
        }
    }

    public d(@NonNull androidx.work.impl.c0 workContinuation, @NonNull androidx.work.impl.q result) {
        this.f77176a = workContinuation;
        this.f77177b = result;
    }
}
