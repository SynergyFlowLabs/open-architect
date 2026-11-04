package io.intercom.android.sdk.m5.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nIntercomPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomPrimaryButton.kt\nio/intercom/android/sdk/m5/components/IntercomPrimaryButton\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,131:1\n85#2:132\n117#2,2:133\n85#2:135\n117#2,2:136\n85#2:138\n117#2,2:139\n*S KotlinDebug\n*F\n+ 1 IntercomPrimaryButton.kt\nio/intercom/android/sdk/m5/components/IntercomPrimaryButton\n*L\n99#1:132\n99#1:133,2\n100#1:135\n100#1:136,2\n101#1:138\n101#1:139,2\n*E\n"})
public final class IntercomPrimaryButton extends androidx.compose.ui.platform.a {
    public static final int $stable = 0;

    @NotNull
    private final androidx.compose.runtime.n3 onClick$delegate;

    @NotNull
    private final androidx.compose.runtime.n3 text$delegate;

    @NotNull
    private final androidx.compose.runtime.n3 trailingIconId$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public IntercomPrimaryButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(IntercomPrimaryButton tmp0_rcvr, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(tmp0_rcvr, "$tmp0_rcvr");
        tmp0_rcvr.Content(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.platform.a
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(346924157);
        if ((i10 & 14) == 0) {
            i11 = (c0VarR.D(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomPrimaryButtonKt.IntercomPrimaryButton(getText(), null, getTrailingIconId(), getOnClick(), c0VarR, 0, 2);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.components.e2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IntercomPrimaryButton.Content$lambda$1(this.f291738a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return (Function0) this.onClick$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getText() {
        return (String) this.text$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Integer getTrailingIconId() {
        return (Integer) this.trailingIconId$delegate.getValue();
    }

    public final void setOnClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClick$delegate.setValue(function0);
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text$delegate.setValue(str);
    }

    public final void setTrailingIconId(@Nullable Integer num) {
        this.trailingIconId$delegate.setValue(num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public IntercomPrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public IntercomPrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.text$delegate = d7.g("", null, 2, null);
        this.onClick$delegate = d7.g(new Function0() { // from class: io.intercom.android.sdk.m5.components.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.f312394a;
            }
        }, null, 2, null);
        this.trailingIconId$delegate = d7.g(null, null, 2, null);
    }
}
