package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f109863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f109864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cb f109865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.z7 f109866d;

    ce(String str, Map map, cb cbVar, com.google.android.gms.internal.measurement.z7 z7Var) {
        this.f109863a = str;
        this.f109864b = map;
        this.f109865c = cbVar;
        this.f109866d = z7Var;
    }

    public final String a() {
        return this.f109863a;
    }

    public final Map b() {
        Map map = this.f109864b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final cb c() {
        return this.f109865c;
    }

    public final com.google.android.gms.internal.measurement.z7 d() {
        return this.f109866d;
    }
}
