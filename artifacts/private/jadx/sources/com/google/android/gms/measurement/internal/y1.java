package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends a4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f110710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f110711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f110712d;

    public y1(h7 h7Var) {
        super(h7Var);
        this.f110711c = new androidx.collection.a();
        this.f110710b = new androidx.collection.a();
    }

    @androidx.annotation.m1
    private final void o(long j10, eb ebVar) {
        if (ebVar == null) {
            this.f110184a.a().w().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f110184a.a().w().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        ze.k0(ebVar, bundle, true);
        this.f110184a.B().t("am", "_xa", bundle);
    }

    @androidx.annotation.m1
    private final void p(String str, long j10, eb ebVar) {
        if (ebVar == null) {
            this.f110184a.a().w().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f110184a.a().w().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        ze.k0(ebVar, bundle, true);
        this.f110184a.B().t("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void n(long j10) {
        Map map = this.f110710b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j10));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f110712d = j10;
    }

    public final void i(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f110184a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f110184a.b().t(new a(this, str, j10));
        }
    }

    public final void j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f110184a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f110184a.b().t(new y(this, str, j10));
        }
    }

    @androidx.annotation.m1
    public final void k(long j10) {
        eb ebVarQ = this.f110184a.I().q(false);
        Map map = this.f110710b;
        for (String str : map.keySet()) {
            p(str, j10 - ((Long) map.get(str)).longValue(), ebVarQ);
        }
        if (!map.isEmpty()) {
            o(j10 - this.f110712d, ebVarQ);
        }
        n(j10);
    }

    final /* synthetic */ void l(String str, long j10) {
        h();
        com.google.android.gms.common.internal.w.l(str);
        Map map = this.f110711c;
        if (map.isEmpty()) {
            this.f110712d = j10;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f110184a.a().r().a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.f110710b.put(str, Long.valueOf(j10));
        }
    }

    final /* synthetic */ void m(String str, long j10) {
        h();
        com.google.android.gms.common.internal.w.l(str);
        Map map = this.f110711c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.f110184a.a().o().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        eb ebVarQ = this.f110184a.I().q(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = this.f110710b;
        Long l10 = (Long) map2.get(str);
        if (l10 == null) {
            this.f110184a.a().o().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j10 - l10.longValue();
            map2.remove(str);
            p(str, jLongValue, ebVarQ);
        }
        if (map.isEmpty()) {
            long j11 = this.f110712d;
            if (j11 == 0) {
                this.f110184a.a().o().a("First ad exposure time was never set");
            } else {
                o(j10 - j11, ebVarQ);
                this.f110712d = 0L;
            }
        }
    }
}
