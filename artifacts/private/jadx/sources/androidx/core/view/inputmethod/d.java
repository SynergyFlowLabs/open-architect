package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f48839a;

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final Uri f48841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final ClipDescription f48842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final Uri f48843c;

        b(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @p0 Uri uri2) {
            this.f48841a = uri;
            this.f48842b = clipDescription;
            this.f48843c = uri2;
        }

        @Override // androidx.core.view.inputmethod.d.c
        @p0
        public Uri a() {
            return this.f48843c;
        }

        @Override // androidx.core.view.inputmethod.d.c
        @p0
        public Object b() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.d.c
        @NonNull
        public Uri c() {
            return this.f48841a;
        }

        @Override // androidx.core.view.inputmethod.d.c
        public void d() {
        }

        @Override // androidx.core.view.inputmethod.d.c
        public void e() {
        }

        @Override // androidx.core.view.inputmethod.d.c
        @NonNull
        public ClipDescription getDescription() {
            return this.f48842b;
        }
    }

    private interface c {
        @p0
        Uri a();

        @p0
        Object b();

        @NonNull
        Uri c();

        void d();

        void e();

        @NonNull
        ClipDescription getDescription();
    }

    public d(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @p0 Uri uri2) {
        this.f48839a = new a(uri, clipDescription, uri2);
    }

    @p0
    public static d g(@p0 Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    @NonNull
    public Uri a() {
        return this.f48839a.c();
    }

    @NonNull
    public ClipDescription b() {
        return this.f48839a.getDescription();
    }

    @p0
    public Uri c() {
        return this.f48839a.a();
    }

    public void d() {
        this.f48839a.e();
    }

    public void e() {
        this.f48839a.d();
    }

    @p0
    public Object f() {
        return this.f48839a.b();
    }

    @w0(25)
    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final InputContentInfo f48840a;

        a(@NonNull Object obj) {
            this.f48840a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.d.c
        @p0
        public Uri a() {
            return this.f48840a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.d.c
        @NonNull
        public Object b() {
            return this.f48840a;
        }

        @Override // androidx.core.view.inputmethod.d.c
        @NonNull
        public Uri c() {
            return this.f48840a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.d.c
        public void d() {
            this.f48840a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.d.c
        public void e() {
            this.f48840a.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.d.c
        @NonNull
        public ClipDescription getDescription() {
            return this.f48840a.getDescription();
        }

        a(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @p0 Uri uri2) {
            this.f48840a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private d(@NonNull c cVar) {
        this.f48839a = cVar;
    }
}
