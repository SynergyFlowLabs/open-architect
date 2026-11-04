package coil.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PostProcessor;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.w0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-GifUtils\n+ 2 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,72:1\n57#2:73\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-GifUtils\n*L\n66#1:73\n*E\n"})
@oj.i(name = "-GifUtils")
public final class g {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f87825b;

        static {
            int[] iArr = new int[q4.c.values().length];
            try {
                iArr[q4.c.UNCHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q4.c.TRANSLUCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q4.c.OPAQUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87824a = iArr;
            int[] iArr2 = new int[coil.size.h.values().length];
            try {
                iArr2[coil.size.h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[coil.size.h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f87825b = iArr2;
        }
    }

    public static final class b extends Animatable2.AnimationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f87826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f87827b;

        b(Function0<Unit> function0, Function0<Unit> function1) {
            this.f87826a = function0;
            this.f87827b = function1;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            Function0<Unit> function0 = this.f87827b;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            Function0<Unit> function0 = this.f87826a;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final class c extends androidx.vectordrawable.graphics.drawable.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f87828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f87829c;

        c(Function0<Unit> function0, Function0<Unit> function1) {
            this.f87828b = function0;
            this.f87829c = function1;
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            Function0<Unit> function0 = this.f87829c;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void c(Drawable drawable) {
            Function0<Unit> function0 = this.f87828b;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @w0(23)
    @NotNull
    public static final Animatable2.AnimationCallback b(@Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1) {
        return new b(function0, function1);
    }

    @NotNull
    public static final androidx.vectordrawable.graphics.drawable.b.a c(@Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1) {
        return new c(function0, function1);
    }

    @w0(28)
    @NotNull
    public static final PostProcessor d(@NotNull final q4.a aVar) {
        return new PostProcessor() { // from class: coil.util.f
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                return g.e(aVar, canvas);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(q4.a aVar, Canvas canvas) {
        return g(aVar.transform(canvas));
    }

    public static final <T> void f(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function1.invoke(list.get(i10));
        }
    }

    public static final int g(@NotNull q4.c cVar) {
        int i10 = a.f87824a[cVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return -3;
        }
        if (i10 == 3) {
            return -1;
        }
        throw new k0();
    }

    public static final int h(@NotNull coil.size.i iVar, @NotNull coil.size.h hVar, @NotNull Function0<Integer> function0) {
        return coil.size.b.f(iVar) ? function0.invoke().intValue() : j(iVar.e(), hVar);
    }

    public static final boolean i(@NotNull Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static final int j(@NotNull coil.size.c cVar, @NotNull coil.size.h hVar) {
        if (cVar instanceof coil.size.c.a) {
            return ((coil.size.c.a) cVar).f87767a;
        }
        int i10 = a.f87825b[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new k0();
    }

    public static final int k(@NotNull coil.size.i iVar, @NotNull coil.size.h hVar, @NotNull Function0<Integer> function0) {
        return coil.size.b.f(iVar) ? function0.invoke().intValue() : j(iVar.f(), hVar);
    }
}
