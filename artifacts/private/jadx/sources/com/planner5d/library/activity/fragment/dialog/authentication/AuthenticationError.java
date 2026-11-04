package com.planner5d.library.activity.fragment.dialog.authentication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.planner5d.library.services.utility.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAuthenticationError.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationError.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationError\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,47:1\n42#2,3:48\n*S KotlinDebug\n*F\n+ 1 AuthenticationError.kt\ncom/planner5d/library/activity/fragment/dialog/authentication/AuthenticationError\n*L\n16#1:48,3\n*E\n"})
public final class AuthenticationError extends Fragment implements com.planner5d.library.widget.c0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.navigation.h0 f131721a = new androidx.navigation.h0(kotlin.jvm.internal.j1.d(m.class), new a(this));

    public static final class a implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f131722a;

        public a(Fragment fragment) {
            this.f131722a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f131722a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f131722a + " has null arguments");
        }
    }

    private final boolean A() {
        return z(com.planner5d.library.f.j.Zl);
    }

    private final boolean B() {
        return z(com.planner5d.library.f.j.hs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final m v() {
        return (m) this.f131721a.getValue();
    }

    private final void w() {
        if (v().d().booleanValue()) {
            A();
        } else {
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(AuthenticationError authenticationError, View view) {
        authenticationError.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(AuthenticationError authenticationError, View view) {
        androidx.navigation.fragment.f.a(authenticationError).z0();
    }

    private final boolean z(int i10) {
        return androidx.navigation.fragment.f.a(this).B0(i10, false);
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        w();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        boolean z10 = true | false;
        com.planner5d.library.databinding.a0 a0VarD = com.planner5d.library.databinding.a0.d(inflater, viewGroup, false);
        a0VarD.f158671c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationError.x(this.f131799a, view);
            }
        });
        a0VarD.f158675g.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationError.y(this.f131813a, view);
            }
        });
        TextView textView = a0VarD.f158674f;
        k3 k3VarC = v().c().toMessage().c();
        Context context = a0VarD.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(k3VarC.i(context));
        NestedScrollView root = a0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
