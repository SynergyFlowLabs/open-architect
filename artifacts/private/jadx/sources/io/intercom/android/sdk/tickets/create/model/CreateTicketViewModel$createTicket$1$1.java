package io.intercom.android.sdk.tickets.create.model;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$createTicket$1$1", f = "CreateTicketViewModel.kt", i = {}, l = {160, 167}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCreateTicketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$createTicket$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,499:1\n1863#2,2:500\n1734#2,3:502\n230#2,2:505\n1#3:507\n*S KotlinDebug\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$createTicket$1$1\n*L\n143#1:500,2\n147#1:502,3\n149#1:505,2\n*E\n"})
final class CreateTicketViewModel$createTicket$1$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ s0 $compositionAwareScope;
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$createTicket$1$1(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, s0 s0Var, kotlin.coroutines.d<? super CreateTicketViewModel$createTicket$1$1> dVar) {
        super(2, dVar);
        this.$content = content;
        this.this$0 = createTicketViewModel;
        this.$compositionAwareScope = s0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, null, null, true, false, 11, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        int i10 = 7 >> 0;
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, null, null, false, false, 11, null));
        return Unit.f312394a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new CreateTicketViewModel$createTicket$1$1(this.$content, this.this$0, this.$compositionAwareScope, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fc, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L44;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$createTicket$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((CreateTicketViewModel$createTicket$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
