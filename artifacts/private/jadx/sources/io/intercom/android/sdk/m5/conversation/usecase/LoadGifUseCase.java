package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.GifResponse;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLoadGifUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadGifUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/LoadGifUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,31:1\n226#2,5:32\n*S KotlinDebug\n*F\n+ 1 LoadGifUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/LoadGifUseCase\n*L\n26#1:32,5\n*E\n"})
public final class LoadGifUseCase {
    public static final int $stable = 8;

    @NotNull
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase", f = "LoadGifUseCase.kt", i = {0}, l = {17}, m = "invoke", n = {"clientStateFlow"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
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
            return LoadGifUseCase.this.invoke(null, null, this);
        }
    }

    public LoadGifUseCase(@NotNull ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.conversationRepository = conversationRepository;
    }

    public static /* synthetic */ Object invoke$default(LoadGifUseCase loadGifUseCase, k0 k0Var, String str, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return loadGifUseCase.invoke(k0Var, str, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        k0<ConversationClientState> k0Var2;
        BottomSheetState.GifSearch gifSearch;
        ConversationClientState value;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            ConversationRepository conversationRepository = this.conversationRepository;
            anonymousClass1.L$0 = k0Var;
            anonymousClass1.label = 1;
            Object objLoadGifs = conversationRepository.loadGifs(str, anonymousClass1);
            if (objLoadGifs == objL) {
                return objL;
            }
            obj = objLoadGifs;
            k0Var2 = k0Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var2 = (k0) anonymousClass1.L$0;
            ResultKt.m(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            gifSearch = new BottomSheetState.GifSearch(CollectionsKt.emptyList());
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new kotlin.k0();
            }
            List<Block> listResults = ((GifResponse) ((NetworkResponse.Success) networkResponse).getBody()).results();
            Intrinsics.checkNotNullExpressionValue(listResults, "results(...)");
            gifSearch = new BottomSheetState.GifSearch(listResults);
        }
        BottomSheetState.GifSearch gifSearch2 = gifSearch;
        do {
            value = k0Var2.getValue();
        } while (!k0Var2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, gifSearch2, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194271, null)));
        return Unit.f312394a;
    }
}
