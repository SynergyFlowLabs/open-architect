package com.planner5d.library.widget.editor.facade;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f256107c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f256108d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f256109e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f256110f = 2.5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f256111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f256112b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a();
    }

    private final void c() {
        b().a();
        this.f256111a = false;
    }

    public final int a(float f10) {
        int iL0 = kotlin.math.b.L0(f10 / 15.0f) * 15;
        int i10 = (int) f10;
        if (Math.abs(i10 - iL0) > 2.5f) {
            this.f256111a = true;
            return i10;
        }
        if (this.f256111a) {
            c();
        }
        return iL0;
    }

    @NotNull
    public final b b() {
        b bVar = this.f256112b;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException(com.google.android.gms.common.internal.z.a.f106673a);
        return null;
    }

    public final void d(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f256112b = bVar;
    }
}
