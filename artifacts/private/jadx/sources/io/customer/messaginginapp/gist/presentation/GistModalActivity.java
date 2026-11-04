package io.customer.messaginginapp.gist.presentation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.activity.i0;
import androidx.lifecycle.p0;
import io.customer.messaginginapp.databinding.ActivityGistBinding;
import io.customer.messaginginapp.di.DIGraphMessagingInAppKt;
import io.customer.messaginginapp.gist.data.model.GistProperties;
import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.gist.data.model.MessagePosition;
import io.customer.messaginginapp.gist.utilities.ElapsedTimer;
import io.customer.messaginginapp.gist.utilities.MessageOverlayColorParser;
import io.customer.messaginginapp.gist.utilities.ModalAnimationUtil;
import io.customer.messaginginapp.gist.utilities.ModalMessageExtras;
import io.customer.messaginginapp.gist.utilities.ModalMessageParser;
import io.customer.messaginginapp.state.InAppMessagingAction;
import io.customer.messaginginapp.state.InAppMessagingManager;
import io.customer.messaginginapp.state.InAppMessagingState;
import io.customer.messaginginapp.state.ModalMessageState;
import io.customer.messaginginapp.ui.bridge.ModalInAppMessageViewCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@rg.a
@SourceDebugExtension({"SMAP\nGistModalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GistModalActivity.kt\nio/customer/messaginginapp/gist/presentation/GistModalActivity\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,246:1\n30#2:247\n91#2,14:248\n30#2:262\n91#2,14:263\n*S KotlinDebug\n*F\n+ 1 GistModalActivity.kt\nio/customer/messaginginapp/gist/presentation/GistModalActivity\n*L\n169#1:247\n169#1:248,14\n221#1:262\n221#1:263,14\n*E\n"})
public final class GistModalActivity extends androidx.appcompat.app.d implements ModalInAppMessageViewCallback, lh.a {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private ActivityGistBinding binding;

    @NotNull
    private final ih.b dispatchersProvider;

    @NotNull
    private final ih.e logger;

    @NotNull
    private final ModalMessageParser modalMessageParser;

    @NotNull
    private MessagePosition messagePosition = MessagePosition.CENTER;

    @NotNull
    private final List<p2> attributesListenerJob = new ArrayList();

