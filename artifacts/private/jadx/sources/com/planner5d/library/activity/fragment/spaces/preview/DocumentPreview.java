package com.planner5d.library.activity.fragment.spaces.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.helper.ui.d;
import com.planner5d.library.databinding.q0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.preloader.t;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDocumentPreview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentPreview.kt\ncom/planner5d/library/activity/fragment/spaces/preview/DocumentPreview\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n*L\n1#1,40:1\n12#2,6:41\n28#2:47\n*S KotlinDebug\n*F\n+ 1 DocumentPreview.kt\ncom/planner5d/library/activity/fragment/spaces/preview/DocumentPreview\n*L\n19#1:41,6\n19#1:47\n*E\n"})
public final class DocumentPreview extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f136369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final t f136370f;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f136371a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f136371a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f136371a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f136371a.invoke(obj);
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

    public DocumentPreview() {
        t3 t3Var = t3.f229751a;
        this.f136369e = new i2(j1.d(b.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f136370f = new t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(q0 q0Var, DocumentPreview documentPreview, Bitmap bitmap) {
        if (bitmap != null) {
            q0Var.f159535b.setSourceBitmap(bitmap);
            q0Var.f159535b.g();
        }
        documentPreview.f136370f.a().u(false);
        return Unit.f312394a;
    }

    private final b z() {
        return (b) this.f136369e.getValue();
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public d getUiState(@Nullable Context context) {
        String string;
        d.b bVar = new d.b(context, this);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(r.title.f224891a)) == null) {
            string = "";
        }
        d dVarX = bVar.K(new k3(string)).w(false).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final q0 q0VarD = q0.d(inflater, viewGroup, false);
        b bVarZ = z();
        Bundle arguments = getArguments();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        bVarZ.Z(arguments, contextRequireContext);
        this.f136370f.b(q0VarD.f159536c).u(true);
        z().X().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.preview.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentPreview.A(q0VarD, this, (Bitmap) obj);
            }
        }));
        ConstraintLayout root = q0VarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
