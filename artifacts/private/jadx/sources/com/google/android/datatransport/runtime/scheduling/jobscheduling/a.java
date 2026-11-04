package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.l1;

/* JADX INFO: loaded from: classes4.dex */
public class a implements y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f103614f = "AlarmManagerScheduler";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f103615g = "attemptNumber";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f103616h = "backendName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f103617i = "priority";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f103618j = "extras";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f103619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f103620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AlarmManager f103621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f103622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103623e;

    public a(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, com.google.android.datatransport.runtime.time.a aVar, g gVar) {
        this(context, dVar, (AlarmManager) context.getSystemService(androidx.core.app.w.K0), aVar, gVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void a(com.google.android.datatransport.runtime.r rVar, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter(f103616h, rVar.b());
        builder.appendQueryParameter("priority", String.valueOf(c6.a.a(rVar.d())));
        if (rVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(rVar.c(), 0));
        }
        Intent intent = new Intent(this.f103619a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra(f103615g, i10);
        if (!z10 && c(intent)) {
            z5.a.c(f103614f, "Upload for context %s is already scheduled. Returning...", rVar);
            return;
        }
        long jBb = this.f103620b.Bb(rVar);
        long jH = this.f103622d.h(rVar.d(), jBb, i10);
        z5.a.e(f103614f, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", rVar, Long.valueOf(jH), Long.valueOf(jBb), Integer.valueOf(i10));
        this.f103621c.set(3, this.f103623e.V() + jH, PendingIntent.getBroadcast(this.f103619a, 0, intent, 67108864));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void b(com.google.android.datatransport.runtime.r rVar, int i10) {
        a(rVar, i10, false);
    }

    @l1
    boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f103619a, 0, intent, 603979776) != null;
    }

    @l1
    a(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, AlarmManager alarmManager, com.google.android.datatransport.runtime.time.a aVar, g gVar) {
        this.f103619a = context;
        this.f103620b = dVar;
        this.f103621c = alarmManager;
        this.f103623e = aVar;
        this.f103622d = gVar;
    }
}
