package io.intercom.android.sdk.m5.navigation.transitions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@zj.c
public final class TransitionArgs implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<TransitionArgs> CREATOR = new Creator();

    @NotNull
    private final EnterTransitionStyle enter;

    @NotNull
    private final ExitTransitionStyle exit;

    @NotNull
    private final EnterTransitionStyle popEnter;

    @NotNull
    private final ExitTransitionStyle popExit;

    public static final class Creator implements Parcelable.Creator<TransitionArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitionArgs(EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()), EnterTransitionStyle.valueOf(parcel.readString()), ExitTransitionStyle.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransitionArgs[] newArray(int i10) {
            return new TransitionArgs[i10];
        }
    }

    public TransitionArgs() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TransitionArgs copy$default(TransitionArgs transitionArgs, EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enterTransitionStyle = transitionArgs.enter;
        }
        if ((i10 & 2) != 0) {
            exitTransitionStyle = transitionArgs.exit;
        }
        if ((i10 & 4) != 0) {
            enterTransitionStyle2 = transitionArgs.popEnter;
        }
        if ((i10 & 8) != 0) {
            exitTransitionStyle2 = transitionArgs.popExit;
        }
        return transitionArgs.copy(enterTransitionStyle, exitTransitionStyle, enterTransitionStyle2, exitTransitionStyle2);
    }

    @NotNull
    public final EnterTransitionStyle component1() {
        return this.enter;
    }

    @NotNull
    public final ExitTransitionStyle component2() {
        return this.exit;
    }

    @NotNull
    public final EnterTransitionStyle component3() {
        return this.popEnter;
    }

    @NotNull
    public final ExitTransitionStyle component4() {
        return this.popExit;
    }

    @NotNull
    public final TransitionArgs copy(@NotNull EnterTransitionStyle enter, @NotNull ExitTransitionStyle exit, @NotNull EnterTransitionStyle popEnter, @NotNull ExitTransitionStyle popExit) {
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(popEnter, "popEnter");
        Intrinsics.checkNotNullParameter(popExit, "popExit");
        return new TransitionArgs(enter, exit, popEnter, popExit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionArgs)) {
            return false;
        }
        TransitionArgs transitionArgs = (TransitionArgs) obj;
        if (this.enter == transitionArgs.enter && this.exit == transitionArgs.exit && this.popEnter == transitionArgs.popEnter && this.popExit == transitionArgs.popExit) {
            return true;
        }
        return false;
    }

    @NotNull
    public final EnterTransitionStyle getEnter() {
        return this.enter;
    }

    @NotNull
    public final ExitTransitionStyle getExit() {
        return this.exit;
    }

    @NotNull
    public final EnterTransitionStyle getPopEnter() {
        return this.popEnter;
    }

    @NotNull
    public final ExitTransitionStyle getPopExit() {
        return this.popExit;
    }

    public int hashCode() {
        return (((((this.enter.hashCode() * 31) + this.exit.hashCode()) * 31) + this.popEnter.hashCode()) * 31) + this.popExit.hashCode();
    }

    @NotNull
    public String toString() {
        String strEncode = Uri.encode(new com.google.gson.f().D(this));
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.enter.name());
        dest.writeString(this.exit.name());
        dest.writeString(this.popEnter.name());
        dest.writeString(this.popExit.name());
    }

    public TransitionArgs(@NotNull EnterTransitionStyle enter, @NotNull ExitTransitionStyle exit, @NotNull EnterTransitionStyle popEnter, @NotNull ExitTransitionStyle popExit) {
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(popEnter, "popEnter");
        Intrinsics.checkNotNullParameter(popExit, "popExit");
        this.enter = enter;
        this.exit = exit;
        this.popEnter = popEnter;
        this.popExit = popExit;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TransitionArgs(EnterTransitionStyle enterTransitionStyle, ExitTransitionStyle exitTransitionStyle, EnterTransitionStyle enterTransitionStyle2, ExitTransitionStyle exitTransitionStyle2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        enterTransitionStyle = (i10 & 1) != 0 ? EnterTransitionStyle.NULL : enterTransitionStyle;
        exitTransitionStyle = (i10 & 2) != 0 ? ExitTransitionStyle.NULL : exitTransitionStyle;
        this(enterTransitionStyle, exitTransitionStyle, (i10 & 4) != 0 ? enterTransitionStyle : enterTransitionStyle2, (i10 & 8) != 0 ? exitTransitionStyle : exitTransitionStyle2);
    }
}
