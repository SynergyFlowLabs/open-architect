package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Conversation;
import java.util.ArrayList;
import java.util.Collection;
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
@SourceDebugExtension({"SMAP\nSubmitAttributeUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitAttributeUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SubmitAttributeUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n226#2,3:66\n229#2,2:72\n226#2,3:74\n229#2,2:83\n226#2,3:85\n229#2,2:91\n827#3:69\n855#3,2:70\n827#3:77\n855#3,2:78\n827#3:80\n855#3,2:81\n827#3:88\n855#3,2:89\n*S KotlinDebug\n*F\n+ 1 SubmitAttributeUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/SubmitAttributeUseCase\n*L\n19#1:66,3\n19#1:72,2\n36#1:74,3\n36#1:83,2\n53#1:85,3\n53#1:91,2\n22#1:69\n22#1:70,2\n38#1:77\n38#1:78,2\n41#1:80\n41#1:81,2\n56#1:88\n56#1:89,2\n*E\n"})
public final class SubmitAttributeUseCase {
    public static final int $stable = 8;

    @NotNull
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase$invoke$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase", f = "SubmitAttributeUseCase.kt", i = {0, 0}, l = {27}, m = "invoke", n = {"clientStateFlow", "attribute"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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
            return SubmitAttributeUseCase.this.invoke(null, null, null, this);
        }
    }

    public SubmitAttributeUseCase(@NotNull ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.conversationRepository = conversationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Nullable
    public final Object invoke(@NotNull k0<ConversationClientState> k0Var, @NotNull Attribute attribute, @NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        List listPlus;
        ArrayList arrayList;
        Attribute attribute2;
        ConversationClientState value2;
        ConversationClientState conversationClientState2;
        List listPlus2;
        ArrayList arrayList2;
        ConversationClientState value3;
        ConversationClientState conversationClientState3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        k0<ConversationClientState> k0Var2 = k0Var;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objSubmitForm = anonymousClass2.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass2.label;
        if (i11 == 0) {
            ResultKt.m(objSubmitForm);
            Conversation conversation = k0Var2.getValue().getConversation();
            if (conversation == null) {
                return Unit.f312394a;
            }
            do {
                value = k0Var2.getValue();
                conversationClientState = value;
                listPlus = CollectionsKt.plus((Collection<? extends String>) conversationClientState.getLoadingAttributeIdentifiers(), attribute.getIdentifier());
                List<String> failedAttributeIdentifiers = conversationClientState.getFailedAttributeIdentifiers();
                arrayList = new ArrayList();
                for (Object obj : failedAttributeIdentifiers) {
                    if (!Intrinsics.areEqual((String) obj, attribute.getIdentifier())) {
                        arrayList.add(obj);
                    }
                }
            } while (!k0Var2.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, null, null, null, null, null, null, null, null, null, null, arrayList, listPlus, null, null, 0, 0, null, null, false, false, null, null, 4191231, null)));
            ConversationRepository conversationRepository = this.conversationRepository;
            String id2 = conversation.getId();
            String identifier = attribute.getIdentifier();
            String value4 = attribute.getValue();
            if (value4 == null) {
                value4 = "";
            }
            String type = attribute.getType();
            anonymousClass2.L$0 = k0Var2;
            anonymousClass2.L$1 = attribute;
            anonymousClass2.label = 1;
            objSubmitForm = conversationRepository.submitForm(id2, str, identifier, value4, type, anonymousClass2);
            if (objSubmitForm == objL) {
                return objL;
            }
            attribute2 = attribute;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Attribute attribute3 = (Attribute) anonymousClass2.L$1;
            k0Var2 = (k0) anonymousClass2.L$0;
            ResultKt.m(objSubmitForm);
            attribute2 = attribute3;
        }
        k0<ConversationClientState> k0Var3 = k0Var2;
        NetworkResponse networkResponse = (NetworkResponse) objSubmitForm;
        if (networkResponse instanceof NetworkResponse.Success) {
            do {
                value3 = k0Var3.getValue();
                conversationClientState3 = value3;
                List<String> failedAttributeIdentifiers2 = conversationClientState3.getFailedAttributeIdentifiers();
                arrayList3 = new ArrayList();
                for (Object obj2 : failedAttributeIdentifiers2) {
                    if (!Intrinsics.areEqual((String) obj2, attribute2.getIdentifier())) {
                        arrayList3.add(obj2);
                    }
                }
                List<String> loadingAttributeIdentifiers = conversationClientState3.getLoadingAttributeIdentifiers();
                arrayList4 = new ArrayList();
                for (Object obj3 : loadingAttributeIdentifiers) {
                    if (!Intrinsics.areEqual((String) obj3, attribute2.getIdentifier())) {
                        arrayList4.add(obj3);
                    }
                }
            } while (!k0Var3.compareAndSet(value3, ConversationClientState.copy$default(conversationClientState3, null, (Conversation) ((NetworkResponse.Success) networkResponse).getBody(), null, null, null, null, null, null, null, null, arrayList3, arrayList4, null, null, 0, 0, null, null, false, false, null, null, 4191229, null)));
        } else {
            if (!(networkResponse instanceof NetworkResponse.ClientError) && !(networkResponse instanceof NetworkResponse.NetworkError) && !(networkResponse instanceof NetworkResponse.ServerError)) {
                throw new kotlin.k0();
            }
            do {
                value2 = k0Var3.getValue();
                conversationClientState2 = value2;
                listPlus2 = CollectionsKt.plus((Collection<? extends String>) conversationClientState2.getFailedAttributeIdentifiers(), attribute2.getIdentifier());
                List<String> loadingAttributeIdentifiers2 = conversationClientState2.getLoadingAttributeIdentifiers();
                arrayList2 = new ArrayList();
                for (Object obj4 : loadingAttributeIdentifiers2) {
                    if (!Intrinsics.areEqual((String) obj4, attribute2.getIdentifier())) {
                        arrayList2.add(obj4);
                    }
                }
            } while (!k0Var3.compareAndSet(value2, ConversationClientState.copy$default(conversationClientState2, null, null, null, null, null, null, null, null, null, null, listPlus2, arrayList2, null, null, 0, 0, null, null, false, false, null, null, 4191231, null)));
        }
        return Unit.f312394a;
    }
}
