package com.superwall.sdk.models.assignment;

import java.util.ArrayList;
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
public final class AssignmentPostback {

    @NotNull
    private final List<Assignment> assignments;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(Assignment$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AssignmentPostback create(@NotNull ConfirmableAssignment confirmableAssignment) {
            Intrinsics.checkNotNullParameter(confirmableAssignment, "confirmableAssignment");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Assignment(confirmableAssignment.getExperimentId(), confirmableAssignment.getVariant().getId()));
            return new AssignmentPostback(arrayList);
        }

        @NotNull
        public final KSerializer<AssignmentPostback> serializer() {
            return AssignmentPostback$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AssignmentPostback(int i10, List list, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, AssignmentPostback$$serializer.INSTANCE.getDescriptor());
        }
        this.assignments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssignmentPostback copy$default(AssignmentPostback assignmentPostback, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = assignmentPostback.assignments;
        }
        return assignmentPostback.copy(list);
    }

    @NotNull
    public final List<Assignment> component1() {
        return this.assignments;
    }

    @NotNull
    public final AssignmentPostback copy(@NotNull List<Assignment> assignments) {
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        return new AssignmentPostback(assignments);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AssignmentPostback) && Intrinsics.areEqual(this.assignments, ((AssignmentPostback) obj).assignments);
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
        return "AssignmentPostback(assignments=" + this.assignments + ")";
    }

    public AssignmentPostback(@NotNull List<Assignment> assignments) {
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        this.assignments = assignments;
    }
}
