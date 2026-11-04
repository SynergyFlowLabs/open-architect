package androidx.work.impl.model;

import androidx.annotation.b1;
import androidx.room.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.u(foreignKeys = {@androidx.room.a0(childColumns = {"work_spec_id"}, entity = v.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @androidx.room.a0(childColumns = {"prerequisite_id"}, entity = v.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@h0({"work_spec_id"}), @h0({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@b1({b1.a.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "work_spec_id")
    @NotNull
    private final String f76904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "prerequisite_id")
    @NotNull
    private final String f76905b;

    public a(@NotNull String workSpecId, @NotNull String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.f76904a = workSpecId;
        this.f76905b = prerequisiteId;
    }

    @NotNull
    public final String a() {
        return this.f76905b;
    }

    @NotNull
    public final String b() {
        return this.f76904a;
    }
}
