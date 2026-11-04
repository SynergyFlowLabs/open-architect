package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nMessageMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageMetadata.kt\nio/intercom/android/sdk/m5/conversation/ui/components/MessageMetadataKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,133:1\n113#2:134\n113#2:168\n113#2:169\n99#3,6:135\n106#3:174\n80#4,6:141\n87#4,3:156\n90#4,2:165\n94#4:173\n391#5,9:147\n400#5:167\n401#5,2:171\n4360#6,6:159\n75#7:170\n*S KotlinDebug\n*F\n+ 1 MessageMetadata.kt\nio/intercom/android/sdk/m5/conversation/ui/components/MessageMetadataKt\n*L\n38#1:134\n42#1:168\n44#1:169\n35#1:135,6\n35#1:174\n35#1:141,6\n35#1:156,3\n35#1:165,2\n35#1:173\n35#1:147,9\n35#1:167\n35#1:171,2\n35#1:159,6\n85#1:170\n*E\n"})
public final class MessageMetadataKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void MessageMetadata(@NotNull final List<AvatarWrapper> avatars, @NotNull final String title, @Nullable androidx.compose.ui.a0 a0Var, @Nullable String str, @Nullable Long l10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0Var2;
        long j10;
        boolean z10;
        androidx.compose.runtime.c0 c0Var3;
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(title, "title");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1631390024);
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        String str2 = (i11 & 8) != 0 ? null : str;
        Long l11 = (i11 & 16) != 0 ? null : l10;
        y3 y3VarM = y3.m(IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType04Point5(), 0L, 0L, androidx.compose.ui.text.font.v0.f41742b.o(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
        float f10 = 4;
        androidx.compose.ui.layout.a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var2);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarE, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(1642417258);
        if (!avatars.isEmpty()) {
            AvatarGroupKt.m101AvatarGroupJ8mCjc(avatars, d5.v(androidx.compose.ui.a0.E, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f10), 0.0f, 11, null), androidx.compose.ui.unit.h.r(24), 0L, c0VarR, 440, 8);
        }
        c0VarR.A();
        androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarH = y5Var.h(aVar2, 1.0f, false);
        androidx.compose.ui.text.style.v.a aVar3 = androidx.compose.ui.text.style.v.f42256b;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        q50.t(title, a0VarH, 0L, null, 0L, null, null, null, 0L, null, null, 0L, aVar3.c(), false, 1, 0, null, y3VarM, c0VarR, (i10 >> 3) & 14, 24960, 110588);
        androidx.compose.runtime.c0 c0Var4 = c0VarR;
        c0Var4.E(1642431398);
        if (str2 == null) {
            i12 = 1;
        } else {
            c0Var4.E(1642431772);
            if (StringsKt.w3(title)) {
                i12 = 1;
                c0Var2 = c0Var4;
            } else {
                c0Var2 = c0Var4;
                i12 = 1;
                q50.t("•", androidx.compose.ui.semantics.t.f(aVar2, false, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.j2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageMetadataKt.MessageMetadata$lambda$4$lambda$1$lambda$0((androidx.compose.ui.semantics.e0) obj);
                    }
                }, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3VarM, c0Var2, 6, 0, 131068);
            }
            c0Var2.A();
            q50.t(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, aVar3.c(), false, 1, 0, null, y3VarM, c0Var2, 0, 24960, 110590);
            c0Var4 = c0Var2;
        }
        c0Var4.A();
        c0Var4.E(1642448818);
        if (l11 == null) {
            c0Var3 = c0Var4;
        } else {
            long jLongValue = l11.longValue();
            c0Var4.E(1642449084);
            if (!StringsKt.w3(title) || (str2 != null && ((StringsKt.w3(str2) ? 1 : 0) ^ i12) == i12)) {
                androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar2, false, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.k2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageMetadataKt.MessageMetadata$lambda$4$lambda$3$lambda$2((androidx.compose.ui.semantics.e0) obj);
                    }
                }, i12, null);
                androidx.compose.runtime.c0 c0Var5 = c0Var4;
                j10 = jLongValue;
                z10 = false;
                q50.t("•", a0VarF, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, y3VarM, c0Var5, 6, 0, 131068);
                c0Var4 = c0Var5;
            } else {
                j10 = jLongValue;
                z10 = false;
            }
            c0Var4.A();
            c0Var3 = c0Var4;
            q50.t(TimeFormatterExtKt.formattedDateFromLong(j10, (Context) c0Var4.W(AndroidCompositionLocals_androidKt.g())), y5Var.h(aVar2, 0.5f, z10), 0L, null, 0L, null, null, null, 0L, null, null, 0L, aVar3.c(), false, 1, 0, null, y3VarM, c0Var3, 0, 24960, 110588);
        }
        c0Var3.A();
        c0Var3.o();
        s5 s5VarT = c0Var3.T();
        if (s5VarT != null) {
            final String str3 = str2;
            final Long l12 = l11;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.l2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageMetadataKt.MessageMetadata$lambda$5(avatars, title, a0Var3, str3, l12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadata$lambda$4$lambda$1$lambda$0(androidx.compose.ui.semantics.e0 semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.b0.v1(semantics, "");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadata$lambda$4$lambda$3$lambda$2(androidx.compose.ui.semantics.e0 semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.b0.v1(semantics, "");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadata$lambda$5(List avatars, String title, androidx.compose.ui.a0 a0Var, String str, Long l10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(title, "$title");
        MessageMetadata(avatars, title, a0Var, str, l10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void MessageMetadataLongTextPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-764241754);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m220getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.m2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageMetadataKt.MessageMetadataLongTextPreview$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadataLongTextPreview$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MessageMetadataLongTextPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void MessageMetadataPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1316869201);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 2 | 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageMetadataKt.INSTANCE.m218getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.i2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageMetadataKt.MessageMetadataPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMetadataPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        MessageMetadataPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
