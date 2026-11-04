package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.v;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p<R extends v> {

    @g6.a
    public interface a {
        @g6.a
        void a(@NonNull Status status);
    }

    @g6.a
    public void c(@NonNull a aVar) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract R d();

    @NonNull
    public abstract R e(long j10, @NonNull TimeUnit timeUnit);

    public abstract void f();

    public abstract boolean g();

    public abstract void h(@NonNull w<? super R> wVar);

    public abstract void i(@NonNull w<? super R> wVar, long j10, @NonNull TimeUnit timeUnit);

    @NonNull
    public <S extends v> z<S> j(@NonNull y<? super R, ? extends S> yVar) {
        throw new UnsupportedOperationException();
    }
}
