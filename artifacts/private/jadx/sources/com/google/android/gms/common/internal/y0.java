package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class y0 implements com.google.android.gms.common.api.p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.p f106668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f106669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ v.a f106670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b1 f106671d;

    y0(com.google.android.gms.common.api.p pVar, com.google.android.gms.tasks.l lVar, v.a aVar, b1 b1Var) {
        this.f106668a = pVar;
        this.f106669b = lVar;
        this.f106670c = aVar;
        this.f106671d = b1Var;
    }

    @Override // com.google.android.gms.common.api.p.a
    public final void a(Status status) {
        if (!status.q2()) {
            this.f106669b.b(c.a(status));
        } else {
            this.f106669b.c(this.f106670c.a(this.f106668a.e(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
