package com.planner5d.library.widget.editor.popup.itemproperties.pages.size;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.planner5d.library.databinding.c7;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.manager.k5;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class c extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f257413f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f257414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k5 f257415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f257416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private List<com.planner5d.library.widget.editor.popup.properties.adapter.b<ItemMaterial>> f257417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f257418e;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nRoomMaterialsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMaterialsAdapter.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/RoomMaterialsAdapter$MaterialViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,82:1\n257#2,2:83\n*S KotlinDebug\n*F\n+ 1 RoomMaterialsAdapter.kt\ncom/planner5d/library/widget/editor/popup/itemproperties/pages/size/RoomMaterialsAdapter$MaterialViewHolder\n*L\n70#1:83,2\n*E\n"})
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f257419c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c7 f257420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private com.planner5d.library.services.bitmaploader.target.a f257421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull c7 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f257420a = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(b bVar, com.planner5d.library.widget.editor.popup.properties.adapter.b bVar2, View view) {
            bVar.a((ItemMaterial) bVar2.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(com.planner5d.library.widget.editor.popup.properties.adapter.b bVar, b bVar2, CompoundButton compoundButton, boolean z10) {
            ItemMaterial itemMaterial = (ItemMaterial) bVar.a();
            if (itemMaterial != null) {
                bVar2.b(new Pair<>(itemMaterial, Boolean.valueOf(z10)));
            }
        }

        public final void i(@NotNull final com.planner5d.library.widget.editor.popup.properties.adapter.b<ItemMaterial> item, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull k5 textureManager, boolean z10, @NotNull final b listener) {
            com.planner5d.library.model.y yVar;
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(textureManager, "textureManager");
            Intrinsics.checkNotNullParameter(listener, "listener");
            c7 c7Var = this.f257420a;
            c7Var.f158824d.setText(item.c());
            c7Var.f158824d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a.j(listener, item, view);
                }
            });
            bitmapTargetManager.d(this.f257421b);
            ShapeableImageView roomMaterialImage = c7Var.f158822b;
            Intrinsics.checkNotNullExpressionValue(roomMaterialImage, "roomMaterialImage");
            String str = null;
            this.f257421b = bitmapTargetManager.c(com.planner5d.library.widget.bitmaptarget.a.g(roomMaterialImage, com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null));
            ItemMaterial itemMaterialA = item.a();
            if (itemMaterialA != null && (yVar = itemMaterialA.texture) != null) {
                str = yVar.f222851c;
            }
            textureManager.v(str, com.planner5d.library.model.p.a.diffuse, com.planner5d.library.model.p.b.small, this.f257421b);
            SwitchMaterial switchMaterial = c7Var.f158823c;
            Intrinsics.checkNotNull(switchMaterial);
            int i10 = 0;
            if (!(z10 && item.d())) {
                i10 = 8;
            }
            switchMaterial.setVisibility(i10);
            switchMaterial.setChecked(item.e());
            switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.widget.editor.popup.itemproperties.pages.size.b
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    c.a.k(item, listener, compoundButton, z11);
                }
            });
        }

        @NotNull
        public final c7 l() {
            return this.f257420a;
        }
    }

    public interface b {
        void a(@Nullable ItemMaterial itemMaterial);

        void b(@NotNull Pair<? extends ItemMaterial, Boolean> pair);
    }

    public c(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull k5 textureManager, @NotNull b listener) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f257414a = bitmapTargetManager;
        this.f257415b = textureManager;
        this.f257416c = listener;
        this.f257417d = CollectionsKt.emptyList();
        this.f257418e = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f257417d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.i(this.f257417d.get(i10), this.f257414a, this.f257415b, this.f257418e, this.f257416c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        c7 c7VarD = c7.d(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c7VarD, "inflate(...)");
        return new a(c7VarD);
    }

    @e.a({"NotifyDataSetChanged"})
    public final void j(@NotNull List<com.planner5d.library.widget.editor.popup.properties.adapter.b<ItemMaterial>> list, boolean z10) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f257417d = list;
        this.f257418e = z10;
        notifyDataSetChanged();
    }
}
