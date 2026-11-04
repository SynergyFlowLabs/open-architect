package com.planner5d.library.model;

import androidx.annotation.m1;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.facebook.internal.w0;
import com.planner5d.library.services.utility.c3;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class LogRecord extends Model {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f180537a;

    @Column(name = w0.f100156c1)
    public String action;

    @Column(name = "data")
    public String data;

    @Column(name = "date_of_occurrence")
    public Date dateOfOccurrence;

    @Column(name = "date_until_next_record")
    public Date dateUntilNextRecord;

    @Column(name = com.planner5d.library.model.manager.crashreporting.n.a.f191217d)
    public String installationHash;

    @Column(name = "posted")
    public boolean posted;

    @Column(name = "stack_trace")
    public String stackTrace;

    @Column(name = "system_information")
    public String systemInformation;

    @m1
    public LogRecord() {
        this.posted = false;
    }

    @m1
    public LogRecord(String str, String str2) {
        this(str, str2, null, null);
    }

    @m1
    public LogRecord(String str, String str2, Throwable th2) {
        this(str, str2, th2, null);
    }

    @m1
    public LogRecord(String str, String str2, Throwable th2, Date date) {
        this.posted = false;
        boolean z10 = th2 != null;
        this.action = str;
        this.data = str2;
        this.stackTrace = z10 ? c3.g(th2) : null;
        this.dateOfOccurrence = new Date();
        this.dateUntilNextRecord = date;
        this.f180537a = th2;
    }
}
