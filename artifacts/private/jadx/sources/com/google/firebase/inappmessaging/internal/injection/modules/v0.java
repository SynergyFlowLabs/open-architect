package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.internal.u2;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@q8.d
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f122802a = "FIREBASE_INAPPMESSAGING";

    public static /* synthetic */ byte[] b(byte[] bArr) {
        return bArr;
    }

    @q8.e
    @x8.a
    static u2 c(com.google.firebase.h hVar, com.google.android.datatransport.m mVar, com.google.firebase.analytics.connector.a aVar, com.google.firebase.installations.k kVar, com.google.firebase.inappmessaging.internal.time.a aVar2, com.google.firebase.inappmessaging.internal.w wVar, @d8.b Executor executor) {
        final com.google.android.datatransport.l lVarA = mVar.a(f122802a, byte[].class, new com.google.android.datatransport.k() { // from class: com.google.firebase.inappmessaging.internal.injection.modules.t0
            @Override // com.google.android.datatransport.k
            public final Object apply(Object obj) {
                return v0.b((byte[]) obj);
            }
        });
        return new u2(new u2.b() { // from class: com.google.firebase.inappmessaging.internal.injection.modules.u0
            @Override // com.google.firebase.inappmessaging.internal.u2.b
            public final void a(byte[] bArr) {
                lVarA.b(com.google.android.datatransport.f.j(bArr));
            }
        }, aVar, hVar, kVar, aVar2, wVar, executor);
    }
}
