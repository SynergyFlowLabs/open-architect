package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z<R extends v> {
    public abstract void b(@NonNull x<? super R> xVar);

    @NonNull
    public abstract <S extends v> z<S> c(@NonNull y<? super R, ? extends S> yVar);
}
