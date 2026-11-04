package com.planner5d.library.activity.fragment.dialog.iteminfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.lifecycle.d1;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemMaterialSets;
import com.planner5d.library.model.item.catalog.CatalogItem;
import com.planner5d.library.model.item.catalog.CatalogItemMetadata;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.n3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.services.utility.v1;
import kotlin.Unit;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes6.dex */
public class ItemInfo extends ContentDialog<Void> {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @ij.a
    protected y0 f132080p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @ij.a
    protected k1 f132081q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @ij.a
    protected m2 f132082r3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final h f132079o3 = new h();

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final n3<d> f132083s3 = t3.e(this, d.class);

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f132084t3 = false;

    class a extends com.planner5d.library.widget.bitmaptarget.c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f132085n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ImageView f132086o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ImageView imageView, String str, ImageView imageView2) {
            super(imageView);
            this.f132085n = str;
            this.f132086o = imageView2;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        public void g(Throwable th2) {
            if (!ItemInfo.this.f132084t3) {
                ItemInfo.this.f132079o3.d(this);
                ItemInfo itemInfo = ItemInfo.this;
                itemInfo.f132081q3.b(this.f132085n, itemInfo.f132079o3.c(com.planner5d.library.widget.bitmaptarget.a.a(this.f132086o)));
            }
        }
    }

    public ItemInfo() {
        com.planner5d.library.application.b.r().i0(this);
    }

    private String X(r rVar, String str) {
        String strT = new j(getArguments()).t(rVar, null);
        return (strT == null || strT.isEmpty()) ? str : strT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(StringBuilder sb2, View view) {
        this.f132082r3.a(getActivity(), sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(View view) {
        this.f132083s3.a().Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(Unit unit) {
        sendResultOnce(null);
    }

    public static void show(k kVar, CatalogItem catalogItem) {
        CatalogItemMetadata catalogItemMetadata;
        ItemMaterialSets itemMaterialSets;
        if (catalogItem == null || (catalogItemMetadata = catalogItem.metadata) == null || (itemMaterialSets = catalogItemMetadata.materialSets) == null) {
            return;
        }
        show(kVar, catalogItem, itemMaterialSets.getDefault());
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected View E(@NonNull ViewGroup viewGroup, Bundle bundle) {
        String strX = X(r.id, null);
        if (strX == null) {
            dismiss();
            return null;
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(com.planner5d.library.f.m.f168836t0, viewGroup, false);
        String strX2 = X(r.sku, null);
        this.f132083s3.a().Y(strX, strX2);
        r rVar = r.title;
        if (strX2 == null) {
            strX2 = strX;
        }
        String strX3 = X(rVar, strX2);
        String strX4 = X(r.url, null);
        String strX5 = X(r.urlImage, null);
        String strX6 = X(r.info, strX3);
        String strX7 = X(r.price, null);
        String strX8 = X(r.priceCurrencyCode, null);
        Button button = (Button) viewGroup.findViewById(com.planner5d.library.f.j.C5);
        Button button2 = (Button) viewGroup.findViewById(com.planner5d.library.f.j.f168370s5);
        TextView textView = (TextView) viewInflate.findViewById(com.planner5d.library.f.j.yu);
        TextView textView2 = (TextView) viewInflate.findViewById(com.planner5d.library.f.j.Sl);
        ImageView imageView = (ImageView) viewInflate.findViewById(com.planner5d.library.f.j.Jd);
        ((Button) viewGroup.findViewById(com.planner5d.library.f.j.f168177k5)).setText(com.planner5d.library.f.s.Z2);
        R(strX3, null);
        textView.setText(com.planner5d.library.services.textspan.b.d(strX6));
        if (strX7 == null || strX8 == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(getString(com.planner5d.library.f.s.zu, strX7, strX8));
        }
        if (strX4 == null) {
            button.setVisibility(8);
        } else {
            String string = viewGroup.getContext().getString(com.planner5d.library.f.s.Xm);
            final StringBuilder sb2 = new StringBuilder(strX4);
            if (!string.isEmpty()) {
                sb2.append(strX4.contains(com.planner5d.library.model.payments.a.f222474i) ? b0.f313279d : '?');
                sb2.append(string);
            }
            button.setText(com.planner5d.library.f.s.ht);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.iteminfo.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f132088a.Y(sb2, view);
                }
            });
        }
        button2.setVisibility(0);
        button2.setText(com.planner5d.library.f.s.f168997b0);
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.iteminfo.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132090a.Z(view);
            }
        });
        this.f132080p3.b(strX5, 0, 0, this.f132079o3.c(new a(imageView, strX, imageView)), 4L);
        v1.r(this.f132083s3.a().X(), getViewLifecycleOwner(), new d1() { // from class: com.planner5d.library.activity.fragment.dialog.iteminfo.c
            @Override // androidx.lifecycle.d1
            public final void c(Object obj) {
                this.f132091a.a0((Unit) obj);
            }
        });
        return viewInflate;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.H0;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f132084t3 = true;
        this.f132079o3.a();
    }

    public static void show(k kVar, CatalogItem catalogItem, ItemMaterialSet itemMaterialSet) {
        String str;
        if (catalogItem == null || itemMaterialSet == null) {
            return;
        }
        ItemMaterialSets itemMaterialSets = catalogItem.metadata.materialSets;
        ItemMaterialSet itemMaterialSet2 = itemMaterialSets != null ? itemMaterialSets.getDefault() : null;
        String title = itemMaterialSet.getTitle(itemMaterialSet2);
        k.a aVarC = kVar.c(ItemInfo.class);
        i iVarJ = new i().j(r.id, catalogItem.f180761id).j(r.sku, itemMaterialSet.sku);
        r rVar = r.title;
        StringBuilder sb2 = new StringBuilder();
        String str2 = catalogItem.metadata.title;
        if (str2 == null) {
            str2 = itemMaterialSet.sku;
        }
        sb2.append(str2);
        if (title == null) {
            str = "";
        } else {
            str = ", " + title;
        }
        sb2.append(str);
        aVarC.i(iVarJ.j(rVar, sb2.toString()).j(r.info, itemMaterialSet.getInfo(itemMaterialSet2)).j(r.price, itemMaterialSet.getPrice(itemMaterialSet2)).j(r.priceCurrencyCode, itemMaterialSet.getPriceCurrency(itemMaterialSet2)).j(r.url, itemMaterialSet.getUrl(itemMaterialSet2)).j(r.urlImage, itemMaterialSet.getUrlImage(itemMaterialSet2))).g();
    }
}
