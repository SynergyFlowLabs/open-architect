package com.google.android.datatransport.runtime.time;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public class g implements a {
    @Override // com.google.android.datatransport.runtime.time.a
    public long V() {
        return SystemClock.elapsedRealtime();
    }
}
