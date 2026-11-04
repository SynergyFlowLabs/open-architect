package io.intercom.android.sdk.lightcompressor;

import android.content.Context;
import android.net.Uri;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1$job$1", f = "VideoCompressor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class VideoCompressor$doVideoCompression$1$job$1 extends o implements Function2<s0, d<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $i;
    final /* synthetic */ List<Uri> $uris;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoCompressor$doVideoCompression$1$job$1(Context context, List<? extends Uri> list, int i10, d<? super VideoCompressor$doVideoCompression$1$job$1> dVar) {
        super(2, dVar);
        this.$context = context;
        this.$uris = list;
        this.$i = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoCompressor$doVideoCompression$1$job$1(this.$context, this.$uris, this.$i, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        return VideoCompressor.INSTANCE.getMediaPath(this.$context, this.$uris.get(this.$i));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super String> dVar) {
        return ((VideoCompressor$doVideoCompression$1$job$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
