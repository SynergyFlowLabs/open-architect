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
@SourceDebugExtension({"SMAP\nPreloaderDialogView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloaderDialogView.kt\ncom/planner5d/library/widget/preloader/PreloaderDialogView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,72:1\n1#2:73\n257#3,2:74\n257#3,2:76\n257#3,2:78\n255#3:80\n257#3,2:81\n*S KotlinDebug\n*F\n+ 1 PreloaderDialogView.kt\ncom/planner5d/library/widget/preloader/PreloaderDialogView\n*L\n57#1:74,2\n58#1:76,2\n59#1:78,2\n62#1:80\n63#1:81,2\n*E\n"})
public final class PreloaderDialogView extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f258505e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    public fg.e<p0> f258506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final te.a0 f258507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private a f258508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Integer f258509d;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f258510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f258511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f258512c;

        public a() {
            this(false, false, null, 7, null);
        }

        public static /* synthetic */ a e(a aVar, boolean z10, boolean z11, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f258510a;
            }
            if ((i10 & 2) != 0) {
                z11 = aVar.f258511b;
            }
            if ((i10 & 4) != 0) {
                str = aVar.f258512c;
            }
            return aVar.d(z10, z11, str);
        }

        public final boolean a() {
            return this.f258510a;
        }

        public final boolean b() {
            return this.f258511b;
        }

        @Nullable
        public final String c() {
            return this.f258512c;
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
            return this.f258510a == aVar.f258510a && this.f258511b == aVar.f258511b && Intrinsics.areEqual(this.f258512c, aVar.f258512c);
        }

        @Nullable
        public final String f() {
            return this.f258512c;
        }

        public final boolean g() {
            return this.f258511b;
        }

        public final boolean h() {
            return this.f258510a;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.f258510a) * 31) + Boolean.hashCode(this.f258511b)) * 31;
            String str = this.f258512c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "State(visible=" + this.f258510a + ", progressBar=" + this.f258511b + ", label=" + this.f258512c + ")";
        }

        public a(boolean z10, boolean z11, @Nullable String str) {
            this.f258510a = z10;
            this.f258511b = z11;
            this.f258512c = str;
        }

        public /* synthetic */ a(boolean z10, boolean z11, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderDialogView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void c() {
        if (!o3.b()) {
            post(new Runnable() { // from class: com.planner5d.library.widget.preloader.z
                @Override // java.lang.Runnable
                public final void run() {
                    PreloaderDialogView.d(this.f258626a);
                }
            });
            return;
        }
        a aVar = this.f258508c;
        if (aVar.h()) {
            TextView preloaderText = this.f258507b.f380866d;
            Intrinsics.checkNotNullExpressionValue(preloaderText, "preloaderText");
            String strF = aVar.f();
            if (strF != null) {
                this.f258507b.f380866d.setText(strF);
            } else {
                strF = null;
            }
            preloaderText.setVisibility(strF != null ? 0 : 8);
            PreloaderBarView preloaderCircle = this.f258507b.f380864b;
            Intrinsics.checkNotNullExpressionValue(preloaderCircle, "preloaderCircle");
            preloaderCircle.setVisibility(aVar.g() ? 0 : 8);
            FrameLayout preloaderCircleBackground = this.f258507b.f380865c;
            Intrinsics.checkNotNullExpressionValue(preloaderCircleBackground, "preloaderCircleBackground");
            preloaderCircleBackground.setVisibility(aVar.g() ? 0 : 8);
            Integer num = this.f258509d;
            setBackgroundColor(num != null ? num.intValue() : h0.f258546c);
        }
        if ((getVisibility() == 0) != aVar.h()) {
            setVisibility(aVar.h() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(PreloaderDialogView preloaderDialogView) {
        preloaderDialogView.c();
    }

    public final void b() {
        this.f258508c = new a(false, false, null, 7, null);
        c();
    }

    public final void e(@Nullable String str, @Nullable Integer num, boolean z10, boolean z11) {
        p0 p0Var = getFormatter$P5D_Library_Widgets_release().get();
        if (num == null || !z10) {
            num = null;
        }
        this.f258508c = new a(true, z11, PreloaderBoxView.b(p0Var, str, num));
        c();
    }

    @NotNull
    public final fg.e<p0> getFormatter$P5D_Library_Widgets_release() {
        fg.e<p0> eVar = this.f258506a;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formatter");
        return null;
    }

    public final void setFormatter$P5D_Library_Widgets_release(@NotNull fg.e<p0> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f258506a = eVar;
    }

    public final void setScrimColor(@Nullable Integer num) {
        this.f258509d = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderDialogView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PreloaderDialogView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public PreloaderDialogView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258508c = new a(false, false, null, 7, null);
        e6.a(this).m(this);
        this.f258507b = te.a0.a(View.inflate(context, c1.l.f252206s2, this));
        setClickable(true);
    }
}
