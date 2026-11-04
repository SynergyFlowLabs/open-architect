package io.intercom.android.sdk.m5.upload.data;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.facebook.share.internal.k;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Upload;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import okhttp3.e0;
import okhttp3.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class UploadRepository {
    public static final int $stable = 8;

    @NotNull
    private final Context context;

    @NotNull
    private final ExternalUploadApi externalUploadApi;

    @NotNull
    private final MessengerApi messengerApi;

    @NotNull
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.upload.data.UploadRepository$uploadFile$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.upload.data.UploadRepository", f = "UploadRepository.kt", i = {0, 0, 1}, l = {42, 48}, m = "uploadFile", n = {"this", "imageData", "uploadUrlResponse"}, s = {"L$0", "L$1", "L$0"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
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
            return UploadRepository.this.uploadFile(null, this);
        }
    }

    public UploadRepository() {
        this(null, null, null, null, 15, null);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x020b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x020c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    @Nullable
    public final Object uploadFile(@NotNull MediaData.Media media, @NotNull kotlin.coroutines.d<? super NetworkResponse<Upload.Builder>> dVar) {
        AnonymousClass1 anonymousClass1;
        NetworkResponse networkResponse;
        NetworkResponse networkResponse2;
        UploadRepository uploadRepository = this;
        MediaData.Media media2 = media;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = uploadRepository.new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = uploadRepository.new AnonymousClass1(dVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object uploadFileUrlSuspended = anonymousClass2.result;
        Object objL = b.l();
        int i11 = anonymousClass2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                MediaData.Media media3 = (MediaData.Media) anonymousClass2.L$1;
                UploadRepository uploadRepository2 = (UploadRepository) anonymousClass2.L$0;
                ResultKt.m(uploadFileUrlSuspended);
                media2 = media3;
                uploadRepository = uploadRepository2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                networkResponse = (NetworkResponse) anonymousClass2.L$0;
                ResultKt.m(uploadFileUrlSuspended);
            }
            networkResponse2 = (NetworkResponse) uploadFileUrlSuspended;
            if ((networkResponse2 instanceof NetworkResponse.ClientError) || (networkResponse2 instanceof NetworkResponse.NetworkError) || (networkResponse2 instanceof NetworkResponse.ServerError)) {
                return networkResponse2;
            }
            if (networkResponse2 instanceof NetworkResponse.Success) {
                return networkResponse;
            }
            throw new k0();
        }
        ResultKt.m(uploadFileUrlSuspended);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("original_filename", media2.getFileName());
        mapCreateMapBuilder.put("size_in_bytes", kotlin.coroutines.jvm.internal.b.g(media2.getSize()));
        mapCreateMapBuilder.put("content_type", media2.getMimeType());
        if (media2 instanceof MediaData.Media.Image) {
            MediaData.Media.Image image = (MediaData.Media.Image) media2;
            mapCreateMapBuilder.put("width", kotlin.coroutines.jvm.internal.b.f(image.getWidth()));
            mapCreateMapBuilder.put("height", kotlin.coroutines.jvm.internal.b.f(image.getHeight()));
            if (!image.getExifData().isEmpty()) {
                mapCreateMapBuilder.put("image_exif", image.getExifData());
            }
        }
        if (media2 instanceof MediaData.Media.Video) {
            MediaData.Media.Video video = (MediaData.Media.Video) media2;
            mapCreateMapBuilder.put("width", kotlin.coroutines.jvm.internal.b.f(video.getWidth()));
            mapCreateMapBuilder.put("height", kotlin.coroutines.jvm.internal.b.f(video.getHeight()));
        }
        e0 defaultRequestBody$intercom_sdk_base_release = MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("upload", MapsKt.build(mapCreateMapBuilder)), TuplesKt.to("user", uploadRepository.userIdentity.toMap()), TuplesKt.to("include_metadata", kotlin.coroutines.jvm.internal.b.a(true))));
        MessengerApi messengerApi = uploadRepository.messengerApi;
        anonymousClass2.L$0 = uploadRepository;
        anonymousClass2.L$1 = media2;
        anonymousClass2.label = 1;
        uploadFileUrlSuspended = messengerApi.getUploadFileUrlSuspended(defaultRequestBody$intercom_sdk_base_release, anonymousClass2);
        if (uploadFileUrlSuspended != objL) {
        }
        return objL;
        NetworkResponse networkResponse3 = (NetworkResponse) uploadFileUrlSuspended;
        if ((networkResponse3 instanceof NetworkResponse.ClientError) || (networkResponse3 instanceof NetworkResponse.NetworkError) || (networkResponse3 instanceof NetworkResponse.ServerError)) {
            return networkResponse3;
        }
        if (!(networkResponse3 instanceof NetworkResponse.Success)) {
            throw new k0();
        }
        Upload uploadBuild = ((Upload.Builder) ((NetworkResponse.Success) networkResponse3).getBody()).build();
        ExternalUploadApi externalUploadApi = uploadRepository.externalUploadApi;
        String uploadDestination = uploadBuild.getUploadDestination();
        y.c.a aVar = y.c.f334834c;
        String key = uploadBuild.getKey();
        Intrinsics.checkNotNullExpressionValue(key, "getKey(...)");
        y.c cVarC = aVar.c("key", key);
        String acl = uploadBuild.getAcl();
        Intrinsics.checkNotNullExpressionValue(acl, "getAcl(...)");
        y.c cVarC2 = aVar.c("acl", acl);
        String contentType = uploadBuild.getContentType();
        Intrinsics.checkNotNullExpressionValue(contentType, "getContentType(...)");
        y.c cVarC3 = aVar.c("Content-Type", contentType);
        String awsAccessKey = uploadBuild.getAwsAccessKey();
        Intrinsics.checkNotNullExpressionValue(awsAccessKey, "getAwsAccessKey(...)");
        y.c cVarC4 = aVar.c("AWSAccessKeyId", awsAccessKey);
        String policy = uploadBuild.getPolicy();
        Intrinsics.checkNotNullExpressionValue(policy, "getPolicy(...)");
        y.c cVarC5 = aVar.c("policy", policy);
        String signature = uploadBuild.getSignature();
        Intrinsics.checkNotNullExpressionValue(signature, "getSignature(...)");
        y.c cVarC6 = aVar.c("signature", signature);
        String successActionStatus = uploadBuild.getSuccessActionStatus();
        Intrinsics.checkNotNullExpressionValue(successActionStatus, "getSuccessActionStatus(...)");
        y.c cVarC7 = aVar.c("success_action_status", successActionStatus);
        y.c cVarC8 = aVar.c("x-amz-meta-safe_app_id", uploadBuild.getMetadata().getSafeAppId());
        y.c cVarD = aVar.d(k.f101891c, media2.getFileName(), new UploadRequestBody(uploadRepository.context, media2));
        anonymousClass2.L$0 = networkResponse3;
        anonymousClass2.L$1 = null;
        anonymousClass2.label = 2;
        Object objUploadFileSuspended = externalUploadApi.uploadFileSuspended(uploadDestination, cVarC, cVarC2, cVarC3, cVarC4, cVarC5, cVarC6, cVarC7, cVarC8, cVarD, anonymousClass2);
        if (objUploadFileSuspended != objL) {
            uploadFileUrlSuspended = objUploadFileSuspended;
            networkResponse = networkResponse3;
            networkResponse2 = (NetworkResponse) uploadFileUrlSuspended;
            if (networkResponse2 instanceof NetworkResponse.ClientError) {
                if (networkResponse2 instanceof NetworkResponse.Success) {
                    return networkResponse;
                }
                throw new k0();
            }
            return networkResponse2;
        }
        return objL;
    }

    public UploadRepository(@NotNull MessengerApi messengerApi, @NotNull ExternalUploadApi externalUploadApi, @NotNull UserIdentity userIdentity, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        Intrinsics.checkNotNullParameter(externalUploadApi, "externalUploadApi");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(context, "context");
        this.messengerApi = messengerApi;
        this.externalUploadApi = externalUploadApi;
        this.userIdentity = userIdentity;
        this.context = context;
    }

    public /* synthetic */ UploadRepository(MessengerApi messengerApi, ExternalUploadApi externalUploadApi, UserIdentity userIdentity, Context context, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i10 & 2) != 0 ? Injector.get().getExternalUploadApi() : externalUploadApi, (i10 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 8) != 0 ? Injector.get().getApplication() : context);
    }
}
