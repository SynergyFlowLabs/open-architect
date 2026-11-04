package com.planner5d.library.model;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/* JADX INFO: loaded from: classes7.dex */
@Table(name = "projects_to_demo_projects")
public class ProjectToDemoProject extends Model {

    @Column(name = "demo_project_id")
    public long demoProjectId;

    @Column(name = "project_id")
    public long projectId;

    @m1
    public ProjectToDemoProject() {
    }
}
