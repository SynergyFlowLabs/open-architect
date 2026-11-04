package com.google.android.gms.auth.api.proxy;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.internal.a0;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
public interface b {

    @a0
    @g6.a
    public interface a extends v {
        @NonNull
        @g6.a
        ProxyResponse N();
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.proxy.b$b, reason: collision with other inner class name */
    @a0
    @g6.a
    public interface InterfaceC0962b extends v {
        @NonNull
        @a0
        @g6.a
        String m();
    }

    @NonNull
    @g6.a
    @Deprecated
    p<a> a(@NonNull l lVar, @NonNull ProxyRequest proxyRequest);

    @NonNull
    @g6.a
    @Deprecated
    @a0
    p<InterfaceC0962b> b(@NonNull l lVar);
}
