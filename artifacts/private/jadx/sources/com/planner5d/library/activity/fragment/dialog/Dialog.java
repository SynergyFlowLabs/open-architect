package com.planner5d.library.activity.fragment.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dialog.kt\ncom/planner5d/library/activity/fragment/dialog/Dialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public abstract class Dialog<T> extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private static final a f131612i3 = new a(null);

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private static WeakReference<Dialog<?>> f131613j3 = new WeakReference<>(null);

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private static final Object f131614k3 = new Object();

    @Nullable
    private u<T> H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f131615g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f131616h3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private Object f131617p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f131618p2;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends android.app.Dialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Dialog<T> f131619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Dialog<T> dialog, Context context, int i10) {
            super(context, i10);
            this.f131619a = dialog;
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (this.f131619a.onBackPressed()) {
                return;
            }
            super.onBackPressed();
        }
    }

    private final void C(boolean z10) {
        synchronized (f131614k3) {
            try {
                if (f131613j3.get() == this) {
                    f131613j3 = new WeakReference<>(null);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f131615g3) {
            this.f131615g3 = true;
            if (z10) {
                dismissAllowingStateLoss();
            }
        }
    }

    protected final <K> K A() {
        return (K) this.f131617p1;
    }

    protected final boolean B() {
        return this.f131616h3;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f131616h3 || ((this instanceof l0) && bundle != null)) {
            onActivityCreatedWithSetup(bundle);
        } else {
            dismiss();
        }
    }

    protected void onActivityCreatedWithSetup(@Nullable Bundle bundle) {
    }

    protected boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        synchronized (f131614k3) {
            try {
                Dialog<?> dialog = f131613j3.get();
                android.app.Dialog dialog2 = dialog != null ? dialog.getDialog() : null;
                if (dialog == null || dialog2 == null || !dialog2.isShowing()) {
                    if (dialog != null) {
                        try {
                            dialog.dismissAllowingStateLoss();
                        } catch (Throwable th2) {
                            timber.log.b.f381052a.f(th2, "Failed dismissing old dialog", new Object[0]);
                        }
                    }
                    f131613j3 = new WeakReference<>(this);
                } else {
                    dismissAllowingStateLoss();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public android.app.Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new b(this, requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C(false);
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        C(false);
        super.onDismiss(dialog);
    }

    protected void sendResultOnce(T t10) {
        if (!this.f131618p2) {
            this.f131618p2 = true;
            u<T> uVar = this.H1;
            if (uVar != null) {
                uVar.a(t10);
            }
        }
        C(true);
    }

    public final void setup(@Nullable Bundle bundle, @Nullable u<T> uVar, @Nullable Object obj) {
        if (bundle != null) {
            setArguments(bundle);
        }
        this.H1 = uVar;
        this.f131617p1 = obj;
        this.f131616h3 = true;
    }

    public final void showInternalDialog() {
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.show();
        }
    }
}
