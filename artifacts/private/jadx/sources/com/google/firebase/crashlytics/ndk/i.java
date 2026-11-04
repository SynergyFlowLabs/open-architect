package com.google.firebase.crashlytics.ndk;

import androidx.annotation.p0;
import com.google.firebase.crashlytics.internal.model.f0;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f121955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f121956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f121957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f121958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f121959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f121960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f121961g;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f121962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f121963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f121964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private File f121965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private File f121966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private File f121967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private File f121968g;

        b() {
        }

        b h(File file) {
            this.f121966e = file;
            return this;
        }

        b i(File file) {
            this.f121963b = file;
            return this;
        }

        i j() {
            return new i(this);
        }

        b k(File file) {
            this.f121967f = file;
            return this;
        }

        b l(File file) {
            this.f121964c = file;
            return this;
        }

        b m(c cVar) {
            this.f121962a = cVar;
            return this;
        }

        b n(File file) {
            this.f121968g = file;
            return this;
        }

        b o(File file) {
            this.f121965d = file;
            return this;
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public final File f121969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final f0.a f121970b;

        c(@p0 File file, @p0 f0.a aVar) {
            this.f121969a = file;
            this.f121970b = aVar;
        }

        boolean a() {
            File file = this.f121969a;
            return (file != null && file.exists()) || this.f121970b != null;
        }
    }

    private i(b bVar) {
        this.f121955a = bVar.f121962a;
        this.f121956b = bVar.f121963b;
        this.f121957c = bVar.f121964c;
        this.f121958d = bVar.f121965d;
        this.f121959e = bVar.f121966e;
        this.f121960f = bVar.f121967f;
        this.f121961g = bVar.f121968g;
    }
}
