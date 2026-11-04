package androidx.work.impl.model;

import androidx.annotation.b1;
import androidx.room.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.u(foreignKeys = {@androidx.room.a0(childColumns = {"work_spec_id"}, entity = v.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@h0({"work_spec_id"})}, primaryKeys = {"tag", "work_spec_id"})
@b1({b1.a.LIBRARY_GROUP})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "tag")
    @NotNull
    private final String f76906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "work_spec_id")
    @NotNull
    private final String f76907b;

    public a0(@NotNull String tag, @NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f76906a = tag;
        this.f76907b = workSpecId;
    }

    @NotNull
    public final String a() {
        return this.f76906a;
    }

    @NotNull
    public final String b() {
        return this.f76907b;
    }
}
