package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends androidx.fragment.app.m {

    @NotNull
    public static final a H1 = new a(null);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    public static final String f100020p2 = "FacebookDialogFragment";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private Dialog f100021p1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        int i10 = 4 | 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(o this$0, Bundle bundle, com.facebook.u uVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G(bundle, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(o this$0, Bundle bundle, com.facebook.u uVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H(bundle);
    }

    private final void G(Bundle bundle, com.facebook.u uVar) {
        androidx.fragment.app.s activity = getActivity();
        if (activity == null) {
            return;
        }
        w0 w0Var = w0.f100148a;
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        activity.setResult(uVar == null ? -1 : 0, w0.n(intent, bundle, uVar));
        activity.finish();
    }

    private final void H(Bundle bundle) {
        androidx.fragment.app.s activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Nullable
    public final Dialog C() {
        return this.f100021p1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.annotation.l1
    public final void D() {
        androidx.fragment.app.s activity;
        j1 j1VarA;
        if (this.f100021p1 == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            w0 w0Var = w0.f100148a;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Bundle bundleZ = w0.z(intent);
            boolean z10 = false;
            if (bundleZ != null) {
                z10 = bundleZ.getBoolean(w0.f100162e1, false);
            }
            if (z10) {
                String string = bundleZ != null ? bundleZ.getString("url") : null;
                e1 e1Var = e1.f99794a;
                if (e1.Z(string)) {
                    e1.g0(f100020p2, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                q1 q1Var = q1.f312784a;
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{com.facebook.g0.o()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                s.a aVar = s.f100066i3;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                j1VarA = aVar.a(activity, string, str);
                j1VarA.H(new j1.e() { // from class: com.facebook.internal.n
                    @Override // com.facebook.internal.j1.e
                    public final void a(Bundle bundle, com.facebook.u uVar) {
                        o.F(this.f100015a, bundle, uVar);
                    }
                });
            } else {
                String string2 = bundleZ == null ? null : bundleZ.getString(w0.f100156c1);
                Bundle bundle = bundleZ != null ? bundleZ.getBundle("params") : null;
                e1 e1Var2 = e1.f99794a;
                if (e1.Z(string2)) {
                    e1.g0(f100020p2, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    j1VarA = new j1.a(activity, string2, bundle).h(new j1.e() { // from class: com.facebook.internal.m
                        @Override // com.facebook.internal.j1.e
                        public final void a(Bundle bundle2, com.facebook.u uVar) {
                            o.E(this.f99997a, bundle2, uVar);
                        }
                    }).a();
                }
            }
            this.f100021p1 = j1VarA;
        }
    }

    public final void I(@Nullable Dialog dialog) {
        this.f100021p1 = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f100021p1 instanceof j1) && isResumed()) {
            Dialog dialog = this.f100021p1;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((j1) dialog).C();
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        D();
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f100021p1;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        G(null, null);
        setShowsDialog(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.f100021p1;
        if (dialog instanceof j1) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((j1) dialog).C();
        }
    }
}
