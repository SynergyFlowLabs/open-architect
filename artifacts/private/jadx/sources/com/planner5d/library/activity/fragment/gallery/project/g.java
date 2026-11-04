package com.planner5d.library.activity.fragment.gallery.project;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.y0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class g extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f133844e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f133845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s0 f133846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f133847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private List<String> f133848d;

    public g(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull s0 scope, @NotNull y0 imageManager) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        this.f133845a = bitmapTargetManager;
        this.f133846b = scope;
        this.f133847c = imageManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        List<String> list = this.f133848d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        y0 y0Var = this.f133847c;
        List<String> list = this.f133848d;
        holder.i(y0Var, list != null ? list.get(i10) : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a(parent, this.f133845a, this.f133846b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull a holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.a();
    }

    @e.a({"NotifyDataSetChanged"})
    public final void k(@Nullable List<String> list) {
        this.f133848d = list;
        notifyDataSetChanged();
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nGalleryProjectShotsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryProjectShotsAdapter.kt\ncom/planner5d/library/activity/fragment/gallery/project/GalleryProjectShotsAdapter$ShotViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,67:1\n67#2,4:68\n37#2,2:72\n55#2:74\n72#2:75\n*S KotlinDebug\n*F\n+ 1 GalleryProjectShotsAdapter.kt\ncom/planner5d/library/activity/fragment/gallery/project/GalleryProjectShotsAdapter$ShotViewHolder\n*L\n33#1:68,4\n33#1:72,2\n33#1:74\n33#1:75\n*E\n"})
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f133849c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ImageView f133850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.bitmaploader.target.k f133851b;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.gallery.project.g$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 GalleryProjectShotsAdapter.kt\ncom/planner5d/library/activity/fragment/gallery/project/GalleryProjectShotsAdapter$ShotViewHolder\n*L\n1#1,52:1\n70#2:53\n34#3,8:54\n*E\n"})
        public static final class ViewOnLayoutChangeListenerC1470a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y0 f133853b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f133854c;

            public ViewOnLayoutChangeListenerC1470a(y0 y0Var, String str) {
                this.f133853b = y0Var;
                this.f133854c = str;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                view.removeOnLayoutChangeListener(this);
                a.this.f133850a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                a.this.f133851b.b(com.planner5d.library.widget.bitmaptarget.a.f(a.this.f133850a, null, 1, null)).c(new b(this.f133853b, this.f133854c, view)).i();
            }
        }

        static final class b implements com.planner5d.library.services.bitmaploader.d.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y0 f133855a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f133856b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f133857c;

            b(y0 y0Var, String str, View view) {
                this.f133855a = y0Var;
                this.f133856b = str;
                this.f133857c = view;
            }

            @Override // com.planner5d.library.services.bitmaploader.d.f
            public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                return this.f133855a.a(0, this.f133856b, this.f133857c.getWidth(), this.f133857c.getHeight(), aVar, -3L, null);
            }
        }

        private a(ImageView imageView, com.planner5d.library.services.bitmaploader.target.h hVar, s0 s0Var) {
            super(imageView);
            this.f133850a = imageView;
            this.f133851b = new com.planner5d.library.services.bitmaploader.target.k(hVar, s0Var);
        }

        public final void a() {
            this.f133851b.a();
        }

        public final void i(@NotNull y0 imageManager, @Nullable String str) {
            Intrinsics.checkNotNullParameter(imageManager, "imageManager");
            ImageView imageView = this.f133850a;
            if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
                imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1470a(imageManager, str));
            } else {
                this.f133850a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.f133851b.b(com.planner5d.library.widget.bitmaptarget.a.f(this.f133850a, null, 1, null)).c(new b(imageManager, str, imageView)).i();
            }
        }

        public a(@NotNull ViewGroup parent, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull s0 scope) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(scope, "scope");
            ImageView imageView = new ImageView(parent.getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(parent.getWidth(), -1));
            this(imageView, bitmapTargetManager, scope);
        }
    }
}
