package com.planner5d.library.services.filedownloader;

import android.os.Parcel;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class e extends com.planner5d.library.services.backgroundexecutor.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f224330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f224331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f224332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f224333f;

    public e(Parcel parcel) {
        super(parcel);
        this.f224329b = parcel.readString();
        this.f224330c = new File(parcel.readString());
        this.f224331d = parcel.readString();
        this.f224332e = parcel.readInt();
        this.f224333f = parcel.readString();
    }

    @Override // com.planner5d.library.services.backgroundexecutor.e
    public void a(Parcel parcel) {
        super.a(parcel);
        parcel.writeString(this.f224329b);
        parcel.writeString(this.f224330c.getAbsolutePath());
        parcel.writeString(this.f224331d);
        parcel.writeInt(this.f224332e);
        parcel.writeString(this.f224333f);
    }

    public e(e message, int error, String errorMessage) {
        super(message.f224017a);
        this.f224329b = message.f224329b;
        this.f224330c = message.f224330c;
        this.f224331d = message.f224331d;
        this.f224332e = error;
        this.f224333f = errorMessage;
    }

    public e(long id2, String uri, File file, String fileHash) {
        super(id2);
        this.f224329b = uri;
        this.f224330c = file;
        this.f224331d = fileHash;
        this.f224332e = 0;
        this.f224333f = null;
    }
}
