package com.planner5d.library.model.snapshot;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.activeandroid.annotation.Column;
import com.planner5d.library.database.model.SynchronizedModel;
import gd.b;
import gd.c;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class SnapshotLocal extends SynchronizedModel implements b {

    @Column(name = "folder")
    public long folderId = 0;

    @Column(name = "render_variant")
    public int renderVariant = vd.b.DRAFT.f385730a;

    @Column(name = "date_created")
    public Date dateCreated = null;

    @Column(name = "filename")
    public String filename = null;

    @Column(name = "project_id")
    public Long projectId = null;

    @m1
    public SnapshotLocal() {
    }

    @Override // gd.b
    public String a() {
        return this.uid;
    }

    @Override // gd.b
    @NonNull
    public c c() {
        return c.REGULAR;
    }

    @Override // gd.b
    public Long d() {
        return this.projectId;
    }

    @Override // gd.b
    public boolean e() {
        vd.b bVarJ = j();
        if (bVarJ == null) {
            return false;
        }
        return bVarJ.q();
    }

    @Override // gd.b
    public void f(long j10) {
        this.folderId = j10;
    }

    @Override // gd.b
    public boolean g() {
        return true;
    }

    @Override // gd.b
    public int getProgress() {
        return 0;
    }

    @Override // gd.b
    public String getTitle() {
        return null;
    }

    @Override // gd.b
    public boolean h() {
        return true;
    }

    @Override // gd.b
    public void i(Boolean bool) {
    }

    @Override // gd.b
    public vd.b j() {
        return vd.b.l(this.renderVariant);
    }

    @Override // gd.b
    public boolean l() {
        return true;
    }

    @Override // gd.b
    public boolean o() {
        return true;
    }

    @Override // gd.b
    public Date p() {
        return this.dateCreated;
    }

    @Override // gd.b
    public boolean r() {
        return false;
    }

    @Override // gd.b
    public int t() {
        return 4;
    }
}
