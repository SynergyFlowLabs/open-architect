package io.intercom.android.sdk.tickets.create.model;

import android.content.Context;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.j2;
import androidx.lifecycle.m2;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.create.reducers.ConditionalAttributesReducerKt;
import io.intercom.android.sdk.tickets.create.reducers.CreateTicketReducerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCreateTicketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,499:1\n774#2:500\n865#2,2:501\n1863#2,2:503\n230#2,2:505\n230#2,2:507\n230#2,2:509\n774#2:511\n865#2,2:512\n1755#2,3:514\n*S KotlinDebug\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel\n*L\n294#1:500\n294#1:501,2\n294#1:503,2\n310#1:505,2\n312#1:507,2\n322#1:509,2\n332#1:511\n332#1:512,2\n337#1:514,3\n*E\n"})
public final class CreateTicketViewModel extends f2 {

    @NotNull
    private final j0<TicketSideEffect> _effect;

    @NotNull
    private final k0<CreateTicketFormUiState> _uiState;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final AppConfig config;

    @Nullable
    private final String conversationId;

    @Nullable
    private TicketTypeV2 currentTicketType;

    @NotNull
    private final n0 dispatcher;

    @NotNull
    private final o0<TicketSideEffect> effect;

    @Nullable
    private CreateTicketFormUiState.Content lastKnownContentState;

    @NotNull
    private final CreateTicketLaunchedFrom launchedFrom;

    @NotNull
    private final MetricTracker metricTracker;

    @NotNull
    private final TicketRepository ticketRepository;
    private final int ticketTypeId;

    @NotNull
    private final z0<CreateTicketFormUiState> uiState;

    @NotNull
    private final UserIdentity userIdentity;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1", f = "CreateTicketViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CreateTicketViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = CreateTicketViewModel.this._uiState;
                final CreateTicketViewModel createTicketViewModel = CreateTicketViewModel.this;
                kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.1.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((CreateTicketFormUiState) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(CreateTicketFormUiState createTicketFormUiState, kotlin.coroutines.d<? super Unit> dVar) {
                        if (createTicketFormUiState instanceof CreateTicketFormUiState.Content) {
                            createTicketViewModel.lastKnownContentState = (CreateTicketFormUiState.Content) createTicketFormUiState;
                        }
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (k0Var.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$Companion$factory$1] */
        private final CreateTicketViewModel$Companion$factory$1 factory(final int i10, final String str, final CreateTicketLaunchedFrom createTicketLaunchedFrom) {
            return new j2.c() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$Companion$factory$1
                @Override // androidx.lifecycle.j2.c
                public <T extends f2> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new CreateTicketViewModel(createTicketLaunchedFrom, null, null, null, null, null, str, i10, null, v.a.f43976s, null);
                }
            };
        }

