package io.intercom.android.sdk.survey.ui.components;

import androidx.annotation.f1;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.font.v0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.survey.ui.components.validation.ValidationErrorComponentKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nQuestionHeaderComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestionHeaderComponent.kt\nio/intercom/android/sdk/survey/ui/components/QuestionHeaderComponentKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n87#2:142\n83#2,10:143\n94#2:193\n87#2:194\n84#2,9:195\n94#2:234\n80#3,6:153\n87#3,3:168\n90#3,2:177\n94#3:192\n80#3,6:204\n87#3,3:219\n90#3,2:228\n94#3:233\n391#4,9:159\n400#4:179\n401#4,2:190\n391#4,9:210\n400#4,3:230\n4360#5,6:171\n4360#5,6:222\n1557#6:180\n1628#6,3:181\n1872#6,3:184\n113#7:187\n113#7:189\n1#8:188\n*S KotlinDebug\n*F\n+ 1 QuestionHeaderComponent.kt\nio/intercom/android/sdk/survey/ui/components/QuestionHeaderComponentKt\n*L\n42#1:142\n42#1:143,10\n42#1:193\n127#1:194\n127#1:195,9\n127#1:234\n42#1:153,6\n42#1:168,3\n42#1:177,2\n42#1:192\n127#1:204,6\n127#1:219,3\n127#1:228,2\n127#1:233\n42#1:159,9\n42#1:179\n42#1:190,2\n127#1:210,9\n127#1:230,3\n42#1:171,6\n127#1:222,6\n54#1:180\n54#1:181,3\n55#1:184,3\n90#1:187\n98#1:189\n*E\n"})
public final class QuestionHeaderComponentKt {
    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HeaderWithError(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(784176451);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            m470QuestionHeadern1tc1qA(CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?")), null, true, new ValidationError.ValidationStringError(R.string.intercom_surveys_required_response, null, 2, null), v0.f41742b.m(), androidx.compose.ui.unit.a0.m(14), null, null, c0VarR, 225672, 194);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionHeaderComponentKt.HeaderWithError$lambda$7(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderWithError$lambda$7(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        HeaderWithError(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c(showBackground = true)
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void HeaderWithoutError(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1382338223);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            androidx.compose.ui.a0 a0VarH = i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null);
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarH);
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
            y7.n(c0VarD, a1VarB, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            m470QuestionHeadern1tc1qA(CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?")), new StringProvider.ActualString("Please select a rating"), true, ValidationError.NoValidationError.INSTANCE, v0.f41742b.m(), androidx.compose.ui.unit.a0.m(16), null, null, c0VarR, (StringProvider.ActualString.$stable << 3) | 224648, 192);
            c0VarR.o();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionHeaderComponentKt.HeaderWithoutError$lambda$9(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderWithoutError$lambda$9(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        HeaderWithoutError(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: QuestionHeader-n1tc1qA, reason: not valid java name */
    public static final void m470QuestionHeadern1tc1qA(@NotNull final List<Block.Builder> title, @Nullable StringProvider stringProvider, final boolean z10, @NotNull final ValidationError validationError, @NotNull final v0 v0Var, final long j10, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @f1 @Nullable Integer num, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final StringProvider actualString;
        int i12;
        Unit unit;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(validationError, "validationError");
        v0 fontWeight = v0Var;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(224116790);
        if ((i11 & 2) != 0) {
            actualString = new StringProvider.ActualString("");
            i12 = i10 & (-113);
        } else {
            actualString = stringProvider;
            i12 = i10;
        }
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3 = (i11 & 64) != 0 ? null : function2;
        final Integer num2 = (i11 & 128) != 0 ? null : num;
        androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
        a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar);
        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
        y7.n(c0VarD, a1VarB, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        long jM702getError0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m702getError0d7_KjU();
        c0VarR.E(788845668);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.addAll(title);
        if (num2 != null) {
            listCreateListBuilder.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(u0.i.d(num2.intValue(), c0VarR, (i12 >> 21) & 14)));
        }
        List<Block.Builder> listBuild = CollectionsKt.build(listCreateListBuilder);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listBuild, 10));
        for (Block.Builder builder : listBuild) {
            arrayList.add(builder.withText(builder.build().getText()).build());
        }
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Block block = (Block) obj;
            if (i13 == 0 && z10) {
                c0VarR.E(669360671);
                c0VarR.E(-671143347);
                long jM714getPrimaryText0d7_KjU = validationError instanceof ValidationError.ValidationStringError ? jM702getError0d7_KjU : IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m714getPrimaryText0d7_KjU();
                c0VarR.A();
                String strD = u0.i.d(R.string.intercom_surveys_required_response, c0VarR, 0);
                Intrinsics.checkNotNull(block);
                BlockViewKt.BlockView(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j10, fontWeight, 0L, null, null, null, 60, null), 14, null), false, new SuffixText(" *", strD, jM714getPrimaryText0d7_KjU, null), false, null, null, null, null, false, null, null, c0VarR, 64, 0, 4085);
                c0VarR.A();
            } else {
                c0VarR.E(670259702);
                Intrinsics.checkNotNull(block);
                BlockViewKt.BlockView(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j10, v0Var, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, null, null, false, null, null, c0VarR, 64, 0, 4093);
                c0VarR.A();
            }
            fontWeight = v0Var;
            i13 = i14;
        }
        c0VarR.A();
        c0VarR.E(788890949);
        if (validationError instanceof ValidationError.ValidationStringError) {
            c0VarR.E(-1314135158);
            l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
            c0VarR.E(788894911);
            if (function3 == null) {
                unit = null;
            } else {
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                unit = Unit.f312394a;
            }
            c0VarR.A();
            if (unit == null) {
                ValidationErrorComponentKt.m472ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, jM702getError0d7_KjU, c0VarR, 64, 1);
            }
            c0VarR.A();
        } else {
            c0VarR.E(788901884);
            int i15 = StringProvider.$stable;
            int i16 = (i12 >> 3) & 14;
            boolean zW3 = StringsKt.w3(actualString.getText(c0VarR, i15 | i16));
            c0VarR.A();
            if (!zW3) {
                c0VarR.E(-1313820446);
                l6.a(i6.i(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(4)), c0VarR, 6);
                String text = actualString.getText(c0VarR, i16 | i15);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i17 = IntercomTheme.$stable;
                q50.t(text, null, androidx.compose.ui.graphics.q0.w(intercomTheme.getColors(c0VarR, i17).m714getPrimaryText0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i17).getType04(), c0VarR, 0, 0, 131066);
                c0VarR.A();
            }
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return QuestionHeaderComponentKt.QuestionHeader_n1tc1qA$lambda$6(title, actualString, z10, validationError, v0Var, j10, function3, num2, i10, i11, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionHeader_n1tc1qA$lambda$6(List title, StringProvider stringProvider, boolean z10, ValidationError validationError, v0 fontWeight, long j10, Function2 function2, Integer num, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(validationError, "$validationError");
        Intrinsics.checkNotNullParameter(fontWeight, "$fontWeight");
        m470QuestionHeadern1tc1qA(title, stringProvider, z10, validationError, fontWeight, j10, function2, num, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
