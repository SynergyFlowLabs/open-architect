package io.intercom.android.sdk.api;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import kotlin.Unit;
import okhttp3.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes13.dex */
public interface ExternalUploadApi {
    @POST
    @Nullable
    @Multipart
    Object uploadFileSuspended(@Url @Nullable String str, @NotNull @Part y.c cVar, @NotNull @Part y.c cVar2, @NotNull @Part y.c cVar3, @NotNull @Part y.c cVar4, @NotNull @Part y.c cVar5, @NotNull @Part y.c cVar6, @NotNull @Part y.c cVar7, @NotNull @Part y.c cVar8, @NotNull @Part y.c cVar9, @NotNull kotlin.coroutines.d<? super NetworkResponse<Unit>> dVar);
}
