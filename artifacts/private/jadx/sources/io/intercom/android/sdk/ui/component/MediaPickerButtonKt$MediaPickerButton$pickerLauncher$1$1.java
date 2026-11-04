package io.intercom.android.sdk.ui.component;

import android.net.Uri;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.ui.component.MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1", f = "MediaPickerButton.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMediaPickerButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPickerButton.kt\nio/intercom/android/sdk/ui/component/MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,236:1\n1557#2:237\n1628#2,3:238\n*S KotlinDebug\n*F\n+ 1 MediaPickerButton.kt\nio/intercom/android/sdk/ui/component/MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1\n*L\n83#1:237\n83#1:238,3\n*E\n"})
final class MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ List<Uri> $it;
    final /* synthetic */ MediaPickerButtonCTAStyle $mediaPickerButtonCTAStyle;
    final /* synthetic */ androidx.activity.compose.k<IntercomPreviewArgs, List<Uri>> $previewLauncher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(androidx.activity.compose.k<IntercomPreviewArgs, List<Uri>> kVar, List<? extends Uri> list, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, kotlin.coroutines.d<? super MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1> dVar) {
        super(2, dVar);
        this.$previewLauncher = kVar;
        this.$it = list;
        this.$mediaPickerButtonCTAStyle = mediaPickerButtonCTAStyle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(this.$previewLauncher, this.$it, this.$mediaPickerButtonCTAStyle, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            this.label = 1;
            if (d1.b(50L, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        androidx.activity.compose.k<IntercomPreviewArgs, List<Uri>> kVar = this.$previewLauncher;
        List<Uri> list = this.$it;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new IntercomPreviewFile.LocalFile((Uri) it.next()));
        }
        MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle = this.$mediaPickerButtonCTAStyle;
        kVar.b(new IntercomPreviewArgs(arrayList, DeleteType.Remove.INSTANCE, mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TextButton ? ((MediaPickerButtonCTAStyle.TextButton) mediaPickerButtonCTAStyle).getCtaText() : null, this.$mediaPickerButtonCTAStyle instanceof MediaPickerButtonCTAStyle.TopBarButton, null, 16, null));
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
