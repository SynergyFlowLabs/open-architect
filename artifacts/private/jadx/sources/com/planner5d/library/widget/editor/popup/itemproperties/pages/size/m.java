package com.planner5d.library.widget.editor.popup.itemproperties.pages.size;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.google.android.material.textfield.TextInputLayout;
import com.planner5d.library.databinding.p7;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.widget.NumberInputView;
import com.planner5d.library.widget.SliderViewV2;
import com.planner5d.library.widget.TextInputEditTextCompat;
import com.planner5d.library.widget.n1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomSettingsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingsView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/RoomSettingsView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,147:1\n1#2:148\n257#3,2:149\n257#3,2:151\n257#3,2:153\n257#3,2:155\n257#3,2:157\n257#3,2:159\n*S KotlinDebug\n*F\n+ 1 RoomSettingsView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/RoomSettingsView\n*L\n90#1:149,2\n91#1:151,2\n95#1:153,2\n101#1:155,2\n106#1:157,2\n113#1:159,2\n*E\n"})
public final class m extends NestedScrollView {
    public static final int C3 = 8;

    @NotNull
    private final n1<com.planner5d.library.model.v> A3;

    @NotNull
    private final com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c B3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @NotNull
    private final q f257620x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f257621y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    private final p7 f257622z3;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<q.a, Unit> {
        a(Object obj) {
            super(1, obj, m.class, "onItemChanged", "onItemChanged(Lcom/planner5d/library/widget/editor/popup/itemproperties/pages/size/RoomSettingsViewModel$SelectedItemData;)V", 0);
        }

        public final void X(q.a p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((m) this.receiver).v0(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(q.a aVar) {
            X(aVar);
            return Unit.f312394a;
        }
    }

    static final class b implements d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f257623a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f257623a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f257623a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f257623a.invoke(obj);
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

    @SourceDebugExtension({"SMAP\nRoomSettingsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingsView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/RoomSettingsView$setupMaterials$materialsAdapter$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
    public static final class c implements com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c.b {
        c() {
        }

        @Override // com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c.b
        public void a(ItemMaterial itemMaterial) {
            if (itemMaterial != null) {
                m.this.f257620x3.Y0(itemMaterial);
            }
        }

        @Override // com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c.b
        public void b(Pair<? extends ItemMaterial, Boolean> toggleResult) {
            Intrinsics.checkNotNullParameter(toggleResult, "toggleResult");
            m.this.f257620x3.c1(toggleResult);
        }
    }

    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Intrinsics.checkNotNullParameter(editable, "editable");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(text, "text");
            m.this.f257620x3.O0(text.toString());
        }
    }

    public static final class e implements SliderViewV2.c {
        e() {
        }

        @Override // com.planner5d.library.widget.SliderViewV2.c
        public void a() {
            m.this.f257620x3.b1();
        }

        @Override // com.planner5d.library.widget.SliderViewV2.c
        public void b(int i10) {
            m.this.f257620x3.Q0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull final Context context, @NotNull q viewModel, @NotNull o0 lifecycleOwner, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        this.f257620x3 = viewModel;
        this.f257621y3 = bitmapTargetManager;
        p7 p7VarB = p7.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(p7VarB, "inflate(...)");
        this.f257622z3 = p7VarB;
        n1<com.planner5d.library.model.v> n1Var = new n1<>(context, new ArrayList());
        n1Var.b(false);
        this.A3 = n1Var;
        y0();
        this.B3 = x0();
        viewModel.D0().k(lifecycleOwner, new b(new a(this)));
        viewModel.E0().k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.p0(this.f257437a, (ItemMaterial) obj);
            }
        }));
        viewModel.H0().k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.q0(this.f257439a, context, (ze.c) obj);
            }
        }));
        viewModel.t0().k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.r0(this.f257442a, (Range) obj);
            }
        }));
        viewModel.r0().k(lifecycleOwner, new b(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.s0(this.f257614a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A0(m mVar, int i10) {
        q.X0(mVar.f257620x3, i10, false, 2, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(m mVar, BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        mVar.f257620x3.U0(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(m mVar, AdapterView adapterView, View view, int i10, long j10) {
        mVar.f257620x3.P0((com.planner5d.library.model.v) mVar.A3.getItem(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(m mVar, BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        mVar.f257620x3.V0(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(m mVar, ItemMaterial itemMaterial) {
        mVar.w0(itemMaterial);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(m mVar, Context context, ze.c cVar) {
        mVar.B3.j(mVar.f257620x3.v0(context), !mVar.f257620x3.L0());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(m mVar, Range range) {
        if (range != null) {
            mVar.f257622z3.f159518b.setRange(range);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(m mVar, List list) {
        n1<com.planner5d.library.model.v> n1Var = mVar.A3;
        n1Var.clear();
        n1Var.addAll(list);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(q.a aVar) {
        boolean zL0 = this.f257620x3.L0();
        TextView roomPropertiesTitleLabel = this.f257622z3.f159523g;
        Intrinsics.checkNotNullExpressionValue(roomPropertiesTitleLabel, "roomPropertiesTitleLabel");
        roomPropertiesTitleLabel.setVisibility(!zL0 ? 0 : 8);
        TextInputLayout roomPropertiesTitleInputLayout = this.f257622z3.f159522f;
        Intrinsics.checkNotNullExpressionValue(roomPropertiesTitleInputLayout, "roomPropertiesTitleInputLayout");
        roomPropertiesTitleInputLayout.setVisibility(!zL0 ? 0 : 8);
        TextInputEditTextCompat textInputEditTextCompat = this.f257622z3.f159521e;
        ItemRoom itemRoomU0 = this.f257620x3.u0();
        textInputEditTextCompat.setText(itemRoomU0 != null ? itemRoomU0.getTitle() : null);
        EditText editText = this.f257622z3.f159524h.getEditText();
        AutoCompleteTextView autoCompleteTextView = editText instanceof AutoCompleteTextView ? (AutoCompleteTextView) editText : null;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setText((CharSequence) aVar.d().b(), false);
        }
        NumberInputView numberInputView = this.f257622z3.f159519c;
        Intrinsics.checkNotNull(numberInputView);
        numberInputView.setVisibility(!zL0 ? 0 : 8);
        numberInputView.P(com.planner5d.library.f.s.f169324od, aVar.b());
        numberInputView.R(aVar.c(), false);
        numberInputView.setRange(this.f257620x3.A0());
        NumberInputView numberInputView2 = this.f257622z3.f159526j;
        Intrinsics.checkNotNull(numberInputView2);
        numberInputView2.setVisibility(!zL0 ? 0 : 8);
        numberInputView2.P(com.planner5d.library.f.s.lH, aVar.b());
        numberInputView2.setRange(aVar.h());
        numberInputView2.R(aVar.g(), false);
        SliderViewV2 roomRotation = this.f257622z3.f159527k;
        Intrinsics.checkNotNullExpressionValue(roomRotation, "roomRotation");
        roomRotation.setVisibility(aVar.f() ? 0 : 8);
        if (aVar.f()) {
            this.f257622z3.f159527k.G(aVar.e(), false);
        }
        NumberInputView numberInputView3 = this.f257622z3.f159518b;
        Intrinsics.checkNotNull(numberInputView3);
        numberInputView3.setVisibility(zL0 ? 8 : 0);
        numberInputView3.P(com.planner5d.library.f.s.f169347pc, aVar.b());
        NumberInputView.S(numberInputView3, aVar.a(), false, 2, null);
        com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c cVar = this.B3;
        q qVar = this.f257620x3;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cVar.j(qVar.v0(context), !this.f257620x3.L0());
        scrollTo(0, 0);
    }

    private final void w0(ItemMaterial itemMaterial) {
        Integer numX0;
        com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c cVar = this.B3;
        q qVar = this.f257620x3;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cVar.j(qVar.v0(context), !this.f257620x3.L0());
        q qVar2 = this.f257620x3;
        if (itemMaterial == null || (numX0 = qVar2.x0(itemMaterial)) == null) {
            return;
        }
        this.B3.notifyItemChanged(numX0.intValue());
    }

    private final com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c x0() {
        com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c cVar = new com.planner5d.library.widget.editor.popup.itemproperties.pages.size.c(this.f257621y3, this.f257620x3.I0(), new c());
        q qVar = this.f257620x3;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cVar.j(qVar.v0(context), !this.f257620x3.L0());
        this.f257622z3.f159520d.setAdapter(cVar);
        return cVar;
    }

    private final void y0() {
        this.f257622z3.f159521e.addTextChangedListener(new d());
        EditText editText = this.f257622z3.f159524h.getEditText();
        AutoCompleteTextView autoCompleteTextView = editText instanceof AutoCompleteTextView ? (AutoCompleteTextView) editText : null;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setAdapter(this.A3);
            autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.d
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                    m.C0(this.f257423a, adapterView, view, i10, j10);
                }
            });
        }
        this.f257622z3.f159519c.setOnValueChangeListener(new NumberInputView.b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.e
            @Override // com.planner5d.library.widget.NumberInputView.b
            public final void a(BigDecimal bigDecimal, boolean z10) {
                m.D0(this.f257425a, bigDecimal, z10);
            }
        });
        this.f257622z3.f159526j.setOnValueChangeListener(new NumberInputView.b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.f
            @Override // com.planner5d.library.widget.NumberInputView.b
            public final void a(BigDecimal bigDecimal, boolean z10) {
                m.z0(this.f257427a, bigDecimal, z10);
            }
        });
        this.f257622z3.f159527k.setTouchListener(new e());
        this.f257622z3.f159527k.setOnSliderChangeListener(new Function1() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.A0(this.f257429a, ((Integer) obj).intValue());
            }
        });
        this.f257622z3.f159527k.setIcon(Integer.valueOf(com.planner5d.library.f.h.Ra));
        this.f257622z3.f159518b.setOnValueChangeListener(new NumberInputView.b() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.h
            @Override // com.planner5d.library.widget.NumberInputView.b
            public final void a(BigDecimal bigDecimal, boolean z10) {
                m.B0(this.f257431a, bigDecimal, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(m mVar, BigDecimal value, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        mVar.f257620x3.a1(value);
    }

    @NotNull
    public final p7 getBinding() {
        return this.f257622z3;
    }
}
