package com.planner5d.library.widget.bitmaptarget;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nViewBoundBitmapTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewBoundBitmapTarget.kt\ncom/planner5d/library/widget/bitmaptarget/ViewBoundBitmapTarget\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public abstract class d<T> extends com.planner5d.library.services.bitmaploader.target.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final a f249623i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f249624j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final WeakHashMap<Object, WeakReference<com.planner5d.library.services.bitmaploader.target.a>> f249625k = new WeakHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final WeakReference<T> f249626h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(T t10) {
        this.f249626h = new WeakReference<>(t10);
        WeakHashMap<Object, WeakReference<com.planner5d.library.services.bitmaploader.target.a>> weakHashMap = f249625k;
        synchronized (weakHashMap) {
            weakHashMap.put(t10, new WeakReference<>(this));
            Unit unit = Unit.f312394a;
        }
    }

    private final void l(boolean z10, Bitmap bitmap) {
        boolean zAreEqual;
        T t10 = this.f249626h.get();
        if (t10 == null) {
            return;
        }
        WeakHashMap<Object, WeakReference<com.planner5d.library.services.bitmaploader.target.a>> weakHashMap = f249625k;
        synchronized (weakHashMap) {
            try {
                WeakReference<com.planner5d.library.services.bitmaploader.target.a> weakReference = weakHashMap.get(t10);
                zAreEqual = Intrinsics.areEqual(weakReference != null ? weakReference.get() : null, this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zAreEqual) {
            m(t10, bitmap);
        } else if (z10) {
            dispose();
        }
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void b(boolean z10) {
        l(false, null);
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void h(@Nullable Bitmap bitmap) {
        l(true, bitmap);
    }

    public abstract void m(T t10, @Nullable Bitmap bitmap);
}
