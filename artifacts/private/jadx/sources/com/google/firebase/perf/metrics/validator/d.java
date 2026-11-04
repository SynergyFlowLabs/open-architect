package com.google.firebase.perf.metrics.validator;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.perf.v1.x;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124047b = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f124048a;

    d(@NonNull x xVar) {
        this.f124048a = xVar;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                e.d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e10) {
                f124047b.l(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(@NonNull x xVar) {
        return i(xVar, 0);
    }

    private boolean i(@p0 x xVar, int i10) {
        if (xVar == null) {
            return false;
        }
        if (i10 > 1) {
            f124047b.l("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : xVar.Y8().entrySet()) {
            if (!l(entry.getKey())) {
                f124047b.l("invalid CounterId:" + entry.getKey());
                return false;
            }
            if (!m(entry.getValue())) {
                f124047b.l("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator<x> it = xVar.be().iterator();
        while (it.hasNext()) {
            if (!i(it.next(), i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(@NonNull x xVar) {
        if (xVar.Nc() > 0) {
            return true;
        }
        Iterator<x> it = xVar.be().iterator();
        while (it.hasNext()) {
            if (it.next().Nc() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean k(@NonNull x xVar) {
        return xVar.getName().startsWith(com.google.firebase.perf.util.b.f124203p);
    }

    private boolean l(@p0 String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            f124047b.l("counterId is empty");
            return false;
        }
        if (strTrim.length() <= 100) {
            return true;
        }
        f124047b.l("counterId exceeded max length 100");
        return false;
    }

    private boolean m(@p0 Long l10) {
        return l10 != null;
    }

    private boolean n(@NonNull x xVar) {
        Long l10 = xVar.Y8().get(com.google.firebase.perf.util.b.a.FRAMES_TOTAL.toString());
        return l10 != null && l10.compareTo((Long) 0L) > 0;
    }

    private boolean o(@p0 x xVar, int i10) {
        if (xVar == null) {
            f124047b.l("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            f124047b.l("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!q(xVar.getName())) {
            f124047b.l("invalid TraceId:" + xVar.getName());
            return false;
        }
        if (!p(xVar)) {
            f124047b.l("invalid TraceDuration:" + xVar.Q1());
            return false;
        }
        if (!xVar.H7()) {
            f124047b.l("clientStartTimeUs is null.");
            return false;
        }
        if (!k(xVar) || n(xVar)) {
            Iterator<x> it = xVar.be().iterator();
            while (it.hasNext()) {
                if (!o(it.next(), i10 + 1)) {
                    return false;
                }
            }
            return g(xVar.z1());
        }
        f124047b.l("non-positive totalFrames in screen trace " + xVar.getName());
        return false;
    }

    private boolean p(@p0 x xVar) {
        return xVar != null && xVar.Q1() > 0;
    }

    private boolean q(@p0 String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }

    @Override // com.google.firebase.perf.metrics.validator.e
    public boolean c() {
        if (!o(this.f124048a, 0)) {
            f124047b.l("Invalid Trace:" + this.f124048a.getName());
            return false;
        }
        if (!j(this.f124048a) || h(this.f124048a)) {
            return true;
        }
        f124047b.l("Invalid Counters for Trace:" + this.f124048a.getName());
        return false;
    }
}
