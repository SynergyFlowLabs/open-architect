package com.planner5d.library.widget.editor.popup.itemselect;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.r;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.f;
import com.planner5d.library.databinding.n4;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemGround;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.model.item.ItemUtilities;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.services.bitmaploader.target.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nItemSelectChooserDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemSelectChooserDialog.kt\ncom/planner5d/library/widget/editor/popup/itemselect/ItemSelectChooserDialog\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,219:1\n37#2,2:220\n37#2,2:222\n28#3:224\n*S KotlinDebug\n*F\n+ 1 ItemSelectChooserDialog.kt\ncom/planner5d/library/widget/editor/popup/itemselect/ItemSelectChooserDialog\n*L\n100#1:220,2\n106#1:222,2\n115#1:224\n*E\n"})
public final class ItemSelectChooserDialog extends m {
    public static final int $stable = 8;

    @Nullable
    private c H1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private f f257903p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private a f257904p2;

    private static final class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final k1 f257905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final b[] f257906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Drawable[] f257907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final h f257908d;

        public a(@NotNull k1 manager, @NotNull b[] list, @NotNull Drawable[] icons) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(icons, "icons");
            this.f257905a = manager;
            this.f257906b = list;
            this.f257907c = icons;
            this.f257908d = new h();
        }

        @NotNull
        public final Drawable[] a() {
            return this.f257907c;
        }

        @Override // android.widget.Adapter
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b getItem(int i10) {
            return this.f257906b[i10];
        }

        @NotNull
        public final b[] c() {
            return this.f257906b;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f257906b.length;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        @NotNull
        public View getView(int i10, @Nullable View itemView, @Nullable ViewGroup viewGroup) {
            if (itemView == null) {
                Intrinsics.checkNotNull(viewGroup);
                itemView = new e(viewGroup, this.f257908d, this.f257905a, this.f257907c).itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            }
            Object tag = itemView.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.planner5d.library.widget.editor.popup.itemselect.ItemSelectChooserDialog.ViewHolder");
            ((e) tag).g(getItem(i10));
            return itemView;
        }
    }

    @w0(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f257909d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f257910e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Item f257911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private CatalogItem f257912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private CharSequence f257913c;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code duplicated, block: B:18:0x0047  */
            /* JADX WARN: Code duplicated, block: B:20:0x0049  */
            public final CatalogItem b(Item item) {
                String str;
                String modelId;
                if (item instanceof ItemNs) {
                    modelId = ((ItemNs) item).getModelId();
                } else {
                    if (!(item instanceof ItemPr)) {
                        if (item instanceof ItemGround) {
                            modelId = (item instanceof ItemRoom ? "room" : "ground") + "/0";
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            return null;
                        }
                        return new CatalogItem(str, true, 0L, null, null, true, true, true, true, true);
                    }
                    modelId = "pr/0";
                }
                str = modelId;
                if (str == null) {
                    return null;
                }
                return new CatalogItem(str, true, 0L, null, null, true, true, true, true, true);
            }

            private a() {
            }
        }

        public b(@NotNull Item item, @Nullable CatalogItem catalogItem, @NotNull CharSequence title) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f257911a = item;
            this.f257912b = catalogItem;
            this.f257913c = title;
        }

        public static /* synthetic */ b e(b bVar, Item item, CatalogItem catalogItem, CharSequence charSequence, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                item = bVar.f257911a;
            }
            if ((i10 & 2) != 0) {
                catalogItem = bVar.f257912b;
            }
            if ((i10 & 4) != 0) {
                charSequence = bVar.f257913c;
            }
            return bVar.d(item, catalogItem, charSequence);
        }

        @NotNull
        public final Item a() {
            return this.f257911a;
        }

        @Nullable
        public final CatalogItem b() {
            return this.f257912b;
        }

        @NotNull
        public final CharSequence c() {
            return this.f257913c;
        }

        @NotNull
        public final b d(@NotNull Item item, @Nullable CatalogItem catalogItem, @NotNull CharSequence title) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(title, "title");
            return new b(item, catalogItem, title);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f257911a, bVar.f257911a) && Intrinsics.areEqual(this.f257912b, bVar.f257912b) && Intrinsics.areEqual(this.f257913c, bVar.f257913c);
        }

        @Nullable
        public final CatalogItem f() {
            return this.f257912b;
        }

        @NotNull
        public final Item g() {
            return this.f257911a;
        }

        @NotNull
        public final CharSequence h() {
            return this.f257913c;
        }

        public int hashCode() {
            int iHashCode = this.f257911a.hashCode() * 31;
            CatalogItem catalogItem = this.f257912b;
            return ((iHashCode + (catalogItem == null ? 0 : catalogItem.hashCode())) * 31) + this.f257913c.hashCode();
        }

        public final void i(@Nullable CatalogItem catalogItem) {
            this.f257912b = catalogItem;
        }

        public final void j(@NotNull Item item) {
            Intrinsics.checkNotNullParameter(item, "<set-?>");
            this.f257911a = item;
        }

        public final void k(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
            this.f257913c = charSequence;
        }

        @NotNull
        public String toString() {
            return "AdapterItem(item=" + this.f257911a + ", catalogItem=" + this.f257912b + ", title=" + ((Object) this.f257913c) + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@NotNull Context context, @NotNull Item... items) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(items, "items");
            Item item = items[0];
            CatalogItem catalogItemB = f257909d.b(item);
            CharSequence titleWithIds = ItemUtilities.INSTANCE.getTitleWithIds(context, (Item[]) Arrays.copyOf(items, items.length));
            Intrinsics.checkNotNull(titleWithIds);
            this(item, catalogItemB, titleWithIds);
        }
    }

    public interface c {
        void a(@Nullable Item item);
    }

    @SourceDebugExtension({"SMAP\nItemSelectChooserDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemSelectChooserDialog.kt\ncom/planner5d/library/widget/editor/popup/itemselect/ItemSelectChooserDialog$TextViewToHasSetImageBitmapTargetAdapter\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,219:1\n27#2:220\n28#3:221\n*S KotlinDebug\n*F\n+ 1 ItemSelectChooserDialog.kt\ncom/planner5d/library/widget/editor/popup/itemselect/ItemSelectChooserDialog$TextViewToHasSetImageBitmapTargetAdapter\n*L\n212#1:220\n212#1:221\n*E\n"})
    private static final class d implements com.planner5d.library.services.bitmaploader.target.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final TextView f257914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Context f257915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Rect f257916c;

        public d(@NotNull TextView viewText, @NotNull Context context, @NotNull Rect iconSize) {
            Intrinsics.checkNotNullParameter(viewText, "viewText");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(iconSize, "iconSize");
            this.f257914a = viewText;
            this.f257915b = context;
            this.f257916c = iconSize;
        }

        public static /* synthetic */ d e(d dVar, TextView textView, Context context, Rect rect, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                textView = dVar.f257914a;
            }
            if ((i10 & 2) != 0) {
                context = dVar.f257915b;
            }
            if ((i10 & 4) != 0) {
                rect = dVar.f257916c;
            }
            return dVar.d(textView, context, rect);
        }

        @NotNull
        public final TextView a() {
            return this.f257914a;
        }

        @NotNull
        public final Context b() {
            return this.f257915b;
        }

        @NotNull
        public final Rect c() {
            return this.f257916c;
        }

        @NotNull
        public final d d(@NotNull TextView viewText, @NotNull Context context, @NotNull Rect iconSize) {
            Intrinsics.checkNotNullParameter(viewText, "viewText");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(iconSize, "iconSize");
            return new d(viewText, context, iconSize);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (Intrinsics.areEqual(this.f257914a, dVar.f257914a) && Intrinsics.areEqual(this.f257915b, dVar.f257915b) && Intrinsics.areEqual(this.f257916c, dVar.f257916c)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Context f() {
            return this.f257915b;
        }

        @NotNull
        public final Rect g() {
            return this.f257916c;
        }

        @NotNull
        public final TextView h() {
            return this.f257914a;
        }

        public int hashCode() {
            return (((this.f257914a.hashCode() * 31) + this.f257915b.hashCode()) * 31) + this.f257916c.hashCode();
        }

        @Override // com.planner5d.library.services.bitmaploader.target.m
        public void setImageBitmap(@Nullable Bitmap bitmap) {
            Drawable colorDrawable;
            if (bitmap != null) {
                Resources resources = this.f257915b.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                colorDrawable = new BitmapDrawable(resources, bitmap);
            } else {
                colorDrawable = new ColorDrawable(0);
            }
            colorDrawable.setBounds(this.f257916c);
            r.u(this.f257914a, colorDrawable, null, null, null);
            this.f257914a.setPaddingRelative(0, 0, 0, 0);
        }

        @NotNull
        public String toString() {
            return "TextViewToHasSetImageBitmapTargetAdapter(viewText=" + this.f257914a + ", context=" + this.f257915b + ", iconSize=" + this.f257916c + ")";
        }
    }

    @SourceDebugExtension({"SMAP\nItemSelectChooserDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemSelectChooserDialog.kt\ncom/planner5d/library/widget/editor/popup/itemselect/ItemSelectChooserDialog$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
    private static final class e extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final h f257917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final k1 f257918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Drawable[] f257919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final TextView f257920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Context f257921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final Rect f257922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private com.planner5d.library.services.bitmaploader.target.a f257923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private b f257924h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        private d f257925i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull ViewGroup container, @NotNull h bitmapTargetManager, @NotNull k1 manager, @NotNull Drawable[] icons) {
            super(n4.d(LayoutInflater.from(container.getContext()), container, false).getRoot());
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(icons, "icons");
            this.f257917a = bitmapTargetManager;
            this.f257918b = manager;
            this.f257919c = icons;
            View view = this.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) view;
            this.f257920d = textView;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f257921e = context;
            this.itemView.setTag(this);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.planner5d.library.f.g.Ah);
            Rect rect = new Rect(0, 0, dimensionPixelSize, dimensionPixelSize);
            this.f257922f = rect;
            this.f257925i = new d(textView, context, rect);
        }

        public final void g(@NotNull b item) {
            char c10;
            Intrinsics.checkNotNullParameter(item, "item");
            this.f257924h = item;
            this.f257920d.setText(item.h());
            this.f257917a.d(this.f257923g);
            this.f257923g = null;
            if (item.f() != null) {
                k1 k1Var = this.f257918b;
                CatalogItem catalogItemF = item.f();
                com.planner5d.library.services.bitmaploader.target.a aVarC = this.f257917a.c(new com.planner5d.library.widget.bitmaptarget.b(this.f257925i));
                this.f257923g = aVarC;
                Unit unit = Unit.f312394a;
                k1Var.a(catalogItemF, aVarC);
                return;
            }
            Item itemG = item.g();
            if (itemG instanceof ItemPoint) {
                c10 = 0;
            } else {
                c10 = itemG instanceof ItemWall ? (char) 1 : (char) 2;
            }
            Drawable drawable = this.f257919c[c10];
            if (drawable != null) {
                drawable.setBounds(this.f257922f);
            }
            r.u(this.f257920d, drawable, null, null, null);
            this.f257920d.setPaddingRelative(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(ItemSelectChooserDialog itemSelectChooserDialog, AdapterView adapterView, View view, int i10, long j10) {
        Object item = adapterView.getAdapter().getItem(i10);
        Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.planner5d.library.widget.editor.popup.itemselect.ItemSelectChooserDialog.AdapterItem");
        b bVar = (b) item;
        c cVar = itemSelectChooserDialog.H1;
        if (cVar != null) {
            cVar.a(bVar.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(ItemSelectChooserDialog itemSelectChooserDialog, View view) {
        itemSelectChooserDialog.dismiss();
    }

    private final b[] E(Context context, Item[] itemArr) {
        b bVar;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Collections.addAll(linkedList, Arrays.copyOf(itemArr, itemArr.length));
        while (!linkedList.isEmpty()) {
            Item item = (Item) linkedList.remove(0);
            if (item instanceof ItemPoint) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(item);
                ItemWalls parentWalls = ((ItemPoint) item).getParentWalls();
                if (parentWalls != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        Item item2 = (Item) it.next();
                        if ((item2 instanceof ItemPoint) && parentWalls == ((ItemPoint) item2).getParentWalls()) {
                            linkedList3.add(item2);
                            it.remove();
                        }
                    }
                }
                Item[] itemArr2 = (Item[]) linkedList3.toArray(new Item[0]);
                bVar = new b(context, (Item[]) Arrays.copyOf(itemArr2, itemArr2.length));
            } else {
                bVar = new b(context, item);
            }
            linkedList2.add(bVar);
        }
        return (b[]) linkedList2.toArray(new b[0]);
    }

    public final void createList(@NotNull Context context, @NotNull k1 itemManager, @NotNull Item[] items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemManager, "itemManager");
        Intrinsics.checkNotNullParameter(items, "items");
        b[] bVarArrE = E(context, items);
        com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
        this.f257904p2 = new a(itemManager, bVarArrE, new Drawable[]{cVar.a(context, com.planner5d.library.f.h.f167554ga, null), cVar.a(context, com.planner5d.library.f.h.Kb, null), new ColorDrawable()});
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        f fVarC = f.c(inflater);
        Intrinsics.checkNotNullExpressionValue(fVarC, "inflate(...)");
        fVarC.f158934f.setText(getString(com.planner5d.library.f.s.bB));
        ListView listView = fVarC.f158931c;
        listView.setDivider(null);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.planner5d.library.widget.editor.popup.itemselect.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                ItemSelectChooserDialog.C(this.f257926a, adapterView, view, i10, j10);
            }
        });
        listView.setAdapter((ListAdapter) this.f257904p2);
        fVarC.f158930b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.itemselect.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemSelectChooserDialog.D(this.f257927a, view);
            }
        });
        this.f257903p1 = fVarC;
        ConstraintLayout root = fVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public final void setOnItemChosenListener(@NotNull c onItemChosenListener) {
        Intrinsics.checkNotNullParameter(onItemChosenListener, "onItemChosenListener");
        this.H1 = onItemChosenListener;
    }
}
