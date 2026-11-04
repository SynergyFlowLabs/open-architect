package io.intercom.android.sdk.tickets.create.reducers;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCreateTicketReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateTicketReducer.kt\nio/intercom/android/sdk/tickets/create/reducers/CreateTicketReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,203:1\n1863#2:204\n295#2,2:205\n1557#2:207\n1628#2,3:208\n1864#2:213\n1#3:211\n113#4:212\n*S KotlinDebug\n*F\n+ 1 CreateTicketReducer.kt\nio/intercom/android/sdk/tickets/create/reducers/CreateTicketReducerKt\n*L\n57#1:204\n61#1:205,2\n78#1:207\n78#1:208,3\n57#1:213\n135#1:212\n*E\n"})
public final class CreateTicketReducerKt {
    /* JADX WARN: Code duplicated, block: B:100:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0187  */
    /* JADX WARN: Code duplicated, block: B:44:0x0190  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x0286  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:89:0x030b  */
    /* JADX WARN: Code duplicated, block: B:90:0x035d  */
    /* JADX WARN: Code duplicated, block: B:98:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00f8 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v36 java.lang.Object, still in use, count: 2, list:
          (r9v36 java.lang.Object) from 0x00cf: PHI (r9 I:??) = (r9v2 java.lang.Object), (r9v36 java.lang.Object) binds: [B:18:0x00cd, B:127:0x00cf] A[DONT_GENERATE, DONT_INLINE]
          (r9v36 java.lang.Object) from 0x00b8: CHECK_CAST (io.intercom.android.sdk.survey.QuestionState) (r9v36 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @org.jetbrains.annotations.NotNull
    public static final io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState convertToTicketFormUiState(@org.jetbrains.annotations.NotNull io.intercom.android.sdk.blocks.lib.models.TicketTypeV2 r21, @org.jetbrains.annotations.NotNull io.intercom.android.sdk.identity.UserIdentity r22, @org.jetbrains.annotations.NotNull io.intercom.android.sdk.identity.AppConfig r23, @org.jetbrains.annotations.Nullable io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState r24) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.reducers.CreateTicketReducerKt.convertToTicketFormUiState(io.intercom.android.sdk.blocks.lib.models.TicketTypeV2, io.intercom.android.sdk.identity.UserIdentity, io.intercom.android.sdk.identity.AppConfig, io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState):io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState");
    }

    private static final SurveyData.Step.Question.QuestionValidation.ValidationType getInputType(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 96619420) {
            if (iHashCode != 97526364) {
                if (iHashCode == 1958052158 && str.equals("integer")) {
                    return SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER;
                }
            } else if (str.equals("float")) {
                return SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT;
            }
        } else if (str.equals("email")) {
            return SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL;
        }
        return SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int getPlaceholderText(String str) {
        switch (str.hashCode()) {
            case 3322014:
                if (str.equals(AttributeType.LIST)) {
                    return R.string.intercom_please_select;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return R.string.intercom_placeholder_email_input;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
            case 1958052158:
                if (str.equals("integer")) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
        }
        return R.string.intercom_placeholder_text_inputs;
    }
}
