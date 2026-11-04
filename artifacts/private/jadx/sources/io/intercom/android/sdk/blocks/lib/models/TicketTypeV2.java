package io.intercom.android.sdk.blocks.lib.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class TicketTypeV2 {
    public static final int $stable = 8;

    @c("form_fields")
    @NotNull
    private final List<FormField> formFields;

    @c("name")
    @NotNull
    private final String name;

    @c(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final int ticketTypeId;

    public TicketTypeV2(int i10, @NotNull String name, @NotNull List<FormField> formFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        this.ticketTypeId = i10;
        this.name = name;
        this.formFields = formFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketTypeV2 copy$default(TicketTypeV2 ticketTypeV2, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = ticketTypeV2.ticketTypeId;
        }
        if ((i11 & 2) != 0) {
            str = ticketTypeV2.name;
        }
        if ((i11 & 4) != 0) {
            list = ticketTypeV2.formFields;
        }
        return ticketTypeV2.copy(i10, str, list);
    }

    public final int component1() {
        return this.ticketTypeId;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final List<FormField> component3() {
        return this.formFields;
    }

    @NotNull
    public final TicketTypeV2 copy(int i10, @NotNull String name, @NotNull List<FormField> formFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        return new TicketTypeV2(i10, name, formFields);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketTypeV2)) {
            return false;
        }
        TicketTypeV2 ticketTypeV2 = (TicketTypeV2) obj;
        return this.ticketTypeId == ticketTypeV2.ticketTypeId && Intrinsics.areEqual(this.name, ticketTypeV2.name) && Intrinsics.areEqual(this.formFields, ticketTypeV2.formFields);
    }

    @NotNull
    public final List<FormField> getFormFields() {
        return this.formFields;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.ticketTypeId) * 31) + this.name.hashCode()) * 31) + this.formFields.hashCode();
    }

    @NotNull
    public String toString() {
        return "TicketTypeV2(ticketTypeId=" + this.ticketTypeId + ", name=" + this.name + ", formFields=" + this.formFields + ')';
    }
}
