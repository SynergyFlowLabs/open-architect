package com.google.android.gms.measurement.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class ma implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ ma f110256a = new ma();

    private /* synthetic */ ma() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
    }
}
