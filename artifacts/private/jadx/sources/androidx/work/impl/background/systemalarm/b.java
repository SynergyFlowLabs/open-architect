package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a0;
import androidx.work.impl.b0;
import androidx.work.impl.model.n;
import androidx.work.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b implements androidx.work.impl.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f76660f = v.i("CommandHandler");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f76661g = "ACTION_SCHEDULE_WORK";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f76662h = "ACTION_DELAY_MET";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f76663i = "ACTION_STOP_WORK";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f76664j = "ACTION_CONSTRAINTS_CHANGED";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f76665k = "ACTION_RESCHEDULE";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f76666l = "ACTION_EXECUTION_COMPLETED";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f76667m = "KEY_WORKSPEC_ID";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f76668n = "KEY_WORKSPEC_GENERATION";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f76669o = "KEY_NEEDS_RESCHEDULE";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final long f76670s = 600000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f76671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<n, f> f76672b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f76673c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.b f76674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0 f76675e;

    b(@NonNull Context context, androidx.work.b clock, @NonNull b0 startStopTokens) {
        this.f76671a = context;
        this.f76674d = clock;
        this.f76675e = startStopTokens;
    }

    static Intent a(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f76664j);
        return intent;
    }

    static Intent b(@NonNull Context context, @NonNull n id2) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f76662h);
        return s(intent, id2);
    }

    static Intent c(@NonNull Context context, @NonNull n id2, boolean needsReschedule) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f76666l);
        intent.putExtra(f76669o, needsReschedule);
        return s(intent, id2);
    }

    static Intent e(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f76665k);
        return intent;
    }

    static Intent f(@NonNull Context context, @NonNull n id2) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f76661g);
        return s(intent, id2);
    }

    static Intent g(@NonNull Context context, @NonNull n id2) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f76663i);
        return s(intent, id2);
    }

    static Intent h(@NonNull Context context, @NonNull String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(f76663i);
        intent.putExtra(f76667m, workSpecId);
        return intent;
    }

    private void i(@NonNull Intent intent, int startId, @NonNull g dispatcher) {
        v.e().a(f76660f, "Handling constraints changed " + intent);
        new c(this.f76671a, this.f76674d, startId, dispatcher).a();
    }

    private void j(@NonNull Intent intent, int startId, @NonNull g dispatcher) {
        synchronized (this.f76673c) {
            try {
                n nVarR = r(intent);
                v vVarE = v.e();
                String str = f76660f;
                vVarE.a(str, "Handing delay met for " + nVarR);
                if (this.f76672b.containsKey(nVarR)) {
                    v.e().a(str, "WorkSpec " + nVarR + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    f fVar = new f(this.f76671a, startId, dispatcher, this.f76675e.e(nVarR));
                    this.f76672b.put(nVarR, fVar);
                    fVar.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void k(@NonNull Intent intent, int startId) {
        n nVarR = r(intent);
        boolean z10 = intent.getExtras().getBoolean(f76669o);
        v.e().a(f76660f, "Handling onExecutionCompleted " + intent + ", " + startId);
        d(nVarR, z10);
    }

    private void l(@NonNull Intent intent, int startId, @NonNull g dispatcher) {
        v.e().a(f76660f, "Handling reschedule " + intent + ", " + startId);
        dispatcher.g().W();
    }

    private void m(@NonNull Intent intent, int startId, @NonNull g dispatcher) {
        n nVarR = r(intent);
        v vVarE = v.e();
        String str = f76660f;
        vVarE.a(str, "Handling schedule work for " + nVarR);
        WorkDatabase workDatabaseS = dispatcher.g().S();
        workDatabaseS.beginTransaction();
        try {
            androidx.work.impl.model.v vVarH = workDatabaseS.k().H(nVarR.f());
            if (vVarH == null) {
                v.e().l(str, "Skipping scheduling " + nVarR + " because it's no longer in the DB");
                workDatabaseS.endTransaction();
                return;
            }
            if (vVarH.f76984b.l()) {
                v.e().l(str, "Skipping scheduling " + nVarR + "because it is finished.");
                workDatabaseS.endTransaction();
                return;
            }
            long jC = vVarH.c();
            if (vVarH.H()) {
                v.e().a(str, "Opportunistically setting an alarm for " + nVarR + "at " + jC);
                a.c(this.f76671a, workDatabaseS, nVarR, jC);
                dispatcher.f().c().execute(new g.b(dispatcher, a(this.f76671a), startId));
            } else {
                v.e().a(str, "Setting up Alarms for " + nVarR + "at " + jC);
                a.c(this.f76671a, workDatabaseS, nVarR, jC);
            }
            workDatabaseS.setTransactionSuccessful();
            workDatabaseS.endTransaction();
        } catch (Throwable th2) {
            workDatabaseS.endTransaction();
            throw th2;
        }
    }

    private void n(@NonNull Intent intent, @NonNull g dispatcher) {
        List<a0> listD;
        Bundle extras = intent.getExtras();
        String string = extras.getString(f76667m);
        if (extras.containsKey(f76668n)) {
            int i10 = extras.getInt(f76668n);
            listD = new ArrayList<>(1);
            a0 a0VarB = this.f76675e.b(new n(string, i10));
            if (a0VarB != null) {
                listD.add(a0VarB);
            }
        } else {
            listD = this.f76675e.d(string);
        }
        for (a0 a0Var : listD) {
            v.e().a(f76660f, "Handing stopWork work for " + string);
            dispatcher.i().e(a0Var);
            a.a(this.f76671a, dispatcher.g().S(), a0Var.a());
            dispatcher.d(a0Var.a(), false);
        }
    }

    private static boolean o(@p0 Bundle bundle, @NonNull String... keys) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : keys) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static n r(@NonNull Intent intent) {
        return new n(intent.getStringExtra(f76667m), intent.getIntExtra(f76668n, 0));
    }

    private static Intent s(@NonNull Intent intent, @NonNull n id2) {
        intent.putExtra(f76667m, id2.f());
        intent.putExtra(f76668n, id2.e());
        return intent;
    }

    @Override // androidx.work.impl.f
    public void d(@NonNull n id2, boolean needsReschedule) {
        synchronized (this.f76673c) {
            try {
                f fVarRemove = this.f76672b.remove(id2);
                this.f76675e.b(id2);
                if (fVarRemove != null) {
                    fVarRemove.g(needsReschedule);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean p() {
        boolean z10;
        synchronized (this.f76673c) {
            try {
                z10 = !this.f76672b.isEmpty();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @m1
    void q(@NonNull Intent intent, int startId, @NonNull g dispatcher) {
        String action = intent.getAction();
        if (f76664j.equals(action)) {
            i(intent, startId, dispatcher);
            return;
        }
        if (f76665k.equals(action)) {
            l(intent, startId, dispatcher);
            return;
        }
        if (!o(intent.getExtras(), f76667m)) {
            v.e().c(f76660f, "Invalid request for " + action + " , requires " + f76667m + " .");
            return;
        }
        if (f76661g.equals(action)) {
            m(intent, startId, dispatcher);
            return;
        }
        if (f76662h.equals(action)) {
            j(intent, startId, dispatcher);
            return;
        }
        if (f76663i.equals(action)) {
            n(intent, dispatcher);
            return;
        }
        if (f76666l.equals(action)) {
            k(intent, startId);
            return;
        }
        v.e().l(f76660f, "Ignoring intent " + intent);
    }
}
