package com.superwall.sdk.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.paywall.view.ActivityEncapsulatable;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class DebugViewActivity extends androidx.appcompat.app.d {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String VIEW_KEY = "debugViewKey";

    @Nullable
    private View contentView;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startWithView(@NotNull Context context, @NotNull View view) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(view, "view");
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Superwall.Companion.getInstance().getDependencyContainer$superwall_release().makeViewStore().storeView(string, view);
            Intent intent = new Intent(context, (Class<?>) DebugViewActivity.class);
            intent.putExtra(DebugViewActivity.VIEW_KEY, string);
            intent.setFlags(805306368);
            context.startActivity(intent);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugViewActivity$onDestroy$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugViewActivity$onDestroy$1", f = "DebugView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ DebugView $debugView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DebugView debugView, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$debugView = debugView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$debugView, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.$debugView.viewDestroyed();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.h.W(true);
        String stringExtra = getIntent().getStringExtra(VIEW_KEY);
        if (stringExtra == null) {
            finish();
            return;
        }
        View viewRetrieveView = Superwall.Companion.getInstance().getDependencyContainer$superwall_release().makeViewStore().retrieveView(stringExtra);
        if (viewRetrieveView == 0) {
            finish();
            return;
        }
        if (viewRetrieveView instanceof AppCompatActivityEncapsulatable) {
            ((AppCompatActivityEncapsulatable) viewRetrieveView).setEncapsulatingActivity(this);
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(viewRetrieveView);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.B();
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        View view = this.contentView;
        DebugView debugView = view instanceof DebugView ? (DebugView) view : null;
        if (debugView == null) {
            return;
        }
        kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new AnonymousClass1(debugView, null), 3, null);
        KeyEvent.Callback callback = this.contentView;
        ActivityEncapsulatable activityEncapsulatable = callback instanceof ActivityEncapsulatable ? (ActivityEncapsulatable) callback : null;
        if (activityEncapsulatable != null) {
            activityEncapsulatable.setEncapsulatingActivity(null);
        }
        this.contentView = null;
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStart() {
        super.onStart();
        View view = this.contentView;
        DebugView debugView = view instanceof DebugView ? (DebugView) view : null;
        if (debugView == null) {
            return;
        }
        debugView.setActive$superwall_release(true);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onStop() {
        super.onStop();
        View view = this.contentView;
        DebugView debugView = view instanceof DebugView ? (DebugView) view : null;
        if (debugView == null) {
            return;
        }
        debugView.setActive$superwall_release(false);
    }

    @Override // androidx.appcompat.app.d, androidx.activity.l, android.app.Activity
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setContentView(view);
        this.contentView = view;
    }
}
