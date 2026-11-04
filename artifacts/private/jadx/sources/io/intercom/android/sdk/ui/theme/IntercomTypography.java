package io.intercom.android.sdk.ui.theme;

import androidx.compose.runtime.o2;
import androidx.compose.ui.text.y3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@o2
public final class IntercomTypography {
    public static final int $stable = 0;

    @NotNull
    private final y3 type01;

    @NotNull
    private final y3 type02;

    @NotNull
    private final y3 type03;

    @NotNull
    private final y3 type04;

    @NotNull
    private final y3 type04Point5;

    @NotNull
    private final y3 type04SemiBold;

    @NotNull
    private final y3 type05;

    public IntercomTypography(@NotNull y3 type01, @NotNull y3 type02, @NotNull y3 type03, @NotNull y3 type04, @NotNull y3 type04SemiBold, @NotNull y3 type04Point5, @NotNull y3 type05) {
        Intrinsics.checkNotNullParameter(type01, "type01");
        Intrinsics.checkNotNullParameter(type02, "type02");
        Intrinsics.checkNotNullParameter(type03, "type03");
        Intrinsics.checkNotNullParameter(type04, "type04");
        Intrinsics.checkNotNullParameter(type04SemiBold, "type04SemiBold");
        Intrinsics.checkNotNullParameter(type04Point5, "type04Point5");
        Intrinsics.checkNotNullParameter(type05, "type05");
        this.type01 = type01;
        this.type02 = type02;
        this.type03 = type03;
        this.type04 = type04;
        this.type04SemiBold = type04SemiBold;
        this.type04Point5 = type04Point5;
        this.type05 = type05;
    }

    public static /* synthetic */ IntercomTypography copy$default(IntercomTypography intercomTypography, y3 y3Var, y3 y3Var2, y3 y3Var3, y3 y3Var4, y3 y3Var5, y3 y3Var6, y3 y3Var7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y3Var = intercomTypography.type01;
        }
        if ((i10 & 2) != 0) {
            y3Var2 = intercomTypography.type02;
        }
        if ((i10 & 4) != 0) {
            y3Var3 = intercomTypography.type03;
        }
        if ((i10 & 8) != 0) {
            y3Var4 = intercomTypography.type04;
        }
        if ((i10 & 16) != 0) {
            y3Var5 = intercomTypography.type04SemiBold;
        }
        if ((i10 & 32) != 0) {
            y3Var6 = intercomTypography.type04Point5;
        }
        if ((i10 & 64) != 0) {
            y3Var7 = intercomTypography.type05;
        }
        y3 y3Var8 = y3Var6;
        y3 y3Var9 = y3Var7;
        y3 y3Var10 = y3Var5;
        y3 y3Var11 = y3Var3;
        return intercomTypography.copy(y3Var, y3Var2, y3Var11, y3Var4, y3Var10, y3Var8, y3Var9);
    }

    @NotNull
    public final y3 component1() {
        return this.type01;
    }

    @NotNull
    public final y3 component2() {
        return this.type02;
    }

    @NotNull
    public final y3 component3() {
        return this.type03;
    }

    @NotNull
    public final y3 component4() {
        return this.type04;
    }

    @NotNull
    public final y3 component5() {
        return this.type04SemiBold;
    }

    @NotNull
    public final y3 component6() {
        return this.type04Point5;
    }

    @NotNull
    public final y3 component7() {
        return this.type05;
    }

    @NotNull
    public final IntercomTypography copy(@NotNull y3 type01, @NotNull y3 type02, @NotNull y3 type03, @NotNull y3 type04, @NotNull y3 type04SemiBold, @NotNull y3 type04Point5, @NotNull y3 type05) {
        Intrinsics.checkNotNullParameter(type01, "type01");
        Intrinsics.checkNotNullParameter(type02, "type02");
        Intrinsics.checkNotNullParameter(type03, "type03");
        Intrinsics.checkNotNullParameter(type04, "type04");
        Intrinsics.checkNotNullParameter(type04SemiBold, "type04SemiBold");
        Intrinsics.checkNotNullParameter(type04Point5, "type04Point5");
        Intrinsics.checkNotNullParameter(type05, "type05");
        return new IntercomTypography(type01, type02, type03, type04, type04SemiBold, type04Point5, type05);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomTypography)) {
            return false;
        }
        IntercomTypography intercomTypography = (IntercomTypography) obj;
        return Intrinsics.areEqual(this.type01, intercomTypography.type01) && Intrinsics.areEqual(this.type02, intercomTypography.type02) && Intrinsics.areEqual(this.type03, intercomTypography.type03) && Intrinsics.areEqual(this.type04, intercomTypography.type04) && Intrinsics.areEqual(this.type04SemiBold, intercomTypography.type04SemiBold) && Intrinsics.areEqual(this.type04Point5, intercomTypography.type04Point5) && Intrinsics.areEqual(this.type05, intercomTypography.type05);
    }

    @NotNull
    public final y3 getType01() {
        return this.type01;
    }

    @NotNull
    public final y3 getType02() {
        return this.type02;
    }

    @NotNull
    public final y3 getType03() {
        return this.type03;
    }

    @NotNull
    public final y3 getType04() {
        return this.type04;
    }

    @NotNull
    public final y3 getType04Point5() {
        return this.type04Point5;
    }

    @NotNull
    public final y3 getType04SemiBold() {
        return this.type04SemiBold;
    }

    @NotNull
    public final y3 getType05() {
        return this.type05;
    }

    public int hashCode() {
        return (((((((((((this.type01.hashCode() * 31) + this.type02.hashCode()) * 31) + this.type03.hashCode()) * 31) + this.type04.hashCode()) * 31) + this.type04SemiBold.hashCode()) * 31) + this.type04Point5.hashCode()) * 31) + this.type05.hashCode();
    }

    @NotNull
    public String toString() {
        return "IntercomTypography(type01=" + this.type01 + ", type02=" + this.type02 + ", type03=" + this.type03 + ", type04=" + this.type04 + ", type04SemiBold=" + this.type04SemiBold + ", type04Point5=" + this.type04Point5 + ", type05=" + this.type05 + ')';
    }
}
