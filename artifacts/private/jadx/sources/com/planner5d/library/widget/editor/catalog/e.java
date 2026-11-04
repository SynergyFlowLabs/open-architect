package com.planner5d.library.widget.editor.catalog;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.databinding.b3;
import com.planner5d.library.model.item.catalog.CatalogCategory;
import com.planner5d.library.services.utility.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCatalogCategoryViewNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatalogCategoryViewNew.kt\ncom/planner5d/library/widget/editor/catalog/CatalogCategoryViewNew\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,77:1\n257#2,2:78\n257#2,2:80\n257#2,2:82\n*S KotlinDebug\n*F\n+ 1 CatalogCategoryViewNew.kt\ncom/planner5d/library/widget/editor/catalog/CatalogCategoryViewNew\n*L\n39#1:78,2\n40#1:80,2\n75#1:82,2\n*E\n"})
public final class e extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f254599d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b3 f254600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f254601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Drawable f254602c;

    public static final class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f254604i;

        a(int i10) {
            this.f254604i = i10;
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            if (e.this.f254601b == this.f254604i) {
                e eVar = e.this;
                com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
                Resources resources = eVar.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                int i10 = 1 << 0;
                eVar.setIcon(com.planner5d.library.widget.drawable.c.g(cVar, resources, bitmap, 0, 0, 12, null));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public e(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIcon(Drawable drawable) {
        this.f254600a.f158748c.setImageDrawable(drawable);
    }

    private final void z(CatalogCategory catalogCategory, boolean z10, boolean z11) {
        String str;
        TextView textView = this.f254600a.f158749d;
        textView.setTextSize(0, textView.getResources().getDimension(z11 ? com.planner5d.library.f.g.R3 : com.planner5d.library.f.g.P3));
        textView.setTypeface(androidx.core.content.res.i.j(textView.getContext(), z11 ? com.planner5d.library.f.i.f167925d : com.planner5d.library.f.i.f167926e));
        k3 title = catalogCategory.getTitle();
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence charSequenceI = title.i(context);
        if (z10) {
            if (catalogCategory.getPath().length() == 0) {
                str = "";
            } else {
                str = "<br /><small>" + catalogCategory.getPath() + "</small>";
            }
            charSequenceI = com.planner5d.library.services.textspan.b.d(((Object) charSequenceI) + str);
        }
        textView.setText(charSequenceI);
        View catalogCategoryUnderline = this.f254600a.f158750e;
        Intrinsics.checkNotNullExpressionValue(catalogCategoryUnderline, "catalogCategoryUnderline");
        catalogCategoryUnderline.setVisibility(z11 ? 8 : 0);
    }

    @Nullable
    public final com.planner5d.library.services.bitmaploader.target.a y(@NotNull CatalogCategory item, @NotNull Function2<? super Integer, ? super com.planner5d.library.services.bitmaploader.target.a, Unit> iconProvider, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(iconProvider, "iconProvider");
        int icon = item.getIcon();
        this.f254601b = item.getIcon();
        boolean z12 = (z11 || z10) ? false : true;
        z(item, z11, z12);
        ImageView catalogCategoryArrow = this.f254600a.f158747b;
        Intrinsics.checkNotNullExpressionValue(catalogCategoryArrow, "catalogCategoryArrow");
        catalogCategoryArrow.setVisibility(!z12 ? 0 : 8);
        ImageView catalogCategoryIcon = this.f254600a.f158748c;
        Intrinsics.checkNotNullExpressionValue(catalogCategoryIcon, "catalogCategoryIcon");
        catalogCategoryIcon.setVisibility(z10 ? 0 : 8);
        if (!z10) {
            return null;
        }
        a aVar = new a(icon);
        setIcon(this.f254602c);
        iconProvider.invoke(Integer.valueOf(icon), aVar);
        return aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public e(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public e(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        b3 b3VarB = b3.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b3VarB, "inflate(...)");
        setForeground(androidx.core.content.d.l(context, com.planner5d.library.f.h.Yg));
        this.f254600a = b3VarB;
        Drawable drawableA = com.planner5d.library.widget.drawable.h.a(getContext(), com.planner5d.library.widget.drawable.h.b.Small);
        Intrinsics.checkNotNullExpressionValue(drawableA, "create(...)");
        this.f254602c = drawableA;
    }
}
