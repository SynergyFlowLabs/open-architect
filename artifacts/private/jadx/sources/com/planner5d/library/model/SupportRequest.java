package com.planner5d.library.model;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

/* JADX INFO: loaded from: classes7.dex */
public class SupportRequest extends Model {

    @Column(name = "attachment")
    public boolean attachment;

    @Column(name = "description")
    public String description;

    @Column(name = "email")
    public String email;

    @Column(name = "notes")
    public String notes;

    @Column(name = "type")
    public int type;

    @m1
    public SupportRequest() {
    }
}
