package com.planner5d.library.widget.bitmaptarget;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.c0;
import com.planner5d.library.services.utility.o3;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.widget.drawable.h;
import com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nImageViewBitmapTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewBitmapTarget.kt\ncom/planner5d/library/widget/bitmaptarget/ImageViewBitmapTarget\n+ 2 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils\n*L\n1#1,49:1\n171#2,8:50\n171#2,8:58\n*S KotlinDebug\n*F\n+ 1 ImageViewBitmapTarget.kt\ncom/planner5d/library/widget/bitmaptarget/ImageViewBitmapTarget\n*L\n19#1:50,8\n30#1:58,8\n*E\n"})
public class c extends d<ImageView> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f249614m = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final h.b f249615l;

    @f(c = "com.planner5d.library.widget.bitmaptarget.ImageViewBitmapTarget$setLoadingCompletedToView$$inlined$executeOnMainThread$1", f = "ImageViewBitmapTarget.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$executeOnMainThread$1\n+ 2 ImageViewBitmapTarget.kt\ncom/planner5d/library/widget/bitmaptarget/ImageViewBitmapTarget\n*L\n1#1,176:1\n31#2,16:177\n*E\n"})
    public static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f249616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f249617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f249618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f249619d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, ImageView imageView, Bitmap bitmap, c cVar) {
            super(2, dVar);
            this.f249617b = imageView;
            this.f249618c = bitmap;
            this.f249619d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(dVar, this.f249617b, this.f249618c, this.f249619d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f249616a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Object drawable = this.f249617b.getDrawable();
            if (drawable instanceof ShimmerDrawable) {
                ShimmerDrawable shimmerDrawable = (ShimmerDrawable) drawable;
                shimmerDrawable.detachAsImage(this.f249617b);
                if (!shimmerDrawable.hasAttachedTargets()) {
                    shimmerDrawable.stop();
                }
            } else if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            Bitmap bitmap = this.f249618c;
            if (bitmap != null) {
                this.f249617b.setImageBitmap(bitmap);
            } else {
                this.f249617b.setImageResource(h.c(this.f249619d.f249615l));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @f(c = "com.planner5d.library.widget.bitmaptarget.ImageViewBitmapTarget$special$$inlined$executeOnMainThread$1", f = "ImageViewBitmapTarget.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCoroutineUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineUtils.kt\ncom/planner5d/library/services/utility/CoroutineUtils$executeOnMainThread$1\n+ 2 ImageViewBitmapTarget.kt\ncom/planner5d/library/widget/bitmaptarget/ImageViewBitmapTarget\n*L\n1#1,176:1\n20#2,7:177\n*E\n"})
    public static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f249620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f249621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f249622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, Drawable drawable, ImageView imageView) {
            super(2, dVar);
            this.f249621b = drawable;
            this.f249622c = imageView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(dVar, this.f249621b, this.f249622c);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f249620a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Drawable drawable = this.f249621b;
            if (drawable instanceof ShimmerDrawable) {
                ((ShimmerDrawable) drawable).attachAsImage(this.f249622c);
            } else {
                this.f249622c.setImageDrawable(drawable);
            }
            Object obj2 = this.f249621b;
            Animatable animatable = obj2 instanceof Animatable ? (Animatable) obj2 : null;
            if (animatable != null) {
                animatable.start();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public c(@NotNull ImageView imageView) {
        this(imageView, null, null, 6, null);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // com.planner5d.library.widget.bitmaptarget.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull ImageView view, @Nullable Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(view, "view");
        c0 c0Var = c0.f225068a;
        if (!o3.b()) {
            k.f(f2.f314023a, s.f229729a.a(), null, new a(null, view, bitmap, this), 2, null);
            return;
        }
        Object drawable = view.getDrawable();
        if (drawable instanceof ShimmerDrawable) {
            ShimmerDrawable shimmerDrawable = (ShimmerDrawable) drawable;
            shimmerDrawable.detachAsImage(view);
            if (!shimmerDrawable.hasAttachedTargets()) {
                shimmerDrawable.stop();
            }
        } else if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        if (bitmap != null) {
            view.setImageBitmap(bitmap);
        } else {
            view.setImageResource(h.c(this.f249615l));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public c(@NotNull ImageView imageView, @Nullable h.b bVar) {
        this(imageView, bVar, null, 4, null);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        int i10 = 6 & 0;
    }

    public /* synthetic */ c(ImageView imageView, h.b bVar, h.b bVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageView, (i10 & 2) != 0 ? h.b.Average : bVar, (i10 & 4) != 0 ? h.b.Average : bVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @j
    public c(@NotNull ImageView imageView, @Nullable h.b bVar, @Nullable h.b bVar2) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.f249615l = bVar2;
        if (bVar != null) {
            Drawable drawableA = h.b("ImageViewBitmapTarget", bVar, null).a(imageView.getContext());
            c0 c0Var = c0.f225068a;
            if (o3.b()) {
                if (drawableA instanceof ShimmerDrawable) {
                    ((ShimmerDrawable) drawableA).attachAsImage(imageView);
                } else {
                    imageView.setImageDrawable(drawableA);
                }
                Animatable animatable = drawableA instanceof Animatable ? (Animatable) drawableA : null;
                if (animatable != null) {
                    animatable.start();
                    return;
                }
                return;
            }
            k.f(f2.f314023a, s.f229729a.a(), null, new b(null, drawableA, imageView), 2, null);
        }
    }
}
