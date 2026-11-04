package com.planner5d.library.database.model.project;

import androidx.annotation.m1;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.planner5d.library.database.model.SynchronizedModel;
import com.planner5d.library.database.model.i;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yc.b;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = ProjectEntry.tableName)
@SourceDebugExtension({"SMAP\nProject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Project.kt\ncom/planner5d/library/database/model/project/Project\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
public final class Project extends SynchronizedModel implements i, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @f
    public boolean f154194a;

    @f
    @Column(name = "ai_recognized")
    @Nullable
    public Boolean aiRecognized;

    @f
    @Column(name = "contest_id")
    @Nullable
    public Long contestId;

    @f
    @Column(name = "contest_status")
    public int contestStatus;

    @f
    @Column(name = "data")
    @Nullable
    public byte[] data;

    @f
    @Column(name = "date_updated")
    @Nullable
    public Date dateUpdated;

    @f
    @Column(name = "date_updated_locally")
    @Nullable
    public Date dateUpdatedLocally;

    @f
    @Column(name = "folder")
    public long folderId;

    @f
    @Column(name = "modified_locally_data")
    public boolean modifiedLocallyData;

    @f
    @Column(name = "project_id")
    @Nullable
    public Long projectId;

    @f
    @Column(name = "title")
    @Nullable
    public String title;

    @Column(name = "uri_thumbnail")
    @Nullable
    private String uriThumbnail;

    @m1
    public Project() {
    }

    public final boolean A() {
        return !D();
    }

    @NotNull
    public final a B() {
        return a.f154195b.a(this.contestStatus);
    }

    @Nullable
    public final String C() {
        return this.uriThumbnail;
    }

    public final boolean D() {
        return B() != a.Unknown;
    }

    public final boolean E() {
        return B() == a.Submitted;
    }

    public final void F(boolean z10) {
        this.modifiedLocally = true;
        if (z10) {
            this.modifiedLocallyData = true;
        }
        this.dateUpdatedLocally = new Date();
    }

    public final void G(@Nullable String str) {
        this.uriThumbnail = str;
    }

    @Override // com.activeandroid.Model
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        Long id2 = getId();
        if (id2 == null || obj == null || !Intrinsics.areEqual(obj.getClass(), Project.class)) {
            return false;
        }
        Project project = (Project) obj;
        return Intrinsics.areEqual(id2, project.getId()) && project.getVersion() == getVersion();
    }

    public final boolean h() {
        return this.uid != null;
    }

    @Override // com.activeandroid.Model
    public int hashCode() {
        return (Objects.hashCode(getId()) * 31) + getVersion();
    }

    @Override // com.planner5d.library.database.model.i
    @Nullable
    public Date k() {
        return this.dateUpdated;
    }

    @Nullable
    public final Date m() {
        Date date = this.dateUpdatedLocally;
        return date == null ? this.dateUpdated : date;
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        Long id2 = getId();
        return id2 != null && obj != null && Intrinsics.areEqual(obj.getClass(), Project.class) && Intrinsics.areEqual(id2, ((Project) obj).getId());
    }

    @Override // com.planner5d.library.database.model.i
    public void q(@Nullable Date date) {
        this.dateUpdated = date;
    }

    @Override // com.planner5d.library.database.model.SynchronizedModel
    public void s() {
        super.s();
        this.modifiedLocallyData = false;
    }

    @Override // com.planner5d.library.database.model.SynchronizedModel
    @NotNull
    public String v() {
        return "hash";
    }

    public final boolean x() {
        return true;
    }

    public final boolean y() {
        return !D();
    }

    public final boolean z() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @m1
    public Project(@NotNull Project model) {
        super(model);
        Intrinsics.checkNotNullParameter(model, "model");
        this.title = model.title;
        this.folderId = model.folderId;
        this.contestId = model.contestId;
        this.contestStatus = model.contestStatus;
        Date date = model.dateUpdated;
        this.dateUpdated = date != null ? new Date(date.getTime()) : null;
        Date date2 = model.dateUpdatedLocally;
        this.dateUpdatedLocally = date2 != null ? new Date(date2.getTime()) : null;
        byte[] bArr = model.data;
        this.data = bArr != null ? (byte[]) bArr.clone() : null;
        this.modifiedLocally = model.modifiedLocally;
        this.modifiedLocallyData = model.modifiedLocallyData;
        this.projectId = model.projectId;
        this.aiRecognized = model.aiRecognized;
    }
}
