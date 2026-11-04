package com.planner5d.library.widget.editor.popup.itemproperties.pages.material;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.GridLayoutManagerItemDecorationInvalidation;
import com.planner5d.library.widget.j0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.g0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMaterialsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialsView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/material/MaterialsView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,40:1\n11165#2:41\n11500#2,3:42\n37#3,2:45\n*S KotlinDebug\n*F\n+ 1 MaterialsView.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/material/MaterialsView\n*L\n32#1:41\n32#1:42,3\n32#1:45,2\n*E\n"})
public final class n extends RecyclerView {

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final int f257404a5 = 8;

    @NotNull
    private final i Y4;

    @Nullable
    private com.planner5d.library.widget.editor.popup.properties.adapter.g Z4;

    /* synthetic */ class a extends g0 implements Function1<i.a, Unit> {
        a(Object obj) {
            super(1, obj, n.class, "refreshAdapterMaterials", "refreshAdapterMaterials(Lcom/planner5d/library/widget/editor/popup/itemproperties/pages/material/ItemPropertiesMaterialsPageViewModel$MaterialsUiState;)V", 0);
        }

        public final void X(i.a p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((n) this.receiver).g2(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i.a aVar) {
            X(aVar);
            return Unit.f312394a;
        }
    }

    static final class b implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f257405a;

        b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f257405a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f257405a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f257405a.invoke(obj);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context, @NotNull i viewModel, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull o0 lifecycleOwner) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.Y4 = viewModel;
        setLayoutManager(new GridLayoutManagerItemDecorationInvalidation(this, 3));
        com.planner5d.library.widget.editor.popup.properties.adapter.g gVar = new com.planner5d.library.widget.editor.popup.properties.adapter.g(viewModel.f0(), bitmapTargetManager, new com.planner5d.library.widget.editor.popup.properties.adapter.g.a() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.material.m
            @Override // com.planner5d.library.widget.editor.popup.properties.adapter.g.a
            public final void a(ItemMaterial itemMaterial) {
                n.e2(this.f257403a, itemMaterial);
            }
        });
        n(new j0(context.getResources().getDimensionPixelSize(gVar.q())));
        this.Z4 = gVar;
        viewModel.j0().k(lifecycleOwner, new b(new a(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(n nVar, ItemMaterial itemMaterial) {
        i iVar = nVar.Y4;
        Intrinsics.checkNotNull(itemMaterial);
        iVar.y0(itemMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(i.a aVar) {
        String[] strArr;
        com.planner5d.library.widget.editor.popup.properties.adapter.g gVar = this.Z4;
        if (gVar != null) {
            ItemMaterial[] itemMaterialArrB = aVar.b();
            if (itemMaterialArrB == null) {
                itemMaterialArrB = new ItemMaterial[0];
            }
            k3[] k3VarArrC = aVar.c();
            if (k3VarArrC != null) {
                ArrayList arrayList = new ArrayList(k3VarArrC.length);
                for (k3 k3Var : k3VarArrC) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    arrayList.add(k3Var.i(context).toString());
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            } else {
                strArr = null;
            }
            gVar.z(itemMaterialArrB, strArr, this.Y4.h0(), aVar.a() instanceof ItemRoom ? (ItemRoom) aVar.a() : null);
        }
        setAdapter(this.Z4);
    }
}
