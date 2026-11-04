package com.google.gson.internal.sql;

import com.google.gson.c0;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f125517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.internal.bind.c.b<? extends Date> f125518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.gson.internal.bind.c.b<? extends Date> f125519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f125520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f125521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f125522f;

    class a extends com.google.gson.internal.bind.c.b<java.sql.Date> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    class b extends com.google.gson.internal.bind.c.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f125517a = z10;
        if (z10) {
            f125518b = new a(java.sql.Date.class);
            f125519c = new b(Timestamp.class);
            f125520d = com.google.gson.internal.sql.a.f125511b;
            f125521e = com.google.gson.internal.sql.b.f125513b;
            f125522f = c.f125515b;
            return;
        }
        f125518b = null;
        f125519c = null;
        f125520d = null;
        f125521e = null;
        f125522f = null;
    }

    private d() {
    }
}
