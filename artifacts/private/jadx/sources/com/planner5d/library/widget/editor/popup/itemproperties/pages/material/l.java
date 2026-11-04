package com.planner5d.library.widget.editor.popup.itemproperties.pages.material;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.services.utility.v1;
import com.planner5d.library.widget.editor.editaction.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class l extends RecyclerView {
    public static final int Y4 = 0;

    public static final class a implements com.planner5d.library.widget.editor.popup.properties.adapter.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.planner5d.library.services.l.c f257400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ItemNs f257401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f257402c;

        a(ItemNs itemNs, r rVar) {
            this.f257401b = itemNs;
            this.f257402c = rVar;
        }

        @Override // com.planner5d.library.widget.editor.popup.properties.adapter.c.a
        public void a(ItemMaterialSet model) {
            Intrinsics.checkNotNullParameter(model, "model");
            v1.a<com.planner5d.library.services.l.c> aVar = com.planner5d.library.services.l.f224378d;
            com.planner5d.library.services.l.c cVar = new com.planner5d.library.services.l.c(new r(this.f257401b, model), this.f257402c, this.f257400a);
            this.f257400a = cVar;
            aVar.o(cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @NotNull
    public final View d2(@NotNull ItemNs item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemMaterialSet materialSet = item.getMaterialSet();
        setAdapter(new com.planner5d.library.widget.editor.popup.properties.adapter.c(item.getMaterialSets(), materialSet, new a(item, new r(item, materialSet))));
        return this;
    }
}
