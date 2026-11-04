package androidx.navigation.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.f1;
import androidx.navigation.w0;
import androidx.navigation.y1;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAbstractAppBarOnDestinationChangedListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAppBarOnDestinationChangedListener.kt\nandroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public abstract class a implements w0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f71313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f71314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final WeakReference<androidx.customview.widget.c> f71315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.appcompat.graphics.drawable.d f71316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private ValueAnimator f71317e;

    public a(@NotNull Context context, @NotNull d configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f71313a = context;
        this.f71314b = configuration;
        androidx.customview.widget.c cVarC = configuration.c();
        this.f71315c = cVarC != null ? new WeakReference<>(cVarC) : null;
    }

    @e.a({"ObjectAnimatorBinding"})
    private final void b(boolean z10) {
        Pair pair;
        androidx.appcompat.graphics.drawable.d dVar = this.f71316d;
        if (dVar == null || (pair = TuplesKt.to(dVar, Boolean.TRUE)) == null) {
            androidx.appcompat.graphics.drawable.d dVar2 = new androidx.appcompat.graphics.drawable.d(this.f71313a);
            this.f71316d = dVar2;
            pair = TuplesKt.to(dVar2, Boolean.FALSE);
        }
        androidx.appcompat.graphics.drawable.d dVar3 = (androidx.appcompat.graphics.drawable.d) pair.component1();
        boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
        c(dVar3, z10 ? t.d.f71365c : t.d.f71364b);
        float f10 = z10 ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            dVar3.setProgress(f10);
            return;
        }
        float fI = dVar3.i();
        ValueAnimator valueAnimator = this.f71317e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dVar3, "progress", fI, f10);
        this.f71317e = objectAnimatorOfFloat;
        Intrinsics.checkNotNull(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    @Override // androidx.navigation.w0.c
    public void a(@NotNull w0 controller, @NotNull y1 destination, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof androidx.navigation.u) {
            return;
        }
        WeakReference<androidx.customview.widget.c> weakReference = this.f71315c;
        androidx.customview.widget.c cVar = weakReference != null ? weakReference.get() : null;
        if (this.f71315c != null && cVar == null) {
            controller.R0(this);
            return;
        }
        String strS = destination.s(this.f71313a, bundle);
        if (strS != null) {
            d(strS);
        }
        boolean zE = this.f71314b.e(destination);
        boolean z10 = false;
        if (cVar == null && zE) {
            c(null, 0);
            return;
        }
        if (cVar != null && zE) {
            z10 = true;
        }
        b(z10);
    }

    protected abstract void c(@Nullable Drawable drawable, @f1 int i10);

    protected abstract void d(@Nullable CharSequence charSequence);
}
