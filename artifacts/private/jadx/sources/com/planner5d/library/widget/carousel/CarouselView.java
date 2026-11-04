package com.planner5d.library.widget.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import com.planner5d.library.application.e6;
import com.planner5d.library.model.m;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.j;
import com.planner5d.library.widget.slider.DashedProgressSlideIndicator;
import com.planner5d.library.widget.slider.SlowLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import te.k;
import te.u;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCarouselView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselView.kt\ncom/planner5d/library/widget/carousel/CarouselView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,240:1\n1#2:241\n257#3,2:242\n*S KotlinDebug\n*F\n+ 1 CarouselView.kt\ncom/planner5d/library/widget/carousel/CarouselView\n*L\n152#1:242,2\n*E\n"})
public final class CarouselView extends ConstraintLayout implements j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f254163k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public com.planner5d.library.services.bitmaploader.d f254164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public f1 f254165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Function1<? super Integer, Unit> f254166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f254167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k f254168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final h f254169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private a f254170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f254171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f254172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f254173j;

    @w0(parameters = 0)
    public static final class a extends RecyclerView.h<b> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f254174g = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f254175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final h f254176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.bitmaploader.d f254177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final f1 f254178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f254179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final ArrayList<m> f254180f;

        public a(int i10, @NotNull h bitmapTargetManager, @NotNull com.planner5d.library.services.bitmaploader.d bitmapLoader, @NotNull f1 coroutineScope, @NotNull Function0<Unit> clickListener) {
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(bitmapLoader, "bitmapLoader");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            this.f254175a = i10;
            this.f254176b = bitmapTargetManager;
            this.f254177c = bitmapLoader;
            this.f254178d = coroutineScope;
            this.f254179e = clickListener;
            this.f254180f = new ArrayList<>();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f254180f.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull b holder, int i10) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            m mVar = this.f254180f.get(i10);
            Intrinsics.checkNotNullExpressionValue(mVar, "get(...)");
            holder.k(mVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f254175a, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new b(viewInflate, this.f254176b, this.f254177c, this.f254178d, this.f254179e);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(@NotNull b holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.a();
        }

        @e.a({"NotifyDataSetChanged"})
        public final void k(@NotNull List<? extends m> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f254180f.clear();
            this.f254180f.addAll(list);
            notifyDataSetChanged();
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nCarouselView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselView.kt\ncom/planner5d/library/widget/carousel/CarouselView$CarouselViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,240:1\n67#2,4:241\n37#2,2:245\n55#2:247\n72#2:248\n*S KotlinDebug\n*F\n+ 1 CarouselView.kt\ncom/planner5d/library/widget/carousel/CarouselView$CarouselViewHolder\n*L\n224#1:241,4\n224#1:245,2\n224#1:247\n224#1:248\n*E\n"})
    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f254181e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.bitmaploader.d f254182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f254183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final ImageView f254184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.services.bitmaploader.target.k f254185d;

        @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 CarouselView.kt\ncom/planner5d/library/widget/carousel/CarouselView$CarouselViewHolder\n*L\n1#1,52:1\n70#2:53\n225#3,10:54\n*E\n"})
        public static final class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f254187b;

            public a(m mVar) {
                this.f254187b = mVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                view.removeOnLayoutChangeListener(this);
                b.this.f254185d.b(com.planner5d.library.widget.bitmaptarget.a.g(b.this.f254184c, com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null)).c(b.this.new C1720b(this.f254187b, view)).i();
                view.setOnClickListener(b.this.new c());
            }
        }

        /* JADX INFO: renamed from: com.planner5d.library.widget.carousel.CarouselView$b$b, reason: collision with other inner class name */
        static final class C1720b implements com.planner5d.library.services.bitmaploader.d.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f254189b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f254190c;

            C1720b(m mVar, View view) {
                this.f254189b = mVar;
                this.f254190c = view;
            }

            @Override // com.planner5d.library.services.bitmaploader.d.f
            public final com.planner5d.library.services.bitmaploader.d.C1663d a(com.planner5d.library.services.bitmaploader.target.a aVar) {
                return b.this.f254182a.q(0, this.f254189b.E0(), this.f254190c.getWidth(), this.f254190c.getHeight(), aVar, -3L, null);
            }
        }

        static final class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.this.f254183b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull View view, @NotNull h bitmapTargetManager, @NotNull com.planner5d.library.services.bitmaploader.d bitmapLoader, @NotNull f1 coroutineScope, @NotNull Function0<Unit> clickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
            Intrinsics.checkNotNullParameter(bitmapLoader, "bitmapLoader");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            this.f254182a = bitmapLoader;
            this.f254183b = clickListener;
            ImageView image = u.a(view).f381003b;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            this.f254184c = image;
            this.f254185d = new com.planner5d.library.services.bitmaploader.target.k(bitmapTargetManager, coroutineScope);
        }

        public final void a() {
            this.f254185d.a();
        }

        public final void k(@NotNull m item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ImageView imageView = this.f254184c;
            if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
                imageView.addOnLayoutChangeListener(new a(item));
                return;
            }
            int i10 = 5 | 0;
            this.f254185d.b(com.planner5d.library.widget.bitmaptarget.a.g(this.f254184c, com.planner5d.library.widget.drawable.h.b.Shimmer, null, 2, null)).c(new C1720b(item, imageView)).i();
            imageView.setOnClickListener(new c());
        }
    }

    @SourceDebugExtension({"SMAP\nCarouselView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselView.kt\ncom/planner5d/library/widget/carousel/CarouselView$createScrollListener$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,240:1\n257#2,2:241\n*S KotlinDebug\n*F\n+ 1 CarouselView.kt\ncom/planner5d/library/widget/carousel/CarouselView$createScrollListener$1\n*L\n135#1:241,2\n*E\n"})
    public static final class c extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f254192a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f254194c;

        c(a0 a0Var) {
            this.f254194c = a0Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            k kVar = CarouselView.this.f254168e;
            a0 a0Var = this.f254194c;
            CarouselView carouselView = CarouselView.this;
            if (i10 == 1) {
                this.f254192a = true;
                kVar.f380948d.c();
            }
            if (i10 == 0) {
                View recyclerViewBlocker = kVar.f380947c;
                Intrinsics.checkNotNullExpressionValue(recyclerViewBlocker, "recyclerViewBlocker");
                recyclerViewBlocker.setVisibility(8);
                if (this.f254192a) {
                    this.f254192a = false;
                    View viewH = a0Var.h(recyclerView.getLayoutManager());
                    if (viewH != null) {
                        carouselView.f254171h = recyclerView.s0(viewH);
                        Function1 function1 = carouselView.f254166c;
                        if (function1 != null) {
                            function1.invoke(Integer.valueOf(carouselView.f254171h));
                        }
                        CarouselView.J(carouselView, false, 1, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final c D(a0 a0Var) {
        return new c(a0Var);
    }

    private final void G() {
        int nextSlide = getNextSlide();
        this.f254171h = nextSlide;
        this.f254168e.f380946b.V1(nextSlide);
        Function1<? super Integer, Unit> function1 = this.f254166c;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f254171h));
        }
        J(this, false, 1, null);
    }

    private final void I(boolean z10) {
        final int slideCount = getSlideCount();
        DashedProgressSlideIndicator dashedProgressSlideIndicator = this.f254168e.f380948d;
        Intrinsics.checkNotNull(dashedProgressSlideIndicator);
        dashedProgressSlideIndicator.setVisibility(slideCount > 0 ? 0 : 8);
        if (slideCount > 0) {
            int i10 = this.f254171h;
            if (i10 == 0 || z10) {
                this.f254168e.f380948d.g(i10, slideCount, this.f254172i, new Function1() { // from class: com.planner5d.library.widget.carousel.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CarouselView.K(this.f254207a, slideCount, ((Integer) obj).intValue());
                    }
                });
            }
        }
    }

    static /* synthetic */ void J(CarouselView carouselView, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        carouselView.I(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(CarouselView carouselView, int i10, int i11) {
        carouselView.G();
        carouselView.I(i11 == i10);
        return Unit.f312394a;
    }

    private final int getNextSlide() {
        return (this.f254171h + 1) % getSlideCount();
    }

    private final int getSlideCount() {
        RecyclerView.h adapter = this.f254168e.f380946b.getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(CarouselView carouselView) {
        carouselView.next();
        return Unit.f312394a;
    }

    public final void E() {
        this.f254168e.f380948d.d();
    }

    public final void F() {
        J(this, false, 1, null);
    }

    public final void H(@NotNull List<? extends m> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f254170g.k(list);
        J(this, false, 1, null);
    }

    @NotNull
    public final com.planner5d.library.services.bitmaploader.d getBitmapLoader$P5D_Library_Widgets_release() {
        com.planner5d.library.services.bitmaploader.d dVar = this.f254164a;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bitmapLoader");
        return null;
    }

    @NotNull
    public final f1 getCoroutineScope$P5D_Library_Widgets_release() {
        f1 f1Var = this.f254165b;
        if (f1Var != null) {
            return f1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    @Override // com.planner5d.library.widget.j
    public boolean hasNext() {
        return this.f254171h < getSlideCount() - 1;
    }

    @Override // com.planner5d.library.widget.j
    public void next() {
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        E();
        this.f254173j = true;
        this.f254169f.a();
    }

    @Override // com.planner5d.library.widget.j
    public void setAdapter(@Nullable RecyclerView.h<?> hVar) {
        this.f254168e.f380946b.setAdapter(hVar);
        J(this, false, 1, null);
        Function1<? super Integer, Unit> function1 = this.f254166c;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f254171h));
        }
    }

    public final void setBitmapLoader$P5D_Library_Widgets_release(@NotNull com.planner5d.library.services.bitmaploader.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f254164a = dVar;
    }

    public final void setCoroutineScope$P5D_Library_Widgets_release(@NotNull f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<set-?>");
        this.f254165b = f1Var;
    }

    @Override // com.planner5d.library.widget.j
    public void setOnSlideChange(@NotNull Function1<? super Integer, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f254166c = function;
        function.invoke(Integer.valueOf(this.f254171h));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, @Nullable Boolean bool, @Nullable Integer num) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        k kVarD = k.d(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(kVarD, "inflate(...)");
        this.f254168e = kVarD;
        h hVar = new h();
        this.f254169f = hVar;
        this.f254172i = 5000;
        e6.a(this).l(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.f253829m6);
        this.f254167d = typedArrayObtainStyledAttributes.getResourceId(c1.s.f253901p6, c1.l.f252178l2);
        boolean zBooleanValue = typedArrayObtainStyledAttributes.getBoolean(c1.s.f253853n6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.f253877o6, -100);
        typedArrayObtainStyledAttributes.recycle();
        zBooleanValue = bool != null ? bool.booleanValue() : zBooleanValue;
        dimensionPixelSize = num != null ? num.intValue() : dimensionPixelSize;
        RecyclerView recyclerView = kVarD.f380946b;
        recyclerView.setLayoutManager(new SlowLinearLayoutManager(context, 0, false));
        recyclerView.D();
        recyclerView.setOnFlingListener(null);
        a0 a0Var = new a0();
        a0Var.b(recyclerView);
        Unit unit = Unit.f312394a;
        recyclerView.r(D(a0Var));
        a aVar = new a(this.f254167d, hVar, getBitmapLoader$P5D_Library_Widgets_release(), getCoroutineScope$P5D_Library_Widgets_release(), new Function0() { // from class: com.planner5d.library.widget.carousel.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CarouselView.y(this.f254206a);
            }
        });
        this.f254170g = aVar;
        recyclerView.setAdapter(aVar);
        DashedProgressSlideIndicator dashedProgressSlideIndicator = kVarD.f380948d;
        dashedProgressSlideIndicator.setAnimated(zBooleanValue);
        if (dimensionPixelSize != -100) {
            ViewGroup.LayoutParams layoutParams = dashedProgressSlideIndicator.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize;
        }
    }
}
