package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.g1;
import androidx.lifecycle.n2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComponentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentDialog.kt\nandroidx/activity/ComponentDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
public class t extends Dialog implements androidx.lifecycle.o0, m0, androidx.savedstate.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private androidx.lifecycle.q0 f10060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.savedstate.l f10061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j0 f10062c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public t(@NotNull Context context) {
        this(context, 0, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 5 ^ 2;
    }

    private final androidx.lifecycle.q0 c() {
        androidx.lifecycle.q0 q0Var = this.f10060a;
        if (q0Var != null) {
            return q0Var;
        }
        androidx.lifecycle.q0 q0Var2 = new androidx.lifecycle.q0(this);
        this.f10060a = q0Var2;
        return q0Var2;
    }

    public static /* synthetic */ void e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(t tVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        f();
        super.addContentView(view, layoutParams);
    }

    @androidx.annotation.i
    public void f() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        n2.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        t0.b(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        androidx.savedstate.r.b(decorView3, this);
    }

    @Override // androidx.lifecycle.o0
    @NotNull
    public androidx.lifecycle.c0 getLifecycle() {
        return c();
    }

    @Override // androidx.activity.m0
    @NotNull
    public final j0 getOnBackPressedDispatcher() {
        return this.f10062c;
    }

    @Override // androidx.savedstate.m
    @NotNull
    public androidx.savedstate.j getSavedStateRegistry() {
        return this.f10061b.b();
    }

    @Override // android.app.Dialog
    @androidx.annotation.i
    public void onBackPressed() {
        this.f10062c.p();
    }

    @Override // android.app.Dialog
    @androidx.annotation.i
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            j0 j0Var = this.f10062c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            j0Var.s(onBackInvokedDispatcher);
        }
        this.f10061b.d(bundle);
        c().o(androidx.lifecycle.c0.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f10061b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    @androidx.annotation.i
    protected void onStart() {
        super.onStart();
        c().o(androidx.lifecycle.c0.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    @androidx.annotation.i
    protected void onStop() {
        c().o(androidx.lifecycle.c0.a.ON_DESTROY);
        this.f10060a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        f();
        super.setContentView(i10);
    }

    public /* synthetic */ t(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public t(@NotNull Context context, @g1 int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10061b = androidx.savedstate.l.f75159c.b(this);
        this.f10062c = new j0(new Runnable() { // from class: androidx.activity.s
            @Override // java.lang.Runnable
            public final void run() {
                t.g(this.f10059a);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        f();
        super.setContentView(view, layoutParams);
    }
}
