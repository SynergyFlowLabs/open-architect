package io.intercom.android.sdk.m5.conversation.usecase;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.errors.VoiceTranscriptionError;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.sentry.o8;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVoiceTranscriptionUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceTranscriptionUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/VoiceTranscriptionUseCase\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,143:1\n226#2,5:144\n226#2,5:149\n226#2,5:154\n226#2,5:159\n226#2,5:164\n226#2,5:169\n*S KotlinDebug\n*F\n+ 1 VoiceTranscriptionUseCase.kt\nio/intercom/android/sdk/m5/conversation/usecase/VoiceTranscriptionUseCase\n*L\n34#1:144,5\n71#1:149,5\n91#1:154,5\n105#1:159,5\n109#1:164,5\n133#1:169,5\n*E\n"})
public final class VoiceTranscriptionUseCase {
    public static final int $stable = 8;

    @NotNull
    private final AudioRecordingUseCase audioRecordingUseCase;

    @NotNull
    private final ConversationRepository conversationRepository;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase$startRecording$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase", f = "VoiceTranscriptionUseCase.kt", i = {0, 0, 0, 1, 1, 1}, l = {33, 38, 43}, m = "startRecording", n = {"this", "clientState", "uiEffect", "this", "clientState", "uiEffect"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return VoiceTranscriptionUseCase.this.startRecording(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase$stopRecordingAndTranscribe$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase", f = "VoiceTranscriptionUseCase.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3}, l = {com.planner5d.library.engine.input.f.b.f160707m, 67, com.planner5d.library.engine.input.f.b.f160725s, 78, com.planner5d.library.engine.input.f.b.f160705l0}, m = "stopRecordingAndTranscribe", n = {"this", "clientState", "uiEffect", "this", "clientState", "uiEffect", "this", "clientState", "uiEffect", "recordedAudioFile", "this", "clientState", "uiEffect"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    static final class C28051 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C28051(kotlin.coroutines.d<? super C28051> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceTranscriptionUseCase.this.stopRecordingAndTranscribe(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase$transcribeAudioFile$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase", f = "VoiceTranscriptionUseCase.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {102, com.planner5d.library.engine.input.f.b.f160745y1, 119, 124}, m = "transcribeAudioFile", n = {"this", "clientState", "uiEffect", "composerUiEffect", "this", "clientState", "uiEffect", "this", "clientState", "uiEffect"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class C28061 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C28061(kotlin.coroutines.d<? super C28061> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceTranscriptionUseCase.this.transcribeAudioFile(null, null, null, null, this);
        }
    }

    public VoiceTranscriptionUseCase(@NotNull AudioRecordingUseCase audioRecordingUseCase, @NotNull ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(audioRecordingUseCase, "audioRecordingUseCase");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.audioRecordingUseCase = audioRecordingUseCase;
        this.conversationRepository = conversationRepository;
    }

    private final boolean isFileSizeValid(File file) {
        return file.length() <= o8.f305969h3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5 A[Catch: Exception -> 0x0156, TryCatch #2 {Exception -> 0x0156, blocks: (B:47:0x0117, B:39:0x00af, B:41:0x00b5, B:42:0x00c1, B:44:0x0100, B:52:0x0158, B:54:0x015c, B:59:0x0170, B:55:0x0163, B:57:0x0167), top: B:77:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0158 A[Catch: Exception -> 0x0156, TryCatch #2 {Exception -> 0x0156, blocks: (B:47:0x0117, B:39:0x00af, B:41:0x00b5, B:42:0x00c1, B:44:0x0100, B:52:0x0158, B:54:0x015c, B:59:0x0170, B:55:0x0163, B:57:0x0167), top: B:77:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:54:0x015c A[Catch: Exception -> 0x0156, TryCatch #2 {Exception -> 0x0156, blocks: (B:47:0x0117, B:39:0x00af, B:41:0x00b5, B:42:0x00c1, B:44:0x0100, B:52:0x0158, B:54:0x015c, B:59:0x0170, B:55:0x0163, B:57:0x0167), top: B:77:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0163 A[Catch: Exception -> 0x0156, TryCatch #2 {Exception -> 0x0156, blocks: (B:47:0x0117, B:39:0x00af, B:41:0x00b5, B:42:0x00c1, B:44:0x0100, B:52:0x0158, B:54:0x015c, B:59:0x0170, B:55:0x0163, B:57:0x0167), top: B:77:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0167 A[Catch: Exception -> 0x0156, TryCatch #2 {Exception -> 0x0156, blocks: (B:47:0x0117, B:39:0x00af, B:41:0x00b5, B:42:0x00c1, B:44:0x0100, B:52:0x0158, B:54:0x015c, B:59:0x0170, B:55:0x0163, B:57:0x0167), top: B:77:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:58:0x016e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0183, code lost:
    
        if (r10.updateErrorState(r7, r4, r1, r2) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ac, code lost:
    
        if (r10.updateErrorState(r6, r4, r1, r2) == r3) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v7, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.j0] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlinx.coroutines.flow.k0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object transcribeAudioFile(java.io.File r39, kotlinx.coroutines.flow.k0<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r40, kotlinx.coroutines.flow.j0<io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect> r41, kotlinx.coroutines.flow.j0<io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect> r42, kotlin.coroutines.d<? super kotlin.Unit> r43) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase.transcribeAudioFile(java.io.File, kotlinx.coroutines.flow.k0, kotlinx.coroutines.flow.j0, kotlinx.coroutines.flow.j0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateErrorState(VoiceTranscriptionError voiceTranscriptionError, k0<ConversationClientState> k0Var, j0<ConversationUiEffect> j0Var, kotlin.coroutines.d<? super Unit> dVar) {
        ConversationClientState value;
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, new VoiceTranscriptionState.Error(voiceTranscriptionError), 2097151, null)));
        Object objEmit = j0Var.emit(ConversationUiEffect.UnlockScreenOrientation.INSTANCE, dVar);
        return objEmit == kotlin.coroutines.intrinsics.b.l() ? objEmit : Unit.f312394a;
    }

    @Nullable
    public final Object cancelRecording(@NotNull k0<ConversationClientState> k0Var, @NotNull j0<ConversationUiEffect> j0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        ConversationClientState value;
        this.audioRecordingUseCase.cancelRecording();
        do {
            value = k0Var.getValue();
        } while (!k0Var.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, VoiceTranscriptionState.Idle.INSTANCE, 2097151, null)));
        Object objEmit = j0Var.emit(ConversationUiEffect.UnlockScreenOrientation.INSTANCE, dVar);
        return objEmit == kotlin.coroutines.intrinsics.b.l() ? objEmit : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d7 A[Catch: Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:38:0x00eb, B:31:0x0090, B:33:0x00cb, B:35:0x00d7), top: B:53:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        if (r1.updateErrorState(r7, r2, r5, r3) == r4) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlinx.coroutines.flow.j0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.flow.k0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlinx.coroutines.flow.k0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlinx.coroutines.flow.j0] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [kotlinx.coroutines.flow.j0] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startRecording(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.k0<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r35, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j0<io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect> r36, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase.startRecording(kotlinx.coroutines.flow.k0, kotlinx.coroutines.flow.j0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0185, code lost:
    
        if (r2.emit(r0, r6) == r7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b6, code lost:
    
        if (r1.updateErrorState(r2, r3, r4, r6) == r7) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlinx.coroutines.flow.k0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlinx.coroutines.flow.k0] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.coroutines.flow.k0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [kotlinx.coroutines.flow.k0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlinx.coroutines.flow.j0] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlinx.coroutines.flow.j0] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.flow.j0] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopRecordingAndTranscribe(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.k0<io.intercom.android.sdk.m5.conversation.states.ConversationClientState> r39, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j0<io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect> r40, @org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j0<io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect> r41, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r42) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase.stopRecordingAndTranscribe(kotlinx.coroutines.flow.k0, kotlinx.coroutines.flow.j0, kotlinx.coroutines.flow.j0, kotlin.coroutines.d):java.lang.Object");
    }
}
