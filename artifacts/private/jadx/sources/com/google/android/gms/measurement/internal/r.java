package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f110424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f110425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f110426c;

    public r(t tVar, String str) {
        Objects.requireNonNull(tVar);
        this.f110426c = tVar;
        com.google.android.gms.common.internal.w.l(str);
        this.f110424a = str;
        this.f110425b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f110426c.u0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f110424a, String.valueOf(this.f110425b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.f110425b) {
                            this.f110425b = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.x6 x6Var = (com.google.android.gms.internal.measurement.x6) ve.W(com.google.android.gms.internal.measurement.y6.O(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            x6Var.G(string);
                            x6Var.J(cursorQuery.getLong(2));
                            arrayList.add(new q(j10, j11, z10, (com.google.android.gms.internal.measurement.y6) x6Var.r()));
                        } catch (IOException e10) {
                            this.f110426c.f110184a.a().o().c("Data loss. Failed to merge raw event. appId", w5.x(this.f110424a), e10);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                this.f110426c.f110184a.a().o().c("Data loss. Error querying raw events batch. appId", w5.x(this.f110424a), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public r(t tVar, String str, long j10) {
        Objects.requireNonNull(tVar);
        this.f110426c = tVar;
        com.google.android.gms.common.internal.w.l(str);
        this.f110424a = str;
        this.f110425b = tVar.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
