package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.l;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class g extends com.google.android.play.core.review.internal.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f114939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f114940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(j jVar, l lVar, l lVar2) {
        super(lVar);
        this.f114939b = lVar2;
        this.f114940c = jVar;
    }

    @Override // com.google.android.play.core.review.internal.j
    protected final void a() {
        try {
            com.google.android.play.core.review.internal.f fVar = (com.google.android.play.core.review.internal.f) this.f114940c.f114976a.e();
            String str = this.f114940c.f114977b;
            Bundle bundle = new Bundle();
            Map mapA = k.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            j jVar = this.f114940c;
            fVar.sf(str, bundle, new i(jVar, this.f114939b, jVar.f114977b));
        } catch (RemoteException e10) {
            j.f114975c.b(e10, "error requesting in-app review for %s", this.f114940c.f114977b);
            this.f114939b.d(new RuntimeException(e10));
        }
    }
}
