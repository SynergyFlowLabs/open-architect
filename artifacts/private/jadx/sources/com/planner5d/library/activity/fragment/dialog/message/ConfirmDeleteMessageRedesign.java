package com.planner5d.library.activity.fragment.dialog.message;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public class ConfirmDeleteMessageRedesign extends ConfirmMessage {
    public static final int $stable = 0;

    @NotNull
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull com.planner5d.library.activity.fragment.dialog.k launcher, @Nullable String str, @Nullable u<Boolean> uVar) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            launcher.c(ConfirmDeleteMessageRedesign.class).m(uVar).k(str).g();
        }

        private a() {
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.E0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected int U() {
        return com.planner5d.library.f.m.L0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected int V() {
        return 0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    @NotNull
    protected CharSequence W(@Nullable ViewGroup viewGroup) {
        String string = getString(com.planner5d.library.f.s.G5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected int X() {
        return com.planner5d.library.f.s.f168971a;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected int Y() {
        return com.planner5d.library.f.s.E5;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    @NotNull
    protected CharSequence Z() {
        int i10 = com.planner5d.library.f.s.H5;
        Object objA = A();
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type kotlin.String");
        String string = getString(i10, objA);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
