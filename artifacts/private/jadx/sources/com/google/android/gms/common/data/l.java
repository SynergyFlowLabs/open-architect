package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.w;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class l<T> extends c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f106392c;

    public l(@NonNull b bVar) {
        super(bVar);
    }

    @Override // com.google.android.gms.common.data.c, java.util.Iterator
    @NonNull
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f106381b);
        }
        int i10 = this.f106381b + 1;
        this.f106381b = i10;
        if (i10 == 0) {
            Object objR = w.r(this.f106380a.get(0));
            this.f106392c = objR;
            if (!(objR instanceof f)) {
                throw new IllegalStateException("DataBuffer reference of type " + String.valueOf(objR.getClass()) + " is not movable");
            }
        } else {
            ((f) w.r(this.f106392c)).n(this.f106381b);
        }
        return this.f106392c;
    }
}
