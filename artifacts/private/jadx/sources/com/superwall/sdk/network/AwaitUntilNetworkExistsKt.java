package com.superwall.sdk.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class AwaitUntilNetworkExistsKt {

    /* JADX INFO: renamed from: com.superwall.sdk.network.AwaitUntilNetworkExistsKt$awaitUntilNetworkExists$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.network.AwaitUntilNetworkExistsKt", f = "AwaitUntilNetworkExists.kt", i = {0, 0}, l = {14, 16}, m = "awaitUntilNetworkExists", n = {"$this$awaitUntilNetworkExists", "checkInterval"}, s = {"L$0", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitUntilNetworkExistsKt.awaitUntilNetworkExists(null, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (kotlinx.coroutines.d1.b(r9, r0) == r1) goto L24;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitUntilNetworkExists(@org.jetbrains.annotations.NotNull android.content.Context r8, long r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            r7 = 4
            boolean r0 = r11 instanceof com.superwall.sdk.network.AwaitUntilNetworkExistsKt.AnonymousClass1
            r7 = 3
            if (r0 == 0) goto L17
            r0 = r11
            com.superwall.sdk.network.AwaitUntilNetworkExistsKt$awaitUntilNetworkExists$1 r0 = (com.superwall.sdk.network.AwaitUntilNetworkExistsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2
            r3 = r1 & r2
            if (r3 == 0) goto L17
            r7 = 7
            int r1 = r1 - r2
            r0.label = r1
            goto L1d
        L17:
            r7 = 1
            com.superwall.sdk.network.AwaitUntilNetworkExistsKt$awaitUntilNetworkExists$1 r0 = new com.superwall.sdk.network.AwaitUntilNetworkExistsKt$awaitUntilNetworkExists$1
            r0.<init>(r11)
        L1d:
            r7 = 3
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r7 = 4
            int r2 = r0.label
            r3 = 2
            r7 = r7 ^ r3
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r11)
            goto L70
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            long r8 = r0.J$0
            java.lang.Object r10 = r0.L$0
            android.content.Context r10 = (android.content.Context) r10
            kotlin.ResultKt.m(r11)
            r5 = r8
            r8 = r10
            r8 = r10
            r9 = r5
            r7 = 1
            goto L4e
        L4b:
            kotlin.ResultKt.m(r11)
        L4e:
            boolean r11 = isNetworkAvailable(r8)
            if (r11 != 0) goto L63
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = kotlinx.coroutines.d1.b(r9, r0)
            r7 = 7
            if (r11 != r1) goto L4e
            r7 = 7
            goto L6f
        L63:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.d1.b(r9, r0)
            r7 = 5
            if (r8 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.network.AwaitUntilNetworkExistsKt.awaitUntilNetworkExists(android.content.Context, long, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object awaitUntilNetworkExists$default(Context context, long j10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 1000;
        }
        return awaitUntilNetworkExists(context, j10, dVar);
    }

    private static final boolean hasNetworkPermission(Context context) {
        return androidx.core.content.d.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
    }

    private static final boolean isNetworkAvailable(Context context) {
        NetworkCapabilities networkCapabilities;
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (!hasNetworkPermission(context)) {
            return true;
        }
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
    }
}
