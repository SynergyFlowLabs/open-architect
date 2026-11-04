package com.superwall.sdk.debug;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.superwall.sdk.BuildConfig;
import com.superwall.sdk.R;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.debug.localizations.SWLocalizationActivity;
import com.superwall.sdk.dependencies.RequestFactory;
import com.superwall.sdk.dependencies.ViewFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.network.Network;
import com.superwall.sdk.paywall.manager.PaywallManager;
import com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallSkippedReason;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import com.superwall.sdk.paywall.request.PaywallRequestManager;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.store.GetProductsResponse;
import com.superwall.sdk.store.StoreKit;
import com.superwall.sdk.store.StoreManager;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.i1;
import kotlin.k0;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDebugView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugView.kt\ncom/superwall/sdk/debug/DebugView\n+ 2 Either.kt\ncom/superwall/sdk/misc/EitherKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1007:1\n108#2,5:1008\n122#2,4:1015\n295#3,2:1013\n1557#3:1019\n1628#3,3:1020\n1611#3,9:1023\n1863#3:1032\n1864#3:1034\n1620#3:1035\n1557#3:1037\n1628#3,3:1038\n1#4:1033\n1#4:1036\n37#5,2:1041\n*S KotlinDebug\n*F\n+ 1 DebugView.kt\ncom/superwall/sdk/debug/DebugView\n*L\n532#1:1008,5\n565#1:1015,4\n551#1:1013,2\n664#1:1019\n664#1:1020,3\n743#1:1023,9\n743#1:1032\n743#1:1034\n743#1:1035\n806#1:1037\n806#1:1038,3\n743#1:1033\n806#1:1041,2\n*E\n"})
public final class DebugView extends ConstraintLayout implements AppCompatActivityEncapsulatable {

    @NotNull
    private final f0 activityIndicator$delegate;

    @NotNull
    private final f0 bottomButton$delegate;

    @NotNull
    private final f0 consoleButton$delegate;

    @NotNull
    private final Context context;

    @NotNull
    private final DebugManager debugManager;

    @Nullable
    private androidx.appcompat.app.d encapsulatingActivity;

    @NotNull
    private final f0 exitButton$delegate;

    @NotNull
    private final Factory factory;

    @Nullable
    private String initialLocaleIdentifier;
    private boolean isActive;
    private final int lightBackgroundColor;

    @NotNull
    private final f0 logoImageView$delegate;

    @NotNull
    private final Network network;

    @Nullable
    private Paywall paywall;

    @Nullable
    private String paywallDatabaseId;

    @Nullable
    private String paywallIdentifier;

    @NotNull
    private final PaywallManager paywallManager;

    @NotNull
    private final PaywallRequestManager paywallRequestManager;

    @NotNull
    private List<Paywall> paywalls;

    @NotNull
    private final f0 previewContainerView$delegate;

    @NotNull
    private final f0 previewPickerButton$delegate;
    private TextView previewTextView;

    @Nullable
    private View previewViewContent;
    private final int primaryColor;

