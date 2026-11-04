package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import gk.d;
import io.sentry.a8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@d
public final class Form implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Form> CREATOR = new Creator();

    @c(a8.b.f303905f)
    @NotNull
    private final List<Attribute> attributes;

    @c("disabled")
    private final boolean disabled;

    @c("type")
    @NotNull
    private final String type;

    public static final class Creator implements Parcelable.Creator<Form> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Attribute.CREATOR.createFromParcel(parcel));
            }
            return new Form(string, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form[] newArray(int i10) {
            return new Form[i10];
        }
    }

    public Form(@NotNull String type, @NotNull List<Attribute> attributes, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
        this.disabled = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Form copy$default(Form form, String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = form.type;
        }
        if ((i10 & 2) != 0) {
            list = form.attributes;
        }
        if ((i10 & 4) != 0) {
            z10 = form.disabled;
        }
        return form.copy(str, list, z10);
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final List<Attribute> component2() {
        return this.attributes;
    }

    public final boolean component3() {
        return this.disabled;
    }

    @NotNull
    public final Form copy(@NotNull String type, @NotNull List<Attribute> attributes, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new Form(type, attributes, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Form)) {
            return false;
        }
        Form form = (Form) obj;
        return Intrinsics.areEqual(this.type, form.type) && Intrinsics.areEqual(this.attributes, form.attributes) && this.disabled == form.disabled;
    }

    @NotNull
    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.attributes.hashCode()) * 31) + Boolean.hashCode(this.disabled);
    }

    @NotNull
    public String toString() {
        return "Form(type=" + this.type + ", attributes=" + this.attributes + ", disabled=" + this.disabled + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        List<Attribute> list = this.attributes;
        dest.writeInt(list.size());
        Iterator<Attribute> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
        dest.writeInt(this.disabled ? 1 : 0);
    }
}
