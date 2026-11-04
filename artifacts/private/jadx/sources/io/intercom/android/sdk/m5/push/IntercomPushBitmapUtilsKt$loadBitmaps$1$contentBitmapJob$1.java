package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1", f = "IntercomPushBitmapUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ i1.h<Bitmap> $contentBitmap;
    final /* synthetic */ String $contentImageUrl;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1(i1.h<Bitmap> hVar, Context context, String str, kotlin.coroutines.d<? super IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1> dVar) {
        super(2, dVar);
        this.$contentBitmap = hVar;
        this.$context = context;
        this.$contentImageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1(this.$contentBitmap, this.$context, this.$contentImageUrl, dVar);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, android.graphics.Bitmap] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.$contentBitmap.f312751a = IntercomPushBitmapUtilsKt.loadContentBitmapBlocking(this.$context, this.$contentImageUrl);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
