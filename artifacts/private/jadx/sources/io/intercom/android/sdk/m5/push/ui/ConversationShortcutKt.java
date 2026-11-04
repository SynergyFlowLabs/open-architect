package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.content.pm.e;
import androidx.core.content.pm.k;
import androidx.core.graphics.drawable.IconCompat;
import com.intercom.twig.Twig;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationShortcut.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationShortcut.kt\nio/intercom/android/sdk/m5/push/ui/ConversationShortcutKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public final class ConversationShortcutKt {
    @NotNull
    public static final Pair<List<e>, e> createTemporaryShortcut(@NotNull Context context, @NotNull String conversationId, @NotNull String conversationTitle, @Nullable Bitmap bitmap) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationTitle, "conversationTitle");
        List<e> listP = k.p(context, 8);
        Intrinsics.checkNotNullExpressionValue(listP, "getShortcuts(...)");
        List<e> listG = k.g(context);
        Intrinsics.checkNotNullExpressionValue(listG, "getDynamicShortcuts(...)");
        Iterator<T> it = listP.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            e eVar = (e) next;
            if (Intrinsics.areEqual(eVar.k(), conversationId) && Intrinsics.areEqual(eVar.w(), conversationTitle)) {
                break;
            }
        }
        e eVar2 = (e) next;
        if (eVar2 != null) {
            return TuplesKt.to(null, eVar2);
        }
        Iterator<T> it2 = listG.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            e eVar3 = (e) next2;
            if (Intrinsics.areEqual(eVar3.k(), conversationId) && Intrinsics.areEqual(eVar3.w(), conversationTitle)) {
                break;
            }
        }
        e eVar4 = (e) next2;
        if (eVar4 != null) {
            return TuplesKt.to(null, eVar4);
        }
        e.b bVarM = new e.b(context, conversationId).q(true).u(conversationTitle).k(new Intent("android.intent.action.VIEW")).m();
        if (bitmap != null) {
            IconCompat iconCompatQ = IconCompat.q(bitmap);
            Intrinsics.checkNotNullExpressionValue(iconCompatQ, "createWithAdaptiveBitmap(...)");
            bVarM.j(iconCompatQ);
        }
        e eVarC = bVarM.c();
        Intrinsics.checkNotNullExpressionValue(eVarC, "build(...)");
        k.s(context, eVarC);
        return TuplesKt.to(listG, eVarC);
    }

    public static final void resetShortcuts(@NotNull Context context, @Nullable List<? extends e> list, @Nullable e eVar, @NotNull Twig twig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(twig, "twig");
        if (eVar != null) {
            k.u(context, CollectionsKt.listOf(eVar.k()));
        }
        if (list != null) {
            try {
                k.z(context, list);
            } catch (IllegalArgumentException e10) {
                twig.i(e10, "Could not set dynamic shortcuts, max number of dynamic shortcuts exceeded.", new Object[0]);
                Unit unit = Unit.f312394a;
            }
        }
    }
}
