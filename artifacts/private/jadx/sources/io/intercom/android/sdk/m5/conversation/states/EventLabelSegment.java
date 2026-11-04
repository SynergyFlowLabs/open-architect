package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.models.Weight;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class EventLabelSegment {
    public static final int $stable = 0;

    @NotNull
    private final String text;

    @Nullable
    private final Weight weight;

    public EventLabelSegment(@NotNull String text, @Nullable Weight weight) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.weight = weight;
    }

    public static /* synthetic */ EventLabelSegment copy$default(EventLabelSegment eventLabelSegment, String str, Weight weight, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eventLabelSegment.text;
        }
        if ((i10 & 2) != 0) {
            weight = eventLabelSegment.weight;
        }
        return eventLabelSegment.copy(str, weight);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @Nullable
    public final Weight component2() {
        return this.weight;
    }

    @NotNull
    public final EventLabelSegment copy(@NotNull String text, @Nullable Weight weight) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new EventLabelSegment(text, weight);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventLabelSegment)) {
            return false;
        }
        EventLabelSegment eventLabelSegment = (EventLabelSegment) obj;
        return Intrinsics.areEqual(this.text, eventLabelSegment.text) && this.weight == eventLabelSegment.weight;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Weight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Weight weight = this.weight;
        return iHashCode + (weight == null ? 0 : weight.hashCode());
    }

    @NotNull
    public String toString() {
        return "EventLabelSegment(text=" + this.text + ", weight=" + this.weight + ')';
    }

    public /* synthetic */ EventLabelSegment(String str, Weight weight, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : weight);
    }
}
