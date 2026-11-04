package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f109730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f109731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f109732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f109733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f109734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final zzbe f109735f;

    a0(h7 h7Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzbe zzbeVar;
        com.google.android.gms.common.internal.w.l(str2);
        com.google.android.gms.common.internal.w.l(str3);
        this.f109730a = str2;
        this.f109731b = str3;
        this.f109732c = true == TextUtils.isEmpty(str) ? null : str;
        this.f109733d = j10;
        this.f109734e = j11;
        if (j11 != 0 && j11 > j10) {
            h7Var.a().r().b("Event created with reverse previous/current timestamps. appId", w5.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    h7Var.a().o().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objS = h7Var.C().s(next, bundle2.get(next));
                    if (objS == null) {
                        h7Var.a().r().b("Param value can't be null", h7Var.D().b(next));
                        it.remove();
                    } else {
                        h7Var.C().A(bundle2, next, objS);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f109735f = zzbeVar;
    }

    final a0 a(h7 h7Var, long j10) {
        return new a0(h7Var, this.f109732c, this.f109730a, this.f109731b, this.f109733d, j10, this.f109735f);
    }

    public final String toString() {
        String string = this.f109735f.toString();
        String str = this.f109730a;
        int length = String.valueOf(str).length();
        String str2 = this.f109731b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    private a0(h7 h7Var, String str, String str2, String str3, long j10, long j11, zzbe zzbeVar) {
        com.google.android.gms.common.internal.w.l(str2);
        com.google.android.gms.common.internal.w.l(str3);
        com.google.android.gms.common.internal.w.r(zzbeVar);
        this.f109730a = str2;
        this.f109731b = str3;
        this.f109732c = true == TextUtils.isEmpty(str) ? null : str;
        this.f109733d = j10;
        this.f109734e = j11;
        if (j11 != 0 && j11 > j10) {
            h7Var.a().r().c("Event created with reverse previous/current timestamps. appId, name", w5.x(str2), w5.x(str3));
        }
        this.f109735f = zzbeVar;
    }
}
