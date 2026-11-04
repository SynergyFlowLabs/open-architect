package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class g<L> implements o.b<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataHolder f106028a;

    @g6.a
    protected g(@NonNull DataHolder dataHolder) {
        this.f106028a = dataHolder;
    }

    @Override // com.google.android.gms.common.api.internal.o.b
    @g6.a
    public final void a(@NonNull L l10) {
        c(l10, this.f106028a);
    }

    @Override // com.google.android.gms.common.api.internal.o.b
    @g6.a
    public void b() {
        DataHolder dataHolder = this.f106028a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @g6.a
    protected abstract void c(@NonNull L l10, @NonNull DataHolder dataHolder);
}
