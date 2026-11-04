package com.planner5d.library.uploadplan.view.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.lifecycle.o0;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.statistics.events.g3;
import com.planner5d.library.services.utility.v1;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nRecognitionTellUsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecognitionTellUsDialog.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionTellUsDialog\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,65:1\n16#2:66\n39#3:67\n55#3,12:68\n84#3,3:80\n*S KotlinDebug\n*F\n+ 1 RecognitionTellUsDialog.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionTellUsDialog\n*L\n20#1:66\n49#1:67\n49#1:68,12\n49#1:80,3\n*E\n"})
public final class RecognitionTellUsDialog extends ContentDialog<Boolean> implements n0 {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final f0 f230920o3 = new i2(j1.d(v.class), new c(), new d(com.planner5d.library.uploadplan.application.g.f230718b.a()), null, 8, null);

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @Nullable
    private View.OnClickListener f230921p3;

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 RecognitionTellUsDialog.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionTellUsDialog\n*L\n1#1,82:1\n63#2:83\n59#3:84\n50#4,3:85\n*E\n"})
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ie.e f230922a;

        public a(ie.e eVar) {
            this.f230922a = eVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f230922a.f287135c.setEnabled(!StringsKt.w3(String.valueOf(charSequence)));
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f230923a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f230923a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f230923a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f230923a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 RecognitionTellUsDialog.kt\ncom/planner5d/library/uploadplan/view/dialog/RecognitionTellUsDialog\n*L\n1#1,16:1\n20#2:17\n*E\n"})
    public static final class c implements Function0<l2> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return RecognitionTellUsDialog.this.getViewModelStore();
        }
    }

    public static final class d implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230925a;

        public d(com.planner5d.library.view.b bVar) {
            this.f230925a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230925a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(ie.e eVar, RecognitionTellUsDialog recognitionTellUsDialog, View view) {
        eVar.f287134b.setEnabled(false);
        eVar.f287135c.setEnabled(false);
        Pair pair = (Pair) recognitionTellUsDialog.A();
        int iIntValue = ((Number) pair.component1()).intValue();
        Project project = (Project) pair.component2();
        v vVarW = recognitionTellUsDialog.W();
        String string = Intrinsics.areEqual(view, eVar.f287134b) ? null : StringsKt.E5(eVar.f287136d.getText().toString()).toString();
        Bundle arguments = recognitionTellUsDialog.getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable(com.planner5d.library.services.r.source.f224891a) : null;
        vVarW.Y(iIntValue, project, string, serializable instanceof le.a.EnumC2326a ? (le.a.EnumC2326a) serializable : null, g3.f216952a.a(recognitionTellUsDialog.getArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(RecognitionTellUsDialog recognitionTellUsDialog, Boolean bool) {
        recognitionTellUsDialog.dismiss();
        com.planner5d.library.uploadplan.application.g.f230718b.a().i().c(RecognitionThankYouDialog.class).g();
        return Unit.f312394a;
    }

    private final v W() {
        return (v) this.f230920o3.getValue();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        final ie.e eVarD = ie.e.d(LayoutInflater.from(root.getContext()), root, false);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.dialog.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognitionTellUsDialog.U(eVarD, this, view);
            }
        };
        this.f230921p3 = onClickListener;
        eVarD.f287134b.setOnClickListener(onClickListener);
        eVarD.f287135c.setOnClickListener(this.f230921p3);
        v1.a<Boolean> aVarX = W().X();
        o0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aVarX.k(viewLifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.uploadplan.view.dialog.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecognitionTellUsDialog.V(this.f231003a, (Boolean) obj);
            }
        }));
        eVarD.f287135c.setEnabled(false);
        EditText edit = eVarD.f287136d;
        Intrinsics.checkNotNullExpressionValue(edit, "edit");
        edit.addTextChangedListener(new a(eVarD));
        ConstraintLayout root2 = eVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.A0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        View.OnClickListener onClickListener = this.f230921p3;
        if (onClickListener != null) {
            onClickListener.onClick(getView());
        }
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.f.t.Fg);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }
}
