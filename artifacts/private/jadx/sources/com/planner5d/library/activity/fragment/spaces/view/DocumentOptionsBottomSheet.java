package com.planner5d.library.activity.fragment.spaces.view;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import androidx.lifecycle.d1;
import com.planner5d.library.databinding.p0;
import com.planner5d.library.services.r;
import com.planner5d.library.widget.c1;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDocumentOptionsBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentOptionsBottomSheet.kt\ncom/planner5d/library/activity/fragment/spaces/view/DocumentOptionsBottomSheet\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,97:1\n257#2,2:98\n*S KotlinDebug\n*F\n+ 1 DocumentOptionsBottomSheet.kt\ncom/planner5d/library/activity/fragment/spaces/view/DocumentOptionsBottomSheet\n*L\n74#1:98,2\n*E\n"})
public final class DocumentOptionsBottomSheet extends com.google.android.material.bottomsheet.f implements com.planner5d.library.widget.menu.o {
    public static final int $stable = 8;
    private p0 H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private final com.planner5d.library.database.model.spaces.documents.a f136390g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private final androidx.lifecycle.w0<d> f136391h3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private final Menu f136392p2;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f136393a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f136393a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f136393a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f136393a.invoke(obj);
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

    public DocumentOptionsBottomSheet() {
        this.f136392p2 = null;
        this.f136390g3 = null;
        this.f136391h3 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Menu menu, Function1 function1, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        MenuItem menuItemFindItem = menu.findItem(bundle.getInt(r.bottomSheetResultBundle.f224891a));
        if (menuItemFindItem != null) {
            function1.invoke(menuItemFindItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(DocumentOptionsBottomSheet documentOptionsBottomSheet, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        documentOptionsBottomSheet.getParentFragmentManager().a(r.bottomSheetRequest.f224891a, androidx.core.os.e.b(TuplesKt.to(r.bottomSheetResultBundle.f224891a, Integer.valueOf(it.getItemId()))));
        documentOptionsBottomSheet.dismiss();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(DocumentOptionsBottomSheet documentOptionsBottomSheet, d dVar) {
        p0 p0Var = documentOptionsBottomSheet.H1;
        if (p0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p0Var = null;
        }
        DocumentStatusView.A(p0Var.f159476d, dVar, null, 2, null);
        return Unit.f312394a;
    }

    @Override // com.google.android.material.bottomsheet.f, androidx.appcompat.app.r, androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new com.google.android.material.bottomsheet.e(requireContext(), c1.r.f253010e5);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        p0 p0VarD = p0.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(p0VarD, "inflate(...)");
        TextView textView = p0VarD.f159475c;
        com.planner5d.library.database.model.spaces.documents.a aVar = this.f136390g3;
        textView.setText(aVar != null ? aVar.q() : null);
        this.H1 = p0VarD;
        ConstraintLayout root = p0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(c1.f.W0);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            if (dimensionPixelSize <= 0) {
                dimensionPixelSize = -1;
            }
            window.setLayout(dimensionPixelSize, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f136392p2 == null) {
            dismiss();
            return;
        }
        Function1 function1 = new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.view.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentOptionsBottomSheet.I(this.f136396a, (MenuItem) obj);
            }
        };
        p0 p0Var = this.H1;
        p0 p0Var2 = null;
        if (p0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            p0Var = null;
        }
        p0Var.f159478f.setAdapter(new com.planner5d.library.widget.menu.j(this.f136392p2, androidx.core.content.d.g(requireContext(), c1.e.f250606m4), function1));
        p0 p0Var3 = this.H1;
        if (p0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            p0Var2 = p0Var3;
        }
        DocumentStatusView documentStatus = p0Var2.f159476d;
        Intrinsics.checkNotNullExpressionValue(documentStatus, "documentStatus");
        documentStatus.setVisibility(this.f136391h3 != null ? 0 : 8);
        androidx.lifecycle.w0<d> w0Var = this.f136391h3;
        if (w0Var != null) {
            w0Var.k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.view.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DocumentOptionsBottomSheet.J(this.f136397a, (d) obj);
                }
            }));
        }
    }

    @Override // com.planner5d.library.widget.menu.o
    public void showMenu(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (!isAdded()) {
            showNow(fragmentManager, str);
        }
    }

    public DocumentOptionsBottomSheet(@NotNull FragmentManager fragmentManager, @NotNull final Menu menu, @NotNull com.planner5d.library.database.model.spaces.documents.a document, @Nullable androidx.lifecycle.w0<d> w0Var, @NotNull final Function1<? super MenuItem, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f136392p2 = menu;
        this.f136390g3 = document;
        this.f136391h3 = w0Var;
        fragmentManager.c(r.bottomSheetRequest.f224891a, this, new o0() { // from class: com.planner5d.library.activity.fragment.spaces.view.c
            @Override // androidx.fragment.app.o0
            public final void a(String str, Bundle bundle) {
                DocumentOptionsBottomSheet.H(menu, onItemClick, str, bundle);
            }
        });
    }
}
