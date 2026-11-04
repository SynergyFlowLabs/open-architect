package com.planner5d.library.legal.view.dialog.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.services.r;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.n1;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nPrivacyAgreement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyAgreement.kt\ncom/planner5d/library/legal/view/dialog/authentication/PrivacyAgreement\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,89:1\n16#2:90\n257#3,2:91\n257#3,2:93\n*S KotlinDebug\n*F\n+ 1 PrivacyAgreement.kt\ncom/planner5d/library/legal/view/dialog/authentication/PrivacyAgreement\n*L\n26#1:90\n60#1:91,2\n61#1:93,2\n*E\n"})
public final class PrivacyAgreement extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private uc.b f180438b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f180437a = new i2(j1.d(e.class), new b(), new c(com.planner5d.library.legal.application.e.f180321b.a()), null, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f0 f180439c = g0.c(new Function0() { // from class: com.planner5d.library.legal.view.dialog.authentication.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PrivacyAgreement.A(this.f180446a);
        }
    });

    public interface a {
        void onAgree(@NotNull id.a aVar);

        void onDeleteMyData();

        void onOpenUrl(@NotNull String str);
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 PrivacyAgreement.kt\ncom/planner5d/library/legal/view/dialog/authentication/PrivacyAgreement\n*L\n1#1,16:1\n26#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return PrivacyAgreement.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f180441a;

        public c(com.planner5d.library.view.b bVar) {
            this.f180441a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f180441a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a A(PrivacyAgreement privacyAgreement) {
        androidx.activity.result.b parentFragment = privacyAgreement.getParentFragment();
        if (parentFragment instanceof a) {
            return (a) parentFragment;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(PrivacyAgreement privacyAgreement, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!StringsKt.N1(url, "p5d://delete_my_data", true)) {
            a aVarX = privacyAgreement.x();
            if (aVarX != null) {
                aVarX.onOpenUrl(url);
                return;
            }
            return;
        }
        try {
            a aVarX2 = privacyAgreement.x();
            if (aVarX2 != null) {
                aVarX2.onDeleteMyData();
                Unit unit = Unit.f312394a;
            }
        } catch (Exception e10) {
            timber.log.b.f381052a.e(e10);
            Unit unit2 = Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(PrivacyAgreement privacyAgreement, View view) {
        privacyAgreement.z().V(privacyAgreement.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(uc.b bVar, PrivacyAgreement privacyAgreement, e.a aVar) {
        a aVarX;
        a aVarX2;
        boolean z10 = aVar instanceof e.a.C1567a;
        bVar.f381222b.setEnabled(!z10);
        ProgressBar authenticationPrivacySpinner = bVar.f381228h;
        Intrinsics.checkNotNullExpressionValue(authenticationPrivacySpinner, "authenticationPrivacySpinner");
        authenticationPrivacySpinner.setVisibility(z10 ? 0 : 8);
        TextView authenticationPrivacyError = bVar.f381224d;
        Intrinsics.checkNotNullExpressionValue(authenticationPrivacyError, "authenticationPrivacyError");
        authenticationPrivacyError.setVisibility(aVar instanceof e.a.c ? 0 : 8);
        if ((aVar instanceof e.a.d) && (aVarX2 = privacyAgreement.x()) != null) {
            aVarX2.onOpenUrl(((e.a.d) aVar).d());
        }
        if ((aVar instanceof e.a.b) && (aVarX = privacyAgreement.x()) != null) {
            aVarX.onAgree(((e.a.b) aVar).d());
        }
        return Unit.f312394a;
    }

    private final a x() {
        return (a) this.f180439c.getValue();
    }

    private final id.a y() {
        String strT = new j(getArguments()).t(r.user, null);
        if (strT == null) {
            return null;
        }
        try {
            return new id.a(new JSONObject(strT));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final e z() {
        return (e) this.f180437a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final uc.b bVarD = uc.b.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(bVarD, "inflate(...)");
        UrlSpanWithListener.a aVar = new UrlSpanWithListener.a() { // from class: com.planner5d.library.legal.view.dialog.authentication.a
            @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
            public final void a(String str) {
                PrivacyAgreement.B(this.f180442a, str);
            }
        };
        com.planner5d.library.services.textspan.b.n(bVarD.f381226f, com.planner5d.library.services.textspan.b.h(getString(tc.b.q.Xj), aVar, null, false));
        com.planner5d.library.services.textspan.b.n(bVarD.f381227g, com.planner5d.library.services.textspan.b.i(getString(tc.b.q.Yj), aVar, null, false, true, true));
        bVarD.f381222b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.legal.view.dialog.authentication.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyAgreement.C(this.f180443a, view);
            }
        });
        n1.a(this, z().W(), new Function1() { // from class: com.planner5d.library.legal.view.dialog.authentication.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PrivacyAgreement.D(bVarD, this, (e.a) obj);
            }
        });
        this.f180438b = bVarD;
        ConstraintLayout root = bVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
