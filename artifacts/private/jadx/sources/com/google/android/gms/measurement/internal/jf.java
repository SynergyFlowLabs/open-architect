package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.y6 f110131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f110132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f110133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f110134d;

    /* synthetic */ jf(e eVar, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f110134d = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    final com.google.android.gms.internal.measurement.y6 a(String str, com.google.android.gms.internal.measurement.y6 y6Var) {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strH = y6Var.H();
        List listE = y6Var.E();
        e eVar = this.f110134d;
        qe qeVar = eVar.f110700b;
        qeVar.K0();
        Long l10 = (Long) ve.u(y6Var, "_eid");
        if (l10 != null) {
            if (strH.equals("_ep")) {
                com.google.android.gms.common.internal.w.r(l10);
                qeVar.K0();
                String str2 = (String) ve.u(y6Var, "_en");
                ?? IsEmpty = TextUtils.isEmpty(str2);
                ?? r10 = 0;
                if (IsEmpty != 0) {
                    eVar.f110184a.a().p().b("Extra parameter without an event name. eventId", l10);
                    return null;
                }
                if (this.f110131a == null || this.f110132b == null || l10.longValue() != this.f110132b.longValue()) {
                    t tVarF0 = qeVar.F0();
                    tVarF0.h();
                    tVarF0.j();
                    try {
                        try {
                            cursorRawQuery = tVarF0.u0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.y6) ((com.google.android.gms.internal.measurement.x6) ve.W(com.google.android.gms.internal.measurement.y6.O(), cursorRawQuery.getBlob(0))).r(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e10) {
                                        tVarF0.f110184a.a().o().d("Failed to merge main event. appId, eventId", w5.x(str), l10, e10);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.f110134d.f110184a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                        return null;
                                    }
                                    this.f110131a = (com.google.android.gms.internal.measurement.y6) obj;
                                    this.f110133c = ((Long) pairCreate.second).longValue();
                                    this.f110134d.f110700b.K0();
                                    this.f110132b = (Long) ve.u(this.f110131a, "_eid");
                                } else {
                                    tVarF0.f110184a.a().w().a("Main event not found");
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                tVarF0.f110184a.a().o().b("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.f110134d.f110184a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                return null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = IsEmpty;
                            if (r10 != 0) {
                                r10.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                        if (r10 != 0) {
                            r10.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.f110134d.f110184a.a().p().c("Extra parameter without existing main event. eventName, eventId", str2, l10);
                    return null;
                }
                long j10 = this.f110133c - 1;
                this.f110133c = j10;
                if (j10 <= 0) {
                    t tVarF1 = this.f110134d.f110700b.F0();
                    tVarF1.h();
                    tVarF1.f110184a.a().w().b("Clearing complex main event info. appId", str);
                    try {
                        tVarF1.u0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        tVarF1.f110184a.a().o().b("Error clearing complex main event", e13);
                    }
                } else {
                    this.f110134d.f110700b.F0().F(str, l10, this.f110133c, this.f110131a);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.c7 c7Var : this.f110131a.E()) {
                    this.f110134d.f110700b.K0();
                    if (ve.r(y6Var, c7Var.F()) == null) {
                        arrayList.add(c7Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f110134d.f110184a.a().p().b("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listE);
                    listE = arrayList;
                }
                strH = str2;
            } else {
                this.f110132b = l10;
                this.f110131a = y6Var;
                qeVar.K0();
                long jLongValue = ((Long) ve.v(y6Var, "_epc", 0L)).longValue();
                this.f110133c = jLongValue;
                if (jLongValue <= 0) {
                    eVar.f110184a.a().p().b("Complex event with zero extra param count. eventName", strH);
                } else {
                    qeVar.F0().F(str, (Long) com.google.android.gms.common.internal.w.r(l10), this.f110133c, y6Var);
                }
            }
        }
        com.google.android.gms.internal.measurement.x6 x6Var = (com.google.android.gms.internal.measurement.x6) y6Var.q();
        x6Var.G(strH);
        x6Var.D();
        x6Var.C(listE);
        return (com.google.android.gms.internal.measurement.y6) x6Var.r();
    }
}
