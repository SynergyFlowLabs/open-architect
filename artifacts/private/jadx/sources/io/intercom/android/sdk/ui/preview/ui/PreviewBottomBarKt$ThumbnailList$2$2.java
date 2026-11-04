package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.lazy.j1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$2$2", f = "PreviewBottomBar.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
final class PreviewBottomBarKt$ThumbnailList$2$2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ int $currentPage;
    final /* synthetic */ j1 $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreviewBottomBarKt$ThumbnailList$2$2(j1 j1Var, int i10, kotlin.coroutines.d<? super PreviewBottomBarKt$ThumbnailList$2$2> dVar) {
        super(2, dVar);
        this.$listState = j1Var;
        this.$currentPage = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PreviewBottomBarKt$ThumbnailList$2$2(this.$listState, this.$currentPage, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            j1 j1Var = this.$listState;
            int i11 = this.$currentPage;
            this.label = 1;
            if (j1.x(j1Var, i11, 0, this, 2, null) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((PreviewBottomBarKt$ThumbnailList$2$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
