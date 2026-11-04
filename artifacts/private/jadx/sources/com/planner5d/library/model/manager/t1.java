package com.planner5d.library.model.manager;

import androidx.annotation.NonNull;
import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import com.planner5d.library.model.LogRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class t1 extends v<LogRecord> implements u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.api.requests.c f222229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fg.e<com.planner5d.library.modules.user.user.t> f222230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.application.d f222231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.application.b f222232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c1 f222233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.crashreporting.l> f222234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.config.j> f222235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.planner5d.library.services.utility.g3 f222236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<LogRecord> f222237m = new ArrayList();

    @ij.a
    public t1(com.planner5d.library.api.requests.c cVar, fg.e<com.planner5d.library.modules.user.user.t> eVar, com.planner5d.library.application.d dVar, com.planner5d.library.application.b bVar, c1 c1Var, fg.e<com.planner5d.library.model.manager.crashreporting.l> eVar2, fg.e<com.planner5d.library.model.manager.config.j> eVar3, com.planner5d.library.services.utility.g3 g3Var) {
        this.f222229e = cVar;
        this.f222230f = eVar;
        this.f222231g = dVar;
        this.f222232h = bVar;
        this.f222233i = c1Var;
        this.f222234j = eVar2;
        this.f222235k = eVar3;
        this.f222236l = g3Var;
    }

    @androidx.annotation.m1
    private void A() {
        new Delete().from(j()).where("posted = 1 AND (date_until_next_record = NULL OR date_until_next_record < ?)", Long.valueOf(this.f222236l.currentTimeMillis())).execute();
    }

    @NonNull
    private String C(@NonNull LogRecord logRecord, boolean z10) {
        String str;
        if (E(logRecord)) {
            String str2 = logRecord.data;
            return str2 == null ? "" : str2;
        }
        LinkedList linkedList = new LinkedList();
        String str3 = logRecord.installationHash;
        if (str3 != null) {
            linkedList.add(str3);
        }
        String str4 = logRecord.systemInformation;
        if (str4 != null) {
            linkedList.add(str4);
        }
        String str5 = logRecord.data;
        if (str5 != null && !str5.isEmpty()) {
            linkedList.add(logRecord.data);
        }
        Date date = logRecord.dateOfOccurrence;
        if (date != null) {
            linkedList.add(date.toString());
        }
        if (z10 && (str = logRecord.stackTrace) != null) {
            linkedList.add(str);
        }
        return org.apache.commons.lang3.z.J0(linkedList, '\n');
    }

    @androidx.annotation.b0("listOld")
    private boolean D(@NonNull LogRecord logRecord) {
        String str;
        for (LogRecord logRecord2 : this.f222237m) {
            String str2 = logRecord2.action;
            if (str2 != null && str2.equals(logRecord.action) && (((str = logRecord2.data) == null && logRecord.data == null) || (str != null && str.equals(logRecord.data)))) {
                String str3 = logRecord2.stackTrace;
                if ((str3 == null && logRecord.stackTrace == null) || (str3 != null && str3.equals(logRecord.stackTrace))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean E(@NonNull LogRecord logRecord) {
        return logRecord.dateOfOccurrence == null;
    }

    private boolean F() {
        return this.f222235k.get().a(com.planner5d.library.model.manager.config.f.LogsApi);
    }

    private void H(LogRecord logRecord) {
        if (logRecord.f180537a == null) {
            this.f222234j.get().c(logRecord.action, C(logRecord, true));
            return;
        }
        this.f222234j.get().b(logRecord.f180537a, logRecord.action, C(logRecord, false));
        int i10 = 4 & 0;
        logRecord.f180537a = null;
    }

    @androidx.annotation.m1
    private void J(LogRecord logRecord) {
        if (logRecord.dateUntilNextRecord != null) {
            logRecord.posted = true;
            logRecord.save();
        }
    }

    public static /* synthetic */ LogRecord x(String str, String str2, Throwable th2) {
        return new LogRecord(str, str2, th2, null);
    }

    public static /* synthetic */ LogRecord y(String str, String str2, Throwable th2, Date date) {
        return new LogRecord(str, str2, th2, date);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.manager.v
    @androidx.annotation.m1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void i(LogRecord logRecord) {
        if (logRecord.dateUntilNextRecord == null) {
            logRecord.delete();
        } else {
            logRecord.posted = true;
            logRecord.save();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.manager.v
    @androidx.annotation.m1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public boolean q(LogRecord logRecord, final JSONObject jSONObject) throws JSONException {
        jSONObject.put(com.facebook.internal.w0.f100156c1, "android_" + this.f222231g.k() + "_" + com.planner5d.library.services.utility.h3.j(this.f222232h) + ":" + logRecord.action);
        jSONObject.put("data", C(logRecord, true));
        int i10 = 7 >> 0;
        try {
            com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) this.f222229e.j(this.f222230f.get().a(), new Function2() { // from class: com.planner5d.library.model.manager.r1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((com.planner5d.library.api.b) obj).L0((id.a) obj2, jSONObject);
                }
            });
            if (cVar != null && !cVar.h()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.model.manager.v
    @androidx.annotation.m1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void t(LogRecord logRecord) {
        H(logRecord);
        if (F()) {
            J(logRecord);
            return;
        }
        logRecord.installationHash = this.f222233i.b();
        logRecord.systemInformation = this.f222233i.h();
        synchronized (this.f222237m) {
            try {
                if (D(logRecord)) {
                    J(logRecord);
                    return;
                }
                while (this.f222237m.size() > 10) {
                    this.f222237m.remove(0);
                }
                this.f222237m.add(logRecord);
                logRecord.save();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.v
    @androidx.annotation.l1(otherwise = 4)
    @androidx.annotation.m1
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean w(LogRecord logRecord) {
        return new Select().from(j()).where("action = ? AND date_until_next_record > ?", logRecord.action, Long.valueOf(this.f222236l.currentTimeMillis())).count() == 0;
    }

    @Override // com.planner5d.library.model.manager.u1
    public void a(@NonNull final String str, @androidx.annotation.p0 final String str2, @androidx.annotation.p0 final Throwable th2, long j10, @NonNull TimeUnit timeUnit) {
        final Date date = new Date(this.f222236l.currentTimeMillis() + timeUnit.toMillis(j10));
        v(new ij.c() { // from class: com.planner5d.library.model.manager.s1
            @Override // ij.c
            public final Object get() {
                return t1.y(str, str2, th2, date);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.u1
    public void b(@NonNull final String str, final String str2, final Throwable th2) {
        v(new ij.c() { // from class: com.planner5d.library.model.manager.q1
            @Override // ij.c
            public final Object get() {
                return t1.x(str, str2, th2);
            }
        });
    }

    @Override // com.planner5d.library.model.manager.v
    protected Class<LogRecord> j() {
        return LogRecord.class;
    }

    @Override // com.planner5d.library.model.manager.v
    @NonNull
    @androidx.annotation.m1
    protected List<LogRecord> k() {
        A();
        return F() ? Collections.EMPTY_LIST : new Select().from(j()).where("posted != 1").limit(5).execute();
    }
}
