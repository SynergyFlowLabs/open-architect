package com.planner5d.library.activity.fragment.dialog.message;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.dialog.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class ConfirmDeleteMultipleMessageRedesign extends ConfirmDeleteMessageRedesign {
    public static final int $stable = 0;

    @NotNull
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull com.planner5d.library.activity.fragment.dialog.k launcher, @Nullable String str, @Nullable u<Boolean> uVar) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            launcher.c(ConfirmDeleteMultipleMessageRedesign.class).m(uVar).k(str).g();
        }

        private a() {
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmDeleteMessageRedesign, com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    @NotNull
    protected CharSequence Z() {
        String string = getString(com.planner5d.library.f.s.W6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