    @NotNull
    private final ElapsedTimer elapsedTimer = new ElapsedTimer();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent newIntent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) GistModalActivity.class);
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessagePosition.values().length];
            try {
                iArr[MessagePosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagePosition.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessagePosition.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.customer.messaginginapp.gist.presentation.GistModalActivity$prepareActivity$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.customer.messaginginapp.gist.presentation.GistModalActivity$prepareActivity$1", f = "GistModalActivity.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return GistModalActivity.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                GistModalActivity gistModalActivity = GistModalActivity.this;
                this.label = 1;
                obj = gistModalActivity.validateAndParseIntentExtras(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            ModalMessageExtras modalMessageExtras = (ModalMessageExtras) obj;
            if (modalMessageExtras == null) {
                GistModalActivity.this.finishImmediately();
                return Unit.f312394a;
            }
            Message messageComponent1 = modalMessageExtras.component1();
            GistModalActivity.this.messagePosition = modalMessageExtras.component2();
            GistModalActivity.this.initializeActivity();
            GistModalActivity.this.setupMessage(messageComponent1);
            GistModalActivity.this.subscribeToAttributes();
            GistModalActivity.this.setupBackPressedCallback(messageComponent1);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public GistModalActivity() {
        eh.d dVar = eh.d.f274883c;
        this.logger = dVar.w();
        this.dispatchersProvider = dVar.u();
        this.modalMessageParser = DIGraphMessagingInAppKt.getModalMessageParser(dVar);
    }

    private final void cleanUp() {
        runOnUiThread(new Runnable() { // from class: io.customer.messaginginapp.gist.presentation.f
            @Override // java.lang.Runnable
            public final void run() {
                GistModalActivity.cleanUp$lambda$8(this.f288356a);
            }
        });
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleanUp$lambda$8(GistModalActivity gistModalActivity) {
        ActivityGistBinding activityGistBinding = gistModalActivity.binding;
        if (activityGistBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGistBinding = null;
        }
        activityGistBinding.gistView.stopLoading$messaginginapp_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finish$lambda$5(final GistModalActivity gistModalActivity) {
        AnimatorSet animatorSetCreateAnimationSetOutToBottom;
        ActivityGistBinding activityGistBinding = null;
        if (gistModalActivity.messagePosition == MessagePosition.TOP) {
            ModalAnimationUtil modalAnimationUtil = ModalAnimationUtil.INSTANCE;
            ActivityGistBinding activityGistBinding2 = gistModalActivity.binding;
            if (activityGistBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGistBinding = activityGistBinding2;
            }
            RelativeLayout modalGistViewLayout = activityGistBinding.modalGistViewLayout;
            Intrinsics.checkNotNullExpressionValue(modalGistViewLayout, "modalGistViewLayout");
            animatorSetCreateAnimationSetOutToBottom = modalAnimationUtil.createAnimationSetOutToTop(modalGistViewLayout);
        } else {
            ModalAnimationUtil modalAnimationUtil2 = ModalAnimationUtil.INSTANCE;
            ActivityGistBinding activityGistBinding3 = gistModalActivity.binding;
            if (activityGistBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGistBinding = activityGistBinding3;
            }
            RelativeLayout modalGistViewLayout2 = activityGistBinding.modalGistViewLayout;
            Intrinsics.checkNotNullExpressionValue(modalGistViewLayout2, "modalGistViewLayout");
            animatorSetCreateAnimationSetOutToBottom = modalAnimationUtil2.createAnimationSetOutToBottom(modalGistViewLayout2);
        }
        animatorSetCreateAnimationSetOutToBottom.start();
        animatorSetCreateAnimationSetOutToBottom.addListener(new Animator.AnimatorListener() { // from class: io.customer.messaginginapp.gist.presentation.GistModalActivity$finish$lambda$5$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ih.e.a.a(this.this$0.logger, "GistModelActivity finish animation completed", null, 2, null);
                this.this$0.finishImmediately();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishImmediately() {
        super.finish();
    }

    private final ModalMessageState.Displayed getCurrentMessageState() {
        InAppMessagingState state = getState();
        ModalMessageState modalMessageState = state != null ? state.getModalMessageState() : null;
        if (modalMessageState instanceof ModalMessageState.Displayed) {
            return (ModalMessageState.Displayed) modalMessageState;
        }
        return null;
    }

    private final InAppMessagingManager getInAppMessagingManager() {
        Object objM785constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(DIGraphMessagingInAppKt.getInAppMessagingManager(eh.d.f274883c));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m786isFailureimpl(objM785constructorimpl)) {
            objM785constructorimpl = null;
        }
        return (InAppMessagingManager) objM785constructorimpl;
    }

    private final InAppMessagingState getState() {
        InAppMessagingManager inAppMessagingManager = getInAppMessagingManager();
        if (inAppMessagingManager != null) {
            return inAppMessagingManager.getCurrentState();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeActivity() {
        getWindow().addFlags(16);
        ActivityGistBinding activityGistBindingInflate = ActivityGistBinding.inflate(getLayoutInflater());
        this.binding = activityGistBindingInflate;
        if (activityGistBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGistBindingInflate = null;
        }
        setContentView(activityGistBindingInflate.getRoot());
    }

    private final boolean isPersistentMessage(Message message) {
        GistProperties gistProperties;
        if (message == null) {
            ModalMessageState.Displayed currentMessageState = getCurrentMessageState();
            message = currentMessageState != null ? currentMessageState.getMessage() : null;
        }
        if (message == null || (gistProperties = message.getGistProperties()) == null) {
            return false;
        }
        return gistProperties.getPersistent();
    }

    static /* synthetic */ boolean isPersistentMessage$default(GistModalActivity gistModalActivity, Message message, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            message = null;
        }
        return gistModalActivity.isPersistentMessage(message);
    }

    private final void onMessageShown(final Message message) {
        ih.e.a.a(this.logger, "GistModelActivity Message Shown: " + message, null, 2, null);
        runOnUiThread(new Runnable() { // from class: io.customer.messaginginapp.gist.presentation.g
            @Override // java.lang.Runnable
            public final void run() {
                GistModalActivity.onMessageShown$lambda$7(this.f288357a, message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMessageShown$lambda$7(final GistModalActivity gistModalActivity, final Message message) {
        AnimatorSet animatorSetCreateAnimationSetInFromBottom;
        gistModalActivity.getWindow().clearFlags(16);
        ActivityGistBinding activityGistBinding = gistModalActivity.binding;
        ActivityGistBinding activityGistBinding2 = null;
        if (activityGistBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGistBinding = null;
        }
        activityGistBinding.modalGistViewLayout.setVisibility(0);
        String color = MessageOverlayColorParser.INSTANCE.parseColor(message.getGistProperties().getOverlayColor());
        if (color == null) {
            color = ModalAnimationUtil.FALLBACK_COLOR_STRING;
        }
        if (gistModalActivity.messagePosition == MessagePosition.TOP) {
            ModalAnimationUtil modalAnimationUtil = ModalAnimationUtil.INSTANCE;
            ActivityGistBinding activityGistBinding3 = gistModalActivity.binding;
            if (activityGistBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGistBinding2 = activityGistBinding3;
            }
            RelativeLayout modalGistViewLayout = activityGistBinding2.modalGistViewLayout;
            Intrinsics.checkNotNullExpressionValue(modalGistViewLayout, "modalGistViewLayout");
            animatorSetCreateAnimationSetInFromBottom = modalAnimationUtil.createAnimationSetInFromTop(modalGistViewLayout, color);
        } else {
            ModalAnimationUtil modalAnimationUtil2 = ModalAnimationUtil.INSTANCE;
            ActivityGistBinding activityGistBinding4 = gistModalActivity.binding;
            if (activityGistBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGistBinding2 = activityGistBinding4;
            }
            RelativeLayout modalGistViewLayout2 = activityGistBinding2.modalGistViewLayout;
            Intrinsics.checkNotNullExpressionValue(modalGistViewLayout2, "modalGistViewLayout");
            animatorSetCreateAnimationSetInFromBottom = modalAnimationUtil2.createAnimationSetInFromBottom(modalGistViewLayout2, color);
        }
        animatorSetCreateAnimationSetInFromBottom.start();
        animatorSetCreateAnimationSetInFromBottom.addListener(new Animator.AnimatorListener() { // from class: io.customer.messaginginapp.gist.presentation.GistModalActivity$onMessageShown$lambda$7$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                ih.e.a.a(this.this$0.logger, "GistModelActivity Message Animation Completed: " + message, null, 2, null);
                this.this$0.elapsedTimer.end();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewSizeChanged$lambda$9(GistModalActivity gistModalActivity, ViewGroup.LayoutParams layoutParams) {
        ActivityGistBinding activityGistBinding = gistModalActivity.binding;
        ActivityGistBinding activityGistBinding2 = null;
        if (activityGistBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGistBinding = null;
        }
        RelativeLayout relativeLayout = activityGistBinding.modalGistViewLayout;
        ActivityGistBinding activityGistBinding3 = gistModalActivity.binding;
        if (activityGistBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGistBinding2 = activityGistBinding3;
        }
        relativeLayout.updateViewLayout(activityGistBinding2.gistView, layoutParams);
    }

    private final p2 prepareActivity() {
        return k.f(p0.a(this), this.dispatchersProvider.a(), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupBackPressedCallback(Message message) {
        final boolean zIsPersistentMessage = isPersistentMessage(message);
        getOnBackPressedDispatcher().i(this, new i0(zIsPersistentMessage) { // from class: io.customer.messaginginapp.gist.presentation.GistModalActivity$setupBackPressedCallback$onBackPressedCallback$1
            @Override // androidx.activity.i0
            public void handleOnBackPressed() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupMessage(Message message) {
        ActivityGistBinding activityGistBinding = null;
        ih.e.a.a(this.logger, "GistModelActivity onCreate: " + message, null, 2, null);
        this.elapsedTimer.start("Displaying modal for message: " + message.getMessageId());
        ActivityGistBinding activityGistBinding2 = this.binding;
        if (activityGistBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGistBinding2 = null;
        }
        activityGistBinding2.gistView.setViewCallback$messaginginapp_release(this);
        ActivityGistBinding activityGistBinding3 = this.binding;
        if (activityGistBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityGistBinding3 = null;
        }
        activityGistBinding3.gistView.setup$messaginginapp_release(message);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.messagePosition.ordinal()];
        if (i10 == 1) {
            ActivityGistBinding activityGistBinding4 = this.binding;
            if (activityGistBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGistBinding = activityGistBinding4;
            }
            activityGistBinding.modalGistViewLayout.setVerticalGravity(16);
            return;
        }
        if (i10 == 2) {
            ActivityGistBinding activityGistBinding5 = this.binding;
            if (activityGistBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityGistBinding = activityGistBinding5;
            }
            activityGistBinding.modalGistViewLayout.setVerticalGravity(80);
            return;
        }
        if (i10 != 3) {
            throw new k0();
        }
        ActivityGistBinding activityGistBinding6 = this.binding;
        if (activityGistBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGistBinding = activityGistBinding6;
        }
        activityGistBinding.modalGistViewLayout.setVerticalGravity(48);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribeToAttributes() {
        InAppMessagingManager inAppMessagingManager = getInAppMessagingManager();
        if (inAppMessagingManager == null) {
            return;
        }
        this.attributesListenerJob.add(inAppMessagingManager.subscribeToAttribute(new Function1() { // from class: io.customer.messaginginapp.gist.presentation.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GistModalActivity.subscribeToAttributes$lambda$1((InAppMessagingState) obj);
            }
        }, new Function2() { // from class: io.customer.messaginginapp.gist.presentation.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(GistModalActivity.subscribeToAttributes$lambda$2((ModalMessageState) obj, (ModalMessageState) obj2));
            }
        }, new Function1() { // from class: io.customer.messaginginapp.gist.presentation.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GistModalActivity.subscribeToAttributes$lambda$3(this.f288351a, (ModalMessageState) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModalMessageState subscribeToAttributes$lambda$1(InAppMessagingState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getModalMessageState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeToAttributes$lambda$2(ModalMessageState old, ModalMessageState modalMessageState) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(modalMessageState, "new");
        if ((old instanceof ModalMessageState.Initial) && (modalMessageState instanceof ModalMessageState.Initial)) {
            return true;
        }
        if ((old instanceof ModalMessageState.Displayed) && (modalMessageState instanceof ModalMessageState.Displayed)) {
            return Intrinsics.areEqual(((ModalMessageState.Displayed) old).getMessage(), ((ModalMessageState.Displayed) modalMessageState).getMessage());
        }
        if ((old instanceof ModalMessageState.Dismissed) && (modalMessageState instanceof ModalMessageState.Dismissed)) {
            return Intrinsics.areEqual(((ModalMessageState.Dismissed) old).getMessage(), ((ModalMessageState.Dismissed) modalMessageState).getMessage());
        }
        if ((old instanceof ModalMessageState.Loading) && (modalMessageState instanceof ModalMessageState.Loading)) {
            return Intrinsics.areEqual(((ModalMessageState.Loading) old).getMessage(), ((ModalMessageState.Loading) modalMessageState).getMessage());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeToAttributes$lambda$3(GistModalActivity gistModalActivity, ModalMessageState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof ModalMessageState.Displayed) {
            gistModalActivity.onMessageShown(((ModalMessageState.Displayed) state).getMessage());
        }
        if (state instanceof ModalMessageState.Dismissed) {
            gistModalActivity.cleanUp();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object validateAndParseIntentExtras(kotlin.coroutines.d<? super ModalMessageExtras> dVar) {
        if (getInAppMessagingManager() == null) {
            ih.e.a.b(this.logger, "GistModalActivity onCreate: ModuleMessagingInApp not initialized", null, null, 6, null);
            return null;
        }
        ModalMessageParser modalMessageParser = this.modalMessageParser;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return modalMessageParser.parseExtras(intent, dVar);
    }

    @Override // android.app.Activity
    public void finish() {
        ih.e.a.a(this.logger, "GistModelActivity finish", null, 2, null);
        runOnUiThread(new Runnable() { // from class: io.customer.messaginginapp.gist.presentation.d
            @Override // java.lang.Runnable
            public final void run() {
                GistModalActivity.finish$lambda$5(this.f288352a);
            }
        });
    }

    @Override // lh.a
    @Nullable
    public String getScreenName() {
        return null;
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        prepareActivity();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    protected void onDestroy() {
        ih.e.a.a(this.logger, "GistModelActivity onDestroy", null, 2, null);
        Iterator<p2> it = this.attributesListenerJob.iterator();
        while (it.hasNext()) {
            p2.a.b(it.next(), null, 1, null);
        }
        ModalMessageState.Displayed currentMessageState = getCurrentMessageState();
        InAppMessagingManager inAppMessagingManager = getInAppMessagingManager();
        if (currentMessageState != null && inAppMessagingManager != null) {
            if (isPersistentMessage$default(this, null, 1, null)) {
                inAppMessagingManager.dispatch(new InAppMessagingAction.DismissMessage(currentMessageState.getMessage(), false, false, 4, null));
            } else {
                int i10 = (2 | 0) & 0;
                inAppMessagingManager.dispatch(new InAppMessagingAction.DismissMessage(currentMessageState.getMessage(), false, false, 6, null));
            }
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // io.customer.messaginginapp.ui.bridge.InAppMessageViewCallback
    public void onViewSizeChanged(int i10, int i11) {
        ActivityGistBinding activityGistBinding = null;
        ih.e.a.a(this.logger, "GistModelActivity Size changed: " + i10 + " x " + i11, null, 2, null);
        ActivityGistBinding activityGistBinding2 = this.binding;
        if (activityGistBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityGistBinding = activityGistBinding2;
        }
        final ViewGroup.LayoutParams layoutParams = activityGistBinding.gistView.getLayoutParams();
        layoutParams.height = i11;
        runOnUiThread(new Runnable() { // from class: io.customer.messaginginapp.gist.presentation.e
            @Override // java.lang.Runnable
            public final void run() {
                GistModalActivity.onViewSizeChanged$lambda$9(this.f288353a, layoutParams);
            }
        });
    }
}
