package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.v1.m;

/* JADX INFO: loaded from: classes5.dex */
final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f124040a;

    b(m mVar) {
        this.f124040a = mVar;
    }

    @Override // com.google.firebase.perf.metrics.validator.e
    public boolean c() {
        if (this.f124040a.t6()) {
            return this.f124040a.jd() > 0 || this.f124040a.g8() > 0 || (this.f124040a.pj() && this.f124040a.Kd().C8());
        }
        return false;
    }
}
