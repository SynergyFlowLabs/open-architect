package com.planner5d.library.activity.fragment.spaces.file;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import com.planner5d.library.activity.fragment.CheckableBottomSheetMenuRedesignFragment;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.spaces.view.o;
import com.planner5d.library.databinding.y;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.y3;
import com.planner5d.library.widget.preloader.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@SourceDebugExtension({"SMAP\nDocumentEdit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocumentEdit.kt\ncom/planner5d/library/activity/fragment/spaces/file/DocumentEdit\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n12#2,6:116\n28#2:122\n1567#3:123\n1598#3,3:124\n1601#3:128\n1#4:127\n37#5,2:129\n*S KotlinDebug\n*F\n+ 1 DocumentEdit.kt\ncom/planner5d/library/activity/fragment/spaces/file/DocumentEdit\n*L\n27#1:116,6\n27#1:122\n111#1:123\n111#1:124,3\n111#1:128\n113#1:129,2\n*E\n"})
public final class DocumentEdit extends FragmentController implements com.planner5d.library.activity.helper.ui.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f136246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y f136247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final t f136248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f136250i;

    public static final class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            if (DocumentEdit.this.f136249h) {
                i iVarF = DocumentEdit.this.F();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                iVarF.v0(string);
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
        private final /* synthetic */ Function1 f136252a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f136252a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f136252a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f136252a.invoke(obj);
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

    public DocumentEdit() {
        t3 t3Var = t3.f229751a;
        this.f136246e = new i2(j1.d(i.class), new t3.c(this), t3.d.f229756a, null, 8, null);
        this.f136248g = new t();
        this.f136249h = true;
        this.f136250i = true;
        com.planner5d.library.application.b.f142455c.a().I1(this);
    }

    private final ue.b[] E(List<com.planner5d.library.database.model.spaces.documents.c> list) {
        List<com.planner5d.library.database.model.spaces.documents.c> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ue.b bVar = new ue.b(Integer.valueOf(i10), ((com.planner5d.library.database.model.spaces.documents.c) obj).q());
            bVar.b(Integer.valueOf(com.planner5d.library.f.h.F8));
            arrayList.add(bVar);
            i10 = i11;
        }
        return (ue.b[]) arrayList.toArray(new ue.b[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i F() {
        return (i) this.f136246e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(DocumentEdit documentEdit, Boolean bool) {
        y3.f229862a.l(documentEdit).invalidateMenu();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(final DocumentEdit documentEdit, final com.planner5d.library.activity.fragment.spaces.file.a aVar) {
        documentEdit.f136248g.a().u(aVar instanceof l);
        if (aVar instanceof com.planner5d.library.activity.fragment.spaces.file.b) {
            com.planner5d.library.activity.fragment.spaces.file.b bVar = (com.planner5d.library.activity.fragment.spaces.file.b) aVar;
            y yVar = null;
            if (bVar.c() != null) {
                y yVar2 = documentEdit.f136247f;
                if (yVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yVar2 = null;
                }
                yVar2.f159920h.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.spaces.file.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DocumentEdit.I(this.f136265a, aVar, view);
                    }
                });
            }
            com.planner5d.library.database.model.spaces.documents.c cVarD = bVar.d();
            if (cVarD != null) {
                y yVar3 = documentEdit.f136247f;
                if (yVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yVar3 = null;
                }
                yVar3.f159921i.setText(cVarD.q());
            }
            Bitmap bitmapB = bVar.b();
            if (bitmapB != null) {
                y yVar4 = documentEdit.f136247f;
                if (yVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    yVar4 = null;
                }
                yVar4.f159915c.setImageBitmap(bitmapB);
            }
            String strA = bVar.a();
            if (strA != null) {
                documentEdit.f136249h = false;
                y yVar5 = documentEdit.f136247f;
                if (yVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    yVar = yVar5;
                }
                yVar.f159914b.setText(strA);
                documentEdit.f136249h = true;
            }
        } else if (aVar instanceof k) {
            documentEdit.f131538b.j();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(DocumentEdit documentEdit, com.planner5d.library.activity.fragment.spaces.file.a aVar, View view) {
        com.planner5d.library.activity.fragment.spaces.file.b bVar = (com.planner5d.library.activity.fragment.spaces.file.b) aVar;
        documentEdit.M(bVar.c(), bVar.d());
    }

    private final void J() {
        y3.f229862a.l(this).addMenuProvider(new o(this.f136250i ? com.planner5d.library.f.s.BG : com.planner5d.library.f.s.vA, new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.file.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(DocumentEdit.K(this.f136263a));
            }
        }, new Function0() { // from class: com.planner5d.library.activity.fragment.spaces.file.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocumentEdit.L(this.f136264a);
            }
        }), getViewLifecycleOwner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(DocumentEdit documentEdit) {
        return Intrinsics.areEqual(documentEdit.F().n0().f(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(DocumentEdit documentEdit) {
        documentEdit.F().m0();
        return Unit.f312394a;
    }

    private final void M(final List<com.planner5d.library.database.model.spaces.documents.c> list, com.planner5d.library.database.model.spaces.documents.c cVar) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        CheckableBottomSheetMenuRedesignFragment checkableBottomSheetMenuRedesignFragment = new CheckableBottomSheetMenuRedesignFragment(childFragmentManager, getString(com.planner5d.library.f.s.f169564yc), E(list), CollectionsKt.contains(list, cVar) ? Integer.valueOf(CollectionsKt.indexOf((List<? extends com.planner5d.library.database.model.spaces.documents.c>) list, cVar)) : null, new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.file.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentEdit.N(list, this, (ue.b) obj);
            }
        });
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        com.planner5d.library.widget.menu.o.a.a(checkableBottomSheetMenuRedesignFragment, childFragmentManager2, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(List list, DocumentEdit documentEdit, ue.b selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Object first = ((Pair) selectedItem).first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        com.planner5d.library.database.model.spaces.documents.c cVar = (com.planner5d.library.database.model.spaces.documents.c) list.get(((Number) first).intValue());
        y yVar = documentEdit.f136247f;
        if (yVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yVar = null;
        }
        yVar.f159921i.setText((CharSequence) ((Pair) selectedItem).second);
        documentEdit.F().s0(cVar);
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
        Bundle arguments = getArguments();
        this.f136250i = arguments != null ? arguments.getBoolean(r.createDocument.f224891a, true) : true;
        i iVarF = F();
        boolean z10 = this.f136250i;
        Bundle arguments2 = getArguments();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        iVarF.t0(z10, arguments2, contextRequireContext);
        this.f136247f = y.d(inflater, viewGroup, false);
        J();
        y yVar = this.f136247f;
        y yVar2 = null;
        if (yVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yVar = null;
        }
        this.f136248g.b(yVar.f159919g);
        yVar.f159914b.addTextChangedListener(new a());
        F().n0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.file.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentEdit.G(this.f136259a, (Boolean) obj);
            }
        }));
        F().o0().k(getViewLifecycleOwner(), new b(new Function1() { // from class: com.planner5d.library.activity.fragment.spaces.file.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentEdit.H(this.f136260a, (a) obj);
            }
        }));
        y yVar3 = this.f136247f;
        if (yVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yVar2 = yVar3;
        }
        ConstraintLayout root = yVar2.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
