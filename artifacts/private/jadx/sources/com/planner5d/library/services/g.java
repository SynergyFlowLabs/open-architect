package com.planner5d.library.services;

import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.c2;
import com.planner5d.library.activity.fragment.dialog.message.Message;
import com.planner5d.library.activity.fragment.dialog.message.OkMessage;
import com.planner5d.library.model.manager.statistics.events.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDefaultLibraryDialogFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultLibraryDialogFactory.kt\ncom/planner5d/library/services/DefaultLibraryDialogFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class g implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f224334b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.k f224335a;

    @ij.a
    public g(@NotNull com.planner5d.library.activity.fragment.dialog.k dialogLauncher) {
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        this.f224335a = dialogLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(k3.e eVar, androidx.navigation.w0 runIfDirectionsAvailable, c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        com.planner5d.library.model.manager.statistics.events.n.f217157b.C1(k3.a.sign_in, eVar);
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.services.u
    public void a(@NotNull androidx.navigation.w0 navController, @NotNull final k3.e source) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(source, "source");
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        c2 c2VarK = com.planner5d.library.activity.fragment.profile.q.k();
        Intrinsics.checkNotNullExpressionValue(c2VarK, "toSignIn(...)");
        kVar.d(navController, c2VarK, new Function2() { // from class: com.planner5d.library.services.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.e(source, (androidx.navigation.w0) obj, (c2) obj2);
            }
        });
    }

    @Override // com.planner5d.library.services.u
    public void b(@NotNull FragmentManager fragmentManager, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        OkMessage okMessage = new OkMessage();
        okMessage.setArguments(bundle);
        okMessage.show(fragmentManager, "ok_dialog");
    }

    @Override // com.planner5d.library.services.u
    public void c(@NotNull FragmentManager fragmentManager, @NotNull String message) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(message, "message");
        Message.show(this.f224335a, message, null);
    }
}
