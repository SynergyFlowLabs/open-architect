package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.api.r;
import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public interface b<T> extends Iterable<T>, r, Closeable {
    @NonNull
    Iterator<T> I2();

    void close();

    @NonNull
    T get(int i10);

    int getCount();

    @Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    @NonNull
    Iterator<T> iterator();

    void release();

    @p0
    @g6.a
    Bundle z();
}
