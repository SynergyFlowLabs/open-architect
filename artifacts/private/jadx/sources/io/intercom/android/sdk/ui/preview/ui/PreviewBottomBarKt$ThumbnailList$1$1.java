package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.lazy.j1;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1", f = "PreviewBottomBar.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160715o1}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPreviewBottomBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewBottomBar.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewBottomBarKt$ThumbnailList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n1557#2:136\n1628#2,3:137\n*S KotlinDebug\n*F\n+ 1 PreviewBottomBar.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewBottomBarKt$ThumbnailList$1$1\n*L\n96#1:136\n96#1:137,3\n*E\n"})
final class PreviewBottomBarKt$ThumbnailList$1$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ j1 $listState;
    final /* synthetic */ n3<List<Integer>> $visibleItems;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreviewBottomBarKt$ThumbnailList$1$1(j1 j1Var, n3<List<Integer>> n3Var, kotlin.coroutines.d<? super PreviewBottomBarKt$ThumbnailList$1$1> dVar) {
        super(2, dVar);
        this.$listState = j1Var;
        this.$visibleItems = n3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$1(j1 j1Var) {
        List<androidx.compose.foundation.lazy.v> listH = j1Var.K().h();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listH, 10));
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((androidx.compose.foundation.lazy.v) it.next()).getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PreviewBottomBarKt$ThumbnailList$1$1(this.$listState, this.$visibleItems, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            final j1 j1Var = this.$listState;
            kotlinx.coroutines.flow.i iVarY = w6.y(new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PreviewBottomBarKt$ThumbnailList$1$1.invokeSuspend$lambda$1(j1Var);
                }
            });
            final n3<List<Integer>> n3Var = this.$visibleItems;
            kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1.2
                @Override // kotlinx.coroutines.flow.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                    return emit((List<Integer>) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                }

                public final Object emit(List<Integer> list, kotlin.coroutines.d<? super Unit> dVar) {
                    n3Var.setValue(list);
                    return Unit.f312394a;
                }
            };
            this.label = 1;
            if (iVarY.collect(jVar, this) == objL) {
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
        return ((PreviewBottomBarKt$ThumbnailList$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
