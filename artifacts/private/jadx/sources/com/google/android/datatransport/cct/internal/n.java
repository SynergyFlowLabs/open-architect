package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@k8.a
@u7.d
public abstract class n {
    @NonNull
    public static n a(@NonNull List<u> list) {
        return new d(list);
    }

    @NonNull
    public static com.google.firebase.encoders.a b() {
        int i10 = 5 | 1;
        return new com.google.firebase.encoders.json.e().k(b.f103229b).l(true).j();
    }

    @NonNull
    @k8.a.InterfaceC2244a(name = "logRequest")
    public abstract List<u> c();
}
