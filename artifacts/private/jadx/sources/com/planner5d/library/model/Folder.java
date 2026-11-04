package com.planner5d.library.model;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.planner5d.library.database.model.SynchronizedModel;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
@Table(name = "folders")
public class Folder extends SynchronizedModel implements com.planner5d.library.database.model.i, com.planner5d.library.database.model.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f180528a = com.planner5d.library.database.model.g.TYPE_UNKNOWN.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f180529b = com.planner5d.library.database.model.g.TYPE_PROJECTS.n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f180530c = com.planner5d.library.database.model.g.TYPE_SNAPSHOTS.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f180531d = com.planner5d.library.database.model.g.TYPE_DOCUMENTS.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180532e = com.planner5d.library.database.model.g.TYPE_DYNAMIC_FOLDERS_ALL.n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f180533f = com.planner5d.library.database.model.g.TYPE_DYNAMIC_PROJECTS_ALL.n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f180534g = com.planner5d.library.database.model.g.TYPE_DYNAMIC_PROJECTS_TODAY.n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f180535h = com.planner5d.library.database.model.g.TYPE_DYNAMIC_SNAPSHOTS_ALL.n();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f180536i = com.planner5d.library.database.model.g.TYPE_DYNAMIC_SNAPSHOTS_TODAY.n();

    @Column(name = io.sentry.protocol.j.b.f306359i)
    public long parentId;

    @Column(name = "type")
    public int type;

    @Column(name = "title")
    public String title = null;

    @Column(name = "date_updated")
    public Date dateUpdated = null;

    @Column(name = "date_updated_locally")
    public Date dateUpdatedLocally = null;

    @m1
    public Folder() {
    }

    public static boolean A(int i10) {
        if (i10 != f180536i && i10 != f180534g) {
            return false;
        }
        return true;
    }

    public static int x(int i10) {
        if (y(i10)) {
            return (i10 == f180535h || i10 == f180536i) ? f180530c : f180529b;
        }
        return i10;
    }

    public static boolean y(int i10) {
        return i10 < 0;
    }

    public static boolean z(int i10) {
        return i10 == f180535h || i10 == f180533f || i10 == f180532e;
    }

    @Override // com.planner5d.library.database.model.j
    @NonNull
    public Bundle b() {
        com.planner5d.library.services.utility.i iVarF = new com.planner5d.library.services.utility.i().f(com.planner5d.library.services.r.type, this.type);
        Long id2 = getId();
        if (id2 != null) {
            iVarF.g(com.planner5d.library.services.r.id, id2.longValue());
        }
        return iVarF.a();
    }

    @Override // com.planner5d.library.database.model.j
    public int c() {
        return this.type;
    }

    @Override // com.planner5d.library.database.model.j
    @p0
    public String getTitle() {
        return this.title;
    }

    @Override // com.planner5d.library.database.model.i
    public Date k() {
        return this.dateUpdated;
    }

    @Override // com.planner5d.library.database.model.j
    public Date m() {
        Date date = this.dateUpdatedLocally;
        return date == null ? this.dateUpdated : date;
    }

    @Override // com.planner5d.library.database.model.i
    public void q(Date date) {
        this.dateUpdated = date;
    }
}
