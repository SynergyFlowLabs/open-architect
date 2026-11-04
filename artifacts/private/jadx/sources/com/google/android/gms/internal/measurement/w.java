package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f108934a = new ArrayList();

    protected w() {
    }

    public abstract p a(String str, e5 e5Var, List list);

    final p b(String str) {
        if (this.f108934a.contains(f6.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
