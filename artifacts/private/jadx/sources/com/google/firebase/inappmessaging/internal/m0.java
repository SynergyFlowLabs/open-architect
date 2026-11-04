package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;

/* JADX INFO: loaded from: classes5.dex */
final class m0 implements com.google.firebase.analytics.connector.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.reactivex.n<String> f122846a;

    m0(io.reactivex.n<String> nVar) {
        this.f122846a = nVar;
    }

    @Override // com.google.firebase.analytics.connector.a.b
    public void a(int i10, Bundle bundle) {
        if (i10 == 2) {
            this.f122846a.onNext(bundle.getString(EventEntry.tableName));
        }
    }
}
