package com.planner5d.library.activity.fragment.spaces.folder;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.a2;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.spaces.documents.r;
import com.planner5d.library.activity.fragment.spaces.view.o;
import com.planner5d.library.databinding.u0;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.y3;
import kotlin.Pair;
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
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFolderEdit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderEdit.kt\ncom/planner5d/library/activity/fragment/spaces/folder/FolderEdit\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,100:1\n12#2,6:101\n28#2:107\n257#3,2:108\n*S KotlinDebug\n*F\n+ 1 FolderEdit.kt\ncom/planner5d/library/activity/fragment/spaces/folder/FolderEdit\n*L\n30#1:101,6\n30#1:107\n52#1:108,2\n*E\n"})
public final class FolderEdit extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f136321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u0 f136322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136324h;

    public static final class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            if (FolderEdit.this.f136324h) {
                i iVarF = FolderEdit.this.F();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                iVarF.w0(string);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f136326a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f136326a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f136326a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f136326a.invoke(obj);
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

    public FolderEdit() {
        t3 t3Var = t3.f229751a;
        this.f136321e = new i2(j1.d(i.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f136323g = true;
        this.f136324h = true;
        com.planner5d.library.application.b.f142455c.a().b1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i F() {
        return (i) this.f136321e.getValue();
    }

    private final void G(int i10) {
        kotlin.enums.a<r> aVarL = r.l();
        Object objClamp = new Range(0, Integer.valueOf(r.l().size())).clamp(Integer.valueOf(i10));
        Intrinsics.checkNotNullExpressionValue(objClamp, "clamp(...)");
        r rVar = aVarL.get(((Number) objClamp).intValue());
        u0 u0Var = this.f136322f;
        if (u0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u0Var = null;
        }
        u0Var.f159734e.setImageTintList(androidx.core.content.d.h(requireActivity(), rVar.n()));
        if (this.f136324h) {
            F().x0(rVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(FolderEdit folderEdit, RadioGroup radioGroup, int i10) {
        u0 u0Var = folderEdit.f136322f;
        u0 u0Var2 = null;
        if (u0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u0Var = null;
        }
        RadioGroup radioGroup2 = u0Var.f159731b;
        u0 u0Var3 = folderEdit.f136322f;
        if (u0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            u0Var2 = u0Var3;
        }
        folderEdit.G(radioGroup2.indexOfChild(u0Var2.f159731b.findViewById(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(FolderEdit folderEdit, View view) {
        folderEdit.F().r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(FolderEdit folderEdit, Boolean bool) {
        if (bool.booleanValue()) {
            folderEdit.f131538b.j();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(FolderEdit folderEdit, Pair pair) {
        r rVar = (r) pair.component1();
        String str = (String) pair.component2();
        folderEdit.f136324h = false;
        u0 u0Var = folderEdit.f136322f;
        u0 u0Var2 = null;
        if (u0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u0Var = null;
        }
        RadioGroup radioGroup = u0Var.f159731b;
        u0 u0Var3 = folderEdit.f136322f;
        if (u0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u0Var3 = null;
        }
        RadioGroup colorList = u0Var3.f159731b;
        Intrinsics.checkNotNullExpressionValue(colorList, "colorList");
        radioGroup.check(a2.d(colorList, r.l().indexOf(rVar)).getId());
        u0 u0Var4 = folderEdit.f136322f;
        if (u0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            u0Var2 = u0Var4;
        }
        u0Var2.f159733d.setText(str);
        folderEdit.f136324h = true;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(FolderEdit folderEdit, Boolean bool) {
        y3.f229862a.l(folderEdit).invalidateMenu();
        return Unit.f312394a;
    }

    private final void M() {
        y3.f229862a.l(this).addMenuProvider(new o(this.f136323g ? com.planner5d.library.f.s.f169172i5 : com.planner5d.library.f.s.vA, new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.folder.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(FolderEdit.N(this.f136327a));
            }
        }, new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.folder.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FolderEdit.O(this.f136328a);
            }
        }), getViewLifecycleOwner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(FolderEdit folderEdit) {
        return Intrinsics.areEqual(folderEdit.F().o0().f(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(FolderEdit folderEdit) {
        folderEdit.F().t0();
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@Nullable Context context) {
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).u(com.planner5d.library.activity.helper.ui.d.a.f137158e).w(false).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f136323g = new com.planner5d.library.services.utility.j(getArguments()).f(com.planner5d.library.services.r.createFolder, true);
        F().u0(this.f136323g, getArguments());
        this.f136322f = u0.d(inflater, viewGroup, false);
        M();
        u0 u0Var = this.f136322f;
        u0 u0Var2 = null;
        if (u0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u0Var = null;
        }
        RadioGroup radioGroup = u0Var.f159731b;
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.planner5d.library.activity.fragment.spaces.folder.c
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i10) {
                FolderEdit.H(this.f136329a, radioGroup2, i10);
            }
        });
        Intrinsics.checkNotNull(radioGroup);
        radioGroup.check(((View) kotlin.sequences.o.B0(a2.e(radioGroup))).getId());
        u0 u0Var3 = this.f136322f;
        if (u0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u0Var3 = null;
        }
        FrameLayout frameLayout = u0Var3.f159732c;
        Intrinsics.checkNotNull(frameLayout);
        frameLayout.setVisibility(this.f136323g ? 8 : 0);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.spaces.folder.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FolderEdit.I(this.f136330a, view);
            }
        });
        u0 u0Var4 = this.f136322f;
        if (u0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            u0Var4 = null;
        }
        u0Var4.f159733d.addTextChangedListener(new a());
        F().p0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.folder.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FolderEdit.J(this.f136331a, (Boolean) obj);
            }
        }));
        F().q0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.folder.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FolderEdit.K(this.f136332a, (Pair) obj);
            }
        }));
        F().o0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.folder.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FolderEdit.L(this.f136333a, (Boolean) obj);
            }
        }));
        u0 u0Var5 = this.f136322f;
        if (u0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            u0Var2 = u0Var5;
        }
        LinearLayout root = u0Var2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
