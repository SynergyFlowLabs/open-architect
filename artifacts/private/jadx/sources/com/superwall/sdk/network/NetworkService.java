package com.superwall.sdk.network;

import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.Task_RetryingKt;
import com.superwall.sdk.network.session.CustomHttpUrlConnection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nNetworkService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkService.kt\ncom/superwall/sdk/network/NetworkService\n+ 2 CustomURLSession.kt\ncom/superwall/sdk/network/session/CustomHttpUrlConnection\n*L\n1#1,70:1\n23#2,9:71\n66#2:80\n23#2,9:81\n66#2:90\n23#2,9:91\n66#2:100\n*S KotlinDebug\n*F\n+ 1 NetworkService.kt\ncom/superwall/sdk/network/NetworkService\n*L\n27#1:71,9\n27#1:80\n52#1:81,9\n52#1:90\n52#1:91,9\n52#1:100\n*E\n"})
public abstract class NetworkService {
    public static /* synthetic */ Object get$default(NetworkService networkService, String str, List list, boolean z10, String str2, int i10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        List list2 = (i11 & 2) != 0 ? null : list;
        boolean z11 = (i11 & 4) != 0 ? false : z10;
        if ((i11 & 8) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        String str3 = str2;
        int iRetryCount = (i11 & 16) != 0 ? NetworkConsts.INSTANCE.retryCount() : i10;
        CustomHttpUrlConnection customHttpUrlConnection = networkService.getCustomHttpUrlConnection();
        Intrinsics.needClassReification();
        NetworkService$get$$inlined$request$default$1 networkService$get$$inlined$request$default$1 = new NetworkService$get$$inlined$request$default$1(customHttpUrlConnection, null, networkService, str, list2, str3, z11);
        h0.e(0);
        Object objRetrying = Task_RetryingKt.retrying(iRetryCount, null, networkService$get$$inlined$request$default$1, dVar);
        h0.e(1);
        return objRetrying;
    }

    public static /* synthetic */ Object post$default(NetworkService networkService, String str, boolean z10, byte[] bArr, String str2, int i10, kotlin.coroutines.d dVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        boolean z11 = (i11 & 2) != 0 ? false : z10;
        byte[] bArr2 = (i11 & 4) != 0 ? null : bArr;
        if ((i11 & 8) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        String str3 = str2;
        int i12 = (i11 & 16) != 0 ? 6 : i10;
        CustomHttpUrlConnection customHttpUrlConnection = networkService.getCustomHttpUrlConnection();
        Intrinsics.needClassReification();
        NetworkService$post$$inlined$request$default$1 networkService$post$$inlined$request$default$1 = new NetworkService$post$$inlined$request$default$1(customHttpUrlConnection, null, networkService, str, bArr2, str3, z11);
        h0.e(0);
        Object objRetrying = Task_RetryingKt.retrying(i12, null, networkService$post$$inlined$request$default$1, dVar);
        h0.e(1);
        return objRetrying;
    }

    public final /* synthetic */ <T> Object get(String str, List<URLQueryItem> list, boolean z10, String str2, int i10, kotlin.coroutines.d<? super Either<? extends T, NetworkError>> dVar) {
        CustomHttpUrlConnection customHttpUrlConnection = getCustomHttpUrlConnection();
        Intrinsics.needClassReification();
        NetworkService$get$$inlined$request$default$1 networkService$get$$inlined$request$default$1 = new NetworkService$get$$inlined$request$default$1(customHttpUrlConnection, null, this, str, list, str2, z10);
        h0.e(0);
        Object objRetrying = Task_RetryingKt.retrying(i10, null, networkService$get$$inlined$request$default$1, dVar);
        h0.e(1);
        return objRetrying;
    }

    @NotNull
    public abstract CustomHttpUrlConnection getCustomHttpUrlConnection();

    @NotNull
    public abstract String getHost();

    @NotNull
    public abstract String getVersion();

    @Nullable
    public abstract Object makeHeaders(boolean z10, @NotNull String str, @NotNull kotlin.coroutines.d<? super Map<String, String>> dVar);

    public final /* synthetic */ <T> Object post(String str, boolean z10, byte[] bArr, String str2, int i10, kotlin.coroutines.d<? super Either<? extends T, NetworkError>> dVar) {
        CustomHttpUrlConnection customHttpUrlConnection = getCustomHttpUrlConnection();
        Intrinsics.needClassReification();
        NetworkService$post$$inlined$request$default$1 networkService$post$$inlined$request$default$1 = new NetworkService$post$$inlined$request$default$1(customHttpUrlConnection, null, this, str, bArr, str2, z10);
        h0.e(0);
        Object objRetrying = Task_RetryingKt.retrying(i10, null, networkService$post$$inlined$request$default$1, dVar);
        h0.e(1);
        return objRetrying;
    }
}
