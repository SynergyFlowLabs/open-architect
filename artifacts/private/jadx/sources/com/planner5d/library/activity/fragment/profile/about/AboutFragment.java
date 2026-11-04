package com.planner5d.library.activity.fragment.profile.about;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.help.application.h;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.u;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAboutFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutFragment.kt\ncom/planner5d/library/activity/fragment/profile/about/AboutFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,85:1\n16#2:86\n*S KotlinDebug\n*F\n+ 1 AboutFragment.kt\ncom/planner5d/library/activity/fragment/profile/about/AboutFragment\n*L\n36#1:86\n*E\n"})
public final class AboutFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f134523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final UrlSpanWithListener.a f134524b;

    @ij.a
    public k dialogLauncher;

    @ij.a
    public u libraryDialogFactory;

    @ij.a
    public c2 messageManager;

    @ij.a
    public o4 supportManager;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134525a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134525a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f134525a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134525a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 AboutFragment.kt\ncom/planner5d/library/activity/fragment/profile/about/AboutFragment\n*L\n1#1,16:1\n36#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return AboutFragment.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f134527a;

        public c(com.planner5d.library.view.b bVar) {
            this.f134527a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f134527a;
        }
    }

    public AboutFragment() {
        h.a aVar = h.f179982b;
        boolean z10 = true;
        this.f134523a = new i2(j1.d(e.class), new b(), new c(aVar.a()), null, 8, null);
        aVar.a().w(this);
        this.f134524b = new UrlSpanWithListener.a() { // from class: com.planner5d.library.activity.fragment.profile.about.b
            @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
            public final void a(String str) {
                AboutFragment.x(this.f134530a, str);
            }
        };
    }

    private final e w() {
        return (e) this.f134523a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(final AboutFragment aboutFragment, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt.u2(url, "p5d://", false, 2, null)) {
            h.f179982b.a().t().a(aboutFragment.getActivity(), url);
            return;
        }
        if (Intrinsics.areEqual(url, "p5d://login")) {
            aboutFragment.w().Y(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.about.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AboutFragment.y(this.f134531a, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (Intrinsics.areEqual(url, "p5d://support")) {
            o4 supportManager$P5D_Library_Help_release = aboutFragment.getSupportManager$P5D_Library_Help_release();
            s sVarRequireActivity = aboutFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(sVarRequireActivity, "requireActivity(...)");
            supportManager$P5D_Library_Help_release.a(sVarRequireActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(AboutFragment aboutFragment, boolean z10) {
        if (z10) {
            aboutFragment.getMessageManager$P5D_Library_Help_release().b(pc.b.r.Po, new Object[0]);
        } else {
            aboutFragment.getLibraryDialogFactory$P5D_Library_Help_release().a(androidx.navigation.fragment.f.a(aboutFragment), k3.e.about);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(TextView textView, AboutFragment aboutFragment, String str) {
        com.planner5d.library.services.textspan.b.n(textView, com.planner5d.library.services.textspan.b.h(textView.getContext().getString(pc.b.r.yD, textView.getContext().getString(pc.b.r.f344274w1), textView.getContext().getString(pc.b.r.qC)) + "<br /><br />" + str, aboutFragment.f134524b, null, false));
        return Unit.f312394a;
    }

    @NotNull
    public final k getDialogLauncher$P5D_Library_Help_release() {
        k kVar = this.dialogLauncher;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialogLauncher");
        return null;
    }

    @NotNull
    public final u getLibraryDialogFactory$P5D_Library_Help_release() {
        u uVar = this.libraryDialogFactory;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("libraryDialogFactory");
        return null;
    }

    @NotNull
    public final c2 getMessageManager$P5D_Library_Help_release() {
        c2 c2Var = this.messageManager;
        if (c2Var != null) {
            return c2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messageManager");
        return null;
    }

    @NotNull
    public final o4 getSupportManager$P5D_Library_Help_release() {
        o4 o4Var = this.supportManager;
        if (o4Var != null) {
            return o4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("supportManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        qc.f fVarD = qc.f.d(inflater, viewGroup, false);
        final TextView textView = fVarD.f350338b;
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        w().X().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.about.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AboutFragment.z(textView, this, (String) obj);
            }
        }));
        e eVarW = w();
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        eVarW.Z(context);
        FrameLayout root = fVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void setDialogLauncher$P5D_Library_Help_release(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.dialogLauncher = kVar;
    }

    public final void setLibraryDialogFactory$P5D_Library_Help_release(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        this.libraryDialogFactory = uVar;
    }

    public final void setMessageManager$P5D_Library_Help_release(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.messageManager = c2Var;
    }

    public final void setSupportManager$P5D_Library_Help_release(@NotNull o4 o4Var) {
        Intrinsics.checkNotNullParameter(o4Var, "<set-?>");
        this.supportManager = o4Var;
    }
}
