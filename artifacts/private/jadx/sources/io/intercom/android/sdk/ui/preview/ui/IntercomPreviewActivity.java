package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.w6;
import androidx.core.view.k2;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class IntercomPreviewActivity extends androidx.activity.l {

    @NotNull
    private final kotlin.f0 viewModel$delegate = kotlin.g0.c(new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IntercomPreviewActivity.viewModel_delegate$lambda$0(this.f294007a);
        }
    });

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context, @NotNull IntercomPreviewArgs args) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(args, "args");
            Intent intent = new Intent(context, (Class<?>) IntercomPreviewActivity.class);
            intent.putExtra("INTERCOM_PREVIEW_ARGS", args);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(int i10, List<? extends Uri> list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("MEDIA_RESULT_URIS", new ArrayList<>(list));
        setResult(i10, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntercomPreviewArgs getPreviewData() {
        IntercomPreviewArgs intercomPreviewArgs;
        Bundle extras = getIntent().getExtras();
        return (extras == null || (intercomPreviewArgs = (IntercomPreviewArgs) androidx.core.os.d.b(extras, "INTERCOM_PREVIEW_ARGS", IntercomPreviewArgs.class)) == null) ? new IntercomPreviewArgs(null, null, null, false, null, 31, null) : intercomPreviewArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PreviewViewModel getViewModel() {
        return (PreviewViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreviewViewModel viewModel_delegate$lambda$0(IntercomPreviewActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return PreviewViewModel.Companion.create$intercom_sdk_ui_release(this$0, this$0.getPreviewData());
    }

    @Override // androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        androidx.activity.u.d(this, null, null, 3, null);
        k2.a(getWindow(), getWindow().getDecorView()).i(false);
        androidx.activity.compose.f.b(this, null, androidx.compose.runtime.internal.w.c(-2110849940, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity.onCreate.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.IntercomPreviewActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            static final class C20491 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {
                final /* synthetic */ IntercomPreviewActivity this$0;

                C20491(IntercomPreviewActivity intercomPreviewActivity) {
                    this.this$0 = intercomPreviewActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$0(IntercomPreviewActivity this$0) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.finishWithResult(0, CollectionsKt.emptyList());
                    return Unit.f312394a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1(IntercomPreviewActivity this$0, IntercomPreviewFile it) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(it, "it");
                    this$0.getViewModel().onDeleteClicked$intercom_sdk_ui_release(it);
                    return Unit.f312394a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$2(IntercomPreviewActivity this$0, List it) {
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(it, "it");
                    this$0.finishWithResult(-1, it);
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                    invoke(c0Var, num.intValue());
                    return Unit.f312394a;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
                    if ((i10 & 11) == 2 && c0Var.d()) {
                        c0Var.u();
                        return;
                    }
                    IntercomPreviewArgs previewData = this.this$0.getPreviewData();
                    PreviewViewModel viewModel = this.this$0.getViewModel();
                    final IntercomPreviewActivity intercomPreviewActivity = this.this$0;
                    Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return IntercomPreviewActivity.AnonymousClass1.C20491.invoke$lambda$0(intercomPreviewActivity);
                        }
                    };
                    final IntercomPreviewActivity intercomPreviewActivity2 = this.this$0;
                    Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntercomPreviewActivity.AnonymousClass1.C20491.invoke$lambda$1(intercomPreviewActivity2, (IntercomPreviewFile) obj);
                        }
                    };
                    final IntercomPreviewActivity intercomPreviewActivity3 = this.this$0;
                    PreviewRootScreenKt.PreviewRootScreen(null, previewData, viewModel, function0, function1, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IntercomPreviewActivity.AnonymousClass1.C20491.invoke$lambda$2(intercomPreviewActivity3, (List) obj);
                        }
                    }, c0Var, 576, 1);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                invoke(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var, int i10) {
                if ((i10 & 11) == 2 && c0Var.d()) {
                    c0Var.u();
                    return;
                }
                if (((PreviewUiState) w6.b(IntercomPreviewActivity.this.getViewModel().getState$intercom_sdk_ui_release(), null, c0Var, 8, 1).getValue()).getFiles().isEmpty()) {
                    IntercomPreviewActivity.this.finishWithResult(0, CollectionsKt.emptyList());
                }
                IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.w.e(1935728022, true, new C20491(IntercomPreviewActivity.this), c0Var, 54), c0Var, 3072, 7);
            }
        }), 1, null);
    }
}
