package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class s0 implements com.google.android.gms.tasks.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.tasks.l f108182a;

    @Override // com.google.android.gms.tasks.c
    public final /* synthetic */ Object a(Task task) {
        com.google.android.gms.common.api.a aVar = k0.f108133o;
        com.google.android.gms.tasks.l lVar = this.f108182a;
        if (task.u()) {
            lVar.e((Location) task.q());
        } else {
            Exception excP = task.p();
            Objects.requireNonNull(excP);
            lVar.d(excP);
        }
        return null;
    }
}
