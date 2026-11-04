package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1$1$3$1", f = "SearchBrowseCard.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSearchBrowseCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBrowseCard.kt\nio/intercom/android/sdk/m5/components/SearchBrowseCardKt$SearchBrowseCard$1$1$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,270:1\n1557#2:271\n1628#2,3:272\n*S KotlinDebug\n*F\n+ 1 SearchBrowseCard.kt\nio/intercom/android/sdk/m5/components/SearchBrowseCardKt$SearchBrowseCard$1$1$3$1\n*L\n118#1:271\n118#1:272,3\n*E\n"})
final class SearchBrowseCardKt$SearchBrowseCard$1$1$3$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ List<SuggestedArticle> $articleSuggestions;
    final /* synthetic */ MetricTracker $metricTracker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(MetricTracker metricTracker, List<SuggestedArticle> list, kotlin.coroutines.d<? super SearchBrowseCardKt$SearchBrowseCard$1$1$3$1> dVar) {
        super(2, dVar);
        this.$metricTracker = metricTracker;
        this.$articleSuggestions = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(this.$metricTracker, this.$articleSuggestions, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        MetricTracker metricTracker = this.$metricTracker;
        List<SuggestedArticle> list = this.$articleSuggestions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SuggestedArticle) it.next()).getId());
        }
        metricTracker.viewedArticleSuggestions(arrayList);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((SearchBrowseCardKt$SearchBrowseCard$1$1$3$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
