package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class r extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f107485a;

    r(u uVar, l lVar) {
        this.f107485a = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final void s6(Status status) {
        if (status.b2() == 6) {
            this.f107485a.d(c.a(status));
        } else {
            c0.a(status, this.f107485a);
        }
    }
}
