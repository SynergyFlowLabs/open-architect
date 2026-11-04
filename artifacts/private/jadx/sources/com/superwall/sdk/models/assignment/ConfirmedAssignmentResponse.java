package com.superwall.sdk.models.assignment;

import com.superwall.sdk.models.SerializableEntity;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class ConfirmedAssignmentResponse implements SerializableEntity {

    @NotNull
    private final List<Assignment> assignments;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(Assignment$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ConfirmedAssignmentResponse> serializer() {
            return ConfirmedAssignmentResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConfirmedAssignmentResponse(int i10, List list, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, ConfirmedAssignmentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.assignments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfirmedAssignmentResponse copy$default(ConfirmedAssignmentResponse confirmedAssignmentResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = confirmedAssignmentResponse.assignments;
        }
        return confirmedAssignmentResponse.copy(list);
    }

    @NotNull
    public final List<Assignment> component1() {
        return this.assignments;
    }

    @NotNull
    public final ConfirmedAssignmentResponse copy(@NotNull List<Assignment> assignments) {
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        return new ConfirmedAssignmentResponse(assignments);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmedAssignmentResponse) && Intrinsics.areEqual(this.assignments, ((ConfirmedAssignmentResponse) obj).assignments);
    }

    @NotNull
    public final List<Assignment> getAssignments() {
        return this.assignments;
    }

    public int hashCode() {
        return this.assignments.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConfirmedAssignmentResponse(assignments=" + this.assignments + ")";
    }

    public ConfirmedAssignmentResponse(@NotNull List<Assignment> assignments) {
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        this.assignments = assignments;
    }
}
