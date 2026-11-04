package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.s3;
import androidx.compose.foundation.layout.t2;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.models.Weight;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEventRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/EventRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,138:1\n113#2:139\n113#2:140\n113#2:141\n113#2:142\n*S KotlinDebug\n*F\n+ 1 EventRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/EventRowKt\n*L\n40#1:139\n41#1:140\n50#1:141\n51#1:142\n*E\n"})
public final class EventRowKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt$EventRow$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nEventRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/EventRowKt$EventRow$1\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,138:1\n1574#2:139\n1394#2,6:141\n1863#3:140\n1864#3:147\n1282#4,6:148\n*S KotlinDebug\n*F\n+ 1 EventRow.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/EventRowKt$EventRow$1\n*L\n61#1:139\n79#1:141,6\n62#1:140\n62#1:147\n95#1:148,6\n*E\n"})
    static final class AnonymousClass1 implements pj.n<s3, androidx.compose.runtime.c0, Integer, Unit> {
        final /* synthetic */ AvatarWrapper $avatar;
        final /* synthetic */ float $avatarSize;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ List<EventLabelSegment> $labelSegments;
        final /* synthetic */ y3 $textStyle;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt$EventRow$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Weight.values().length];
                try {
                    iArr[Weight.REGULAR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Weight.LIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Weight.MEDIUM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Weight.SEMI_BOLD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Weight.BOLD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        AnonymousClass1(float f10, AvatarWrapper avatarWrapper, String str, y3 y3Var, List<EventLabelSegment> list) {
            this.$avatarSize = f10;
            this.$avatar = avatarWrapper;
            this.$contentDescription = str;
            this.$textStyle = y3Var;
            this.$labelSegments = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(String contentDescription, androidx.compose.ui.semantics.e0 semantics) {
            Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            androidx.compose.ui.semantics.b0.v1(semantics, contentDescription);
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(s3 s3Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            invoke(s3Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void invoke(s3 FlowRow, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.ui.text.font.v0 v0VarM;
            long jM699getDescriptionText0d7_KjU;
            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
            if ((i10 & 81) == 16 && c0Var.d()) {
                c0Var.u();
                return;
            }
            AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(androidx.compose.ui.a0.E, this.$avatarSize), this.$avatar, null, false, 0L, androidx.compose.ui.graphics.q0.n(androidx.compose.ui.graphics.s0.d(4294046193L)), c0Var, 196678, 28);
            c0Var.E(-1441488026);
            List<EventLabelSegment> list = this.$labelSegments;
            androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, 1, null);
            c0Var.E(-1441486517);
            for (EventLabelSegment eventLabelSegment : list) {
                Weight weight = eventLabelSegment.getWeight();
                int i11 = weight == null ? -1 : WhenMappings.$EnumSwitchMapping$0[weight.ordinal()];
                if (i11 == -1 || i11 == 1) {
                    v0VarM = androidx.compose.ui.text.font.v0.f41742b.m();
                } else if (i11 == 2) {
                    v0VarM = androidx.compose.ui.text.font.v0.f41742b.i();
                } else if (i11 == 3) {
                    v0VarM = androidx.compose.ui.text.font.v0.f41742b.k();
                } else if (i11 == 4) {
                    v0VarM = androidx.compose.ui.text.font.v0.f41742b.o();
                } else {
                    if (i11 != 5) {
                        throw new kotlin.k0();
                    }
                    v0VarM = androidx.compose.ui.text.font.v0.f41742b.c();
                }
                androidx.compose.ui.text.font.v0 v0Var = v0VarM;
                if (eventLabelSegment.getWeight() == null || eventLabelSegment.getWeight() == Weight.REGULAR) {
                    c0Var.E(1299869998);
                    jM699getDescriptionText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m699getDescriptionText0d7_KjU();
                    c0Var.A();
                } else {
                    c0Var.E(1299792498);
                    jM699getDescriptionText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0Var, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                    c0Var.A();
                }
                int iZ = bVar.z(new c3(jM699getDescriptionText0d7_KjU, 0L, v0Var, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (androidx.compose.ui.text.y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65530, (DefaultConstructorMarker) null));
                try {
                    bVar.p(eventLabelSegment.getText());
                    Unit unit = Unit.f312394a;
                    bVar.u(iZ);
                } catch (Throwable th2) {
                    bVar.u(iZ);
                    throw th2;
                }
            }
            c0Var.A();
            androidx.compose.ui.text.f fVarC = bVar.C();
            c0Var.A();
            int iA = androidx.compose.ui.text.style.j.f42206b.a();
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            c0Var.E(-1441447434);
            boolean zD = c0Var.D(this.$contentDescription);
            final String str = this.$contentDescription;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EventRowKt.AnonymousClass1.invoke$lambda$4$lambda$3(str, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            c0Var.A();
            q50.u(fVarC, androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null), 0L, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iA), 0L, 0, false, 0, 0, null, null, this.$textStyle, c0Var, 0, 0, 261116);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void EventRow(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final List<EventLabelSegment> labelSegments, @NotNull final AvatarWrapper avatar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(labelSegments, "labelSegments");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(150762908);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        y3 type04Point5 = IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5();
        float fR = androidx.compose.ui.unit.h.r(20);
        float fR2 = androidx.compose.ui.unit.h.r(16);
        String str = "Event: " + CollectionsKt.joinToString$default(labelSegments, "", null, null, 0, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventRowKt.EventRow$lambda$0((EventLabelSegment) obj);
            }
        }, 30, null);
        androidx.compose.ui.a0 a0VarT = d5.t(i6.h(a0Var2, 0.0f, 1, null), fR2, 0.0f, 2, null);
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        float f10 = 6;
        float fR3 = androidx.compose.ui.unit.h.r(f10);
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        t2.m(a0VarT, qVar.H(fR3, aVar.m()), qVar.I(androidx.compose.ui.unit.h.r(f10), aVar.q()), null, 0, 0, androidx.compose.runtime.internal.w.e(639828375, true, new AnonymousClass1(fR, avatar, str, type04Point5, labelSegments), c0VarR, 54), c0VarR, 1573296, 56);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventRowKt.EventRow$lambda$1(a0Var3, labelSegments, avatar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence EventRow$lambda$0(EventLabelSegment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventRow$lambda$1(androidx.compose.ui.a0 a0Var, List labelSegments, AvatarWrapper avatar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(labelSegments, "$labelSegments");
        Intrinsics.checkNotNullParameter(avatar, "$avatar");
        EventRow(a0Var, labelSegments, avatar, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void ParticipantAddedRowPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(524974868);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EventRowKt.INSTANCE.m284getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventRowKt.ParticipantAddedRowPreview$lambda$2(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ParticipantAddedRowPreview$lambda$2(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ParticipantAddedRowPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
