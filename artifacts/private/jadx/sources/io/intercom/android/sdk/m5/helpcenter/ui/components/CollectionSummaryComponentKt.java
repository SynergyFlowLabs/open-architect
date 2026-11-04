package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
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
@SourceDebugExtension({"SMAP\nCollectionSummaryComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSummaryComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/CollectionSummaryComponentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n75#2:148\n87#3:149\n84#3,9:150\n87#3:187\n84#3,9:188\n87#3:259\n83#3,10:260\n94#3:300\n94#3:313\n94#3:317\n80#4,6:159\n87#4,3:174\n90#4,2:183\n80#4,6:197\n87#4,3:212\n90#4,2:221\n80#4,6:232\n87#4,3:247\n90#4,2:256\n80#4,6:270\n87#4,3:285\n90#4,2:294\n94#4:299\n94#4:308\n94#4:312\n94#4:316\n391#5,9:165\n400#5:185\n391#5,9:203\n400#5:223\n391#5,9:238\n400#5:258\n391#5,9:276\n400#5,3:296\n401#5,2:306\n401#5,2:310\n401#5,2:314\n4360#6,6:177\n4360#6,6:215\n4360#6,6:250\n4360#6,6:288\n113#7:186\n113#7:224\n113#7:225\n113#7:305\n99#8,6:226\n106#8:309\n1557#9:301\n1628#9,3:302\n*S KotlinDebug\n*F\n+ 1 CollectionSummaryComponent.kt\nio/intercom/android/sdk/m5/helpcenter/ui/components/CollectionSummaryComponentKt\n*L\n36#1:148\n37#1:149\n37#1:150,9\n42#1:187\n42#1:188,9\n64#1:259\n64#1:260,10\n64#1:300\n42#1:313\n37#1:317\n37#1:159,6\n37#1:174,3\n37#1:183,2\n42#1:197,6\n42#1:212,3\n42#1:221,2\n59#1:232,6\n59#1:247,3\n59#1:256,2\n64#1:270,6\n64#1:285,3\n64#1:294,2\n64#1:299\n59#1:308\n42#1:312\n37#1:316\n37#1:165,9\n37#1:185\n42#1:203,9\n42#1:223\n59#1:238,9\n59#1:258\n64#1:276,9\n64#1:296,3\n59#1:306,2\n42#1:310,2\n37#1:314,2\n37#1:177,6\n42#1:215,6\n59#1:250,6\n64#1:288,6\n43#1:186\n51#1:224\n58#1:225\n88#1:305\n59#1:226,6\n59#1:309\n77#1:301\n77#1:302,3\n*E\n"})
public final class CollectionSummaryComponentKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void CollectionSummaryComponent(@NotNull final CollectionDetailsUiState.Content state, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2122142392);
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        androidx.compose.ui.a0 a0VarH = i6.h(a0Var2, 0.0f, 1, null);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(a0VarH, intercomTheme.getColors(c0VarR, i13).m690getBackground0d7_KjU(), null, 2, null);
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        androidx.compose.foundation.layout.q.m mVarY = qVar.y();
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
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
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarR = d5.r(aVar3, androidx.compose.ui.unit.h.r(16));
        a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar.u(), c0VarR, 0);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarR);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A2);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
        y7.n(c0VarD2, a1VarB2, aVar2.e());
        y7.n(c0VarD2, b1VarK2, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar2.f());
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        q50.t(state.getTitle(), null, intercomTheme.getColors(c0VarR, i13).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i13).getType04SemiBold(), c0VarR, 0, 0, 131066);
        androidx.compose.runtime.c0 c0Var2 = c0VarR;
        c0Var2.E(2075464466);
        if (StringsKt.w3(state.getSummary())) {
            i12 = 6;
        } else {
            l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(4)), c0Var2, 6);
            i12 = 6;
            q50.t(state.getSummary(), null, intercomTheme.getColors(c0Var2, i13).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i13).getType04Point5(), c0Var2, 0, 0, 131066);
            c0Var2 = c0Var2;
        }
        c0Var2.A();
        l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(20)), c0Var2, i12);
        androidx.compose.ui.a0 a0VarH2 = i6.h(aVar3, 0.0f, 1, null);
        a1 a1VarE = u5.e(qVar.s(), aVar.q(), c0Var2, 54);
        int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
        b1 b1VarK3 = c0Var2.k();
        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var2, a0VarH2);
        Function0<androidx.compose.ui.node.g> function0A3 = aVar2.a();
        if (c0Var2.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var2.q();
        if (c0Var2.P()) {
            c0Var2.q0(function0A3);
        } else {
            c0Var2.l();
        }
        androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var2);
        y7.n(c0VarD3, a1VarE, aVar2.e());
        y7.n(c0VarD3, b1VarK3, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar2.b();
        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
            c0VarD3.Y(Integer.valueOf(iHashCode3));
            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
        }
        y7.n(c0VarD3, a0VarN3, aVar2.f());
        y5 y5Var = y5.f16577a;
        a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar.u(), c0Var2, 0);
        int iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
        b1 b1VarK4 = c0Var2.k();
        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var2, aVar3);
        Function0<androidx.compose.ui.node.g> function0A4 = aVar2.a();
        if (c0Var2.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var2.q();
        if (c0Var2.P()) {
            c0Var2.q0(function0A4);
        } else {
            c0Var2.l();
        }
        androidx.compose.runtime.c0 c0VarD4 = y7.d(c0Var2);
        y7.n(c0VarD4, a1VarB3, aVar2.e());
        y7.n(c0VarD4, b1VarK4, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar2.b();
        if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
            c0VarD4.Y(Integer.valueOf(iHashCode4));
            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
        }
        y7.n(c0VarD4, a0VarN4, aVar2.f());
        ArticleCountComponentKt.ArticleCountComponent(null, state.getArticlesCount(), c0Var2, 0, 1);
        androidx.compose.runtime.c0 c0Var3 = c0Var2;
        q50.t(constructByAuthorsText(context, state.getAuthors()), null, s0.d(4285887861L), null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 0, 0, null, intercomTheme.getTypography(c0Var2, i13).getType04Point5(), c0Var3, a5.S0, a5.S0, 126970);
        c0Var3.o();
        List<Author> listTake = CollectionsKt.take(state.getAuthors(), 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        for (Author author : listTake) {
            Avatar avatarCreate = Avatar.create(author.getAvatar().getImageUrl(), author.getAvatar().getInitials());
            Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
            arrayList.add(new AvatarWrapper(avatarCreate, false));
        }
        AvatarGroupKt.m101AvatarGroupJ8mCjc(arrayList, null, androidx.compose.ui.unit.h.r(32), 0L, c0Var3, 392, 10);
        c0Var3.o();
        c0Var3.o();
        IntercomDividerKt.IntercomDivider(null, c0Var3, 0, 1);
        c0Var3.o();
        s5 s5VarT = c0Var3.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CollectionSummaryComponentKt.CollectionSummaryComponent$lambda$5(state, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollectionSummaryComponent$lambda$5(CollectionDetailsUiState.Content state, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(state, "$state");
        CollectionSummaryComponent(state, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void CollectionSummaryComponentPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1054855652);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CollectionSummaryComponentKt.INSTANCE.m350getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CollectionSummaryComponentKt.CollectionSummaryComponentPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollectionSummaryComponentPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        CollectionSummaryComponentPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final String constructByAuthorsText(Context context, List<Author> list) {
        CharSequence charSequence;
        if (list.isEmpty()) {
            return "";
        }
        int size = list.size();
        if (size != 1) {
            charSequence = size != 2 ? Phrase.from(context, R.string.intercom_article_multiple_authors).put("author_first_name1", ((Author) CollectionsKt.first((List) list)).getName()).put("number_of_other_authors", list.size() - 1).format() : Phrase.from(context, R.string.intercom_article_double_author).put("author_first_name1", ((Author) CollectionsKt.first((List) list)).getName()).put("author_first_name2", ((Author) CollectionsKt.last((List) list)).getName()).format();
        } else {
            charSequence = Phrase.from(context, R.string.intercom_article_single_author).put("author_first_name", ((Author) CollectionsKt.first((List) list)).getName()).format();
        }
        return charSequence.toString();
    }
}
