package io.intercom.android.sdk.blocks.lib.models;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.messaging.e;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class ListOption {
    public static final int $stable = 0;

    @c("archived")
    private final boolean archived;

    @c("description")
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @c("id")
    @NotNull
    private final String f291541id;

    @c(e.f.f123534d)
    @NotNull
    private final String label;

    public ListOption(@NotNull String label, boolean z10, @NotNull String id2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.label = label;
        this.archived = z10;
        this.f291541id = id2;
        this.description = str;
    }

    public static /* synthetic */ ListOption copy$default(ListOption listOption, String str, boolean z10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = listOption.label;
        }
        if ((i10 & 2) != 0) {
            z10 = listOption.archived;
        }
        if ((i10 & 4) != 0) {
            str2 = listOption.f291541id;
        }
        if ((i10 & 8) != 0) {
            str3 = listOption.description;
        }
        return listOption.copy(str, z10, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.label;
    }

    public final boolean component2() {
        return this.archived;
    }

    @NotNull
    public final String component3() {
        return this.f291541id;
    }

    @Nullable
    public final String component4() {
        return this.description;
    }

    @NotNull
    public final ListOption copy(@NotNull String label, boolean z10, @NotNull String id2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new ListOption(label, z10, id2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListOption)) {
            return false;
        }
        ListOption listOption = (ListOption) obj;
        return Intrinsics.areEqual(this.label, listOption.label) && this.archived == listOption.archived && Intrinsics.areEqual(this.f291541id, listOption.f291541id) && Intrinsics.areEqual(this.description, listOption.description);
    }

    public final boolean getArchived() {
        return this.archived;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.f291541id;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = ((((this.label.hashCode() * 31) + Boolean.hashCode(this.archived)) * 31) + this.f291541id.hashCode()) * 31;
        String str = this.description;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ListOption(label=" + this.label + ", archived=" + this.archived + ", id=" + this.f291541id + ", description=" + this.description + ')';
    }

    public /* synthetic */ ListOption(String str, boolean z10, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, str2, (i10 & 8) != 0 ? null : str3);
    }
}
