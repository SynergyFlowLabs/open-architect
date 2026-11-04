package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.v1.u;
import com.google.firebase.perf.v1.x;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Trace f124037a;

    j(@NonNull Trace trace) {
        this.f124037a = trace;
    }

    x a() {
        x.b bVarPm = x.Wm().rm(this.f124037a.g()).om(this.f124037a.i().f()).pm(this.f124037a.i().e(this.f124037a.f()));
        for (Counter counter : this.f124037a.e().values()) {
            bVarPm.im(counter.b(), counter.a());
        }
        List<Trace> listJ = this.f124037a.j();
        if (!listJ.isEmpty()) {
            Iterator<Trace> it = listJ.iterator();
            while (it.hasNext()) {
                bVarPm.Xl(new j(it.next()).a());
            }
        }
        bVarPm.hm(this.f124037a.getAttributes());
        u[] uVarArrB = PerfSession.b(this.f124037a.h());
        if (uVarArrB != null) {
            bVarPm.Ol(Arrays.asList(uVarArrB));
        }
        return bVarPm.build();
    }
}
