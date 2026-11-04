package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
final class g0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f106029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h0 f106030b;

    g0(h0 h0Var, com.google.android.gms.tasks.l lVar) {
        this.f106029a = lVar;
        this.f106030b = h0Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.f106030b.f106041b.remove(this.f106029a);
    }
}
