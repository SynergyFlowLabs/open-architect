package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class OpenConfig {
    public static final int $stable = 8;

    @c("form")
    @NotNull
    private final OpenForm form;

    @c("open_to")
    @NotNull
    private final OpenToSpace openTo;

    @c("spaces")
    @NotNull
    private final List<Space> spaces;

    public OpenConfig() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenConfig copy$default(OpenConfig openConfig, OpenToSpace openToSpace, List list, OpenForm openForm, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            openToSpace = openConfig.openTo;
        }
        if ((i10 & 2) != 0) {
            list = openConfig.spaces;
        }
        if ((i10 & 4) != 0) {
            openForm = openConfig.form;
        }
        return openConfig.copy(openToSpace, list, openForm);
    }

    @NotNull
    public final OpenToSpace component1() {
        return this.openTo;
    }

    @NotNull
    public final List<Space> component2() {
        return this.spaces;
    }

    @NotNull
    public final OpenForm component3() {
        return this.form;
    }

    @NotNull
    public final OpenConfig copy(@NotNull OpenToSpace openTo, @NotNull List<Space> spaces, @NotNull OpenForm form) {
        Intrinsics.checkNotNullParameter(openTo, "openTo");
        Intrinsics.checkNotNullParameter(spaces, "spaces");
        Intrinsics.checkNotNullParameter(form, "form");
        return new OpenConfig(openTo, spaces, form);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenConfig)) {
            return false;
        }
        OpenConfig openConfig = (OpenConfig) obj;
        return this.openTo == openConfig.openTo && Intrinsics.areEqual(this.spaces, openConfig.spaces) && this.form == openConfig.form;
    }

    @NotNull
    public final OpenForm getForm() {
        return this.form;
    }

    @NotNull
    public final OpenToSpace getOpenTo() {
        return this.openTo;
    }

    @NotNull
    public final List<Space> getSpaces() {
        return this.spaces;
    }

    public int hashCode() {
        return (((this.openTo.hashCode() * 31) + this.spaces.hashCode()) * 31) + this.form.hashCode();
    }

    @NotNull
    public String toString() {
        return "OpenConfig(openTo=" + this.openTo + ", spaces=" + this.spaces + ", form=" + this.form + ')';
    }

    public OpenConfig(@NotNull OpenToSpace openTo, @NotNull List<Space> spaces, @NotNull OpenForm form) {
        Intrinsics.checkNotNullParameter(openTo, "openTo");
        Intrinsics.checkNotNullParameter(spaces, "spaces");
        Intrinsics.checkNotNullParameter(form, "form");
        this.openTo = openTo;
        this.spaces = spaces;
        this.form = form;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ OpenConfig(OpenToSpace openToSpace, List list, OpenForm openForm, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? OpenToSpace.HOME : openToSpace, (i10 & 2) != 0 ? CollectionsKt.listOf(new Space(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0)) : list, (i10 & 4) != 0 ? OpenForm.DEFAULT : openForm);
    }
}
