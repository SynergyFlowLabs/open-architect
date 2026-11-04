package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final Map f108482a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f108482a.put(str, callable);
    }
}
