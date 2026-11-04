package com.planner5d.library.widget.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.s;
import androidx.lifecycle.f0;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import te.j;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nViewPagerCarouselView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewPagerCarouselView.kt\ncom/planner5d/library/widget/carousel/ViewPagerCarouselView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1#2:61\n1863#3,2:62\n*S KotlinDebug\n*F\n+ 1 ViewPagerCarouselView.kt\ncom/planner5d/library/widget/carousel/ViewPagerCarouselView\n*L\n28#1:62,2\n*E\n"})
public final class ViewPagerCarouselView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f254195b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f254196a;

    @f(c = "com.planner5d.library.widget.carousel.ViewPagerCarouselView$autoScroll$1", f = "ViewPagerCarouselView.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f254197a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f254199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f254199c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ViewPagerCarouselView.this.new a(this.f254199c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f254197a;
            if (i10 == 0) {
                ResultKt.m(obj);
                ViewPagerCarouselView viewPagerCarouselView = ViewPagerCarouselView.this;
                long j10 = this.f254199c;
                this.f254197a = 1;
                if (viewPagerCarouselView.B(j10, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b extends ViewPager2.j {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i10) {
            ViewPagerCarouselView.this.f254196a.f380942d.R(ViewPagerCarouselView.this.f254196a.f380942d.D(i10));
        }
    }

    @f(c = "com.planner5d.library.widget.carousel.ViewPagerCarouselView", f = "ViewPagerCarouselView.kt", i = {0, 0}, l = {49, com.planner5d.library.engine.input.f.b.f160710n}, m = "scrollIndefinitely", n = {"this", "interval"}, s = {"L$0", "J$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f254201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f254202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f254203c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f254205e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f254203c = obj;
            this.f254205e |= Integer.MIN_VALUE;
            return ViewPagerCarouselView.this.B(0L, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ViewPagerCarouselView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void A(s sVar, int[] iArr) {
        this.f254196a.f380940b.o(new b());
        this.f254196a.f380940b.setAdapter(new d(iArr, sVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (r7.B(r8, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(long r8, kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.planner5d.library.widget.carousel.ViewPagerCarouselView.c
            if (r0 == 0) goto L15
            r0 = r10
            r6 = 0
            com.planner5d.library.widget.carousel.ViewPagerCarouselView$c r0 = (com.planner5d.library.widget.carousel.ViewPagerCarouselView.c) r0
            int r1 = r0.f254205e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f254205e = r1
            goto L1b
        L15:
            com.planner5d.library.widget.carousel.ViewPagerCarouselView$c r0 = new com.planner5d.library.widget.carousel.ViewPagerCarouselView$c
            r6 = 4
            r0.<init>(r10)
        L1b:
            java.lang.Object r10 = r0.f254203c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 2
            int r2 = r0.f254205e
            r6 = 7
            r3 = 2
            r6 = 5
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            kotlin.ResultKt.m(r10)
            goto La4
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            long r8 = r0.f254202b
            r6 = 7
            java.lang.Object r7 = r0.f254201a
            com.planner5d.library.widget.carousel.ViewPagerCarouselView r7 = (com.planner5d.library.widget.carousel.ViewPagerCarouselView) r7
            kotlin.ResultKt.m(r10)
            goto L59
        L45:
            r6 = 3
            kotlin.ResultKt.m(r10)
            r6 = 5
            r0.f254201a = r7
            r6 = 6
            r0.f254202b = r8
            r6 = 0
            r0.f254205e = r4
            java.lang.Object r10 = kotlinx.coroutines.d1.b(r8, r0)
            if (r10 != r1) goto L59
            goto La2
        L59:
            te.j r10 = r7.f254196a
            androidx.viewpager2.widget.ViewPager2 r10 = r10.f380940b
            androidx.recyclerview.widget.RecyclerView$h r10 = r10.getAdapter()
            r2 = 0
            if (r10 == 0) goto L6b
            r6 = 0
            int r10 = r10.getItemCount()
            r6 = 7
            goto L6e
        L6b:
            r6 = 5
            r10 = r2
            r10 = r2
        L6e:
            if (r10 <= 0) goto L72
            int r10 = r10 - r4
            goto L74
        L72:
            r6 = 7
            r10 = r2
        L74:
            te.j r5 = r7.f254196a
            androidx.viewpager2.widget.ViewPager2 r5 = r5.f380940b
            r6 = 1
            int r5 = r5.getCurrentItem()
            r6 = 7
            if (r5 != r10) goto L81
            goto L8f
        L81:
            r6 = 5
            te.j r10 = r7.f254196a
            r6 = 0
            androidx.viewpager2.widget.ViewPager2 r10 = r10.f380940b
            r6 = 5
            int r10 = r10.getCurrentItem()
            r6 = 4
            int r2 = r10 + 1
        L8f:
            r6 = 1
            te.j r10 = r7.f254196a
            androidx.viewpager2.widget.ViewPager2 r10 = r10.f380940b
            r10.t(r2, r4)
            r10 = 0
            r0.f254201a = r10
            r0.f254205e = r3
            java.lang.Object r7 = r7.B(r8, r0)
            if (r7 != r1) goto La4
        La2:
            r6 = 6
            return r1
        La4:
            kotlin.Unit r7 = kotlin.Unit.f312394a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.widget.carousel.ViewPagerCarouselView.B(long, kotlin.coroutines.d):java.lang.Object");
    }

    private final void z(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f254196a.f380942d.i(this.f254196a.f380942d.I());
        }
        ArrayList<View> touchables = this.f254196a.f380942d.getTouchables();
        Intrinsics.checkNotNullExpressionValue(touchables, "getTouchables(...)");
        Iterator<T> it = touchables.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(false);
        }
    }

    public final void C(@NotNull s fragmentActivity, @NotNull int[] imageResourceIds) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(imageResourceIds, "imageResourceIds");
        z(imageResourceIds);
        A(fragmentActivity, imageResourceIds);
    }

    public final void y(@NotNull f0 lifecycleScope, long j10) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        lifecycleScope.i(new a(j10, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ViewPagerCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ViewPagerCarouselView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ViewPagerCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        j jVarB = j.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(jVarB, "inflate(...)");
        this.f254196a = jVarB;
    }
}
