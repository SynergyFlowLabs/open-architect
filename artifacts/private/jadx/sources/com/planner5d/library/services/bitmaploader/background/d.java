package com.planner5d.library.services.bitmaploader.background;

import android.os.Bundle;
import android.os.Parcel;
import com.planner5d.library.services.r;

/* JADX INFO: loaded from: classes10.dex */
public class d extends com.planner5d.library.services.backgroundexecutor.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f224053j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f224054k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f224055l = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f224056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f224057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f224058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f224059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f224060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f224061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f224062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f224063i;

    public d(long id2, String error) {
        this(id2, 0, null, 0, 0, 1L, error, 0, null);
    }

    private static Bundle b(com.planner5d.library.services.bitmaploader.background.postprocess.a postProcess) {
        if (postProcess == null) {
            return null;
        }
        return new com.planner5d.library.services.utility.i().j(r.className, postProcess.getClass().getName()).h(r.data, postProcess.a()).a();
    }

    @Override // com.planner5d.library.services.backgroundexecutor.e
    public void a(Parcel parcel) {
        super.a(parcel);
        parcel.writeInt(this.f224056b);
        parcel.writeString(this.f224057c);
        parcel.writeInt(this.f224058d);
        parcel.writeInt(this.f224059e);
        parcel.writeLong(this.f224060f);
        parcel.writeString(this.f224061g);
        parcel.writeInt(this.f224062h);
        parcel.writeBundle(this.f224063i);
    }

    public d(long id2, int width, int height, int size) {
        this(id2, 0, null, width, height, 1L, null, size, null);
    }

    public d(long id2, int source, String uri, int width, int height, long cacheExpire, com.planner5d.library.services.bitmaploader.background.postprocess.a postProcess) {
        this(id2, source, uri, width, height, cacheExpire, null, 0, b(postProcess));
    }

    private d(long id2, int source, String uri, int width, int height, long cacheExpire, String error, int size, Bundle postProcessData) {
        super(id2);
        this.f224056b = source;
        this.f224057c = uri;
        this.f224058d = width;
        this.f224059e = height;
        this.f224060f = cacheExpire;
        this.f224061g = error;
        this.f224062h = size;
        this.f224063i = postProcessData;
    }

    public d(Parcel parcel) {
        super(parcel);
        this.f224056b = parcel.readInt();
        this.f224057c = parcel.readString();
        this.f224058d = parcel.readInt();
        this.f224059e = parcel.readInt();
        this.f224060f = parcel.readLong();
        this.f224061g = parcel.readString();
        this.f224062h = parcel.readInt();
        this.f224063i = parcel.readBundle();
    }
}
