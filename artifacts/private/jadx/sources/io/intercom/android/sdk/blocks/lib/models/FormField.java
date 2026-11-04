package io.intercom.android.sdk.blocks.lib.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.sentry.rrweb.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class FormField {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @c("id")
    @NotNull
    private final String f291540id;

    @c("identifier")
    @Nullable
    private final String identifier;

    @c("is_controlling_attribute")
    private final boolean isControllingAttribute;

    @c("name")
    @NotNull
    private final String name;

    @c(h.f306695g)
    @Nullable
    private final Options options;

    @c("required")
    private final boolean required;

    @c("type")
    @NotNull
    private final String type;

    @c("value")
    @Nullable
    private final String value;

    public FormField(@NotNull String id2, @NotNull String name, @Nullable String str, @NotNull String type, boolean z10, @Nullable Options options, @Nullable String str2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f291540id = id2;
        this.name = name;
        this.value = str;
        this.type = type;
        this.required = z10;
        this.options = options;
        this.identifier = str2;
        this.isControllingAttribute = z11;
    }

    public static /* synthetic */ FormField copy$default(FormField formField, String str, String str2, String str3, String str4, boolean z10, Options options, String str5, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = formField.f291540id;
        }
        if ((i10 & 2) != 0) {
            str2 = formField.name;
        }
        if ((i10 & 4) != 0) {
            str3 = formField.value;
        }
        if ((i10 & 8) != 0) {
            str4 = formField.type;
        }
        if ((i10 & 16) != 0) {
            z10 = formField.required;
        }
        if ((i10 & 32) != 0) {
            options = formField.options;
        }
        if ((i10 & 64) != 0) {
            str5 = formField.identifier;
        }
        if ((i10 & 128) != 0) {
            z11 = formField.isControllingAttribute;
        }
        String str6 = str5;
        boolean z12 = z11;
        boolean z13 = z10;
        Options options2 = options;
        return formField.copy(str, str2, str3, str4, z13, options2, str6, z12);
    }

    @NotNull
    public final String component1() {
        return this.f291540id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.value;
    }

    @NotNull
    public final String component4() {
        return this.type;
    }

    public final boolean component5() {
        return this.required;
    }

    @Nullable
    public final Options component6() {
        return this.options;
    }

    @Nullable
    public final String component7() {
        return this.identifier;
    }

    public final boolean component8() {
        return this.isControllingAttribute;
    }

    @NotNull
    public final FormField copy(@NotNull String id2, @NotNull String name, @Nullable String str, @NotNull String type, boolean z10, @Nullable Options options, @Nullable String str2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new FormField(id2, name, str, type, z10, options, str2, z11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormField)) {
            return false;
        }
        FormField formField = (FormField) obj;
        return Intrinsics.areEqual(this.f291540id, formField.f291540id) && Intrinsics.areEqual(this.name, formField.name) && Intrinsics.areEqual(this.value, formField.value) && Intrinsics.areEqual(this.type, formField.type) && this.required == formField.required && Intrinsics.areEqual(this.options, formField.options) && Intrinsics.areEqual(this.identifier, formField.identifier) && this.isControllingAttribute == formField.isControllingAttribute;
    }

    @NotNull
    public final String getId() {
        return this.f291540id;
    }

    @Nullable
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Options getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.f291540id.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.value;
        int iHashCode2 = 0;
        int iHashCode3 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.required)) * 31;
        Options options = this.options;
        int iHashCode4 = (iHashCode3 + (options == null ? 0 : options.hashCode())) * 31;
        String str2 = this.identifier;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return ((iHashCode4 + iHashCode2) * 31) + Boolean.hashCode(this.isControllingAttribute);
    }

    public final boolean isControllingAttribute() {
        return this.isControllingAttribute;
    }

    @NotNull
    public String toString() {
        return "FormField(id=" + this.f291540id + ", name=" + this.name + ", value=" + this.value + ", type=" + this.type + ", required=" + this.required + ", options=" + this.options + ", identifier=" + this.identifier + ", isControllingAttribute=" + this.isControllingAttribute + ')';
    }

    public /* synthetic */ FormField(String str, String str2, String str3, String str4, boolean z10, Options options, String str5, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, str4, z10, (i10 & 32) != 0 ? null : options, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? false : z11);
    }
}
