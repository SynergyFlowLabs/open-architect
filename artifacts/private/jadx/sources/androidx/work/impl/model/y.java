package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.w0;
import androidx.room.b2;
import androidx.room.f2;
import androidx.room.m2;
import androidx.work.l0;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements androidx.work.impl.model.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f77041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.w<androidx.work.impl.model.v> f77042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.v<androidx.work.impl.model.v> f77043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m2 f77044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m2 f77045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m2 f77046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m2 f77047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m2 f77048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m2 f77049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m2 f77050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m2 f77051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m2 f77052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m2 f77053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m2 f77054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m2 f77055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final m2 f77056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m2 f77057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final m2 f77058r;

    class a extends m2 {
        a(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class b extends m2 {
        b(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    class c extends m2 {
        c(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    class d extends m2 {
        d(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class e extends m2 {
        e(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class f extends m2 {
        f(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class g extends m2 {
        g(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class h extends m2 {
        h(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    class i implements Callable<List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f77067a;

        i(final f2 val$_statement) {
            this.f77067a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call() throws Exception {
            y.this.f77041a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(y.this.f77041a, this.f77067a, false, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
                    }
                    y.this.f77041a.setTransactionSuccessful();
                    cursorF.close();
                    y.this.f77041a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                y.this.f77041a.endTransaction();
                throw th3;
            }
        }

        protected void finalize() {
            this.f77067a.release();
        }
    }

    class j implements Callable<List<androidx.work.impl.model.v.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f77069a;

        j(final f2 val$_statement) {
            this.f77069a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<androidx.work.impl.model.v.c> call() throws Exception {
            y.this.f77041a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(y.this.f77041a, this.f77069a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorF.moveToNext()) {
                        String string = cursorF.getString(0);
                        if (((ArrayList) map.get(string)) == null) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorF.getString(0);
                        if (((ArrayList) map2.get(string2)) == null) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorF.moveToPosition(-1);
                    y.this.U(map);
                    y.this.T(map2);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                        int i10 = cursorF.getInt(1);
                        d0 d0Var = d0.f76918a;
                        l0.c cVarF = d0.f(i10);
                        androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                        int i11 = cursorF.getInt(3);
                        int i12 = cursorF.getInt(4);
                        long j10 = cursorF.getLong(13);
                        long j11 = cursorF.getLong(14);
                        long j12 = cursorF.getLong(15);
                        androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                        long j13 = cursorF.getLong(17);
                        long j14 = cursorF.getLong(18);
                        int i13 = cursorF.getInt(19);
                        long j15 = cursorF.getLong(20);
                        int i14 = cursorF.getInt(21);
                        androidx.work.e eVar = new androidx.work.e(d0.d(cursorF.getInt(5)), cursorF.getInt(6) != 0, cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getLong(10), cursorF.getLong(11), d0.b(cursorF.isNull(12) ? null : cursorF.getBlob(12)));
                        ArrayList arrayList2 = (ArrayList) map.get(cursorF.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = (ArrayList) map2.get(cursorF.getString(0));
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList.add(new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i11, aVarC, j13, j14, i13, i12, j15, i14, arrayList2, arrayList3));
                    }
                    y.this.f77041a.setTransactionSuccessful();
                    cursorF.close();
                    y.this.f77041a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                y.this.f77041a.endTransaction();
                throw th3;
            }
        }

        protected void finalize() {
            this.f77069a.release();
        }
    }

    class k extends androidx.room.w<androidx.work.impl.model.v> {
        k(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.w
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(w3.i iVar, androidx.work.impl.model.v vVar) throws Throwable {
            String str = vVar.f76983a;
            if (str == null) {
                iVar.J7(1);
            } else {
                iVar.H5(1, str);
            }
            d0 d0Var = d0.f76918a;
            iVar.G6(2, d0.j(vVar.f76984b));
            String str2 = vVar.f76985c;
            if (str2 == null) {
                iVar.J7(3);
            } else {
                iVar.H5(3, str2);
            }
            String str3 = vVar.f76986d;
            if (str3 == null) {
                iVar.J7(4);
            } else {
                iVar.H5(4, str3);
            }
            byte[] bArrF = androidx.work.h.F(vVar.f76987e);
            if (bArrF == null) {
                iVar.J7(5);
            } else {
                iVar.Q6(5, bArrF);
            }
            byte[] bArrF2 = androidx.work.h.F(vVar.f76988f);
            if (bArrF2 == null) {
                iVar.J7(6);
            } else {
                iVar.Q6(6, bArrF2);
            }
            iVar.G6(7, vVar.f76989g);
            iVar.G6(8, vVar.f76990h);
            iVar.G6(9, vVar.f76991i);
            iVar.G6(10, vVar.f76993k);
            iVar.G6(11, d0.a(vVar.f76994l));
            iVar.G6(12, vVar.f76995m);
            iVar.G6(13, vVar.f76996n);
            iVar.G6(14, vVar.f76997o);
            iVar.G6(15, vVar.f76998p);
            iVar.G6(16, vVar.f76999q ? 1L : 0L);
            iVar.G6(17, d0.h(vVar.f77000r));
            iVar.G6(18, vVar.F());
            iVar.G6(19, vVar.C());
            iVar.G6(20, vVar.D());
            iVar.G6(21, vVar.E());
            iVar.G6(22, vVar.G());
            androidx.work.e eVar = vVar.f76992j;
            if (eVar == null) {
                iVar.J7(23);
                iVar.J7(24);
                iVar.J7(25);
                iVar.J7(26);
                iVar.J7(27);
                iVar.J7(28);
                iVar.J7(29);
                iVar.J7(30);
                return;
            }
            iVar.G6(23, d0.g(eVar.d()));
            iVar.G6(24, eVar.g() ? 1L : 0L);
            iVar.G6(25, eVar.h() ? 1L : 0L);
            iVar.G6(26, eVar.f() ? 1L : 0L);
            iVar.G6(27, eVar.i() ? 1L : 0L);
            iVar.G6(28, eVar.b());
            iVar.G6(29, eVar.a());
            byte[] bArrI = d0.i(eVar.c());
            if (bArrI == null) {
                iVar.J7(30);
            } else {
                iVar.Q6(30, bArrI);
            }
        }
    }

    class l implements Callable<List<androidx.work.impl.model.v.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f77072a;

        l(final f2 val$_statement) {
            this.f77072a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<androidx.work.impl.model.v.c> call() throws Exception {
            y.this.f77041a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(y.this.f77041a, this.f77072a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorF.moveToNext()) {
                        String string = cursorF.getString(0);
                        if (((ArrayList) map.get(string)) == null) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorF.getString(0);
                        if (((ArrayList) map2.get(string2)) == null) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorF.moveToPosition(-1);
                    y.this.U(map);
                    y.this.T(map2);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                        int i10 = cursorF.getInt(1);
                        d0 d0Var = d0.f76918a;
                        l0.c cVarF = d0.f(i10);
                        androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                        int i11 = cursorF.getInt(3);
                        int i12 = cursorF.getInt(4);
                        long j10 = cursorF.getLong(13);
                        long j11 = cursorF.getLong(14);
                        long j12 = cursorF.getLong(15);
                        androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                        long j13 = cursorF.getLong(17);
                        long j14 = cursorF.getLong(18);
                        int i13 = cursorF.getInt(19);
                        long j15 = cursorF.getLong(20);
                        int i14 = cursorF.getInt(21);
                        androidx.work.e eVar = new androidx.work.e(d0.d(cursorF.getInt(5)), cursorF.getInt(6) != 0, cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getLong(10), cursorF.getLong(11), d0.b(cursorF.isNull(12) ? null : cursorF.getBlob(12)));
                        ArrayList arrayList2 = (ArrayList) map.get(cursorF.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = (ArrayList) map2.get(cursorF.getString(0));
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList.add(new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i11, aVarC, j13, j14, i13, i12, j15, i14, arrayList2, arrayList3));
                    }
                    y.this.f77041a.setTransactionSuccessful();
                    cursorF.close();
                    y.this.f77041a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                y.this.f77041a.endTransaction();
                throw th3;
            }
        }

        protected void finalize() {
            this.f77072a.release();
        }
    }

    class m implements Callable<List<androidx.work.impl.model.v.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f77074a;

        m(final f2 val$_statement) {
            this.f77074a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<androidx.work.impl.model.v.c> call() throws Exception {
            y.this.f77041a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(y.this.f77041a, this.f77074a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorF.moveToNext()) {
                        String string = cursorF.getString(0);
                        if (((ArrayList) map.get(string)) == null) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorF.getString(0);
                        if (((ArrayList) map2.get(string2)) == null) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorF.moveToPosition(-1);
                    y.this.U(map);
                    y.this.T(map2);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                        int i10 = cursorF.getInt(1);
                        d0 d0Var = d0.f76918a;
                        l0.c cVarF = d0.f(i10);
                        androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                        int i11 = cursorF.getInt(3);
                        int i12 = cursorF.getInt(4);
                        long j10 = cursorF.getLong(13);
                        long j11 = cursorF.getLong(14);
                        long j12 = cursorF.getLong(15);
                        androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                        long j13 = cursorF.getLong(17);
                        long j14 = cursorF.getLong(18);
                        int i13 = cursorF.getInt(19);
                        long j15 = cursorF.getLong(20);
                        int i14 = cursorF.getInt(21);
                        androidx.work.e eVar = new androidx.work.e(d0.d(cursorF.getInt(5)), cursorF.getInt(6) != 0, cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getLong(10), cursorF.getLong(11), d0.b(cursorF.isNull(12) ? null : cursorF.getBlob(12)));
                        ArrayList arrayList2 = (ArrayList) map.get(cursorF.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = (ArrayList) map2.get(cursorF.getString(0));
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList.add(new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i11, aVarC, j13, j14, i13, i12, j15, i14, arrayList2, arrayList3));
                    }
                    y.this.f77041a.setTransactionSuccessful();
                    cursorF.close();
                    y.this.f77041a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                y.this.f77041a.endTransaction();
                throw th3;
            }
        }

        protected void finalize() {
            this.f77074a.release();
        }
    }

    class n implements Callable<List<androidx.work.impl.model.v.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f77076a;

        n(final f2 val$_statement) {
            this.f77076a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<androidx.work.impl.model.v.c> call() throws Exception {
            y.this.f77041a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(y.this.f77041a, this.f77076a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorF.moveToNext()) {
                        String string = cursorF.getString(0);
                        if (((ArrayList) map.get(string)) == null) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorF.getString(0);
                        if (((ArrayList) map2.get(string2)) == null) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorF.moveToPosition(-1);
                    y.this.U(map);
                    y.this.T(map2);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                        int i10 = cursorF.getInt(1);
                        d0 d0Var = d0.f76918a;
                        l0.c cVarF = d0.f(i10);
                        androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                        int i11 = cursorF.getInt(3);
                        int i12 = cursorF.getInt(4);
                        long j10 = cursorF.getLong(13);
                        long j11 = cursorF.getLong(14);
                        long j12 = cursorF.getLong(15);
                        androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                        long j13 = cursorF.getLong(17);
                        long j14 = cursorF.getLong(18);
                        int i13 = cursorF.getInt(19);
                        long j15 = cursorF.getLong(20);
                        int i14 = cursorF.getInt(21);
                        androidx.work.e eVar = new androidx.work.e(d0.d(cursorF.getInt(5)), cursorF.getInt(6) != 0, cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getLong(10), cursorF.getLong(11), d0.b(cursorF.isNull(12) ? null : cursorF.getBlob(12)));
                        ArrayList arrayList2 = (ArrayList) map.get(cursorF.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = (ArrayList) map2.get(cursorF.getString(0));
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList.add(new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i11, aVarC, j13, j14, i13, i12, j15, i14, arrayList2, arrayList3));
                    }
                    y.this.f77041a.setTransactionSuccessful();
                    cursorF.close();
                    y.this.f77041a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                y.this.f77041a.endTransaction();
                throw th3;
            }
        }

        protected void finalize() {
            this.f77076a.release();
        }
    }

    class o implements Callable<List<androidx.work.impl.model.v.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f77078a;

        o(final f2 val$_statement) {
            this.f77078a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<androidx.work.impl.model.v.c> call() throws Exception {
            y.this.f77041a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(y.this.f77041a, this.f77078a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorF.moveToNext()) {
                        String string = cursorF.getString(0);
                        if (((ArrayList) map.get(string)) == null) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorF.getString(0);
                        if (((ArrayList) map2.get(string2)) == null) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorF.moveToPosition(-1);
                    y.this.U(map);
                    y.this.T(map2);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                        int i10 = cursorF.getInt(1);
                        d0 d0Var = d0.f76918a;
                        l0.c cVarF = d0.f(i10);
                        androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                        int i11 = cursorF.getInt(3);
                        int i12 = cursorF.getInt(4);
                        long j10 = cursorF.getLong(13);
                        long j11 = cursorF.getLong(14);
                        long j12 = cursorF.getLong(15);
                        androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                        long j13 = cursorF.getLong(17);
                        long j14 = cursorF.getLong(18);
                        int i13 = cursorF.getInt(19);
                        long j15 = cursorF.getLong(20);
                        int i14 = cursorF.getInt(21);
                        androidx.work.e eVar = new androidx.work.e(d0.d(cursorF.getInt(5)), cursorF.getInt(6) != 0, cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getLong(10), cursorF.getLong(11), d0.b(cursorF.isNull(12) ? null : cursorF.getBlob(12)));
                        ArrayList arrayList2 = (ArrayList) map.get(cursorF.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = (ArrayList) map2.get(cursorF.getString(0));
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList.add(new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i11, aVarC, j13, j14, i13, i12, j15, i14, arrayList2, arrayList3));
                    }
                    y.this.f77041a.setTransactionSuccessful();
                    cursorF.close();
                    y.this.f77041a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                y.this.f77041a.endTransaction();
                throw th3;
            }
        }

        protected void finalize() {
            this.f77078a.release();
        }
    }

    class p implements Callable<List<androidx.work.impl.model.v.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f77080a;

        p(final f2 val$_statement) {
            this.f77080a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<androidx.work.impl.model.v.c> call() throws Exception {
            y.this.f77041a.beginTransaction();
            try {
                Cursor cursorF = androidx.room.util.b.f(y.this.f77041a, this.f77080a, true, null);
                try {
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    while (cursorF.moveToNext()) {
                        String string = cursorF.getString(0);
                        if (((ArrayList) map.get(string)) == null) {
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorF.getString(0);
                        if (((ArrayList) map2.get(string2)) == null) {
                            map2.put(string2, new ArrayList());
                        }
                    }
                    cursorF.moveToPosition(-1);
                    y.this.U(map);
                    y.this.T(map2);
                    ArrayList arrayList = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                        int i10 = cursorF.getInt(1);
                        d0 d0Var = d0.f76918a;
                        l0.c cVarF = d0.f(i10);
                        androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                        int i11 = cursorF.getInt(3);
                        int i12 = cursorF.getInt(4);
                        long j10 = cursorF.getLong(13);
                        long j11 = cursorF.getLong(14);
                        long j12 = cursorF.getLong(15);
                        androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                        long j13 = cursorF.getLong(17);
                        long j14 = cursorF.getLong(18);
                        int i13 = cursorF.getInt(19);
                        long j15 = cursorF.getLong(20);
                        int i14 = cursorF.getInt(21);
                        androidx.work.e eVar = new androidx.work.e(d0.d(cursorF.getInt(5)), cursorF.getInt(6) != 0, cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getLong(10), cursorF.getLong(11), d0.b(cursorF.isNull(12) ? null : cursorF.getBlob(12)));
                        ArrayList arrayList2 = (ArrayList) map.get(cursorF.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = (ArrayList) map2.get(cursorF.getString(0));
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList.add(new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i11, aVarC, j13, j14, i13, i12, j15, i14, arrayList2, arrayList3));
                    }
                    y.this.f77041a.setTransactionSuccessful();
                    cursorF.close();
                    y.this.f77041a.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                y.this.f77041a.endTransaction();
                throw th3;
            }
        }

        protected void finalize() {
            this.f77080a.release();
        }
    }

    class q implements Callable<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f77082a;

        q(final f2 val$_statement) {
            this.f77082a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            Cursor cursorF = androidx.room.util.b.f(y.this.f77041a, this.f77082a, false, null);
            try {
                return Long.valueOf(cursorF.moveToFirst() ? cursorF.getLong(0) : 0L);
            } finally {
                cursorF.close();
            }
        }

        protected void finalize() {
            this.f77082a.release();
        }
    }

    class r extends androidx.room.v<androidx.work.impl.model.v> {
        r(b2 database) {
            super(database);
        }

        @Override // androidx.room.v, androidx.room.m2
        public String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.v
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(w3.i iVar, androidx.work.impl.model.v vVar) throws Throwable {
            String str = vVar.f76983a;
            if (str == null) {
                iVar.J7(1);
            } else {
                iVar.H5(1, str);
            }
            d0 d0Var = d0.f76918a;
            iVar.G6(2, d0.j(vVar.f76984b));
            String str2 = vVar.f76985c;
            if (str2 == null) {
                iVar.J7(3);
            } else {
                iVar.H5(3, str2);
            }
            String str3 = vVar.f76986d;
            if (str3 == null) {
                iVar.J7(4);
            } else {
                iVar.H5(4, str3);
            }
            byte[] bArrF = androidx.work.h.F(vVar.f76987e);
            if (bArrF == null) {
                iVar.J7(5);
            } else {
                iVar.Q6(5, bArrF);
            }
            byte[] bArrF2 = androidx.work.h.F(vVar.f76988f);
            if (bArrF2 == null) {
                iVar.J7(6);
            } else {
                iVar.Q6(6, bArrF2);
            }
            iVar.G6(7, vVar.f76989g);
            iVar.G6(8, vVar.f76990h);
            iVar.G6(9, vVar.f76991i);
            iVar.G6(10, vVar.f76993k);
            iVar.G6(11, d0.a(vVar.f76994l));
            iVar.G6(12, vVar.f76995m);
            iVar.G6(13, vVar.f76996n);
            iVar.G6(14, vVar.f76997o);
            iVar.G6(15, vVar.f76998p);
            iVar.G6(16, vVar.f76999q ? 1L : 0L);
            iVar.G6(17, d0.h(vVar.f77000r));
            iVar.G6(18, vVar.F());
            iVar.G6(19, vVar.C());
            iVar.G6(20, vVar.D());
            iVar.G6(21, vVar.E());
            iVar.G6(22, vVar.G());
            androidx.work.e eVar = vVar.f76992j;
            if (eVar != null) {
                iVar.G6(23, d0.g(eVar.d()));
                iVar.G6(24, eVar.g() ? 1L : 0L);
                iVar.G6(25, eVar.h() ? 1L : 0L);
                iVar.G6(26, eVar.f() ? 1L : 0L);
                iVar.G6(27, eVar.i() ? 1L : 0L);
                iVar.G6(28, eVar.b());
                iVar.G6(29, eVar.a());
                byte[] bArrI = d0.i(eVar.c());
                if (bArrI == null) {
                    iVar.J7(30);
                } else {
                    iVar.Q6(30, bArrI);
                }
            } else {
                iVar.J7(23);
                iVar.J7(24);
                iVar.J7(25);
                iVar.J7(26);
                iVar.J7(27);
                iVar.J7(28);
                iVar.J7(29);
                iVar.J7(30);
            }
            String str4 = vVar.f76983a;
            if (str4 == null) {
                iVar.J7(31);
            } else {
                iVar.H5(31, str4);
            }
        }
    }

    class s extends m2 {
        s(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class t extends m2 {
        t(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class u extends m2 {
        u(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    class v extends m2 {
        v(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class w extends m2 {
        w(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class x extends m2 {
        x(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.model.y$y, reason: collision with other inner class name */
    class C0786y extends m2 {
        C0786y(b2 database) {
            super(database);
        }

        @Override // androidx.room.m2
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public y(b2 __db) {
        this.f77041a = __db;
        this.f77042b = new k(__db);
        this.f77043c = new r(__db);
        this.f77044d = new s(__db);
        this.f77045e = new t(__db);
        this.f77046f = new u(__db);
        this.f77047g = new v(__db);
        this.f77048h = new w(__db);
        this.f77049i = new x(__db);
        this.f77050j = new C0786y(__db);
        this.f77051k = new a(__db);
        this.f77052l = new b(__db);
        this.f77053m = new c(__db);
        this.f77054n = new d(__db);
        this.f77055o = new e(__db);
        this.f77056p = new f(__db);
        this.f77057q = new g(__db);
        this.f77058r = new h(__db);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(final HashMap<String, ArrayList<androidx.work.h>> _map) {
        int i10;
        Set<String> setKeySet = _map.keySet();
        if (!setKeySet.isEmpty()) {
            if (_map.size() <= 999) {
                StringBuilder sbD = androidx.room.util.f.d();
                sbD.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
                int size = setKeySet.size();
                androidx.room.util.f.a(sbD, size);
                sbD.append(")");
                f2 f2VarD = f2.d(sbD.toString(), size);
                int i11 = 1;
                for (String str : setKeySet) {
                    if (str == null) {
                        f2VarD.J7(i11);
                    } else {
                        f2VarD.H5(i11, str);
                    }
                    i11++;
                }
                Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
                try {
                    int iD = androidx.room.util.a.d(cursorF, "work_spec_id");
                    if (iD == -1) {
                        cursorF.close();
                        return;
                    }
                    while (cursorF.moveToNext()) {
                        ArrayList<androidx.work.h> arrayList = _map.get(cursorF.getString(iD));
                        if (arrayList != null) {
                            arrayList.add(androidx.work.h.m(cursorF.isNull(0) ? null : cursorF.getBlob(0)));
                        }
                    }
                    cursorF.close();
                    return;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            }
            HashMap<String, ArrayList<androidx.work.h>> map = new HashMap<>(999);
            Iterator<String> it = setKeySet.iterator();
            loop0: while (true) {
                i10 = 0;
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String next = it.next();
                    map.put(next, _map.get(next));
                    i10++;
                } while (i10 != 999);
                T(map);
                map = new HashMap<>(999);
            }
            if (i10 > 0) {
                T(map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(final HashMap<String, ArrayList<String>> _map) {
        int i10;
        Set<String> setKeySet = _map.keySet();
        if (!setKeySet.isEmpty()) {
            if (_map.size() <= 999) {
                StringBuilder sbD = androidx.room.util.f.d();
                sbD.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
                int size = setKeySet.size();
                androidx.room.util.f.a(sbD, size);
                sbD.append(")");
                f2 f2VarD = f2.d(sbD.toString(), size);
                int i11 = 1;
                for (String str : setKeySet) {
                    if (str == null) {
                        f2VarD.J7(i11);
                    } else {
                        f2VarD.H5(i11, str);
                    }
                    i11++;
                }
                Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
                try {
                    int iD = androidx.room.util.a.d(cursorF, "work_spec_id");
                    if (iD == -1) {
                        cursorF.close();
                        return;
                    }
                    while (cursorF.moveToNext()) {
                        ArrayList<String> arrayList = _map.get(cursorF.getString(iD));
                        if (arrayList != null) {
                            arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
                        }
                    }
                    cursorF.close();
                    return;
                } catch (Throwable th2) {
                    cursorF.close();
                    throw th2;
                }
            }
            HashMap<String, ArrayList<String>> map = new HashMap<>(999);
            Iterator<String> it = setKeySet.iterator();
            loop0: while (true) {
                i10 = 0;
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String next = it.next();
                    map.put(next, _map.get(next));
                    i10++;
                } while (i10 != 999);
                U(map);
                map = new HashMap<>(999);
            }
            if (i10 > 0) {
                U(map);
            }
        }
    }

    public static List<Class<?>> Y() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.w
    public int A() {
        f2 f2VarD = f2.d("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            int i10 = cursorF.moveToFirst() ? cursorF.getInt(0) : 0;
            cursorF.close();
            return i10;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // androidx.work.impl.model.w
    public void B(final String id2, final int overrideGeneration) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77053m.acquire();
        if (id2 == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, id2);
        }
        iVarAcquire.G6(2, overrideGeneration);
        this.f77041a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77053m.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77053m.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public List<String> C() {
        f2 f2VarD = f2.d("SELECT id FROM workspec", 0);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            cursorF.close();
            return arrayList;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // androidx.work.impl.model.w
    public void D(final String id2) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77047g.acquire();
        if (id2 == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, id2);
        }
        this.f77041a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77047g.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77047g.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v> E(final long startingAt) throws Throwable {
        f2 f2Var;
        f2 f2VarD = f2.d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        f2VarD.G6(1, startingAt);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, MetricTracker.Object.INPUT);
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            f2Var = f2VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "next_schedule_time_override");
                int iE21 = androidx.room.util.a.e(cursorF, "next_schedule_time_override_generation");
                int iE22 = androidx.room.util.a.e(cursorF, androidx.media3.exoplayer.offline.u.Z);
                int iE23 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE25 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE26 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE27 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE28 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE29 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE30 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i11 = cursorF.getInt(iE2);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i11);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.h hVarM2 = androidx.work.h.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i12 = cursorF.getInt(iE10);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i13 = i10;
                    long j15 = cursorF.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j16 = cursorF.getLong(i15);
                    iE15 = i15;
                    int i16 = iE16;
                    boolean z10 = cursorF.getInt(i16) != 0;
                    iE16 = i16;
                    int i17 = iE17;
                    androidx.work.c0 c0VarE = d0.e(cursorF.getInt(i17));
                    iE17 = i17;
                    int i18 = iE18;
                    int i19 = cursorF.getInt(i18);
                    iE18 = i18;
                    int i20 = iE19;
                    int i21 = cursorF.getInt(i20);
                    iE19 = i20;
                    int i22 = iE20;
                    long j17 = cursorF.getLong(i22);
                    iE20 = i22;
                    int i23 = iE21;
                    int i24 = cursorF.getInt(i23);
                    iE21 = i23;
                    int i25 = iE22;
                    int i26 = cursorF.getInt(i25);
                    iE22 = i25;
                    int i27 = iE23;
                    androidx.work.w wVarD = d0.d(cursorF.getInt(i27));
                    iE23 = i27;
                    int i28 = iE24;
                    boolean z11 = cursorF.getInt(i28) != 0;
                    iE24 = i28;
                    int i29 = iE25;
                    boolean z12 = cursorF.getInt(i29) != 0;
                    iE25 = i29;
                    int i30 = iE26;
                    boolean z13 = cursorF.getInt(i30) != 0;
                    iE26 = i30;
                    int i31 = iE27;
                    boolean z14 = cursorF.getInt(i31) != 0;
                    iE27 = i31;
                    int i32 = iE28;
                    long j18 = cursorF.getLong(i32);
                    iE28 = i32;
                    int i33 = iE29;
                    long j19 = cursorF.getLong(i33);
                    iE29 = i33;
                    int i34 = iE30;
                    iE30 = i34;
                    arrayList.add(new androidx.work.impl.model.v(string, cVarF, string2, string3, hVarM, hVarM2, j10, j11, j12, new androidx.work.e(wVarD, z11, z12, z13, z14, j18, j19, d0.b(cursorF.isNull(i34) ? null : cursorF.getBlob(i34))), i12, aVarC, j13, j14, j15, j16, z10, c0VarE, i19, i21, j17, i24, i26));
                    iE = i14;
                    i10 = i13;
                }
                cursorF.close();
                f2Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                f2Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f2Var = f2VarD;
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v> F() throws Throwable {
        f2 f2Var;
        f2 f2VarD = f2.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, MetricTracker.Object.INPUT);
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            f2Var = f2VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "next_schedule_time_override");
                int iE21 = androidx.room.util.a.e(cursorF, "next_schedule_time_override_generation");
                int iE22 = androidx.room.util.a.e(cursorF, androidx.media3.exoplayer.offline.u.Z);
                int iE23 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE25 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE26 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE27 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE28 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE29 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE30 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i11 = cursorF.getInt(iE2);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i11);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.h hVarM2 = androidx.work.h.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i12 = cursorF.getInt(iE10);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i13 = i10;
                    long j15 = cursorF.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j16 = cursorF.getLong(i15);
                    iE15 = i15;
                    int i16 = iE16;
                    boolean z10 = cursorF.getInt(i16) != 0;
                    iE16 = i16;
                    int i17 = iE17;
                    androidx.work.c0 c0VarE = d0.e(cursorF.getInt(i17));
                    iE17 = i17;
                    int i18 = iE18;
                    int i19 = cursorF.getInt(i18);
                    iE18 = i18;
                    int i20 = iE19;
                    int i21 = cursorF.getInt(i20);
                    iE19 = i20;
                    int i22 = iE20;
                    long j17 = cursorF.getLong(i22);
                    iE20 = i22;
                    int i23 = iE21;
                    int i24 = cursorF.getInt(i23);
                    iE21 = i23;
                    int i25 = iE22;
                    int i26 = cursorF.getInt(i25);
                    iE22 = i25;
                    int i27 = iE23;
                    androidx.work.w wVarD = d0.d(cursorF.getInt(i27));
                    iE23 = i27;
                    int i28 = iE24;
                    boolean z11 = cursorF.getInt(i28) != 0;
                    iE24 = i28;
                    int i29 = iE25;
                    boolean z12 = cursorF.getInt(i29) != 0;
                    iE25 = i29;
                    int i30 = iE26;
                    boolean z13 = cursorF.getInt(i30) != 0;
                    iE26 = i30;
                    int i31 = iE27;
                    boolean z14 = cursorF.getInt(i31) != 0;
                    iE27 = i31;
                    int i32 = iE28;
                    long j18 = cursorF.getLong(i32);
                    iE28 = i32;
                    int i33 = iE29;
                    long j19 = cursorF.getLong(i33);
                    iE29 = i33;
                    int i34 = iE30;
                    iE30 = i34;
                    arrayList.add(new androidx.work.impl.model.v(string, cVarF, string2, string3, hVarM, hVarM2, j10, j11, j12, new androidx.work.e(wVarD, z11, z12, z13, z14, j18, j19, d0.b(cursorF.isNull(i34) ? null : cursorF.getBlob(i34))), i12, aVarC, j13, j14, j15, j16, z10, c0VarE, i19, i21, j17, i24, i26));
                    iE = i14;
                    i10 = i13;
                }
                cursorF.close();
                f2Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                f2Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f2Var = f2VarD;
        }
    }

    @Override // androidx.work.impl.model.w
    public androidx.work.impl.model.v.c G(String str) {
        f2 f2VarD = f2.d("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        if (str == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, str);
        }
        this.f77041a.assertNotSuspendingTransaction();
        this.f77041a.beginTransaction();
        try {
            androidx.work.impl.model.v.c cVar = null;
            byte[] blob = null;
            Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<androidx.work.h>> map2 = new HashMap<>();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(0);
                    if (map.get(string) == null) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorF.getString(0);
                    if (map2.get(string2) == null) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorF.moveToPosition(-1);
                U(map);
                T(map2);
                if (cursorF.moveToFirst()) {
                    String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                    int i10 = cursorF.getInt(1);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i10);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                    int i11 = cursorF.getInt(3);
                    int i12 = cursorF.getInt(4);
                    long j10 = cursorF.getLong(13);
                    long j11 = cursorF.getLong(14);
                    long j12 = cursorF.getLong(15);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                    long j13 = cursorF.getLong(17);
                    long j14 = cursorF.getLong(18);
                    int i13 = cursorF.getInt(19);
                    long j15 = cursorF.getLong(20);
                    int i14 = cursorF.getInt(21);
                    androidx.work.w wVarD = d0.d(cursorF.getInt(5));
                    boolean z10 = cursorF.getInt(6) != 0;
                    boolean z11 = cursorF.getInt(7) != 0;
                    boolean z12 = cursorF.getInt(8) != 0;
                    boolean z13 = cursorF.getInt(9) != 0;
                    long j16 = cursorF.getLong(10);
                    long j17 = cursorF.getLong(11);
                    if (!cursorF.isNull(12)) {
                        blob = cursorF.getBlob(12);
                    }
                    androidx.work.e eVar = new androidx.work.e(wVarD, z10, z11, z12, z13, j16, j17, d0.b(blob));
                    ArrayList<String> arrayList = map.get(cursorF.getString(0));
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<androidx.work.h> arrayList2 = map2.get(cursorF.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    cVar = new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i11, aVarC, j13, j14, i13, i12, j15, i14, arrayList, arrayList2);
                }
                this.f77041a.setTransactionSuccessful();
                cursorF.close();
                f2VarD.release();
                this.f77041a.endTransaction();
                return cVar;
            } catch (Throwable th2) {
                cursorF.close();
                f2VarD.release();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f77041a.endTransaction();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.w
    public androidx.work.impl.model.v H(final String id2) throws Throwable {
        f2 f2Var;
        androidx.work.impl.model.v vVar;
        f2 f2VarD = f2.d("SELECT * FROM workspec WHERE id=?", 1);
        if (id2 == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, id2);
        }
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, MetricTracker.Object.INPUT);
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            f2Var = f2VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "next_schedule_time_override");
                int iE21 = androidx.room.util.a.e(cursorF, "next_schedule_time_override_generation");
                int iE22 = androidx.room.util.a.e(cursorF, androidx.media3.exoplayer.offline.u.Z);
                int iE23 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE25 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE26 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE27 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE28 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE29 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE30 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                if (cursorF.moveToFirst()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i10 = cursorF.getInt(iE2);
                    d0 d0Var = d0.f76918a;
                    vVar = new androidx.work.impl.model.v(string, d0.f(i10), cursorF.isNull(iE3) ? null : cursorF.getString(iE3), cursorF.isNull(iE4) ? null : cursorF.getString(iE4), androidx.work.h.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5)), androidx.work.h.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6)), cursorF.getLong(iE7), cursorF.getLong(iE8), cursorF.getLong(iE9), new androidx.work.e(d0.d(cursorF.getInt(iE23)), cursorF.getInt(iE24) != 0, cursorF.getInt(iE25) != 0, cursorF.getInt(iE26) != 0, cursorF.getInt(iE27) != 0, cursorF.getLong(iE28), cursorF.getLong(iE29), d0.b(cursorF.isNull(iE30) ? null : cursorF.getBlob(iE30))), cursorF.getInt(iE10), d0.c(cursorF.getInt(iE11)), cursorF.getLong(iE12), cursorF.getLong(iE13), cursorF.getLong(iE14), cursorF.getLong(iE15), cursorF.getInt(iE16) != 0, d0.e(cursorF.getInt(iE17)), cursorF.getInt(iE18), cursorF.getInt(iE19), cursorF.getLong(iE20), cursorF.getInt(iE21), cursorF.getInt(iE22));
                } else {
                    vVar = null;
                }
                cursorF.close();
                f2Var.release();
                return vVar;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                f2Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f2Var = f2VarD;
        }
    }

    @Override // androidx.work.impl.model.w
    public w0<Long> I(final String id2) {
        f2 f2VarD = f2.d("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (id2 == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, id2);
        }
        return this.f77041a.getInvalidationTracker().f(new String[]{"workspec"}, false, new q(f2VarD));
    }

    @Override // androidx.work.impl.model.w
    public int J() {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77055o.acquire();
        this.f77041a.beginTransaction();
        try {
            int iJ2 = iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77055o.release(iVarAcquire);
            return iJ2;
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77055o.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public int K(final String id2, final long startTime) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77054n.acquire();
        iVarAcquire.G6(1, startTime);
        if (id2 == null) {
            iVarAcquire.J7(2);
        } else {
            iVarAcquire.H5(2, id2);
        }
        this.f77041a.beginTransaction();
        try {
            int iJ2 = iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77054n.release(iVarAcquire);
            return iJ2;
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77054n.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v.b> L(final String name) {
        f2 f2VarD = f2.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, name);
        }
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                String string = cursorF.isNull(0) ? null : cursorF.getString(0);
                int i10 = cursorF.getInt(1);
                d0 d0Var = d0.f76918a;
                arrayList.add(new androidx.work.impl.model.v.b(string, d0.f(i10)));
            }
            cursorF.close();
            f2VarD.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v> M(final int schedulerLimit) throws Throwable {
        f2 f2Var;
        f2 f2VarD = f2.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        f2VarD.G6(1, schedulerLimit);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, MetricTracker.Object.INPUT);
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            f2Var = f2VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "next_schedule_time_override");
                int iE21 = androidx.room.util.a.e(cursorF, "next_schedule_time_override_generation");
                int iE22 = androidx.room.util.a.e(cursorF, androidx.media3.exoplayer.offline.u.Z);
                int iE23 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE25 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE26 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE27 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE28 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE29 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE30 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i11 = cursorF.getInt(iE2);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i11);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.h hVarM2 = androidx.work.h.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i12 = cursorF.getInt(iE10);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i13 = i10;
                    long j15 = cursorF.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j16 = cursorF.getLong(i15);
                    iE15 = i15;
                    int i16 = iE16;
                    boolean z10 = cursorF.getInt(i16) != 0;
                    iE16 = i16;
                    int i17 = iE17;
                    androidx.work.c0 c0VarE = d0.e(cursorF.getInt(i17));
                    iE17 = i17;
                    int i18 = iE18;
                    int i19 = cursorF.getInt(i18);
                    iE18 = i18;
                    int i20 = iE19;
                    int i21 = cursorF.getInt(i20);
                    iE19 = i20;
                    int i22 = iE20;
                    long j17 = cursorF.getLong(i22);
                    iE20 = i22;
                    int i23 = iE21;
                    int i24 = cursorF.getInt(i23);
                    iE21 = i23;
                    int i25 = iE22;
                    int i26 = cursorF.getInt(i25);
                    iE22 = i25;
                    int i27 = iE23;
                    androidx.work.w wVarD = d0.d(cursorF.getInt(i27));
                    iE23 = i27;
                    int i28 = iE24;
                    boolean z11 = cursorF.getInt(i28) != 0;
                    iE24 = i28;
                    int i29 = iE25;
                    boolean z12 = cursorF.getInt(i29) != 0;
                    iE25 = i29;
                    int i30 = iE26;
                    boolean z13 = cursorF.getInt(i30) != 0;
                    iE26 = i30;
                    int i31 = iE27;
                    boolean z14 = cursorF.getInt(i31) != 0;
                    iE27 = i31;
                    int i32 = iE28;
                    long j18 = cursorF.getLong(i32);
                    iE28 = i32;
                    int i33 = iE29;
                    long j19 = cursorF.getLong(i33);
                    iE29 = i33;
                    int i34 = iE30;
                    iE30 = i34;
                    arrayList.add(new androidx.work.impl.model.v(string, cVarF, string2, string3, hVarM, hVarM2, j10, j11, j12, new androidx.work.e(wVarD, z11, z12, z13, z14, j18, j19, d0.b(cursorF.isNull(i34) ? null : cursorF.getBlob(i34))), i12, aVarC, j13, j14, j15, j16, z10, c0VarE, i19, i21, j17, i24, i26));
                    iE = i14;
                    i10 = i13;
                }
                cursorF.close();
                f2Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                f2Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f2Var = f2VarD;
        }
    }

    @Override // androidx.work.impl.model.w
    public void N(final String id2, final androidx.work.h output) throws Throwable {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77048h.acquire();
        byte[] bArrF = androidx.work.h.F(output);
        if (bArrF == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.Q6(1, bArrF);
        }
        if (id2 == null) {
            iVarAcquire.J7(2);
        } else {
            iVarAcquire.H5(2, id2);
        }
        this.f77041a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77048h.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77048h.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v> O() throws Throwable {
        f2 f2Var;
        f2 f2VarD = f2.d("SELECT * FROM workspec WHERE state=1", 0);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, MetricTracker.Object.INPUT);
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            f2Var = f2VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "next_schedule_time_override");
                int iE21 = androidx.room.util.a.e(cursorF, "next_schedule_time_override_generation");
                int iE22 = androidx.room.util.a.e(cursorF, androidx.media3.exoplayer.offline.u.Z);
                int iE23 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE25 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE26 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE27 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE28 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE29 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE30 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i11 = cursorF.getInt(iE2);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i11);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.h hVarM2 = androidx.work.h.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i12 = cursorF.getInt(iE10);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i13 = i10;
                    long j15 = cursorF.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j16 = cursorF.getLong(i15);
                    iE15 = i15;
                    int i16 = iE16;
                    boolean z10 = cursorF.getInt(i16) != 0;
                    iE16 = i16;
                    int i17 = iE17;
                    androidx.work.c0 c0VarE = d0.e(cursorF.getInt(i17));
                    iE17 = i17;
                    int i18 = iE18;
                    int i19 = cursorF.getInt(i18);
                    iE18 = i18;
                    int i20 = iE19;
                    int i21 = cursorF.getInt(i20);
                    iE19 = i20;
                    int i22 = iE20;
                    long j17 = cursorF.getLong(i22);
                    iE20 = i22;
                    int i23 = iE21;
                    int i24 = cursorF.getInt(i23);
                    iE21 = i23;
                    int i25 = iE22;
                    int i26 = cursorF.getInt(i25);
                    iE22 = i25;
                    int i27 = iE23;
                    androidx.work.w wVarD = d0.d(cursorF.getInt(i27));
                    iE23 = i27;
                    int i28 = iE24;
                    boolean z11 = cursorF.getInt(i28) != 0;
                    iE24 = i28;
                    int i29 = iE25;
                    boolean z12 = cursorF.getInt(i29) != 0;
                    iE25 = i29;
                    int i30 = iE26;
                    boolean z13 = cursorF.getInt(i30) != 0;
                    iE26 = i30;
                    int i31 = iE27;
                    boolean z14 = cursorF.getInt(i31) != 0;
                    iE27 = i31;
                    int i32 = iE28;
                    long j18 = cursorF.getLong(i32);
                    iE28 = i32;
                    int i33 = iE29;
                    long j19 = cursorF.getLong(i33);
                    iE29 = i33;
                    int i34 = iE30;
                    iE30 = i34;
                    arrayList.add(new androidx.work.impl.model.v(string, cVarF, string2, string3, hVarM, hVarM2, j10, j11, j12, new androidx.work.e(wVarD, z11, z12, z13, z14, j18, j19, d0.b(cursorF.isNull(i34) ? null : cursorF.getBlob(i34))), i12, aVarC, j13, j14, j15, j16, z10, c0VarE, i19, i21, j17, i24, i26));
                    iE = i14;
                    i10 = i13;
                }
                cursorF.close();
                f2Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                f2Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f2Var = f2VarD;
        }
    }

    @Override // androidx.work.impl.model.w
    public kotlinx.coroutines.flow.i<List<androidx.work.impl.model.v.c>> P(final String name) {
        f2 f2VarD = f2.d("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, name);
        }
        return androidx.room.j.a(this.f77041a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new p(f2VarD));
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v.c> Q(final String tag) {
        f2 f2VarD = f2.d("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, tag);
        }
        this.f77041a.assertNotSuspendingTransaction();
        this.f77041a.beginTransaction();
        try {
            Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<androidx.work.h>> map2 = new HashMap<>();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(0);
                    if (map.get(string) == null) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorF.getString(0);
                    if (map2.get(string2) == null) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorF.moveToPosition(-1);
                U(map);
                T(map2);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                    int i10 = cursorF.getInt(1);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i10);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                    int i11 = cursorF.getInt(3);
                    int i12 = cursorF.getInt(4);
                    long j10 = cursorF.getLong(13);
                    long j11 = cursorF.getLong(14);
                    long j12 = cursorF.getLong(15);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                    long j13 = cursorF.getLong(17);
                    long j14 = cursorF.getLong(18);
                    int i13 = cursorF.getInt(19);
                    long j15 = cursorF.getLong(20);
                    int i14 = cursorF.getInt(21);
                    androidx.work.e eVar = new androidx.work.e(d0.d(cursorF.getInt(5)), cursorF.getInt(6) != 0, cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getLong(10), cursorF.getLong(11), d0.b(cursorF.isNull(12) ? null : cursorF.getBlob(12)));
                    ArrayList<String> arrayList2 = map.get(cursorF.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<androidx.work.h> arrayList3 = map2.get(cursorF.getString(0));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    arrayList.add(new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i11, aVarC, j13, j14, i13, i12, j15, i14, arrayList2, arrayList3));
                }
                this.f77041a.setTransactionSuccessful();
                cursorF.close();
                f2VarD.release();
                this.f77041a.endTransaction();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                f2VarD.release();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f77041a.endTransaction();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.w
    public int R(final String id2) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77050j.acquire();
        if (id2 == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, id2);
        }
        this.f77041a.beginTransaction();
        try {
            int iJ2 = iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            m2 m2Var = this.f77050j;
            return iJ2;
        } finally {
            this.f77041a.endTransaction();
            this.f77050j.release(iVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v.c> S(final List<String> ids) {
        StringBuilder sbD = androidx.room.util.f.d();
        sbD.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = ids.size();
        androidx.room.util.f.a(sbD, size);
        sbD.append(")");
        f2 f2VarD = f2.d(sbD.toString(), size);
        int i10 = 1;
        for (String str : ids) {
            if (str == null) {
                f2VarD.J7(i10);
            } else {
                f2VarD.H5(i10, str);
            }
            i10++;
        }
        this.f77041a.assertNotSuspendingTransaction();
        this.f77041a.beginTransaction();
        try {
            Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<androidx.work.h>> map2 = new HashMap<>();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(0);
                    if (map.get(string) == null) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorF.getString(0);
                    if (map2.get(string2) == null) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorF.moveToPosition(-1);
                U(map);
                T(map2);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                    int i11 = cursorF.getInt(1);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i11);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                    int i12 = cursorF.getInt(3);
                    int i13 = cursorF.getInt(4);
                    long j10 = cursorF.getLong(13);
                    long j11 = cursorF.getLong(14);
                    long j12 = cursorF.getLong(15);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                    long j13 = cursorF.getLong(17);
                    long j14 = cursorF.getLong(18);
                    int i14 = cursorF.getInt(19);
                    long j15 = cursorF.getLong(20);
                    int i15 = cursorF.getInt(21);
                    androidx.work.e eVar = new androidx.work.e(d0.d(cursorF.getInt(5)), cursorF.getInt(6) != 0, cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getLong(10), cursorF.getLong(11), d0.b(cursorF.isNull(12) ? null : cursorF.getBlob(12)));
                    ArrayList<String> arrayList2 = map.get(cursorF.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<androidx.work.h> arrayList3 = map2.get(cursorF.getString(0));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    arrayList.add(new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i12, aVarC, j13, j14, i14, i13, j15, i15, arrayList2, arrayList3));
                }
                this.f77041a.setTransactionSuccessful();
                cursorF.close();
                f2VarD.release();
                this.f77041a.endTransaction();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                f2VarD.release();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f77041a.endTransaction();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.w
    public void a(final String id2) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77044d.acquire();
        if (id2 == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, id2);
        }
        this.f77041a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            m2 m2Var = this.f77044d;
        } finally {
            this.f77041a.endTransaction();
            this.f77044d.release(iVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.w
    public void b(final String id2, final int stopReason) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77058r.acquire();
        iVarAcquire.G6(1, stopReason);
        if (id2 == null) {
            iVarAcquire.J7(2);
        } else {
            iVarAcquire.H5(2, id2);
        }
        this.f77041a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77058r.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77058r.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public void c(final androidx.work.impl.model.v workSpec) {
        this.f77041a.assertNotSuspendingTransaction();
        this.f77041a.beginTransaction();
        try {
            this.f77043c.d(workSpec);
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public void d() {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77056p.acquire();
        this.f77041a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77056p.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77056p.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public void e(final String id2) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77057q.acquire();
        if (id2 == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, id2);
        }
        this.f77041a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
        } finally {
            this.f77041a.endTransaction();
            this.f77057q.release(iVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.w
    public void f(final androidx.work.impl.model.v workSpec) {
        this.f77041a.assertNotSuspendingTransaction();
        this.f77041a.beginTransaction();
        try {
            this.f77042b.insert(workSpec);
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public void g(final String id2, final long nextScheduleTimeOverrideMillis) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77052l.acquire();
        iVarAcquire.G6(1, nextScheduleTimeOverrideMillis);
        if (id2 == null) {
            iVarAcquire.J7(2);
        } else {
            iVarAcquire.H5(2, id2);
        }
        this.f77041a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            b2 b2Var = this.f77041a;
        } finally {
            this.f77041a.endTransaction();
            this.f77052l.release(iVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.w
    public List<String> h(final String name) {
        f2 f2VarD = f2.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, name);
        }
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            cursorF.close();
            f2VarD.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public kotlinx.coroutines.flow.i<List<androidx.work.impl.model.v.c>> i(final List<String> ids) {
        StringBuilder sbD = androidx.room.util.f.d();
        sbD.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = ids.size();
        androidx.room.util.f.a(sbD, size);
        sbD.append(")");
        f2 f2VarD = f2.d(sbD.toString(), size);
        int i10 = 1;
        for (String str : ids) {
            if (str == null) {
                f2VarD.J7(i10);
            } else {
                f2VarD.H5(i10, str);
            }
            i10++;
        }
        return androidx.room.j.a(this.f77041a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new l(f2VarD));
    }

    @Override // androidx.work.impl.model.w
    public l0.c j(final String id2) {
        f2 f2VarD = f2.d("SELECT state FROM workspec WHERE id=?", 1);
        if (id2 == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, id2);
        }
        this.f77041a.assertNotSuspendingTransaction();
        l0.c cVarF = null;
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            if (cursorF.moveToFirst()) {
                Integer numValueOf = cursorF.isNull(0) ? null : Integer.valueOf(cursorF.getInt(0));
                if (numValueOf != null) {
                    d0 d0Var = d0.f76918a;
                    cVarF = d0.f(numValueOf.intValue());
                }
            }
            cursorF.close();
            f2VarD.release();
            return cVarF;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public int k(final String id2) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77046f.acquire();
        if (id2 == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, id2);
        }
        this.f77041a.beginTransaction();
        try {
            int iJ2 = iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            m2 m2Var = this.f77046f;
            return iJ2;
        } finally {
            this.f77041a.endTransaction();
            this.f77046f.release(iVarAcquire);
        }
    }

    @Override // androidx.work.impl.model.w
    public List<String> l(final String tag) {
        f2 f2VarD = f2.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, tag);
        }
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            return arrayList;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.h> m(final String id2) {
        f2 f2VarD = f2.d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (id2 == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, id2);
        }
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(androidx.work.h.m(cursorF.isNull(0) ? null : cursorF.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v.c> n(final String name) {
        f2 f2VarD = f2.d("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, name);
        }
        this.f77041a.assertNotSuspendingTransaction();
        this.f77041a.beginTransaction();
        try {
            Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<androidx.work.h>> map2 = new HashMap<>();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(0);
                    if (map.get(string) == null) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorF.getString(0);
                    if (map2.get(string2) == null) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorF.moveToPosition(-1);
                U(map);
                T(map2);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string3 = cursorF.isNull(0) ? null : cursorF.getString(0);
                    int i10 = cursorF.getInt(1);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i10);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(2) ? null : cursorF.getBlob(2));
                    int i11 = cursorF.getInt(3);
                    int i12 = cursorF.getInt(4);
                    long j10 = cursorF.getLong(13);
                    long j11 = cursorF.getLong(14);
                    long j12 = cursorF.getLong(15);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(16));
                    long j13 = cursorF.getLong(17);
                    long j14 = cursorF.getLong(18);
                    int i13 = cursorF.getInt(19);
                    long j15 = cursorF.getLong(20);
                    int i14 = cursorF.getInt(21);
                    androidx.work.e eVar = new androidx.work.e(d0.d(cursorF.getInt(5)), cursorF.getInt(6) != 0, cursorF.getInt(7) != 0, cursorF.getInt(8) != 0, cursorF.getInt(9) != 0, cursorF.getLong(10), cursorF.getLong(11), d0.b(cursorF.isNull(12) ? null : cursorF.getBlob(12)));
                    ArrayList<String> arrayList2 = map.get(cursorF.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<androidx.work.h> arrayList3 = map2.get(cursorF.getString(0));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    arrayList.add(new androidx.work.impl.model.v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i11, aVarC, j13, j14, i13, i12, j15, i14, arrayList2, arrayList3));
                }
                this.f77041a.setTransactionSuccessful();
                cursorF.close();
                f2VarD.release();
                this.f77041a.endTransaction();
                return arrayList;
            } catch (Throwable th2) {
                cursorF.close();
                f2VarD.release();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f77041a.endTransaction();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v> o(final int maxLimit) throws Throwable {
        f2 f2Var;
        f2 f2VarD = f2.d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        f2VarD.G6(1, maxLimit);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, MetricTracker.Object.INPUT);
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            f2Var = f2VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "next_schedule_time_override");
                int iE21 = androidx.room.util.a.e(cursorF, "next_schedule_time_override_generation");
                int iE22 = androidx.room.util.a.e(cursorF, androidx.media3.exoplayer.offline.u.Z);
                int iE23 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE25 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE26 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE27 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE28 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE29 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE30 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i11 = cursorF.getInt(iE2);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i11);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.h hVarM2 = androidx.work.h.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i12 = cursorF.getInt(iE10);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i13 = i10;
                    long j15 = cursorF.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j16 = cursorF.getLong(i15);
                    iE15 = i15;
                    int i16 = iE16;
                    boolean z10 = cursorF.getInt(i16) != 0;
                    iE16 = i16;
                    int i17 = iE17;
                    androidx.work.c0 c0VarE = d0.e(cursorF.getInt(i17));
                    iE17 = i17;
                    int i18 = iE18;
                    int i19 = cursorF.getInt(i18);
                    iE18 = i18;
                    int i20 = iE19;
                    int i21 = cursorF.getInt(i20);
                    iE19 = i20;
                    int i22 = iE20;
                    long j17 = cursorF.getLong(i22);
                    iE20 = i22;
                    int i23 = iE21;
                    int i24 = cursorF.getInt(i23);
                    iE21 = i23;
                    int i25 = iE22;
                    int i26 = cursorF.getInt(i25);
                    iE22 = i25;
                    int i27 = iE23;
                    androidx.work.w wVarD = d0.d(cursorF.getInt(i27));
                    iE23 = i27;
                    int i28 = iE24;
                    boolean z11 = cursorF.getInt(i28) != 0;
                    iE24 = i28;
                    int i29 = iE25;
                    boolean z12 = cursorF.getInt(i29) != 0;
                    iE25 = i29;
                    int i30 = iE26;
                    boolean z13 = cursorF.getInt(i30) != 0;
                    iE26 = i30;
                    int i31 = iE27;
                    boolean z14 = cursorF.getInt(i31) != 0;
                    iE27 = i31;
                    int i32 = iE28;
                    long j18 = cursorF.getLong(i32);
                    iE28 = i32;
                    int i33 = iE29;
                    long j19 = cursorF.getLong(i33);
                    iE29 = i33;
                    int i34 = iE30;
                    iE30 = i34;
                    arrayList.add(new androidx.work.impl.model.v(string, cVarF, string2, string3, hVarM, hVarM2, j10, j11, j12, new androidx.work.e(wVarD, z11, z12, z13, z14, j18, j19, d0.b(cursorF.isNull(i34) ? null : cursorF.getBlob(i34))), i12, aVarC, j13, j14, j15, j16, z10, c0VarE, i19, i21, j17, i24, i26));
                    iE = i14;
                    i10 = i13;
                }
                cursorF.close();
                f2Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                f2Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f2Var = f2VarD;
        }
    }

    @Override // androidx.work.impl.model.w
    public kotlinx.coroutines.flow.i<List<androidx.work.impl.model.v.c>> p(final String tag) {
        f2 f2VarD = f2.d("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, tag);
        }
        return androidx.room.j.a(this.f77041a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new m(f2VarD));
    }

    @Override // androidx.work.impl.model.w
    public int q(final l0.c state, final String id2) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77045e.acquire();
        d0 d0Var = d0.f76918a;
        iVarAcquire.G6(1, d0.j(state));
        int i10 = 7 ^ 2;
        if (id2 == null) {
            iVarAcquire.J7(2);
        } else {
            iVarAcquire.H5(2, id2);
        }
        this.f77041a.beginTransaction();
        try {
            int iJ2 = iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77045e.release(iVarAcquire);
            return iJ2;
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77045e.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public w0<List<String>> r() {
        return this.f77041a.getInvalidationTracker().f(new String[]{"workspec"}, true, new i(f2.d("SELECT id FROM workspec", 0)));
    }

    @Override // androidx.work.impl.model.w
    public w0<List<androidx.work.impl.model.v.c>> s(final String name) {
        f2 f2VarD = f2.d("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, name);
        }
        return this.f77041a.getInvalidationTracker().f(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new o(f2VarD));
    }

    @Override // androidx.work.impl.model.w
    public void t(final String id2, final long enqueueTime) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77049i.acquire();
        iVarAcquire.G6(1, enqueueTime);
        if (id2 == null) {
            iVarAcquire.J7(2);
        } else {
            iVarAcquire.H5(2, id2);
        }
        this.f77041a.beginTransaction();
        try {
            iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77049i.release(iVarAcquire);
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77049i.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public w0<List<androidx.work.impl.model.v.c>> u(final String tag) {
        f2 f2VarD = f2.d("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            f2VarD.J7(1);
        } else {
            f2VarD.H5(1, tag);
        }
        return this.f77041a.getInvalidationTracker().f(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new n(f2VarD));
    }

    @Override // androidx.work.impl.model.w
    public List<String> v() {
        f2 f2VarD = f2.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
            }
            cursorF.close();
            f2VarD.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorF.close();
            f2VarD.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public boolean w() {
        boolean z10 = false;
        f2 f2VarD = f2.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            if (cursorF.moveToFirst() && cursorF.getInt(0) != 0) {
                z10 = true;
            }
            cursorF.close();
            return z10;
        } finally {
            cursorF.close();
            f2VarD.release();
        }
    }

    @Override // androidx.work.impl.model.w
    public List<androidx.work.impl.model.v> x() throws Throwable {
        f2 f2Var;
        f2 f2VarD = f2.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f77041a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f77041a, f2VarD, false, null);
        try {
            int iE = androidx.room.util.a.e(cursorF, "id");
            int iE2 = androidx.room.util.a.e(cursorF, "state");
            int iE3 = androidx.room.util.a.e(cursorF, "worker_class_name");
            int iE4 = androidx.room.util.a.e(cursorF, "input_merger_class_name");
            int iE5 = androidx.room.util.a.e(cursorF, MetricTracker.Object.INPUT);
            int iE6 = androidx.room.util.a.e(cursorF, "output");
            int iE7 = androidx.room.util.a.e(cursorF, "initial_delay");
            int iE8 = androidx.room.util.a.e(cursorF, "interval_duration");
            int iE9 = androidx.room.util.a.e(cursorF, "flex_duration");
            int iE10 = androidx.room.util.a.e(cursorF, "run_attempt_count");
            int iE11 = androidx.room.util.a.e(cursorF, "backoff_policy");
            int iE12 = androidx.room.util.a.e(cursorF, "backoff_delay_duration");
            int iE13 = androidx.room.util.a.e(cursorF, "last_enqueue_time");
            int iE14 = androidx.room.util.a.e(cursorF, "minimum_retention_duration");
            f2Var = f2VarD;
            try {
                int iE15 = androidx.room.util.a.e(cursorF, "schedule_requested_at");
                int iE16 = androidx.room.util.a.e(cursorF, "run_in_foreground");
                int iE17 = androidx.room.util.a.e(cursorF, "out_of_quota_policy");
                int iE18 = androidx.room.util.a.e(cursorF, "period_count");
                int iE19 = androidx.room.util.a.e(cursorF, "generation");
                int iE20 = androidx.room.util.a.e(cursorF, "next_schedule_time_override");
                int iE21 = androidx.room.util.a.e(cursorF, "next_schedule_time_override_generation");
                int iE22 = androidx.room.util.a.e(cursorF, androidx.media3.exoplayer.offline.u.Z);
                int iE23 = androidx.room.util.a.e(cursorF, "required_network_type");
                int iE24 = androidx.room.util.a.e(cursorF, "requires_charging");
                int iE25 = androidx.room.util.a.e(cursorF, "requires_device_idle");
                int iE26 = androidx.room.util.a.e(cursorF, "requires_battery_not_low");
                int iE27 = androidx.room.util.a.e(cursorF, "requires_storage_not_low");
                int iE28 = androidx.room.util.a.e(cursorF, "trigger_content_update_delay");
                int iE29 = androidx.room.util.a.e(cursorF, "trigger_max_content_delay");
                int iE30 = androidx.room.util.a.e(cursorF, "content_uri_triggers");
                int i10 = iE14;
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string = cursorF.isNull(iE) ? null : cursorF.getString(iE);
                    int i11 = cursorF.getInt(iE2);
                    d0 d0Var = d0.f76918a;
                    l0.c cVarF = d0.f(i11);
                    String string2 = cursorF.isNull(iE3) ? null : cursorF.getString(iE3);
                    String string3 = cursorF.isNull(iE4) ? null : cursorF.getString(iE4);
                    androidx.work.h hVarM = androidx.work.h.m(cursorF.isNull(iE5) ? null : cursorF.getBlob(iE5));
                    androidx.work.h hVarM2 = androidx.work.h.m(cursorF.isNull(iE6) ? null : cursorF.getBlob(iE6));
                    long j10 = cursorF.getLong(iE7);
                    long j11 = cursorF.getLong(iE8);
                    long j12 = cursorF.getLong(iE9);
                    int i12 = cursorF.getInt(iE10);
                    androidx.work.a aVarC = d0.c(cursorF.getInt(iE11));
                    long j13 = cursorF.getLong(iE12);
                    long j14 = cursorF.getLong(iE13);
                    int i13 = i10;
                    long j15 = cursorF.getLong(i13);
                    int i14 = iE;
                    int i15 = iE15;
                    long j16 = cursorF.getLong(i15);
                    iE15 = i15;
                    int i16 = iE16;
                    boolean z10 = cursorF.getInt(i16) != 0;
                    iE16 = i16;
                    int i17 = iE17;
                    androidx.work.c0 c0VarE = d0.e(cursorF.getInt(i17));
                    iE17 = i17;
                    int i18 = iE18;
                    int i19 = cursorF.getInt(i18);
                    iE18 = i18;
                    int i20 = iE19;
                    int i21 = cursorF.getInt(i20);
                    iE19 = i20;
                    int i22 = iE20;
                    long j17 = cursorF.getLong(i22);
                    iE20 = i22;
                    int i23 = iE21;
                    int i24 = cursorF.getInt(i23);
                    iE21 = i23;
                    int i25 = iE22;
                    int i26 = cursorF.getInt(i25);
                    iE22 = i25;
                    int i27 = iE23;
                    androidx.work.w wVarD = d0.d(cursorF.getInt(i27));
                    iE23 = i27;
                    int i28 = iE24;
                    boolean z11 = cursorF.getInt(i28) != 0;
                    iE24 = i28;
                    int i29 = iE25;
                    boolean z12 = cursorF.getInt(i29) != 0;
                    iE25 = i29;
                    int i30 = iE26;
                    boolean z13 = cursorF.getInt(i30) != 0;
                    iE26 = i30;
                    int i31 = iE27;
                    boolean z14 = cursorF.getInt(i31) != 0;
                    iE27 = i31;
                    int i32 = iE28;
                    long j18 = cursorF.getLong(i32);
                    iE28 = i32;
                    int i33 = iE29;
                    long j19 = cursorF.getLong(i33);
                    iE29 = i33;
                    int i34 = iE30;
                    iE30 = i34;
                    arrayList.add(new androidx.work.impl.model.v(string, cVarF, string2, string3, hVarM, hVarM2, j10, j11, j12, new androidx.work.e(wVarD, z11, z12, z13, z14, j18, j19, d0.b(cursorF.isNull(i34) ? null : cursorF.getBlob(i34))), i12, aVarC, j13, j14, j15, j16, z10, c0VarE, i19, i21, j17, i24, i26));
                    iE = i14;
                    i10 = i13;
                }
                cursorF.close();
                f2Var.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorF.close();
                f2Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f2Var = f2VarD;
        }
    }

    @Override // androidx.work.impl.model.w
    public int y(final String id2) {
        this.f77041a.assertNotSuspendingTransaction();
        w3.i iVarAcquire = this.f77051k.acquire();
        if (id2 == null) {
            iVarAcquire.J7(1);
        } else {
            iVarAcquire.H5(1, id2);
        }
        this.f77041a.beginTransaction();
        try {
            int iJ2 = iVarAcquire.j2();
            this.f77041a.setTransactionSuccessful();
            this.f77041a.endTransaction();
            this.f77051k.release(iVarAcquire);
            return iJ2;
        } catch (Throwable th2) {
            this.f77041a.endTransaction();
            this.f77051k.release(iVarAcquire);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.w
    public w0<List<androidx.work.impl.model.v.c>> z(final List<String> ids) {
        StringBuilder sbD = androidx.room.util.f.d();
        sbD.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = ids.size();
        androidx.room.util.f.a(sbD, size);
        sbD.append(")");
        f2 f2VarD = f2.d(sbD.toString(), size);
        int i10 = 1;
        for (String str : ids) {
            if (str == null) {
                f2VarD.J7(i10);
            } else {
                f2VarD.H5(i10, str);
            }
            i10++;
        }
        return this.f77041a.getInvalidationTracker().f(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new j(f2VarD));
    }
}