        @NotNull
        public final CreateTicketViewModel create(@NotNull m2 owner, int i10, @Nullable String str, @NotNull CreateTicketLaunchedFrom launchedFrom) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
            return (CreateTicketViewModel) new j2(owner, factory(i10, str, launchedFrom)).c(CreateTicketViewModel.class);
        }

        private Companion() {
        }
    }

    @w0(parameters = 1)
    public static abstract class CreateTicketFormUiState {
        public static final int $stable = 0;

        @w0(parameters = 0)
        public static final class Content extends CreateTicketFormUiState {
            public static final int $stable = 8;
            private final boolean enableCta;

            @NotNull
            private final List<QuestionState> questions;
            private final boolean showCreatingTicketProgress;

            @NotNull
            private final String title;

            public /* synthetic */ Content(String str, List list, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, list, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? true : z11);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Content copy$default(Content content, String str, List list, boolean z10, boolean z11, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = content.title;
                }
                if ((i10 & 2) != 0) {
                    list = content.questions;
                }
                if ((i10 & 4) != 0) {
                    z10 = content.showCreatingTicketProgress;
                }
                if ((i10 & 8) != 0) {
                    z11 = content.enableCta;
                }
                return content.copy(str, list, z10, z11);
            }

            @NotNull
            public final String component1() {
                return this.title;
            }

            @NotNull
            public final List<QuestionState> component2() {
                return this.questions;
            }

            public final boolean component3() {
                return this.showCreatingTicketProgress;
            }

            public final boolean component4() {
                return this.enableCta;
            }

            @NotNull
            public final Content copy(@NotNull String title, @NotNull List<QuestionState> questions, boolean z10, boolean z11) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(questions, "questions");
                return new Content(title, questions, z10, z11);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.questions, content.questions) && this.showCreatingTicketProgress == content.showCreatingTicketProgress && this.enableCta == content.enableCta;
            }

            public final boolean getEnableCta() {
                return this.enableCta;
            }

            @NotNull
            public final List<QuestionState> getQuestions() {
                return this.questions;
            }

            public final boolean getShowCreatingTicketProgress() {
                return this.showCreatingTicketProgress;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((this.title.hashCode() * 31) + this.questions.hashCode()) * 31) + Boolean.hashCode(this.showCreatingTicketProgress)) * 31) + Boolean.hashCode(this.enableCta);
            }

            @NotNull
            public String toString() {
                return "Content(title=" + this.title + ", questions=" + this.questions + ", showCreatingTicketProgress=" + this.showCreatingTicketProgress + ", enableCta=" + this.enableCta + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Content(@NotNull String title, @NotNull List<QuestionState> questions, boolean z10, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(questions, "questions");
                this.title = title;
                this.questions = questions;
                this.showCreatingTicketProgress = z10;
                this.enableCta = z11;
            }
        }

        @w0(parameters = 1)
        public static final class Error extends CreateTicketFormUiState {
            public static final int $stable = 0;

            @NotNull
            private final ErrorState errorState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull ErrorState errorState) {
                super(null);
                Intrinsics.checkNotNullParameter(errorState, "errorState");
                this.errorState = errorState;
            }

            public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    errorState = error.errorState;
                }
                return error.copy(errorState);
            }

            @NotNull
            public final ErrorState component1() {
                return this.errorState;
            }

            @NotNull
            public final Error copy(@NotNull ErrorState errorState) {
                Intrinsics.checkNotNullParameter(errorState, "errorState");
                return new Error(errorState);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.errorState, ((Error) obj).errorState);
            }

            @NotNull
            public final ErrorState getErrorState() {
                return this.errorState;
            }

            public int hashCode() {
                return this.errorState.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorState=" + this.errorState + ')';
            }
        }

        @w0(parameters = 1)
        public static final class Initial extends CreateTicketFormUiState {
            public static final int $stable = 0;

            @NotNull
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof Initial);
            }

            public int hashCode() {
                return 1870846745;
            }

            @NotNull
            public String toString() {
                return "Initial";
            }
        }

        @w0(parameters = 1)
        public static final class Loading extends CreateTicketFormUiState {
            public static final int $stable = 0;

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public int hashCode() {
                return 259155217;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ CreateTicketFormUiState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CreateTicketFormUiState() {
        }
    }

    @w0(parameters = 1)
    public static abstract class TicketSideEffect {
        public static final int $stable = 0;

        @w0(parameters = 0)
        public static final class AnswerClicked extends TicketSideEffect {
            public static final int $stable = 8;

            @NotNull
            private final AnswerClickData answerClickData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnswerClicked(@NotNull AnswerClickData answerClickData) {
                super(null);
                Intrinsics.checkNotNullParameter(answerClickData, "answerClickData");
                this.answerClickData = answerClickData;
            }

            public static /* synthetic */ AnswerClicked copy$default(AnswerClicked answerClicked, AnswerClickData answerClickData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    answerClickData = answerClicked.answerClickData;
                }
                return answerClicked.copy(answerClickData);
            }

            @NotNull
            public final AnswerClickData component1() {
                return this.answerClickData;
            }

            @NotNull
            public final AnswerClicked copy(@NotNull AnswerClickData answerClickData) {
                Intrinsics.checkNotNullParameter(answerClickData, "answerClickData");
                return new AnswerClicked(answerClickData);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnswerClicked) && Intrinsics.areEqual(this.answerClickData, ((AnswerClicked) obj).answerClickData);
            }

            @NotNull
            public final AnswerClickData getAnswerClickData() {
                return this.answerClickData;
            }

            public int hashCode() {
                return this.answerClickData.hashCode();
            }

            @NotNull
            public String toString() {
                return "AnswerClicked(answerClickData=" + this.answerClickData + ')';
            }
        }

        @w0(parameters = 1)
        public static final class Finish extends TicketSideEffect {
            public static final int $stable = 0;

            @NotNull
            public static final Finish INSTANCE = new Finish();

            private Finish() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof Finish);
            }

            public int hashCode() {
                return -1916377057;
            }

            @NotNull
            public String toString() {
                return "Finish";
            }
        }

        public /* synthetic */ TicketSideEffect(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TicketSideEffect() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1", f = "CreateTicketViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCreateTicketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$compressAndUploadFileAttachments$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,499:1\n774#2:500\n865#2,2:501\n1557#2:503\n1628#2,3:504\n*S KotlinDebug\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$compressAndUploadFileAttachments$1\n*L\n350#1:500\n350#1:501,2\n351#1:503\n351#1:504,3\n*E\n"})
    static final class C28361 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ List<Answer.MediaAnswer.MediaItem> $mediaItems;
        int label;
        final /* synthetic */ CreateTicketViewModel this$0;

        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1", f = "CreateTicketViewModel.kt", i = {0, 1, 1}, l = {358, 378}, m = "invokeSuspend", n = {"mediaItem", "mediaItem", "compressedMedia"}, s = {"L$2", "L$2", "L$3"})
        @SourceDebugExtension({"SMAP\nCreateTicketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$compressAndUploadFileAttachments$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,499:1\n1863#2,2:500\n*S KotlinDebug\n*F\n+ 1 CreateTicketViewModel.kt\nio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$compressAndUploadFileAttachments$1$1\n*L\n356#1:500,2\n*E\n"})
        static final class C20471 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            final /* synthetic */ List<Answer.MediaAnswer.MediaItem> $itemsToUpload;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ CreateTicketViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C20471(List<Answer.MediaAnswer.MediaItem> list, CreateTicketViewModel createTicketViewModel, kotlin.coroutines.d<? super C20471> dVar) {
                super(2, dVar);
                this.$itemsToUpload = list;
                this.this$0 = createTicketViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C20471(this.$itemsToUpload, this.this$0, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x005d  */
            /* JADX WARN: Code duplicated, block: B:16:0x0080  */
            /* JADX WARN: Code duplicated, block: B:19:0x008f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008f -> B:20:0x00ce). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e8 -> B:25:0x00ec). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 337
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.C28361.C20471.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C20471) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28361(List<Answer.MediaAnswer.MediaItem> list, CreateTicketViewModel createTicketViewModel, kotlin.coroutines.d<? super C28361> dVar) {
            super(2, dVar);
            this.$mediaItems = list;
            this.this$0 = createTicketViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C28361(this.$mediaItems, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List<Answer.MediaAnswer.MediaItem> list = this.$mediaItems;
            ArrayList<Answer.MediaAnswer.MediaItem> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.areEqual(((Answer.MediaAnswer.MediaItem) obj2).getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (Answer.MediaAnswer.MediaItem mediaItem : arrayList) {
                mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE);
                arrayList2.add(mediaItem);
            }
            k.f(g2.a(this.this$0), this.this$0.dispatcher, null, new C20471(arrayList2, this.this$0, null), 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C28361) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$fetchTicketType$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$fetchTicketType$1", f = "CreateTicketViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    static final class C28371 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ List<TicketAttributeRequest> $attributes;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28371(List<TicketAttributeRequest> list, kotlin.coroutines.d<? super C28371> dVar) {
            super(2, dVar);
            this.$attributes = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CreateTicketViewModel createTicketViewModel, List list) {
            createTicketViewModel.fetchTicketType(list);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CreateTicketViewModel.this.new C28371(this.$attributes, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            k0 k0Var;
            Object error;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var2 = CreateTicketViewModel.this._uiState;
                TicketRepository ticketRepository = CreateTicketViewModel.this.ticketRepository;
                int i11 = CreateTicketViewModel.this.ticketTypeId;
                List<TicketAttributeRequest> list = this.$attributes;
                this.L$0 = k0Var2;
                this.label = 1;
                Object objFetchTicketType = ticketRepository.fetchTicketType(i11, list, this);
                if (objFetchTicketType == objL) {
                    return objL;
                }
                k0Var = k0Var2;
                obj = objFetchTicketType;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k0Var = (k0) this.L$0;
                ResultKt.m(obj);
            }
            NetworkResponse networkResponse = (NetworkResponse) obj;
            if (networkResponse instanceof NetworkResponse.Success) {
                TicketTypeV2 ticketTypeV2 = (TicketTypeV2) ((NetworkResponse.Success) networkResponse).getBody();
                CreateTicketViewModel.this.currentTicketType = ticketTypeV2;
                error = CreateTicketReducerKt.convertToTicketFormUiState(ticketTypeV2, CreateTicketViewModel.this.userIdentity, CreateTicketViewModel.this.config, CreateTicketViewModel.this.getLastKnownContent());
            } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                error = new CreateTicketFormUiState.Error(new ErrorState.WithoutCTA(0, 0, kotlin.coroutines.jvm.internal.b.f(R.string.intercom_error_loading_ticket), 3, null));
            } else {
                if (!(networkResponse instanceof NetworkResponse.NetworkError)) {
                    throw new kotlin.k0();
                }
                Integer numF = kotlin.coroutines.jvm.internal.b.f(R.string.intercom_error_loading_ticket);
                final CreateTicketViewModel createTicketViewModel = CreateTicketViewModel.this;
                final List<TicketAttributeRequest> list2 = this.$attributes;
                error = new CreateTicketFormUiState.Error(new ErrorState.WithCTA(0, 0, numF, 0, new Function0() { // from class: io.intercom.android.sdk.tickets.create.model.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTicketViewModel.C28371.invokeSuspend$lambda$0(createTicketViewModel, list2);
                    }
                }, 11, null));
            }
            k0Var.setValue(error);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C28371) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerClicked$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerClicked$1", f = "CreateTicketViewModel.kt", i = {}, l = {413}, m = "invokeSuspend", n = {}, s = {})
    static final class C28381 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ AnswerClickData $answerClickData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28381(AnswerClickData answerClickData, kotlin.coroutines.d<? super C28381> dVar) {
            super(2, dVar);
            this.$answerClickData = answerClickData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return CreateTicketViewModel.this.new C28381(this.$answerClickData, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0 j0Var = CreateTicketViewModel.this._effect;
                TicketSideEffect.AnswerClicked answerClicked = new TicketSideEffect.AnswerClicked(this.$answerClickData);
                this.label = 1;
                if (j0Var.emit(answerClicked, this) == objL) {
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
            return ((C28381) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ CreateTicketViewModel(CreateTicketLaunchedFrom createTicketLaunchedFrom, TicketRepository ticketRepository, UserIdentity userIdentity, AppConfig appConfig, n0 n0Var, MetricTracker metricTracker, String str, int i10, Context context, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(createTicketLaunchedFrom, (i11 & 2) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository, (i11 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i11 & 8) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig, (i11 & 16) != 0 ? l1.c() : n0Var, (i11 & 32) != 0 ? Injector.get().getMetricTracker() : metricTracker, str, i10, (i11 & 256) != 0 ? Injector.get().getApplication() : context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canRetryFileLimitExceededError(Answer.MediaAnswer.MediaItem mediaItem, int i10, int i11) {
        if (!(mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error)) {
            return false;
        }
        Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
        Intrinsics.checkNotNull(uploadStatus, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error");
        return (((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError() instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) && i10 < i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void compressAndUploadFileAttachments(List<Answer.MediaAnswer.MediaItem> list) {
        k.f(g2.a(this), this.dispatcher, null, new C28361(list, this, null), 2, null);
    }

    public static /* synthetic */ void createTicket$default(CreateTicketViewModel createTicketViewModel, s0 s0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s0Var = null;
        }
        createTicketViewModel.createTicket(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTicket$lambda$0(CreateTicketViewModel this$0, s0 s0Var, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        int i10 = 4 ^ 0;
        k.f(g2.a(this$0), this$0.dispatcher, null, new CreateTicketViewModel$createTicket$1$1(content, this$0, s0Var, null), 2, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchTicketType(List<TicketAttributeRequest> list) {
        k.f(g2.a(this), this.dispatcher, null, new C28371(list, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void fetchTicketType$default(CreateTicketViewModel createTicketViewModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        createTicketViewModel.fetchTicketType(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TicketAttributeRequest> getAttributeRequest() {
        final ArrayList arrayList = new ArrayList();
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.getAttributeRequest$lambda$6(arrayList, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAttributeRequest$lambda$6(List list, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(content, "content");
        List<QuestionState> questions = content.getQuestions();
        ArrayList<QuestionState> arrayList = new ArrayList();
        for (Object obj : questions) {
            if (!Intrinsics.areEqual(((QuestionState) obj).getQuestionModel().getId(), CreateTicketViewModelKt.EmailId)) {
                arrayList.add(obj);
            }
        }
        for (QuestionState questionState : arrayList) {
            Object answerForServer = CreateTicketViewModelKt.formatAnswerForServer(questionState);
            if (!Intrinsics.areEqual(answerForServer, Unit.f312394a)) {
                list.add(new TicketAttributeRequest(questionState.getQuestionModel().getId(), answerForServer));
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateTicketFormUiState getLastKnownContent() {
        return this._uiState.getValue() instanceof CreateTicketFormUiState.Content ? this._uiState.getValue() : this.lastKnownContentState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFileSizeExceeded(MediaData.Media media) {
        return media.getSize() > this.config.getAttachmentSettings().getUploadSizeLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUnsupportedFileType(MediaData.Media media, Set<String> set) {
        return !CollectionsKt.contains(set, MimeTypeMap.getSingleton().getExtensionFromMimeType(media.getMimeType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAnswerUpdated$lambda$3(String questionID, final CreateTicketViewModel this$0, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(questionID, "$questionID");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        List<TicketAttributeRequest> listReduceAttributeList = ConditionalAttributesReducerKt.reduceAttributeList(questionID, this$0.currentTicketType, content);
        if (!listReduceAttributeList.isEmpty()) {
            this$0.withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTicketViewModel.onAnswerUpdated$lambda$3$lambda$2$lambda$1(this.f293742a, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
                }
            });
            this$0.fetchTicketType(listReduceAttributeList);
        }
        int i10 = 1 >> 0;
        k.f(g2.a(this$0), this$0.dispatcher, null, new CreateTicketViewModel$onAnswerUpdated$1$2(content, this$0, null), 2, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAnswerUpdated$lambda$3$lambda$2$lambda$1(CreateTicketViewModel this$0, CreateTicketFormUiState.Content it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0._uiState.setValue(CreateTicketFormUiState.Content.copy$default(it, null, null, true, false, 11, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeleteFileClicked$lambda$11(AnswerClickData fileClickData, CreateTicketViewModel this$0, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(fileClickData, "$fileClickData");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        for (QuestionState questionState : content.getQuestions()) {
            if (Intrinsics.areEqual(questionState.getQuestionModel().getId(), fileClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                questionState.setAnswer(new Answer.MediaAnswer(CollectionsKt.minus(((Answer.MediaAnswer) answer).getMediaItems(), fileClickData.getClickedItem())));
                this$0.onAnswerUpdated(fileClickData.getQuestionId());
                return Unit.f312394a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRetryFileClicked$lambda$9(CreateTicketViewModel this$0, AnswerClickData fileClickData, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fileClickData, "$fileClickData");
        Intrinsics.checkNotNullParameter(content, "content");
        for (QuestionState questionState : content.getQuestions()) {
            if (Intrinsics.areEqual(questionState.getQuestionModel().getId(), fileClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                for (Answer.MediaAnswer.MediaItem mediaItem : mediaAnswer.getMediaItems()) {
                    if (Intrinsics.areEqual(mediaItem, fileClickData.getClickedItem())) {
                        mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.None.INSTANCE);
                        questionState.setAnswer(new Answer.MediaAnswer(mediaAnswer.getMediaItems()));
                        this$0.onAnswerUpdated(fileClickData.getQuestionId());
                        return Unit.f312394a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCtaState() {
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.updateCtaState$lambda$14(this.f293746a, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCtaState$lambda$14(CreateTicketViewModel this$0, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        List<QuestionState> questions = content.getQuestions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : questions) {
            if (((QuestionState) obj).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            QuestionState questionState = (QuestionState) it.next();
            questionState.validate();
            if (questionState.getAnswer() instanceof Answer.MediaAnswer) {
                Answer answer = questionState.getAnswer();
                Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                List<Answer.MediaAnswer.MediaItem> mediaItems = ((Answer.MediaAnswer) answer).getMediaItems();
                if (!(mediaItems instanceof Collection) || !mediaItems.isEmpty()) {
                    Iterator<T> it2 = mediaItems.iterator();
                    while (it2.hasNext()) {
                        if (!(((Answer.MediaAnswer.MediaItem) it2.next()).getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success)) {
                            this$0._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, null, null, false, false, 7, null));
                            return Unit.f312394a;
                        }
                        it = it;
                        content = content;
                    }
                }
            }
            it = it;
            content = content;
        }
        int i10 = (4 | 0) ^ 0;
        this$0._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, null, null, false, true, 7, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withState(Function1<? super CreateTicketFormUiState.Content, Unit> function1) {
        if (this._uiState.getValue() instanceof CreateTicketFormUiState.Content) {
            CreateTicketFormUiState value = this._uiState.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState.Content");
            function1.invoke((CreateTicketFormUiState.Content) value);
        }
    }

    public final void createTicket(@Nullable final s0 s0Var) {
        MetricTracker metricTracker = this.metricTracker;
        Integer numValueOf = Integer.valueOf(this.ticketTypeId);
        String str = this.conversationId;
        if (str == null) {
            str = "";
        }
        metricTracker.submittedCreateTicketForm(numValueOf, str, this.launchedFrom.getFrom());
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.createTicket$lambda$0(this.f293738a, s0Var, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    @NotNull
    public final o0<TicketSideEffect> getEffect() {
        return this.effect;
    }

    @NotNull
    public final z0<CreateTicketFormUiState> getUiState() {
        return this.uiState;
    }

    public final void onAnswerClicked(@NotNull AnswerClickData answerClickData) {
        Intrinsics.checkNotNullParameter(answerClickData, "answerClickData");
        k.f(g2.a(this), null, null, new C28381(answerClickData, null), 3, null);
    }

    public final void onAnswerUpdated(@NotNull final String questionID) {
        Intrinsics.checkNotNullParameter(questionID, "questionID");
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.onAnswerUpdated$lambda$3(questionID, this, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    public final void onDeleteFileClicked(@NotNull final AnswerClickData fileClickData) {
        Intrinsics.checkNotNullParameter(fileClickData, "fileClickData");
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.onDeleteFileClicked$lambda$11(fileClickData, this, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    public final void onRetryFileClicked(@NotNull final AnswerClickData fileClickData) {
        Intrinsics.checkNotNullParameter(fileClickData, "fileClickData");
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTicketViewModel.onRetryFileClicked$lambda$9(this.f293736a, fileClickData, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            }
        });
    }

    public CreateTicketViewModel(@NotNull CreateTicketLaunchedFrom launchedFrom, @NotNull TicketRepository ticketRepository, @NotNull UserIdentity userIdentity, @NotNull AppConfig config, @NotNull n0 dispatcher, @NotNull MetricTracker metricTracker, @Nullable String str, int i10, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
        Intrinsics.checkNotNullParameter(ticketRepository, "ticketRepository");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.launchedFrom = launchedFrom;
        this.ticketRepository = ticketRepository;
        this.userIdentity = userIdentity;
        this.config = config;
        this.dispatcher = dispatcher;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        this.ticketTypeId = i10;
        this.applicationContext = applicationContext;
        k0<CreateTicketFormUiState> k0VarA = b1.a(CreateTicketFormUiState.Initial.INSTANCE);
        this._uiState = k0VarA;
        this.uiState = kotlinx.coroutines.flow.k.n(k0VarA);
        j0<TicketSideEffect> j0VarB = q0.b(0, 0, null, 7, null);
        this._effect = j0VarB;
        this.effect = kotlinx.coroutines.flow.k.m(j0VarB);
        k.f(g2.a(this), dispatcher, null, new AnonymousClass1(null), 2, null);
        metricTracker.viewedCreateTicketForm(Integer.valueOf(i10), str == null ? "" : str, launchedFrom.getFrom());
        fetchTicketType$default(this, null, 1, null);
    }
}
