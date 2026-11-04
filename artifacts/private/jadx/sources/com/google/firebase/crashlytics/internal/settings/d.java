package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f121860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f121861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f121862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f121863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f121864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f121865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f121866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f121867h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f121868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f121869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f121870c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f121868a = z10;
            this.f121869b = z11;
            this.f121870c = z12;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f121871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121872b;

        public b(int i10, int i11) {
            this.f121871a = i10;
            this.f121872b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f121862c = j10;
        this.f121860a = bVar;
        this.f121861b = aVar;
        this.f121863d = i10;
        this.f121864e = i11;
        this.f121865f = d10;
        this.f121866g = d11;
        this.f121867h = i12;
    }

    public boolean a(long j10) {
        return this.f121862c < j10;
    }
}
