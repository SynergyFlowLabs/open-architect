package com.planner5d.library.dgenerator.fragment.gallery.pager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.database.model.AutoStyleImage;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f160193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f160194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private List<AutoStyleImage> f160195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Map<Integer, com.planner5d.library.services.bitmaploader.target.a> f160196d;

    public a(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        this.f160193a = bitmapTargetManager;
        this.f160194b = imageManager;
        this.f160195c = CollectionsKt.emptyList();
        this.f160196d = new LinkedHashMap();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void b(int i10) {
        this.f160193a.d(this.f160196d.get(Integer.valueOf(i10)));
        this.f160196d.put(Integer.valueOf(i10), null);
    }

    public final void a(@NotNull List<AutoStyleImage> imageList) {
        Intrinsics.checkNotNullParameter(imageList, "imageList");
        this.f160195c = imageList;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@NotNull ViewGroup container, int i10, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        b(i10);
        container.removeView((ConstraintLayout) object);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f160195c.size();
    }

    @Override // androidx.viewpager.widget.a
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int i10) {
        Intrinsics.checkNotNullParameter(container, "container");
        mb.j jVarD = mb.j.d(LayoutInflater.from(container.getContext()), container, false);
        String strV = this.f160195c.get(i10).v();
        if (strV != null) {
            b(i10);
            Map<Integer, com.planner5d.library.services.bitmaploader.target.a> map = this.f160196d;
            Integer numValueOf = Integer.valueOf(i10);
            ImageView image = jVarD.f322890b;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            map.put(numValueOf, com.planner5d.library.widget.bitmaptarget.a.b(image, this.f160193a));
            q.a.a(this.f160194b, strV, 0, 0, this.f160196d.get(Integer.valueOf(i10)), 0L, 16, null);
        }
        ConstraintLayout root = jVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        container.addView(root);
        return root;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return view == ((ConstraintLayout) object);
    }
}