    @NotNull
    private final StoreManager storeManager;

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$1", f = "DebugView.kt", i = {}, l = {com.rabbitmq.client.a.f264844o}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return DebugView.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                DebugView debugView = DebugView.this;
                this.label = 1;
                if (debugView.loadPreview(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class AlertOption {

        @Nullable
        private final Function1<kotlin.coroutines.d<? super Unit>, Object> action;
        private final int style;

        @Nullable
        private final String title;

        public AlertOption() {
            this(null, null, 0, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AlertOption copy$default(AlertOption alertOption, String str, Function1 function1, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = alertOption.title;
            }
            if ((i11 & 2) != 0) {
                function1 = alertOption.action;
            }
            if ((i11 & 4) != 0) {
                i10 = alertOption.style;
            }
            return alertOption.copy(str, function1, i10);
        }

        @Nullable
        public final String component1() {
            return this.title;
        }

        @Nullable
        public final Function1<kotlin.coroutines.d<? super Unit>, Object> component2() {
            return this.action;
        }

        public final int component3() {
            return this.style;
        }

        @NotNull
        public final AlertOption copy(@Nullable String str, @Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, int i10) {
            return new AlertOption(str, function1, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlertOption)) {
                return false;
            }
            AlertOption alertOption = (AlertOption) obj;
            return Intrinsics.areEqual(this.title, alertOption.title) && Intrinsics.areEqual(this.action, alertOption.action) && this.style == alertOption.style;
        }

        @Nullable
        public final Function1<kotlin.coroutines.d<? super Unit>, Object> getAction() {
            return this.action;
        }

        public final int getStyle() {
            return this.style;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.action;
            return ((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + Integer.hashCode(this.style);
        }

        @NotNull
        public String toString() {
            return "AlertOption(title=" + this.title + ", action=" + this.action + ", style=" + this.style + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AlertOption(@Nullable String str, @Nullable Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, int i10) {
            this.title = str;
            this.action = function1;
            this.style = i10;
        }

        public /* synthetic */ AlertOption(String str, Function1 function1, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : function1, (i11 & 4) != 0 ? -1 : i10);
        }
    }

    public interface Factory extends RequestFactory, ViewFactory {
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$addPaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView", f = "DebugView.kt", i = {0}, l = {594}, m = "addPaywallPreview", n = {"this"}, s = {"L$0"})
    static final class C26411 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26411(kotlin.coroutines.d<? super C26411> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DebugView.this.addPaywallPreview(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$finishLoadingPreview$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView", f = "DebugView.kt", i = {0, 0, 0, 1, 1}, l = {565, 568, 575}, m = "finishLoadingPreview", n = {"this", "request", "paywall", "this", "paywall"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C26421 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C26421(kotlin.coroutines.d<? super C26421> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DebugView.this.finishLoadingPreview(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$finishLoadingPreview$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$finishLoadingPreview$2", f = "DebugView.kt", i = {}, l = {578}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ i1.h<Paywall> $paywall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(i1.h<Paywall> hVar, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$paywall = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return DebugView.this.new AnonymousClass2(this.$paywall, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                TextView textView = DebugView.this.previewTextView;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("previewTextView");
                    textView = null;
                }
                textView.setText(this.$paywall.f312751a.getName());
                DebugView.this.getActivityIndicator().setVisibility(4);
                DebugView debugView = DebugView.this;
                this.label = 1;
                if (debugView.addPaywallPreview(this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$loadAndShowPaywall$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$loadAndShowPaywall$1", f = "DebugView.kt", i = {}, l = {857}, m = "invokeSuspend", n = {}, s = {})
    static final class C26431 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ j0<PaywallState> $publisher;
        int label;
        final /* synthetic */ DebugView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26431(j0<PaywallState> j0Var, DebugView debugView, kotlin.coroutines.d<? super C26431> dVar) {
            super(2, dVar);
            this.$publisher = j0Var;
            this.this$0 = debugView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26431(this.$publisher, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0<PaywallState> j0Var = this.$publisher;
                final DebugView debugView = this.this$0;
                kotlinx.coroutines.flow.j<? super PaywallState> jVar = new kotlinx.coroutines.flow.j() { // from class: com.superwall.sdk.debug.DebugView.loadAndShowPaywall.1.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((PaywallState) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(PaywallState paywallState, kotlin.coroutines.d<? super Unit> dVar) {
                        String str;
                        if (paywallState instanceof PaywallState.Presented) {
                            androidx.core.content.res.i.g(debugView.getResources(), R.drawable.play_button, null);
                        } else if (paywallState instanceof PaywallState.Skipped) {
                            PaywallSkippedReason paywallSkippedReason = ((PaywallState.Skipped) paywallState).getPaywallSkippedReason();
                            if (paywallSkippedReason instanceof PaywallSkippedReason.Holdout) {
                                str = "The user was assigned to a holdout.";
                            } else if (paywallSkippedReason instanceof PaywallSkippedReason.NoAudienceMatch) {
                                str = "The user didn't match a rule.";
                            } else if (paywallSkippedReason instanceof PaywallSkippedReason.PlacementNotFound) {
                                str = "Couldn't find event.";
                            } else {
                                if (!(paywallSkippedReason instanceof PaywallSkippedReason.UserIsSubscribed)) {
                                    throw new k0();
                                }
                                str = "The user is subscribed.";
                            }
                            DebugView.presentAlert$default(debugView, "Paywall Skipped", str, null, 4, null);
                            androidx.core.content.res.i.g(debugView.getResources(), R.drawable.play_button, null);
                        } else if (!(paywallState instanceof PaywallState.Dismissed)) {
                            if (!(paywallState instanceof PaywallState.PresentationError)) {
                                throw new k0();
                            }
                            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.debugView, "Failed to Show Paywall", null, null, 24, null);
                            DebugView.presentAlert$default(debugView, "Presentation Error", ((PaywallState.PresentationError) paywallState).getError().getLocalizedMessage(), null, 4, null);
                            androidx.core.content.res.i.g(debugView.getResources(), R.drawable.play_button, null);
                        }
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (j0Var.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26431) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$loadAndShowPaywall$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$loadAndShowPaywall$2", f = "DebugView.kt", i = {}, l = {908}, m = "invokeSuspend", n = {}, s = {})
    static final class C26442 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ PresentationRequest $presentationRequest;
        final /* synthetic */ j0<PaywallState> $publisher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26442(PresentationRequest presentationRequest, j0<PaywallState> j0Var, kotlin.coroutines.d<? super C26442> dVar) {
            super(2, dVar);
            this.$presentationRequest = presentationRequest;
            this.$publisher = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26442(this.$presentationRequest, this.$publisher, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                PresentationRequest presentationRequest = this.$presentationRequest;
                j0<PaywallState> j0Var = this.$publisher;
                this.label = 1;
                if (InternalPresentationKt.internallyPresent(companion, presentationRequest, j0Var, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26442) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$loadPreview$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView", f = "DebugView.kt", i = {0, 1}, l = {521, 531, 534, 544}, m = "loadPreview", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class C26451 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26451(kotlin.coroutines.d<? super C26451> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DebugView.this.loadPreview(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$loadPreview$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView$loadPreview$2", f = "DebugView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C26462 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C26462(kotlin.coroutines.d<? super C26462> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return DebugView.this.new C26462(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            DebugView.this.getActivityIndicator().setVisibility(0);
            View view = DebugView.this.previewViewContent;
            if (view != null) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                    return Unit.f312394a;
                }
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26462) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$pressedConsoleButton$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C26471 extends kotlin.jvm.internal.a implements Function1<kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        C26471(Object obj) {
            super(1, obj, DebugView.class, "showLocalizationPicker", "showLocalizationPicker()V", 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return DebugView.pressedConsoleButton$showLocalizationPicker((DebugView) this.receiver, dVar);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$pressedConsoleButton$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C26482 extends g0 implements Function1<kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        C26482(Object obj) {
            super(1, obj, DebugView.class, "showConsole", "showConsole(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((DebugView) this.receiver).showConsole(dVar);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.debug.DebugView$showConsole$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugView", f = "DebugView.kt", i = {0, 0}, l = {739}, m = "showConsole", n = {"this", "paywall"}, s = {"L$0", "L$1"})
    static final class C26491 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26491(kotlin.coroutines.d<? super C26491> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DebugView.this.showConsole(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugView(@NotNull Context context, @NotNull StoreManager storeManager, @NotNull Network network, @NotNull PaywallRequestManager paywallRequestManager, @NotNull PaywallManager paywallManager, @NotNull DebugManager debugManager, @NotNull Factory factory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storeManager, "storeManager");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(paywallRequestManager, "paywallRequestManager");
        Intrinsics.checkNotNullParameter(paywallManager, "paywallManager");
        Intrinsics.checkNotNullParameter(debugManager, "debugManager");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.context = context;
        this.storeManager = storeManager;
        this.network = network;
        this.paywallRequestManager = paywallRequestManager;
        this.paywallManager = paywallManager;
        this.debugManager = debugManager;
        this.factory = factory;
        this.paywalls = CollectionsKt.emptyList();
        this.logoImageView$delegate = kotlin.g0.c(new Function0() { // from class: com.superwall.sdk.debug.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugView.logoImageView_delegate$lambda$1(this.f267408a);
            }
        });
        this.exitButton$delegate = kotlin.g0.c(new Function0() { // from class: com.superwall.sdk.debug.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugView.exitButton_delegate$lambda$5(this.f267409a);
            }
        });
        this.consoleButton$delegate = kotlin.g0.c(new Function0() { // from class: com.superwall.sdk.debug.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugView.consoleButton_delegate$lambda$9(this.f267410a);
            }
        });
        this.activityIndicator$delegate = kotlin.g0.c(new Function0() { // from class: com.superwall.sdk.debug.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugView.activityIndicator_delegate$lambda$11(this.f267411a);
            }
        });
        this.primaryColor = Color.parseColor("#75FFF1");
        this.lightBackgroundColor = Color.parseColor("#181A1E");
        this.bottomButton$delegate = kotlin.g0.c(new Function0() { // from class: com.superwall.sdk.debug.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugView.bottomButton_delegate$lambda$18(this.f267412a);
            }
        });
        this.previewPickerButton$delegate = kotlin.g0.c(new Function0() { // from class: com.superwall.sdk.debug.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugView.previewPickerButton_delegate$lambda$24(this.f267417a);
            }
        });
        this.previewContainerView$delegate = kotlin.g0.c(new Function0() { // from class: com.superwall.sdk.debug.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebugView.previewContainerView_delegate$lambda$27(this.f267418a);
            }
        });
        this.initialLocaleIdentifier = Superwall.Companion.getInstance().getOptions().getLocaleIdentifier();
        addSubviews();
        kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressBar activityIndicator_delegate$lambda$11(DebugView debugView) {
        ProgressBar progressBar = new ProgressBar(debugView.context);
        progressBar.setId(View.generateViewId());
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        progressBar.setLayoutParams(new ConstraintLayout.b(-2, -2));
        return progressBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout bottomButton_delegate$lambda$18(final DebugView debugView) {
        debugView.setId(View.generateViewId());
        LinearLayout linearLayout = new LinearLayout(debugView.context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setClickable(true);
        linearLayout.setId(View.generateViewId());
        linearLayout.setFocusable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#203133"));
        gradientDrawable.setCornerRadius(70.0f);
        linearLayout.setBackground(gradientDrawable);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setId(View.generateViewId());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(R.drawable.play_button);
        imageView.setColorFilter(debugView.primaryColor);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = 8;
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(View.generateViewId());
        textView.setText("Preview");
        textView.setTextSize(17.0f);
        textView.setTypeface(null, 1);
        textView.setTextColor(debugView.primaryColor);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(textView);
        linearLayout.setPadding(32, 16, 32, 16);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.superwall.sdk.debug.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f267407a.pressedBottomButton();
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout consoleButton_delegate$lambda$9(final DebugView debugView) {
        LinearLayout linearLayout = new LinearLayout(debugView.context);
        linearLayout.setId(View.generateViewId());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(linearLayout.getContext());
        Drawable drawableL = androidx.core.content.d.l(imageView.getContext(), R.drawable.debugger);
        Drawable drawableMutate = drawableL != null ? drawableL.mutate() : null;
        if (drawableMutate != null) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        }
        imageView.setImageDrawable(drawableMutate);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAlpha(0.5f);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.superwall.sdk.debug.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f267406a.pressedConsoleButton();
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout exitButton_delegate$lambda$5(final DebugView debugView) {
        LinearLayout linearLayout = new LinearLayout(debugView.context);
        linearLayout.setId(View.generateViewId());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(linearLayout.getContext());
        Drawable drawableL = androidx.core.content.d.l(imageView.getContext(), R.drawable.exit);
        Drawable drawableMutate = drawableL != null ? drawableL.mutate() : null;
        if (drawableMutate != null) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        }
        imageView.setImageDrawable(drawableMutate);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAlpha(0.5f);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.superwall.sdk.debug.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f267402a.pressedExitButton();
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressBar getActivityIndicator() {
        return (ProgressBar) this.activityIndicator$delegate.getValue();
    }

    private final LinearLayout getBottomButton() {
        return (LinearLayout) this.bottomButton$delegate.getValue();
    }

    private final LinearLayout getConsoleButton() {
        return (LinearLayout) this.consoleButton$delegate.getValue();
    }

    private final LinearLayout getExitButton() {
        return (LinearLayout) this.exitButton$delegate.getValue();
    }

    private final ImageView getLogoImageView() {
        return (ImageView) this.logoImageView$delegate.getValue();
    }

    private final ConstraintLayout getPreviewContainerView() {
        return (ConstraintLayout) this.previewContainerView$delegate.getValue();
    }

    private final LinearLayout getPreviewPickerButton() {
        return (LinearLayout) this.previewPickerButton$delegate.getValue();
    }

    public static /* synthetic */ void loadAndShowPaywall$default(DebugView debugView, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        debugView.loadAndShowPaywall(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView logoImageView_delegate$lambda$1(DebugView debugView) {
        ImageView imageView = new ImageView(debugView.context);
        imageView.setId(View.generateViewId());
        imageView.setImageDrawable(androidx.core.content.d.l(imageView.getContext(), R.drawable.superwall_logo));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(0);
        imageView.setClipToOutline(true);
        imageView.setVisibility(0);
        imageView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        return imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void presentAlert$default(DebugView debugView, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        debugView.presentAlert(str, str2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentAlert$lambda$46(List list, DialogInterface dialogInterface, int i10) {
        kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new DebugView$presentAlert$1$1((AlertOption) list.get(i10), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentAlert$lambda$47(AlertDialog alertDialog) {
        Window window = alertDialog.getWindow();
        View viewFindViewById = window != null ? window.findViewById(i.a.g.f286220u) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pressedConsoleButton$showLocalizationPicker(DebugView debugView, kotlin.coroutines.d dVar) {
        debugView.showLocalizationPicker();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pressedExitButton() {
        androidx.appcompat.app.d encapsulatingActivity = getEncapsulatingActivity();
        if (encapsulatingActivity != null) {
            encapsulatingActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pressedPreview() {
        String str = this.paywallDatabaseId;
        if (str == null) {
            return;
        }
        List<Paywall> list = this.paywalls;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Paywall paywall : list) {
            String name = paywall.getName();
            if (Intrinsics.areEqual(str, paywall.getDatabaseId())) {
                name = name + " ✓";
            }
            arrayList.add(new AlertOption(name, new DebugView$pressedPreview$options$1$alert$1(this, paywall, null), 0, 4, null));
        }
        presentAlert("Your Paywalls", null, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintLayout previewContainerView_delegate$lambda$27(final DebugView debugView) {
        ConstraintLayout constraintLayout = new ConstraintLayout(debugView.context);
        constraintLayout.setId(View.generateViewId());
        constraintLayout.setFocusable(true);
        constraintLayout.setLayoutParams(new ConstraintLayout.b(0, 0));
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.superwall.sdk.debug.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f267419a.pressedPreview();
            }
        });
        return constraintLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout previewPickerButton_delegate$lambda$24(final DebugView debugView) {
        LinearLayout linearLayout = new LinearLayout(debugView.context);
        linearLayout.setId(View.generateViewId());
        int i10 = 4 ^ 0;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(debugView.lightBackgroundColor);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(View.generateViewId());
        textView.setText("");
        textView.setTextSize(14.0f);
        textView.setTypeface(null, 1);
        textView.setTextColor(debugView.primaryColor);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        debugView.previewTextView = textView;
        linearLayout.addView(textView);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setId(View.generateViewId());
        imageView.setImageResource(R.drawable.down_arrow);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(debugView.primaryColor);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = 8;
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
        linearLayout.setPadding(10, 10, 10, 10);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.superwall.sdk.debug.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f267401a.pressedPreview();
            }
        });
        return linearLayout;
    }

    private final void showLocalizationPicker() {
        SWLocalizationActivity.Companion.setCompletion(new Function1() { // from class: com.superwall.sdk.debug.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebugView.showLocalizationPicker$lambda$42(this.f267405a, (String) obj);
            }
        });
        androidx.appcompat.app.d encapsulatingActivity = getEncapsulatingActivity();
        if (encapsulatingActivity == null) {
            return;
        }
        encapsulatingActivity.startActivity(new Intent(encapsulatingActivity, (Class<?>) SWLocalizationActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocalizationPicker$lambda$42(DebugView debugView, String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Superwall.Companion.getInstance().setLocaleIdentifier(locale);
        kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new DebugView$showLocalizationPicker$1$1(debugView, null), 3, null);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object addPaywallPreview(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C26411 c26411;
        if (dVar instanceof C26411) {
            c26411 = (C26411) dVar;
            int i10 = c26411.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26411.label = i10 - Integer.MIN_VALUE;
            } else {
                c26411 = new C26411(dVar);
            }
        } else {
            c26411 = new C26411(dVar);
        }
        Object objMakePaywallView = c26411.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26411.label;
        if (i11 == 0) {
            ResultKt.m(objMakePaywallView);
            Paywall paywall = this.paywall;
            if (paywall == null) {
                return Unit.f312394a;
            }
            Factory factory = this.factory;
            c26411.L$0 = this;
            c26411.label = 1;
            objMakePaywallView = factory.makePaywallView(paywall, null, null, c26411);
            if (objMakePaywallView == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (DebugView) c26411.L$0;
            ResultKt.m(objMakePaywallView);
        }
        PaywallView paywallView = (PaywallView) objMakePaywallView;
        this.getPreviewContainerView().addView(paywallView);
        this.previewViewContent = paywallView;
        paywallView.setLayoutParams(new ConstraintLayout.b(-1, -1));
        paywallView.setInterceptTouchEvents$superwall_release(true);
        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
        fVar.H(this.getPreviewContainerView());
        fVar.K(paywallView.getId(), 6, this.getPreviewContainerView().getId(), 6);
        fVar.K(paywallView.getId(), 7, this.getPreviewContainerView().getId(), 7);
        fVar.K(paywallView.getId(), 3, this.getPreviewContainerView().getId(), 3);
        fVar.K(paywallView.getId(), 4, this.getPreviewContainerView().getId(), 4);
        fVar.r(this.getPreviewContainerView());
        paywallView.setClipToOutline(true);
        paywallView.setAlpha(0.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(52.0f);
        gradientDrawable.setStroke(2, -1);
        paywallView.setBackground(gradientDrawable);
        float height = this.getPreviewContainerView().getHeight() / this.getRootView().getHeight();
        paywallView.setScaleX(height);
        paywallView.setScaleY(height);
        paywallView.animate().alpha(1.0f).setDuration(250L).setStartDelay(100L).start();
        return Unit.f312394a;
    }

    public final void addSubviews() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        addView(getActivityIndicator(), layoutParams);
        addView(getLogoImageView(), layoutParams);
        addView(getConsoleButton(), layoutParams);
        addView(getExitButton(), layoutParams);
        addView(getBottomButton(), layoutParams);
        addView(getPreviewContainerView(), layoutParams);
        addView(getPreviewPickerButton(), layoutParams);
        getPreviewContainerView().setClipToOutline(false);
        setBackgroundColor(this.lightBackgroundColor);
        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
        fVar.H(this);
        fVar.K(getPreviewContainerView().getId(), 6, 0, 6);
        fVar.K(getPreviewContainerView().getId(), 7, 0, 7);
        int i10 = 1 & 5;
        fVar.L(getPreviewContainerView().getId(), 3, getLogoImageView().getId(), 4, dpToPx(5));
        fVar.L(getPreviewContainerView().getId(), 4, getBottomButton().getId(), 3, dpToPx(5));
        fVar.P(getPreviewContainerView().getId(), 0);
        fVar.W(getLogoImageView().getId(), 0);
        fVar.P(getLogoImageView().getId(), dpToPx(20));
        fVar.L(getLogoImageView().getId(), 3, 0, 3, dpToPx(30));
        fVar.K(getLogoImageView().getId(), 6, getConsoleButton().getId(), 7);
        fVar.K(getLogoImageView().getId(), 7, getExitButton().getId(), 6);
        fVar.L(getConsoleButton().getId(), 6, 0, 6, dpToPx(25));
        fVar.L(getConsoleButton().getId(), 3, 0, 3, dpToPx(30));
        fVar.W(getConsoleButton().getId(), dpToPx(44));
        fVar.L(getExitButton().getId(), 7, 0, 7, dpToPx(25));
        fVar.L(getExitButton().getId(), 3, 0, 3, dpToPx(30));
        fVar.W(getExitButton().getId(), dpToPx(44));
        fVar.K(getActivityIndicator().getId(), 6, getPreviewContainerView().getId(), 6);
        fVar.K(getActivityIndicator().getId(), 7, getPreviewContainerView().getId(), 7);
        int i11 = 1 | 3;
        fVar.K(getActivityIndicator().getId(), 3, getPreviewContainerView().getId(), 3);
        fVar.K(getActivityIndicator().getId(), 4, getPreviewContainerView().getId(), 4);
        fVar.L(getBottomButton().getId(), 6, 0, 6, dpToPx(25));
        fVar.L(getBottomButton().getId(), 7, 0, 7, dpToPx(25));
        fVar.P(getBottomButton().getId(), dpToPx(60));
        fVar.L(getBottomButton().getId(), 4, 0, 4, dpToPx(30));
        fVar.L(getPreviewPickerButton().getId(), 6, getPreviewContainerView().getId(), 6, dpToPx(25));
        fVar.L(getPreviewPickerButton().getId(), 7, getPreviewContainerView().getId(), 7, dpToPx(25));
        fVar.P(getPreviewPickerButton().getId(), dpToPx(30));
        fVar.L(getPreviewPickerButton().getId(), 4, getBottomButton().getId(), 3, dpToPx(10));
        fVar.r(this);
    }

    public final int dpToPx(int i10) {
        return (int) (i10 * getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
    
        if (kotlinx.coroutines.i.h(r1, r4, r6) == r2) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object finishLoadingPreview(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.debug.DebugView.finishLoadingPreview(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.superwall.sdk.debug.AppCompatActivityEncapsulatable
    @Nullable
    public androidx.appcompat.app.d getEncapsulatingActivity() {
        return this.encapsulatingActivity;
    }

    @Nullable
    public final String getPaywallDatabaseId$superwall_release() {
        return this.paywallDatabaseId;
    }

    public final boolean isActive$superwall_release() {
        return this.isActive;
    }

    public final void loadAndShowPaywall(boolean z10) {
        String str = this.paywallIdentifier;
        if (str == null) {
            return;
        }
        PresentationRequest presentationRequestMakePresentationRequest = this.factory.makePresentationRequest(new PresentationInfo.FromIdentifier(str, z10), null, getEncapsulatingActivity(), Boolean.TRUE, b1.a(SubscriptionStatus.Inactive.INSTANCE), Superwall.Companion.getInstance().isPaywallPresented(), PresentationRequestType.Presentation.INSTANCE);
        j0 j0VarB = q0.b(0, 0, null, 7, null);
        kotlinx.coroutines.k.f(t0.a(l1.e()), null, null, new C26431(j0VarB, this, null), 3, null);
        kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new C26442(presentationRequestMakePresentationRequest, j0VarB, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r9.finishLoadingPreview(r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        if (r9.finishLoadingPreview(r0) == r1) goto L45;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadPreview(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.debug.DebugView.loadPreview(kotlin.coroutines.d):java.lang.Object");
    }

    public final void presentAlert(@Nullable String str, @Nullable String str2, @NotNull final List<AlertOption> options) {
        View viewFindViewById;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(options, "options");
        androidx.appcompat.app.d encapsulatingActivity = getEncapsulatingActivity();
        if (encapsulatingActivity == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(encapsulatingActivity);
        builder.setTitle(str);
        builder.setMessage(str2);
        List<AlertOption> list = options;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AlertOption) it.next()).getTitle());
        }
        builder.setItems((String[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.superwall.sdk.debug.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DebugView.presentAlert$lambda$46(options, dialogInterface, i10);
            }
        });
        final AlertDialog alertDialogCreate = builder.create();
        Window window = alertDialogCreate.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.gravity = 80;
        }
        Window window2 = alertDialogCreate.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        alertDialogCreate.show();
        Window window3 = alertDialogCreate.getWindow();
        if (window3 == null || (viewFindViewById = window3.findViewById(i.a.g.f286220u)) == null) {
            return;
        }
        viewFindViewById.post(new Runnable() { // from class: com.superwall.sdk.debug.d
            @Override // java.lang.Runnable
            public final void run() {
                DebugView.presentAlert$lambda$47(alertDialogCreate);
            }
        });
    }

    public final void pressedBottomButton() {
        presentAlert("Which version?", null, CollectionsKt.listOf((Object[]) new AlertOption[]{new AlertOption("With Free Trial", new DebugView$pressedBottomButton$alertOptions$1(this, null), -1), new AlertOption("Without Free Trial", new DebugView$pressedBottomButton$alertOptions$2(this, null), -1)}));
    }

    public final void pressedConsoleButton() {
        String str;
        String strValueOf = "";
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            str = packageInfo.versionName;
            if (str == null) {
                str = com.facebook.internal.a.f99697t;
            }
            try {
                strValueOf = String.valueOf(packageInfo.getLongVersionCode());
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str = "";
        }
        presentAlert("Superwall v" + BuildConfig.SDK_VERSION + " | App v" + str + " (" + strValueOf + ")", null, CollectionsKt.listOf((Object[]) new AlertOption[]{new AlertOption("Localization", new C26471(this), 0, 4, null), new AlertOption("Templates", new C26482(this), 0, 4, null)}));
    }

    public final void setActive$superwall_release(boolean z10) {
        this.isActive = z10;
    }

    @Override // com.superwall.sdk.debug.AppCompatActivityEncapsulatable
    public void setEncapsulatingActivity(@Nullable androidx.appcompat.app.d dVar) {
        this.encapsulatingActivity = dVar;
    }

    public final void setPaywallDatabaseId$superwall_release(@Nullable String str) {
        this.paywallDatabaseId = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    @Nullable
    public final Object showConsole(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C26491 c26491;
        DebugView debugView;
        Paywall paywall;
        if (dVar instanceof C26491) {
            c26491 = (C26491) dVar;
            int i10 = c26491.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26491.label = i10 - Integer.MIN_VALUE;
            } else {
                c26491 = new C26491(dVar);
            }
        } else {
            c26491 = new C26491(dVar);
        }
        C26491 c26492 = c26491;
        Object products$default = c26492.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26492.label;
        try {
            if (i11 == 0) {
                ResultKt.m(products$default);
                Paywall paywall2 = this.paywall;
                if (paywall2 == null) {
                    Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.debugView, "Paywall is nil", null, null, 24, null);
                    return Unit.f312394a;
                }
                StoreManager storeManager = this.storeManager;
                c26492.L$0 = this;
                c26492.L$1 = paywall2;
                c26492.label = 1;
                products$default = StoreKit.DefaultImpls.getProducts$default(storeManager, null, paywall2, null, c26492, 5, null);
                if (products$default == objL) {
                    return objL;
                }
                debugView = this;
                paywall = paywall2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paywall = (Paywall) c26492.L$1;
                debugView = (DebugView) c26492.L$0;
                ResultKt.m(products$default);
            }
            Map<String, StoreProduct> mapComponent1 = ((GetProductsResponse) products$default).component1();
            List<String> productIds = paywall.getProductIds();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = productIds.iterator();
            while (it.hasNext()) {
                StoreProduct storeProduct = mapComponent1.get((String) it.next());
                if (storeProduct != null) {
                    arrayList.add(storeProduct);
                }
            }
            SWConsoleActivity.Companion.setProducts(arrayList);
            androidx.appcompat.app.d encapsulatingActivity = debugView.getEncapsulatingActivity();
            if (encapsulatingActivity == null) {
                return Unit.f312394a;
            }
            Intent intent = new Intent(encapsulatingActivity, (Class<?>) SWConsoleActivity.class);
            intent.putExtra("PARENT_ACTIVITY", intent.getClass().getSimpleName());
            encapsulatingActivity.startActivity(intent);
            return Unit.f312394a;
        } catch (Throwable th2) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.debugView, "Error retrieving products - " + th2.getMessage(), null, null, 24, null);
        }
    }

    public final void viewDestroyed() {
        this.paywallManager.resetCache();
        this.debugManager.setDebuggerLaunched(false);
        Superwall.Companion.getInstance().getOptions().setLocaleIdentifier(this.initialLocaleIdentifier);
    }
}
