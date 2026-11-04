package androidx.work.impl.model;

import androidx.annotation.b1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.u(foreignKeys = {@androidx.room.a0(childColumns = {"work_spec_id"}, entity = v.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, primaryKeys = {"work_spec_id", "generation"})
@b1({b1.a.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "work_spec_id")
    @oj.f
    @NotNull
    public final String f76954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(defaultValue = com.facebook.appevents.p.f99189d0)
    private final int f76955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.room.i(name = "system_id")
    @oj.f
    public final int f76956c;

    public j(@NotNull String workSpecId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f76954a = workSpecId;
        this.f76955b = i10;
        this.f76956c = i11;
    }

    public static /* synthetic */ j e(j jVar, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = jVar.f76954a;
        }
        if ((i12 & 2) != 0) {
            i10 = jVar.f76955b;
        }
        if ((i12 & 4) != 0) {
            i11 = jVar.f76956c;
        }
        return jVar.d(str, i10, i11);
    }

    @NotNull
    public final String a() {
        return this.f76954a;
    }

    public final int b() {
        return this.f76955b;
    }

    public final int c() {
        return this.f76956c;
    }

    @NotNull
    public final j d(@NotNull String workSpecId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        return new j(workSpecId, i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f76954a, jVar.f76954a) && this.f76955b == jVar.f76955b && this.f76956c == jVar.f76956c;
    }

    public final int f() {
        return this.f76955b;
    }

    public int hashCode() {
        return (((this.f76954a.hashCode() * 31) + Integer.hashCode(this.f76955b)) * 31) + Integer.hashCode(this.f76956c);
    }

    @NotNull
    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f76954a + ", generation=" + this.f76955b + ", systemId=" + this.f76956c + ')';
    }
}
