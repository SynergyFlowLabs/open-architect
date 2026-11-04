package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class c<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    protected final b f106380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f106381b = -1;

    public c(@NonNull b bVar) {
        this.f106380a = (b) w.r(bVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f106381b < this.f106380a.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @NonNull
    public Object next() {
        if (hasNext()) {
            b bVar = this.f106380a;
            int i10 = this.f106381b + 1;
            this.f106381b = i10;
            return bVar.get(i10);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f106381b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
