package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class mh extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f108691c;

    public mh(String str, Callable callable) {
        super("internal.appMetadata");
        this.f108691c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final p a(e5 e5Var, List list) {
        try {
            return g7.a(this.f108691c.call());
        } catch (Exception unused) {
            return p.S1;
        }
    }
}
