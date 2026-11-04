package com.planner5d.library.database.model;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Table(name = "projects_revisions")
public final class ProjectRevision extends Model {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Integer f154085a;

    @Column(name = "data")
    @Nullable
    private byte[] data;

    @Column(name = "date_created")
    @Nullable
    private Date dateCreated;

    @Column(name = "project_id")
    private long projectId;

    @Column(name = "source")
    private int source = a.Local.n();

    @Column(name = "type")
    private int type = b.Periodic.n();

    public enum a {
        Local(0),
        Remote(1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f154089e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f154090a;

        a(int i10) {
            this.f154090a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f154089e;
        }

        public final int n() {
            return this.f154090a;
        }
    }

    public enum b {
        PendingConflict(0),
        ResolvedConflict(1),
        Periodic(2);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f154095f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f154096a;

        b(int i10) {
            this.f154096a = i10;
        }

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f154095f;
        }

        public final int n() {
            return this.f154096a;
        }
    }

    @m1
    public ProjectRevision() {
    }

    public final void A(int i10) {
        this.source = i10;
    }

    public final void B(int i10) {
        this.type = i10;
    }

    public final int c() {
        return this.type;
    }

    @Nullable
    public final Date p() {
        return this.dateCreated;
    }

    @Nullable
    public final byte[] s() {
        return this.data;
    }

    @Nullable
    public final Integer u() {
        byte[] bArr;
        if (this.f154085a == null && (bArr = this.data) != null) {
            try {
                Intrinsics.checkNotNull(bArr);
                this.f154085a = Integer.valueOf(Integer.parseInt(new String(bArr, Charsets.UTF_8)));
            } catch (NumberFormatException unused) {
            }
        }
        return this.f154085a;
    }

    public final long v() {
        return this.projectId;
    }

    public final int w() {
        return this.source;
    }

    public final void x(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public final void y(@Nullable Date date) {
        this.dateCreated = date;
    }

    public final void z(long j10) {
        this.projectId = j10;
    }
}
