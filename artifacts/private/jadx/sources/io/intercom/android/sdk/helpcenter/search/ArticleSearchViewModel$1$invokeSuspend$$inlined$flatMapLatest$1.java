package io.intercom.android.sdk.helpcenter.search;

import com.devtodev.core.data.metrics.MetricConsts;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ArticleSearchViewModel.kt", i = {0}, l = {216, 189}, m = "invokeSuspend", n = {MetricConsts.Install}, s = {"L$1"})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 ArticleSearchViewModel.kt\nio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$1\n*L\n1#1,214:1\n63#2,6:215\n62#2,9:221\n*E\n"})
public final class ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super Pair<? extends NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>, ? extends String>>, String, kotlin.coroutines.d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(kotlin.coroutines.d dVar, ArticleSearchViewModel articleSearchViewModel) {
        super(3, dVar);
        this.this$0 = articleSearchViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (kotlinx.coroutines.flow.k.o0(r3, r13, r9) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r13.label
            r2 = 7
            r2 = 2
            r3 = 4
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.m(r14)
            goto L7f
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L1d:
            java.lang.Object r1 = r13.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r13.L$0
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.j) r3
            kotlin.ResultKt.m(r14)
            r9 = r13
            r12 = 7
            goto L68
        L2b:
            r12 = 4
            kotlin.ResultKt.m(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.j) r14
            r12 = 1
            java.lang.Object r1 = r13.L$1
            r6 = r1
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r1 = r13.this$0
            io.intercom.android.sdk.helpcenter.api.HelpCenterApi r5 = io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.access$getHelpCenterApi$p(r1)
            r12 = 5
            io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r1 = r13.this$0
            boolean r1 = io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.access$isFromSearchBrowse$p(r1)
            if (r1 == 0) goto L50
            java.lang.String r1 = "ebscowerr_ssh"
            java.lang.String r1 = "search_browse"
            r7 = r1
            r7 = r1
            goto L51
        L50:
            r7 = r4
        L51:
            r13.L$0 = r14
            r12 = 6
            r13.L$1 = r6
            r13.label = r3
            r8 = 0
            r12 = 2
            r10 = 4
            r11 = 0
            r12 = r11
            r9 = r13
            java.lang.Object r13 = io.intercom.android.sdk.helpcenter.api.HelpCenterApi.DefaultImpls.searchForArticles$default(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L65
            goto L7e
        L65:
            r3 = r14
            r1 = r6
            r14 = r13
        L68:
            r12 = 4
            kotlin.Pair r13 = new kotlin.Pair
            r13.<init>(r14, r1)
            kotlinx.coroutines.flow.i r13 = kotlinx.coroutines.flow.k.N0(r13)
            r9.L$0 = r4
            r9.L$1 = r4
            r9.label = r2
            java.lang.Object r13 = kotlinx.coroutines.flow.k.o0(r3, r13, r9)
            if (r13 != r0) goto L7f
        L7e:
            return r0
        L7f:
            kotlin.Unit r13 = kotlin.Unit.f312394a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // pj.n
    @Nullable
    public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super Pair<? extends NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>, ? extends String>> jVar, String str, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
        ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = new ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(dVar, this.this$0);
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = jVar;
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = str;
        return articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.f312394a);
    }
}
