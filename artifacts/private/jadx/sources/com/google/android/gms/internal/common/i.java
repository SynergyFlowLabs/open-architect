package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends f {
    public i() {
        super(4);
    }

    public final i b(Object obj) {
        super.a(obj);
        return this;
    }

    public final i c(Iterator it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
        return this;
    }

    public final m d() {
        this.f107970c = true;
        return m.t(this.f107968a, this.f107969b);
    }

    i(int i10) {
        super(4);
    }
}
