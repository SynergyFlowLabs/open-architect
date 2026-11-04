package com.planner5d.library.activity.fragment.dialog.support;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.activity.fragment.CheckableBottomSheetMenuFragment;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.y4;
import com.planner5d.library.services.r;
import com.planner5d.library.services.u;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.editor.projectsettings.ProjectSettingCheckboxView;
import com.planner5d.library.widget.preloader.t;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nSupportDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportDialog.kt\ncom/planner5d/library/activity/fragment/dialog/support/SupportDialog\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,209:1\n16#2:210\n1#3:211\n37#4,2:212\n55#5,12:214\n84#5,3:226\n55#5,12:229\n84#5,3:241\n28#6:244\n*S KotlinDebug\n*F\n+ 1 SupportDialog.kt\ncom/planner5d/library/activity/fragment/dialog/support/SupportDialog\n*L\n40#1:210\n86#1:212,2\n110#1:214,12\n110#1:226,3\n123#1:229,12\n123#1:241,3\n196#1:244\n*E\n"})
public final class SupportDialog extends m {

    @NotNull
    private final f0 H1;

    @ij.a
    public u libraryDialogFactory;

    @ij.a
    public c2 messageManager;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private qc.e f133000p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final t f133001p2 = new t();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133002a;

        static {
            int[] iArr = new int[k.b.values().length];
            try {
                iArr[k.b.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.b.SubmitInProgress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.b.SubmitSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.b.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f133002a = iArr;
        }
    }

    public static final class b extends Dialog {
        b(Context context, int i10) {
            super(context, i10);
        }
    }

    static final class c implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f133003a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f133003a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f133003a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f133003a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SupportDialog.kt\ncom/planner5d/library/activity/fragment/dialog/support/SupportDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n124#2,2:83\n59#3:85\n62#4:86\n*E\n"})
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SupportDialog.this.J().d0();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SupportDialog.kt\ncom/planner5d/library/activity/fragment/dialog/support/SupportDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n111#2,2:83\n59#3:85\n62#4:86\n*E\n"})
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SupportDialog.this.J().d0();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SupportDialog.kt\ncom/planner5d/library/activity/fragment/dialog/support/SupportDialog\n*L\n1#1,16:1\n40#2:17\n*E\n"})
    public static final class f implements Function0<l2> {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SupportDialog.this.getViewModelStore();
        }
    }

    public static final class g implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f133007a;

