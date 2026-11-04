package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Upload;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1", f = "SendMediaUseCase.kt", i = {}, l = {285}, m = "invokeSuspend", n = {}, s = {})
final class SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1 extends o implements Function2<s0, kotlin.coroutines.d<? super NetworkResponse<? extends Upload.Builder>>, Object> {
    final /* synthetic */ MediaData.Media $compressedMediaData;
    int label;
    final /* synthetic */ SendMediaUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1(SendMediaUseCase sendMediaUseCase, MediaData.Media media, kotlin.coroutines.d<? super SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1> dVar) {
        super(2, dVar);
        this.this$0 = sendMediaUseCase;
        this.$compressedMediaData = media;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1(this.this$0, this.$compressedMediaData, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super NetworkResponse<? extends Upload.Builder>> dVar) {
        return invoke2(s0Var, (kotlin.coroutines.d<? super NetworkResponse<Upload.Builder>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        ResultKt.m(obj);
        ConversationRepository conversationRepository = this.this$0.conversationRepository;
        MediaData.Media media = this.$compressedMediaData;
        this.label = 1;
        Object objUploadMedia = conversationRepository.uploadMedia(media, this);
        return objUploadMedia == objL ? objL : objUploadMedia;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super NetworkResponse<Upload.Builder>> dVar) {
        return ((SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
