package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;

/* JADX INFO: loaded from: classes4.dex */
@y5.e
public abstract class h {
    @y5.f
    static y b(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.g gVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(context, dVar, gVar);
    }

    @y5.a
    abstract e a(c cVar);
}
