package com.superwall.sdk.network;

import java.util.Map;
import kotlin.jvm.internal.g0;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class NetworkService$post$2$1 extends g0 implements n<Boolean, String, kotlin.coroutines.d<? super Map<String, ? extends String>>, Object>, kotlin.coroutines.jvm.internal.n {
    public NetworkService$post$2$1(Object obj) {
        super(3, obj, NetworkService.class, "makeHeaders", "makeHeaders(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // pj.n
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, kotlin.coroutines.d<? super Map<String, ? extends String>> dVar) {
        return invoke(bool.booleanValue(), str, (kotlin.coroutines.d<? super Map<String, String>>) dVar);
    }

    public final Object invoke(boolean z10, String str, kotlin.coroutines.d<? super Map<String, String>> dVar) {
        return ((NetworkService) this.receiver).makeHeaders(z10, str, dVar);
    }
}
