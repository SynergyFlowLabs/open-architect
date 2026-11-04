package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f114787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f114788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e7.e
    private final int f114789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e7.d
    private final int f114790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final Integer f114791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f114792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f114793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f114794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f114795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f114796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private final PendingIntent f114797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private final PendingIntent f114798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private final PendingIntent f114799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private final PendingIntent f114800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f114801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f114802p = false;

    private a(@NonNull String str, int i10, @e7.e int i11, @e7.d int i12, @p0 Integer num, int i13, long j10, long j11, long j12, long j13, @p0 PendingIntent pendingIntent, @p0 PendingIntent pendingIntent2, @p0 PendingIntent pendingIntent3, @p0 PendingIntent pendingIntent4, Map map) {
        this.f114787a = str;
        this.f114788b = i10;
        this.f114789c = i11;
        this.f114790d = i12;
        this.f114791e = num;
        this.f114792f = i13;
        this.f114793g = j10;
        this.f114794h = j11;
        this.f114795i = j12;
        this.f114796j = j13;
        this.f114797k = pendingIntent;
        this.f114798l = pendingIntent2;
        this.f114799m = pendingIntent3;
        this.f114800n = pendingIntent4;
        this.f114801o = map;
    }

    public static a m(@NonNull String str, int i10, @e7.e int i11, @e7.d int i12, @p0 Integer num, int i13, long j10, long j11, long j12, long j13, @p0 PendingIntent pendingIntent, @p0 PendingIntent pendingIntent2, @p0 PendingIntent pendingIntent3, @p0 PendingIntent pendingIntent4, Map map) {
        return new a(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private static Set p(@p0 Set set) {
        return set == null ? new HashSet() : set;
    }

    private final boolean q(d dVar) {
        return dVar.a() && this.f114795i <= this.f114796j;
    }

    public int a() {
        return this.f114788b;
    }

    public long b() {
        return this.f114793g;
    }

    @p0
    public Integer c() {
        return this.f114791e;
    }

    public Set<Integer> d(d dVar) {
        if (dVar.a()) {
            return dVar.b() == 0 ? p((Set) this.f114801o.get("nonblocking.destructive.intent")) : p((Set) this.f114801o.get("blocking.destructive.intent"));
        }
        return dVar.b() == 0 ? p((Set) this.f114801o.get("nonblocking.intent")) : p((Set) this.f114801o.get("blocking.intent"));
    }

    @e7.d
    public int e() {
        return this.f114790d;
    }

    public boolean f(@e7.b int i10) {
        return l(d.c(i10)) != null;
    }

    public boolean g(@NonNull d dVar) {
        return l(dVar) != null;
    }

    @NonNull
    public String h() {
        return this.f114787a;
    }

    public long i() {
        return this.f114794h;
    }

    @e7.e
    public int j() {
        return this.f114789c;
    }

    public int k() {
        return this.f114792f;
    }

    @p0
    final PendingIntent l(d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f114798l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (q(dVar)) {
                return this.f114800n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f114797k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (q(dVar)) {
                return this.f114799m;
            }
        }
        return null;
    }

    final void n() {
        this.f114802p = true;
    }

    final boolean o() {
        return this.f114802p;
    }
}
