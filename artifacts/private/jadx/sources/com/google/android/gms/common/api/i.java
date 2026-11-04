package com.google.android.gms.common.api;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.data.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class i<T, R extends com.google.android.gms.common.data.a<T> & v> extends u<R> implements com.google.android.gms.common.data.b<T> {
    @g6.a
    public i() {
    }

    @Override // com.google.android.gms.common.data.b
    @NonNull
    public final Iterator<T> I2() {
        return ((com.google.android.gms.common.data.a) c()).I2();
    }

    @Override // com.google.android.gms.common.data.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((com.google.android.gms.common.data.a) c()).close();
    }

    @Override // com.google.android.gms.common.data.b
    @NonNull
    public final T get(int i10) {
        return (T) ((com.google.android.gms.common.data.a) c()).get(i10);
    }

    @Override // com.google.android.gms.common.data.b
    public final int getCount() {
        return ((com.google.android.gms.common.data.a) c()).getCount();
    }

    @Override // com.google.android.gms.common.data.b
    public final boolean isClosed() {
        return ((com.google.android.gms.common.data.a) c()).isClosed();
    }

    @Override // com.google.android.gms.common.data.b, java.lang.Iterable
    @NonNull
    public final Iterator<T> iterator() {
        return ((com.google.android.gms.common.data.a) c()).iterator();
    }

    @Override // com.google.android.gms.common.data.b, com.google.android.gms.common.api.r
    public final void release() {
        ((com.google.android.gms.common.data.a) c()).release();
    }

    @Override // com.google.android.gms.common.data.b
    @p0
    public final Bundle z() {
        return ((com.google.android.gms.common.data.a) c()).z();
    }

    /* JADX WARN: Incorrect types in method signature: (TR;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @g6.a
    public i(@NonNull com.google.android.gms.common.data.a aVar) {
        super(aVar);
    }
}
