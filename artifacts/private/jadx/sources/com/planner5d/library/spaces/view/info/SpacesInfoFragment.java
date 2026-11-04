package com.planner5d.library.spaces.view.info;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.services.utility.n1;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.spaces.entity.SpacesProjectData;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSpacesInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesInfoFragment.kt\ncom/planner5d/library/spaces/view/info/SpacesInfoFragment\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewUtils.kt\ncom/planner5d/library/services/utility/ViewUtils\n*L\n1#1,130:1\n16#2:131\n1#3:132\n190#4,12:133\n*S KotlinDebug\n*F\n+ 1 SpacesInfoFragment.kt\ncom/planner5d/library/spaces/view/info/SpacesInfoFragment\n*L\n31#1:131\n49#1:133,12\n*E\n"})
public final class SpacesInfoFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f230310a = new i2(j1.d(g.class), new a(), new b(com.planner5d.library.spaces.application.e.f229982b.a()), null, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.planner5d.library.services.bitmaploader.target.h f230311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ee.c f230312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup.MarginLayoutParams f230313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f230314e;

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 SpacesInfoFragment.kt\ncom/planner5d/library/spaces/view/info/SpacesInfoFragment\n*L\n1#1,16:1\n31#2:17\n*E\n"})
    public static final class a implements Function0<l2> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return SpacesInfoFragment.this.getViewModelStore();
        }
    }

    public static final class b implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f230316a;

        public b(com.planner5d.library.view.b bVar) {
            this.f230316a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f230316a;
        }
    }

    private final com.planner5d.library.model.f A(ImageView imageView, String str) {
        com.planner5d.library.services.bitmaploader.target.h hVar = this.f230311b;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmapTargetManager");
            hVar = null;
        }
        com.planner5d.library.services.bitmaploader.target.a aVarC = hVar.c(com.planner5d.library.widget.bitmaptarget.a.f(imageView, null, 1, null));
        g gVarZ = z();
        Intrinsics.checkNotNull(aVarC);
        gVarZ.Z(aVarC, str);
        Intrinsics.checkNotNullExpressionValue(aVarC, "also(...)");
        return aVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SpacesInfoFragment spacesInfoFragment, View view) {
        spacesInfoFragment.z().c0();
        androidx.navigation.fragment.f.a(spacesInfoFragment).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(ee.c cVar, Boolean bool) {
        cVar.f274781c.setEnabled(!bool.booleanValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(ee.c cVar, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        y3 y3Var = y3.f229862a;
        ViewParent root = cVar.getRoot();
        while (!(root instanceof ff.a)) {
            root = root != null ? root.getParent() : null;
            if (root == null) {
                timber.log.b.f381052a.e(new RuntimeException("Expected parent not found"));
                root = null;
                break;
            }
        }
        ff.a aVar = (ff.a) root;
        if (aVar != null) {
            aVar.onOnboardingStepComplete();
        }
        return Unit.f312394a;
    }

    private final void E() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            final SpacesProjectData spacesProjectDataC = e.fromBundle(arguments).c();
            Intrinsics.checkNotNullExpressionValue(spacesProjectDataC, "getSpacesProjectData(...)");
            ee.c cVar = this.f230312c;
            ee.c cVar2 = null;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cVar = null;
            }
            cVar.f274782d.setText(spacesProjectDataC.k());
            G(spacesProjectDataC);
            ee.c cVar3 = this.f230312c;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cVar3 = null;
            }
            TextView textView = cVar3.f274785g;
            String strN = spacesProjectDataC.n();
            if (strN == null) {
                strN = getString(de.b.r.f272856hi, Integer.valueOf(r.g1(new IntRange(3, 10), kotlin.random.f.f312895a)));
                Intrinsics.checkNotNullExpressionValue(strN, "getString(...)");
            }
            textView.setText(strN);
            String strL = spacesProjectDataC.l();
            if (strL != null) {
                ee.c cVar4 = this.f230312c;
                if (cVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cVar4 = null;
                }
                ImageView houseImage = cVar4.f274783e;
                Intrinsics.checkNotNullExpressionValue(houseImage, "houseImage");
                A(houseImage, strL);
            }
            ee.c cVar5 = this.f230312c;
            if (cVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cVar2 = cVar5;
            }
            cVar2.f274781c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.info.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SpacesInfoFragment.F(this.f230317a, spacesProjectDataC, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(SpacesInfoFragment spacesInfoFragment, SpacesProjectData spacesProjectData, View view) {
        spacesInfoFragment.z().a0(spacesProjectData);
    }

    private final void G(SpacesProjectData spacesProjectData) {
        this.f230313d = new ViewGroup.MarginLayoutParams(-1, getResources().getDimensionPixelSize(de.b.f.Ad));
        this.f230314e = getResources().getDimensionPixelSize(de.b.f.Kd);
        Integer numM = spacesProjectData.m();
        if (numM != null) {
            int iIntValue = numM.intValue();
            int i10 = de.b.g.f271759e8;
            String quantityString = getResources().getQuantityString(de.b.p.f272642c, iIntValue, Integer.valueOf(iIntValue));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            x(i10, quantityString);
        }
        Integer numO = spacesProjectData.o();
        if (numO != null) {
            int iIntValue2 = numO.intValue();
            int i11 = de.b.g.G9;
            String string = getString(de.b.r.f272832gi, Integer.valueOf(iIntValue2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            x(i11, string);
        }
        Long lP = spacesProjectData.p();
        if (lP != null) {
            x(de.b.g.X8, z().W(Long.valueOf(lP.longValue())));
        }
        Integer numQ = spacesProjectData.q();
        if (numQ != null) {
            int iIntValue3 = numQ.intValue();
            int i12 = de.b.g.X5;
            String string2 = getString(de.b.r.f272904ji, Integer.valueOf(iIntValue3));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            x(i12, string2);
        }
    }

    private final void x(int i10, String str) {
        ee.c cVar = this.f230312c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cVar = null;
        }
        LinearLayout linearLayout = cVar.f274784f;
        TextView textView = new TextView(getContext());
        textView.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f230313d;
        if (marginLayoutParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("infoLineLayoutParams");
            marginLayoutParams = null;
        }
        textView.setLayoutParams(marginLayoutParams);
        textView.setText(str);
        int i11 = this.f230314e;
        textView.setPadding(i11, 0, i11, 0);
        textView.setGravity(16);
        textView.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.d.l(textView.getContext(), i10), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(de.b.f.Pd));
        textView.setTextAppearance(de.b.s.N7);
        textView.setTextColor(androidx.core.content.d.g(requireContext(), de.b.e.f271135vl));
        linearLayout.addView(textView);
    }

    private final void y(ee.c cVar) {
        u1.j2(cVar.f274780b, new ef.g(getResources().getDimensionPixelSize(de.b.f.Pd)));
        u1.j2(cVar.f274786h, new ef.f(com.github.danielnilsson9.colorpickerview.view.d.a(getContext(), 94.0f), null, 2, null));
        u1.j2(cVar.f274781c, new ef.f(getResources().getDimensionPixelSize(de.b.f.f271670yd), null, 2, null));
    }

    private final g z() {
        return (g) this.f230310a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final ee.c cVarD = ee.c.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(cVarD, "inflate(...)");
        this.f230311b = new com.planner5d.library.services.bitmaploader.target.h.a().a(getViewLifecycleOwner());
        y(cVarD);
        cVarD.f274780b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.spaces.view.info.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpacesInfoFragment.B(this.f230319a, view);
            }
        });
        n1.a(this, z().Y(), new Function1() { // from class: com.planner5d.library.spaces.view.info.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpacesInfoFragment.C(cVarD, (Boolean) obj);
            }
        });
        n1.a(this, z().X(), new Function1() { // from class: com.planner5d.library.spaces.view.info.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpacesInfoFragment.D(cVarD, (Unit) obj);
            }
        });
        this.f230312c = cVarD;
        E();
        ee.c cVar = this.f230312c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cVar = null;
        }
        ConstraintLayout root = cVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        z().b0();
    }
}
