package com.planner5d.library.activity.fragment.dialog.wishlist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.helper.b0;
import com.planner5d.library.activity.helper.m2;
import com.planner5d.library.f;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.model.n;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.preloader.t;
import java.util.ArrayList;
import le.l;
import rx.Subscriber;

/* JADX INFO: loaded from: classes6.dex */
public class WishList extends ContentDialog<Void> {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @ij.a
    protected i f133109o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @ij.a
    protected k1 f133110p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @ij.a
    protected p0 f133111q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @ij.a
    protected b0 f133112r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.application.d f133113s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @ij.a
    protected b2 f133114t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @ij.a
    protected m2 f133115u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @ij.a
    protected l f133116v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private ListView f133117w3 = null;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private TextView f133118x3 = null;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private TextView f133119y3 = null;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private final h f133120z3 = new h();
    private Drawable A3 = null;
    private final t B3 = new t();

    class a extends com.planner5d.library.services.rx.e<PdfDocument> {
        a() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            WishList.this.e0(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(PdfDocument pdfDocument) {
            WishList.this.f0(pdfDocument);
        }
    }

    class b extends com.planner5d.library.services.rx.e<n[]> {
        b() {
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            WishList.this.f133119y3.setVisibility(8);
            WishList.this.f133118x3.setVisibility(0);
            WishList.this.f133118x3.setText("Error: load failed");
            WishList.this.f133117w3.setVisibility(8);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(n[] nVarArr) {
            if (WishList.this.getActivity() == null) {
                WishList.this.dismiss();
                return;
            }
            WishList.this.B3.b(WishList.this.getView()).b();
            if (nVarArr != null && nVarArr.length > 0) {
                WishList.this.f133119y3.setVisibility(0);
                WishList.this.f133117w3.setAdapter((ListAdapter) new com.planner5d.library.activity.fragment.dialog.wishlist.c(WishList.this.A3, WishList.this.f133120z3, WishList.this.f133110p3, nVarArr));
            } else {
                WishList.this.f133119y3.setVisibility(8);
                WishList.this.f133118x3.setVisibility(0);
                WishList.this.f133118x3.setText(f.s.PH);
                WishList.this.f133117w3.setVisibility(8);
            }
        }
    }

    class c implements l.a {
        c() {
        }

        @Override // le.l.a
        public void a(@androidx.annotation.p0 String str) {
            if (str != null) {
                WishList.this.f133114t3.b(f.s.AA, str);
            }
            WishList.this.dismiss();
        }

        @Override // le.l.a
        public void onError(@NonNull Throwable th2) {
            WishList.this.e0(th2);
        }
    }

    public WishList() {
        com.planner5d.library.application.b.r().c0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(AdapterView adapterView, View view, int i10, long j10) {
        this.f133115u3.a(getActivity(), ((n) adapterView.getAdapter().getItem(i10)).j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(Context context, View view) {
        this.B3.b(getView()).a(f.s.GA, false);
        new com.planner5d.library.services.pdf.b(context, this.f133113s3, this.A3, this.f133110p3, this.f133111q3, ((com.planner5d.library.activity.fragment.dialog.wishlist.c) this.f133117w3.getAdapter()).b()).b().subscribe((Subscriber<? super PdfDocument>) new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(Throwable th2) {
        this.f133114t3.r(new ErrorMessageException(f.s.R8, th2.getMessage()));
        this.B3.b(getView()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(PdfDocument pdfDocument) {
        this.f133116v3.a(pdfDocument, new c());
    }

    public static void show(k kVar, ItemProject itemProject) {
        ArrayList arrayList = new ArrayList();
        if (itemProject != null) {
            for (ItemFloor itemFloor : itemProject.getFloorArray()) {
                if (itemFloor != null) {
                    for (Item item : itemFloor.getChildren()) {
                        if (item instanceof ItemNs) {
                            ItemNs itemNs = (ItemNs) item;
                            ItemMaterialSet materialSet = itemNs.getMaterialSet();
                            arrayList.add(itemNs.getModelId());
                            arrayList.add(materialSet == null ? null : materialSet.sku);
                        }
                    }
                }
            }
        }
        kVar.c(WishList.class).h(new com.planner5d.library.services.utility.i().l(r.wishlist, arrayList).a()).g();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected View E(@NonNull ViewGroup viewGroup, Bundle bundle) {
        final Context contextRequireContext = requireContext();
        this.A3 = com.planner5d.library.widget.drawable.c.f254258a.a(contextRequireContext, f.h.f167666m9, null);
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(getContext()).inflate(f.m.f168683f1, viewGroup, false);
        this.B3.b(viewGroup).a(f.s.qn, false);
        viewGroup.findViewById(f.j.tv).setVisibility(8);
        TextView textView = (TextView) viewGroup.findViewById(f.j.C5);
        this.f133119y3 = textView;
        textView.setText(f.s.zA);
        this.f133119y3.setVisibility(8);
        this.f133117w3 = (ListView) viewGroup2.findViewById(f.j.f168332qg);
        this.f133118x3 = (TextView) viewGroup2.findViewById(f.j.Hh);
        this.f133117w3.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.wishlist.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                this.f133124a.c0(adapterView, view, i10, j10);
            }
        });
        this.f133119y3.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.wishlist.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133125a.d0(contextRequireContext, view);
            }
        });
        this.f133109o3.k0(new j(getArguments()).v(r.wishlist, new String[0])).subscribe((Subscriber<? super n[]>) new b());
        return viewGroup2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return f.m.f168858v0;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f133120z3.a();
    }
}
