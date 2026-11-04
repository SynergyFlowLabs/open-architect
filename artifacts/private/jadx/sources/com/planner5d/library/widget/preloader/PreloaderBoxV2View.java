package com.planner5d.library.widget.preloader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.application.e6;
import com.planner5d.library.services.utility.o3;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPreloaderBoxV2View.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderBoxV2View.kt\ncom/planner5d/library/widget/preloader/PreloaderBoxV2View\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,66:1\n1#2:67\n257#3,2:68\n257#3,2:70\n257#3,2:72\n255#3:74\n257#3,2:75\n*S KotlinDebug\n*F\n+ 1 PreloaderBoxV2View.kt\ncom/planner5d/library/widget/preloader/PreloaderBoxV2View\n*L\n56#1:68,2\n57#1:70,2\n58#1:72,2\n60#1:74\n61#1:75,2\n*E\n"})
public final class PreloaderBoxV2View extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258465d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public fg.e<p0> f258466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private a f258467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final te.e0 f258468c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f258469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f258470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f258471c;

        public a() {
            this(false, false, null, 7, null);
        }

        public static /* synthetic */ a e(a aVar, boolean z10, boolean z11, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f258469a;
            }
            if ((i10 & 2) != 0) {
                z11 = aVar.f258470b;
            }
            if ((i10 & 4) != 0) {
                str = aVar.f258471c;
            }
            return aVar.d(z10, z11, str);
        }

        public final boolean a() {
            return this.f258469a;
        }

        public final boolean b() {
            return this.f258470b;
        }

        @Nullable
        public final String c() {
            return this.f258471c;
        }

        @NotNull
        public final a d(boolean z10, boolean z11, @Nullable String str) {
            return new a(z10, z11, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f258469a == aVar.f258469a && this.f258470b == aVar.f258470b && Intrinsics.areEqual(this.f258471c, aVar.f258471c);
        }

        @Nullable
        public final String f() {
            return this.f258471c;
        }

        public final boolean g() {
            return this.f258470b;
        }

        public final boolean h() {
            return this.f258469a;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.f258469a) * 31) + Boolean.hashCode(this.f258470b)) * 31;
            String str = this.f258471c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "State(visible=" + this.f258469a + ", progressBar=" + this.f258470b + ", label=" + this.f258471c + ")";
        }

        public a(boolean z10, boolean z11, @Nullable String str) {
            this.f258469a = z10;
            this.f258470b = z11;
            this.f258471c = str;
        }

        public /* synthetic */ a(boolean z10, boolean z11, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderBoxV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void c() {
        if (!o3.b()) {
            post(new Runnable() { // from class: com.planner5d.library.widget.preloader.l
                @Override // java.lang.Runnable
                public final void run() {
                    PreloaderBoxV2View.d(this.f258557a);
                }
            });
            return;
        }
        a aVar = this.f258467b;
        if (aVar.h()) {
            TextView preloaderText = this.f258468c.f380901d;
            Intrinsics.checkNotNullExpressionValue(preloaderText, "preloaderText");
            String strF = aVar.f();
            if (strF != null) {
                this.f258468c.f380901d.setText(strF);
            } else {
                strF = null;
            }
            preloaderText.setVisibility(strF != null ? 0 : 8);
            PreloaderBarView preloaderCircle = this.f258468c.f380899b;
            Intrinsics.checkNotNullExpressionValue(preloaderCircle, "preloaderCircle");
            preloaderCircle.setVisibility(aVar.g() ? 0 : 8);
            View preloaderCircleBackground = this.f258468c.f380900c;
            Intrinsics.checkNotNullExpressionValue(preloaderCircleBackground, "preloaderCircleBackground");
            preloaderCircleBackground.setVisibility(aVar.g() ? 0 : 8);
        }
        if ((getVisibility() == 0) != aVar.h()) {
            setVisibility(aVar.h() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(PreloaderBoxV2View preloaderBoxV2View) {
        preloaderBoxV2View.c();
    }

    public final void b() {
        this.f258467b = new a(false, false, null, 7, null);
        c();
    }

    public final void e(@Nullable String str, @Nullable Integer num, boolean z10, boolean z11) {
        p0 p0Var = getFormatter$P5D_Library_Widgets_release().get();
        if (num == null || !z10) {
            num = null;
        }
        this.f258467b = new a(true, z11, PreloaderBoxView.b(p0Var, str, num));
        c();
    }

    @NotNull
    public final fg.e<p0> getFormatter$P5D_Library_Widgets_release() {
        fg.e<p0> eVar = this.f258466a;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formatter");
        return null;
    }

    public final void setFormatter$P5D_Library_Widgets_release(@NotNull fg.e<p0> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f258466a = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderBoxV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 3 >> 0;
    }

    public /* synthetic */ PreloaderBoxV2View(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderBoxV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258467b = new a(false, false, null, 7, null);
        e6.a(this).j(this);
        this.f258468c = te.e0.a(View.inflate(context, c1.l.f252222w2, this));
        setClickable(true);
    }
}