        public g(com.planner5d.library.view.b bVar) {
            this.f133007a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f133007a;
        }
    }

    public SupportDialog() {
        Function0 function0 = null;
        this.H1 = new i2(j1.d(k.class), new f(), new g(com.planner5d.library.help.application.h.f179982b.a()), function0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k J() {
        return (k) this.H1.getValue();
    }

    private final void K() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setSoftInputMode(16);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.windowAnimations = pc.b.s.W5;
        }
    }

    private final void L() {
        qc.e eVar = this.f133000p1;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        ProjectSettingCheckboxView projectSettingCheckboxView = eVar.f350328b;
        projectSettingCheckboxView.setTitle(getString(pc.b.r.pC));
        projectSettingCheckboxView.setBackgroundColor(0);
        projectSettingCheckboxView.setTitleTextSize(pc.b.f.f342352k3);
        projectSettingCheckboxView.setTitleStyle(pc.b.s.W7);
    }

    private final void M() {
        LinkedList linkedList = new LinkedList();
        for (y4 y4Var : J().a0()) {
            Integer numValueOf = Integer.valueOf(y4Var.n());
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            linkedList.add(new ue.b(numValueOf, y4Var.o(contextRequireContext)));
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        final CheckableBottomSheetMenuFragment checkableBottomSheetMenuFragment = new CheckableBottomSheetMenuFragment(childFragmentManager, null, (ue.b[]) linkedList.toArray(new ue.b[0]), J().Y(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.support.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportDialog.N(this.f133010a, (ue.b) obj);
            }
        });
        qc.e eVar = this.f133000p1;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        eVar.f350336j.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.support.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportDialog.O(checkableBottomSheetMenuFragment, this, view);
            }
        });
        n1.a(this, J().c0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.support.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportDialog.P(this.f133013a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(SupportDialog supportDialog, ue.b selectedOption) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        supportDialog.J().f0(((Number) ((Pair) selectedOption).first).intValue());
        qc.e eVar = supportDialog.f133000p1;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        eVar.f350336j.setText((CharSequence) ((Pair) selectedOption).second);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(CheckableBottomSheetMenuFragment checkableBottomSheetMenuFragment, SupportDialog supportDialog, View view) {
        checkableBottomSheetMenuFragment.setSelected(supportDialog.J().Y());
        FragmentManager childFragmentManager = supportDialog.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        checkableBottomSheetMenuFragment.showMenu(childFragmentManager, null);
        supportDialog.J().d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(SupportDialog supportDialog, Boolean bool) {
        qc.e eVar = supportDialog.f133000p1;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        eVar.f350336j.setTextColor(androidx.core.content.d.g(supportDialog.requireContext(), bool.booleanValue() ? pc.b.e.Wg : pc.b.e.f341721hg));
        return Unit.f312394a;
    }

    private final void Q() {
        final qc.e eVar = this.f133000p1;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        eVar.f350329c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.support.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportDialog.R(this.f133015a, eVar, view);
            }
        });
        n1.a(this, J().b0(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.support.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportDialog.S(eVar, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(SupportDialog supportDialog, qc.e eVar, View view) {
        k kVarJ = supportDialog.J();
        String textAsString = eVar.f350333g.getTextAsString();
        Editable text = eVar.f350330d.getText();
        kVarJ.g0(textAsString, text != null ? text.toString() : null, eVar.f350328b.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(qc.e eVar, Boolean bool) {
        eVar.f350329c.setEnabled(bool.booleanValue());
        return Unit.f312394a;
    }

    private final void T() {
        t tVar = this.f133001p2;
        qc.e eVar = this.f133000p1;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        tVar.b(eVar.f350332f);
        J().X().k(getViewLifecycleOwner(), new c(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.support.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportDialog.U(this.f133009a, (k.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(SupportDialog supportDialog, k.b bVar) {
        int i10 = bVar == null ? -1 : a.f133002a[bVar.ordinal()];
        if (i10 == 1) {
            supportDialog.f133001p2.a().b();
        } else if (i10 == 2) {
            supportDialog.f133001p2.a().m();
        } else if (i10 != 3) {
            boolean z10 = false | false;
            if (i10 != 4) {
                timber.log.b.f381052a.d("Unknown SupportDialog state", new Object[0]);
            } else {
                supportDialog.getMessageManager$P5D_Library_Help_release().e(new com.planner5d.library.model.u(com.planner5d.library.model.u.c.Error, new k3(pc.b.r.f344066na, new Object[0]), com.planner5d.library.model.u.f222818g));
                supportDialog.dismiss();
            }
        } else {
            supportDialog.b0();
            supportDialog.dismiss();
        }
        return Unit.f312394a;
    }

    private final void V() {
        qc.e eVar = this.f133000p1;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        TextInputEditTextCompat supportDescription = eVar.f350330d;
        Intrinsics.checkNotNullExpressionValue(supportDescription, "supportDescription");
        supportDescription.addTextChangedListener(new d());
        n1.a(this, J().V(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.support.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportDialog.W(this.f133018a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(SupportDialog supportDialog, Integer num) {
        qc.e eVar = null;
        if (num == null) {
            qc.e eVar2 = supportDialog.f133000p1;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar2 = null;
            }
            eVar2.f350330d.setError(null);
        } else {
            qc.e eVar3 = supportDialog.f133000p1;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                eVar = eVar3;
            }
            eVar.f350330d.setError(supportDialog.getString(num.intValue()));
        }
        return Unit.f312394a;
    }

    private final void X() {
        qc.e eVar = this.f133000p1;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        TextInputEditTextCompat supportEmail = eVar.f350333g;
        Intrinsics.checkNotNullExpressionValue(supportEmail, "supportEmail");
        supportEmail.addTextChangedListener(new e());
        n1.a(this, J().W(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.support.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportDialog.Y(this.f133014a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(SupportDialog supportDialog, Integer num) {
        qc.e eVar = null;
        if (num == null) {
            qc.e eVar2 = supportDialog.f133000p1;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                eVar2 = null;
            }
            eVar2.f350333g.setError(null);
        } else {
            qc.e eVar3 = supportDialog.f133000p1;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                eVar = eVar3;
            }
            eVar.f350333g.setError(supportDialog.getString(num.intValue()));
        }
        return Unit.f312394a;
    }

    private final void Z() {
        qc.e eVar = this.f133000p1;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            eVar = null;
        }
        Toolbar toolbar = te.h.a(eVar.getRoot()).f380926d;
        toolbar.setTitle(pc.b.r.oC);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.support.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportDialog.a0(this.f133008a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(SupportDialog supportDialog, View view) {
        supportDialog.dismiss();
    }

    private final void b0() {
        int i10 = pc.b.r.rC;
        k kVarJ = J();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String string = com.planner5d.library.services.textspan.b.d(getString(i10, kVarJ.Z(contextRequireContext))).toString();
        u libraryDialogFactory$P5D_Library_Help_release = getLibraryDialogFactory$P5D_Library_Help_release();
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        libraryDialogFactory$P5D_Library_Help_release.b(supportFragmentManager, new com.planner5d.library.services.utility.i().j(r.message, string).a());
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

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        K();
        Z();
        M();
        X();
        V();
        L();
        Q();
        T();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.help.application.h.f179982b.a().v(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, pc.b.s.V5);
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        b bVar = new b(requireContext(), getTheme());
        Window window = bVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-1));
        }
        bVar.setCanceledOnTouchOutside(false);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        qc.e eVarD = qc.e.d(inflater, viewGroup, false);
        this.f133000p1 = eVarD;
        CoordinatorLayout coordinatorLayoutB = eVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    public final void setLibraryDialogFactory$P5D_Library_Help_release(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<set-?>");
        this.libraryDialogFactory = uVar;
    }

    public final void setMessageManager$P5D_Library_Help_release(@NotNull c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<set-?>");
        this.messageManager = c2Var;
    }
}
