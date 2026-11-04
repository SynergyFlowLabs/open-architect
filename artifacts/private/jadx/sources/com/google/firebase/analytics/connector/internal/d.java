package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.google.android.gms.measurement.internal.s8;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class d implements n6.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f120722a;

    public d(e eVar) {
        Objects.requireNonNull(eVar);
        this.f120722a = eVar;
    }

    @Override // n6.a.c, com.google.android.gms.measurement.internal.w8
    public final void a(String str, String str2, Bundle bundle, long j10) {
        e eVar = this.f120722a;
        if (eVar.f120723a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i10 = c.f120721g;
            String strA = s8.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            bundle2.putString(EventEntry.tableName, str2);
            eVar.c().a(2, bundle2);
        }
    }
}
