package io.intercom.android.sdk.m5.home.ui.header;

import androidx.compose.runtime.c0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-6$1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nHomeHeaderBackdrop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeHeaderBackdrop.kt\nio/intercom/android/sdk/m5/home/ui/header/ComposableSingletons$HomeHeaderBackdropKt$lambda-6$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,242:1\n113#2:243\n1557#3:244\n1628#3,3:245\n*S KotlinDebug\n*F\n+ 1 HomeHeaderBackdrop.kt\nio/intercom/android/sdk/m5/home/ui/header/ComposableSingletons$HomeHeaderBackdropKt$lambda-6$1\n*L\n208#1:243\n211#1:244\n211#1:245,3\n*E\n"})
final class ComposableSingletons$HomeHeaderBackdropKt$lambda6$1 implements Function2<c0, Integer, Unit> {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda6$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda6$1();

    ComposableSingletons$HomeHeaderBackdropKt$lambda6$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
        invoke(c0Var, num.intValue());
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(c0 c0Var, int i10) {
        if ((i10 & 11) == 2 && c0Var.d()) {
            c0Var.u();
            return;
        }
        float fR = androidx.compose.ui.unit.h.r(200);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"#142C4D", "#0057FF", "#CAF4F7"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(q0.n(s0.b(ColorUtils.parseColor((String) it.next()))));
        }
        HomeHeaderBackdropKt.m389HomeHeaderBackdropAjpBEmI(fR, new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(arrayList, true), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(s0.b(ColorUtils.parseColor("#8B0000")), true, null), new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.header.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, c0Var, 3142, 0);
    }
}
