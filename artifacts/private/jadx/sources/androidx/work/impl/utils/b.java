package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.r0;
import androidx.work.l0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.q f77165a = new androidx.work.impl.q();

    class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f77167c;

        a(final r0 val$workManagerImpl, final UUID val$id) {
            this.f77166b = val$workManagerImpl;
            this.f77167c = val$id;
        }

        @Override // androidx.work.impl.utils.b
        @m1
        void i() {
            WorkDatabase workDatabaseS = this.f77166b.S();
            workDatabaseS.beginTransaction();
            try {
                a(this.f77166b, this.f77167c.toString());
                workDatabaseS.setTransactionSuccessful();
                workDatabaseS.endTransaction();
                h(this.f77166b);
            } catch (Throwable th2) {
                workDatabaseS.endTransaction();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.b$b, reason: collision with other inner class name */
    class C0787b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77169c;

        C0787b(final r0 val$workManagerImpl, final String val$tag) {
            this.f77168b = val$workManagerImpl;
            this.f77169c = val$tag;
        }

        @Override // androidx.work.impl.utils.b
        @m1
        void i() {
            WorkDatabase workDatabaseS = this.f77168b.S();
            workDatabaseS.beginTransaction();
            try {
                Iterator<String> it = workDatabaseS.k().l(this.f77169c).iterator();
                while (it.hasNext()) {
                    a(this.f77168b, it.next());
                }
                workDatabaseS.setTransactionSuccessful();
                workDatabaseS.endTransaction();
                h(this.f77168b);
            } catch (Throwable th2) {
                workDatabaseS.endTransaction();
                throw th2;
            }
        }
    }

    class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f77171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f77172d;

        c(final r0 val$workManagerImpl, final String val$name, final boolean val$allowReschedule) {
            this.f77170b = val$workManagerImpl;
            this.f77171c = val$name;
            this.f77172d = val$allowReschedule;
        }

        @Override // androidx.work.impl.utils.b
        @m1
        void i() {
            WorkDatabase workDatabaseS = this.f77170b.S();
            workDatabaseS.beginTransaction();
            try {
                Iterator<String> it = workDatabaseS.k().h(this.f77171c).iterator();
                while (it.hasNext()) {
                    a(this.f77170b, it.next());
                }
                workDatabaseS.setTransactionSuccessful();
                workDatabaseS.endTransaction();
                if (this.f77172d) {
                    h(this.f77170b);
                }
            } catch (Throwable th2) {
                workDatabaseS.endTransaction();
                throw th2;
            }
        }
    }

    class d extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0 f77173b;

        d(final r0 val$workManagerImpl) {
            this.f77173b = val$workManagerImpl;
        }

        @Override // androidx.work.impl.utils.b
        @m1
        void i() {
            WorkDatabase workDatabaseS = this.f77173b.S();
            workDatabaseS.beginTransaction();
            try {
                Iterator<String> it = workDatabaseS.k().v().iterator();
                while (it.hasNext()) {
                    a(this.f77173b, it.next());
                }
                new t(this.f77173b.S()).g(this.f77173b.o().a().currentTimeMillis());
                workDatabaseS.setTransactionSuccessful();
                workDatabaseS.endTransaction();
            } catch (Throwable th2) {
                workDatabaseS.endTransaction();
                throw th2;
            }
        }
    }

    @NonNull
    public static b b(@NonNull final r0 workManagerImpl) {
        return new d(workManagerImpl);
    }

    @NonNull
    public static b c(@NonNull final UUID id2, @NonNull final r0 workManagerImpl) {
        return new a(workManagerImpl, id2);
    }

    @NonNull
    public static b d(@NonNull final String name, @NonNull final r0 workManagerImpl, final boolean allowReschedule) {
        return new c(workManagerImpl, name, allowReschedule);
    }

    @NonNull
    public static b e(@NonNull final String tag, @NonNull final r0 workManagerImpl) {
        return new C0787b(workManagerImpl, tag);
    }

    private void g(WorkDatabase workDatabase, String workSpecId) {
        androidx.work.impl.model.w wVarK = workDatabase.k();
        androidx.work.impl.model.b bVarE = workDatabase.e();
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            l0.c cVarJ = wVarK.j(str);
            if (cVarJ != l0.c.SUCCEEDED && cVarJ != l0.c.FAILED) {
                wVarK.k(str);
            }
            linkedList.addAll(bVarE.b(str));
        }
    }

    void a(r0 workManagerImpl, String workSpecId) {
        g(workManagerImpl.S(), workSpecId);
        workManagerImpl.O().r(workSpecId, 1);
        Iterator<androidx.work.impl.w> it = workManagerImpl.Q().iterator();
        while (it.hasNext()) {
            it.next().b(workSpecId);
        }
    }

    @NonNull
    public androidx.work.a0 f() {
        return this.f77165a;
    }

    void h(r0 workManagerImpl) {
        androidx.work.impl.z.f(workManagerImpl.o(), workManagerImpl.S(), workManagerImpl.Q());
    }

    abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        try {
            i();
            this.f77165a.a(androidx.work.a0.f76489a);
        } catch (Throwable th2) {
            this.f77165a.a(new androidx.work.a0.b.a(th2));
        }
    }
}
