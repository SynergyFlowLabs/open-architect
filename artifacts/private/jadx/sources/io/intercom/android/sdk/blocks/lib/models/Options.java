package io.intercom.android.sdk.blocks.lib.models;

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
public final class Options {
    public static final int $stable = 8;

    @c("accept")
    @NotNull
    private final String accept;

    @c("list_options")
    @NotNull
    private final List<ListOption> listOptions;

    @c("multiline")
    private final boolean multiline;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Options() {
        this(false, null, null, 7, null);
        boolean z10 = false | false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Options copy$default(Options options, boolean z10, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = options.multiline;
        }
        if ((i10 & 2) != 0) {
            list = options.listOptions;
        }
        if ((i10 & 4) != 0) {
            str = options.accept;
        }
        return options.copy(z10, list, str);
    }

    public final boolean component1() {
        return this.multiline;
    }

    @NotNull
    public final List<ListOption> component2() {
        return this.listOptions;
    }

    @NotNull
    public final String component3() {
        return this.accept;
    }

    @NotNull
    public final Options copy(boolean z10, @NotNull List<ListOption> listOptions, @NotNull String accept) {
        Intrinsics.checkNotNullParameter(listOptions, "listOptions");
        Intrinsics.checkNotNullParameter(accept, "accept");
        return new Options(z10, listOptions, accept);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return this.multiline == options.multiline && Intrinsics.areEqual(this.listOptions, options.listOptions) && Intrinsics.areEqual(this.accept, options.accept);
    }

    @NotNull
    public final String getAccept() {
        return this.accept;
    }

    @NotNull
    public final List<ListOption> getListOptions() {
        return this.listOptions;
    }

    public final boolean getMultiline() {
        return this.multiline;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.multiline) * 31) + this.listOptions.hashCode()) * 31) + this.accept.hashCode();
    }

    @NotNull
    public String toString() {
        return "Options(multiline=" + this.multiline + ", listOptions=" + this.listOptions + ", accept=" + this.accept + ')';
    }

    public Options(boolean z10, @NotNull List<ListOption> listOptions, @NotNull String accept) {
        Intrinsics.checkNotNullParameter(listOptions, "listOptions");
        Intrinsics.checkNotNullParameter(accept, "accept");
        this.multiline = z10;
        this.listOptions = listOptions;
        this.accept = accept;
    }

    public /* synthetic */ Options(boolean z10, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? "" : str);
    }
}
