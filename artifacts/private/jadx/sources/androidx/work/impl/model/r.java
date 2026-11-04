package androidx.work.impl.model;

import androidx.annotation.b1;
import androidx.room.u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.u(foreignKeys = {@androidx.room.a0(childColumns = {"work_spec_id"}, entity = v.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@b1({b1.a.LIBRARY_GROUP})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "work_spec_id")
    @u0
    @NotNull
    private final String f76971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "progress")
    @NotNull
    private final androidx.work.h f76972b;

    public r(@NotNull String workSpecId, @NotNull androidx.work.h progress) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f76971a = workSpecId;
        this.f76972b = progress;
    }

    @NotNull
    public final androidx.work.h a() {
        return this.f76972b;
    }

    @NotNull
    public final String b() {
        return this.f76971a;
    }
}
