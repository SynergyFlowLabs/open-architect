package androidx.work.impl.model;

import androidx.annotation.b1;
import androidx.room.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.u(foreignKeys = {@androidx.room.a0(childColumns = {"work_spec_id"}, entity = v.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@h0({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
@b1({b1.a.LIBRARY_GROUP})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "name")
    @NotNull
    private final String f76966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "work_spec_id")
    @NotNull
    private final String f76967b;

    public o(@NotNull String name, @NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f76966a = name;
        this.f76967b = workSpecId;
    }

    @NotNull
    public final String a() {
        return this.f76966a;
    }

    @NotNull
    public final String b() {
        return this.f76967b;
    }
}
