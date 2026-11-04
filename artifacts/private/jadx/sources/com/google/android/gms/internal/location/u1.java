package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements com.google.android.gms.location.j {
    static /* synthetic */ com.google.android.gms.tasks.l e(final com.google.android.gms.common.api.internal.e.b bVar) {
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        lVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.v1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                com.google.android.gms.common.api.internal.e.b bVar2 = bVar;
                if (task.u()) {
                    bVar2.a(Status.f105886f);
                    return;
                }
                if (task.s()) {
                    bVar2.b(Status.f105890j);
                    return;
                }
                Exception excP = task.p();
                if (excP instanceof com.google.android.gms.common.api.b) {
                    bVar2.b(((com.google.android.gms.common.api.b) excP).a());
                } else {
                    bVar2.b(Status.f105888h);
                }
            }
        });
        return lVar;
    }

    @Override // com.google.android.gms.location.j
    public final com.google.android.gms.common.api.p<Status> a(com.google.android.gms.common.api.l lVar, PendingIntent pendingIntent) {
        return lVar.m(new r1(this, lVar, pendingIntent));
    }

    @Override // com.google.android.gms.location.j
    public final com.google.android.gms.common.api.p<Status> b(com.google.android.gms.common.api.l lVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return lVar.m(new q1(this, lVar, geofencingRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.j
    public final com.google.android.gms.common.api.p<Status> c(com.google.android.gms.common.api.l lVar, List<String> list) {
        return lVar.m(new s1(this, lVar, list));
    }

    @Override // com.google.android.gms.location.j
    @Deprecated
    public final com.google.android.gms.common.api.p<Status> d(com.google.android.gms.common.api.l lVar, List<com.google.android.gms.location.h> list, PendingIntent pendingIntent) {
        GeofencingRequest.a aVar = new GeofencingRequest.a();
        aVar.b(list);
        aVar.d(5);
        return lVar.m(new q1(this, lVar, aVar.c(), pendingIntent));
    }
}
