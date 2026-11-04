package com.planner5d.library.uploadplan.view;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.u1;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.feed.FeedFragment;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.textview.ButtonTextView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nUploadPlanScaleUnitsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadPlanScaleUnitsFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleUnitsFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,237:1\n16#2:238\n257#3,2:239\n257#3,2:241\n278#3,2:288\n257#3,2:290\n257#3,2:292\n257#3,2:294\n257#3,2:296\n55#4,12:243\n84#4,3:255\n55#4,12:258\n84#4,3:270\n55#4,12:273\n84#4,3:285\n*S KotlinDebug\n*F\n+ 1 UploadPlanScaleUnitsFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleUnitsFragment\n*L\n39#1:238\n49#1:239,2\n50#1:241,2\n106#1:288,2\n107#1:290,2\n108#1:292,2\n125#1:294,2\n163#1:296,2\n60#1:243,12\n60#1:255,3\n67#1:258,12\n67#1:270,3\n73#1:273,12\n73#1:285,3\n*E\n"})
public final class UploadPlanScaleUnitsFragment extends FragmentController implements com.planner5d.library.activity.helper.ui.a {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f230861h = 20;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f230862e = new i2(j1.d(s0.class), new g(), new h(com.planner5d.library.uploadplan.application.g.f230718b.a()), null, 8, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ie.m f230863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f230864g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230865a;

        static {
            int[] iArr = new int[s0.a.values().length];
            try {
                iArr[s0.a.Feed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f230865a = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 UploadPlanScaleUnitsFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleUnitsFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n61#2,6:83\n59#3:89\n62#4:90\n*E\n"})
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ie.m f230866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UploadPlanScaleUnitsFragment f230867b;

        public c(ie.m mVar, UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment) {
            this.f230866a = mVar;
            this.f230867b = uploadPlanScaleUnitsFragment;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable != null && editable.length() > 0) {
                Editable text = this.f230866a.f287183j.getText();
                if (text != null) {
                    text.clear();
                }
                Editable text2 = this.f230866a.f287185l.getText();
                if (text2 != null) {
                    text2.clear();
                }
            }
            this.f230867b.Y();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 UploadPlanScaleUnitsFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleUnitsFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n68#2,5:83\n59#3:88\n62#4:89\n*E\n"})
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ie.m f230868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UploadPlanScaleUnitsFragment f230869b;

        public d(ie.m mVar, UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment) {
            this.f230868a = mVar;
            this.f230869b = uploadPlanScaleUnitsFragment;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Editable text;
            if (editable != null && editable.length() > 0 && (text = this.f230868a.f287181h.getText()) != null) {
                text.clear();
            }
            this.f230869b.Y();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 UploadPlanScaleUnitsFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleUnitsFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n74#2,6:83\n59#3:89\n62#4:90\n*E\n"})
    public static final class e implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ie.m f230870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UploadPlanScaleUnitsFragment f230871b;

        public e(ie.m mVar, UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment) {
            this.f230870a = mVar;
            this.f230871b = uploadPlanScaleUnitsFragment;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Editable text;
            if (editable != null && editable.length() > 0 && (text = this.f230870a.f287181h.getText()) != null) {
                text.clear();
            }
            UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment = this.f230871b;
            TextInputEditTextCompat scaleInInput = this.f230870a.f287185l;
            Intrinsics.checkNotNullExpressionValue(scaleInInput, "scaleInInput");
            uploadPlanScaleUnitsFragment.W(scaleInInput, 12L);
            this.f230871b.Y();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    static final class f implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f230872a;

        f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f230872a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f230872a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f230872a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 UploadPlanScaleUnitsFragment.kt\ncom/planner5d/library/uploadplan/view/UploadPlanScaleUnitsFragment\n*L\n1#1,16:1\n39#2:17\n*E\n"})
    public static final class g implements Function0<l2> {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return UploadPlanScaleUnitsFragment.this.getViewModelStore();
        }
    }

    public static final class h implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230874a;

        public h(com.planner5d.library.view.b bVar) {
            this.f230874a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230874a;
        }
    }

    private final String H() {
        String string;
        if (I() > 0) {
            double dH0 = K().h0(I());
            string = getString(he.b.s.f284286q0, Long.valueOf(I()), Integer.valueOf(K().i0(dH0)), Float.valueOf(K().p0(dH0)));
        } else {
            string = getString(he.b.s.f284310r0, Long.valueOf(J()), Long.valueOf(L()), Float.valueOf(a0()));
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    private final long I() {
        ie.m mVar = this.f230863f;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar = null;
        }
        return M(mVar.f287181h.getTextAsString());
    }

    private final long J() {
        ie.m mVar = this.f230863f;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar = null;
        }
        return M(mVar.f287183j.getTextAsString());
    }

    private final s0 K() {
        return (s0) this.f230862e.getValue();
    }

    private final long L() {
        ie.m mVar = this.f230863f;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar = null;
        }
        return M(mVar.f287185l.getTextAsString());
    }

    private final long M(String str) {
        if (str == null || str.length() <= 0) {
            return 0L;
        }
        return Long.parseLong(str);
    }

    private final void N(s0.a aVar) {
        Pair pair;
        if ((aVar == null ? -1 : b.f230865a[aVar.ordinal()]) == 1) {
            pair = Intrinsics.areEqual(this.f230864g, "feed") ? new Pair(FeedFragment.class, null) : new Pair(ProjectsPagesFragment.class, new com.planner5d.library.services.utility.i(getArguments()).t(com.planner5d.library.services.r.tab, com.planner5d.library.services.r.floorPlansList).a());
        } else {
            pair = null;
        }
        if (pair != null) {
            com.planner5d.library.activity.fragment.x.g(this.f131538b, new com.planner5d.library.activity.helper.event.content.c((Class) pair.getFirst(), (Bundle) pair.getSecond(), com.planner5d.library.activity.helper.event.content.e.SlideLeft), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment, View view) {
        uploadPlanScaleUnitsFragment.c0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment, View view) {
        uploadPlanScaleUnitsFragment.c0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment, View view) {
        uploadPlanScaleUnitsFragment.f131538b.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment, View view) {
        uploadPlanScaleUnitsFragment.d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment, s0.b bVar) {
        com.planner5d.library.activity.helper.ui.d.f(uploadPlanScaleUnitsFragment, new com.planner5d.library.activity.helper.ui.b(bVar.a(), null, true));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(UploadPlanScaleUnitsFragment uploadPlanScaleUnitsFragment, s0.a aVar) {
        uploadPlanScaleUnitsFragment.N(aVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(TextInputEditTextCompat textInputEditTextCompat, long j10) {
        if (M(textInputEditTextCompat.getTextAsString()) > j10) {
            textInputEditTextCompat.setText(String.valueOf(j10));
            textInputEditTextCompat.setSelection(String.valueOf(j10).length());
        }
    }

    private final void X() {
        ie.m mVar = this.f230863f;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar = null;
        }
        TextView textView = mVar.f287177d;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility((a0() > 0.0f ? 1 : (a0() == 0.0f ? 0 : -1)) > 0 ? 0 : 8);
        String strH = H();
        boolean z10 = a0() < 20.0f;
        if (z10) {
            strH = getString(he.b.s.H0) + "<br/>" + strH;
        }
        textView.setText(com.planner5d.library.services.textspan.b.d(strH));
        textView.setCompoundDrawablesWithIntrinsicBounds(z10 ? he.b.h.Lc : he.b.h.O9, 0, 0, 0);
        textView.setBackground(androidx.core.content.d.l(requireContext(), z10 ? he.b.h.f282524k2 : he.b.h.f282504j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        X();
        Z();
    }

    private final void Z() {
        ie.m mVar = this.f230863f;
        ie.m mVar2 = null;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar = null;
        }
        ButtonTextView submitButton = mVar.f287187n;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        submitButton.setVisibility((a0() > 0.0f ? 1 : (a0() == 0.0f ? 0 : -1)) > 0 ? 0 : 8);
        ie.m mVar3 = this.f230863f;
        if (mVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar3 = null;
        }
        ButtonTextView buttonTextView = mVar3.f287187n;
        ie.m mVar4 = this.f230863f;
        if (mVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mVar2 = mVar4;
        }
        buttonTextView.setText(mVar2.f287175b.isSelected() ? getString(he.b.s.f283900a1, Long.valueOf(I())) : getString(he.b.s.f283925b1, Long.valueOf(J()), Long.valueOf(L())));
    }

    private final float a0() {
        ie.m mVar = this.f230863f;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar = null;
        }
        return mVar.f287175b.isSelected() ? I() : K().n0(b0());
    }

    private final long b0() {
        return (J() * 12) + L();
    }

    private final void c0(boolean z10) {
        K().r0();
        ie.m mVar = this.f230863f;
        ie.m mVar2 = null;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar = null;
        }
        mVar.f287175b.setSelected(z10);
        ie.m mVar3 = this.f230863f;
        if (mVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar3 = null;
        }
        mVar3.f287176c.setSelected(!z10);
        ie.m mVar4 = this.f230863f;
        if (mVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar4 = null;
        }
        TextInputLayout scaleCmInputLayout = mVar4.f287182i;
        Intrinsics.checkNotNullExpressionValue(scaleCmInputLayout, "scaleCmInputLayout");
        int i10 = 0;
        scaleCmInputLayout.setVisibility(!z10 ? 4 : 0);
        ie.m mVar5 = this.f230863f;
        if (mVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar5 = null;
        }
        TextInputLayout scaleFtInputLayout = mVar5.f287184k;
        Intrinsics.checkNotNullExpressionValue(scaleFtInputLayout, "scaleFtInputLayout");
        scaleFtInputLayout.setVisibility(!z10 ? 0 : 8);
        ie.m mVar6 = this.f230863f;
        if (mVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar6 = null;
        }
        TextInputLayout scaleInInputLayout = mVar6.f287186m;
        Intrinsics.checkNotNullExpressionValue(scaleInInputLayout, "scaleInInputLayout");
        if (z10) {
            i10 = 8;
        }
        scaleInInputLayout.setVisibility(i10);
        if (z10) {
            ie.m mVar7 = this.f230863f;
            if (mVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mVar7 = null;
            }
            mVar7.f287181h.requestFocus();
        } else {
            ie.m mVar8 = this.f230863f;
            if (mVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mVar8 = null;
            }
            mVar8.f287183j.requestFocus();
        }
        ie.m mVar9 = this.f230863f;
        if (mVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mVar2 = mVar9;
        }
        com.planner5d.library.services.s.f(mVar2.f287181h, true);
        Y();
    }

    private final void d0() {
        K().s0(e4.a.enter_ruler_lenght);
        K().t0();
        float[] fArrK = new com.planner5d.library.services.utility.j(getArguments()).k(com.planner5d.library.services.r.rulerPoints, new float[0]);
        if (fArrK == null) {
            new Function0() { // from class: com.planner5d.library.uploadplan.view.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UploadPlanScaleUnitsFragment.e0();
                }
            };
            return;
        }
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k(fArrK[0], fArrK[1]);
        com.planner5d.library.math.k kVar2 = new com.planner5d.library.math.k(fArrK[2], fArrK[3]);
        s0 s0VarK = K();
        float fA0 = a0();
        ie.m mVar = this.f230863f;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar = null;
        }
        s0VarK.u0(kVar, kVar2, fA0, mVar.f287175b.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0() {
        timber.log.b.f381052a.e(new IllegalArgumentException("No ruler points"));
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.activity.helper.ui.a
    @NotNull
    public com.planner5d.library.activity.helper.ui.d getUiState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.activity.helper.ui.d dVarX = new com.planner5d.library.activity.helper.ui.d.b(context, this).w(false).N(false).A(he.b.f.f281409m1).H(true).z(he.b.f.f281409m1).G(false).y(he.b.f.f281409m1).x();
        Intrinsics.checkNotNullExpressionValue(dVarX, "build(...)");
        return dVarX;
    }

    @Override // com.planner5d.library.activity.fragment.FragmentController, androidx.fragment.app.Fragment
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer the extended version of this method instead")
    public /* synthetic */ View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        K().q0(e4.c.f216886a.a(getArguments()));
        this.f230864g = new com.planner5d.library.services.utility.j(getArguments()).t(com.planner5d.library.services.r.source, "my_projects");
        ie.m mVarC = ie.m.c(inflater);
        Intrinsics.checkNotNullExpressionValue(mVarC, "inflate(...)");
        ButtonTextView submitButton = mVarC.f287187n;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        submitButton.setVisibility(8);
        TextView conversionPanel = mVarC.f287177d;
        Intrinsics.checkNotNullExpressionValue(conversionPanel, "conversionPanel");
        conversionPanel.setVisibility(8);
        mVarC.f287175b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanScaleUnitsFragment.O(this.f231053a, view);
            }
        });
        mVarC.f287176c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanScaleUnitsFragment.P(this.f231087a, view);
            }
        });
        mVarC.f287180g.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanScaleUnitsFragment.Q(this.f231106a, view);
            }
        });
        TextInputEditTextCompat scaleCmInput = mVarC.f287181h;
        Intrinsics.checkNotNullExpressionValue(scaleCmInput, "scaleCmInput");
        scaleCmInput.addTextChangedListener(new c(mVarC, this));
        TextInputEditTextCompat scaleFtInput = mVarC.f287183j;
        Intrinsics.checkNotNullExpressionValue(scaleFtInput, "scaleFtInput");
        scaleFtInput.addTextChangedListener(new d(mVarC, this));
        TextInputEditTextCompat scaleInInput = mVarC.f287185l;
        Intrinsics.checkNotNullExpressionValue(scaleInInput, "scaleInInput");
        scaleInInput.addTextChangedListener(new e(mVarC, this));
        K().o0();
        mVarC.f287187n.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.uploadplan.view.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadPlanScaleUnitsFragment.R(this.f231108a, view);
            }
        });
        K().m0().k(getViewLifecycleOwner(), new f(new Function1() { // from class: com.planner5d.library.uploadplan.view.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanScaleUnitsFragment.S(this.f231110a, (s0.b) obj);
            }
        }));
        K().l0().k(getViewLifecycleOwner(), new f(new Function1() { // from class: com.planner5d.library.uploadplan.view.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadPlanScaleUnitsFragment.T(this.f231112a, (s0.a) obj);
            }
        }));
        this.f230863f = mVarC;
        u1.j2(mVarC.getRoot(), new ef.a(new Function0() { // from class: com.planner5d.library.uploadplan.view.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UploadPlanScaleUnitsFragment.U();
            }
        }, new Function0() { // from class: com.planner5d.library.uploadplan.view.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UploadPlanScaleUnitsFragment.V();
            }
        }));
        ie.m mVar = this.f230863f;
        if (mVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mVar = null;
        }
        FrameLayout root = mVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
