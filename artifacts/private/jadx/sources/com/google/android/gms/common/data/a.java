package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    @g6.a
    protected final DataHolder f106379a;

    @g6.a
    protected a(@p0 DataHolder dataHolder) {
        this.f106379a = dataHolder;
    }

    @Override // com.google.android.gms.common.data.b
    @NonNull
    public Iterator<T> I2() {
        return new l(this);
    }

    @Override // com.google.android.gms.common.data.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        release();
    }

    @Override // com.google.android.gms.common.data.b
    @NonNull
    public abstract T get(int i10);

    @Override // com.google.android.gms.common.data.b
    public int getCount() {
        DataHolder dataHolder = this.f106379a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // com.google.android.gms.common.data.b
    @Deprecated
    public boolean isClosed() {
        DataHolder dataHolder = this.f106379a;
        return dataHolder == null || dataHolder.isClosed();
    }

    @Override // com.google.android.gms.common.data.b, java.lang.Iterable
    @NonNull
    public Iterator<T> iterator() {
        return new c(this);
    }

    @Override // com.google.android.gms.common.data.b, com.google.android.gms.common.api.r
    public void release() {
        DataHolder dataHolder = this.f106379a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.data.b
    @p0
    public final Bundle z() {
        DataHolder dataHolder = this.f106379a;
        if (dataHolder == null) {
            return null;
        }
        return dataHolder.z();
    }
}
