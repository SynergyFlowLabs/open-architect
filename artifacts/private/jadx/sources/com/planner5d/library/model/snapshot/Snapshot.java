package com.planner5d.library.model.snapshot;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.activeandroid.annotation.Column;
import com.planner5d.library.api.f;
import com.planner5d.library.database.model.SynchronizedModel;
import com.planner5d.library.database.model.project.Project;
import gd.b;
import gd.c;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class Snapshot extends SynchronizedModel implements b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f222804g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f222805h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f222806i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f222807j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f222808k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f222809l = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Project f222810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f222811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f222812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f222813d;

    @Column(name = "date_created")
    public Date dateCreated;

    @Column(name = "date_updated")
    public Date dateUpdated;

    @Column(name = "draft")
    public boolean draft;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f222814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f222815f;

    @Column(name = "folder_changed")
    public boolean folderChanged;

    @Column(name = "folder")
    public long folderId;

    @Column(name = "new")
    public boolean isNew;

    @Column(name = AttributeType.NUMBER)
    public long number;

    @Column(name = "project_id")
    public Long projectId;

    @Column(name = "project_uid")
    public String projectUid;

    @Column(name = "status")
    public int status;

    @Column(name = "task")
    public long taskId;

    @Column(name = "type")
    public int type;

    @Column(name = "uri_image")
    public String uriImage;

    @Column(name = "width")
    public int width;

    @m1
    public Snapshot() {
        this.folderId = 0L;
        this.folderChanged = false;
        this.taskId = 0L;
        this.number = 0L;
        this.width = 0;
        this.draft = false;
        this.status = 0;
        this.type = c.UNKNOWN.o();
        this.projectUid = null;
        this.projectId = null;
        this.dateCreated = null;
        this.dateUpdated = null;
        this.uriImage = null;
        this.isNew = false;
        this.f222810a = null;
        this.f222811b = 0;
        this.f222812c = null;
        this.f222813d = 0;
        this.f222814e = false;
        this.f222815f = 0L;
    }

    @Override // gd.b
    public String a() {
        return this.uid;
    }

    @Override // gd.b
    @NonNull
    public c c() {
        return c.l(this.type);
    }

    @Override // gd.b
    public Long d() {
        Long l10 = this.projectId;
        if (l10 != null) {
            return l10;
        }
        Project project = this.f222810a;
        if (project != null) {
            return project.projectId;
        }
        return null;
    }

    @Override // gd.b
    public boolean e() {
        vd.b bVarJ = j();
        return bVarJ != null && this.status == 4 && bVarJ.q();
    }

    @Override // gd.b
    public void f(long j10) {
        this.folderId = j10;
        this.folderChanged = true;
    }

    @Override // gd.b
    public boolean g() {
        int i10 = this.status;
        return (i10 == 3 || i10 == 5) ? false : true;
    }

    @Override // gd.b
    public int getProgress() {
        return this.f222811b;
    }

    @Override // gd.b
    public String getTitle() {
        Project project = this.f222810a;
        if (project != null) {
            return project.title;
        }
        return null;
    }

    @Override // gd.b
    public boolean h() {
        return this.status == 4;
    }

    @Override // gd.b
    public void i(Boolean bool) {
        this.isNew = bool.booleanValue();
    }

    @Override // gd.b
    public vd.b j() {
        if (this.draft) {
            return vd.b.DRAFT;
        }
        int i10 = this.width;
        vd.b bVar = vd.b.HD;
        if (i10 == bVar.f385731b) {
            return bVar;
        }
        vd.b bVar2 = vd.b.PRO4K;
        if (i10 == bVar2.f385731b) {
            return bVar2;
        }
        return null;
    }

    @Override // gd.b
    public boolean l() {
        return this.status == 4 && this.type == c.REGULAR.o();
    }

    @Override // gd.b
    public boolean o() {
        int i10 = this.status;
        return (i10 == 3 || i10 == 5) ? false : true;
    }

    @Override // gd.b
    public Date p() {
        return this.dateCreated;
    }

    @Override // gd.b
    public boolean r() {
        return this.isNew;
    }

    @Override // gd.b
    public int t() {
        return this.status;
    }

    public String x() {
        String string;
        String str = this.uriImage;
        if (str != null) {
            return str;
        }
        Date date = this.dateUpdated;
        long time = date == null ? 0L : date.getTime();
        if (this.f222812c == null || this.f222813d != this.status || this.f222814e != this.draft || time != this.f222815f) {
            if (time == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("draft=");
                sb2.append(this.draft ? 1 : 0);
                sb2.append("&finished=");
                sb2.append(this.status == 4 ? 1 : 0);
                sb2.append("&cdate=");
                Date date2 = this.dateCreated;
                sb2.append(date2 == null ? 0L : date2.getTime());
                string = sb2.toString();
                this.f222815f = 0L;
            } else {
                string = "v=" + time;
            }
            this.f222812c = f.a().f142272j + "/files/s/" + this.projectUid.substring(0, 5) + "/" + this.projectUid.substring(5, 10) + "/" + this.projectUid + "_" + this.number + ".jpg?" + string;
            this.f222813d = this.status;
            this.f222814e = this.draft;
        }
        return this.f222812c;
    }

    @m1
    public Snapshot(Snapshot snapshot) {
        super(snapshot);
        this.folderId = 0L;
        this.folderChanged = false;
        this.taskId = 0L;
        this.number = 0L;
        this.width = 0;
        this.draft = false;
        this.status = 0;
        this.type = c.UNKNOWN.o();
        this.projectUid = null;
        this.projectId = null;
        this.dateCreated = null;
        this.dateUpdated = null;
        this.uriImage = null;
        this.isNew = false;
        this.f222810a = null;
        this.f222811b = 0;
        this.f222812c = null;
        this.f222813d = 0;
        this.f222814e = false;
        this.f222815f = 0L;
        this.taskId = snapshot.taskId;
        this.folderId = snapshot.folderId;
        this.number = snapshot.number;
        this.width = snapshot.width;
        this.draft = snapshot.draft;
        this.status = snapshot.status;
        this.type = snapshot.type;
        this.projectUid = snapshot.projectUid;
        this.projectId = snapshot.projectId;
        this.dateCreated = snapshot.dateCreated;
        this.dateUpdated = snapshot.dateUpdated;
        this.uriImage = snapshot.uriImage;
        this.f222811b = snapshot.f222811b;
    }
}
