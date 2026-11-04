package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: loaded from: classes4.dex */
final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f114865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f114866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f114867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f114868d = new Handler(Looper.getMainLooper());

    l(w wVar, i iVar, Context context) {
        this.f114865a = wVar;
        this.f114866b = iVar;
        this.f114867c = context;
    }

    @Override // com.google.android.play.core.appupdate.b
    public final boolean a(a aVar, androidx.activity.result.h<IntentSenderRequest> hVar, d dVar) {
        if (aVar != null && hVar != null && dVar != null && aVar.g(dVar) && !aVar.o()) {
            aVar.n();
            hVar.b(new IntentSenderRequest.a(aVar.l(dVar).getIntentSender()).a());
            return true;
        }
        return false;
    }

    @Override // com.google.android.play.core.appupdate.b
    public final boolean b(a aVar, @e7.b int i10, com.google.android.play.core.common.a aVar2, int i11) throws IntentSender.SendIntentException {
        return d(aVar, aVar2, d.c(i10), i11);
    }

    @Override // com.google.android.play.core.appupdate.b
    public final Task<a> c() {
        return this.f114865a.e(this.f114867c.getPackageName());
    }

    @Override // com.google.android.play.core.appupdate.b
    public final boolean d(a aVar, com.google.android.play.core.common.a aVar2, d dVar, int i10) throws IntentSender.SendIntentException {
        if (aVar != null && aVar2 != null && dVar != null && aVar.g(dVar) && !aVar.o()) {
            aVar.n();
            aVar2.a(aVar.l(dVar).getIntentSender(), i10, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }

    @Override // com.google.android.play.core.appupdate.b
    public final boolean e(a aVar, @e7.b int i10, Activity activity, int i11) throws IntentSender.SendIntentException {
        d dVarC = d.c(i10);
        if (activity == null) {
            return false;
        }
        return d(aVar, new k(this, activity), dVarC, i11);
    }

    @Override // com.google.android.play.core.appupdate.b
    public final boolean f(a aVar, Activity activity, d dVar, int i10) throws IntentSender.SendIntentException {
        if (activity == null) {
            return false;
        }
        return d(aVar, new k(this, activity), dVar, i10);
    }

    @Override // com.google.android.play.core.appupdate.b
    public final Task<Void> g() {
        return this.f114865a.d(this.f114867c.getPackageName());
    }

    @Override // com.google.android.play.core.appupdate.b
    public final synchronized void h(com.google.android.play.core.install.b bVar) {
        try {
            this.f114866b.b(bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.play.core.appupdate.b
    public final Task<Integer> i(a aVar, Activity activity, d dVar) {
        if (aVar != null && activity != null && dVar != null && !aVar.o()) {
            if (!aVar.g(dVar)) {
                return com.google.android.gms.tasks.n.f(new com.google.android.play.core.install.a(-6));
            }
            aVar.n();
            Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", aVar.l(dVar));
            com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
            intent.putExtra("result_receiver", new zze(this, this.f114868d, lVar));
            activity.startActivity(intent);
            return lVar.a();
        }
        return com.google.android.gms.tasks.n.f(new com.google.android.play.core.install.a(-4));
    }

    @Override // com.google.android.play.core.appupdate.b
    public final synchronized void j(com.google.android.play.core.install.b bVar) {
        this.f114866b.c(bVar);
    }
}
